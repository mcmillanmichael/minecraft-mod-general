package dev.mikemcmillan.generalmod.block;

import dev.mikemcmillan.generalmod.AllObjects;
import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MikesMod.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MikesBlock extends Block
{
    public static final String itemName = "mikes_block";
    
    public MikesBlock() {
        super(createProperties());
    }

    public static Block create() {
        return new MikesBlock()
            .setRegistryName(MikesMod.ModId, itemName);
    }

    public static Properties createProperties() {
        return Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(5)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE);
    }
    
    public static Item createItem() {
        return new BlockItem(AllObjects.mikes_block, createItemProperties())
            .setRegistryName(MikesBlock.itemName);
    }

    public static Item.Properties createItemProperties() {
        return new Item.Properties()
            .group(ItemGroup.BUILDING_BLOCKS);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry()
            .registerAll(MikesBlock.create());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry()
            .registerAll(MikesBlock.createItem());
    }
}