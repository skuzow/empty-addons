package net.skuzow.emptyaddons;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;


public class EmptyAddons implements CarpetExtension {

    public static void noop() { }
    static {
        CarpetServer.manageExtension(new EmptyAddons());
    }

    @Override
    public void onGameStarted() {
        CarpetServer.settingsManager.parseSettingsClass(EmptySettings.class);
    }

    @Override
    public void onServerLoaded(MinecraftServer server) {
        // reloading of /carpet settings is handled by carpet
        // reloading of own settings is handled as an extension, since we claim own settings manager
    }

    @Override
    public void onTick(MinecraftServer server) {
        // no need to add this.
    }

    @Override
    public void onPlayerLoggedIn(ServerPlayerEntity player) {
        //
    }

    @Override
    public void onPlayerLoggedOut(ServerPlayerEntity player) {
        //
    }

}
