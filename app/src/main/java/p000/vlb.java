package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vlb<T> extends AbstractC10162o3<T, T> implements oxb<T> {

    /* JADX INFO: renamed from: L */
    public static final C14153a[] f91594L = new C14153a[0];

    /* JADX INFO: renamed from: M */
    public static final C14153a[] f91595M = new C14153a[0];

    /* JADX INFO: renamed from: C */
    public int f91596C;

    /* JADX INFO: renamed from: F */
    public Throwable f91597F;

    /* JADX INFO: renamed from: H */
    public volatile boolean f91598H;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f91599b;

    /* JADX INFO: renamed from: c */
    public final int f91600c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C14153a<T>[]> f91601d;

    /* JADX INFO: renamed from: e */
    public volatile long f91602e;

    /* JADX INFO: renamed from: f */
    public final C14154b<T> f91603f;

    /* JADX INFO: renamed from: m */
    public C14154b<T> f91604m;

    /* JADX INFO: renamed from: vlb$a */
    public static final class C14153a<T> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f91605a;

        /* JADX INFO: renamed from: b */
        public final vlb<T> f91606b;

        /* JADX INFO: renamed from: c */
        public C14154b<T> f91607c;

        /* JADX INFO: renamed from: d */
        public int f91608d;

        /* JADX INFO: renamed from: e */
        public long f91609e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f91610f;

        public C14153a(oxb<? super T> oxbVar, vlb<T> vlbVar) {
            this.f91605a = oxbVar;
            this.f91606b = vlbVar;
            this.f91607c = vlbVar.f91603f;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f91610f) {
                return;
            }
            this.f91610f = true;
            this.f91606b.m24057d(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91610f;
        }
    }

    /* JADX INFO: renamed from: vlb$b */
    public static final class C14154b<T> {

        /* JADX INFO: renamed from: a */
        public final T[] f91611a;

        /* JADX INFO: renamed from: b */
        public volatile C14154b<T> f91612b;

        public C14154b(int i) {
            this.f91611a = (T[]) new Object[i];
        }
    }

    public vlb(Observable<T> observable, int i) {
        super(observable);
        this.f91600c = i;
        this.f91599b = new AtomicBoolean();
        C14154b<T> c14154b = new C14154b<>(i);
        this.f91603f = c14154b;
        this.f91604m = c14154b;
        this.f91601d = new AtomicReference<>(f91594L);
    }

    /* JADX INFO: renamed from: a */
    public void m24054a(C14153a<T> c14153a) {
        C14153a<T>[] c14153aArr;
        C14153a[] c14153aArr2;
        do {
            c14153aArr = this.f91601d.get();
            if (c14153aArr == f91595M) {
                return;
            }
            int length = c14153aArr.length;
            c14153aArr2 = new C14153a[length + 1];
            System.arraycopy(c14153aArr, 0, c14153aArr2, 0, length);
            c14153aArr2[length] = c14153a;
        } while (!v7b.m23844a(this.f91601d, c14153aArr, c14153aArr2));
    }

    /* JADX INFO: renamed from: b */
    public long m24055b() {
        return this.f91602e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24056c() {
        return this.f91599b.get();
    }

    /* JADX INFO: renamed from: d */
    public void m24057d(C14153a<T> c14153a) {
        C14153a<T>[] c14153aArr;
        C14153a[] c14153aArr2;
        do {
            c14153aArr = this.f91601d.get();
            int length = c14153aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14153aArr[i] == c14153a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14153aArr2 = f91594L;
            } else {
                C14153a[] c14153aArr3 = new C14153a[length - 1];
                System.arraycopy(c14153aArr, 0, c14153aArr3, 0, i);
                System.arraycopy(c14153aArr, i + 1, c14153aArr3, i, (length - i) - 1);
                c14153aArr2 = c14153aArr3;
            }
        } while (!v7b.m23844a(this.f91601d, c14153aArr, c14153aArr2));
    }

    /* JADX INFO: renamed from: e */
    public void m24058e(C14153a<T> c14153a) {
        if (c14153a.getAndIncrement() != 0) {
            return;
        }
        long j = c14153a.f91609e;
        int i = c14153a.f91608d;
        C14154b<T> c14154b = c14153a.f91607c;
        oxb<? super T> oxbVar = c14153a.f91605a;
        int i2 = this.f91600c;
        int iAddAndGet = 1;
        while (!c14153a.f91610f) {
            boolean z = this.f91598H;
            boolean z2 = this.f91602e == j;
            if (z && z2) {
                c14153a.f91607c = null;
                Throwable th = this.f91597F;
                if (th != null) {
                    oxbVar.onError(th);
                    return;
                } else {
                    oxbVar.onComplete();
                    return;
                }
            }
            if (z2) {
                c14153a.f91609e = j;
                c14153a.f91608d = i;
                c14153a.f91607c = c14154b;
                iAddAndGet = c14153a.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    c14154b = c14154b.f91612b;
                    i = 0;
                }
                oxbVar.onNext(c14154b.f91611a[i]);
                i++;
                j++;
            }
        }
        c14153a.f91607c = null;
    }

    public boolean hasObservers() {
        return this.f91601d.get().length != 0;
    }

    @Override // p000.oxb
    public void onComplete() {
        this.f91598H = true;
        for (C14153a<T> c14153a : this.f91601d.getAndSet(f91595M)) {
            m24058e(c14153a);
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        this.f91597F = th;
        this.f91598H = true;
        for (C14153a<T> c14153a : this.f91601d.getAndSet(f91595M)) {
            m24058e(c14153a);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        int i = this.f91596C;
        if (i == this.f91600c) {
            C14154b<T> c14154b = new C14154b<>(i);
            c14154b.f91611a[0] = t;
            this.f91596C = 1;
            this.f91604m.f91612b = c14154b;
            this.f91604m = c14154b;
        } else {
            this.f91604m.f91611a[i] = t;
            this.f91596C = i + 1;
        }
        this.f91602e++;
        for (C14153a<T> c14153a : this.f91601d.get()) {
            m24058e(c14153a);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C14153a<T> c14153a = new C14153a<>(oxbVar, this);
        oxbVar.onSubscribe(c14153a);
        m24054a(c14153a);
        if (this.f91599b.get() || !this.f91599b.compareAndSet(false, true)) {
            m24058e(c14153a);
        } else {
            this.f66354a.subscribe(this);
        }
    }
}
