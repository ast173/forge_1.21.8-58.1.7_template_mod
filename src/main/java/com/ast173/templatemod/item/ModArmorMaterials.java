package com.ast173.templatemod.item;

import com.google.common.collect.Maps;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public interface ModArmorMaterials {
    ArmorMaterial OCEAN = new ArmorMaterial(35, makeDefense(3, 6, 8, 3, 11), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ItemTags.REPAIRS_DIAMOND_ARMOR, EquipmentAssets.DIAMOND);

    private static Map<ArmorType, Integer> makeDefense(int p_396353_, int p_395360_, int p_393033_, int p_393582_, int p_396462_) {
        return Maps.newEnumMap(Map.of(ArmorType.BOOTS, p_396353_, ArmorType.LEGGINGS, p_395360_, ArmorType.CHESTPLATE, p_393033_, ArmorType.HELMET, p_393582_, ArmorType.BODY, p_396462_));
    }
}