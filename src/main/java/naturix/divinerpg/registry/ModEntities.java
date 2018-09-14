package naturix.divinerpg.registry;

import naturix.divinerpg.Config;
import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.entities.assets.model.ModelHat;
import naturix.divinerpg.entities.assets.model.iceika.model.RenderWorkshopTinkerer;
import naturix.divinerpg.entities.assets.render.RenderAcidHag;
import naturix.divinerpg.entities.assets.render.RenderHat;
import naturix.divinerpg.entities.assets.render.RenderProjectile;
import naturix.divinerpg.entities.assets.render.arcana.RenderDeathHound;
import naturix.divinerpg.entities.assets.render.arcana.RenderDeathcryx;
import naturix.divinerpg.entities.assets.render.arcana.RenderDramix;
import naturix.divinerpg.entities.assets.render.arcana.RenderDungeonDemon;
import naturix.divinerpg.entities.assets.render.arcana.RenderLeorna;
import naturix.divinerpg.entities.assets.render.arcana.RenderParasecta;
import naturix.divinerpg.entities.assets.render.arcana.RenderParatiku;
import naturix.divinerpg.entities.assets.render.arcana.RenderRazorback;
import naturix.divinerpg.entities.assets.render.arcana.RenderRejuvGolem;
import naturix.divinerpg.entities.assets.render.arcana.RenderRoamer;
import naturix.divinerpg.entities.assets.render.arcana.RenderSeimer;
import naturix.divinerpg.entities.assets.render.arcana.RenderTomoApalachia;
import naturix.divinerpg.entities.assets.render.arcana.RenderWraith;
import naturix.divinerpg.entities.assets.render.iceika.RenderAlicanto;
import naturix.divinerpg.entities.assets.render.iceika.RenderFractite;
import naturix.divinerpg.entities.assets.render.iceika.RenderFrosty;
import naturix.divinerpg.entities.assets.render.iceika.RenderGlacide;
import naturix.divinerpg.entities.assets.render.iceika.RenderHastreus;
import naturix.divinerpg.entities.assets.render.iceika.RenderRollum;
import naturix.divinerpg.entities.assets.render.iceika.RenderWorkshopMerchant;
import naturix.divinerpg.entities.assets.render.twilight.RenderAngryBunny;
import naturix.divinerpg.entities.assets.render.twilight.RenderApalachiaArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderApalachiaGolem;
import naturix.divinerpg.entities.assets.render.twilight.RenderBasalisk;
import naturix.divinerpg.entities.assets.render.twilight.RenderBehemoth;
import naturix.divinerpg.entities.assets.render.twilight.RenderBunny;
import naturix.divinerpg.entities.assets.render.twilight.RenderCadillionApalachia;
import naturix.divinerpg.entities.assets.render.twilight.RenderCadillionEden;
import naturix.divinerpg.entities.assets.render.twilight.RenderCadillionMortum;
import naturix.divinerpg.entities.assets.render.twilight.RenderCadillionWildwood;
import naturix.divinerpg.entities.assets.render.twilight.RenderCoriEden;
import naturix.divinerpg.entities.assets.render.twilight.RenderCoriSkythern;
import naturix.divinerpg.entities.assets.render.twilight.RenderDenseDemon;
import naturix.divinerpg.entities.assets.render.twilight.RenderDensos;
import naturix.divinerpg.entities.assets.render.twilight.RenderEpiphite;
import naturix.divinerpg.entities.assets.render.twilight.RenderEternalArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderGolemSkythern;
import naturix.divinerpg.entities.assets.render.twilight.RenderGolemWildwood;
import naturix.divinerpg.entities.assets.render.twilight.RenderGreenfeet;
import naturix.divinerpg.entities.assets.render.twilight.RenderKarot;
import naturix.divinerpg.entities.assets.render.twilight.RenderMadivel;
import naturix.divinerpg.entities.assets.render.twilight.RenderMage;
import naturix.divinerpg.entities.assets.render.twilight.RenderMegalith;
import naturix.divinerpg.entities.assets.render.twilight.RenderMoonWolf;
import naturix.divinerpg.entities.assets.render.twilight.RenderMortumArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderMystic;
import naturix.divinerpg.entities.assets.render.twilight.RenderSamek;
import naturix.divinerpg.entities.assets.render.twilight.RenderSkythernArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderSkythernFiend;
import naturix.divinerpg.entities.assets.render.twilight.RenderSorcerer;
import naturix.divinerpg.entities.assets.render.twilight.RenderSoulFiend;
import naturix.divinerpg.entities.assets.render.twilight.RenderSoulSpider;
import naturix.divinerpg.entities.assets.render.twilight.RenderSoulStealer;
import naturix.divinerpg.entities.assets.render.twilight.RenderSunArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderTomoEden;
import naturix.divinerpg.entities.assets.render.twilight.RenderTomoWildwood;
import naturix.divinerpg.entities.assets.render.twilight.RenderTwilightArcher;
import naturix.divinerpg.entities.assets.render.twilight.RenderTwilightDemon;
import naturix.divinerpg.entities.assets.render.twilight.RenderVamacheron;
import naturix.divinerpg.entities.assets.render.twilight.RenderWarriorApalachia;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAncientEntity;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAridWarrior;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAyeracoBlue;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAyeracoGreen;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAyeracoPurple;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAyeracoYellow;
import naturix.divinerpg.entities.assets.render.vanilla.RenderAyerecoRed;
import naturix.divinerpg.entities.assets.render.vanilla.RenderCrab;
import naturix.divinerpg.entities.assets.render.vanilla.RenderDramcryxJungle;
import naturix.divinerpg.entities.assets.render.vanilla.RenderEnderTriplets;
import naturix.divinerpg.entities.assets.render.vanilla.RenderEnthralledDramcryx;
import naturix.divinerpg.entities.assets.render.vanilla.RenderEye;
import naturix.divinerpg.entities.assets.render.vanilla.RenderKingCrab;
import naturix.divinerpg.entities.assets.render.vanilla.RenderRotatick;
import naturix.divinerpg.entities.assets.render.vanilla.RenderShark;
import naturix.divinerpg.entities.assets.render.vanilla.RenderWatcher;
import naturix.divinerpg.entities.assets.render.vanilla.RenderWildFire;
import naturix.divinerpg.entities.entity.EntityTeakerDisc;
import naturix.divinerpg.entities.entity.arcana.DeathHound;
import naturix.divinerpg.entities.entity.arcana.Deathcryx;
import naturix.divinerpg.entities.entity.arcana.Dramix;
import naturix.divinerpg.entities.entity.arcana.DungeonDemon;
import naturix.divinerpg.entities.entity.arcana.EdenCadillion;
import naturix.divinerpg.entities.entity.arcana.EdenCori;
import naturix.divinerpg.entities.entity.arcana.EdenTomo;
import naturix.divinerpg.entities.entity.arcana.Leorna;
import naturix.divinerpg.entities.entity.arcana.Parasecta;
import naturix.divinerpg.entities.entity.arcana.Paratiku;
import naturix.divinerpg.entities.entity.arcana.Razorback;
import naturix.divinerpg.entities.entity.arcana.RejuvGolem;
import naturix.divinerpg.entities.entity.arcana.Roamer;
import naturix.divinerpg.entities.entity.arcana.Seimer;
import naturix.divinerpg.entities.entity.arcana.Wraith;
import naturix.divinerpg.entities.entity.iceika.Alicanto;
import naturix.divinerpg.entities.entity.iceika.Fractite;
import naturix.divinerpg.entities.entity.iceika.Frosty;
import naturix.divinerpg.entities.entity.iceika.Glacide;
import naturix.divinerpg.entities.entity.iceika.Hastreus;
import naturix.divinerpg.entities.entity.iceika.Rollum;
import naturix.divinerpg.entities.entity.iceika.WorkshopMerchant;
import naturix.divinerpg.entities.entity.iceika.WorkshopTinkerer;
import naturix.divinerpg.entities.entity.projectiles.InfernoArrow;
import naturix.divinerpg.entities.entity.twilight.AngryBunny;
import naturix.divinerpg.entities.entity.twilight.ApalachiaArcher;
import naturix.divinerpg.entities.entity.twilight.ApalachiaCadillion;
import naturix.divinerpg.entities.entity.twilight.ApalachiaGolem;
import naturix.divinerpg.entities.entity.twilight.ApalachiaTomo;
import naturix.divinerpg.entities.entity.twilight.ApalachiaWarrior;
import naturix.divinerpg.entities.entity.twilight.Basalisk;
import naturix.divinerpg.entities.entity.twilight.Bohemoth;
import naturix.divinerpg.entities.entity.twilight.Bunny;
import naturix.divinerpg.entities.entity.twilight.DenseDemon;
import naturix.divinerpg.entities.entity.twilight.Densos;
import naturix.divinerpg.entities.entity.twilight.EnchantedArcher;
import naturix.divinerpg.entities.entity.twilight.EnchantedWarrior;
import naturix.divinerpg.entities.entity.twilight.Epiphite;
import naturix.divinerpg.entities.entity.twilight.EternalArcher;
import naturix.divinerpg.entities.entity.twilight.Greenfeet;
import naturix.divinerpg.entities.entity.twilight.Karot;
import naturix.divinerpg.entities.entity.twilight.Madivel;
import naturix.divinerpg.entities.entity.twilight.Mage;
import naturix.divinerpg.entities.entity.twilight.Megalith;
import naturix.divinerpg.entities.entity.twilight.MoonWolf;
import naturix.divinerpg.entities.entity.twilight.MortumArcher;
import naturix.divinerpg.entities.entity.twilight.MortumCadillion;
import naturix.divinerpg.entities.entity.twilight.MortumDemon;
import naturix.divinerpg.entities.entity.twilight.Mystic;
import naturix.divinerpg.entities.entity.twilight.RenderDemonMortum;
import naturix.divinerpg.entities.entity.twilight.Samek;
import naturix.divinerpg.entities.entity.twilight.SkythernArcher;
import naturix.divinerpg.entities.entity.twilight.SkythernCori;
import naturix.divinerpg.entities.entity.twilight.SkythernFiend;
import naturix.divinerpg.entities.entity.twilight.SkythernGolem;
import naturix.divinerpg.entities.entity.twilight.Sorcerer;
import naturix.divinerpg.entities.entity.twilight.SoulFiend;
import naturix.divinerpg.entities.entity.twilight.SoulSpider;
import naturix.divinerpg.entities.entity.twilight.SoulStealer;
import naturix.divinerpg.entities.entity.twilight.SunArcher;
import naturix.divinerpg.entities.entity.twilight.TwilightArcher;
import naturix.divinerpg.entities.entity.twilight.TwilightDemon;
import naturix.divinerpg.entities.entity.twilight.Vamecheron;
import naturix.divinerpg.entities.entity.twilight.WildwoodCadillion;
import naturix.divinerpg.entities.entity.twilight.WildwoodGolem;
import naturix.divinerpg.entities.entity.twilight.WildwoodTomo;
import naturix.divinerpg.entities.entity.vanilla.AncientEntity;
import naturix.divinerpg.entities.entity.vanilla.AridWarrior;
import naturix.divinerpg.entities.entity.vanilla.AyeracoBlue;
import naturix.divinerpg.entities.entity.vanilla.AyeracoGreen;
import naturix.divinerpg.entities.entity.vanilla.AyeracoPurple;
import naturix.divinerpg.entities.entity.vanilla.AyeracoRed;
import naturix.divinerpg.entities.entity.vanilla.AyeracoYellow;
import naturix.divinerpg.entities.entity.vanilla.Crab;
import naturix.divinerpg.entities.entity.vanilla.EnderTriplets;
import naturix.divinerpg.entities.entity.vanilla.EnthralledDramcryx;
import naturix.divinerpg.entities.entity.vanilla.JungleStegosaurus;
import naturix.divinerpg.entities.entity.vanilla.KingCrab;
import naturix.divinerpg.entities.entity.vanilla.LandShark;
import naturix.divinerpg.entities.entity.vanilla.Rotatick;
import naturix.divinerpg.entities.entity.vanilla.TheEye;
import naturix.divinerpg.entities.entity.vanilla.TheWatcher;
import naturix.divinerpg.entities.entity.vanilla.WildFire;
import naturix.divinerpg.entities.entity.vethia.AcidHag;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
public class ModEntities {

	public static void init() {
		//register basic mobs
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "teaker_disc"), EntityTeakerDisc.class, "teaker_disc", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "arrow_inferno"), InfernoArrow.class, "arrow_inferno", id++, DivineRPG.instance, 64, 3, true);
		
		
		//register advanced mobs
		id = 100;
		//arcana
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "deathcryx"), Deathcryx.class, "deathcryx", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "death_hound"), DeathHound.class, "death_hound", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "dramix_boss"), Dramix.class, "dramix_boss", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "dungeon_demon"), DungeonDemon.class, "dungeon_demon", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "leorna"), Leorna.class, "leorna", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "parasecta"), Parasecta.class, "parasecta", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "paratiku"), Paratiku.class, "paratiku", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "razorback"), Razorback.class, "razorback", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "golem_rejuv"), RejuvGolem.class, "golem_rejuv", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "roamer"), Roamer.class, "roamer", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "seimer"), Seimer.class, "seimer", id++, DivineRPG.instance, 64, 3, true, 0x00000, 0xff0000);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "wraith"), Wraith.class, "wraith", id++, DivineRPG.instance, 64, 3, true);
		id = 200;
		//iceika
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "alicanto"), Alicanto.class, "allicanto", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "fractite"), Fractite.class, "fractite", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "frosty"), Frosty.class, "frosty", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "glacide"), Glacide.class, "glacide", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "hastreus"), Hastreus.class, "hastreus", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "rollum"), Rollum.class, "rollum", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "workshop_merchant"), WorkshopMerchant.class, "workshop_merchant", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "workshop_tinkerer"), WorkshopTinkerer.class, "workshop_tinkerer", id++, DivineRPG.instance, 64, 3, true);
		id = 300;
		//twilight
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_apalachia"), ApalachiaArcher.class, "archer_apalachia", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_skythern"), SkythernArcher.class, "archer_skythern", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_mortum"), MortumArcher.class, "archer_mortum", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "bunny_angry"), AngryBunny.class, "bunny_angry", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "basalisk"), Basalisk.class, "basalisk", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "behemoth"), Bohemoth.class, "behemoth", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "bunny"), Bunny.class, "bunny", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cadillion_eden"), EdenCadillion.class, "cadillion_eden", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cadillion_apalachia"), ApalachiaCadillion.class, "cadillion_apalachia", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cadillion_mortum"), MortumCadillion.class, "cadillion_mortum", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cadillion_wildwood"), WildwoodCadillion.class, "cadillion_wildwood", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cori_eden"), EdenCori.class, "cori_eden", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "cori_skythern"), SkythernCori.class, "cori_skythern", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "demon_dense"), DenseDemon.class, "demon_dense", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "densos"), Densos.class, "densos", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "epiphite"), Epiphite.class, "epiphite", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_eternal"), EternalArcher.class, "archer_eternal", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "greenfeet"), Greenfeet.class, "greenfeet", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "karot"), Karot.class, "karot", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "madivel"), Madivel.class, "madivel", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "mage"), Mage.class, "mage", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "megalith"), Megalith.class, "megalith", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "wolf_moon"), MoonWolf.class, "wolf_moon", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "mystic"), Mystic.class, "mystic", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "samek"), Samek.class, "samek", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "fiend_skythern"), SkythernFiend.class, "fiend_skythern", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "sorcerer"), Sorcerer.class, "sorcerer", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "fiend_soul"), SoulFiend.class, "fiend_soul", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "spider_soul"), SoulSpider.class, "spider_soul", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "stealer_soul"), SoulStealer.class, "stealer_soul", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_sun"), SunArcher.class, "archer_sun", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "tomo_eden"), EdenTomo.class, "tomo_eden", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "tomo_wildwood"), WildwoodTomo.class, "tomo_wildwood", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "tomo_apalachia"), ApalachiaTomo.class, "tomo_apalachia", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "archer_twilight"), TwilightArcher.class, "archer_twilight", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "demon_twilight"), TwilightDemon.class, "demon_twilight", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "demon_mortum"), MortumDemon.class, "demon_mortum", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "golem_apalachia"), ApalachiaGolem.class, "golem_apalachia", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "golem_skythern"), SkythernGolem.class, "golem_skythern", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "warrior_apalachia"), ApalachiaWarrior.class, "warrior_apalachia", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "golem_wildwood"), WildwoodGolem.class, "golem_wildwood", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "vamacheron_boss"), Vamecheron.class, "vamacheron_boss", id++, DivineRPG.instance, 64, 3, true);
		id = 400;
		//vanilla
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ancient_entity"), AncientEntity.class, "ancient_entity", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "shark"), LandShark.class, "shark", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "wildfire"), WildFire.class, "wildfire", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "rotatick"), Rotatick.class, "rotatick", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "eye"), TheEye.class, "eye", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ender_triplets"), EnderTriplets.class, "ender_triplets", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "watcher"), TheWatcher.class, "watcher", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ayeraco_red"), AyeracoRed.class, "ayeraco_red", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ayeraco_blue"), AyeracoBlue.class, "ayeraco_blue", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ayeraco_yellow"), AyeracoYellow.class, "ayeraco_yellow", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ayeraco_purple"), AyeracoPurple.class, "ayeraco_purple", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "ayeraco_green"), AyeracoGreen.class, "ayeraco_green", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "warrior_arid"), AridWarrior.class, "warrior_arid", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "crab"), Crab.class, "crab", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "crab_king"), KingCrab.class, "crab_king", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "dramcryx_jungle"), JungleStegosaurus.class, "dramcryx_jungle", id++, DivineRPG.instance, 64, 3, true);
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "dramcryx_enthralled"), EnthralledDramcryx.class, "dramcryx_enthralled", id++, DivineRPG.instance, 64, 3, true);
		
		id = 500;
		//vethia
		EntityRegistry.registerModEntity(new ResourceLocation(DivineRPG.modId, "acid_hag"), AcidHag.class, "acid_hag", id++, DivineRPG.instance, 64, 3, true);


		DivineRPG.logger.info(DivineRPG.modId +" entities have been loaded");
		
		//Spawn
		EntityRegistry.addSpawn(JungleStegosaurus.class, 50 * Config.mobSpawnMultiplier, 1, 10, EnumCreatureType.MONSTER, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE);
		EntityRegistry.addSpawn(WildFire.class, 50 * Config.mobSpawnMultiplier, 1, 3, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(TheEye.class, 50 * Config.mobSpawnMultiplier, 1, 3, EnumCreatureType.MONSTER, Biomes.SKY);
		EntityRegistry.addSpawn(EnderTriplets.class, 50 * Config.mobSpawnMultiplier, 1, 3, EnumCreatureType.MONSTER, Biomes.SKY);
		EntityRegistry.addSpawn(EnthralledDramcryx.class, 150 * Config.mobSpawnMultiplier, 1, 5, EnumCreatureType.MONSTER, Biomes.OCEAN, Biomes.PLAINS, Biomes.DESERT, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.TAIGA, Biomes.SWAMPLAND, Biomes.RIVER, Biomes.HELL, Biomes.SKY, Biomes.FROZEN_OCEAN, Biomes.FROZEN_RIVER, Biomes.ICE_PLAINS, Biomes.ICE_MOUNTAINS, Biomes.MUSHROOM_ISLAND, Biomes.MUSHROOM_ISLAND_SHORE, Biomes.BEACH, Biomes.DESERT_HILLS, Biomes.FOREST_HILLS, Biomes.TAIGA_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.JUNGLE_EDGE, Biomes.DEEP_OCEAN, Biomes.STONE_BEACH, Biomes.COLD_BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.MESA, Biomes.MESA_ROCK, Biomes.MESA_CLEAR_ROCK, Biomes.VOID, Biomes.MUTATED_PLAINS, Biomes.MUTATED_DESERT, Biomes.MUTATED_EXTREME_HILLS, Biomes.MUTATED_FOREST, Biomes.MUTATED_TAIGA, Biomes.MUTATED_SWAMPLAND, Biomes.MUTATED_ICE_FLATS, Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE, Biomes.MUTATED_BIRCH_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_TAIGA_COLD, Biomes.MUTATED_REDWOOD_TAIGA, Biomes.MUTATED_REDWOOD_TAIGA_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_SAVANNA, Biomes.MUTATED_SAVANNA_ROCK, Biomes.MUTATED_MESA, Biomes.MUTATED_MESA_ROCK, Biomes.MUTATED_MESA_CLEAR_ROCK);
		DivineRPG.logger.info(DivineRPG.modId +" spawns have been loaded");
		
		//loot
		LootTableList.register(JungleStegosaurus.LOOT);
		LootTableList.register(LandShark.LOOT);
		LootTableList.register(WildFire.LOOT);
		LootTableList.register(Rotatick.LOOT);
		LootTableList.register(EnderTriplets.LOOT);
		LootTableList.register(Leorna.LOOT);
		LootTableList.register(Parasecta.LOOT);
		LootTableList.register(Paratiku.LOOT);
		LootTableList.register(AcidHag.LOOT);
		LootTableList.register(Razorback.LOOT);
		LootTableList.register(RejuvGolem.LOOT);
		LootTableList.register(Roamer.LOOT);
		LootTableList.register(Seimer.LOOT);
		LootTableList.register(Wraith.LOOT);
		LootTableList.register(Alicanto.LOOT);
		LootTableList.register(Fractite.LOOT);
		LootTableList.register(Frosty.LOOT);
		LootTableList.register(Glacide.LOOT);
		LootTableList.register(Hastreus.LOOT);
		LootTableList.register(Rollum.LOOT);
		LootTableList.register(WorkshopTinkerer.LOOT);
		LootTableList.register(AngryBunny.LOOT);
		LootTableList.register(Basalisk.LOOT);
		LootTableList.register(Bohemoth.LOOT);
		LootTableList.register(Bunny.LOOT);
		LootTableList.register(EdenCadillion.LOOT);
		LootTableList.register(EdenCori.LOOT);
		LootTableList.register(DenseDemon.LOOT);
		LootTableList.register(Densos.LOOT);
		LootTableList.register(EnchantedArcher.LOOT);
		LootTableList.register(EnchantedWarrior.LOOT);
		LootTableList.register(Epiphite.LOOT);
		LootTableList.register(EternalArcher.LOOT);
		LootTableList.register(Greenfeet.LOOT);
		LootTableList.register(Karot.LOOT);
		LootTableList.register(Madivel.LOOT);
		LootTableList.register(Mage.LOOT);
		LootTableList.register(Megalith.LOOT);
		LootTableList.register(MoonWolf.LOOT);
		LootTableList.register(Mystic.LOOT);
		LootTableList.register(Samek.LOOT);
		LootTableList.register(SkythernFiend.LOOT);
		LootTableList.register(Sorcerer.LOOT);
		LootTableList.register(SoulFiend.LOOT);
		LootTableList.register(SoulSpider.LOOT);
		LootTableList.register(SoulStealer.LOOT);
		LootTableList.register(SunArcher.LOOT);
		LootTableList.register(EdenTomo.LOOT);
		LootTableList.register(TwilightArcher.LOOT);
		LootTableList.register(TwilightDemon.LOOT);
		LootTableList.register(ApalachiaGolem.LOOT);
		LootTableList.register(AyeracoRed.LOOT);
		LootTableList.register(AyeracoBlue.LOOT);
		LootTableList.register(AyeracoYellow.LOOT);
		LootTableList.register(AyeracoPurple.LOOT);
		LootTableList.register(AyeracoGreen.LOOT);
		LootTableList.register(AridWarrior.LOOT);
		LootTableList.register(Crab.LOOT);
		LootTableList.register(KingCrab.LOOT);
		LootTableList.register(EnthralledDramcryx.LOOT);
		
		DivineRPG.logger.info(DivineRPG.modId +" loot has been loaded");
	}
	public static void initModels() {
		//arcana 
		RenderingRegistry.registerEntityRenderingHandler(Deathcryx.class, RenderDeathcryx.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(DeathHound.class, RenderDeathHound.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(DungeonDemon.class, RenderDungeonDemon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Dramix.class, RenderDramix.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Razorback.class, RenderRazorback.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(RejuvGolem.class, RenderRejuvGolem.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Roamer.class, RenderRoamer.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Seimer.class, RenderSeimer.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Wraith.class, RenderWraith.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Leorna.class, RenderLeorna.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Parasecta.class, RenderParasecta.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Paratiku.class, RenderParatiku.FACTORY);
		
		//iceika
		RenderingRegistry.registerEntityRenderingHandler(Alicanto.class, RenderAlicanto.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Fractite.class, RenderFractite.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Frosty.class, RenderFrosty.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Glacide.class, RenderGlacide.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Hastreus.class, RenderHastreus.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Rollum.class, RenderRollum.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WorkshopTinkerer.class, RenderWorkshopTinkerer.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WorkshopMerchant.class, RenderWorkshopMerchant.FACTORY);
		
		//twilight
		RenderingRegistry.registerEntityRenderingHandler(AngryBunny.class, RenderAngryBunny.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Basalisk.class, RenderBasalisk.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Bohemoth.class, RenderBehemoth.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Bunny.class, RenderBunny.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EdenCadillion.class, RenderCadillionEden.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EdenCori.class, RenderCoriEden.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(DenseDemon.class, RenderDenseDemon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Densos.class, RenderDensos.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Epiphite.class, RenderEpiphite.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EternalArcher.class, RenderEternalArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Greenfeet.class, RenderGreenfeet.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Karot.class, RenderKarot.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Madivel.class, RenderMadivel.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Mage.class, RenderMage.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Megalith.class, RenderMegalith.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(MoonWolf.class, RenderMoonWolf.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Mystic.class, RenderMystic.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Samek.class, RenderSamek.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SkythernFiend.class, RenderSkythernFiend.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Sorcerer.class, RenderSorcerer.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SoulFiend.class, RenderSoulFiend.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SoulSpider.class, RenderSoulSpider.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SoulStealer.class, RenderSoulStealer.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SunArcher.class, RenderSunArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EdenTomo.class, RenderTomoEden.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(TwilightArcher.class, RenderTwilightArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(TwilightDemon.class, RenderTwilightDemon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(ApalachiaGolem.class, RenderApalachiaGolem.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Vamecheron.class, RenderVamacheron.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(ApalachiaArcher.class, RenderApalachiaArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(MortumArcher.class, RenderMortumArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SkythernArcher.class, RenderSkythernArcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(ApalachiaCadillion.class, RenderCadillionApalachia.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(MortumCadillion.class, RenderCadillionMortum.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WildwoodCadillion.class, RenderCadillionWildwood.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SkythernCori.class, RenderCoriSkythern.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(MortumDemon.class, RenderDemonMortum.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(SkythernGolem.class, RenderGolemSkythern.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WildwoodGolem.class, RenderGolemWildwood.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(ApalachiaTomo.class, RenderTomoApalachia.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WildwoodTomo.class, RenderTomoWildwood.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(ApalachiaWarrior.class, RenderWarriorApalachia.FACTORY);
		
		//vanilla
		RenderingRegistry.registerEntityRenderingHandler(JungleStegosaurus.class, RenderDramcryxJungle.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AncientEntity.class, RenderAncientEntity.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(LandShark.class, RenderShark.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(WildFire.class, RenderWildFire.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Rotatick.class, RenderRotatick.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(TheEye.class, RenderEye.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EnderTriplets.class, RenderEnderTriplets.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(TheWatcher.class, RenderWatcher.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AyeracoRed.class, RenderAyerecoRed.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AyeracoBlue.class, RenderAyeracoBlue.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AyeracoYellow.class, RenderAyeracoYellow.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AyeracoGreen.class, RenderAyeracoGreen.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(AyeracoPurple.class, RenderAyeracoPurple.FACTORY); 
		RenderingRegistry.registerEntityRenderingHandler(AridWarrior.class, RenderAridWarrior.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(Crab.class, RenderCrab.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(KingCrab.class, RenderKingCrab.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EnthralledDramcryx.class, RenderEnthralledDramcryx.FACTORY);
		
		//vethia
		RenderingRegistry.registerEntityRenderingHandler(AcidHag.class, RenderAcidHag.FACTORY);
		
		//other
		RenderManager manager = Minecraft.getMinecraft().getRenderManager();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisc.class, new RenderProjectile(new ResourceLocation("divinerpg:textures/items/amthirmisdisk.png"), 1));
		RenderingRegistry.registerEntityRenderingHandler(InfernoArrow.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),new ItemStack(ModItems.arrowInferno).getItem(), Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, RenderHat.FACTORY);
	}
}
