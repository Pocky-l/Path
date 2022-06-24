package su.gamepoint.path.block;


import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class AmethystPath extends Path {

    //CarpetBlock

    public AmethystPath() {
        super(Properties.of(Material.AMETHYST)
                .strength(0.5f)
                .sound(SoundType.AMETHYST)
                .speedFactor(1.5f)
                .requiresCorrectToolForDrops()
        );
    }
}
