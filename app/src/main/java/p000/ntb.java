package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ntb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super Throwable> f65650b;

    /* JADX INFO: renamed from: c */
    public final long f65651c;

    /* JADX INFO: renamed from: ntb$a */
    public static final class C10054a<T> extends AtomicInteger implements pxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f65652a;

        /* JADX INFO: renamed from: b */
        public final a0f f65653b;

        /* JADX INFO: renamed from: c */
        public final wub<? extends T> f65654c;

        /* JADX INFO: renamed from: d */
        public final n8d<? super Throwable> f65655d;

        /* JADX INFO: renamed from: e */
        public long f65656e;

        public C10054a(pxb<? super T> actual, long count, n8d<? super Throwable> predicate, a0f sa, wub<? extends T> source) {
            this.f65652a = actual;
            this.f65653b = sa;
            this.f65654c = source;
            this.f65655d = predicate;
            this.f65656e = count;
        }

        /* JADX INFO: renamed from: a */
        public void m18126a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f65653b.isDisposed()) {
                    this.f65654c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f65652a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            long j = this.f65656e;
            if (j != Long.MAX_VALUE) {
                this.f65656e = j - 1;
            }
            if (j == 0) {
                this.f65652a.onError(t);
                return;
            }
            try {
                if (this.f65655d.test(t)) {
                    m18126a();
                } else {
                    this.f65652a.onError(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f65652a.onError(new qm2(t, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f65652a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f65653b.replace(d);
        }
    }

    public ntb(vkb<T> source, long count, n8d<? super Throwable> predicate) {
        super(source);
        this.f65650b = predicate;
        this.f65651c = count;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        a0f a0fVar = new a0f();
        observer.onSubscribe(a0fVar);
        new C10054a(observer, this.f65651c, this.f65650b, a0fVar, this.f63101a).m18126a();
    }
}
