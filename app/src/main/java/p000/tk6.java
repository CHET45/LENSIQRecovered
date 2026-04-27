package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class tk6<T> extends AbstractC8162k1<T, i1h<T>> {

    /* JADX INFO: renamed from: c */
    public final voe f85124c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f85125d;

    /* JADX INFO: renamed from: tk6$a */
    public static final class C13083a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super i1h<T>> f85126a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f85127b;

        /* JADX INFO: renamed from: c */
        public final voe f85128c;

        /* JADX INFO: renamed from: d */
        public fdg f85129d;

        /* JADX INFO: renamed from: e */
        public long f85130e;

        public C13083a(ycg<? super i1h<T>> ycgVar, TimeUnit timeUnit, voe voeVar) {
            this.f85126a = ycgVar;
            this.f85128c = voeVar;
            this.f85127b = timeUnit;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f85129d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f85126a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f85126a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long jNow = this.f85128c.now(this.f85127b);
            long j = this.f85130e;
            this.f85130e = jNow;
            this.f85126a.onNext(new i1h(t, jNow - j, this.f85127b));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f85129d, fdgVar)) {
                this.f85130e = this.f85128c.now(this.f85127b);
                this.f85129d = fdgVar;
                this.f85126a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f85129d.request(j);
        }
    }

    public tk6(m86<T> m86Var, TimeUnit timeUnit, voe voeVar) {
        super(m86Var);
        this.f85124c = voeVar;
        this.f85125d = timeUnit;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super i1h<T>> ycgVar) {
        this.f52360b.subscribe((lj6) new C13083a(ycgVar, this.f85125d, this.f85124c));
    }
}
