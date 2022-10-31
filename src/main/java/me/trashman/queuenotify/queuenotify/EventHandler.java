package me.trashman.queuenotify.queuenotify;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class EventHandler {


    @SubscribeEvent
    public static void onTick(TickEvent.ClientTickEvent event) {
        Main.onTick();
    }

    @SubscribeEvent
    public static void onClientDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {

    }

    @SubscribeEvent
    public void onRecieveChatMessage(ClientChatReceivedEvent event) {
        Main.onChatMessage(event.getMessage().getUnformattedText());
    }

}
