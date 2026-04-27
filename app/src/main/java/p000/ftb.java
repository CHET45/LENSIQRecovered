package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ftb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final cb1 f37713b;

    /* JADX INFO: renamed from: ftb$a */
    public static final class C5976a<T> extends AtomicInteger implements pxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f37714a;

        /* JADX INFO: renamed from: b */
        public final a0f f37715b;

        /* JADX INFO: renamed from: c */
        public final wub<? extends T> f37716c;

        /* JADX INFO: renamed from: d */
        public final cb1 f37717d;

        public C5976a(pxb<? super T> actual, cb1 until, a0f sd, wub<? extends T> source) {
            this.f37714a = actual;
            this.f37715b = sd;
            this.f37716c = source;
            this.f37717d = until;
        }

        /* JADX INFO: renamed from: a */
        public void m11184a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f37716c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // p000.pxb
        public void onComplete() {
            try {
                if (this.f37717d.getAsBoolean()) {
                    this.f37714a.onComplete();
                } else {
                    m11184a();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f37714a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f37714a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f37714a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f37715b.replace(d);
        }
    }

    public ftb(vkb<T> source, cb1 until) {
        super(source);
        this.f37713b = until;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        a0f a0fVar = new a0f();
        observer.onSubscribe(a0fVar);
        new C5976a(observer, this.f37713b, a0fVar, this.f63101a).m11184a();
    }
}
