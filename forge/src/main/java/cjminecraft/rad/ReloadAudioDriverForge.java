package cjminecraft.rad;

import cjminecraft.rad.api.events.KeyInputEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ReloadAudioDriverForge {
    ReloadAudioDriver radInstance;
    public ReloadAudioDriverForge() {
        radInstance = new ReloadAudioDriver();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onKeyInputEvent(KeyInputEvent event) {
        radInstance.reloadAudioDriver(event);
    }
}
