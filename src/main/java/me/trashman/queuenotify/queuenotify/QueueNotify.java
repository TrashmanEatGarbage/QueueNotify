package me.trashman.queuenotify.queuenotify;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;


@Mod(
        modid = QueueNotify.MOD_ID,
        name = QueueNotify.MOD_NAME,
        version = QueueNotify.VERSION
)
public class QueueNotify {

    public static final String MOD_ID = "queuenotify";
    public static final String MOD_NAME = "QueueNotify";
    public static final String VERSION = "0.0.1";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static QueueNotify INSTANCE;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        Whandler.sendMessage("mod booted");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }


    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }


}


