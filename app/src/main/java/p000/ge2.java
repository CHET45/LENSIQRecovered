package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ge2<R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final ph2 f39596b;

    /* JADX INFO: renamed from: c */
    public final zjd<? extends R> f39597c;

    public ge2(ph2 source, zjd<? extends R> other) {
        this.f39596b = source;
        this.f39597c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f39596b.subscribe(new C6271a(s, this.f39597c));
    }

    /* JADX INFO: renamed from: ge2$a */
    public static final class C6271a<R> extends AtomicReference<fdg> implements kj6<R>, ch2, fdg {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f39598a;

        /* JADX INFO: renamed from: b */
        public zjd<? extends R> f39599b;

        /* JADX INFO: renamed from: c */
        public lf4 f39600c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f39601d = new AtomicLong();

        public C6271a(ycg<? super R> downstream, zjd<? extends R> other) {
            this.f39598a = downstream;
            this.f39599b = other;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f39600c.dispose();
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            zjd<? extends R> zjdVar = this.f39599b;
            if (zjdVar == null) {
                this.f39598a.onComplete();
            } else {
                this.f39599b = null;
                zjdVar.subscribe(this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f39598a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(R t) {
            this.f39598a.onNext(t);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f39600c, d)) {
                this.f39600c = d;
                this.f39598a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this, this.f39601d, n);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this, this.f39601d, s);
        }
    }
}
