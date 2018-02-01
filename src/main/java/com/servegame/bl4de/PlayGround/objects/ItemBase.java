package com.servegame.bl4de.PlayGround.objects;

import com.servegame.bl4de.PlayGround.PlayGround;
import com.servegame.bl4de.PlayGround.init.ItemInit;
import net.minecraft.item.Item;

/**
 * File: ItemBase.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class ItemBase extends Item {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PlayGround.CREATIVETAB);

        ItemInit.ITEMS.add(this);
    }

    public void registerModels(){
        PlayGround.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
