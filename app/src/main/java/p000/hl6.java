package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class hl6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final voe f44070c;

    /* JADX INFO: renamed from: hl6$a */
    public static final class C6904a<T> extends AtomicBoolean implements lj6<T>, fdg {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f44071a;

        /* JADX INFO: renamed from: b */
        public final voe f44072b;

        /* JADX INFO: renamed from: c */
        public fdg f44073c;

        /* JADX INFO: renamed from: hl6$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6904a.this.f44073c.cancel();
            }
        }

        public C6904a(ycg<? super T> ycgVar, voe voeVar) {
            this.f44071a = ycgVar;
            this.f44072b = voeVar;
        }

        @Override // p000.fdg
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f44072b.scheduleDirect(new a());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f44071a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (get()) {
                pfe.onError(th);
            } else {
                this.f44071a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f44071a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f44073c, fdgVar)) {
                this.f44073c = fdgVar;
                this.f44071a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f44073c.request(j);
        }
    }

    public hl6(m86<T> m86Var, voe voeVar) {
        super(m86Var);
        this.f44070c = voeVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C6904a(ycgVar, this.f44070c));
    }
}
