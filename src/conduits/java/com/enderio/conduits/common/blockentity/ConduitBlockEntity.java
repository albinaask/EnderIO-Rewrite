package com.enderio.conduits.common.blockentity;

import com.enderio.core.common.blockentity.EnderBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ConduitBlockEntity extends EnderBlockEntity {

    ConduitCore core = new ConduitCore();

    public ConduitBlockEntity(BlockEntityType<?> type, BlockPos worldPosition, BlockState blockState) {
        super(type, worldPosition, blockState);
        core.gatherDataSlots().forEach(this::addDataSlot);
    }
}
