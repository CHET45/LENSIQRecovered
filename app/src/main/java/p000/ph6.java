package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ph6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final cb1 f70783c;

    /* JADX INFO: renamed from: ph6$a */
    public static final class C10959a<T> extends AtomicInteger implements kj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f70784a;

        /* JADX INFO: renamed from: b */
        public final gdg f70785b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f70786c;

        /* JADX INFO: renamed from: d */
        public final cb1 f70787d;

        /* JADX INFO: renamed from: e */
        public long f70788e;

        public C10959a(ycg<? super T> actual, cb1 until, gdg sa, zjd<? extends T> source) {
            this.f70784a = actual;
            this.f70785b = sa;
            this.f70786c = source;
            this.f70787d = until;
        }

        /* JADX INFO: renamed from: a */
        public void m19492a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f70785b.isCancelled()) {
                    long j = this.f70788e;
                    if (j != 0) {
                        this.f70788e = 0L;
                        this.f70785b.produced(j);
                    }
                    this.f70786c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            try {
                if (this.f70787d.getAsBoolean()) {
                    this.f70784a.onComplete();
                } else {
                    m19492a();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f70784a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f70784a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f70788e++;
            this.f70784a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f70785b.setSubscription(s);
        }
    }

    public ph6(l86<T> source, cb1 until) {
        super(source);
        this.f70783c = until;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        gdg gdgVar = new gdg(false);
        s.onSubscribe(gdgVar);
        new C10959a(s, this.f70783c, gdgVar, this.f49321b).m19492a();
    }
}
