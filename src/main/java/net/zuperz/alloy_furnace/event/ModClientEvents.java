package net.zuperz.alloy_furnace.event;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.item.costom.elytra.CobaltElytraLayer;

@Mod.EventBusSubscriber(modid = alloy_furnace.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModClientEvents {
    @SubscribeEvent
    public static <T extends EntityModel<Player>> void onEntityRender(EntityRenderersEvent.AddLayers event) {
        LivingEntityRenderer<Player, T> renderer = event.getSkin("default");

        if (renderer == null) return;

        renderer.addLayer(new CobaltElytraLayer<>(renderer, event.getEntityModels()));
    }
}