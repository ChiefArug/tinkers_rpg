package chiefarug.mods.tinkersrpg;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import slimeknights.tconstruct.world.client.TinkerSlimeRenderer;

import static chiefarug.mods.tinkersrpg.TinkersRPG.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TinkersRPGClient {

	public static final ResourceLocation BLOOD_SLIME_TEXTURE = new ResourceLocation(MODID, "textures/entity/blood_slime.png");
	// swaps the texture, and allows it to wear armour
	// 		//TODO fix earth slimes dropping blood slime balls... custmo entity type? 😢!
	@SubscribeEvent
	static void overrideSlimeRenderer(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityType.SLIME, c -> new TinkerSlimeRenderer(c, BLOOD_SLIME_TEXTURE));
	}
}
