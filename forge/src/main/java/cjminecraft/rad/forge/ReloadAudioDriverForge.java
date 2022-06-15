package cjminecraft.rad.forge;

import cjminecraft.rad.ReloadAudioDriver;
import cjminecraft.rad.events.KeyInputEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;

@Mod(ReloadAudioDriver.MOD_ID)
@Mod.EventBusSubscriber
public class ReloadAudioDriverForge {
    public ReloadAudioDriverForge() {
        ReloadAudioDriver.init();
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (remote, isServer) -> true));
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onKeyInputEvent(InputEvent.KeyInputEvent event) {
        KeyInputEvent radKeyEvent = new KeyInputEvent(event.getKey(), event.getScanCode(), event.getAction(), event.getModifiers());
        ReloadAudioDriver.reloadAudioDriver(radKeyEvent);
    }
}
