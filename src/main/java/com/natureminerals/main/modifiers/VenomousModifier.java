package com.natureminerals.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class VenomousModifier extends Modifier {

	public VenomousModifier() {
		super(0x30D513);

	}
	
	@Override
	public int afterLivingHit(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float damageDealt, boolean isCritical, float cooldown) {
		if(cooldown > 0.9 && damageDealt > 0) {
			target.addEffect(new EffectInstance(Effects.POISON, level * 50, 0));
		}
		return 0;
	}

}
