package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ce2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f16338a;

    /* JADX INFO: renamed from: b */
    public final ph2 f16339b;

    /* JADX INFO: renamed from: ce2$a */
    public static final class C2288a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<lf4> f16340a;

        /* JADX INFO: renamed from: b */
        public final ch2 f16341b;

        public C2288a(AtomicReference<lf4> parent, ch2 downstream) {
            this.f16340a = parent;
            this.f16341b = downstream;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f16341b.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f16341b.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            zf4.replace(this.f16340a, d);
        }
    }

    /* JADX INFO: renamed from: ce2$b */
    public static final class C2289b extends AtomicReference<lf4> implements ch2, lf4 {
        private static final long serialVersionUID = -4101678820158072998L;

        /* JADX INFO: renamed from: a */
        public final ch2 f16342a;

        /* JADX INFO: renamed from: b */
        public final ph2 f16343b;

        public C2289b(ch2 actualObserver, ph2 next) {
            this.f16342a = actualObserver;
            this.f16343b = next;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f16343b.subscribe(new C2288a(this, this.f16342a));
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f16342a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f16342a.onSubscribe(this);
            }
        }
    }

    public ce2(ph2 source, ph2 next) {
        this.f16338a = source;
        this.f16339b = next;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f16338a.subscribe(new C2289b(observer, this.f16339b));
    }
}
