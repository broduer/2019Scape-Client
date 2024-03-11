package com.jagex.game.runetek5.config.vartype.player;

import com.jagex.core.io.Packet;
import com.jagex.SerializableEnums;
import com.jagex.game.runetek5.config.vartype.VarType;
import com.jagex.game.runetek5.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("aff")
public class VarPlayerType extends VarType {

	@ObfuscatedName("aff.w")
	public int clientCode;

	public VarPlayerType(VarDomainType arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aff.u(Lalw;IS)V")
	public void decode(Packet arg0, int arg1) {
		VarPlayerTypeEncodingKey var3 = (VarPlayerTypeEncodingKey) SerializableEnums.decode(VarPlayerTypeEncodingKey.method7471(), arg1);
		if (VarPlayerTypeEncodingKey.CLIENTCODE == var3) {
			this.clientCode = arg0.g2();
		}
	}

	@ObfuscatedName("aff.n(I)V")
	public void postDecode() {
	}
}
