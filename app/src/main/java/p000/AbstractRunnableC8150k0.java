package p000;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p000.dm6;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public abstract class AbstractRunnableC8150k0<V, X extends Throwable, F, T> extends dm6.AbstractC4859a<V> implements Runnable {

    /* JADX INFO: renamed from: F */
    @wx1
    public ja9<? extends V> f52309F;

    /* JADX INFO: renamed from: H */
    @wx1
    public Class<X> f52310H;

    /* JADX INFO: renamed from: L */
    @wx1
    public F f52311L;

    /* JADX INFO: renamed from: k0$a */
    public static final class a<V, X extends Throwable> extends AbstractRunnableC8150k0<V, X, v90<? super X, ? extends V>, ja9<? extends V>> {
        public a(ja9<? extends V> input, Class<X> exceptionType, v90<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractRunnableC8150k0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ja9<? extends V> mo14415r(v90<? super X, ? extends V> fallback, X cause) throws Exception {
            ja9<? extends V> ja9VarApply = fallback.apply(cause);
            v7d.checkNotNull(ja9VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", fallback);
            return ja9VarApply;
        }

        @Override // p000.AbstractRunnableC8150k0
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo14416s(ja9<? extends V> result) {
            setFuture(result);
        }
    }

    /* JADX INFO: renamed from: k0$b */
    public static final class b<V, X extends Throwable> extends AbstractRunnableC8150k0<V, X, lz6<? super X, ? extends V>, V> {
        public b(ja9<? extends V> input, Class<X> exceptionType, lz6<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        @Override // p000.AbstractRunnableC8150k0
        /* JADX INFO: renamed from: s */
        public void mo14416s(@agc V result) {
            set(result);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractRunnableC8150k0
        @agc
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public V mo14415r(lz6<? super X, ? extends V> fallback, X cause) throws Exception {
            return fallback.apply(cause);
        }
    }

    public AbstractRunnableC8150k0(ja9<? extends V> ja9Var, Class<X> cls, F f) {
        this.f52309F = (ja9) v7d.checkNotNull(ja9Var);
        this.f52310H = (Class) v7d.checkNotNull(cls);
        this.f52311L = (F) v7d.checkNotNull(f);
    }

    /* JADX INFO: renamed from: p */
    public static <X extends Throwable, V> ja9<V> m14413p(ja9<? extends V> input, Class<X> exceptionType, v90<? super X, ? extends V> fallback, Executor executor) {
        a aVar = new a(input, exceptionType, fallback);
        input.addListener(aVar, xya.m25560d(executor, aVar));
        return aVar;
    }

    /* JADX INFO: renamed from: q */
    public static <V, X extends Throwable> ja9<V> m14414q(ja9<? extends V> input, Class<X> exceptionType, lz6<? super X, ? extends V> fallback, Executor executor) {
        b bVar = new b(input, exceptionType, fallback);
        input.addListener(bVar, xya.m25560d(executor, bVar));
        return bVar;
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: k */
    public final void mo2822k() {
        m17707m(this.f52309F);
        this.f52309F = null;
        this.f52310H = null;
        this.f52311L = null;
    }

    @Override // p000.AbstractC9640n1
    @wx1
    /* JADX INFO: renamed from: n */
    public String mo2823n() {
        String str;
        ja9<? extends V> ja9Var = this.f52309F;
        Class<X> cls = this.f52310H;
        F f = this.f52311L;
        String strMo2823n = super.mo2823n();
        if (ja9Var != null) {
            str = "inputFuture=[" + ja9Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || f == null) {
            if (strMo2823n == null) {
                return null;
            }
            return str + strMo2823n;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + "]";
    }

    @vp6
    @agc
    /* JADX INFO: renamed from: r */
    public abstract T mo14415r(F fallback, X throwable) throws Exception;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        ja9<? extends V> ja9Var = this.f52309F;
        Class<X> cls = this.f52310H;
        F f = this.f52311L;
        if (((f == null) || ((ja9Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.f52309F = null;
        try {
            e = ja9Var instanceof sa8 ? ta8.tryInternalFastPathGetFailure((sa8) ja9Var) : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + ja9Var.getClass() + " threw " + e4.getClass() + " without a cause");
            }
            e = cause;
        }
        Object done = e == null ? w17.getDone(ja9Var) : null;
        if (e == null) {
            set(tib.m22676a(done));
            return;
        }
        if (!uwc.m23617a(e, cls)) {
            setFuture(ja9Var);
            return;
        }
        try {
            Object objMo14415r = mo14415r(f, e);
            this.f52310H = null;
            this.f52311L = null;
            mo14416s(objMo14415r);
        } catch (Throwable th) {
            try {
                uwc.m23618b(th);
                setException(th);
            } finally {
                this.f52310H = null;
                this.f52311L = null;
            }
        }
    }

    @vp6
    /* JADX INFO: renamed from: s */
    public abstract void mo14416s(@agc T result);
}
