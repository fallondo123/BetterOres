package fallondo.better.ores.items.tools;

import fallondo.better.ores.BetterOres;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TopazToolMaterial implements ToolMaterial {

    public static final TopazToolMaterial INSTANCE = new TopazToolMaterial();

    @Override
    public int getDurability() {
        return 350;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BetterOres.TOPAZ);
    }

}
