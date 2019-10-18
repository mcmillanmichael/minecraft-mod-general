package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.item.Item;

public class MikeiumIngot extends Item {
    public static final String itemName = "mikeium_ingot";

    public MikeiumIngot() {
        super(new Item.Properties());
        setRegistryName(MikesMod.ModId, itemName);
    }
}