package net.mcreator.diabolica.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelikuj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("diabolica", "modelikuj"), "main");
	public final ModelPart hexadecagon;

	public Modelikuj(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(140, 1).addBox(-17.9456F, -7.63F, -42.0F, 19.8912F, 0.1F, 100.0F, new CubeDeformation(0.0F)).texOffs(140, 224).addBox(-58.0F, -7.68F, -1.9456F, 100.0F, 0.1F, 19.8912F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, 24.0F, -8.0F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(140, 203).addBox(-50.0F, 0.31F, -9.9456F, 100.0F, 0.1F, 19.8912F, new CubeDeformation(0.0F)).texOffs(0, 101).addBox(-9.9456F, 0.345F, -50.0F, 19.8912F, 0.1F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(140, 245).addBox(-50.0F, 0.315F, -9.9456F, 100.0F, 0.1F, 19.8912F, new CubeDeformation(0.0F)).texOffs(140, 102).addBox(-9.9456F, 0.38F, -50.0F, 19.8912F, 0.1F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-9.9456F, 0.344F, -50.0F, 19.8912F, 0.1F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 202).addBox(-9.9456F, 0.39F, -50.0F, 19.8912F, 0.1F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
