package cjminecraft.rad.platform;

import cjminecraft.rad.api.data.KeyInput;

import cjminecraft.rad.api.events.IKeyInputEvent;
import cjminecraft.rad.events.KeyInputEvent;
import com.mojang.datafixers.util.Either;
import net.neoforged.neoforge.common.NeoForge;

public class NeoForgeEventHandler implements IEventHelper {
    @Override
    public Either<IKeyInputEvent, KeyInput> fireKeyInputEvent(KeyInput keyInput) {
        KeyInputEvent event = new KeyInputEvent(keyInput);
        NeoForge.EVENT_BUS.post(event);
        return Either.left(event);
    }
}
