package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class zj6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f105230c;

    /* JADX INFO: renamed from: zj6$a */
    public static final class C16160a<T> extends AtomicBoolean implements lj6<T>, fdg {
        private static final long serialVersionUID = -5636543848937116287L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f105231a;

        /* JADX INFO: renamed from: b */
        public final long f105232b;

        /* JADX INFO: renamed from: c */
        public boolean f105233c;

        /* JADX INFO: renamed from: d */
        public fdg f105234d;

        /* JADX INFO: renamed from: e */
        public long f105235e;

        public C16160a(ycg<? super T> ycgVar, long j) {
            this.f105231a = ycgVar;
            this.f105232b = j;
            this.f105235e = j;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f105234d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f105233c) {
                return;
            }
            this.f105233c = true;
            this.f105231a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f105233c) {
                pfe.onError(th);
                return;
            }
            this.f105233c = true;
            this.f105234d.cancel();
            this.f105231a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f105233c) {
                return;
            }
            long j = this.f105235e;
            long j2 = j - 1;
            this.f105235e = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f105231a.onNext(t);
                if (z) {
                    this.f105234d.cancel();
                    onComplete();
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f105234d, fdgVar)) {
                this.f105234d = fdgVar;
                if (this.f105232b != 0) {
                    this.f105231a.onSubscribe(this);
                    return;
                }
                fdgVar.cancel();
                this.f105233c = true;
                x05.complete(this.f105231a);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                if (get() || !compareAndSet(false, true) || j < this.f105232b) {
                    this.f105234d.request(j);
                } else {
                    this.f105234d.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public zj6(m86<T> m86Var, long j) {
        super(m86Var);
        this.f105230c = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C16160a(ycgVar, this.f105230c));
    }
}
