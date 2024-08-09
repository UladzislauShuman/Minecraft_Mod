package vladlol.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class DermantineOre extends Block {
    public DermantineOre() {
        super(Properties.of(Material.STONE).destroyTime(0.25f).requiresCorrectToolForDrops());
    }
}
