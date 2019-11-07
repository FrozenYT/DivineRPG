package divinerpg.registry;

import static divinerpg.utils.SpawnEggColors.Dimension.APALACHIA;
import static divinerpg.utils.SpawnEggColors.Dimension.ARCANA;
import static divinerpg.utils.SpawnEggColors.Dimension.BOSS;
import static divinerpg.utils.SpawnEggColors.Dimension.EDEN;
import static divinerpg.utils.SpawnEggColors.Dimension.END;
import static divinerpg.utils.SpawnEggColors.Dimension.ICEIKA;
import static divinerpg.utils.SpawnEggColors.Dimension.MORTUM;
import static divinerpg.utils.SpawnEggColors.Dimension.NETHER;
import static divinerpg.utils.SpawnEggColors.Dimension.OVERWORLD;
import static divinerpg.utils.SpawnEggColors.Dimension.SKYTHERN;
import static divinerpg.utils.SpawnEggColors.Dimension.WILDWOOD;

import divinerpg.DivineRPG;
import divinerpg.api.java.divinerpg.api.Reference;
import divinerpg.config.Config;
import divinerpg.objects.entities.assets.render.arcana.RenderCaptainMerik;
import divinerpg.objects.entities.assets.render.arcana.RenderDatticon;
import divinerpg.objects.entities.assets.render.arcana.RenderDeathHound;
import divinerpg.objects.entities.assets.render.arcana.RenderDeathcryx;
import divinerpg.objects.entities.assets.render.arcana.RenderDramix;
import divinerpg.objects.entities.assets.render.arcana.RenderDungeonConstructor;
import divinerpg.objects.entities.assets.render.arcana.RenderDungeonDemon;
import divinerpg.objects.entities.assets.render.arcana.RenderDungeonPrisoner;
import divinerpg.objects.entities.assets.render.arcana.RenderFyracryx;
import divinerpg.objects.entities.assets.render.arcana.RenderGolemOfRejuvenation;
import divinerpg.objects.entities.assets.render.arcana.RenderLeorna;
import divinerpg.objects.entities.assets.render.arcana.RenderLivingStatue;
import divinerpg.objects.entities.assets.render.arcana.RenderLordVatticus;
import divinerpg.objects.entities.assets.render.arcana.RenderParasecta;
import divinerpg.objects.entities.assets.render.arcana.RenderParatiku;
import divinerpg.objects.entities.assets.render.arcana.RenderRazorback;
import divinerpg.objects.entities.assets.render.arcana.RenderRoamer;
import divinerpg.objects.entities.assets.render.arcana.RenderSeimer;
import divinerpg.objects.entities.assets.render.arcana.RenderWarGeneral;
import divinerpg.objects.entities.assets.render.arcana.RenderWraith;
import divinerpg.objects.entities.assets.render.arcana.RenderZelus;
import divinerpg.objects.entities.assets.render.iceika.RenderAlicanto;
import divinerpg.objects.entities.assets.render.iceika.RenderFractite;
import divinerpg.objects.entities.assets.render.iceika.RenderFrostArcher;
import divinerpg.objects.entities.assets.render.iceika.RenderFrostCloud;
import divinerpg.objects.entities.assets.render.iceika.RenderFrosty;
import divinerpg.objects.entities.assets.render.iceika.RenderGlacide;
import divinerpg.objects.entities.assets.render.iceika.RenderHastreus;
import divinerpg.objects.entities.assets.render.iceika.RenderRollum;
import divinerpg.objects.entities.assets.render.iceika.RenderWorkshopMerchant;
import divinerpg.objects.entities.assets.render.iceika.RenderWorkshopTinkerer;
import divinerpg.objects.entities.assets.render.projectiles.RenderAttractor;
import divinerpg.objects.entities.assets.render.projectiles.RenderCaveRock;
import divinerpg.objects.entities.assets.render.projectiles.RenderCoriShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderCorruptedBullet;
import divinerpg.objects.entities.assets.render.projectiles.RenderDivineArrow;
import divinerpg.objects.entities.assets.render.projectiles.RenderEnderTripletsFireball;
import divinerpg.objects.entities.assets.render.projectiles.RenderFirefly;
import divinerpg.objects.entities.assets.render.projectiles.RenderFractiteShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderFrostShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderFyracryxFireball;
import divinerpg.objects.entities.assets.render.projectiles.RenderGrenade;
import divinerpg.objects.entities.assets.render.projectiles.RenderKingofScorchersMeteor;
import divinerpg.objects.entities.assets.render.projectiles.RenderKingofScorchersShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderLamona;
import divinerpg.objects.entities.assets.render.projectiles.RenderMerikMissile;
import divinerpg.objects.entities.assets.render.projectiles.RenderMeteor;
import divinerpg.objects.entities.assets.render.projectiles.RenderReflector;
import divinerpg.objects.entities.assets.render.projectiles.RenderSaguaroWormShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderScorcherShot;
import divinerpg.objects.entities.assets.render.projectiles.RenderSerenadeOfDeath;
import divinerpg.objects.entities.assets.render.projectiles.RenderSerenadeOfIce;
import divinerpg.objects.entities.assets.render.projectiles.RenderShooterBullet;
import divinerpg.objects.entities.assets.render.projectiles.RenderSnowShuriken;
import divinerpg.objects.entities.assets.render.projectiles.RenderSoundOfCarols;
import divinerpg.objects.entities.assets.render.projectiles.RenderSoundOfMusic;
import divinerpg.objects.entities.assets.render.projectiles.RenderSparkler;
import divinerpg.objects.entities.assets.render.projectiles.RenderStaff;
import divinerpg.objects.entities.assets.render.projectiles.RenderStar;
import divinerpg.objects.entities.assets.render.projectiles.RenderVileStorm;
import divinerpg.objects.entities.assets.render.projectiles.RenderWatcherShot;
import divinerpg.objects.entities.assets.render.twilight.RenderAdvancedCori;
import divinerpg.objects.entities.assets.render.twilight.RenderAngryBunny;
import divinerpg.objects.entities.assets.render.twilight.RenderApalachiaCadillion;
import divinerpg.objects.entities.assets.render.twilight.RenderApalachiaGolem;
import divinerpg.objects.entities.assets.render.twilight.RenderApalachiaTomo;
import divinerpg.objects.entities.assets.render.twilight.RenderBasilisk;
import divinerpg.objects.entities.assets.render.twilight.RenderBehemoth;
import divinerpg.objects.entities.assets.render.twilight.RenderBunny;
import divinerpg.objects.entities.assets.render.twilight.RenderDemonOfDarkness;
import divinerpg.objects.entities.assets.render.twilight.RenderDensos;
import divinerpg.objects.entities.assets.render.twilight.RenderEdenCadillion;
import divinerpg.objects.entities.assets.render.twilight.RenderEdenTomo;
import divinerpg.objects.entities.assets.render.twilight.RenderEnchantedArcher;
import divinerpg.objects.entities.assets.render.twilight.RenderEnchantedWarrior;
import divinerpg.objects.entities.assets.render.twilight.RenderEpiphite;
import divinerpg.objects.entities.assets.render.twilight.RenderEternalArcher;
import divinerpg.objects.entities.assets.render.twilight.RenderGreenfeet;
import divinerpg.objects.entities.assets.render.twilight.RenderKarot;
import divinerpg.objects.entities.assets.render.twilight.RenderMadivel;
import divinerpg.objects.entities.assets.render.twilight.RenderMage;
import divinerpg.objects.entities.assets.render.twilight.RenderMegalith;
import divinerpg.objects.entities.assets.render.twilight.RenderMoonWolf;
import divinerpg.objects.entities.assets.render.twilight.RenderMortumCadillion;
import divinerpg.objects.entities.assets.render.twilight.RenderMystic;
import divinerpg.objects.entities.assets.render.twilight.RenderReyvor;
import divinerpg.objects.entities.assets.render.twilight.RenderSamek;
import divinerpg.objects.entities.assets.render.twilight.RenderSkythernArcher;
import divinerpg.objects.entities.assets.render.twilight.RenderSkythernFiend;
import divinerpg.objects.entities.assets.render.twilight.RenderSkythernGolem;
import divinerpg.objects.entities.assets.render.twilight.RenderSorcerer;
import divinerpg.objects.entities.assets.render.twilight.RenderSoulFiend;
import divinerpg.objects.entities.assets.render.twilight.RenderSoulSpider;
import divinerpg.objects.entities.assets.render.twilight.RenderSoulStealer;
import divinerpg.objects.entities.assets.render.twilight.RenderSpellbinder;
import divinerpg.objects.entities.assets.render.twilight.RenderSunArcher;
import divinerpg.objects.entities.assets.render.twilight.RenderTwilightArcher;
import divinerpg.objects.entities.assets.render.twilight.RenderTwilightDemon;
import divinerpg.objects.entities.assets.render.twilight.RenderVamacheron;
import divinerpg.objects.entities.assets.render.twilight.RenderVerek;
import divinerpg.objects.entities.assets.render.twilight.RenderWeakCori;
import divinerpg.objects.entities.assets.render.twilight.RenderWildwoodCadillion;
import divinerpg.objects.entities.assets.render.twilight.RenderWildwoodGolem;
import divinerpg.objects.entities.assets.render.twilight.RenderWildwoodTomo;
import divinerpg.objects.entities.assets.render.vanilla.RenderAncientEntity;
import divinerpg.objects.entities.assets.render.vanilla.RenderAridWarrior;
import divinerpg.objects.entities.assets.render.vanilla.RenderAyeracoBlue;
import divinerpg.objects.entities.assets.render.vanilla.RenderAyeracoGreen;
import divinerpg.objects.entities.assets.render.vanilla.RenderAyeracoPurple;
import divinerpg.objects.entities.assets.render.vanilla.RenderAyeracoYellow;
import divinerpg.objects.entities.assets.render.vanilla.RenderAyerecoRed;
import divinerpg.objects.entities.assets.render.vanilla.RenderBrownGrizzle;
import divinerpg.objects.entities.assets.render.vanilla.RenderCaveCrawler;
import divinerpg.objects.entities.assets.render.vanilla.RenderCaveclops;
import divinerpg.objects.entities.assets.render.vanilla.RenderCrab;
import divinerpg.objects.entities.assets.render.vanilla.RenderCyclops;
import divinerpg.objects.entities.assets.render.vanilla.RenderDesertCrawler;
import divinerpg.objects.entities.assets.render.vanilla.RenderEhu;
import divinerpg.objects.entities.assets.render.vanilla.RenderEnderSpider;
import divinerpg.objects.entities.assets.render.vanilla.RenderEnderTriplets;
import divinerpg.objects.entities.assets.render.vanilla.RenderEnderWatcher;
import divinerpg.objects.entities.assets.render.vanilla.RenderEnthralledDramcryx;
import divinerpg.objects.entities.assets.render.vanilla.RenderFrost;
import divinerpg.objects.entities.assets.render.vanilla.RenderGlacon;
import divinerpg.objects.entities.assets.render.vanilla.RenderHellPig;
import divinerpg.objects.entities.assets.render.vanilla.RenderHellSpider;
import divinerpg.objects.entities.assets.render.vanilla.RenderHusk;
import divinerpg.objects.entities.assets.render.vanilla.RenderJackOMan;
import divinerpg.objects.entities.assets.render.vanilla.RenderJungleBat;
import divinerpg.objects.entities.assets.render.vanilla.RenderJungleDramcryx;
import divinerpg.objects.entities.assets.render.vanilla.RenderJungleSpider;
import divinerpg.objects.entities.assets.render.vanilla.RenderKingCrab;
import divinerpg.objects.entities.assets.render.vanilla.RenderKingOfScorchers;
import divinerpg.objects.entities.assets.render.vanilla.RenderKobblin;
import divinerpg.objects.entities.assets.render.vanilla.RenderLiopleurodon;
import divinerpg.objects.entities.assets.render.vanilla.RenderLivestockMerchant;
import divinerpg.objects.entities.assets.render.vanilla.RenderMiner;
import divinerpg.objects.entities.assets.render.vanilla.RenderPumpkinSpider;
import divinerpg.objects.entities.assets.render.vanilla.RenderRainbour;
import divinerpg.objects.entities.assets.render.vanilla.RenderRotatick;
import divinerpg.objects.entities.assets.render.vanilla.RenderSaguaroWorm;
import divinerpg.objects.entities.assets.render.vanilla.RenderScorcher;
import divinerpg.objects.entities.assets.render.vanilla.RenderShark;
import divinerpg.objects.entities.assets.render.vanilla.RenderSmelter;
import divinerpg.objects.entities.assets.render.vanilla.RenderSnapper;
import divinerpg.objects.entities.assets.render.vanilla.RenderStoneGolem;
import divinerpg.objects.entities.assets.render.vanilla.RenderTheEye;
import divinerpg.objects.entities.assets.render.vanilla.RenderTheGrue;
import divinerpg.objects.entities.assets.render.vanilla.RenderTheWatcher;
import divinerpg.objects.entities.assets.render.vanilla.RenderWhale;
import divinerpg.objects.entities.assets.render.vanilla.RenderWhiteGrizzle;
import divinerpg.objects.entities.assets.render.vanilla.RenderWildfire;
import divinerpg.objects.entities.entity.EntityFrostCloud;
import divinerpg.objects.entities.entity.arcana.CaptainMerik;
import divinerpg.objects.entities.entity.arcana.Datticon;
import divinerpg.objects.entities.entity.arcana.DeathHound;
import divinerpg.objects.entities.entity.arcana.Deathcryx;
import divinerpg.objects.entities.entity.arcana.Dramix;
import divinerpg.objects.entities.entity.arcana.DungeonConstructor;
import divinerpg.objects.entities.entity.arcana.DungeonDemon;
import divinerpg.objects.entities.entity.arcana.DungeonPrisoner;
import divinerpg.objects.entities.entity.arcana.Fyracryx;
import divinerpg.objects.entities.entity.arcana.GolemOfRejuvenation;
import divinerpg.objects.entities.entity.arcana.Leorna;
import divinerpg.objects.entities.entity.arcana.LivingStatue;
import divinerpg.objects.entities.entity.arcana.LordVatticus;
import divinerpg.objects.entities.entity.arcana.Parasecta;
import divinerpg.objects.entities.entity.arcana.Paratiku;
import divinerpg.objects.entities.entity.arcana.Razorback;
import divinerpg.objects.entities.entity.arcana.Roamer;
import divinerpg.objects.entities.entity.arcana.Seimer;
import divinerpg.objects.entities.entity.arcana.WarGeneral;
import divinerpg.objects.entities.entity.arcana.Wraith;
import divinerpg.objects.entities.entity.arcana.Zelus;
import divinerpg.objects.entities.entity.iceika.Alicanto;
import divinerpg.objects.entities.entity.iceika.Fractite;
import divinerpg.objects.entities.entity.iceika.FrostArcher;
import divinerpg.objects.entities.entity.iceika.Frosty;
import divinerpg.objects.entities.entity.iceika.Glacide;
import divinerpg.objects.entities.entity.iceika.Hastreus;
import divinerpg.objects.entities.entity.iceika.Rollum;
import divinerpg.objects.entities.entity.iceika.WorkshopMerchant;
import divinerpg.objects.entities.entity.iceika.WorkshopTinkerer;
import divinerpg.objects.entities.entity.projectiles.EntityAttractor;
import divinerpg.objects.entities.entity.projectiles.EntityCaveRock;
import divinerpg.objects.entities.entity.projectiles.EntityColoredBullet;
import divinerpg.objects.entities.entity.projectiles.EntityCoriShot;
import divinerpg.objects.entities.entity.projectiles.EntityCorruptedBullet;
import divinerpg.objects.entities.entity.projectiles.EntityDivineArrow;
import divinerpg.objects.entities.entity.projectiles.EntityEnderTripletsFireball;
import divinerpg.objects.entities.entity.projectiles.EntityFirefly;
import divinerpg.objects.entities.entity.projectiles.EntityFractiteShot;
import divinerpg.objects.entities.entity.projectiles.EntityFrostShot;
import divinerpg.objects.entities.entity.projectiles.EntityFyracryxFireball;
import divinerpg.objects.entities.entity.projectiles.EntityGeneralsStaff;
import divinerpg.objects.entities.entity.projectiles.EntityGrenade;
import divinerpg.objects.entities.entity.projectiles.EntityKingOfScorchersMeteor;
import divinerpg.objects.entities.entity.projectiles.EntityKingOfScorchersShot;
import divinerpg.objects.entities.entity.projectiles.EntityLamona;
import divinerpg.objects.entities.entity.projectiles.EntityMerikMissile;
import divinerpg.objects.entities.entity.projectiles.EntityMeteor;
import divinerpg.objects.entities.entity.projectiles.EntityParticleBullet;
import divinerpg.objects.entities.entity.projectiles.EntityReflector;
import divinerpg.objects.entities.entity.projectiles.EntitySaguaroWormShot;
import divinerpg.objects.entities.entity.projectiles.EntityScorcherShot;
import divinerpg.objects.entities.entity.projectiles.EntitySerenadeOfDeath;
import divinerpg.objects.entities.entity.projectiles.EntitySerenadeOfIce;
import divinerpg.objects.entities.entity.projectiles.EntityShooterBullet;
import divinerpg.objects.entities.entity.projectiles.EntityShuriken;
import divinerpg.objects.entities.entity.projectiles.EntitySnowflakeShuriken;
import divinerpg.objects.entities.entity.projectiles.EntitySoulFiendShot;
import divinerpg.objects.entities.entity.projectiles.EntitySoundOfCarols;
import divinerpg.objects.entities.entity.projectiles.EntitySoundOfMusic;
import divinerpg.objects.entities.entity.projectiles.EntitySparkler;
import divinerpg.objects.entities.entity.projectiles.EntityStar;
import divinerpg.objects.entities.entity.projectiles.EntityTwilightDemonShot;
import divinerpg.objects.entities.entity.projectiles.EntityTwilightMageShot;
import divinerpg.objects.entities.entity.projectiles.EntityVileStorm;
import divinerpg.objects.entities.entity.projectiles.EntityWatcherShot;
import divinerpg.objects.entities.entity.twilight.AdvancedCori;
import divinerpg.objects.entities.entity.twilight.AngryBunny;
import divinerpg.objects.entities.entity.twilight.ApalachiaCadillion;
import divinerpg.objects.entities.entity.twilight.ApalachiaGolem;
import divinerpg.objects.entities.entity.twilight.ApalachiaTomo;
import divinerpg.objects.entities.entity.twilight.Basilisk;
import divinerpg.objects.entities.entity.twilight.Behemoth;
import divinerpg.objects.entities.entity.twilight.Bunny;
import divinerpg.objects.entities.entity.twilight.DemonOfDarkness;
import divinerpg.objects.entities.entity.twilight.Densos;
import divinerpg.objects.entities.entity.twilight.EdenCadillion;
import divinerpg.objects.entities.entity.twilight.EdenTomo;
import divinerpg.objects.entities.entity.twilight.EnchantedArcher;
import divinerpg.objects.entities.entity.twilight.EnchantedWarrior;
import divinerpg.objects.entities.entity.twilight.Epiphite;
import divinerpg.objects.entities.entity.twilight.EternalArcher;
import divinerpg.objects.entities.entity.twilight.Greenfeet;
import divinerpg.objects.entities.entity.twilight.Karot;
import divinerpg.objects.entities.entity.twilight.Madivel;
import divinerpg.objects.entities.entity.twilight.Mage;
import divinerpg.objects.entities.entity.twilight.Megalith;
import divinerpg.objects.entities.entity.twilight.MoonWolf;
import divinerpg.objects.entities.entity.twilight.MortumCadillion;
import divinerpg.objects.entities.entity.twilight.Mystic;
import divinerpg.objects.entities.entity.twilight.Reyvor;
import divinerpg.objects.entities.entity.twilight.Samek;
import divinerpg.objects.entities.entity.twilight.SkythernArcher;
import divinerpg.objects.entities.entity.twilight.SkythernFiend;
import divinerpg.objects.entities.entity.twilight.SkythernGolem;
import divinerpg.objects.entities.entity.twilight.Sorcerer;
import divinerpg.objects.entities.entity.twilight.SoulFiend;
import divinerpg.objects.entities.entity.twilight.SoulSpider;
import divinerpg.objects.entities.entity.twilight.SoulStealer;
import divinerpg.objects.entities.entity.twilight.Spellbinder;
import divinerpg.objects.entities.entity.twilight.SunArcher;
import divinerpg.objects.entities.entity.twilight.TwilightArcher;
import divinerpg.objects.entities.entity.twilight.TwilightDemon;
import divinerpg.objects.entities.entity.twilight.Vamacheron;
import divinerpg.objects.entities.entity.twilight.Verek;
import divinerpg.objects.entities.entity.twilight.WeakCori;
import divinerpg.objects.entities.entity.twilight.WildwoodCadillion;
import divinerpg.objects.entities.entity.twilight.WildwoodGolem;
import divinerpg.objects.entities.entity.twilight.WildwoodTomo;
import divinerpg.objects.entities.entity.vanilla.AncientEntity;
import divinerpg.objects.entities.entity.vanilla.AridWarrior;
import divinerpg.objects.entities.entity.vanilla.BrownGrizzle;
import divinerpg.objects.entities.entity.vanilla.CaveCrawler;
import divinerpg.objects.entities.entity.vanilla.Caveclops;
import divinerpg.objects.entities.entity.vanilla.Crab;
import divinerpg.objects.entities.entity.vanilla.Cyclops;
import divinerpg.objects.entities.entity.vanilla.DesertCrawler;
import divinerpg.objects.entities.entity.vanilla.Ehu;
import divinerpg.objects.entities.entity.vanilla.EnderSpider;
import divinerpg.objects.entities.entity.vanilla.EnderTriplets;
import divinerpg.objects.entities.entity.vanilla.EnderWatcher;
import divinerpg.objects.entities.entity.vanilla.EnthralledDramcryx;
import divinerpg.objects.entities.entity.vanilla.Frost;
import divinerpg.objects.entities.entity.vanilla.Glacon;
import divinerpg.objects.entities.entity.vanilla.HellPig;
import divinerpg.objects.entities.entity.vanilla.HellSpider;
import divinerpg.objects.entities.entity.vanilla.Husk;
import divinerpg.objects.entities.entity.vanilla.JackOMan;
import divinerpg.objects.entities.entity.vanilla.JungleBat;
import divinerpg.objects.entities.entity.vanilla.JungleDramcryx;
import divinerpg.objects.entities.entity.vanilla.JungleSpider;
import divinerpg.objects.entities.entity.vanilla.KingCrab;
import divinerpg.objects.entities.entity.vanilla.KingOfScorchers;
import divinerpg.objects.entities.entity.vanilla.Kobblin;
import divinerpg.objects.entities.entity.vanilla.Liopleurodon;
import divinerpg.objects.entities.entity.vanilla.LivestockMerchant;
import divinerpg.objects.entities.entity.vanilla.Miner;
import divinerpg.objects.entities.entity.vanilla.PumpkinSpider;
import divinerpg.objects.entities.entity.vanilla.Rainbour;
import divinerpg.objects.entities.entity.vanilla.Rotatick;
import divinerpg.objects.entities.entity.vanilla.SaguaroWorm;
import divinerpg.objects.entities.entity.vanilla.Scorcher;
import divinerpg.objects.entities.entity.vanilla.Shark;
import divinerpg.objects.entities.entity.vanilla.Smelter;
import divinerpg.objects.entities.entity.vanilla.Snapper;
import divinerpg.objects.entities.entity.vanilla.StoneGolem;
import divinerpg.objects.entities.entity.vanilla.TheEye;
import divinerpg.objects.entities.entity.vanilla.TheGrue;
import divinerpg.objects.entities.entity.vanilla.TheWatcher;
import divinerpg.objects.entities.entity.vanilla.Whale;
import divinerpg.objects.entities.entity.vanilla.WhiteGrizzle;
import divinerpg.objects.entities.entity.vanilla.Wildfire;
import divinerpg.objects.entities.entity.vanilla.ayeraco.AyeracoBlue;
import divinerpg.objects.entities.entity.vanilla.ayeraco.AyeracoGreen;
import divinerpg.objects.entities.entity.vanilla.ayeraco.AyeracoPurple;
import divinerpg.objects.entities.entity.vanilla.ayeraco.AyeracoRed;
import divinerpg.objects.entities.entity.vanilla.ayeraco.AyeracoYellow;
import divinerpg.utils.SpawnEggColors;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModEntities {
	private static int mobID = 500;
	private static int projectileID = 0;
    @SubscribeEvent
    public static void registerEnities(RegistryEvent.Register<EntityEntry> event) {
        IForgeRegistry<EntityEntry> registry = event.getRegistry();

        registry.registerAll(initProjectiles());
        registry.registerAll(initMobs());
    }

    public static EntityEntry buildEntityEntry(Class entityClass, String entityID, SpawnEggColors.Dimension dimension) { 
        SpawnEggColors colors = SpawnEggColors.getColorsForDimension(dimension);
        return EntityEntryBuilder.create().entity(entityClass)
                .id(new ResourceLocation(Reference.MODID, entityID), mobID++).name(Reference.MODID + "." + entityID).tracker(128, 3, true)
                .egg(colors.getPrimaryColor(), colors.getSecondaryColor()).build();
    }

    public static EntityEntry buildProjectileEntry(Class entityClass, String entityID) {
        return EntityEntryBuilder.create().entity(entityClass)
                .id(new ResourceLocation(Reference.MODID, entityID), projectileID++).name(Reference.MODID + "." + entityID)
                .tracker(250, 5, true).build();
    }

    public static EntityEntry[] initMobs() {
        EntityEntry[] divineMobs = {
                // Overworld
                buildEntityEntry(AridWarrior.class, "arid_warrior", OVERWORLD),
                buildEntityEntry(CaveCrawler.class, "cave_crawler", OVERWORLD),
                buildEntityEntry(Caveclops.class, "caveclops", OVERWORLD),
                buildEntityEntry(Crab.class, "crab", OVERWORLD), buildEntityEntry(Cyclops.class, "cyclops", OVERWORLD),
                buildEntityEntry(DesertCrawler.class, "desert_crawler", OVERWORLD),
                buildEntityEntry(Ehu.class, "ehu", OVERWORLD),
                buildEntityEntry(EnthralledDramcryx.class, "enthralled_dramcryx", OVERWORLD),
                buildEntityEntry(Frost.class, "frost", OVERWORLD), buildEntityEntry(Glacon.class, "glacon", OVERWORLD),
                buildEntityEntry(BrownGrizzle.class, "brown_grizzle", OVERWORLD),
                buildEntityEntry(WhiteGrizzle.class, "white_grizzle", OVERWORLD),
                buildEntityEntry(Husk.class, "husk", OVERWORLD),
                buildEntityEntry(JackOMan.class, "jack_o_man", OVERWORLD),
                buildEntityEntry(JungleBat.class, "jungle_bat", OVERWORLD),
                buildEntityEntry(JungleDramcryx.class, "jungle_dramcryx", OVERWORLD),
                buildEntityEntry(JungleSpider.class, "jungle_spider", OVERWORLD),
                buildEntityEntry(KingCrab.class, "king_crab", OVERWORLD),
                buildEntityEntry(Kobblin.class, "kobblin", OVERWORLD),
                buildEntityEntry(Liopleurodon.class, "liopleurodon", OVERWORLD),
                buildEntityEntry(LivestockMerchant.class, "livestock_merchant", OVERWORLD),
                buildEntityEntry(Miner.class, "miner", OVERWORLD),
                buildEntityEntry(PumpkinSpider.class, "pumpkin_spider", OVERWORLD),
                buildEntityEntry(Rainbour.class, "rainbour", OVERWORLD),
                buildEntityEntry(Rotatick.class, "rotatick", OVERWORLD),
                buildEntityEntry(SaguaroWorm.class, "saguaro_worm", OVERWORLD),
                buildEntityEntry(Shark.class, "shark", OVERWORLD),
                buildEntityEntry(Smelter.class, "smelter", OVERWORLD),
                buildEntityEntry(Snapper.class, "snapper", OVERWORLD),
                buildEntityEntry(StoneGolem.class, "stone_golem", OVERWORLD),
                buildEntityEntry(TheEye.class, "the_eye", OVERWORLD),
                buildEntityEntry(TheGrue.class, "the_grue", OVERWORLD),
                buildEntityEntry(Whale.class, "whale", OVERWORLD),

                // Nether
                buildEntityEntry(HellPig.class, "hell_pig", NETHER),
                buildEntityEntry(HellSpider.class, "hell_spider", NETHER),
                buildEntityEntry(Scorcher.class, "scorcher", NETHER),
                buildEntityEntry(Wildfire.class, "wildfire", NETHER),

                // End
                buildEntityEntry(EnderSpider.class, "ender_spider", END),
                buildEntityEntry(EnderTriplets.class, "ender_triplets", END),
                buildEntityEntry(EnderWatcher.class, "ender_watcher", END),

                // Iceika
                buildEntityEntry(Alicanto.class, "alicanto", ICEIKA),
                buildEntityEntry(Fractite.class, "fractite", ICEIKA),
                buildEntityEntry(FrostArcher.class, "frost_archer", ICEIKA),
                buildEntityEntry(Frosty.class, "frosty", ICEIKA), buildEntityEntry(Glacide.class, "glacide", ICEIKA),
                buildEntityEntry(Hastreus.class, "hastreus", ICEIKA), buildEntityEntry(Rollum.class, "rollum", ICEIKA),
                buildEntityEntry(WorkshopMerchant.class, "workshop_merchant", ICEIKA),
                buildEntityEntry(WorkshopTinkerer.class, "workshop_tinkerer", ICEIKA),

                // Eden
                buildEntityEntry(Bunny.class, "bunny", EDEN),
                buildEntityEntry(EdenCadillion.class, "eden_cadillion", EDEN),
                buildEntityEntry(EdenTomo.class, "eden_tomo", EDEN),
                buildEntityEntry(Greenfeet.class, "greenfeet", EDEN), buildEntityEntry(Madivel.class, "madivel", EDEN),
                buildEntityEntry(SunArcher.class, "sun_archer", EDEN),
                buildEntityEntry(WeakCori.class, "weak_cori", EDEN),

                // Wildwood
                buildEntityEntry(Behemoth.class, "behemoth", WILDWOOD),
                buildEntityEntry(Epiphite.class, "epiphite", WILDWOOD), buildEntityEntry(Mage.class, "mage", WILDWOOD),
                buildEntityEntry(MoonWolf.class, "moon_wolf", WILDWOOD),
                buildEntityEntry(Verek.class, "verek", WILDWOOD),
                buildEntityEntry(WildwoodCadillion.class, "wildwood_cadillion", WILDWOOD),
                buildEntityEntry(WildwoodGolem.class, "wildwood_golem", WILDWOOD),
                buildEntityEntry(WildwoodTomo.class, "wildwood_tomo", WILDWOOD),

                // Apalachia
                buildEntityEntry(ApalachiaCadillion.class, "apalachia_cadillion", APALACHIA),
                buildEntityEntry(ApalachiaGolem.class, "apalachia_golem", APALACHIA),
                buildEntityEntry(ApalachiaTomo.class, "apalachia_tomo", APALACHIA),
                buildEntityEntry(EnchantedArcher.class, "enchanted_archer", APALACHIA),
                buildEntityEntry(EnchantedWarrior.class, "enchanted_warrior", APALACHIA),
                buildEntityEntry(Spellbinder.class, "spellbinder", APALACHIA),

                // Skythern
                buildEntityEntry(AdvancedCori.class, "advanced_cori", SKYTHERN),
                buildEntityEntry(Megalith.class, "megalith", SKYTHERN),
                buildEntityEntry(Mystic.class, "mystic", SKYTHERN), buildEntityEntry(Samek.class, "samek", SKYTHERN),
                buildEntityEntry(SkythernArcher.class, "skythern_archer", SKYTHERN),
                buildEntityEntry(SkythernFiend.class, "skythern_fiend", SKYTHERN),
                buildEntityEntry(SkythernGolem.class, "skythern_golem", SKYTHERN),

                // Mortum
                buildEntityEntry(AngryBunny.class, "angry_bunny", MORTUM),
                buildEntityEntry(Basilisk.class, "basilisk", MORTUM),
                buildEntityEntry(DemonOfDarkness.class, "demon_of_darkness", MORTUM),
                buildEntityEntry(MortumCadillion.class, "mortum_cadillion", MORTUM),
                buildEntityEntry(Sorcerer.class, "sorcerer", MORTUM),
                buildEntityEntry(SoulStealer.class, "soul_stealer", MORTUM),
                buildEntityEntry(SoulSpider.class, "soul_spider", MORTUM),
                buildEntityEntry(TwilightArcher.class, "twilight_archer", MORTUM),

                // Arcana
                buildEntityEntry(CaptainMerik.class, "captain_merik", ARCANA),
                buildEntityEntry(Datticon.class, "datticon", ARCANA),
                buildEntityEntry(Deathcryx.class, "deathcryx", ARCANA),
                buildEntityEntry(DeathHound.class, "death_hound", ARCANA),
                buildEntityEntry(DungeonConstructor.class, "dungeon_constructor", ARCANA),
                buildEntityEntry(DungeonDemon.class, "dungeon_demon", ARCANA),
                buildEntityEntry(DungeonPrisoner.class, "dungeon_prisoner", ARCANA),
                buildEntityEntry(Fyracryx.class, "fyracryx", ARCANA), buildEntityEntry(Leorna.class, "leorna", ARCANA),
                buildEntityEntry(LivingStatue.class, "living_statue", ARCANA),
                buildEntityEntry(Paratiku.class, "paratiku", ARCANA),
                buildEntityEntry(Razorback.class, "razorback", ARCANA),
                buildEntityEntry(GolemOfRejuvenation.class, "golem_of_rejuvenation", ARCANA),
                buildEntityEntry(Roamer.class, "roamer", ARCANA), buildEntityEntry(Seimer.class, "seimer", ARCANA),
                buildEntityEntry(LordVatticus.class, "lord_vatticus", ARCANA),
                buildEntityEntry(WarGeneral.class, "war_general", ARCANA),
                buildEntityEntry(Wraith.class, "wraith", ARCANA), buildEntityEntry(Zelus.class, "zelus", ARCANA),

                // Boss
                buildEntityEntry(AncientEntity.class, "ancient_entity", BOSS),
                buildEntityEntry(AyeracoBlue.class, "ayeraco_blue", BOSS),
                buildEntityEntry(AyeracoGreen.class, "ayeraco_green", BOSS),
                buildEntityEntry(AyeracoPurple.class, "ayeraco_purple", BOSS),
                buildEntityEntry(AyeracoRed.class, "ayeraco_red", BOSS),
                buildEntityEntry(AyeracoYellow.class, "ayeraco_yellow", BOSS),
                buildEntityEntry(Densos.class, "densos", BOSS), buildEntityEntry(Dramix.class, "dramix", BOSS),
                buildEntityEntry(EternalArcher.class, "eternal_archer", BOSS),
                buildEntityEntry(Karot.class, "karot", BOSS),
                buildEntityEntry(KingOfScorchers.class, "king_of_scorchers", BOSS),
                buildEntityEntry(Reyvor.class, "reyvor", BOSS), buildEntityEntry(SoulFiend.class, "soul_fiend", BOSS),
                buildEntityEntry(TheWatcher.class, "the_watcher", BOSS),
                buildEntityEntry(TwilightDemon.class, "twilight_demon", BOSS),
                buildEntityEntry(Vamacheron.class, "vamacheron", BOSS),
                buildEntityEntry(Parasecta.class, "parasecta", BOSS)
        };

        return divineMobs;
    }

    public static EntityEntry[] initProjectiles() {
        // Projectiles
        EntityEntry[] divineProjectiles = {buildProjectileEntry(EntityCaveRock.class, "cave_rock"),
                buildProjectileEntry(EntitySerenadeOfDeath.class, "serenade_of_death"),
                buildProjectileEntry(EntitySerenadeOfIce.class, "serenade_of_ice"),
                buildProjectileEntry(EntityEnderTripletsFireball.class, "ender_triplets_fireball"),
                buildProjectileEntry(EntityFractiteShot.class, "fractite_shot"),
                buildProjectileEntry(EntityFrostShot.class, "frost_shot"),
                buildProjectileEntry(EntityFrostCloud.class, "frost_cloud"),
                buildProjectileEntry(EntityKingOfScorchersMeteor.class, "king_of_scorchers_meteor"),
                buildProjectileEntry(EntityKingOfScorchersShot.class, "king_of_scorchers_shot"),
                buildProjectileEntry(EntitySaguaroWormShot.class, "saguaro_worm_shot"),
                buildProjectileEntry(EntityScorcherShot.class, "scorcher_shot"),
                buildProjectileEntry(EntityShuriken.class, "shuriken"),
                buildProjectileEntry(EntitySparkler.class, "sparkler"),
                buildProjectileEntry(EntityWatcherShot.class, "watcher_shot"),
                buildProjectileEntry(EntityVileStorm.class, "vile_storm"),
                buildProjectileEntry(EntitySnowflakeShuriken.class, "snowflake_shuriken"),
                buildProjectileEntry(EntityShooterBullet.class, "shooter_bullet"),
                buildProjectileEntry(EntityParticleBullet.class, "particle_bullet"),
                buildProjectileEntry(EntityColoredBullet.class, "colored_bullet"),
                buildProjectileEntry(EntityCorruptedBullet.class, "corrupted_bullet"),
                buildProjectileEntry(EntitySoundOfMusic.class, "sound_of_music"),
                buildProjectileEntry(EntitySoundOfCarols.class, "sound_of_carols"),
                buildProjectileEntry(EntityDivineArrow.class, "arrow_shot"),
                buildProjectileEntry(EntityCoriShot.class, "cori_shot"),
                buildProjectileEntry(EntityTwilightMageShot.class, "twilight_mage_shot"),
                buildProjectileEntry(EntitySoulFiendShot.class, "soul_fiend_shot"),
                buildProjectileEntry(EntityGrenade.class, "grenade"),
                buildProjectileEntry(EntityAttractor.class, "attractor"),
                buildProjectileEntry(EntityGeneralsStaff.class, "generals_staff"),
                buildProjectileEntry(EntityMeteor.class, "meteor"), buildProjectileEntry(EntityStar.class, "star"),
                buildProjectileEntry(EntityLamona.class, "lamona"),
                buildProjectileEntry(EntityFirefly.class, "firefly"),
                buildProjectileEntry(EntityReflector.class, "reflector"),
                buildProjectileEntry(EntityFyracryxFireball.class, "fyracryx_fireball"),
                buildProjectileEntry(EntityTwilightDemonShot.class, "twilight_demon_shot"),
                buildProjectileEntry(EntityMerikMissile.class, "meriks_missile")};

        if (Config.debug) {
            DivineRPG.logger.info(Reference.MODID + " entities have been loaded");
        }

        return divineProjectiles;
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        // Projectiles
        registerRender(EntityAttractor.class, manager -> new RenderAttractor(manager));
        registerRender(EntityCaveRock.class, manager -> new RenderCaveRock(manager, 1f));
        registerRender(EntityCoriShot.class, manager -> new RenderCoriShot(manager, 1f));
        registerRender(EntityCorruptedBullet.class, manager -> new RenderCorruptedBullet(manager, 1f));
        registerRender(EntityDivineArrow.class, manager -> new RenderDivineArrow(manager));
        registerRender(EntityEnderTripletsFireball.class, manager -> new RenderEnderTripletsFireball(manager, 1f));
        registerRender(EntityFirefly.class, manager -> new RenderFirefly(manager));
        registerRender(EntityFractiteShot.class, manager -> new RenderFractiteShot(manager, 1.0f));
        registerRender(EntityFrostShot.class, manager -> new RenderFrostShot(manager, 0.75f));
        registerRender(EntityFyracryxFireball.class, manager -> new RenderFyracryxFireball(manager));
        registerRender(EntityGeneralsStaff.class, RenderStaff::new);
        registerRender(EntityGrenade.class, manager -> new RenderGrenade(manager));
        registerRender(EntityKingOfScorchersMeteor.class, manager -> new RenderKingofScorchersMeteor(manager, 1f));
        registerRender(EntityKingOfScorchersShot.class, manager -> new RenderKingofScorchersShot(manager, 1f));
        registerRender(EntityLamona.class, manager -> new RenderLamona(manager));
        registerRender(EntityMerikMissile.class, manager -> new RenderMerikMissile(manager));
        registerRender(EntityMeteor.class, manager -> new RenderMeteor(manager));
        registerRender(EntityReflector.class, manager -> new RenderReflector(manager));
        registerRender(EntitySaguaroWormShot.class, manager -> new RenderSaguaroWormShot(manager));
        registerRender(EntityScorcherShot.class, manager -> new RenderScorcherShot(manager, 0.5f));
        registerRender(EntitySerenadeOfDeath.class, manager -> new RenderSerenadeOfDeath(manager, 1f));
        registerRender(EntitySerenadeOfIce.class, manager -> new RenderSerenadeOfIce(manager, 1f));
        registerRender(EntityShooterBullet.class, manager -> new RenderShooterBullet(manager));
        registerRender(EntitySnowflakeShuriken.class, manager -> new RenderSnowShuriken(manager, 1f));
        registerRender(EntitySoundOfCarols.class, manager -> new RenderSoundOfCarols(manager, 1f));
        registerRender(EntitySoundOfMusic.class, manager -> new RenderSoundOfMusic(manager, 1f));
        registerRender(EntitySparkler.class, manager -> new RenderSparkler(manager));
        registerRender(EntityStar.class, manager -> new RenderStar(manager));
        registerRender(EntityVileStorm.class, manager -> new RenderVileStorm(manager, 1f));
        registerRender(EntityWatcherShot.class, manager -> new RenderWatcherShot(manager, 1f));

        registerRender(EntityFrostCloud.class, manager -> new RenderFrostCloud(manager));

        // Vanilla
        registerRender(AncientEntity.class, RenderAncientEntity.FACTORY);
        registerRender(AridWarrior.class, RenderAridWarrior.FACTORY);
        registerRender(AyeracoBlue.class, RenderAyeracoBlue.FACTORY);
        registerRender(AyeracoGreen.class, RenderAyeracoGreen.FACTORY);
        registerRender(AyeracoPurple.class, RenderAyeracoPurple.FACTORY);
        registerRender(AyeracoRed.class, RenderAyerecoRed.FACTORY);
        registerRender(AyeracoYellow.class, RenderAyeracoYellow.FACTORY);
        registerRender(BrownGrizzle.class, RenderBrownGrizzle.FACTORY);
        registerRender(Caveclops.class, RenderCaveclops.FACTORY);
        registerRender(CaveCrawler.class, RenderCaveCrawler.FACTORY);
        registerRender(Crab.class, RenderCrab.FACTORY);
        registerRender(Cyclops.class, RenderCyclops.FACTORY);
        registerRender(DesertCrawler.class, RenderDesertCrawler.FACTORY);
        registerRender(Ehu.class, RenderEhu.FACTORY);
        registerRender(EnderSpider.class, RenderEnderSpider.FACTORY);
        registerRender(EnderTriplets.class, RenderEnderTriplets.FACTORY);
        registerRender(EnderWatcher.class, RenderEnderWatcher.FACTORY);
        registerRender(EnthralledDramcryx.class, RenderEnthralledDramcryx.FACTORY);
        registerRender(Frost.class, RenderFrost.FACTORY);
        registerRender(Glacon.class, RenderGlacon.FACTORY);
        registerRender(HellPig.class, RenderHellPig.FACTORY);
        registerRender(HellSpider.class, RenderHellSpider.FACTORY);
        registerRender(Husk.class, RenderHusk.FACTORY);
        registerRender(JackOMan.class, RenderJackOMan.FACTORY);
        registerRender(JungleBat.class, RenderJungleBat.FACTORY);
        registerRender(JungleDramcryx.class, RenderJungleDramcryx.FACTORY);
        registerRender(JungleSpider.class, RenderJungleSpider.FACTORY);
        registerRender(KingCrab.class, RenderKingCrab.FACTORY);
        registerRender(KingOfScorchers.class, RenderKingOfScorchers.FACTORY);
        registerRender(Kobblin.class, RenderKobblin.FACTORY);
        registerRender(Liopleurodon.class, RenderLiopleurodon.FACTORY);
        registerRender(LivestockMerchant.class, RenderLivestockMerchant.FACTORY);
        registerRender(Miner.class, RenderMiner.FACTORY);
        registerRender(PumpkinSpider.class, RenderPumpkinSpider.FACTORY);
        registerRender(Rainbour.class, RenderRainbour.FACTORY);
        registerRender(Rotatick.class, RenderRotatick.FACTORY);
        registerRender(SaguaroWorm.class, RenderSaguaroWorm.FACTORY);
        registerRender(Scorcher.class, RenderScorcher.FACTORY);
        registerRender(Shark.class, RenderShark.FACTORY);
        registerRender(Smelter.class, RenderSmelter.FACTORY);
        registerRender(Snapper.class, RenderSnapper.FACTORY);
        registerRender(StoneGolem.class, RenderStoneGolem.FACTORY);
        registerRender(TheEye.class, RenderTheEye.FACTORY);
        registerRender(TheGrue.class, RenderTheGrue.FACTORY);
        registerRender(TheWatcher.class, RenderTheWatcher.FACTORY);
        registerRender(Whale.class, RenderWhale.FACTORY);
        registerRender(WhiteGrizzle.class, RenderWhiteGrizzle.FACTORY);
        registerRender(Wildfire.class, RenderWildfire.FACTORY);

        // Iceika
        registerRender(Alicanto.class, RenderAlicanto.FACTORY);
        registerRender(FrostArcher.class, RenderFrostArcher.FACTORY);
        registerRender(Fractite.class, RenderFractite.FACTORY);
        registerRender(Frosty.class, RenderFrosty.FACTORY);
        registerRender(Glacide.class, RenderGlacide.FACTORY);
        registerRender(Hastreus.class, RenderHastreus.FACTORY);
        registerRender(Rollum.class, RenderRollum.FACTORY);
        registerRender(WorkshopTinkerer.class, RenderWorkshopTinkerer.FACTORY);
        registerRender(WorkshopMerchant.class, RenderWorkshopMerchant.FACTORY);

        // Twilight
        registerRender(AdvancedCori.class, RenderAdvancedCori.FACTORY);
        registerRender(AngryBunny.class, RenderAngryBunny.FACTORY);
        registerRender(ApalachiaCadillion.class, RenderApalachiaCadillion.FACTORY);
        registerRender(ApalachiaGolem.class, RenderApalachiaGolem.FACTORY);
        registerRender(ApalachiaTomo.class, RenderApalachiaTomo.FACTORY);
        registerRender(Basilisk.class, RenderBasilisk.FACTORY);
        registerRender(Behemoth.class, RenderBehemoth.FACTORY);
        registerRender(Bunny.class, RenderBunny.FACTORY);
        registerRender(DemonOfDarkness.class, RenderDemonOfDarkness.FACTORY);
        registerRender(Densos.class, RenderDensos.FACTORY);
        registerRender(EdenCadillion.class, RenderEdenCadillion.FACTORY);
        registerRender(EdenTomo.class, RenderEdenTomo.FACTORY);
        registerRender(EnchantedArcher.class, RenderEnchantedArcher.FACTORY);
        registerRender(EnchantedWarrior.class, RenderEnchantedWarrior.FACTORY);
        registerRender(Epiphite.class, RenderEpiphite.FACTORY);
        registerRender(EternalArcher.class, RenderEternalArcher.FACTORY);
        registerRender(Greenfeet.class, RenderGreenfeet.FACTORY);
        registerRender(Karot.class, RenderKarot.FACTORY);
        registerRender(Madivel.class, RenderMadivel.FACTORY);
        registerRender(Mage.class, RenderMage.FACTORY);
        registerRender(Megalith.class, RenderMegalith.FACTORY);
        registerRender(MoonWolf.class, RenderMoonWolf.FACTORY);
        registerRender(MortumCadillion.class, RenderMortumCadillion.FACTORY);
        registerRender(Mystic.class, RenderMystic.FACTORY);
        registerRender(Reyvor.class, RenderReyvor.FACTORY);
        registerRender(Samek.class, RenderSamek.FACTORY);
        registerRender(SkythernArcher.class, RenderSkythernArcher.FACTORY);
        registerRender(SkythernFiend.class, RenderSkythernFiend.FACTORY);
        registerRender(SkythernGolem.class, RenderSkythernGolem.FACTORY);
        registerRender(Sorcerer.class, RenderSorcerer.FACTORY);
        registerRender(SoulFiend.class, RenderSoulFiend.FACTORY);
        registerRender(SoulSpider.class, RenderSoulSpider.FACTORY);
        registerRender(SoulStealer.class, RenderSoulStealer.FACTORY);
        registerRender(Spellbinder.class, RenderSpellbinder.FACTORY);
        registerRender(SunArcher.class, RenderSunArcher.FACTORY);
        registerRender(TwilightArcher.class, RenderTwilightArcher.FACTORY);
        registerRender(TwilightDemon.class, RenderTwilightDemon.FACTORY);
        registerRender(Vamacheron.class, RenderVamacheron.FACTORY);
        registerRender(Verek.class, RenderVerek.FACTORY);
        registerRender(WeakCori.class, RenderWeakCori.FACTORY);
        registerRender(WildwoodCadillion.class, RenderWildwoodCadillion.FACTORY);
        registerRender(WildwoodGolem.class, RenderWildwoodGolem.FACTORY);
        registerRender(WildwoodTomo.class, RenderWildwoodTomo.FACTORY);

        // Arcana
        registerRender(CaptainMerik.class, RenderCaptainMerik.FACTORY);
        registerRender(Datticon.class, RenderDatticon.FACTORY);
        registerRender(Deathcryx.class, RenderDeathcryx.FACTORY);
        registerRender(DeathHound.class, RenderDeathHound.FACTORY);
        registerRender(Dramix.class, RenderDramix.FACTORY);
        registerRender(DungeonConstructor.class, RenderDungeonConstructor.FACTORY);
        registerRender(DungeonDemon.class, RenderDungeonDemon.FACTORY);
        registerRender(DungeonPrisoner.class, RenderDungeonPrisoner.FACTORY);
        registerRender(Fyracryx.class, RenderFyracryx.FACTORY);
        registerRender(GolemOfRejuvenation.class, RenderGolemOfRejuvenation.FACTORY);
        registerRender(Leorna.class, RenderLeorna.FACTORY);
        registerRender(LivingStatue.class, RenderLivingStatue.FACTORY);
        registerRender(LordVatticus.class, RenderLordVatticus.FACTORY);
        registerRender(Parasecta.class, RenderParasecta.FACTORY);
        registerRender(Paratiku.class, RenderParatiku.FACTORY);
        registerRender(Razorback.class, RenderRazorback.FACTORY);
        registerRender(Roamer.class, RenderRoamer.FACTORY);
        registerRender(Seimer.class, RenderSeimer.FACTORY);
        registerRender(WarGeneral.class, RenderWarGeneral.FACTORY);
        registerRender(Wraith.class, RenderWraith.FACTORY);
        registerRender(Zelus.class, RenderZelus.FACTORY);
    }

    /**
     * Private helper method that simply calls the rendering registry method.
     * No functional benefit, exists solely to make rendering registry code section less of an eyesore.
     *
     * @param entityClass   the entity class of type T
     * @param renderFactory a render factory for the entity
     * @param <T>           generic class to ensure it extends entity
     */
    private static <T extends Entity> void registerRender(Class<T> entityClass, IRenderFactory<? super T> renderFactory) {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, renderFactory);
    }
}