package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class MikeiumChestplate extends ArmorItem {
    public static final String itemName = "mikeium_chestplate";

    public MikeiumChestplate() {
        super(new MikeiumMaterial(), EquipmentSlotType.CHEST, new Item.Properties());
        setRegistryName(MikesMod.ModId, itemName);
    }
}