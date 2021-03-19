package fallondo.better.ores;

import fallondo.better.ores.armor.*;
import fallondo.better.ores.blocks.*;
import fallondo.better.ores.items.*;
import fallondo.better.ores.items.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
import net.minecraft.world.gen.feature.*;

public class BetterOres implements ModInitializer {

    // Emerald Armor
    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new EmeraldArmorMaterial();

    public static final Item EMERALD_MATERIAL_HELMET = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD,
            new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_MATERIAL_CHESTPLATE = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.CHEST,
            new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_MATERIAL_LEGGINGS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS,
            new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_MATERIAL_BOOTS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET,
            new Item.Settings().group(ItemGroup.COMBAT));

    // Emerald Tools
    public static final ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 6, -2.4F,
            new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem EMERALD_AXE = new CustomAxeItem(EmeraldToolMaterial.INSTANCE, 7, -3.0F,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem EMERALD_PICKAXE = new CustomPickaxeItem(EmeraldToolMaterial.INSTANCE, 3, -2.6F,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 3, -2.6F,
            new Item.Settings().group(ItemGroup.TOOLS));

	// Ruby
	public static final Item RUBY = new Ruby(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block RUBY_BLOCK = new RubyBlock();
	public static final Block RUBY_ORE = new RubyOre();

	// Ruby Armor
	public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new RubyArmorMaterial();

	public static final Item RUBY_MATERIAL_HELMET = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item RUBY_MATERIAL_CHESTPLATE = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item RUBY_MATERIAL_LEGGINGS = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item RUBY_MATERIAL_BOOTS = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	// Ruby Tools
	public static final ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE, 7, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem RUBY_AXE = new CustomAxeItem(RubyToolMaterial.INSTANCE, 10, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem RUBY_PICKAXE = new CustomPickaxeItem(RubyToolMaterial.INSTANCE, 3, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE, 3, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));

	// Painite
	public static final Item PAINITE = new Painite(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Item PAINITE_INGOT = new PainiteIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block PAINITE_ORE = new PainiteOre();

	// Mithril
	public static final Item MITHRIL_INGOT = new MithrilIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block MITHRIL_BLOCK = new MithrilBlock();
	public static final Block MITHRIL_ORE = new MithrilOre();

	// Mithril Tools
	public static final ToolItem MITHRIL_SWORD = new SwordItem(MithrilToolMaterial.INSTANCE, 5, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem MITHRIL_AXE = new CustomAxeItem(MithrilToolMaterial.INSTANCE, 8, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem MITHRIL_PICKAXE = new CustomPickaxeItem(MithrilToolMaterial.INSTANCE, 2, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem MITHRIL_SHOVEL = new ShovelItem(MithrilToolMaterial.INSTANCE, 2, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));

	// Mithril Armor
	public static final ArmorMaterial MITHRIL_ARMOR_MATERIAL = new MithrilArmorMaterial();

	public static final Item MITHRIL_MATERIAL_HELMET = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_MATERIAL_CHESTPLATE = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_MATERIAL_LEGGINGS = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_MATERIAL_BOOTS = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	// Enderite
	// public static final Item ENDERITE_INGOT = new EnderiteIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Item ENDERITE_SCRAP = new EnderiteScrap(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Block ENDERITE_ORE = new EnderiteOre();

	// Topaz
    public static final Item TOPAZ = new Topaz(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Block TOPAZ_BLOCK = new TopazBlock();
    public static final Block TOPAZ_ORE = new TopazOre();

    // Topaz Tools
	public static final ToolItem TOPAZ_SWORD = new SwordItem(TopazToolMaterial.INSTANCE, 7, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem TOPAZ_AXE = new CustomAxeItem(TopazToolMaterial.INSTANCE, 8, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem TOPAZ_PICKAXE = new CustomPickaxeItem(TopazToolMaterial.INSTANCE, 3, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem TOPAZ_SHOVEL = new ShovelItem(TopazToolMaterial.INSTANCE, 3, -2.6F,
			new Item.Settings().group(ItemGroup.TOOLS));

	// Topaz Armor
	public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new TopazArmorMaterial();

	public static final Item TOPAZ_MATERIAL_HELMET = new ArmorItem(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item TOPAZ_MATERIAL_CHESTPLATE = new ArmorItem(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item TOPAZ_MATERIAL_LEGGINGS = new ArmorItem(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item TOPAZ_MATERIAL_BOOTS = new ArmorItem(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	// Copper
	//public static final Item COPPER_INGOT = new CopperIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Block COPPER_ORE = new CopperOre();

	// Tin
	//public static final Item TIN_INGOT = new TinIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Block TIN_ORE = new TinOre();

	// Amethyst
	//public static final Item AMETHYST_SHARD = new AmethystShard(new Item.Settings().group(ItemGroup.MATERIALS));

	// Silver
	//public static final Item SILVER_INGOT = new SilverIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	//public static final Block SILVER_ORE = new SilverOre();

	// Carbon
	public static final Item CARBON = new Carbon(new Item.Settings().group(ItemGroup.MATERIALS));

	// Steel
	public static final Item STEEL_INGOT = new SteelIngot(new Item.Settings().group(ItemGroup.MATERIALS));

	// Ametrine
	public static final Item AMETRINE_SHARDS = new AmetrineShards(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block AMETRINE_ORE = new AmetrineOre();
	public static final Block AMETRINE_BLOCK = new AmetrineBlock();
	public static final Block AMETRINE_PILLAR = new AmetrinePillar();
	public static final Block AMETRINE_SLAB = new AmetrineSlab();
	public static final Block AMETRINE_STAIRS = new AmetrineStairs();
	public static final Block CHISELED_AMETRINE_BLOCK = new ChiseledAmetrineBlock();
	public static final Block SMOOTH_AMETRINE_BLOCK = new SmoothAmetrineBlock();

	// Citrine
	public static final Item CITRINE_SHARD = new CitrineShard(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block CITRINE_ORE = new CitrineOre();
	public static final Block CITRINE_BLOCK = new CitrineBlock();
	public static final Block CITRINE_PILLAR = new CitrinePillar();
	public static final Block CITRINE_SLAB = new CitrineSlab();
	public static final Block CITRINE_STAIRS = new CitrineStairs();
	public static final Block SMOOTH_CITRINE_BLOCK = new SmoothCitrineBlock();

	// Prasiolite
	public static final Item PRASIOLITE_SHARDS = new PrasioliteShards(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block PRASIOLITE_ORE = new PrasioliteOre();
	public static final Block PRASIOLITE_BLOCK = new PrasioliteBlock();
	public static final Block PRASIOLITE_PILLAR = new PrasiolitePillar();
	public static final Block PRASIOLITE_SLAB = new PrasioliteSlab();
	public static final Block PRASIOLITE_STAIRS = new PrasioliteStairs();
	public static final Block CHISELED_PRASIOLITE_BLOCK = new ChiseledPrasioliteBlock();
	public static final Block SMOOTH_PRASIOLITE_BLOCK = new SmoothPrasioliteBlock();

	@Override
	public void onInitialize() {

	    // Emerald Armor
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_material_helmet"),
                EMERALD_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_material_chestplate"),
                EMERALD_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_material_leggings"),
                EMERALD_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_material_boots"),
                EMERALD_MATERIAL_BOOTS);

        // Emerald Tools
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("betterores", "emerald_shovel"), EMERALD_SHOVEL);

    	// Ruby
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby"), RUBY);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ruby_block"), RUBY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_block"),
				new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ruby_ore"), RUBY_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_ore"),
				new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Ruby Armor
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_material_helmet"),
				RUBY_MATERIAL_HELMET);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_material_chestplate"),
				RUBY_MATERIAL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_material_leggings"),
				RUBY_MATERIAL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_material_boots"),
				RUBY_MATERIAL_BOOTS);

		// Ruby Tools
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_sword"), RUBY_SWORD);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_axe"), RUBY_AXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_pickaxe"), RUBY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ruby_shovel"), RUBY_SHOVEL);

		// Painite
		Registry.register(Registry.ITEM, new Identifier("betterores", "painite"), PAINITE);
		// Registry.register(Registry.ITEM, new Identifier("betterores", "painite_ingot"), PAINITE_INGOT);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "painite_ore"), PAINITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "painite_ore"), new BlockItem(PAINITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mithril
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_ingot"), MITHRIL_INGOT);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "mithril_ore"), MITHRIL_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_ore"), new BlockItem(MITHRIL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "mithril_block"), MITHRIL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_block"), new BlockItem(MITHRIL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mithril Tools
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_sword"), MITHRIL_SWORD);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_axe"), MITHRIL_AXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_pickaxe"), MITHRIL_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_shovel"), MITHRIL_SHOVEL);

		// Mithril Armor
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_material_helmet"),
				MITHRIL_MATERIAL_HELMET);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_material_chestplate"),
				MITHRIL_MATERIAL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_material_leggings"),
				MITHRIL_MATERIAL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "mithril_material_boots"),
				MITHRIL_MATERIAL_BOOTS);

		// Enderite
		//Registry.register(Registry.ITEM, new Identifier("betterores", "enderite_ingot"), ENDERITE_INGOT);
		//Registry.register(Registry.BLOCK, new Identifier("betterores", "enderite_ore"), ENDERITE_ORE);
		//Registry.register(Registry.ITEM, new Identifier("betterores", "enderite_ore"), new BlockItem(ENDERITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		//Registry.register(Registry.ITEM, new Identifier("betterores", "enderite_scrap"), ENDERITE_SCRAP);

		// Topaz
        Registry.register(Registry.ITEM, new Identifier("betterores", "topaz"), TOPAZ);
        Registry.register(Registry.BLOCK, new Identifier("betterores", "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_block"), new BlockItem(TOPAZ_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("betterores", "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_ore"), new BlockItem(TOPAZ_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        // Topaz Tools
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_sword"), TOPAZ_SWORD);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_axe"), TOPAZ_AXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_pickaxe"), TOPAZ_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_shovel"), TOPAZ_SHOVEL);

		// Topaz Armor
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_material_helmet"),
				TOPAZ_MATERIAL_HELMET);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_material_chestplate"),
				TOPAZ_MATERIAL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_material_leggings"),
				TOPAZ_MATERIAL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "topaz_material_boots"),
				TOPAZ_MATERIAL_BOOTS);

		// Copper
		//Registry.register(Registry.ITEM, new Identifier("betterores", "copper_ingot"), COPPER_INGOT);

		// Tin
		//Registry.register(Registry.ITEM, new Identifier("betterores", "tin_ingot"), TIN_INGOT);

		// Amethyst
		//Registry.register(Registry.ITEM, new Identifier("betterores", "amethyst_shard"), AMETHYST_SHARD);

		// Silver
		//Registry.register(Registry.ITEM, new Identifier("betterores", "silver_ingot"), SILVER_INGOT);

		// Carbon
		Registry.register(Registry.ITEM, new Identifier("betterores", "carbon"), CARBON);

		// Steel
		Registry.register(Registry.ITEM, new Identifier("betterores", "steel_ingot"), STEEL_INGOT);

		// Ametrine
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_shards"), AMETRINE_SHARDS);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ametrine_ore"), AMETRINE_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_ore"), new BlockItem(AMETRINE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ametrine_block"), AMETRINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_block"), new BlockItem(AMETRINE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ametrine_pillar"), AMETRINE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_pillar"), new BlockItem(AMETRINE_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ametrine_slab"), AMETRINE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_slab"), new BlockItem(AMETRINE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "ametrine_stairs"), AMETRINE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "ametrine_stairs"), new BlockItem(AMETRINE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "chiseled_ametrine_block"), CHISELED_AMETRINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "chiseled_ametrine_block"), new BlockItem(CHISELED_AMETRINE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "smooth_ametrine_block"), SMOOTH_AMETRINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "smooth_ametrine_block"), new BlockItem(SMOOTH_AMETRINE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Citrine
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_shard"), CITRINE_SHARD);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "citrine_ore"), CITRINE_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_ore"), new BlockItem(CITRINE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "citrine_block"), CITRINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_block"), new BlockItem(CITRINE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "citrine_pillar"), CITRINE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_pillar"), new BlockItem(CITRINE_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "citrine_slab"), CITRINE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_slab"), new BlockItem(CITRINE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "citrine_stairs"), CITRINE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "citrine_stairs"), new BlockItem(CITRINE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "smooth_citrine_block"), SMOOTH_CITRINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "smooth_citrine_block"), new BlockItem(SMOOTH_CITRINE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Prasiolite
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_shards"), PRASIOLITE_SHARDS);
		Registry.register(Registry.BLOCK, new Identifier("betterores", "prasiolite_ore"), PRASIOLITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_ore"), new BlockItem(PRASIOLITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "prasiolite_block"), PRASIOLITE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_block"), new BlockItem(PRASIOLITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "prasiolite_pillar"), PRASIOLITE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_pillar"), new BlockItem(PRASIOLITE_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "prasiolite_slab"), PRASIOLITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_slab"), new BlockItem(PRASIOLITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "prasiolite_stairs"), PRASIOLITE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("betterores", "prasiolite_stairs"), new BlockItem(PRASIOLITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "chiseled_prasiolite_block"), CHISELED_PRASIOLITE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "chiseled_prasiolite_block"), new BlockItem(CHISELED_PRASIOLITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("betterores", "smooth_prasiolite_block"), SMOOTH_PRASIOLITE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("betterores", "smooth_prasiolite_block"), new BlockItem(SMOOTH_PRASIOLITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_ruby"));
		RegistryKey<ConfiguredFeature<?, ?>> orePainiteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_painite"));
		RegistryKey<ConfiguredFeature<?, ?>> oreMithrilOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_mithril"));
		RegistryKey<ConfiguredFeature<?, ?>> oreTopazOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_topaz"));
		RegistryKey<ConfiguredFeature<?, ?>> oreAmetrineNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_ametrine"));
		RegistryKey<ConfiguredFeature<?, ?>> oreCitrineNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_citrine"));
		RegistryKey<ConfiguredFeature<?, ?>> orePrasioliteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("betterores", "ore_prasiolite"));
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				oreRubyOverworld);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				orePainiteOverworld);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				oreMithrilOverworld);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				oreTopazOverworld);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
				oreAmetrineNether);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
				oreCitrineNether);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
				orePrasioliteNether);
	}
}
