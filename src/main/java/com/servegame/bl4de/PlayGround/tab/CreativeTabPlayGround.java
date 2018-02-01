package com.servegame.bl4de.PlayGround.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * File: CreativeTabPlayGround.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class CreativeTabPlayGround extends CreativeTabs {

    public CreativeTabPlayGround(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.BAKED_POTATO);
    }
}
