package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1095:1\n382#2,4:1096\n354#2,6:1100\n364#2,3:1107\n367#2,2:1111\n387#2,2:1113\n370#2,6:1115\n389#2:1121\n1810#3:1106\n1672#3:1110\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n668#1:1096,4\n668#1:1100,6\n668#1:1107,3\n668#1:1111,2\n668#1:1113,2\n668#1:1115,6\n668#1:1121\n668#1:1106\n668#1:1110\n*E\n"})
@vw7
public final class ms8<T> implements ct4<T> {

    /* JADX INFO: renamed from: b */
    public static final int f61938b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9496b<T> f61939a;

    /* JADX INFO: renamed from: ms8$a */
    @e0g(parameters = 0)
    public static final class C9495a<T> extends js8<T> {

        /* JADX INFO: renamed from: e */
        public static final int f61940e = 8;

        /* JADX INFO: renamed from: d */
        public int f61941d;

        public /* synthetic */ C9495a(Object obj, hv4 hv4Var, int i, jt3 jt3Var) {
            this(obj, hv4Var, i);
        }

        public boolean equals(@gib Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9495a)) {
                return false;
            }
            C9495a c9495a = (C9495a) obj;
            return md8.areEqual(c9495a.getValue$animation_core_release(), getValue$animation_core_release()) && md8.areEqual(c9495a.getEasing$animation_core_release(), getEasing$animation_core_release()) && w40.m32870equalsimpl0(c9495a.f61941d, this.f61941d);
        }

        /* JADX INFO: renamed from: getArcMode--9T-Mq4$animation_core_release, reason: not valid java name */
        public final int m31045getArcMode9TMq4$animation_core_release() {
            return this.f61941d;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + w40.m32871hashCodeimpl(this.f61941d)) * 31) + getEasing$animation_core_release().hashCode();
        }

        /* JADX INFO: renamed from: setArcMode-Rur9ykg$animation_core_release, reason: not valid java name */
        public final void m31046setArcModeRur9ykg$animation_core_release(int i) {
            this.f61941d = i;
        }

        public /* synthetic */ C9495a(Object obj, hv4 hv4Var, int i, int i2, jt3 jt3Var) {
            this(obj, (i2 & 2) != 0 ? qv4.getLinearEasing() : hv4Var, (i2 & 4) != 0 ? w40.f93186b.m32876getArcLinear9TMq4() : i, null);
        }

        private C9495a(T t, hv4 hv4Var, int i) {
            super(t, hv4Var, null);
            this.f61941d = i;
        }
    }

    /* JADX INFO: renamed from: ms8$b */
    @dwf({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1095:1\n26#2:1096\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n*L\n617#1:1096\n*E\n"})
    @e0g(parameters = 2)
    public static final class C9496b<T> extends ns8<T, C9495a<T>> {

        /* JADX INFO: renamed from: e */
        public static final int f61942e = 0;

        public C9496b() {
            super(null);
        }

        @yfb
        @jg5
        /* JADX INFO: renamed from: using-ngzHuyU, reason: not valid java name */
        public final C9495a<T> m31047usingngzHuyU(@yfb C9495a<T> c9495a, int i) {
            c9495a.m31046setArcModeRur9ykg$animation_core_release(i);
            return c9495a;
        }

        @q64(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @i2e(expression = "this using easing", imports = {}))
        public final void with(@yfb C9495a<T> c9495a, @yfb hv4 hv4Var) {
            c9495a.setEasing$animation_core_release(hv4Var);
        }

        @Override // p000.ns8
        @yfb
        /* JADX INFO: renamed from: at */
        public C9495a<T> mo17540at(T t, @h78(from = 0) int i) {
            C9495a<T> c9495a = new C9495a<>(t, null, 0, 6, null);
            getKeyframes$animation_core_release().set(i, c9495a);
            return c9495a;
        }

        @Override // p000.ns8
        @yfb
        public C9495a<T> atFraction(T t, @y46(from = 0.0d, m25645to = 1.0d) float f) {
            return mo17540at((Object) t, Math.round(getDurationMillis() * f));
        }

        @Override // p000.ns8
        @yfb
        public C9495a<T> createEntityFor$animation_core_release(T t) {
            return new C9495a<>(t, null, 0, 6, null);
        }
    }

    public ms8(@yfb C9496b<T> c9496b) {
        this.f61939a = c9496b;
    }

    @yfb
    public final C9496b<T> getConfig() {
        return this.f61939a;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> c4i<V> vectorize(@yfb alh<T, V> alhVar) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        g5b g5bVar = new g5b(this.f61939a.getKeyframes$animation_core_release().getSize() + 2);
        i5b i5bVar = new i5b(this.f61939a.getKeyframes$animation_core_release().getSize());
        i5b<C9495a<T>> keyframes$animation_core_release = this.f61939a.getKeyframes$animation_core_release();
        int[] iArr3 = keyframes$animation_core_release.f100489b;
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
                            int i7 = iArr3[i6];
                            C9495a c9495a = (C9495a) objArr[i6];
                            g5bVar.add(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i5bVar.set(i7, new b4i(alhVar.getConvertToVector().invoke(c9495a.getValue$animation_core_release()), c9495a.getEasing$animation_core_release(), c9495a.m31045getArcMode9TMq4$animation_core_release(), null));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f61939a.getKeyframes$animation_core_release().contains(0)) {
            g5bVar.add(0, 0);
        }
        if (!this.f61939a.getKeyframes$animation_core_release().contains(this.f61939a.getDurationMillis())) {
            g5bVar.add(this.f61939a.getDurationMillis());
        }
        g5bVar.sort();
        return new c4i<>(g5bVar, i5bVar, this.f61939a.getDurationMillis(), this.f61939a.getDelayMillis(), qv4.getLinearEasing(), w40.f93186b.m32876getArcLinear9TMq4(), null);
    }
}
