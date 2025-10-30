package com.ast173.templatemod.item;

import com.ast173.templatemod.Templatemod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Templatemod.MODID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB =
            CREATIVE_MODE_TAB.register("aquamarine",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.CUSTOM_ITEM.get()))
                            .title(Component.translatable("creativetab.templatemod.templatemod_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.CUSTOM_ITEM.get());

                                output.accept(ModItems.OCEAN_SWORD.get());
                                output.accept(ModItems.OCEAN_PICKAXE.get());
                                output.accept(ModItems.OCEAN_AXE.get());
                                output.accept(ModItems.OCEAN_SHOVEL.get());
                                output.accept(ModItems.OCEAN_HOE.get());

                                output.accept(ModItems.OCEAN_HELMET.get());
                                output.accept(ModItems.OCEAN_CHESTPLATE.get());
                                output.accept(ModItems.OCEAN_LEGGINGS.get());
                                output.accept(ModItems.OCEAN_BOOTS.get());
                            })
                            .build());

    public static void register(BusGroup eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}