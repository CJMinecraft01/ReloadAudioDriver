package cjminecraft.rad.api.events;

import cjminecraft.rad.api.data.KeyInput;
import cjminecraft.rad.api.events.IKeyInputEvent;
import com.mojang.blaze3d.platform.InputConstants;

public class KeyInputEvent implements IKeyInputEvent {

    private final KeyInput keyInput;

    public KeyInputEvent(KeyInput keyInput){
        this.keyInput = keyInput;
    }

    /**
     * Integer representing the key's action.
     *
     * @see InputConstants#PRESS
     * @see InputConstants#RELEASE
     * @see InputConstants#REPEAT
     */
    public int getAction(){
        return keyInput.getAction();
    }

    /**
     * The keyboard key that triggered this event.
     * https://www.glfw.org/docs/latest/group__keys.html
     *
     * @see InputConstants key constants starting with "GLFW_KEY_"
     */
    public int getKey() {
        return keyInput.getKey();
    }

    /**
     * Bit field representing the modifier keys pressed.
     *
     * @see InputConstants#MOD_CONTROL
     */
    public int getModifiers() {
        return keyInput.getModifiers();
    }

    /**
     * Platform-specific scan code.
     * Used for {@link InputConstants#getKey(int, int)}
     *
     * The scan code is unique for every key, regardless of whether it has a key code.
     * Scan codes are platform-specific but consistent over time, so keys will have different scan codes depending
     * on the platform but they are safe to save to disk as custom key bindings.
     */
    public int getScanCode() {
        return keyInput.getScanCode();
    }

    public KeyInput getKeyInput() {
        return keyInput;
    }
}
