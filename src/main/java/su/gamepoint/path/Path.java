package su.gamepoint.path;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Path.MODID)
public class Path {
    public static final String MODID = "path";

    public Path() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registerCommonEvents(modEventBus);
    }

    public void registerCommonEvents(IEventBus eventBus) {
        eventBus.register(StartupCommon.class);
    }
}
