package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p000.tg2;

/* JADX INFO: loaded from: classes7.dex */
public final class vg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends qh2> f91031a;

    public vg2(Iterable<? extends qh2> iterable) {
        this.f91031a = iterable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        nm2 nm2Var = new nm2();
        dh2Var.onSubscribe(nm2Var);
        try {
            Iterator it = (Iterator) xjb.requireNonNull(this.f91031a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            cc0 cc0Var = new cc0();
            while (!nm2Var.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (nm2Var.isDisposed()) {
                            return;
                        }
                        try {
                            qh2 qh2Var = (qh2) xjb.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (nm2Var.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            qh2Var.subscribe(new tg2.C13020a(dh2Var, nm2Var, cc0Var, atomicInteger));
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            cc0Var.addThrowable(th);
                        }
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    cc0Var.addThrowable(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thTerminate = cc0Var.terminate();
                    if (thTerminate == null) {
                        dh2Var.onComplete();
                        return;
                    } else {
                        dh2Var.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            dh2Var.onError(th3);
        }
    }
}
