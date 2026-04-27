package p000;

import p000.p7e;

/* JADX INFO: renamed from: ky */
/* JADX INFO: loaded from: classes.dex */
public final class C8551ky {

    /* JADX INFO: renamed from: a */
    public static final long f55612a = 1000000;

    /* JADX INFO: renamed from: b */
    public static final long f55613b = 1000;

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: ky$a */
    public static final class a<V> extends tt8 implements qy6<V, V> {

        /* JADX INFO: renamed from: a */
        public static final a f55614a = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
        @Override // p000.qy6
        @yfb
        public final AbstractC16313zy invoke(@yfb AbstractC16313zy abstractC16313zy) {
            return abstractC16313zy;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: ky$b */
    public static final class b<V> extends tt8 implements qy6<V, V> {

        /* JADX INFO: renamed from: a */
        public static final b f55615a = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
        @Override // p000.qy6
        @yfb
        public final AbstractC16313zy invoke(@yfb AbstractC16313zy abstractC16313zy) {
            return abstractC16313zy;
        }
    }

    @yfb
    public static final uk3<Float, C14294vy> DecayAnimation(@yfb e46 e46Var, float f, float f2) {
        return new uk3<>((vk3<Float>) xk3.generateDecayAnimationSpec(e46Var), g3i.getVectorConverter(d46.f28382a), Float.valueOf(f), C1667az.AnimationVector(f2));
    }

    public static /* synthetic */ uk3 DecayAnimation$default(e46 e46Var, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return DecayAnimation(e46Var, f, f2);
    }

    @yfb
    public static final <T, V extends AbstractC16313zy> qmg<T, V> TargetBasedAnimation(@yfb InterfaceC11178py<T> interfaceC11178py, @yfb alh<T, V> alhVar, T t, T t2, T t3) {
        return new qmg<>(interfaceC11178py, alhVar, t, t2, alhVar.getConvertToVector().invoke(t3));
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final <V extends AbstractC16313zy> qmg<V, V> createAnimation(@yfb t3i<V> t3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
        return new qmg<>(t3iVar, (alh<V, V>) g3i.TwoWayConverter(a.f55614a, b.f55615a), v, v2, v3);
    }

    public static final long getDurationMillis(@yfb InterfaceC6643gy<?, ?> interfaceC6643gy) {
        return interfaceC6643gy.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AbstractC16313zy> T getVelocityFromNanos(@yfb InterfaceC6643gy<T, V> interfaceC6643gy, long j) {
        return (T) interfaceC6643gy.getTypeConverter().getConvertFromVector().invoke(interfaceC6643gy.getVelocityVectorFromNanos(j));
    }
}
