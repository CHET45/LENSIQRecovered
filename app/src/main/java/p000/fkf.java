package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fkf<T, U> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f36971a;

    /* JADX INFO: renamed from: b */
    public final zjd<U> f36972b;

    /* JADX INFO: renamed from: fkf$a */
    public static final class C5868a<T, U> extends AtomicReference<mf4> implements lj6<U>, mf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f36973a;

        /* JADX INFO: renamed from: b */
        public final pof<T> f36974b;

        /* JADX INFO: renamed from: c */
        public boolean f36975c;

        /* JADX INFO: renamed from: d */
        public fdg f36976d;

        public C5868a(inf<? super T> infVar, pof<T> pofVar) {
            this.f36973a = infVar;
            this.f36974b = pofVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f36976d.cancel();
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f36975c) {
                return;
            }
            this.f36975c = true;
            this.f36974b.subscribe(new g8e(this, this.f36973a));
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f36975c) {
                pfe.onError(th);
            } else {
                this.f36975c = true;
                this.f36973a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(U u) {
            this.f36976d.cancel();
            onComplete();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f36976d, fdgVar)) {
                this.f36976d = fdgVar;
                this.f36973a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public fkf(pof<T> pofVar, zjd<U> zjdVar) {
        this.f36971a = pofVar;
        this.f36972b = zjdVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f36972b.subscribe(new C5868a(infVar, this.f36971a));
    }
}
