package cpw.mods.fml.common;

import java.util.List;

import net.minecraft.server.MinecraftServer;
import net.minecraft.src.Entity;
import net.minecraft.src.Packet;
import cpw.mods.fml.common.network.EntitySpawnAdjustmentPacket;
import cpw.mods.fml.common.network.EntitySpawnPacket;

public interface IFMLSidedHandler
{
    List<String> getAdditionalBrandingInformation();

    Side getSide();

    void haltGame(String message, Throwable exception);

    void showGuiScreen(Object clientGuiElement);

    Entity spawnEntityIntoClientWorld(Class<? extends Entity> entityClass, EntitySpawnPacket packet);

    void adjustEntityLocationOnClient(EntitySpawnAdjustmentPacket entitySpawnAdjustmentPacket);

    void beginServerLoading(MinecraftServer server);

    void finishServerLoading();

    MinecraftServer getServer();

    void sendPacket(Packet packet);
}