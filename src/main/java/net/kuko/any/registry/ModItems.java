package net.kuko.any.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import net.kuko.any.AnyMod;

/*? if forge {*/
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
/*?}*/

/*? if neoforge {*/
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
*//*?}*/


public class ModItems {

    /*? if forgeLike {*/
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnyMod.MOD_ID);
    /*?}*/

    /*? if fabric {*/
    /*public static final Item EXAMPLE_ITEM = item("example_item", new Item(new Item.Properties())); 
    *//*?} else if forgeLike {*/
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties()));
    /*?}*/




    // Always included for Fabric/vanilla; no DeferredRegister needed
    // BuiltInRegistries.ITEM is deprecated in newer versions but required for <=1.20.1 on Fabric
    @SuppressWarnings("deprecation")
    private static Item item(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM,
                /*? if >1.20.1 {*/ /*ResourceLocation.fromNamespaceAndPath(AnyMod.MOD_ID, name), item); *//*?}*/
                // Use version-specific ResourceLocation constructor due to API change in 1.20.2+
                /*? if <=1.20.1 {*/  new ResourceLocation(AnyMod.MOD_ID, name), item);  /*?}*/
    }
    // Required for Fabric: ensures class loads and items are registered
    public static void register(/*? if forgeLike {*/ IEventBus bus /*?}*/) {
        /*? if forgeLike {*/ ITEMS.register(bus); /*?}*/
    }

}
