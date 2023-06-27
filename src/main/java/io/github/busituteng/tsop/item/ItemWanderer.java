
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
public class ItemWanderer extends ElementsTsopMod.ModElement {
	@GameRegistry.ObjectHolder("tsop:wanderer")
	public static final Item block = null;
	public ItemWanderer(ElementsTsopMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tsop:wanderer", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("wanderer", ElementsTsopMod.sounds.get(new ResourceLocation("tsop:wanderer")));
			setUnlocalizedName("wanderer");
			setRegistryName("wanderer");
			setCreativeTab(TabThesoundofpaintingstab.tab);
		}
	}
}
