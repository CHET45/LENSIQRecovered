package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class bg6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: bg6$a */
    public static final class C1884a<T> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = -3176480756392482682L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13676a;

        /* JADX INFO: renamed from: b */
        public fdg f13677b;

        /* JADX INFO: renamed from: c */
        public boolean f13678c;

        public C1884a(ycg<? super T> ycgVar) {
            this.f13676a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13677b.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13678c) {
                return;
            }
            this.f13678c = true;
            this.f13676a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f13678c) {
                pfe.onError(th);
            } else {
                this.f13678c = true;
                this.f13676a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13678c) {
                return;
            }
            if (get() != 0) {
                this.f13676a.onNext(t);
                so0.produced(this, 1L);
            } else {
                this.f13677b.cancel();
                onError(new cwa("could not emit value due to lack of requests"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13677b, fdgVar)) {
                this.f13677b = fdgVar;
                this.f13676a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }
    }

    public bg6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C1884a(ycgVar));
    }
}
