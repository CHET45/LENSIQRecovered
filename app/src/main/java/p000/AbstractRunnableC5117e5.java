package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p000.dm6;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public abstract class AbstractRunnableC5117e5<I, O, F, T> extends dm6.AbstractC4859a<O> implements Runnable {

    /* JADX INFO: renamed from: F */
    @wx1
    public ja9<? extends I> f31802F;

    /* JADX INFO: renamed from: H */
    @wx1
    public F f31803H;

    /* JADX INFO: renamed from: e5$a */
    public static final class a<I, O> extends AbstractRunnableC5117e5<I, O, v90<? super I, ? extends O>, ja9<? extends O>> {
        public a(ja9<? extends I> inputFuture, v90<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractRunnableC5117e5
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ja9<? extends O> mo9681r(v90<? super I, ? extends O> function, @agc I input) throws Exception {
            ja9<? extends O> ja9VarApply = function.apply(input);
            v7d.checkNotNull(ja9VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", function);
            return ja9VarApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractRunnableC5117e5
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo9682s(ja9<? extends O> result) {
            setFuture(result);
        }
    }

    /* JADX INFO: renamed from: e5$b */
    public static final class b<I, O> extends AbstractRunnableC5117e5<I, O, lz6<? super I, ? extends O>, O> {
        public b(ja9<? extends I> inputFuture, lz6<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        @Override // p000.AbstractRunnableC5117e5
        /* JADX INFO: renamed from: s */
        public void mo9682s(@agc O result) {
            set(result);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractRunnableC5117e5
        @agc
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public O mo9681r(lz6<? super I, ? extends O> function, @agc I input) {
            return function.apply(input);
        }
    }

    public AbstractRunnableC5117e5(ja9<? extends I> ja9Var, F f) {
        this.f31802F = (ja9) v7d.checkNotNull(ja9Var);
        this.f31803H = (F) v7d.checkNotNull(f);
    }

    /* JADX INFO: renamed from: p */
    public static <I, O> ja9<O> m9679p(ja9<I> input, v90<? super I, ? extends O> function, Executor executor) {
        v7d.checkNotNull(executor);
        a aVar = new a(input, function);
        input.addListener(aVar, xya.m25560d(executor, aVar));
        return aVar;
    }

    /* JADX INFO: renamed from: q */
    public static <I, O> ja9<O> m9680q(ja9<I> input, lz6<? super I, ? extends O> function, Executor executor) {
        v7d.checkNotNull(function);
        b bVar = new b(input, function);
        input.addListener(bVar, xya.m25560d(executor, bVar));
        return bVar;
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: k */
    public final void mo2822k() {
        m17707m(this.f31802F);
        this.f31802F = null;
        this.f31803H = null;
    }

    @Override // p000.AbstractC9640n1
    @wx1
    /* JADX INFO: renamed from: n */
    public String mo2823n() {
        String str;
        ja9<? extends I> ja9Var = this.f31802F;
        F f = this.f31803H;
        String strMo2823n = super.mo2823n();
        if (ja9Var != null) {
            str = "inputFuture=[" + ja9Var + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "function=[" + f + "]";
        }
        if (strMo2823n == null) {
            return null;
        }
        return str + strMo2823n;
    }

    @vp6
    @agc
    /* JADX INFO: renamed from: r */
    public abstract T mo9681r(F function, @agc I result) throws Exception;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ja9<? extends I> ja9Var = this.f31802F;
        F f = this.f31803H;
        if ((isCancelled() | (ja9Var == null)) || (f == null)) {
            return;
        }
        this.f31802F = null;
        if (ja9Var.isCancelled()) {
            setFuture(ja9Var);
            return;
        }
        try {
            try {
                Object objMo9681r = mo9681r(f, w17.getDone(ja9Var));
                this.f31803H = null;
                mo9682s(objMo9681r);
            } catch (Throwable th) {
                try {
                    uwc.m23618b(th);
                    setException(th);
                } finally {
                    this.f31803H = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    @vp6
    /* JADX INFO: renamed from: s */
    public abstract void mo9682s(@agc T result);
}
