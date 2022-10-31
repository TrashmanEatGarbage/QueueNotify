package me.trashman.queuenotify.queuenotify;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;


public class Main {
    public static Minecraft mc = Minecraft.getMinecraft();
    public static String server = mc.getCurrentServerData().serverIP;
    public static boolean sent = false;

    public static void onTick() {
        try{
            Whandler.sendMessage("ticked");
        }catch (Exception e){
            Whandler.sendMessage(e + "fucked");
        }
    }



    public static void onChatMessage(String message){
        if (message != "You can purchase priority queue status to join the server faster, visit shop.2b2t.org"){
            Whandler.sendMessage(message);
        }

    }
}
