package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.graphics.scenegraph.ObjLayerEntity;
import com.jagex.graphics.scenegraph.WallDecorLayerEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import deob.ObfuscatedName;

@ObfuscatedName("tk")
public class Tile {

	@ObfuscatedName("tk.e")
	public byte field6970;

	@ObfuscatedName("tk.n")
	public Tile field6965;

	@ObfuscatedName("tk.m")
	public WallLayerEntity field6966;

	@ObfuscatedName("tk.k")
	public WallLayerEntity field6967;

	@ObfuscatedName("tk.f")
	public WallDecorLayerEntity field6968;

	@ObfuscatedName("tk.w")
	public WallDecorLayerEntity field6976;

	@ObfuscatedName("tk.l")
	public GroundDecorLayerEntity field6974;

	@ObfuscatedName("tk.u")
	public ObjLayerEntity field6971;

	@ObfuscatedName("tk.z")
	public PrimaryLayerEntityList field6964;

	@ObfuscatedName("tk.p")
	public short field6973;

	@ObfuscatedName("tk.d")
	public short field6969;

	@ObfuscatedName("tk.c")
	public short field6975;

	@ObfuscatedName("tk.r")
	public short field6972;

	public Tile(int arg0) {
		this.field6970 = (byte) arg0;
	}
}
