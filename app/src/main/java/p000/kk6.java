package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kk6<T, U> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends U> f54545c;

    /* JADX INFO: renamed from: kk6$a */
    public static final class C8433a<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -4945480365982832967L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f54546a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f54547b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f54548c = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final C8433a<T>.a f54550e = new a();

        /* JADX INFO: renamed from: d */
        public final bc0 f54549d = new bc0();

        /* JADX INFO: renamed from: kk6$a$a */
        public final class a extends AtomicReference<fdg> implements kj6<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                ldg.cancel(C8433a.this.f54548c);
                C8433a c8433a = C8433a.this;
                xd7.onComplete(c8433a.f54546a, c8433a, c8433a.f54549d);
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                ldg.cancel(C8433a.this.f54548c);
                C8433a c8433a = C8433a.this;
                xd7.onError(c8433a.f54546a, t, c8433a, c8433a.f54549d);
            }

            @Override // p000.ycg
            public void onNext(Object t) {
                ldg.cancel(this);
                onComplete();
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                ldg.setOnce(this, s, Long.MAX_VALUE);
            }
        }

        public C8433a(ycg<? super T> downstream) {
            this.f54546a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f54548c);
            ldg.cancel(this.f54550e);
        }

        @Override // p000.ycg
        public void onComplete() {
            ldg.cancel(this.f54550e);
            xd7.onComplete(this.f54546a, this, this.f54549d);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            ldg.cancel(this.f54550e);
            xd7.onError(this.f54546a, t, this, this.f54549d);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            xd7.onNext(this.f54546a, t, this, this.f54549d);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f54548c, this.f54547b, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f54548c, this.f54547b, n);
        }
    }

    public kk6(l86<T> source, zjd<? extends U> other) {
        super(source);
        this.f54545c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> child) {
        C8433a c8433a = new C8433a(child);
        child.onSubscribe(c8433a);
        this.f54545c.subscribe(c8433a.f54550e);
        this.f49321b.subscribe((kj6) c8433a);
    }
}
