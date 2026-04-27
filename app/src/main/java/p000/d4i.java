package p000;

import androidx.lifecycle.C1171x;
import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,203:1\n70#2:204\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n174#1:204\n*E\n"})
@e0g(parameters = 0)
@jg5
public final class d4i<V extends AbstractC16313zy> implements w3i<V> {

    /* JADX INFO: renamed from: m */
    public static final int f28434m = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final q68 f28435a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final y68<scc<V, hv4>> f28436b;

    /* JADX INFO: renamed from: c */
    public final int f28437c;

    /* JADX INFO: renamed from: d */
    public final int f28438d;

    /* JADX INFO: renamed from: e */
    public final float f28439e;

    /* JADX INFO: renamed from: f */
    public V f28440f;

    /* JADX INFO: renamed from: g */
    public V f28441g;

    /* JADX INFO: renamed from: h */
    public float[] f28442h;

    /* JADX INFO: renamed from: i */
    public nya f28443i;

    /* JADX INFO: renamed from: j */
    public float[][] f28444j;

    /* JADX INFO: renamed from: k */
    @gib
    public V f28445k;

    /* JADX INFO: renamed from: l */
    @gib
    public V f28446l;

    public d4i(@yfb q68 q68Var, @yfb y68<scc<V, hv4>> y68Var, int i, int i2, float f) {
        this.f28435a = q68Var;
        this.f28436b = y68Var;
        this.f28437c = i;
        this.f28438d = i2;
        this.f28439e = f;
    }

    private final int findEntryForTimeMillis(int i) {
        int iBinarySearch$default = r68.binarySearch$default(this.f28435a, i, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTimeFromIndex(int i, int i2) {
        float f;
        q68 q68Var = this.f28435a;
        if (i >= q68Var.f73325b - 1) {
            f = i2;
        } else {
            int i3 = q68Var.get(i);
            int i4 = this.f28435a.get(i + 1);
            if (i2 != i3) {
                float f2 = i4 - i3;
                return ((f2 * getEasing(i).transform((i2 - i3) / f2)) + i3) / 1000;
            }
            f = i3;
        }
        return f / 1000;
    }

    private final hv4 getEasing(int i) {
        hv4 second;
        scc<V, hv4> sccVar = this.f28436b.get(this.f28435a.get(i));
        return (sccVar == null || (second = sccVar.getSecond()) == null) ? qv4.getLinearEasing() : second;
    }

    private final void init(V v, V v2, V v3) {
        float[] fArr;
        float[] fArr2;
        if (this.f28440f == null) {
            this.f28440f = (V) C1667az.newInstance(v);
            this.f28441g = (V) C1667az.newInstance(v3);
            int size = this.f28435a.getSize();
            float[] fArr3 = new float[size];
            for (int i = 0; i < size; i++) {
                fArr3[i] = this.f28435a.get(i) / 1000;
            }
            this.f28442h = fArr3;
        }
        if (this.f28443i != null && md8.areEqual(this.f28445k, v) && md8.areEqual(this.f28446l, v2)) {
            return;
        }
        boolean zAreEqual = md8.areEqual(this.f28445k, v);
        boolean zAreEqual2 = md8.areEqual(this.f28446l, v2);
        this.f28445k = v;
        this.f28446l = v2;
        int size$animation_core_release = v.getSize$animation_core_release();
        float[][] fArr4 = null;
        if (this.f28444j == null) {
            int size2 = this.f28435a.getSize();
            float[][] fArr5 = new float[size2][];
            for (int i2 = 0; i2 < size2; i2++) {
                int i3 = this.f28435a.get(i2);
                if (i3 != 0) {
                    if (i3 != getDurationMillis()) {
                        fArr = new float[size$animation_core_release];
                        scc<V, hv4> sccVar = this.f28436b.get(i3);
                        md8.checkNotNull(sccVar);
                        V first = sccVar.getFirst();
                        for (int i4 = 0; i4 < size$animation_core_release; i4++) {
                            fArr[i4] = first.get$animation_core_release(i4);
                        }
                    } else if (this.f28436b.contains(i3)) {
                        fArr = new float[size$animation_core_release];
                        scc<V, hv4> sccVar2 = this.f28436b.get(i3);
                        md8.checkNotNull(sccVar2);
                        V first2 = sccVar2.getFirst();
                        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
                            fArr[i5] = first2.get$animation_core_release(i5);
                        }
                    } else {
                        fArr2 = new float[size$animation_core_release];
                        for (int i6 = 0; i6 < size$animation_core_release; i6++) {
                            fArr2[i6] = v2.get$animation_core_release(i6);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.f28436b.contains(i3)) {
                    fArr = new float[size$animation_core_release];
                    scc<V, hv4> sccVar3 = this.f28436b.get(i3);
                    md8.checkNotNull(sccVar3);
                    V first3 = sccVar3.getFirst();
                    for (int i7 = 0; i7 < size$animation_core_release; i7++) {
                        fArr[i7] = first3.get$animation_core_release(i7);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size$animation_core_release];
                    for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                        fArr2[i8] = v.get$animation_core_release(i8);
                    }
                }
                fArr5[i2] = fArr2;
            }
            this.f28444j = fArr5;
        } else {
            if (!zAreEqual && !this.f28436b.contains(0)) {
                float[][] fArr6 = this.f28444j;
                if (fArr6 == null) {
                    md8.throwUninitializedPropertyAccessException(C1171x.f7958g);
                    fArr6 = null;
                }
                int iBinarySearch$default = r68.binarySearch$default(this.f28435a, 0, 0, 0, 6, null);
                float[] fArr7 = new float[size$animation_core_release];
                for (int i9 = 0; i9 < size$animation_core_release; i9++) {
                    fArr7[i9] = v.get$animation_core_release(i9);
                }
                fArr6[iBinarySearch$default] = fArr7;
            }
            if (!zAreEqual2 && !this.f28436b.contains(getDurationMillis())) {
                float[][] fArr8 = this.f28444j;
                if (fArr8 == null) {
                    md8.throwUninitializedPropertyAccessException(C1171x.f7958g);
                    fArr8 = null;
                }
                int iBinarySearch$default2 = r68.binarySearch$default(this.f28435a, getDurationMillis(), 0, 0, 6, null);
                float[] fArr9 = new float[size$animation_core_release];
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    fArr9[i10] = v2.get$animation_core_release(i10);
                }
                fArr8[iBinarySearch$default2] = fArr9;
            }
        }
        float[] fArr10 = this.f28442h;
        if (fArr10 == null) {
            md8.throwUninitializedPropertyAccessException("times");
            fArr10 = null;
        }
        float[][] fArr11 = this.f28444j;
        if (fArr11 == null) {
            md8.throwUninitializedPropertyAccessException(C1171x.f7958g);
        } else {
            fArr4 = fArr11;
        }
        this.f28443i = new nya(fArr10, fArr4, this.f28439e);
    }

    @Override // p000.w3i
    public int getDelayMillis() {
        return this.f28438d;
    }

    @Override // p000.w3i
    public int getDurationMillis() {
        return this.f28437c;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        int iClampPlayTime = (int) u3i.clampPlayTime(this, j / 1000000);
        if (this.f28436b.containsKey(iClampPlayTime)) {
            scc<V, hv4> sccVar = this.f28436b.get(iClampPlayTime);
            md8.checkNotNull(sccVar);
            return sccVar.getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (iClampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        nya nyaVar = this.f28443i;
        if (nyaVar == null) {
            md8.throwUninitializedPropertyAccessException("monoSpline");
            nyaVar = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v4 = this.f28440f;
        if (v4 == null) {
            md8.throwUninitializedPropertyAccessException("valueVector");
            v4 = null;
        }
        nyaVar.getPos(easedTimeFromIndex, v4, iFindEntryForTimeMillis);
        V v5 = this.f28440f;
        if (v5 != null) {
            return v5;
        }
        md8.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        int iClampPlayTime = (int) u3i.clampPlayTime(this, j / 1000000);
        if (iClampPlayTime < 0) {
            return v3;
        }
        init(v, v2, v3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        nya nyaVar = this.f28443i;
        if (nyaVar == null) {
            md8.throwUninitializedPropertyAccessException("monoSpline");
            nyaVar = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v4 = this.f28441g;
        if (v4 == null) {
            md8.throwUninitializedPropertyAccessException("velocityVector");
            v4 = null;
        }
        nyaVar.getSlope(easedTimeFromIndex, v4, iFindEntryForTimeMillis);
        V v5 = this.f28441g;
        if (v5 != null) {
            return v5;
        }
        md8.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
