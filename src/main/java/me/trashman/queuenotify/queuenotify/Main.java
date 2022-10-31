package me.trashman.queuenotify.queuenotify;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;


public class Main {
    public static Minecraft mc = Minecraft.getMinecraft();
    public static String server = mc.getCurrentServerData().serverIP;
    public static boolean sent = false;

    public static void onTick() {
        Whandler.sendMessage("joined:" + server);
        sent = true;
    }

    public static void onLogout(){
        sent = false;
    }

    public static void onChatMessage(ClientChatReceivedEvent event){
        String message = event.getMessage().getUnformattedText();
        if (message != "You can purchase priority queue status to join the server faster, visit shop.2b2t.org"){
            Whandler.sendMessage(message);
        }

    }
}
