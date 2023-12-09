package cjminecraft.rad.platform;

import cjminecraft.rad.api.data.KeyInput;
import cjminecraft.rad.api.events.IKeyInputEvent;
import cjminecraft.rad.api.events.KeyInputEvent;
import cjminecraft.rad.api.events.RadEvents;
import com.mojang.datafixers.util.Either;

public class QuiltEventHandler implements IEventHelper {
    @Override
    public Either<IKeyInputEvent, KeyInput> fireKeyInputEvent(KeyInput keyInput) {
        KeyInputEvent event = new KeyInputEvent(keyInput);
        if(Services.PLATFORM.isModLoaded("quilt")){
            RadEvents.KEYINPUT_EVENT.invoker().handle(event);
        }
        return Either.right(event.getKeyInput());
    }
}
