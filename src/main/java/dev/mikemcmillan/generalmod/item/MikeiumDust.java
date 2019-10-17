package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.item.Item;

public class MikeiumDust extends Item
{
    public static final String itemName = "mikeium_dust";

    public MikeiumDust() {
        super(new Item.Properties());
        setRegistryName(MikesMod.ModId, itemName);
    }
}