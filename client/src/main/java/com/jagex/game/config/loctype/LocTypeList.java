package com.jagex.game.config.loctype;

import com.jagex.*;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aop")
public class LocTypeList extends CachingConfigTypeList {

	public LocTypeList(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, Js5 arg4) {
		super(arg0, arg1, arg3, Js5ConfigGroup.LOCTYPE, 256, new BasicLocTypeFactory(arg2, arg4, arg1, arg0));
	}

	@ObfuscatedName("aop.al(ZI)V")
	public void method18890(boolean arg0) {
		((LocTypeFactory) this.field8796).method9519(arg0);
	}

	@ObfuscatedName("aop.ac(IB)V")
	public void method18891(int arg0) {
		((LocTypeFactory) this.field8796).method9541(arg0);
	}

	@ObfuscatedName("aop.r(I)V")
	public void method14895() {
		super.method14895();
		((LocTypeFactory) this.field8796).method9521();
	}

	@ObfuscatedName("aop.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((LocTypeFactory) this.field8796).method9522(arg0);
	}

	@ObfuscatedName("aop.o(I)V")
	public void method14899() {
		super.method14899();
		((LocTypeFactory) this.field8796).method9520();
	}
}