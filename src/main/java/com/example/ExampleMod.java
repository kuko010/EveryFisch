package com.example;


//region Loader-specific, just ignore this area!
/*? if fabric {*/
/*import net.fabricmc.api.ModInitializer;
*//*?}*/

/*? if forgeLike { */
import static com.example.ExampleMod.MOD_ID;
    /*? if forge {*/
    
    import net.minecraftforge.eventbus.api.IEventBus;
    import net.minecraftforge.fml.common.Mod;
    import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
    /*?}*/

    /*? if neoforge {*/
    /*
    import net.neoforged.fml.ModContainer;
    import net.neoforged.bus.api.IEventBus;
    import net.neoforged.fml.common.Mod;
    */
    /*?}*/
/*?}*/


//endregion

/*? if forgeLike {*/  @Mod(MOD_ID)  /*?}*/
public class ExampleMod  /*? if fabric {*/  /*implements ModInitializer  *//*?}*/ {
    public static final String MOD_ID = "yourmodid";

    public ExampleMod(/*? if neoforge {*/ /* IEventBus modEventBus, ModContainer modContainer */  /*?}*/) {
        /*? if forge {*/ IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(); /*?}*/

    }


    /*? if fabric {*/
    /*@Override
    public void onInitialize() {

    }*//*?}*/
}
