package com.natureminerals.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class LifeStealModifier extends Modifier {

	public LifeStealModifier() {
		super(0xCF6284);
	}
	
	@Override
	public float applyLivingDamage(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float baseDamage, float damage, boolean isCritical, boolean fullyCharged) {
		target.getLastDamageSource();
		DamageSource.indirectMagic(attacker, target);
		return damage;
	}
	
	@Override
	public int afterLivingHit(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float damageDealt, boolean isCritical, float cooldown) {
		if(attacker instanceof PlayerEntity && target instanceof MobEntity) {
			if(cooldown > 0.9 && damageDealt > 0) {
				attacker.addEffect(new EffectInstance(Effects.ABSORPTION, level * 50, (int) (damageDealt/4)));
			}
		}
		return 0;
		
	}
}
