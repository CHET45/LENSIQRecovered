package p000;

import p000.dz2;
import p000.e13;
import p000.m13;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m13 extends AbstractC13302u0 implements dz2 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9081a f59565b = new C9081a(null);

    /* JADX INFO: renamed from: m13$a */
    @rh5
    public static final class C9081a extends AbstractC13806v0<dz2, m13> {
        public /* synthetic */ C9081a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m13 _init_$lambda$0(e13.InterfaceC5040b interfaceC5040b) {
            if (interfaceC5040b instanceof m13) {
                return (m13) interfaceC5040b;
            }
            return null;
        }

        private C9081a() {
            super(dz2.f31343s, new qy6() { // from class: l13
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return m13.C9081a._init_$lambda$0((e13.InterfaceC5040b) obj);
                }
            });
        }
    }

    public m13() {
        super(dz2.f31343s);
    }

    public static /* synthetic */ m13 limitedParallelism$default(m13 m13Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return m13Var.limitedParallelism(i, str);
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable);

    @la8
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        mo29873dispatch(e13Var, runnable);
    }

    @Override // p000.AbstractC13302u0, p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) dz2.C5020a.get(this, interfaceC5041c);
    }

    @Override // p000.dz2
    @yfb
    public final <T> zy2<T> interceptContinuation(@yfb zy2<? super T> zy2Var) {
        return new ve4(this, zy2Var);
    }

    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        return true;
    }

    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return new b69(this, i, str);
    }

    @Override // p000.AbstractC13302u0, p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return dz2.C5020a.minusKey(this, interfaceC5041c);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final m13 plus(@yfb m13 m13Var) {
        return m13Var;
    }

    @Override // p000.dz2
    public final void releaseInterceptedContinuation(@yfb zy2<?> zy2Var) {
        md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((ve4) zy2Var).release$kotlinx_coroutines_core();
    }

    @yfb
    public String toString() {
        return kk3.getClassSimpleName(this) + '@' + kk3.getHexAddress(this);
    }

    @q64(level = u64.f86867c, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @i2e(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ m13 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
