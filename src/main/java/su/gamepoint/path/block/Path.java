package su.gamepoint.path.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Path extends CarpetBlock {
    public Path(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public VoxelShape getVisualShape(BlockState p_48735_, BlockGetter p_48736_, BlockPos p_48737_, CollisionContext p_48738_) {
        return Shapes.empty();
    }

    @Override
    public float getShadeBrightness(BlockState p_48731_, BlockGetter p_48732_, BlockPos p_48733_) {
        return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState p_48740_, BlockGetter p_48741_, BlockPos p_48742_) {
        return true;
    }

    @Override
    public VoxelShape getShape(BlockState p_51309_, BlockGetter p_51310_, BlockPos p_51311_, CollisionContext p_51312_) {
        return Block.box(0.0D, 0.1D, 0.0D, 16.0D, 1.0D, 16.0D);
    }
}
