package net.kuko.any.registry;

import java.util.function.Supplier;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.kuko.any.AnyMod;


/*? if forge {*/
/*import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
*//*?}*/

/*? if neoforge {*/
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
*//*?}*/

/**
 * <p>
 * The <code>/^? if CONSTANT {^/ ... /^?}^/</code> blocks are used by Stonecutter
 * to generate loader-specific code.
 * </p>
 * <p>
 * <b>Note:</b> <code>/^</code> and <code>^/</code> are identical to <code>/star</code> and <code>star/</code>,
 * but allow nesting of conditional blocks for Stonecutter.
 * </p>
 */
@SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
public class ModItems {
    /*? if neoforge*/
    //DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnyMod.MOD_ID);
    /*? if forge*/
    //DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnyMod.MOD_ID);

    /*? if forge {*//*RegistryObject<Item>*//*?} elif neoforge {*/ /*DeferredItem<Item>*//*?} else {*/ Item/*?}*/
        ITEM = item("item", () -> new Item(new Item.Properties()));





















    /**
     * Returns an item registration object depending on the mod loader used.
     * <p>
     * The return type depends on the project environment:
     * <ul>
     *   <li>Forge: {@link RegistryObject}&lt;{@link Item}&gt;</li>
     *   <li>NeoForge: {@link DeferredItem}&lt;{@link Item}&gt;</li>
     *   <li>Fabric: the regular {@link Item} class</li>
     * </ul>
     *
     * @param name the name of the item
     * @param itemSupplier the supplier that provides the item instance
     * @return the registered item object, type depends on the mod loader (see above)
     */
    private static /*? if forge {*//*RegistryObject<Item>*//*?} elif neoforge {*//*DeferredItem<Item>*//*?} else {*/Item/*?}*/
    item(String name, Supplier<Item> itemSupplier) {
        /*? if fabric {*/
        return Registry.register(
                BuiltInRegistries.ITEM,
                AnyMod.id(name),
                itemSupplier.get());
        /*?} else if forgeLike {*/
        /*return ITEMS.register(name, itemSupplier);
         *//*?}*/
    }

    static void register(/*? if forgeLike {*/ /*IEventBus bus *//*?}*/) {
        /*? if forgeLike {*/
        /*ITEMS.register(bus); *//*?}*/
    }
}
