package cjminecraft.rad.quilt;

import cjminecraft.rad.ReloadAudioDriver;
import cjminecraft.rad.quilt.events.KeyInputEventHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ReloadAudioDriverQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        ReloadAudioDriver.init();
        initClient();
    }

    @Environment(EnvType.CLIENT)
    private static void initClient(){
        KeyInputEventHandler.EVENT.register(ReloadAudioDriver::reloadAudioDriver);
    }
}
