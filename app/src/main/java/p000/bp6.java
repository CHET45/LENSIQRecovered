package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,235:1\n54#2,7:236\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:236,7\n*E\n"})
@e0g(parameters = 0)
@p7e({p7e.EnumC10826a.f69935b})
public final class bp6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final bp6 f14373a;

    /* JADX INFO: renamed from: b */
    public static final float f14374b = 100.0f;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final float[] f14375c;

    /* JADX INFO: renamed from: d */
    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public static volatile mxf<ap6> f14376d = null;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final Object[] f14377e;

    /* JADX INFO: renamed from: f */
    public static final float f14378f = 1.03f;

    /* JADX INFO: renamed from: g */
    public static final int f14379g;

    static {
        bp6 bp6Var = new bp6();
        f14373a = bp6Var;
        f14375c = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f14376d = new mxf<>(0, 1, null);
        Object[] objArr = new Object[0];
        f14377e = objArr;
        synchronized (objArr) {
            bp6Var.putInto(f14376d, 1.15f, new cp6(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bp6Var.putInto(f14376d, 1.3f, new cp6(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bp6Var.putInto(f14376d, 1.5f, new cp6(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bp6Var.putInto(f14376d, 1.8f, new cp6(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bp6Var.putInto(f14376d, 2.0f, new cp6(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            bth bthVar = bth.f14751a;
        }
        if (!(bp6Var.getScaleFromKey(f14376d.keyAt(0)) - 0.01f > 1.03f)) {
            h28.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        f14379g = 8;
    }

    private bp6() {
    }

    private final ap6 createInterpolatedTableBetween(ap6 ap6Var, ap6 ap6Var2, float f) {
        float[] fArr = f14375c;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f2 = f14375c[i];
            fArr2[i] = u3a.f86727a.lerp(ap6Var.convertSpToDp(f2), ap6Var2.convertSpToDp(f2), f);
        }
        return new cp6(f14375c, fArr2);
    }

    private final ap6 get(float f) {
        return f14376d.get(getKey(f));
    }

    private final int getKey(float f) {
        return (int) (f * 100.0f);
    }

    @fdi
    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i) {
        return i / 100.0f;
    }

    private final void put(float f, ap6 ap6Var) {
        synchronized (f14377e) {
            mxf<ap6> mxfVarClone = f14376d.clone();
            f14373a.putInto(mxfVarClone, f, ap6Var);
            f14376d = mxfVarClone;
            bth bthVar = bth.f14751a;
        }
    }

    private final void putInto(mxf<ap6> mxfVar, float f, ap6 ap6Var) {
        mxfVar.put(getKey(f), ap6Var);
    }

    @gib
    @f00
    public final ap6 forScale(float f) {
        ap6 ap6VarValueAt;
        if (!isNonLinearFontScalingActive(f)) {
            return null;
        }
        ap6 ap6Var = f14373a.get(f);
        if (ap6Var != null) {
            return ap6Var;
        }
        int iIndexOfKey = f14376d.indexOfKey(getKey(f));
        if (iIndexOfKey >= 0) {
            return f14376d.valueAt(iIndexOfKey);
        }
        int i = -(iIndexOfKey + 1);
        int i2 = i - 1;
        float scaleFromKey = 1.0f;
        if (i >= f14376d.size()) {
            cp6 cp6Var = new cp6(new float[]{1.0f}, new float[]{f});
            put(f, cp6Var);
            return cp6Var;
        }
        if (i2 < 0) {
            float[] fArr = f14375c;
            ap6VarValueAt = new cp6(fArr, fArr);
        } else {
            scaleFromKey = getScaleFromKey(f14376d.keyAt(i2));
            ap6VarValueAt = f14376d.valueAt(i2);
        }
        ap6 ap6VarCreateInterpolatedTableBetween = createInterpolatedTableBetween(ap6VarValueAt, f14376d.valueAt(i), u3a.f86727a.constrainedMap(0.0f, 1.0f, scaleFromKey, getScaleFromKey(f14376d.keyAt(i)), f));
        put(f, ap6VarCreateInterpolatedTableBetween);
        return ap6VarCreateInterpolatedTableBetween;
    }

    @yfb
    public final mxf<ap6> getSLookupTables() {
        return f14376d;
    }

    @f00
    public final boolean isNonLinearFontScalingActive(float f) {
        return f >= 1.03f;
    }

    public final void setSLookupTables(@yfb mxf<ap6> mxfVar) {
        f14376d = mxfVar;
    }
}
