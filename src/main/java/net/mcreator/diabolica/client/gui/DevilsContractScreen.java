package net.mcreator.diabolica.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diabolica.world.inventory.DevilsContractMenu;
import net.mcreator.diabolica.network.DevilsContractButtonMessage;
import net.mcreator.diabolica.DiabolicaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DevilsContractScreen extends AbstractContainerScreen<DevilsContractMenu> {
	private final static HashMap<String, Object> guistate = DevilsContractMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_check;
	ImageButton imagebutton_x;

	public DevilsContractScreen(DevilsContractMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 197;
		this.imageHeight = 201;
	}

	private static final ResourceLocation texture = new ResourceLocation("diabolica:textures/screens/devils_contract.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("diabolica:textures/screens/realpentagon.png"), this.leftPos + 35, this.topPos + 51, 0, 0, 128, 128, 128, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diabolica.devils_contract.label_devils_contract"), 57, 7, -10092544, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diabolica.devils_contract.label_sign_and_recieve_my_guarantee_of"), 13, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diabolica.devils_contract.label_destruction_upon_using_the_idol"), 13, 32, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diabolica.devils_contract.label_but_prepare_for_the_consequences"), 11, 184, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_check = new ImageButton(this.leftPos + 9, this.topPos + 100, 16, 16, 0, 0, 16, new ResourceLocation("diabolica:textures/screens/atlas/imagebutton_check.png"), 16, 32, e -> {
			if (true) {
				DiabolicaMod.PACKET_HANDLER.sendToServer(new DevilsContractButtonMessage(0, x, y, z));
				DevilsContractButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_check", imagebutton_check);
		this.addRenderableWidget(imagebutton_check);
		imagebutton_x = new ImageButton(this.leftPos + 172, this.topPos + 100, 16, 16, 0, 0, 16, new ResourceLocation("diabolica:textures/screens/atlas/imagebutton_x.png"), 16, 32, e -> {
			if (true) {
				DiabolicaMod.PACKET_HANDLER.sendToServer(new DevilsContractButtonMessage(1, x, y, z));
				DevilsContractButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_x", imagebutton_x);
		this.addRenderableWidget(imagebutton_x);
	}
}
