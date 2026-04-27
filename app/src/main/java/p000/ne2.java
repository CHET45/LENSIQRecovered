package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ne2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends qh2> f64089a;

    /* JADX INFO: renamed from: ne2$a */
    public static final class C9798a extends AtomicInteger implements dh2 {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: a */
        public final dh2 f64090a;

        /* JADX INFO: renamed from: b */
        public final Iterator<? extends qh2> f64091b;

        /* JADX INFO: renamed from: c */
        public final b0f f64092c = new b0f();

        public C9798a(dh2 dh2Var, Iterator<? extends qh2> it) {
            this.f64090a = dh2Var;
            this.f64091b = it;
        }

        /* JADX INFO: renamed from: a */
        public void m17862a() {
            if (!this.f64092c.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends qh2> it = this.f64091b;
                while (!this.f64092c.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f64090a.onComplete();
                            return;
                        }
                        try {
                            ((qh2) xjb.requireNonNull(it.next(), "The CompletableSource returned is null")).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f64090a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        this.f64090a.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // p000.dh2
        public void onComplete() {
            m17862a();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f64090a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f64092c.replace(mf4Var);
        }
    }

    public ne2(Iterable<? extends qh2> iterable) {
        this.f64089a = iterable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        try {
            C9798a c9798a = new C9798a(dh2Var, (Iterator) xjb.requireNonNull(this.f64089a.iterator(), "The iterator returned is null"));
            dh2Var.onSubscribe(c9798a.f64092c);
            c9798a.m17862a();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, dh2Var);
        }
    }
}
