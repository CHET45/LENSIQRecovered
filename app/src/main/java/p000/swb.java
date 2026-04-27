package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class swb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f83160b;

    /* JADX INFO: renamed from: swb$a */
    public static final class C12817a<T> extends AtomicBoolean implements pxb<T>, lf4 {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f83161a;

        /* JADX INFO: renamed from: b */
        public final woe f83162b;

        /* JADX INFO: renamed from: c */
        public lf4 f83163c;

        /* JADX INFO: renamed from: swb$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12817a.this.f83163c.dispose();
            }
        }

        public C12817a(pxb<? super T> actual, woe scheduler) {
            this.f83161a = actual;
            this.f83162b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f83162b.scheduleDirect(new a());
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f83161a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (get()) {
                ofe.onError(t);
            } else {
                this.f83161a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f83161a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f83163c, d)) {
                this.f83163c = d;
                this.f83161a.onSubscribe(this);
            }
        }
    }

    public swb(wub<T> source, woe scheduler) {
        super(source);
        this.f83160b = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C12817a(t, this.f83160b));
    }
}
