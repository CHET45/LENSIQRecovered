package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class orb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final ph2 f68380b;

    /* JADX INFO: renamed from: orb$a */
    public static final class C10513a<T> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f68381a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f68382b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a f68383c = new a(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f68384d = new bc0();

        /* JADX INFO: renamed from: e */
        public volatile boolean f68385e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f68386f;

        /* JADX INFO: renamed from: orb$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C10513a<?> f68387a;

            public a(C10513a<?> parent) {
                this.f68387a = parent;
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f68387a.m18819a();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f68387a.m18820b(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C10513a(pxb<? super T> downstream) {
            this.f68381a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m18819a() {
            this.f68386f = true;
            if (this.f68385e) {
                xd7.onComplete(this.f68381a, this, this.f68384d);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18820b(Throwable ex) {
            zf4.dispose(this.f68382b);
            xd7.onError(this.f68381a, ex, this, this.f68384d);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f68382b);
            zf4.dispose(this.f68383c);
            this.f68384d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f68382b.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f68385e = true;
            if (this.f68386f) {
                xd7.onComplete(this.f68381a, this, this.f68384d);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable ex) {
            zf4.dispose(this.f68383c);
            xd7.onError(this.f68381a, ex, this, this.f68384d);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            xd7.onNext(this.f68381a, t, this, this.f68384d);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f68382b, d);
        }
    }

    public orb(vkb<T> source, ph2 other) {
        super(source);
        this.f68380b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C10513a c10513a = new C10513a(observer);
        observer.onSubscribe(c10513a);
        this.f63101a.subscribe(c10513a);
        this.f68380b.subscribe(c10513a.f68383c);
    }
}
