package fallondo.better.ores.mixin;

import fallondo.better.ores.BetterOres;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class MixinEndermanEntity extends HostileEntity implements Angerable {

    protected MixinEndermanEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "isPlayerStaring", cancellable = true, at = @At("HEAD"))
    private void onPlayerStaringCheck(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        ItemStack itemStack = player.inventory.armor.get(3);
        if (itemStack.getItem() == BetterOres.ENDERITE_MATERIAL_HELMET.asItem()) {
            cir.setReturnValue(false);
        }
    }
}
