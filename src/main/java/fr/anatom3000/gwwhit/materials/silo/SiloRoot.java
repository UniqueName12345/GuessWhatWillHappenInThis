package fr.anatom3000.gwwhit.materials.silo;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorMaterial;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
public class SiloRoot  {
public static final Silo SILO = new Silo();
public static final SiloBlock SILO_BLOCK = new SiloBlock();
public static final SiloOre SILO_ORE = new SiloOre();
public static final ArmorMaterial siloArmorMaterial = new SiloArmorMaterial();
public static final SiloHelmet SILO_HELMET = new SiloHelmet(siloArmorMaterial);
public static final SiloChestplate SILO_CHESTPLATE = new SiloChestplate(siloArmorMaterial);
public static final SiloLeggings SILO_LEGGINGS = new SiloLeggings(siloArmorMaterial);
public static final SiloBoots SILO_BOOTS = new SiloBoots(siloArmorMaterial);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","silo"),SILO);
FuelRegistry.INSTANCE.add(SILO, 61);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "silo_block"), SILO_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "silo_block"), new BlockItem(SILO_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "silo_ore"), SILO_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "silo_ore"), new BlockItem(SILO_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","silo_helmet"),SILO_HELMET);
Registry.register(Registry.ITEM, new Identifier("gwwhit","silo_chestplate"),SILO_CHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","silo_leggings"),SILO_LEGGINGS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","silo_boots"),SILO_BOOTS);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_silo"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}