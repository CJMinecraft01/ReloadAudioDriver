package cjminecraft.rad.mixins;

import cjminecraft.rad.api.data.KeyInput;
import cjminecraft.rad.platform.Services;
import net.minecraft.client.KeyboardHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {
    @Inject(at = @At("TAIL"), method = "keyPress")
    private void init(long windowPointer, int key, int scanCode, int action, int modifiers, CallbackInfo info) {
        Services.EVENT.fireKeyInputEvent(new KeyInput(key, scanCode, action, modifiers));
    }
}