package me.trashman.queuenotify.queuenotify;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;


public class Main {
    public static String server = Minecraft.getMinecraft().getCurrentServerData().serverIP;

    public static void onLogin() {
        if (server == "2b2t.org" || server == "test.2b2t.org" ){
            Whandler.sendMessage("joined 2b2t");

        }
    }

    public static void onChatmessage(ClientChatReceivedEvent event){
        String message = event.getMessage().getUnformattedText();
        Whandler.sendMessage(message);

    }
}
