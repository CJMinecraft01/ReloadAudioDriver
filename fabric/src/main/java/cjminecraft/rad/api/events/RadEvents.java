package cjminecraft.rad.api.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class RadEvents {
    public static final Event<IEventHandler<KeyInputEvent>> KEYINPUT_EVENT = EventFactory.createArrayBacked(IEventHandler.class, listeners -> event -> {
        for(IEventHandler<KeyInputEvent> listener : listeners) {
            listener.handle(event);
        }
    });
}
