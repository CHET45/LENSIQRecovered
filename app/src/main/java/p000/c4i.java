package p000;

import java.util.Iterator;
import java.util.Map;
import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1076:1\n215#2,2:1077\n215#2,2:1079\n70#3:1081\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n254#1:1077,2\n268#1:1079,2\n501#1:1081\n*E\n"})
@e0g(parameters = 0)
public final class c4i<V extends AbstractC16313zy> implements w3i<V> {

    /* JADX INFO: renamed from: p */
    public static final int f15766p = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final q68 f15767a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final y68<b4i<V>> f15768b;

    /* JADX INFO: renamed from: c */
    public final int f15769c;

    /* JADX INFO: renamed from: d */
    public final int f15770d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final hv4 f15771e;

    /* JADX INFO: renamed from: f */
    public final int f15772f;

    /* JADX INFO: renamed from: g */
    public int[] f15773g;

    /* JADX INFO: renamed from: h */
    public float[] f15774h;

    /* JADX INFO: renamed from: i */
    public V f15775i;

    /* JADX INFO: renamed from: j */
    public V f15776j;

    /* JADX INFO: renamed from: k */
    public V f15777k;

    /* JADX INFO: renamed from: l */
    public V f15778l;

    /* JADX INFO: renamed from: m */
    public float[] f15779m;

    /* JADX INFO: renamed from: n */
    public float[] f15780n;

    /* JADX INFO: renamed from: o */
    public x40 f15781o;

    public /* synthetic */ c4i(q68 q68Var, y68 y68Var, int i, int i2, hv4 hv4Var, int i3, jt3 jt3Var) {
        this(q68Var, y68Var, i, i2, hv4Var, i3);
    }

    private final int findEntryForTimeMillis(int i) {
        int iBinarySearch$default = r68.binarySearch$default(this.f15767a, i, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTime(int i) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i), i, false);
    }

    private final float getEasedTimeFromIndex(int i, int i2, boolean z) {
        hv4 easing;
        float f;
        q68 q68Var = this.f15767a;
        if (i >= q68Var.f73325b - 1) {
            f = i2;
        } else {
            int i3 = q68Var.get(i);
            int i4 = this.f15767a.get(i + 1);
            if (i2 == i3) {
                f = i3;
            } else {
                int i5 = i4 - i3;
                b4i<V> b4iVar = this.f15768b.get(i3);
                if (b4iVar == null || (easing = b4iVar.getEasing()) == null) {
                    easing = this.f15771e;
                }
                float f2 = i5;
                float fTransform = easing.transform((i2 - i3) / f2);
                if (z) {
                    return fTransform;
                }
                f = (f2 * fTransform) + i3;
            }
        }
        return f / 1000;
    }

    private final void init(V v, V v2, V v3) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.f15781o != null;
        if (this.f15775i == null) {
            this.f15775i = (V) C1667az.newInstance(v);
            this.f15776j = (V) C1667az.newInstance(v3);
            int size = this.f15767a.getSize();
            float[] fArr3 = new float[size];
            for (int i = 0; i < size; i++) {
                fArr3[i] = this.f15767a.get(i) / 1000;
            }
            this.f15774h = fArr3;
            int size2 = this.f15767a.getSize();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                b4i<V> b4iVar = this.f15768b.get(this.f15767a.get(i2));
                int iM27954getArcMode9TMq4 = b4iVar != null ? b4iVar.m27954getArcMode9TMq4() : this.f15772f;
                if (!w40.m32870equalsimpl0(iM27954getArcMode9TMq4, w40.f93186b.m32876getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i2] = iM27954getArcMode9TMq4;
            }
            this.f15773g = iArr;
        }
        if (z) {
            float[] fArr4 = null;
            if (this.f15781o != null) {
                V v4 = this.f15777k;
                if (v4 == null) {
                    md8.throwUninitializedPropertyAccessException("lastInitialValue");
                    v4 = null;
                }
                if (md8.areEqual(v4, v)) {
                    V v5 = this.f15778l;
                    if (v5 == null) {
                        md8.throwUninitializedPropertyAccessException("lastTargetValue");
                        v5 = null;
                    }
                    if (md8.areEqual(v5, v2)) {
                        return;
                    }
                }
            }
            this.f15777k = v;
            this.f15778l = v2;
            int size$animation_core_release = (v.getSize$animation_core_release() % 2) + v.getSize$animation_core_release();
            this.f15779m = new float[size$animation_core_release];
            this.f15780n = new float[size$animation_core_release];
            int size3 = this.f15767a.getSize();
            float[][] fArr5 = new float[size3][];
            for (int i3 = 0; i3 < size3; i3++) {
                int i4 = this.f15767a.get(i3);
                if (i4 != 0) {
                    if (i4 != getDurationMillis()) {
                        fArr = new float[size$animation_core_release];
                        b4i<V> b4iVar2 = this.f15768b.get(i4);
                        md8.checkNotNull(b4iVar2);
                        AbstractC16313zy vectorValue = b4iVar2.getVectorValue();
                        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
                            fArr[i5] = vectorValue.get$animation_core_release(i5);
                        }
                    } else if (this.f15768b.contains(i4)) {
                        fArr = new float[size$animation_core_release];
                        b4i<V> b4iVar3 = this.f15768b.get(i4);
                        md8.checkNotNull(b4iVar3);
                        AbstractC16313zy vectorValue2 = b4iVar3.getVectorValue();
                        for (int i6 = 0; i6 < size$animation_core_release; i6++) {
                            fArr[i6] = vectorValue2.get$animation_core_release(i6);
                        }
                    } else {
                        fArr2 = new float[size$animation_core_release];
                        for (int i7 = 0; i7 < size$animation_core_release; i7++) {
                            fArr2[i7] = v2.get$animation_core_release(i7);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.f15768b.contains(i4)) {
                    fArr = new float[size$animation_core_release];
                    b4i<V> b4iVar4 = this.f15768b.get(i4);
                    md8.checkNotNull(b4iVar4);
                    AbstractC16313zy vectorValue3 = b4iVar4.getVectorValue();
                    for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                        fArr[i8] = vectorValue3.get$animation_core_release(i8);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size$animation_core_release];
                    for (int i9 = 0; i9 < size$animation_core_release; i9++) {
                        fArr2[i9] = v.get$animation_core_release(i9);
                    }
                }
                fArr5[i3] = fArr2;
            }
            int[] iArr2 = this.f15773g;
            if (iArr2 == null) {
                md8.throwUninitializedPropertyAccessException("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.f15774h;
            if (fArr6 == null) {
                md8.throwUninitializedPropertyAccessException("times");
            } else {
                fArr4 = fArr6;
            }
            this.f15781o = new x40(iArr2, fArr4, fArr5);
        }
    }

    @Override // p000.w3i
    public int getDelayMillis() {
        return this.f15770d;
    }

    @Override // p000.w3i
    public int getDurationMillis() {
        return this.f15769c;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        int iClampPlayTime = (int) u3i.clampPlayTime(this, j / 1000000);
        if (this.f15768b.contains(iClampPlayTime)) {
            b4i<V> b4iVar = this.f15768b.get(iClampPlayTime);
            md8.checkNotNull(b4iVar);
            return (V) b4iVar.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (iClampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        int i = 0;
        if (this.f15781o == null) {
            int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
            float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
            int i2 = this.f15767a.get(iFindEntryForTimeMillis);
            if (this.f15768b.contains(i2)) {
                b4i<V> b4iVar2 = this.f15768b.get(i2);
                md8.checkNotNull(b4iVar2);
                v = (V) b4iVar2.getVectorValue();
            }
            int i3 = this.f15767a.get(iFindEntryForTimeMillis + 1);
            if (this.f15768b.contains(i3)) {
                b4i<V> b4iVar3 = this.f15768b.get(i3);
                md8.checkNotNull(b4iVar3);
                v2 = (V) b4iVar3.getVectorValue();
            }
            V v4 = this.f15775i;
            if (v4 == null) {
                md8.throwUninitializedPropertyAccessException("valueVector");
                v4 = null;
            }
            int size$animation_core_release = v4.getSize$animation_core_release();
            while (i < size$animation_core_release) {
                V v5 = this.f15775i;
                if (v5 == null) {
                    md8.throwUninitializedPropertyAccessException("valueVector");
                    v5 = null;
                }
                v5.set$animation_core_release(i, g3i.lerp(v.get$animation_core_release(i), v2.get$animation_core_release(i), easedTimeFromIndex));
                i++;
            }
            V v6 = this.f15775i;
            if (v6 != null) {
                return v6;
            }
            md8.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        float easedTime = getEasedTime(iClampPlayTime);
        x40 x40Var = this.f15781o;
        if (x40Var == null) {
            md8.throwUninitializedPropertyAccessException("arcSpline");
            x40Var = null;
        }
        float[] fArr = this.f15779m;
        if (fArr == null) {
            md8.throwUninitializedPropertyAccessException("posArray");
            fArr = null;
        }
        x40Var.getPos(easedTime, fArr);
        float[] fArr2 = this.f15779m;
        if (fArr2 == null) {
            md8.throwUninitializedPropertyAccessException("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i < length) {
            V v7 = this.f15775i;
            if (v7 == null) {
                md8.throwUninitializedPropertyAccessException("valueVector");
                v7 = null;
            }
            float[] fArr3 = this.f15779m;
            if (fArr3 == null) {
                md8.throwUninitializedPropertyAccessException("posArray");
                fArr3 = null;
            }
            v7.set$animation_core_release(i, fArr3[i]);
            i++;
        }
        V v8 = this.f15775i;
        if (v8 != null) {
            return v8;
        }
        md8.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        long jClampPlayTime = u3i.clampPlayTime(this, j / 1000000);
        if (jClampPlayTime < 0) {
            return v3;
        }
        init(v, v2, v3);
        int i = 0;
        if (this.f15781o == null) {
            AbstractC16313zy valueFromMillis = u3i.getValueFromMillis(this, jClampPlayTime - 1, v, v2, v3);
            AbstractC16313zy valueFromMillis2 = u3i.getValueFromMillis(this, jClampPlayTime, v, v2, v3);
            int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
            while (i < size$animation_core_release) {
                V v4 = this.f15776j;
                if (v4 == null) {
                    md8.throwUninitializedPropertyAccessException("velocityVector");
                    v4 = null;
                }
                v4.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
                i++;
            }
            V v5 = this.f15776j;
            if (v5 != null) {
                return v5;
            }
            md8.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        float easedTime = getEasedTime((int) jClampPlayTime);
        x40 x40Var = this.f15781o;
        if (x40Var == null) {
            md8.throwUninitializedPropertyAccessException("arcSpline");
            x40Var = null;
        }
        float[] fArr = this.f15780n;
        if (fArr == null) {
            md8.throwUninitializedPropertyAccessException("slopeArray");
            fArr = null;
        }
        x40Var.getSlope(easedTime, fArr);
        float[] fArr2 = this.f15780n;
        if (fArr2 == null) {
            md8.throwUninitializedPropertyAccessException("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i < length) {
            V v6 = this.f15776j;
            if (v6 == null) {
                md8.throwUninitializedPropertyAccessException("velocityVector");
                v6 = null;
            }
            float[] fArr3 = this.f15780n;
            if (fArr3 == null) {
                md8.throwUninitializedPropertyAccessException("slopeArray");
                fArr3 = null;
            }
            v6.set$animation_core_release(i, fArr3[i]);
            i++;
        }
        V v7 = this.f15776j;
        if (v7 != null) {
            return v7;
        }
        md8.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    private c4i(q68 q68Var, y68<b4i<V>> y68Var, int i, int i2, hv4 hv4Var, int i3) {
        this.f15767a = q68Var;
        this.f15768b = y68Var;
        this.f15769c = i;
        this.f15770d = i2;
        this.f15771e = hv4Var;
        this.f15772f = i3;
    }

    public /* synthetic */ c4i(Map map, int i, int i2, int i3, jt3 jt3Var) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }

    public c4i(@yfb Map<Integer, ? extends scc<? extends V, ? extends hv4>> map, int i, int i2) {
        g5b g5bVar = new g5b(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends scc<? extends V, ? extends hv4>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            g5bVar.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            g5bVar.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i))) {
            g5bVar.add(i);
        }
        g5bVar.sort();
        i5b i5bVar = new i5b(0, 1, null);
        for (Map.Entry<Integer, ? extends scc<? extends V, ? extends hv4>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            scc<? extends V, ? extends hv4> value = entry.getValue();
            i5bVar.set(iIntValue, new b4i(value.getFirst(), value.getSecond(), w40.f93186b.m32876getArcLinear9TMq4(), null));
        }
        this(g5bVar, i5bVar, i, i2, qv4.getLinearEasing(), w40.f93186b.m32876getArcLinear9TMq4(), null);
    }
}
