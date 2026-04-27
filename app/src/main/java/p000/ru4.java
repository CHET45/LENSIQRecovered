package p000;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class ru4 {

    /* JADX INFO: renamed from: a */
    public final Function<zu4, Double> f79598a;

    /* JADX INFO: renamed from: b */
    public final Function<zu4, Double> f79599b;

    /* JADX INFO: renamed from: c */
    public final Function<zu4, Double> f79600c;

    /* JADX INFO: renamed from: d */
    public final Function<zu4, Double> f79601d;

    /* JADX INFO: renamed from: e */
    public final Function<zu4, ru4> f79602e;

    /* JADX INFO: renamed from: f */
    public final Function<zu4, Double> f79603f;

    /* JADX INFO: renamed from: g */
    public final Function<zu4, Double> f79604g;

    /* JADX INFO: renamed from: h */
    public final Function<zu4, a4h> f79605h;

    /* JADX INFO: renamed from: i */
    public final HashMap<zu4, bi7> f79606i = new HashMap<>();

    /* JADX INFO: renamed from: ru4$a */
    public static /* synthetic */ class C12289a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f79607a;

        static {
            int[] iArr = new int[b4h.values().length];
            f79607a = iArr;
            try {
                iArr[b4h.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79607a[b4h.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79607a[b4h.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ru4(Function<zu4, Double> function, Function<zu4, Double> function2, Function<zu4, Double> function3, Function<zu4, Double> function4, Function<zu4, ru4> function5, Function<zu4, Double> function6, Function<zu4, Double> function7, Function<zu4, a4h> function8) {
        this.f79598a = function;
        this.f79599b = function2;
        this.f79600c = function3;
        this.f79601d = function4;
        this.f79602e = function5;
        this.f79603f = function6;
        this.f79604g = function7;
        this.f79605h = function8;
    }

    public static double calculateDynamicTone(zu4 zu4Var, Function<zu4, Double> function, Function<ru4, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<zu4, ru4> function3, Function<zu4, a4h> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        double dDoubleValue = function.apply(zu4Var).doubleValue();
        ru4 ru4VarApply = function3 == null ? null : function3.apply(zu4Var);
        if (ru4VarApply == null) {
            return dDoubleValue;
        }
        double dRatioOfTones = mz2.ratioOfTones(dDoubleValue, ru4VarApply.f79600c.apply(zu4Var).doubleValue());
        Double dApply = function2.apply(ru4VarApply);
        double dDoubleValue2 = dApply.doubleValue();
        double dDoubleValue3 = biFunction.apply(Double.valueOf(dRatioOfTones), dApply).doubleValue();
        double dRatioOfTones2 = mz2.ratioOfTones(dDoubleValue2, dDoubleValue3);
        double dDoubleValue4 = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(dRatioOfTones)) != null) {
            dDoubleValue4 = function5.apply(Double.valueOf(dRatioOfTones)).doubleValue();
        }
        double dClampDouble = s3a.clampDouble(dDoubleValue4, (function6 == null || function6.apply(Double.valueOf(dRatioOfTones)) == null) ? 21.0d : function6.apply(Double.valueOf(dRatioOfTones)).doubleValue(), dRatioOfTones2);
        if (dClampDouble != dRatioOfTones2) {
            dDoubleValue3 = contrastingTone(dDoubleValue2, dClampDouble);
        }
        Function<zu4, ru4> function7 = ru4VarApply.f79602e;
        return m21562t((function7 == null || function7.apply(zu4Var) == null) ? enableLightForeground(dDoubleValue3) : dDoubleValue3, dDoubleValue, zu4Var, function4, function2);
    }

    public static double contrastingTone(double d, double d2) {
        double dLighterUnsafe = mz2.lighterUnsafe(d, d2);
        double dDarkerUnsafe = mz2.darkerUnsafe(d, d2);
        double dRatioOfTones = mz2.ratioOfTones(dLighterUnsafe, d);
        double dRatioOfTones2 = mz2.ratioOfTones(dDarkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            return (dRatioOfTones >= d2 || dRatioOfTones >= dRatioOfTones2 || ((Math.abs(dRatioOfTones - dRatioOfTones2) > 0.1d ? 1 : (Math.abs(dRatioOfTones - dRatioOfTones2) == 0.1d ? 0 : -1)) < 0 && (dRatioOfTones > d2 ? 1 : (dRatioOfTones == d2 ? 0 : -1)) < 0 && (dRatioOfTones2 > d2 ? 1 : (dRatioOfTones2 == d2 ? 0 : -1)) < 0)) ? dLighterUnsafe : dDarkerUnsafe;
        }
        return (dRatioOfTones2 >= d2 || dRatioOfTones2 >= dRatioOfTones) ? dDarkerUnsafe : dLighterUnsafe;
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static ru4 fromArgb(int i) {
        final bi7 bi7VarFromInt = bi7.fromInt(i);
        final z3h z3hVarFromInt = z3h.fromInt(i);
        return fromPalette(new Function() { // from class: bu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromArgb$0(z3hVarFromInt, (zu4) obj);
            }
        }, new Function() { // from class: cu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromArgb$1(bi7VarFromInt, (zu4) obj);
            }
        });
    }

    public static ru4 fromPalette(Function<zu4, z3h> function, Function<zu4, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z3h lambda$fromArgb$0(z3h z3hVar, zu4 zu4Var) {
        return z3hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(bi7 bi7Var, zu4 zu4Var) {
        return Double.valueOf(bi7Var.getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z3h lambda$fromArgb$2(int i, zu4 zu4Var) {
        return z3h.fromInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z3h lambda$fromArgb$3(int i, zu4 zu4Var) {
        return z3h.fromInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z3h lambda$fromArgb$4(int i, zu4 zu4Var) {
        return z3h.fromInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$5(Function function, zu4 zu4Var) {
        return Double.valueOf(((z3h) function.apply(zu4Var)).getHue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$6(Function function, zu4 zu4Var) {
        return Double.valueOf(((z3h) function.apply(zu4Var)).getChroma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$7(Function function, Function function2, Function function3, zu4 zu4Var) {
        return Double.valueOf(toneMinContrastDefault(function, function2, zu4Var, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$8(Function function, Function function2, Function function3, zu4 zu4Var) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, zu4Var, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$10(double d, Double d2, Double d3) {
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru4 lambda$getTone$11(ru4 ru4Var, zu4 zu4Var) {
        return ru4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$12(double d, Double d2) {
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$13(double d, Double d2) {
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$9(zu4 zu4Var, ru4 ru4Var) {
        return Double.valueOf(ru4Var.getTone(zu4Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$17(zu4 zu4Var, ru4 ru4Var) {
        return ru4Var.f79604g.apply(zu4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, zu4 zu4Var, Double d, Double d2) {
        return (function == null || function.apply(zu4Var) == null || ((ru4) function.apply(zu4Var)).f79602e == null || ((ru4) function.apply(zu4Var)).f79602e.apply(zu4Var) == null) ? Double.valueOf(contrastingTone(d2.doubleValue(), Math.max(7.0d, d.doubleValue()))) : Double.valueOf(contrastingTone(d2.doubleValue(), 7.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$14(zu4 zu4Var, ru4 ru4Var) {
        return ru4Var.f79603f.apply(zu4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, zu4 zu4Var, Function function2, Double d, Double d2) {
        double dDoubleValue = ((Double) function.apply(zu4Var)).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            dDoubleValue = contrastingTone(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            dDoubleValue = contrastingTone(d2.doubleValue(), 3.0d);
        } else if (function2 != null && function2.apply(zu4Var) != null && ((ru4) function2.apply(zu4Var)).f79602e != null && ((ru4) function2.apply(zu4Var)).f79602e.apply(zu4Var) != null) {
            dDoubleValue = contrastingTone(d2.doubleValue(), d.doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d) {
        return d;
    }

    /* JADX INFO: renamed from: t */
    public static double m21562t(double d, double d2, zu4 zu4Var, Function<zu4, a4h> function, Function<ru4, Double> function2) {
        a4h a4hVarApply = function == null ? null : function.apply(zu4Var);
        if (a4hVarApply == null) {
            return d;
        }
        double d3 = a4hVarApply.f406a;
        double dDoubleValue = function2.apply(a4hVarApply.f407b).doubleValue();
        double dAbs = Math.abs(d - dDoubleValue);
        if (dAbs >= d3) {
            return d;
        }
        int i = C12289a.f79607a[a4hVarApply.f408c.ordinal()];
        if (i == 1) {
            return s3a.clampDouble(0.0d, 100.0d, dDoubleValue + d3);
        }
        if (i == 2) {
            return s3a.clampDouble(0.0d, 100.0d, dDoubleValue - d3);
        }
        if (i != 3) {
            return d;
        }
        boolean z = d2 > a4hVarApply.f407b.f79600c.apply(zu4Var).doubleValue();
        double dAbs2 = Math.abs(dAbs - d3);
        return (!z ? d < dAbs2 : d + dAbs2 <= 100.0d) ? d - dAbs2 : d + dAbs2;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }

    public static double toneMaxContrastDefault(Function<zu4, Double> function, final Function<zu4, ru4> function2, final zu4 zu4Var, Function<zu4, a4h> function3) {
        return calculateDynamicTone(zu4Var, function, new Function() { // from class: du4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$toneMaxContrastDefault$17(zu4Var, (ru4) obj);
            }
        }, new BiFunction() { // from class: eu4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ru4.lambda$toneMaxContrastDefault$18(function2, zu4Var, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, null);
    }

    public static double toneMinContrastDefault(final Function<zu4, Double> function, final Function<zu4, ru4> function2, final zu4 zu4Var, Function<zu4, a4h> function3) {
        return calculateDynamicTone(zu4Var, function, new Function() { // from class: fu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$toneMinContrastDefault$14(zu4Var, (ru4) obj);
            }
        }, new BiFunction() { // from class: gu4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ru4.lambda$toneMinContrastDefault$15(function, zu4Var, function2, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, new Function() { // from class: hu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$toneMinContrastDefault$16((Double) obj);
            }
        });
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) <= 60;
    }

    public int getArgb(zu4 zu4Var) {
        int i = getHct(zu4Var).toInt();
        Function<zu4, Double> function = this.f79601d;
        if (function == null) {
            return i;
        }
        return (s3a.clampInt(0, 255, (int) Math.round(function.apply(zu4Var).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public bi7 getHct(zu4 zu4Var) {
        bi7 bi7Var = this.f79606i.get(zu4Var);
        if (bi7Var != null) {
            return bi7Var;
        }
        bi7 bi7VarFrom = bi7.from(this.f79598a.apply(zu4Var).doubleValue(), this.f79599b.apply(zu4Var).doubleValue(), getTone(zu4Var));
        if (this.f79606i.size() > 4) {
            this.f79606i.clear();
        }
        this.f79606i.put(zu4Var, bi7VarFrom);
        return bi7VarFrom;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[PHI: r11
  0x00c9: PHI (r11v1 double) = (r11v0 double), (r11v4 double) binds: [B:19:0x0055, B:33:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getTone(final p000.zu4 r16) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ru4.getTone(zu4):double");
    }

    public static ru4 fromPalette(Function<zu4, z3h> function, Function<zu4, Double> function2, Function<zu4, ru4> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static ru4 fromPalette(final Function<zu4, z3h> function, final Function<zu4, Double> function2, final Function<zu4, ru4> function3, final Function<zu4, a4h> function4) {
        return new ru4(new Function() { // from class: pu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromPalette$5(function, (zu4) obj);
            }
        }, new Function() { // from class: qu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromPalette$6(function, (zu4) obj);
            }
        }, function2, null, function3, new Function() { // from class: zt4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromPalette$7(function2, function3, function4, (zu4) obj);
            }
        }, new Function() { // from class: au4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromPalette$8(function2, function3, function4, (zu4) obj);
            }
        }, function4);
    }

    public static ru4 fromArgb(final int i, Function<zu4, Double> function) {
        return fromPalette(new Function() { // from class: iu4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromArgb$2(i, (zu4) obj);
            }
        }, function);
    }

    public static ru4 fromArgb(final int i, Function<zu4, Double> function, Function<zu4, ru4> function2) {
        return fromPalette(new Function() { // from class: yt4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromArgb$3(i, (zu4) obj);
            }
        }, function, function2);
    }

    public static ru4 fromArgb(final int i, Function<zu4, Double> function, Function<zu4, ru4> function2, Function<zu4, a4h> function3) {
        return fromPalette(new Function() { // from class: ou4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru4.lambda$fromArgb$4(i, (zu4) obj);
            }
        }, function, function2, function3);
    }
}
