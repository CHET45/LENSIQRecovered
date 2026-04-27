package p000;

import p000.ms8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1095:1\n382#2,4:1096\n354#2,6:1100\n364#2,3:1107\n367#2,2:1111\n387#2,2:1113\n370#2,6:1115\n389#2:1121\n1810#3:1106\n1672#3:1110\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n780#1:1096,4\n780#1:1100,6\n780#1:1107,3\n780#1:1111,2\n780#1:1113,2\n780#1:1115,6\n780#1:1121\n780#1:1106\n780#1:1110\n*E\n"})
@jg5
@vw7
public final class os8<T> implements ct4<T> {

    /* JADX INFO: renamed from: c */
    public static final int f68557c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C10631a<T> f68558a;

    /* JADX INFO: renamed from: b */
    public float f68559b;

    /* JADX INFO: renamed from: os8$a */
    @e0g(parameters = 2)
    @jg5
    public static final class C10631a<T> extends ns8<T, ms8.C9495a<T>> {

        /* JADX INFO: renamed from: e */
        public static final int f68560e = 0;

        public C10631a() {
            super(null);
        }

        @Override // p000.ns8
        @yfb
        public ms8.C9495a<T> createEntityFor$animation_core_release(T t) {
            return new ms8.C9495a<>(t, null, 0, 6, null);
        }
    }

    public os8(@yfb C10631a<T> c10631a) {
        this.f68558a = c10631a;
        this.f68559b = Float.NaN;
    }

    @yfb
    public final C10631a<T> getConfig() {
        return this.f68558a;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> w3i<V> vectorize(@yfb alh<T, V> alhVar) {
        long[] jArr;
        long[] jArr2;
        int i;
        g5b g5bVar = new g5b(this.f68558a.getKeyframes$animation_core_release().getSize() + 2);
        i5b i5bVar = new i5b(this.f68558a.getKeyframes$animation_core_release().getSize());
        i5b<ms8.C9495a<T>> keyframes$animation_core_release = this.f68558a.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.f100489b;
        Object[] objArr = keyframes$animation_core_release.f100490c;
        long[] jArr3 = keyframes$animation_core_release.f100488a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            ms8.C9495a c9495a = (ms8.C9495a) objArr[i6];
                            g5bVar.add(i7);
                            jArr2 = jArr3;
                            i5bVar.set(i7, new scc(alhVar.getConvertToVector().invoke(c9495a.getValue$animation_core_release()), c9495a.getEasing$animation_core_release()));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        if (!this.f68558a.getKeyframes$animation_core_release().contains(0)) {
            g5bVar.add(0, 0);
        }
        if (!this.f68558a.getKeyframes$animation_core_release().contains(this.f68558a.getDurationMillis())) {
            g5bVar.add(this.f68558a.getDurationMillis());
        }
        g5bVar.sort();
        return new d4i(g5bVar, i5bVar, this.f68558a.getDurationMillis(), this.f68558a.getDelayMillis(), this.f68559b);
    }

    public os8(@yfb C10631a<T> c10631a, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        this(c10631a);
        this.f68559b = f;
    }
}
