package cjminecraft.rad;

import cjminecraft.rad.api.events.RadEvents;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;

public class ReloadAudioDriverFabric implements ModInitializer {
    ReloadAudioDriver radInstance;

    @Override
    public void onInitialize() {
        radInstance = new ReloadAudioDriver();
        initClient();
    }

    @Environment(EnvType.CLIENT)
    private void initClient(){
        RadEvents.KEYINPUT_EVENT.register(radInstance::reloadAudioDriver);
    }
}
