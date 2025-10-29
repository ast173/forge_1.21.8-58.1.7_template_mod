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

public class ShovelItemTemplate extends Item {
    public ShovelItemTemplate(ToolMaterial material, float damageModifier, String recourseID) {
        this(material, damageModifier, -3f, recourseID);
    }

    public ShovelItemTemplate(ToolMaterial material, float damageModifier, float attackSpeedModifier, String resourceID) {
        super(new Properties()
                .shovel(material, damageModifier, attackSpeedModifier)
                .useItemDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(resourceID))));
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(Enchantments.EFFICIENCY)
                || enchantment.is(Enchantments.SILK_TOUCH)
                || enchantment.is(Enchantments.FORTUNE)
                || enchantment.is(Enchantments.UNBREAKING)
                || enchantment.is(Enchantments.MENDING)
                || enchantment.is(Enchantments.VANISHING_CURSE);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }
}