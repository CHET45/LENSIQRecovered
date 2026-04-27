package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class na6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final ph2 f63788c;

    public na6(l86<T> source, ph2 other) {
        super(source);
        this.f63788c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C9762a(s, this.f63788c));
    }

    /* JADX INFO: renamed from: na6$a */
    public static final class C9762a<T> extends AtomicReference<lf4> implements kj6<T>, ch2, fdg {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f63789a;

        /* JADX INFO: renamed from: b */
        public fdg f63790b;

        /* JADX INFO: renamed from: c */
        public ph2 f63791c;

        /* JADX INFO: renamed from: d */
        public boolean f63792d;

        public C9762a(ycg<? super T> actual, ph2 other) {
            this.f63789a = actual;
            this.f63791c = other;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f63790b.cancel();
            zf4.dispose(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f63792d) {
                this.f63789a.onComplete();
                return;
            }
            this.f63792d = true;
            this.f63790b = ldg.CANCELLED;
            ph2 ph2Var = this.f63791c;
            this.f63791c = null;
            ph2Var.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f63789a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f63789a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f63790b, s)) {
                this.f63790b = s;
                this.f63789a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f63790b.request(n);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }
}
