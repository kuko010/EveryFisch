package net.kuko.any;

import static net.kuko.any.AnyMod.MOD_ID;
import net.minecraft.resources.ResourceLocation;
import net.kuko.any.registry.ModItems;


//region Loader-specific, just ignore this area!
/*? if fabric {*/
import net.fabricmc.api.ModInitializer;
/*?}*/

/*? if forge {*/
/*import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
*//*?}*/

/*? if neoforge {*/

/*import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
*//*?}*/
//endregion


/**
 * This project heavily uses <a href="https://codeberg.org/stonecutter/">Stonecutter</a> for preprocessing.
 * <p>
 * In short: the syntax <code>/^? neoforge { ... /^?}^/</code> controls code inclusion:
 * <ul>
 *   <li>If the <b>neoforge</b> constant is <b>true</b>, the code inside the block is uncommented.</li>
 *   <li>If <b>false</b>, the code inside the block is commented out.</li>
 * </ul>
 */
/*? if forgeLike {*/  /*@Mod(MOD_ID)  *//*?}*/
public class AnyMod  /*? if fabric {*/  implements ModInitializer  /*?}*/ {
    public static final String MOD_ID = "any";

    public static ResourceLocation id(String path) {
        /*? if >=1.21 {*/
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
        /*?} else {*/
        /*return new ResourceLocation(MOD_ID, path);
        *//*?}*/
    }


    /*? if forgeLike {*/
    /*public AnyMod(/^? if neoforge {^/
             /^IEventBus modEventBus, ModContainer modContainer
                  ^//^?}^/) {
        /^? if forge {^/
        /^IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModContainer modContainer = ModLoadingContext.get().getActiveContainer();
        ^//^?}^/
        ModItems.register(modEventBus);

    }*//*?}*/


    /*? if fabric {*/
    @Override
    public void onInitialize() {
         ModItems.register();
    }/*?}*/
}
