package com.ast173.templatemod.item.templates;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public class SwordItemTemplate extends Item {
    public SwordItemTemplate(ToolMaterial material, float damageModifier, String resourceID) {
        this(material, damageModifier, -2.4f, resourceID);
    }

    public SwordItemTemplate(ToolMaterial material, float damageModifier, float attackSpeedModifier, String recourseID) {
        super(new Properties()
                .sword(material, damageModifier, attackSpeedModifier)
                .useItemDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(recourseID))));
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(Enchantments.SHARPNESS)
                || enchantment.is(Enchantments.SMITE)
                || enchantment.is(Enchantments.BANE_OF_ARTHROPODS)
                || enchantment.is(Enchantments.LOOTING)
                || enchantment.is(Enchantments.FIRE_ASPECT)
                || enchantment.is(Enchantments.SWEEPING_EDGE)
                || enchantment.is(Enchantments.KNOCKBACK)
                || enchantment.is(Enchantments.UNBREAKING)
                || enchantment.is(Enchantments.MENDING)
                || enchantment.is(Enchantments.VANISHING_CURSE);
    }
}
