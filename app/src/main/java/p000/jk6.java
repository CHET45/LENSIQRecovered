package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jk6<T, U> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends U> f51020c;

    /* JADX INFO: renamed from: jk6$a */
    public static final class C7960a<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -4945480365982832967L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f51021a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f51022b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f51023c = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final C7960a<T>.a f51025e = new a();

        /* JADX INFO: renamed from: d */
        public final cc0 f51024d = new cc0();

        /* JADX INFO: renamed from: jk6$a$a */
        public final class a extends AtomicReference<fdg> implements lj6<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                mdg.cancel(C7960a.this.f51023c);
                C7960a c7960a = C7960a.this;
                yd7.onComplete(c7960a.f51021a, c7960a, c7960a.f51024d);
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                mdg.cancel(C7960a.this.f51023c);
                C7960a c7960a = C7960a.this;
                yd7.onError(c7960a.f51021a, th, c7960a, c7960a.f51024d);
            }

            @Override // p000.ycg
            public void onNext(Object obj) {
                mdg.cancel(this);
                onComplete();
            }

            @Override // p000.lj6, p000.ycg
            public void onSubscribe(fdg fdgVar) {
                mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
            }
        }

        public C7960a(ycg<? super T> ycgVar) {
            this.f51021a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f51023c);
            mdg.cancel(this.f51025e);
        }

        @Override // p000.ycg
        public void onComplete() {
            mdg.cancel(this.f51025e);
            yd7.onComplete(this.f51021a, this, this.f51024d);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            mdg.cancel(this.f51025e);
            yd7.onError(this.f51021a, th, this, this.f51024d);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            yd7.onNext(this.f51021a, t, this, this.f51024d);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f51023c, this.f51022b, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f51023c, this.f51022b, j);
        }
    }

    public jk6(m86<T> m86Var, zjd<? extends U> zjdVar) {
        super(m86Var);
        this.f51020c = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C7960a c7960a = new C7960a(ycgVar);
        ycgVar.onSubscribe(c7960a);
        this.f51020c.subscribe(c7960a.f51025e);
        this.f52360b.subscribe((lj6) c7960a);
    }
}
