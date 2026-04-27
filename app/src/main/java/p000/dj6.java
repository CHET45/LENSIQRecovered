package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dj6<T, U> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<U> f29780c;

    /* JADX INFO: renamed from: dj6$a */
    public static final class C4805a<T> extends AtomicInteger implements cq2<T>, fdg {
        private static final long serialVersionUID = -6270983465606289181L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f29781a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f29782b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f29783c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final C4805a<T>.a f29784d = new a();

        /* JADX INFO: renamed from: e */
        public final cc0 f29785e = new cc0();

        /* JADX INFO: renamed from: f */
        public volatile boolean f29786f;

        /* JADX INFO: renamed from: dj6$a$a */
        public final class a extends AtomicReference<fdg> implements lj6<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                C4805a.this.f29786f = true;
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                mdg.cancel(C4805a.this.f29782b);
                C4805a c4805a = C4805a.this;
                yd7.onError(c4805a.f29781a, th, c4805a, c4805a.f29785e);
            }

            @Override // p000.ycg
            public void onNext(Object obj) {
                C4805a.this.f29786f = true;
                get().cancel();
            }

            @Override // p000.lj6, p000.ycg
            public void onSubscribe(fdg fdgVar) {
                mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
            }
        }

        public C4805a(ycg<? super T> ycgVar) {
            this.f29781a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f29782b);
            mdg.cancel(this.f29784d);
        }

        @Override // p000.ycg
        public void onComplete() {
            mdg.cancel(this.f29784d);
            yd7.onComplete(this.f29781a, this, this.f29785e);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            mdg.cancel(this.f29784d);
            yd7.onError(this.f29781a, th, this, this.f29785e);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f29782b.get().request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f29782b, this.f29783c, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f29782b, this.f29783c, j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (!this.f29786f) {
                return false;
            }
            yd7.onNext(this.f29781a, t, this, this.f29785e);
            return true;
        }
    }

    public dj6(m86<T> m86Var, zjd<U> zjdVar) {
        super(m86Var);
        this.f29780c = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C4805a c4805a = new C4805a(ycgVar);
        ycgVar.onSubscribe(c4805a);
        this.f29780c.subscribe(c4805a.f29784d);
        this.f52360b.subscribe((lj6) c4805a);
    }
}
