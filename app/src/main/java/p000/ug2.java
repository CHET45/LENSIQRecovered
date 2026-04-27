package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p000.sg2;

/* JADX INFO: loaded from: classes7.dex */
public final class ug2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends ph2> f87958a;

    public ug2(Iterable<? extends ph2> sources) {
        this.f87958a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        try {
            Iterator<? extends ph2> it = this.f87958a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends ph2> it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            bc0 bc0Var = new bc0();
            mm2Var.add(new sg2.C12565b(bc0Var));
            while (!mm2Var.isDisposed()) {
                try {
                    if (it2.hasNext()) {
                        if (mm2Var.isDisposed()) {
                            return;
                        }
                        try {
                            ph2 next = it2.next();
                            Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                            ph2 ph2Var = next;
                            if (mm2Var.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            ph2Var.subscribe(new sg2.C12564a(observer, mm2Var, bc0Var, atomicInteger));
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            bc0Var.tryAddThrowableOrReport(th);
                        }
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    bc0Var.tryAddThrowableOrReport(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    bc0Var.tryTerminateConsumer(observer);
                    return;
                }
                return;
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            observer.onError(th3);
        }
    }
}
