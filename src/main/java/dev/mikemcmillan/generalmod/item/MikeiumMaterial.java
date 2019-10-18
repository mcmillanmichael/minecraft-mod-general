package dev.mikemcmillan.generalmod.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public class MikeiumMaterial implements IArmorMaterial {

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return ArmorMaterial.DIAMOND.getDurability(slotIn) * 2;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return ArmorMaterial.DIAMOND.getDamageReductionAmount(slotIn) * 2;
    }

    @Override
    public int getEnchantability() {
        return ArmorMaterial.DIAMOND.getEnchantability();
    }

    @Override
    public SoundEvent getSoundEvent() {
        return ArmorMaterial.DIAMOND.getSoundEvent();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return ArmorMaterial.DIAMOND.getRepairMaterial();
    }

    @Override
    public String getName() {
        return "Mikeium";
    }

    @Override
    public float getToughness() {
        return ArmorMaterial.DIAMOND.getToughness() * 2;
    }
}