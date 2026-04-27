package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class oa6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final aaa<? extends T> f66975c;

    /* JADX INFO: renamed from: oa6$a */
    public static final class C10277a<T> extends vnf<T, T> implements l9a<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: C */
        public aaa<? extends T> f66976C;

        /* JADX INFO: renamed from: F */
        public boolean f66977F;

        /* JADX INFO: renamed from: m */
        public final AtomicReference<mf4> f66978m;

        public C10277a(ycg<? super T> ycgVar, aaa<? extends T> aaaVar) {
            super(ycgVar);
            this.f66976C = aaaVar;
            this.f66978m = new AtomicReference<>();
        }

        @Override // p000.vnf, p000.fdg
        public void cancel() {
            super.cancel();
            ag4.dispose(this.f66978m);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f66977F) {
                this.f91810a.onComplete();
                return;
            }
            this.f66977F = true;
            this.f91811b = mdg.CANCELLED;
            aaa<? extends T> aaaVar = this.f66976C;
            this.f66976C = null;
            aaaVar.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f91810a.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f91813d++;
            this.f91810a.onNext((Object) t);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f66978m, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            m24079a(t);
        }
    }

    public oa6(m86<T> m86Var, aaa<? extends T> aaaVar) {
        super(m86Var);
        this.f66975c = aaaVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C10277a(ycgVar, this.f66975c));
    }
}
