package com.servegame.bl4de.PlayGround.proxy;

import com.servegame.bl4de.PlayGround.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * File: ClientProxy.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void init(FMLPostInitializationEvent event) {

    }

    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));

    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }
}
