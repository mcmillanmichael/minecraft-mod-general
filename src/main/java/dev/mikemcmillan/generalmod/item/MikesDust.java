package dev.mikemcmillan.generalmod.item;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MikesMod.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MikesDust extends Item
{
    public static final String itemName = "mikes_dust";
    
    public MikesDust() {
        super(createProperties());
    }

    public static Item create() {
        return new MikesDust()
            .setRegistryName(MikesMod.ModId, itemName);
    }
    public static Properties createProperties() {
        return new Item.Properties();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        event.getRegistry()
            .registerAll(MikesDust.create());
    }
}