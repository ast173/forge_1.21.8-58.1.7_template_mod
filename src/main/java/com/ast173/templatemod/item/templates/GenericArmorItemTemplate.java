package com.ast173.templatemod.item.templates;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class GenericArmorItemTemplate extends Item {
    public GenericArmorItemTemplate(ArmorMaterial material, ArmorType armorType, String resourceID) {
        super(new Properties()
                .humanoidArmor(material, armorType)
                .useItemDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(resourceID))));
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(Enchantments.PROTECTION)
                || enchantment.is(Enchantments.PROJECTILE_PROTECTION)
                || enchantment.is(Enchantments.FIRE_PROTECTION)
                || enchantment.is(Enchantments.BLAST_PROTECTION)
                || enchantment.is(Enchantments.THORNS)
                || enchantment.is(Enchantments.UNBREAKING)
                || enchantment.is(Enchantments.MENDING)
                || enchantment.is(Enchantments.VANISHING_CURSE)
                || enchantment.is(Enchantments.BINDING_CURSE);
    }
}