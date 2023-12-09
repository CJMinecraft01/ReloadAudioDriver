package cjminecraft.rad.api.events;

import cjminecraft.rad.api.data.KeyInput;
import com.mojang.blaze3d.platform.InputConstants;

/**
 * This event fires when a keyboard input is detected.
 */
public interface IKeyInputEvent {
    /**
     * Integer representing the key's action.
     *
     * @see InputConstants#PRESS
     * @see InputConstants#RELEASE
     * @see InputConstants#REPEAT
     */
    int getAction();

    /**
     * The keyboard key that triggered this event.
     * https://www.glfw.org/docs/latest/group__keys.html
     *
     * @see InputConstants key constants starting with "GLFW_KEY_"
     */
    int getKey();

    /**
     * Bit field representing the modifier keys pressed.
     *
     * @see InputConstants#MOD_CONTROL
     */
    int getModifiers();

    /**
     * Platform-specific scan code.
     * Used for {@link InputConstants#getKey(int, int)}
     *
     * The scan code is unique for every key, regardless of whether it has a key code.
     * Scan codes are platform-specific but consistent over time, so keys will have different scan codes depending
     * on the platform but they are safe to save to disk as custom key bindings.
     */
    int getScanCode();

    /**
     * Get the key input object
     */
    KeyInput getKeyInput();
}
