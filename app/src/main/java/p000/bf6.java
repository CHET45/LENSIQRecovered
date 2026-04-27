package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class bf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f13619c;

    /* JADX INFO: renamed from: bf6$a */
    public static final class C1875a<T> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = 2288246011222124525L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13620a;

        /* JADX INFO: renamed from: b */
        public long f13621b;

        /* JADX INFO: renamed from: c */
        public fdg f13622c;

        public C1875a(ycg<? super T> ycgVar, long j) {
            this.f13620a = ycgVar;
            this.f13621b = j;
            lazySet(j);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13622c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13621b > 0) {
                this.f13621b = 0L;
                this.f13620a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f13621b <= 0) {
                pfe.onError(th);
            } else {
                this.f13621b = 0L;
                this.f13620a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f13621b;
            if (j > 0) {
                long j2 = j - 1;
                this.f13621b = j2;
                this.f13620a.onNext(t);
                if (j2 == 0) {
                    this.f13622c.cancel();
                    this.f13620a.onComplete();
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13622c, fdgVar)) {
                if (this.f13621b == 0) {
                    fdgVar.cancel();
                    x05.complete(this.f13620a);
                } else {
                    this.f13622c = fdgVar;
                    this.f13620a.onSubscribe(this);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            long j2;
            long j3;
            if (mdg.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.f13622c.request(j3);
            }
        }
    }

    public bf6(m86<T> m86Var, long j) {
        super(m86Var);
        this.f13619c = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C1875a(ycgVar, this.f13619c));
    }
}
