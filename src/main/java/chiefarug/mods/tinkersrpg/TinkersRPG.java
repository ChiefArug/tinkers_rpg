package chiefarug.mods.tinkersrpg;

import com.mojang.logging.LogUtils;
import foundry.alembic.AlembicAPI;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TinkersRPG.MODID)
public class TinkersRPG {

	static final String MODID = "tinkers_rpg";
	@SuppressWarnings("unused")
    private static final Logger LGGR = LogUtils.getLogger();

	public TinkersRPG() {
		setupDamageTypes();
	}


	private static void setupDamageTypes() {
		// Syc
		AlembicAPI.addDefaultDamageType("physical_damage");
		AlembicAPI.addDefaultPotionEffect("physical_damage");
		// Aerth
		AlembicAPI.addDefaultDamageType("earth_damage");
		AlembicAPI.addDefaultPotionEffect("earth_damage");
		AlembicAPI.addDefaultParticle("earth_damage");
		// Aer
		AlembicAPI.addDefaultDamageType("air_damage");
		AlembicAPI.addDefaultPotionEffect("air_damage");
		AlembicAPI.addDefaultParticle("air_damage");
		// Lyfe
		AlembicAPI.addDefaultDamageType("life_damage");
		AlembicAPI.addDefaultPotionEffect("life_damage");
		AlembicAPI.addDefaultParticle("life_damage");
		// Fyre
		AlembicAPI.addDefaultDamageType("fire_damage");
		AlembicAPI.addDefaultPotionEffect("fire_damage");
		AlembicAPI.addDefaultParticle("fire_damage");
		// Endyre
		AlembicAPI.addDefaultDamageType("arcane_damage");
		AlembicAPI.addDefaultPotionEffect("arcane_damage");
		AlembicAPI.addDefaultParticle("arcane_damage");
	}
}
