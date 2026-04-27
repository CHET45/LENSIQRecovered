package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class zi6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f105160c;

    /* JADX INFO: renamed from: zi6$a */
    public static final class C16153a<T> extends ArrayDeque<T> implements lj6<T>, fdg {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f105161a;

        /* JADX INFO: renamed from: b */
        public final int f105162b;

        /* JADX INFO: renamed from: c */
        public fdg f105163c;

        public C16153a(ycg<? super T> ycgVar, int i) {
            super(i);
            this.f105161a = ycgVar;
            this.f105162b = i;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f105163c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f105161a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f105161a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f105162b == size()) {
                this.f105161a.onNext(poll());
            } else {
                this.f105163c.request(1L);
            }
            offer(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f105163c, fdgVar)) {
                this.f105163c = fdgVar;
                this.f105161a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f105163c.request(j);
        }
    }

    public zi6(m86<T> m86Var, int i) {
        super(m86Var);
        this.f105160c = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C16153a(ycgVar, this.f105160c));
    }
}
