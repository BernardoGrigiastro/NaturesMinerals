package com.natureminerals.main.modifiers;

import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class NetherEfficiencyModifier extends Modifier {
	
	public NetherEfficiencyModifier() {
		super(0xB7C3DE);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(World.NETHER != null && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 1.25f));	
		}
	}
	
}
