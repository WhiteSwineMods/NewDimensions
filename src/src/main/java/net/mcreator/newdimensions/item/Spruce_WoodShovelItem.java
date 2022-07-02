
package net.mcreator.newdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.newdimensions.itemgroup.NewDimensionsItemGroup;
import net.mcreator.newdimensions.NewdimensionsModElements;

@NewdimensionsModElements.ModElement.Tag
public class Spruce_WoodShovelItem extends NewdimensionsModElements.ModElement {
	@ObjectHolder("newdimensions:spruce_wood_shovel")
	public static final Item block = null;
	public Spruce_WoodShovelItem(NewdimensionsModElements instance) {
		super(instance, 135);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 122;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.SPRUCE_LOG, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(NewDimensionsItemGroup.tab)) {
		}.setRegistryName("spruce_wood_shovel"));
	}
}
