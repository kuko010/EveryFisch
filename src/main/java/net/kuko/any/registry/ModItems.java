package net.kuko.any.registry;

import java.util.function.Supplier;

import net.minecraft.world.item.Item;

import net.kuko.any.AnyMod;

/*? if forge {*/
/*import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

*//*?}*/

/*? if neoforge {*/
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
/*?}*/


@SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
public interface ModItems {
    /*? if neoforge*/
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnyMod.MOD_ID);
    /*? if forge*/
    //DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnyMod.MOD_ID);

    /*? if forge {*//*RegistryObject<Item>*//*?} elif neoforge {*/DeferredItem<Item>/*?} else {*//*Item*//*?}*/
            ITEM = item("item", () -> new Item(new Item.Properties()));







    // Always included for Fabric/vanilla; no DeferredRegister needed
    // BuiltInRegistries.ITEM is deprecated in newer versions but required for <=1.20.1 on Fabric
    private static /*? if forge {*//*RegistryObject<Item>*//*?} elif neoforge {*/DeferredItem<Item>/*?} else {*//*Item*//*?}*/
    item(String name, Supplier itemSupplier) {
        /*? if fabric {*/
        /*// Register directly in Fabric / vanilla
        return Registry.register(
                BuiltInRegistries.ITEM,
                /^? if >1.20.1 {^/  /^ResourceLocation.fromNamespaceAndPath(AnyMod.MOD_ID, name)  ^//^?}^/
                /^? if <=1.20.1 {^/ new ResourceLocation(AnyMod.MOD_ID, name) /^?}^/,
                itemSupplier.get());

        *//*?} else if forgeLike {*/
        // Register in Forge / NeoForge using DeferredRegister
        return ITEMS.register(name, itemSupplier);
        /*?}*/
    }



    // Required for Fabric: ensures class loads and items are registered
    static void register(/*? if forgeLike {*/ IEventBus bus /*?}*/) {
        /*? if forgeLike {*/ ITEMS.register(bus); /*?}*/
    }
}
