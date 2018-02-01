package com.servegame.bl4de.PlayGround.proxy;

import com.servegame.bl4de.PlayGround.util.Initializable;
import com.servegame.bl4de.PlayGround.util.RegistryHandler;
import com.sun.istack.internal.NotNull;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * File: CommonProxy.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public abstract class CommonProxy implements Initializable {

    public static final String CLIENT = "com.servegame.bl4de.PlayGround.proxy.ClientProxy";
    public static final String SERVER = "com.servegame.bl4de.PlayGround.proxy.DedicatedServerProxy";

    protected long serverTickCount = 0;
    protected long clientTickCount = 0;
    protected final TickTimer tickTimer = new TickTimer();

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

    /**
     * Is this a dedicated server?
     * @return True if this is {@link DedicatedServerProxy}, false otherwise
     */
    public abstract boolean isDedicatedServer();

    protected abstract void onTick();

    public final class TickTimer {
        @SubscribeEvent
        public void onTick(@NotNull TickEvent.ServerTickEvent event){
            if (event.phase == TickEvent.Phase.END){
                CommonProxy.this.onTick();
            }
        }

        @SubscribeEvent
        public void onTick(@NotNull TickEvent.ClientTickEvent event){
            if (event.phase == TickEvent.Phase.END){
                CommonProxy.this.onTick();
            }
        }
    }
}
