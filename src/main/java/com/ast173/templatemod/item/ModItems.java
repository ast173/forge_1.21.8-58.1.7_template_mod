package com.ast173.templatemod.item;

import com.ast173.templatemod.Templatemod;
import com.ast173.templatemod.item.templates.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Templatemod.MODID);

    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("templatemod:custom_item")))));

    public static final RegistryObject<Item> OCEAN_SWORD = ITEMS.register("ocean_sword",
            () -> new SwordItemTemplate(ModToolMaterial.OCEAN, 3, "modmod:ocean_sword"));
    public static final RegistryObject<Item> OCEAN_PICKAXE = ITEMS.register("ocean_pickaxe",
            () -> new PickaxeItemTemplate(ModToolMaterial.OCEAN, 1, "modmod:ocean_pickaxe"));
    public static final RegistryObject<Item> OCEAN_AXE = ITEMS.register("ocean_axe",
            () -> new AxeItemTemplate(ModToolMaterial.OCEAN, 5, "modmod:ocean_axe"));
    public static final RegistryObject<Item> OCEAN_SHOVEL = ITEMS.register("ocean_shovel",
            () -> new ShovelItemTemplate(ModToolMaterial.OCEAN, 1.5f, "modmod:ocean_shovel"));
    public static final RegistryObject<Item> OCEAN_HOE = ITEMS.register("ocean_hoe",
            () -> new HoeItemTemplate(ModToolMaterial.OCEAN, -3f, "modmod:ocean_hoe"));

    public static final RegistryObject<Item> OCEAN_HELMET = ITEMS.register("ocean_helmet",
            () -> new HelmetItemTemplate(ModArmorMaterials.OCEAN, "modmod:ocean_helmet"));
    public static final RegistryObject<Item> OCEAN_CHESTPLATE = ITEMS.register("ocean_chestplate",
            () -> new ChestplateItemTemplate(ModArmorMaterials.OCEAN, "modmod:ocean_chestplate"));
    public static final RegistryObject<Item> OCEAN_LEGGINGS = ITEMS.register("ocean_leggings",
            () -> new LeggingsItemTemplate(ModArmorMaterials.OCEAN, "modmod:ocean_leggings"));
    public static final RegistryObject<Item> OCEAN_BOOTS = ITEMS.register("ocean_boots",
            () -> new BootsItemTemplate(ModArmorMaterials.OCEAN, "modmod:ocean_boots"));
}