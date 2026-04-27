package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class mf6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final ph2 f60884c;

    /* JADX INFO: renamed from: mf6$a */
    public static final class C9345a<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f60885a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f60886b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a f60887c = new a(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f60888d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f60889e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public volatile boolean f60890f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f60891m;

        /* JADX INFO: renamed from: mf6$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C9345a<?> f60892a;

            public a(C9345a<?> parent) {
                this.f60892a = parent;
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f60892a.m17286a();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f60892a.m17287b(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C9345a(ycg<? super T> downstream) {
            this.f60885a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m17286a() {
            this.f60891m = true;
            if (this.f60890f) {
                xd7.onComplete(this.f60885a, this, this.f60888d);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17287b(Throwable ex) {
            ldg.cancel(this.f60886b);
            xd7.onError(this.f60885a, ex, this, this.f60888d);
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f60886b);
            zf4.dispose(this.f60887c);
            this.f60888d.tryTerminateAndReport();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f60890f = true;
            if (this.f60891m) {
                xd7.onComplete(this.f60885a, this, this.f60888d);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable ex) {
            zf4.dispose(this.f60887c);
            xd7.onError(this.f60885a, ex, this, this.f60888d);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            xd7.onNext(this.f60885a, t, this, this.f60888d);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f60886b, this.f60889e, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f60886b, this.f60889e, n);
        }
    }

    public mf6(l86<T> source, ph2 other) {
        super(source);
        this.f60884c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        C9345a c9345a = new C9345a(subscriber);
        subscriber.onSubscribe(c9345a);
        this.f49321b.subscribe((kj6) c9345a);
        this.f60884c.subscribe(c9345a.f60887c);
    }
}
