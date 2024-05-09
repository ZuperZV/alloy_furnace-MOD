package net.zuperz.alloy_furnace.item.costom.elytra;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class CobaltElytraLayer <T extends Player, M extends EntityModel<T>> extends ElytraLayer<T, M> {
    private static final ResourceLocation COBALT_WINGS = new ResourceLocation(alloy_furnace.MOD_ID, "/textures/entity/elytra.png");
    public CobaltElytraLayer(RenderLayerParent<T, M> pRenderer, EntityModelSet pModelSet) {
        super(pRenderer, pModelSet);
    }

    @Override
    public boolean shouldRender(@NotNull ItemStack stack, @NotNull T entity) {
        return stack.getItem() == ModItems.COBALT_ELYTRA.get();
    }

    @NotNull
    @Override
    public ResourceLocation getElytraTexture(@NotNull ItemStack stack, @NotNull T entity) {
        return COBALT_WINGS;
    }
}