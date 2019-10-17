package dev.mikemcmillan.generalmod.block;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MikeiumBlock extends Block
{
    public static final String itemName = "mikeium_block";

    public MikeiumBlock() {
        super(Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(5)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE));
        setRegistryName(MikesMod.ModId, itemName);
    }
}