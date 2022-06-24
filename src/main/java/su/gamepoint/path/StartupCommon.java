package su.gamepoint.path;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import su.gamepoint.path.block.AmethystPath;
import su.gamepoint.path.block.BricksPath;

public class StartupCommon {
    public static AmethystPath AmethystPath;
    public static BlockItem AmethystPathItem;

    public static BricksPath BricksPath;
    public static BlockItem BricksPathItem;

    @SubscribeEvent
    public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {

        AmethystPath = (AmethystPath) (new AmethystPath().setRegistryName(Path.MODID, "amethyst_path"));
        blockRegisterEvent.getRegistry().register(AmethystPath);

        BricksPath = (BricksPath) (new BricksPath().setRegistryName(Path.MODID, "bricks_path"));
        blockRegisterEvent.getRegistry().register(BricksPath);

    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {

        Item.Properties ItemProperties = new Item.Properties()
                .tab(CreativeModeTab.TAB_REDSTONE);

        AmethystPathItem = new BlockItem(AmethystPath, ItemProperties);
        AmethystPathItem.setRegistryName(AmethystPath.getRegistryName());
        itemRegisterEvent.getRegistry().register(AmethystPathItem);

        BricksPathItem = new BlockItem(BricksPath, ItemProperties);
        BricksPathItem.setRegistryName(BricksPath.getRegistryName());
        itemRegisterEvent.getRegistry().register(BricksPathItem);

    }
}