package com.servegame.bl4de.PlayGround;

import com.servegame.bl4de.PlayGround.proxy.CommonProxy;
import com.servegame.bl4de.PlayGround.tab.CreativeTabPlayGround;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PlayGround.MODID, name = PlayGround.NAME, version = PlayGround.VERSION)
public class PlayGround {
    public static final String MODID = "playground";
    public static final String NAME = "PlayGround";
    public static final String VERSION = "0.0.0";

    public static Logger logger;

    @SidedProxy(clientSide = CommonProxy.CLIENT, serverSide = CommonProxy.SERVER)
    public static CommonProxy proxy;

    @Mod.Instance(value = PlayGround.MODID)
    public static PlayGround instance;

    public static CreativeTabPlayGround CREATIVETAB;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CREATIVETAB = new CreativeTabPlayGround(CreativeTabs.getNextID(), "tab_playground");
        proxy.init(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.init(event);
    }

    /**
     * Prepend the name with the mod ID, suitable for ResourceLocations such as textures.
     * @param name - name of the block
     * @return eg "playground:myblockname"
     */
    public static String prependModID(String name) {
        return MODID + ":" + name;
    }
}
