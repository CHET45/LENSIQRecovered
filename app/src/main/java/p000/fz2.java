package p000;

import android.p001os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class fz2<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<R> f38052a;

    /* JADX WARN: Multi-variable type inference failed */
    public fz2(@yfb zy2<? super R> zy2Var) {
        super(false);
        this.f38052a = zy2Var;
    }

    public void onError(@yfb E e) {
        if (compareAndSet(false, true)) {
            zy2<R> zy2Var = this.f38052a;
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            zy2<R> zy2Var = this.f38052a;
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @yfb
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
