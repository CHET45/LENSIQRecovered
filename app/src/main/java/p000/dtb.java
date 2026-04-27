package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class dtb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f30846b;

    /* JADX INFO: renamed from: dtb$a */
    public static final class C4943a<T> extends AtomicInteger implements pxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f30847a;

        /* JADX INFO: renamed from: b */
        public final a0f f30848b;

        /* JADX INFO: renamed from: c */
        public final wub<? extends T> f30849c;

        /* JADX INFO: renamed from: d */
        public long f30850d;

        public C4943a(pxb<? super T> actual, long count, a0f sd, wub<? extends T> source) {
            this.f30847a = actual;
            this.f30848b = sd;
            this.f30849c = source;
            this.f30850d = count;
        }

        /* JADX INFO: renamed from: a */
        public void m9358a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f30848b.isDisposed()) {
                    this.f30849c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.pxb
        public void onComplete() {
            long j = this.f30850d;
            if (j != Long.MAX_VALUE) {
                this.f30850d = j - 1;
            }
            if (j != 0) {
                m9358a();
            } else {
                this.f30847a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f30847a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f30847a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f30848b.replace(d);
        }
    }

    public dtb(vkb<T> source, long count) {
        super(source);
        this.f30846b = count;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        a0f a0fVar = new a0f();
        observer.onSubscribe(a0fVar);
        long j = this.f30846b;
        new C4943a(observer, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, a0fVar, this.f63101a).m9358a();
    }
}
