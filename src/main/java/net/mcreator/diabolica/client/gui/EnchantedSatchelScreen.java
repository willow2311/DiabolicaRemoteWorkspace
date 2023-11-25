package net.mcreator.diabolica.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diabolica.world.inventory.EnchantedSatchelMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantedSatchelScreen extends AbstractContainerScreen<EnchantedSatchelMenu> {
	private final static HashMap<String, Object> guistate = EnchantedSatchelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EnchantedSatchelScreen(EnchantedSatchelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 183;
	}

	private static final ResourceLocation texture = new ResourceLocation("diabolica:textures/screens/enchanted_satchel.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 57 && mouseX < leftPos + 75 && mouseY > topPos + 35 && mouseY < topPos + 53)
			guiGraphics.renderTooltip(font, Component.translatable("gui.diabolica.enchanted_satchel.tooltip_ring"), mouseX, mouseY);
		if (mouseX > leftPos + 77 && mouseX < leftPos + 95 && mouseY > topPos + 50 && mouseY < topPos + 68)
			guiGraphics.renderTooltip(font, Component.translatable("gui.diabolica.enchanted_satchel.tooltip_amulet"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.diabolica.enchanted_satchel.label_enchanted_satchel"), 43, 4, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
