package cjminecraft.rad;


import cjminecraft.rad.events.KeyInputEvent;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(Constants.MOD_ID)
public class ReloadAudioDriverNeoForge {
    ReloadAudioDriver radInstance;
    public ReloadAudioDriverNeoForge() {
        radInstance = new ReloadAudioDriver();
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onKeyInputEvent(KeyInputEvent event) {
        radInstance.reloadAudioDriver(event);
    }
}
