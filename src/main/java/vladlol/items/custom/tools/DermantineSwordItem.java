package vladlol.items.custom.tools;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;
import vladlol.items.ModToolTiers;
//
//public static final RegistryObject<Item> DERMANTINE_SWORD = ITEMS.register("dermantine_sword",
//        ()->new SwordItem(ModToolTiers.DERMANTINE,10, 1f, new Item.Properties().stacksTo(1)));

public class DermantineSwordItem extends SwordItem{
    public DermantineSwordItem(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();
            Level level = pContext.getLevel();
            Player player = pContext.getPlayer();
            if (level instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel) level;
                LightningBolt lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
                if (player != null && !player.blockPosition().closerThan(positionClicked, 2.0)) {
                    lightningBolt.moveTo(positionClicked.getX(), positionClicked.getY(), positionClicked.getZ());
                    serverLevel.addFreshEntity(lightningBolt);
                }
            }
        }
        return InteractionResult.SUCCESS;
    }
}

