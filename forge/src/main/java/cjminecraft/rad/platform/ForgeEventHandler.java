package cjminecraft.rad.platform;

import cjminecraft.rad.api.data.KeyInput;
import cjminecraft.rad.api.events.IKeyInputEvent;
import cjminecraft.rad.api.events.KeyInputEvent;
import com.mojang.datafixers.util.Either;
import net.minecraftforge.common.MinecraftForge;

public class ForgeEventHandler implements IEventHelper {
    @Override
    public Either<IKeyInputEvent, KeyInput> fireKeyInputEvent(KeyInput keyInput) {
        KeyInputEvent event = new KeyInputEvent(keyInput);
        MinecraftForge.EVENT_BUS.post(event);
        return Either.left(event);
    }
}
