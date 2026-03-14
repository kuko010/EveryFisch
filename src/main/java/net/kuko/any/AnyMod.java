package net.kuko.any;

import static net.kuko.any.AnyMod.MOD_ID;
import net.kuko.any.registry.ModItems;


//region Loader-specific, just ignore this area!
/*? if fabric {*/
/*import net.fabricmc.api.ModInitializer;
*//*?}*/

/*? if forge {*/

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*?}*/

/*? if neoforge {*/
/*import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
*//*?}*/
//endregion

/*? if forgeLike {*/  @Mod(MOD_ID)  /*?}*/
public class AnyMod  /*? if fabric {*/  /*implements ModInitializer  *//*?}*/ {
    public static final String MOD_ID = "any";


    /*? if forgeLike {*/
    public AnyMod(/*? if neoforge {*/
             /*IEventBus modEventBus, ModContainer modContainer
                  *//*?}*/) {
        /*? if forge {*/
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModContainer modContainer = ModLoadingContext.get().getActiveContainer();
        /*?}*/
        ModItems.register(modEventBus);

    }/*?}*/


    /*? if fabric {*/
    /*@Override
    public void onInitialize() {
        /^ ModItems.register(); ^/
    }*//*?}*/
}
