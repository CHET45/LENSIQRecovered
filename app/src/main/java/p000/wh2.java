package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final xd2 f94245a;

    /* JADX INFO: renamed from: b */
    public final ph2 f94246b;

    /* JADX INFO: renamed from: wh2$a */
    public static final class C14601a extends AtomicReference<lf4> implements ch2, lf4 {
        private static final long serialVersionUID = 3533011714830024923L;

        /* JADX INFO: renamed from: a */
        public final ch2 f94247a;

        /* JADX INFO: renamed from: b */
        public final a f94248b = new a(this);

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f94249c = new AtomicBoolean();

        /* JADX INFO: renamed from: wh2$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = 5176264485428790318L;

            /* JADX INFO: renamed from: a */
            public final C14601a f94250a;

            public a(C14601a parent) {
                this.f94250a = parent;
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f94250a.m24552a();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f94250a.m24553b(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C14601a(ch2 downstream) {
            this.f94247a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m24552a() {
            if (this.f94249c.compareAndSet(false, true)) {
                zf4.dispose(this);
                this.f94247a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m24553b(Throwable e) {
            if (!this.f94249c.compareAndSet(false, true)) {
                ofe.onError(e);
            } else {
                zf4.dispose(this);
                this.f94247a.onError(e);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f94249c.compareAndSet(false, true)) {
                zf4.dispose(this);
                zf4.dispose(this.f94248b);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94249c.get();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f94249c.compareAndSet(false, true)) {
                zf4.dispose(this.f94248b);
                this.f94247a.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (!this.f94249c.compareAndSet(false, true)) {
                ofe.onError(e);
            } else {
                zf4.dispose(this.f94248b);
                this.f94247a.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public wh2(xd2 source, ph2 other) {
        this.f94245a = source;
        this.f94246b = other;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C14601a c14601a = new C14601a(observer);
        observer.onSubscribe(c14601a);
        this.f94246b.subscribe(c14601a.f94248b);
        this.f94245a.subscribe(c14601a);
    }
}
