package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ej6<T, U> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<U> f33193c;

    /* JADX INFO: renamed from: ej6$a */
    public static final class C5344a<T> extends AtomicInteger implements bq2<T>, fdg {
        private static final long serialVersionUID = -6270983465606289181L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f33194a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f33195b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f33196c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final C5344a<T>.a f33197d = new a();

        /* JADX INFO: renamed from: e */
        public final bc0 f33198e = new bc0();

        /* JADX INFO: renamed from: f */
        public volatile boolean f33199f;

        /* JADX INFO: renamed from: ej6$a$a */
        public final class a extends AtomicReference<fdg> implements kj6<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                C5344a.this.f33199f = true;
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                ldg.cancel(C5344a.this.f33195b);
                C5344a c5344a = C5344a.this;
                xd7.onError(c5344a.f33194a, t, c5344a, c5344a.f33198e);
            }

            @Override // p000.ycg
            public void onNext(Object t) {
                C5344a.this.f33199f = true;
                get().cancel();
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                ldg.setOnce(this, s, Long.MAX_VALUE);
            }
        }

        public C5344a(ycg<? super T> downstream) {
            this.f33194a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f33195b);
            ldg.cancel(this.f33197d);
        }

        @Override // p000.ycg
        public void onComplete() {
            ldg.cancel(this.f33197d);
            xd7.onComplete(this.f33194a, this, this.f33198e);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            ldg.cancel(this.f33197d);
            xd7.onError(this.f33194a, t, this, this.f33198e);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f33195b.get().request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f33195b, this.f33196c, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f33195b, this.f33196c, n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (!this.f33199f) {
                return false;
            }
            xd7.onNext(this.f33194a, t, this, this.f33198e);
            return true;
        }
    }

    public ej6(l86<T> source, zjd<U> other) {
        super(source);
        this.f33193c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> child) {
        C5344a c5344a = new C5344a(child);
        child.onSubscribe(c5344a);
        this.f33193c.subscribe(c5344a.f33197d);
        this.f49321b.subscribe((kj6) c5344a);
    }
}
