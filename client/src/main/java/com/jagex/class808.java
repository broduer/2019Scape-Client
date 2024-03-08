package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("add")
public abstract class class808 extends class52 implements class414 {

	@ObfuscatedName("add.n")
	public final VarDomainType field9260;

	public class808(ModeGame arg0, VarDomainType arg1, Language arg2, int arg3) {
		super(arg0, arg2, arg3);
		this.field9260 = arg1;
	}

	@ObfuscatedName("add.n(I)I")
	public int size() {
		return this.field811;
	}

	@ObfuscatedName("adl.j([Ladd;S)Ljava/util/Map;")
	public static Map method15149(class808[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		HashMap var1 = new HashMap();
		class808[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class808 var4 = var2[var3];
			var1.put(var4.field9260, var4);
		}
		return var1;
	}

	@ObfuscatedName("add.u(IB)Ljava/lang/Object;")
	public Object method6245(int arg0) {
		class149 var2 = (class149) this.get(arg0);
		return var2 != null && var2.method2781() ? var2.method2782() : null;
	}

	@ObfuscatedName("add.t(Lon;B)I")
	public int method15282(class413 arg0) {
		byte var2 = 2;
		int var3;
		if (arg0.field4239 instanceof Integer) {
			var3 = var2 + 4;
		} else if (arg0.field4239 instanceof Long) {
			var3 = var2 + 8;
		} else if (arg0.field4239 instanceof String) {
			var3 = var2 + Packet.method8398((String) arg0.field4239);
		} else if (arg0.field4239 instanceof Serializable) {
			var3 = var2 + ((Serializable) arg0.field4239).method15118();
		} else {
			throw new IllegalStateException();
		}
		return var3;
	}

	@ObfuscatedName("add.ae(Lalw;Lon;I)V")
	public void method15283(Packet arg0, class413 arg1) {
		arg0.p2(arg1.field4240);
		if (arg1.field4239 instanceof Integer) {
			arg0.p4((Integer) arg1.field4239);
		} else if (arg1.field4239 instanceof Long) {
			arg0.p8((Long) arg1.field4239);
		} else if (arg1.field4239 instanceof String) {
			arg0.pjstr2((String) arg1.field4239);
		} else if (arg1.field4239 instanceof Serializable) {
			((Serializable) arg1.field4239).method15114(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("add.ag(Lalw;B)Lon;")
	public class413 method15284(Packet arg0) {
		int var2 = arg0.g2();
		class149 var3 = (class149) this.get(var2);
		if (!var3.method2781()) {
			throw new IllegalStateException("");
		}
		class413 var4 = new class413(var2);
		Class var5 = var3.field1704.method7292().field4843;
		if (var5 == Integer.class) {
			var4.field4239 = arg0.g4s();
		} else if (var5 == Long.class) {
			var4.field4239 = arg0.g8();
		} else if (var5 == String.class) {
			var4.field4239 = arg0.gjstr2();
		} else if (Serializable.class.isAssignableFrom(var5)) {
			try {
				Serializable var6 = (Serializable) var5.getDeclaredConstructor().newInstance();
				var6.method15115(arg0);
				var4.field4239 = var6;
			} catch (InstantiationException var9) {
			} catch (IllegalAccessException var10) {
			} catch (java.lang.reflect.InvocationTargetException var11) {
			} catch (NoSuchMethodException var12) {
			}
		} else {
			throw new IllegalStateException();
		}
		return var4;
	}

	@ObfuscatedName("add.ah(Lalw;Lqa;B)Lon;")
	public class413 method15285(Packet arg0, BaseVarType arg1) {
		int var3 = arg0.g2();
		class413 var4 = new class413(var3);
		Class var5 = arg1.field4843;
		if (var5 == Integer.class) {
			var4.field4239 = arg0.g4s();
		} else if (var5 == Long.class) {
			var4.field4239 = arg0.g8();
		} else if (var5 == String.class) {
			var4.field4239 = arg0.gjstr2();
		} else if (Serializable.class.isAssignableFrom(var5)) {
			try {
				Serializable var6 = (Serializable) var5.getDeclaredConstructor().newInstance();
				var6.method15115(arg0);
				var4.field4239 = var6;
			} catch (InstantiationException var10) {
			} catch (IllegalAccessException var11) {
			} catch (java.lang.reflect.InvocationTargetException var12) {
			} catch (NoSuchMethodException var13) {
			}
		} else {
			throw new IllegalStateException();
		}
		class149 var9 = (class149) this.get(var3);
		return var9.method2781() && var9.field1704.method7292() == arg1 ? var4 : null;
	}

	@ObfuscatedName("add.e(II)Lay;")
	public abstract ConfigType get(int arg0);
}
