package com.jagex.game.world.entity;

import com.jagex.game.shared.movement.CoordGrid;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.ObjStackList;

@ObfuscatedName("yd")
public class ObjReference {

	@ObfuscatedName("yd.e")
	public final CoordGrid field8244;

	@ObfuscatedName("yd.n")
	public final int field8243;

	public ObjReference(CoordGrid arg0, int arg1) {
		this.field8244 = arg0;
		this.field8243 = arg1;
	}

	@ObfuscatedName("yd.e(I)Laut;")
	public ObjStackEntity method13793() {
		ObjStackList var1 = (ObjStackList) Client.field10964.method14495((long) (this.field8244.field7428 << 28 | this.field8244.field7427 << 14 | this.field8244.field7426));
		if (var1 == null) {
			return null;
		}
		CoordGrid var2 = Client.world.method7727();
		int var3 = this.field8244.field7426 - var2.field7426;
		int var4 = this.field8244.field7427 - var2.field7427;
		if (var3 >= 0 && var4 >= 0 && var3 < Client.world.method7728() && var4 < Client.world.method7758() && Client.world.method7743() != null) {
			for (Obj var5 = (Obj) var1.field11263.method14191(); var5 != null; var5 = (Obj) var1.field11263.method14161()) {
				if (this.field8243 == var5.field11261) {
					return (ObjStackEntity) Client.world.method7743().method8736(this.field8244.field7428, var3, var4);
				}
			}
		}
		return null;
	}
}
