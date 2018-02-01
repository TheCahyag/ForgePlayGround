package com.servegame.bl4de.PlayGround.util;

import com.servegame.bl4de.PlayGround.init.ItemInit;
import com.servegame.bl4de.PlayGround.objects.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * File: RegistryHandler.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item :
                ItemInit.ITEMS) {
            if (item instanceof ItemBase) {
                ((ItemBase) item).registerModels();
            }
        }
    }


}
