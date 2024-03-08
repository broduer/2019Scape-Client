package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("apq")
public class MSITypeFactory extends class782 {

	public MSITypeFactory(class442 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("apq.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new MSIType(arg0, this);
	}

	@ObfuscatedName("apq.o(B)Ljava/lang/Class;")
	public Class type() {
		return MSIType.class;
	}
}