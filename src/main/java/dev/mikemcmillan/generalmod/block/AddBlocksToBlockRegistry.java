package dev.mikemcmillan.generalmod.block;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MikesMod.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class AddBlocksToBlockRegistry
{
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry()
            .registerAll(
                new MikeiumBlock(),
                new MikeiumOre()
            );
    }
}