package net.kuko.any.item;


import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

public class PistolItem extends BowItem {
    public PistolItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public int getUseDuration(ItemStack itemStack, LivingEntity user) {
        return 72000;
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {


        return InteractionResultHolder.success(player.getMainHandItem());
    }
}

