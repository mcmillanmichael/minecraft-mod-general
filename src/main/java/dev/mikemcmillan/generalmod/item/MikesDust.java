package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.item.Item;

public class MikesDust extends Item
{
    public static final String itemName = "mikes_dust";
    
    public MikesDust() {
        super(new Item.Properties());
        setRegistryName(MikesMod.ModId, itemName);
    }
}