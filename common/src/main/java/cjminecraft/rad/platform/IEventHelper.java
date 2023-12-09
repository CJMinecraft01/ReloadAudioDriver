package cjminecraft.rad.platform;

import cjminecraft.rad.api.data.KeyInput;
import cjminecraft.rad.api.events.IKeyInputEvent;
import com.mojang.datafixers.util.Either;
import net.minecraft.world.entity.LivingEntity;

public interface IEventHelper {
    Either<IKeyInputEvent, KeyInput> fireKeyInputEvent(KeyInput keyInput);
}
