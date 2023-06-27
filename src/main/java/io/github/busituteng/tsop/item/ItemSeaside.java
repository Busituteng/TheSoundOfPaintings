
package io.github.busituteng.tsop.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import io.github.busituteng.tsop.creativetab.TabThesoundofpaintingstab;
import io.github.busituteng.tsop.ElementsTsopMod;

@ElementsTsopMod.ModElement.Tag
public class ItemSeaside extends ElementsTsopMod.ModElement {
	@GameRegistry.ObjectHolder("tsop:seaside")
	public static final Item block = null;
	public ItemSeaside(ElementsTsopMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tsop:seaside", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("seaside", ElementsTsopMod.sounds.get(new ResourceLocation("tsop:seaside")));
			setUnlocalizedName("seaside");
			setRegistryName("seaside");
			setCreativeTab(TabThesoundofpaintingstab.tab);
		}
	}
}
