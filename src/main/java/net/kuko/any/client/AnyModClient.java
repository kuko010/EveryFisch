package net.kuko.any.client;

import net.kuko.any.AnyMod;

/*? if neoforge {*/
/*import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
*//*?}*/

/*? if forge {*/
/*import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
*//*?}*/

/*? if fabric {*/
import net.fabricmc.api.ClientModInitializer;
/*?}*/

/*? if forge {*/
/*@Mod.EventBusSubscriber(modid = AnyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
*//*?} elif neoforge {*/
/*@EventBusSubscriber(modid = AnyMod.MOD_ID, value = Dist.CLIENT)
*//*?}*/
public class AnyModClient /*? if fabric {*/ implements ClientModInitializer /*?}*/ {
    /*? if fabric {*/
    @Override
    public void onInitializeClient() {

    }
    /*?}*/

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
