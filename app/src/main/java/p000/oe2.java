package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class oe2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends ph2> f67379a;

    /* JADX INFO: renamed from: oe2$a */
    public static final class C10336a extends AtomicInteger implements ch2 {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: a */
        public final ch2 f67380a;

        /* JADX INFO: renamed from: b */
        public final Iterator<? extends ph2> f67381b;

        /* JADX INFO: renamed from: c */
        public final a0f f67382c = new a0f();

        public C10336a(ch2 actual, Iterator<? extends ph2> sources) {
            this.f67380a = actual;
            this.f67381b = sources;
        }

        /* JADX INFO: renamed from: a */
        public void m18595a() {
            if (!this.f67382c.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends ph2> it = this.f67381b;
                while (!this.f67382c.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f67380a.onComplete();
                            return;
                        }
                        try {
                            ph2 next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            this.f67380a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        this.f67380a.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            m18595a();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f67380a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f67382c.replace(d);
        }
    }

    public oe2(Iterable<? extends ph2> sources) {
        this.f67379a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        try {
            Iterator<? extends ph2> it = this.f67379a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            C10336a c10336a = new C10336a(observer, it);
            observer.onSubscribe(c10336a.f67382c);
            c10336a.m18595a();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
