package com.jagex.cutscene;

import com.jagex.EffectAnimType;
import com.jagex.Packet;
import com.jagex.SeqType;
import com.jagex.cutscene.CutsceneAction;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agm")
public abstract class class874 extends CutsceneAction {

	@ObfuscatedName("agm.n")
	public final int field10303;

	@ObfuscatedName("agm.m")
	public final int field10304;

	@ObfuscatedName("agm.k")
	public final int field10305;

	public class874(Packet arg0) {
		super(arg0);
		this.field10303 = arg0.g2();
		this.field10304 = arg0.g2();
		this.field10305 = arg0.g1();
	}

	@ObfuscatedName("agm.k(I)Z")
	public boolean method2891() {
		EffectAnimType var1 = (EffectAnimType) Statics.field4874.get(this.field10303);
		boolean var2 = var1.method13803();
		SeqType var3 = (SeqType) Statics.field8797.get(var1.field8260);
		return var2 & var3.method2991();
	}
}