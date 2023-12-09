package cjminecraft.rad.platform.services;

import cjminecraft.rad.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import org.quiltmc.loader.api.QuiltLoader;

public class QuiltPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Quilt";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return QuiltLoader.isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return QuiltLoader.isDevelopmentEnvironment();
    }
}