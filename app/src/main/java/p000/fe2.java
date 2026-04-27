package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fe2<R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final qh2 f36262b;

    /* JADX INFO: renamed from: c */
    public final zjd<? extends R> f36263c;

    public fe2(qh2 qh2Var, zjd<? extends R> zjdVar) {
        this.f36262b = qh2Var;
        this.f36263c = zjdVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f36262b.subscribe(new C5742a(ycgVar, this.f36263c));
    }

    /* JADX INFO: renamed from: fe2$a */
    public static final class C5742a<R> extends AtomicReference<fdg> implements lj6<R>, dh2, fdg {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f36264a;

        /* JADX INFO: renamed from: b */
        public zjd<? extends R> f36265b;

        /* JADX INFO: renamed from: c */
        public mf4 f36266c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f36267d = new AtomicLong();

        public C5742a(ycg<? super R> ycgVar, zjd<? extends R> zjdVar) {
            this.f36264a = ycgVar;
            this.f36265b = zjdVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f36266c.dispose();
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            zjd<? extends R> zjdVar = this.f36265b;
            if (zjdVar == null) {
                this.f36264a.onComplete();
            } else {
                this.f36265b = null;
                zjdVar.subscribe(this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f36264a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(R r) {
            this.f36264a.onNext(r);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f36266c, mf4Var)) {
                this.f36266c = mf4Var;
                this.f36264a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this, this.f36267d, j);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this, this.f36267d, fdgVar);
        }
    }
}
