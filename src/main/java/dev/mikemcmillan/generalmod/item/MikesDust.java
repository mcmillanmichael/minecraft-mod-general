package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MikesMod.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
//@ObjectHolder(MikesMod.ModId)
public class MikesDust extends Item {

    public MikesDust() {
        super(new Item.Properties());
    }

    public static Item create() {
        return new MikesDust()
            .setRegistryName(MikesMod.ModId, itemName);
    }

    public static final String itemName = "mikes_dust";
    public static final Item mikes_dust = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        event.getRegistry()
            .registerAll(MikesDust.create());
    }
}