package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class wg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends qh2> f94141a;

    /* JADX INFO: renamed from: wg2$a */
    public static final class C14574a extends AtomicBoolean implements dh2 {
        private static final long serialVersionUID = -7730517613164279224L;

        /* JADX INFO: renamed from: a */
        public final nm2 f94142a;

        /* JADX INFO: renamed from: b */
        public final dh2 f94143b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f94144c;

        public C14574a(dh2 dh2Var, nm2 nm2Var, AtomicInteger atomicInteger) {
            this.f94143b = dh2Var;
            this.f94142a = nm2Var;
            this.f94144c = atomicInteger;
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f94144c.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f94143b.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f94142a.dispose();
            if (compareAndSet(false, true)) {
                this.f94143b.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f94142a.add(mf4Var);
        }
    }

    public wg2(Iterable<? extends qh2> iterable) {
        this.f94141a = iterable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        nm2 nm2Var = new nm2();
        dh2Var.onSubscribe(nm2Var);
        try {
            Iterator it = (Iterator) xjb.requireNonNull(this.f94141a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C14574a c14574a = new C14574a(dh2Var, nm2Var, atomicInteger);
            while (!nm2Var.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        c14574a.onComplete();
                        return;
                    }
                    if (nm2Var.isDisposed()) {
                        return;
                    }
                    try {
                        qh2 qh2Var = (qh2) xjb.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                        if (nm2Var.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        qh2Var.subscribe(c14574a);
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        nm2Var.dispose();
                        c14574a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    nm2Var.dispose();
                    c14574a.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            dh2Var.onError(th3);
        }
    }
}
