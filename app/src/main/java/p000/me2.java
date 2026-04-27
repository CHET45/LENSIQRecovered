package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class me2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2[] f60739a;

    /* JADX INFO: renamed from: me2$a */
    public static final class C9326a extends AtomicInteger implements ch2 {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: a */
        public final ch2 f60740a;

        /* JADX INFO: renamed from: b */
        public final ph2[] f60741b;

        /* JADX INFO: renamed from: c */
        public int f60742c;

        /* JADX INFO: renamed from: d */
        public final a0f f60743d = new a0f();

        public C9326a(ch2 actual, ph2[] sources) {
            this.f60740a = actual;
            this.f60741b = sources;
        }

        /* JADX INFO: renamed from: a */
        public void m17268a() {
            if (!this.f60743d.isDisposed() && getAndIncrement() == 0) {
                ph2[] ph2VarArr = this.f60741b;
                while (!this.f60743d.isDisposed()) {
                    int i = this.f60742c;
                    this.f60742c = i + 1;
                    if (i == ph2VarArr.length) {
                        this.f60740a.onComplete();
                        return;
                    } else {
                        ph2VarArr[i].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            m17268a();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f60740a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f60743d.replace(d);
        }
    }

    public me2(ph2[] sources) {
        this.f60739a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C9326a c9326a = new C9326a(observer, this.f60739a);
        observer.onSubscribe(c9326a.f60743d);
        c9326a.m17268a();
    }
}
