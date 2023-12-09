package cjminecraft.rad;

import cjminecraft.rad.api.events.RadEvents;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class ReloadAudioDriverQuilt implements ClientModInitializer {
    ReloadAudioDriver radInstance;

    /**
     * Runs the mod initializer on the client environment.
     *
     * @param mod the mod which is initialized
     */
    @Override
    public void onInitializeClient(ModContainer mod) {
        radInstance = new ReloadAudioDriver();
        initClient();
    }

    private void initClient(){
        RadEvents.KEYINPUT_EVENT.register(radInstance::reloadAudioDriver);
    }
}
