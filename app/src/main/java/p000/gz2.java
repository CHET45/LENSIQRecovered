package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
public final class gz2 extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<bth> f41851a;

    /* JADX WARN: Multi-variable type inference failed */
    public gz2(@yfb zy2<? super bth> zy2Var) {
        super(false);
        this.f41851a = zy2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            zy2<bth> zy2Var = this.f41851a;
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @yfb
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
