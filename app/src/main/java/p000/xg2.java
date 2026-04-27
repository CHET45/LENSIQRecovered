package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class xg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends ph2> f97688a;

    /* JADX INFO: renamed from: xg2$a */
    public static final class C15051a extends AtomicBoolean implements ch2, lf4 {
        private static final long serialVersionUID = -7730517613164279224L;

        /* JADX INFO: renamed from: a */
        public final mm2 f97689a;

        /* JADX INFO: renamed from: b */
        public final ch2 f97690b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f97691c;

        public C15051a(ch2 actual, mm2 set, AtomicInteger wip) {
            this.f97690b = actual;
            this.f97689a = set;
            this.f97691c = wip;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f97689a.dispose();
            set(true);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f97689a.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f97691c.decrementAndGet() == 0) {
                this.f97690b.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f97689a.dispose();
            if (compareAndSet(false, true)) {
                this.f97690b.onError(e);
            } else {
                ofe.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f97689a.add(d);
        }
    }

    public xg2(Iterable<? extends ph2> sources) {
        this.f97688a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        mm2 mm2Var = new mm2();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        C15051a c15051a = new C15051a(observer, mm2Var, atomicInteger);
        observer.onSubscribe(c15051a);
        try {
            Iterator<? extends ph2> it = this.f97688a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends ph2> it2 = it;
            while (!mm2Var.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        c15051a.onComplete();
                        return;
                    }
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
                        ph2Var.subscribe(c15051a);
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        mm2Var.dispose();
                        c15051a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    mm2Var.dispose();
                    c15051a.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            observer.onError(th3);
        }
    }
}
