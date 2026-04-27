package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class he2 extends yd2 implements dh2 {

    /* JADX INFO: renamed from: e */
    public static final C6815a[] f43224e = new C6815a[0];

    /* JADX INFO: renamed from: f */
    public static final C6815a[] f43225f = new C6815a[0];

    /* JADX INFO: renamed from: a */
    public final qh2 f43226a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C6815a[]> f43227b = new AtomicReference<>(f43224e);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f43228c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public Throwable f43229d;

    /* JADX INFO: renamed from: he2$a */
    public final class C6815a extends AtomicBoolean implements mf4 {
        private static final long serialVersionUID = 8943152917179642732L;

        /* JADX INFO: renamed from: a */
        public final dh2 f43230a;

        public C6815a(dh2 dh2Var) {
            this.f43230a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                he2.this.m12327b(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get();
        }
    }

    public he2(qh2 qh2Var) {
        this.f43226a = qh2Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12326a(C6815a c6815a) {
        C6815a[] c6815aArr;
        C6815a[] c6815aArr2;
        do {
            c6815aArr = this.f43227b.get();
            if (c6815aArr == f43225f) {
                return false;
            }
            int length = c6815aArr.length;
            c6815aArr2 = new C6815a[length + 1];
            System.arraycopy(c6815aArr, 0, c6815aArr2, 0, length);
            c6815aArr2[length] = c6815a;
        } while (!v7b.m23844a(this.f43227b, c6815aArr, c6815aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m12327b(C6815a c6815a) {
        C6815a[] c6815aArr;
        C6815a[] c6815aArr2;
        do {
            c6815aArr = this.f43227b.get();
            int length = c6815aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c6815aArr[i] == c6815a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c6815aArr2 = f43224e;
            } else {
                C6815a[] c6815aArr3 = new C6815a[length - 1];
                System.arraycopy(c6815aArr, 0, c6815aArr3, 0, i);
                System.arraycopy(c6815aArr, i + 1, c6815aArr3, i, (length - i) - 1);
                c6815aArr2 = c6815aArr3;
            }
        } while (!v7b.m23844a(this.f43227b, c6815aArr, c6815aArr2));
    }

    @Override // p000.dh2
    public void onComplete() {
        for (C6815a c6815a : this.f43227b.getAndSet(f43225f)) {
            if (!c6815a.get()) {
                c6815a.f43230a.onComplete();
            }
        }
    }

    @Override // p000.dh2
    public void onError(Throwable th) {
        this.f43229d = th;
        for (C6815a c6815a : this.f43227b.getAndSet(f43225f)) {
            if (!c6815a.get()) {
                c6815a.f43230a.onError(th);
            }
        }
    }

    @Override // p000.dh2
    public void onSubscribe(mf4 mf4Var) {
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C6815a c6815a = new C6815a(dh2Var);
        dh2Var.onSubscribe(c6815a);
        if (m12326a(c6815a)) {
            if (c6815a.isDisposed()) {
                m12327b(c6815a);
            }
            if (this.f43228c.compareAndSet(false, true)) {
                this.f43226a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f43229d;
        if (th != null) {
            dh2Var.onError(th);
        } else {
            dh2Var.onComplete();
        }
    }
}
