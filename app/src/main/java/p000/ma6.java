package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ma6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final qh2 f60337c;

    public ma6(m86<T> m86Var, qh2 qh2Var) {
        super(m86Var);
        this.f60337c = qh2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C9235a(ycgVar, this.f60337c));
    }

    /* JADX INFO: renamed from: ma6$a */
    public static final class C9235a<T> extends AtomicReference<mf4> implements lj6<T>, dh2, fdg {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f60338a;

        /* JADX INFO: renamed from: b */
        public fdg f60339b;

        /* JADX INFO: renamed from: c */
        public qh2 f60340c;

        /* JADX INFO: renamed from: d */
        public boolean f60341d;

        public C9235a(ycg<? super T> ycgVar, qh2 qh2Var) {
            this.f60338a = ycgVar;
            this.f60340c = qh2Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f60339b.cancel();
            ag4.dispose(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f60341d) {
                this.f60338a.onComplete();
                return;
            }
            this.f60341d = true;
            this.f60339b = mdg.CANCELLED;
            qh2 qh2Var = this.f60340c;
            this.f60340c = null;
            qh2Var.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f60338a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f60338a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f60339b, fdgVar)) {
                this.f60339b = fdgVar;
                this.f60338a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f60339b.request(j);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }
}
