package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.AllObjects;
import dev.mikemcmillan.generalmod.MikesMod;
import dev.mikemcmillan.generalmod.block.MikeiumOre;
import dev.mikemcmillan.generalmod.block.MikeiumBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MikesMod.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class AddItemsToItemRegistry
{
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry()
            .registerAll(
                new MikeiumDust()
            );
        registerBlockItems(event);
    }

    private static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry()
            .registerAll(
                getBlockItem(MikeiumBlock.itemName, AllObjects.mikeium_block),
                getBlockItem(MikeiumOre.itemName, AllObjects.mikeium_ore)
            );
    }

    private static BlockItem getBlockItem(String itemName, Block objectHolderReference) {
        BlockItem blockItem = new BlockItem(
            objectHolderReference, 
            new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
        blockItem.setRegistryName(itemName);
        return blockItem;
    }
}