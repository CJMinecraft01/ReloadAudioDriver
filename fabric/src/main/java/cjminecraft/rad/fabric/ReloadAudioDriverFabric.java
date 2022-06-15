package cjminecraft.rad.fabric;

import cjminecraft.rad.ReloadAudioDriver;
import cjminecraft.rad.fabric.events.KeyInputEventHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;

public class ReloadAudioDriverFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ReloadAudioDriver.init();
        initClient();
    }

    @Environment(EnvType.CLIENT)
    private static void initClient(){
        KeyInputEventHandler.EVENT.register(ReloadAudioDriver::reloadAudioDriver);
    }
}
