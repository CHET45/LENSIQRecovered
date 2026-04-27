package p000;

import p000.ms8;
import p000.os8;

/* JADX INFO: renamed from: qy */
/* JADX INFO: loaded from: classes.dex */
public final class C11760qy {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC16313zy> V convert(alh<T, V> alhVar, T t) {
        if (t == null) {
            return null;
        }
        return alhVar.getConvertToVector().invoke(t);
    }

    @f0g
    @yfb
    public static final <T> InterfaceC11178py<T> delayed(@yfb InterfaceC11178py<T> interfaceC11178py, long j) {
        return new q1g(interfaceC11178py, j);
    }

    @f0g
    @q64(level = u64.f86867c, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ f18 infiniteRepeatable(ct4 ct4Var, x1e x1eVar) {
        return new f18(ct4Var, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }

    public static /* synthetic */ f18 infiniteRepeatable$default(ct4 ct4Var, x1e x1eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            x1eVar = x1e.Restart;
        }
        return infiniteRepeatable(ct4Var, x1eVar);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> f18<T> m32054infiniteRepeatable9IiC70o(@yfb ct4<T> ct4Var, @yfb x1e x1eVar, long j) {
        return new f18<>(ct4Var, x1eVar, j, (jt3) null);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ f18 m32055infiniteRepeatable9IiC70o$default(ct4 ct4Var, x1e x1eVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            x1eVar = x1e.Restart;
        }
        if ((i & 4) != 0) {
            j = s1g.m32247constructorimpl$default(0, 0, 2, null);
        }
        return m32054infiniteRepeatable9IiC70o(ct4Var, x1eVar, j);
    }

    @f0g
    @yfb
    public static final <T> ms8<T> keyframes(@yfb qy6<? super ms8.C9496b<T>, bth> qy6Var) {
        ms8.C9496b c9496b = new ms8.C9496b();
        qy6Var.invoke(c9496b);
        return new ms8<>(c9496b);
    }

    @yfb
    @jg5
    public static final <T> os8<T> keyframesWithSpline(@yfb qy6<? super os8.C10631a<T>, bth> qy6Var) {
        os8.C10631a c10631a = new os8.C10631a();
        qy6Var.invoke(c10631a);
        return new os8<>(c10631a);
    }

    @f0g
    @q64(level = u64.f86867c, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ c2e repeatable(int i, ct4 ct4Var, x1e x1eVar) {
        return new c2e(i, ct4Var, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }

    public static /* synthetic */ c2e repeatable$default(int i, ct4 ct4Var, x1e x1eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            x1eVar = x1e.Restart;
        }
        return repeatable(i, ct4Var, x1eVar);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> c2e<T> m32056repeatable91I0pcU(int i, @yfb ct4<T> ct4Var, @yfb x1e x1eVar, long j) {
        return new c2e<>(i, ct4Var, x1eVar, j, (jt3) null);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ c2e m32057repeatable91I0pcU$default(int i, ct4 ct4Var, x1e x1eVar, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            x1eVar = x1e.Restart;
        }
        if ((i2 & 8) != 0) {
            j = s1g.m32247constructorimpl$default(0, 0, 2, null);
        }
        return m32056repeatable91I0pcU(i, ct4Var, x1eVar, j);
    }

    @f0g
    @yfb
    public static final <T> osf<T> snap(int i) {
        return new osf<>(i);
    }

    public static /* synthetic */ osf snap$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snap(i);
    }

    @f0g
    @yfb
    public static final <T> mzf<T> spring(float f, float f2, @gib T t) {
        return new mzf<>(f, f2, t);
    }

    public static /* synthetic */ mzf spring$default(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    @f0g
    @yfb
    public static final <T> wkh<T> tween(int i, int i2, @yfb hv4 hv4Var) {
        return new wkh<>(i, i2, hv4Var);
    }

    public static /* synthetic */ wkh tween$default(int i, int i2, hv4 hv4Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            hv4Var = qv4.getFastOutSlowInEasing();
        }
        return tween(i, i2, hv4Var);
    }

    @yfb
    @jg5
    public static final <T> os8<T> keyframesWithSpline(@y46(from = 0.0d, m25645to = 1.0d) float f, @yfb qy6<? super os8.C10631a<T>, bth> qy6Var) {
        os8.C10631a c10631a = new os8.C10631a();
        qy6Var.invoke(c10631a);
        return new os8<>(c10631a, f);
    }
}
