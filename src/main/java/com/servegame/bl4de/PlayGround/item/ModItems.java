package com.servegame.bl4de.PlayGround.item;

import com.servegame.bl4de.PlayGround.PlayGround;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * File: ModItems.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class ModItems {
    public static Item pgItem;

    public static void preInit(){
        pgItem = new ItemPlayGroundItem("tutorial_item");
    }

    public static void registerItems(){
        ForgeRegistries.ITEMS.register(pgItem);

    }

    public static void registerRenders(){
        registerRender(pgItem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item,
                0,
                new ModelResourceLocation(PlayGround.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory")
        );

    }
}
