package dsh.soul.craft;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class SoulCraftFoodComponents {
    public static final FoodComponent holy_water = (new FoodComponent.Builder()).hunger(0).saturationModifier(0).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000,1), 1F).alwaysEdible().build();
}