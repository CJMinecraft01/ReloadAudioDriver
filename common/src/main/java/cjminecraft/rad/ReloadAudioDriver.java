package cjminecraft.rad;

import cjminecraft.rad.api.events.IKeyInputEvent;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

public class ReloadAudioDriver {

    public void reloadAudioDriver(IKeyInputEvent event){
        if (event.getAction() != GLFW.GLFW_PRESS)
            return;
        Minecraft client = Minecraft.getInstance();
        if (client.screen == null) {
            if (InputConstants.isKeyDown(client.getWindow().getWindow(), GLFW.GLFW_KEY_F3)) {
                if (event.getKey() == GLFW.GLFW_KEY_R) {
                    client.keyboardHandler.handledDebugKey = true;
                    client.getSoundManager().soundEngine.reload();
                    ReloadAudioDriver.showToast();
                } else if (event.getKey() == GLFW.GLFW_KEY_Q) {
                    client.gui.getChat().addMessage(Component.translatable("reload_audio_driver.details"));
                }
            }
        }
    }

    public static void showToast(){
        SystemToast.add(
                Minecraft.getInstance().getToasts(),
                SystemToast.SystemToastIds.TUTORIAL_HINT,
                Component.translatable("reload_audio_driver.toast.title"),
                Component.translatable("reload_audio_driver.toast.body")
        );
    }
}
