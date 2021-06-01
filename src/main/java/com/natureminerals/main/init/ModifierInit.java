package com.natureminerals.main.init;

import com.natureminerals.main.NatureMinerals;
import com.natureminerals.main.modifiers.AstralSpeedModifier;
import com.natureminerals.main.modifiers.BarterableModifier;
import com.natureminerals.main.modifiers.CrystallizedModifier;
import com.natureminerals.main.modifiers.ElectrifyingModifier;
import com.natureminerals.main.modifiers.LifeStealModifier;
import com.natureminerals.main.modifiers.NetherEfficiencyModifier;
import com.natureminerals.main.modifiers.VenomousModifier;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class ModifierInit {
	public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, NatureMinerals.MODID);
	
	public static final RegistryObject<Modifier> CRYSTALLIZED = MODIFIERS.register("crystallized", CrystallizedModifier::new);
	public static final RegistryObject<Modifier> BARTERABLE = MODIFIERS.register("barterable", BarterableModifier::new);
	public static final RegistryObject<Modifier> VENOMOUS = MODIFIERS.register("venomous", VenomousModifier::new);
	public static final RegistryObject<Modifier> LIFE_STEAL = MODIFIERS.register("life_steal", LifeStealModifier::new);
	public static final RegistryObject<Modifier> NETHER_EFFICIENCY = MODIFIERS.register("nether_efficiency", NetherEfficiencyModifier::new);
	public static final RegistryObject<Modifier> ASTRAL_SPEED = MODIFIERS.register("astral_speed", AstralSpeedModifier::new);
	public static final RegistryObject<Modifier> ELECTRIFYING = MODIFIERS.register("electrifying", ElectrifyingModifier::new);

}
