package me.foo.lizardclient;

import org.apache.logging.log4j.Logger;

import me.foo.lizardclient.module.ModuleManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LizardClient.MODID, name = LizardClient.NAME, version = LizardClient.VERSION)
public class LizardClient
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";
    
    public static ModuleManager moduleManager;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Initializing client");
        
        moduleManager = new ModuleManager();
    }
}
