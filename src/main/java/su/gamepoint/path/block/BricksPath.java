package su.gamepoint.path.block;


import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BricksPath extends Path {

    public BricksPath() {
        super(Properties.of(Material.STONE)
                .strength(0.5f)
                .sound(SoundType.NETHER_BRICKS)
                .speedFactor(1.15f)
                .requiresCorrectToolForDrops()
        );
    }
}
