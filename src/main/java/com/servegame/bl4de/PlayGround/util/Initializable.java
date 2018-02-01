package com.servegame.bl4de.PlayGround.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * File: Initializable.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public interface Initializable {

    default void init(FMLPreInitializationEvent event){

    }

    default void init(FMLInitializationEvent event){

    }

    default void init(FMLPostInitializationEvent event){

    }
}
