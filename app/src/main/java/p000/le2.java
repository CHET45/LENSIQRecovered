package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class le2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2[] f57343a;

    /* JADX INFO: renamed from: le2$a */
    public static final class C8782a extends AtomicInteger implements dh2 {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: a */
        public final dh2 f57344a;

        /* JADX INFO: renamed from: b */
        public final qh2[] f57345b;

        /* JADX INFO: renamed from: c */
        public int f57346c;

        /* JADX INFO: renamed from: d */
        public final b0f f57347d = new b0f();

        public C8782a(dh2 dh2Var, qh2[] qh2VarArr) {
            this.f57344a = dh2Var;
            this.f57345b = qh2VarArr;
        }

        /* JADX INFO: renamed from: a */
        public void m16108a() {
            if (!this.f57347d.isDisposed() && getAndIncrement() == 0) {
                qh2[] qh2VarArr = this.f57345b;
                while (!this.f57347d.isDisposed()) {
                    int i = this.f57346c;
                    this.f57346c = i + 1;
                    if (i == qh2VarArr.length) {
                        this.f57344a.onComplete();
                        return;
                    } else {
                        qh2VarArr[i].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p000.dh2
        public void onComplete() {
            m16108a();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f57344a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f57347d.replace(mf4Var);
        }
    }

    public le2(qh2[] qh2VarArr) {
        this.f57343a = qh2VarArr;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C8782a c8782a = new C8782a(dh2Var, this.f57343a);
        dh2Var.onSubscribe(c8782a.f57347d);
        c8782a.m16108a();
    }
}
