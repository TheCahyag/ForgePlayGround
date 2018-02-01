package com.servegame.bl4de.PlayGround.init;

import com.servegame.bl4de.PlayGround.objects.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * File: ItemInit.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item PG_ITEM = new ItemBase("tutorial_item");
}
