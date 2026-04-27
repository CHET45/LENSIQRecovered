package p000;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lj */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public abstract class AbstractC8831lj<InputT, OutputT> extends AbstractC9363mj<OutputT> {

    /* JADX INFO: renamed from: Y */
    public static final Logger f57718Y = Logger.getLogger(AbstractC8831lj.class.getName());

    /* JADX INFO: renamed from: N */
    @wx1
    public ax7<? extends ja9<? extends InputT>> f57719N;

    /* JADX INFO: renamed from: Q */
    public final boolean f57720Q;

    /* JADX INFO: renamed from: X */
    public final boolean f57721X;

    /* JADX INFO: renamed from: lj$a */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AbstractC8831lj(ax7<? extends ja9<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues) {
        super(futures.size());
        this.f57719N = (ax7) v7d.checkNotNull(futures);
        this.f57720Q = allMustSucceed;
        this.f57721X = collectsValues;
    }

    private static boolean addCausalChain(Set<Throwable> seen, Throwable param) {
        while (param != null) {
            if (!seen.add(param)) {
                return false;
            }
            param = param.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int index, Future<? extends InputT> future) {
        try {
            mo14638y(index, w17.getDone(future));
        } catch (Error e) {
            e = e;
            handleException(e);
        } catch (RuntimeException e2) {
            e = e2;
            handleException(e);
        } catch (ExecutionException e3) {
            handleException(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decrementCountAndMaybeComplete, reason: merged with bridge method [inline-methods] */
    public void lambda$init$1(@wx1 ax7<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        int iM17340u = m17340u();
        v7d.checkState(iM17340u >= 0, "Less than 0 remaining futures");
        if (iM17340u == 0) {
            processCompleted(futuresIfNeedToCollectAtCompletion);
        }
    }

    private void handleException(Throwable throwable) {
        v7d.checkNotNull(throwable);
        if (this.f57720Q && !setException(throwable) && addCausalChain(m17341v(), throwable)) {
            log(throwable);
        } else if (throwable instanceof Error) {
            log(throwable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(ja9 ja9Var, int i) {
        try {
            if (ja9Var.isCancelled()) {
                this.f57719N = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i, ja9Var);
            }
            lambda$init$1(null);
        } catch (Throwable th) {
            lambda$init$1(null);
            throw th;
        }
    }

    private static void log(Throwable throwable) {
        f57718Y.log(Level.SEVERE, throwable instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", throwable);
    }

    private void processCompleted(@wx1 ax7<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        if (futuresIfNeedToCollectAtCompletion != null) {
            quh<? extends Future<? extends InputT>> it = futuresIfNeedToCollectAtCompletion.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        m17339t();
        mo14639z();
        mo14636B(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    /* JADX INFO: renamed from: A */
    public final void m16167A() {
        Objects.requireNonNull(this.f57719N);
        if (this.f57719N.isEmpty()) {
            mo14639z();
            return;
        }
        if (!this.f57720Q) {
            final ax7<? extends ja9<? extends InputT>> ax7Var = this.f57721X ? this.f57719N : null;
            Runnable runnable = new Runnable() { // from class: kj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54241a.lambda$init$1(ax7Var);
                }
            };
            quh<? extends ja9<? extends InputT>> it = this.f57719N.iterator();
            while (it.hasNext()) {
                it.next().addListener(runnable, xya.directExecutor());
            }
            return;
        }
        quh<? extends ja9<? extends InputT>> it2 = this.f57719N.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ja9<? extends InputT> next = it2.next();
            next.addListener(new Runnable() { // from class: jj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50685a.lambda$init$0(next, i);
                }
            }, xya.directExecutor());
            i++;
        }
    }

    @t9c
    @vp6
    /* JADX INFO: renamed from: B */
    public void mo14636B(a reason) {
        v7d.checkNotNull(reason);
        this.f57719N = null;
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: k */
    public final void mo2822k() {
        super.mo2822k();
        ax7<? extends ja9<? extends InputT>> ax7Var = this.f57719N;
        mo14636B(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (ax7Var != null)) {
            boolean zM17708o = m17708o();
            quh<? extends ja9<? extends InputT>> it = ax7Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(zM17708o);
            }
        }
    }

    @Override // p000.AbstractC9640n1
    @wx1
    /* JADX INFO: renamed from: n */
    public final String mo2823n() {
        ax7<? extends ja9<? extends InputT>> ax7Var = this.f57719N;
        if (ax7Var == null) {
            return super.mo2823n();
        }
        return "futures=" + ax7Var;
    }

    @Override // p000.AbstractC9363mj
    /* JADX INFO: renamed from: s */
    public final void mo16168s(Set<Throwable> seen) {
        v7d.checkNotNull(seen);
        if (isCancelled()) {
            return;
        }
        Throwable thMo17706a = mo17706a();
        Objects.requireNonNull(thMo17706a);
        addCausalChain(seen, thMo17706a);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo14638y(int index, @agc InputT returnValue);

    /* JADX INFO: renamed from: z */
    public abstract void mo14639z();
}
