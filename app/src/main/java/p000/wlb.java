package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wlb<T> extends AbstractC9666n3<T, T> implements pxb<T> {

    /* JADX INFO: renamed from: L */
    public static final C14672a[] f94630L = new C14672a[0];

    /* JADX INFO: renamed from: M */
    public static final C14672a[] f94631M = new C14672a[0];

    /* JADX INFO: renamed from: C */
    public int f94632C;

    /* JADX INFO: renamed from: F */
    public Throwable f94633F;

    /* JADX INFO: renamed from: H */
    public volatile boolean f94634H;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f94635b;

    /* JADX INFO: renamed from: c */
    public final int f94636c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C14672a<T>[]> f94637d;

    /* JADX INFO: renamed from: e */
    public volatile long f94638e;

    /* JADX INFO: renamed from: f */
    public final C14673b<T> f94639f;

    /* JADX INFO: renamed from: m */
    public C14673b<T> f94640m;

    /* JADX INFO: renamed from: wlb$a */
    public static final class C14672a<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f94641a;

        /* JADX INFO: renamed from: b */
        public final wlb<T> f94642b;

        /* JADX INFO: renamed from: c */
        public C14673b<T> f94643c;

        /* JADX INFO: renamed from: d */
        public int f94644d;

        /* JADX INFO: renamed from: e */
        public long f94645e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f94646f;

        public C14672a(pxb<? super T> downstream, wlb<T> parent) {
            this.f94641a = downstream;
            this.f94642b = parent;
            this.f94643c = parent.f94639f;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f94646f) {
                return;
            }
            this.f94646f = true;
            this.f94642b.m24652d(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94646f;
        }
    }

    /* JADX INFO: renamed from: wlb$b */
    public static final class C14673b<T> {

        /* JADX INFO: renamed from: a */
        public final T[] f94647a;

        /* JADX INFO: renamed from: b */
        public volatile C14673b<T> f94648b;

        public C14673b(int i) {
            this.f94647a = (T[]) new Object[i];
        }
    }

    public wlb(vkb<T> source, int capacityHint) {
        super(source);
        this.f94636c = capacityHint;
        this.f94635b = new AtomicBoolean();
        C14673b<T> c14673b = new C14673b<>(capacityHint);
        this.f94639f = c14673b;
        this.f94640m = c14673b;
        this.f94637d = new AtomicReference<>(f94630L);
    }

    /* JADX INFO: renamed from: a */
    public void m24649a(C14672a<T> consumer) {
        C14672a<T>[] c14672aArr;
        C14672a[] c14672aArr2;
        do {
            c14672aArr = this.f94637d.get();
            if (c14672aArr == f94631M) {
                return;
            }
            int length = c14672aArr.length;
            c14672aArr2 = new C14672a[length + 1];
            System.arraycopy(c14672aArr, 0, c14672aArr2, 0, length);
            c14672aArr2[length] = consumer;
        } while (!v7b.m23844a(this.f94637d, c14672aArr, c14672aArr2));
    }

    /* JADX INFO: renamed from: b */
    public long m24650b() {
        return this.f94638e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24651c() {
        return this.f94635b.get();
    }

    /* JADX INFO: renamed from: d */
    public void m24652d(C14672a<T> consumer) {
        C14672a<T>[] c14672aArr;
        C14672a[] c14672aArr2;
        do {
            c14672aArr = this.f94637d.get();
            int length = c14672aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14672aArr[i] == consumer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14672aArr2 = f94630L;
            } else {
                C14672a[] c14672aArr3 = new C14672a[length - 1];
                System.arraycopy(c14672aArr, 0, c14672aArr3, 0, i);
                System.arraycopy(c14672aArr, i + 1, c14672aArr3, i, (length - i) - 1);
                c14672aArr2 = c14672aArr3;
            }
        } while (!v7b.m23844a(this.f94637d, c14672aArr, c14672aArr2));
    }

    /* JADX INFO: renamed from: e */
    public void m24653e(C14672a<T> c14672a) {
        if (c14672a.getAndIncrement() != 0) {
            return;
        }
        long j = c14672a.f94645e;
        int i = c14672a.f94644d;
        C14673b<T> c14673b = c14672a.f94643c;
        pxb<? super T> pxbVar = c14672a.f94641a;
        int i2 = this.f94636c;
        int iAddAndGet = 1;
        while (!c14672a.f94646f) {
            boolean z = this.f94634H;
            boolean z2 = this.f94638e == j;
            if (z && z2) {
                c14672a.f94643c = null;
                Throwable th = this.f94633F;
                if (th != null) {
                    pxbVar.onError(th);
                    return;
                } else {
                    pxbVar.onComplete();
                    return;
                }
            }
            if (z2) {
                c14672a.f94645e = j;
                c14672a.f94644d = i;
                c14672a.f94643c = c14673b;
                iAddAndGet = c14672a.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    c14673b = c14673b.f94648b;
                    i = 0;
                }
                pxbVar.onNext(c14673b.f94647a[i]);
                i++;
                j++;
            }
        }
        c14672a.f94643c = null;
    }

    public boolean hasObservers() {
        return this.f94637d.get().length != 0;
    }

    @Override // p000.pxb
    public void onComplete() {
        this.f94634H = true;
        for (C14672a<T> c14672a : this.f94637d.getAndSet(f94631M)) {
            m24653e(c14672a);
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        this.f94633F = t;
        this.f94634H = true;
        for (C14672a<T> c14672a : this.f94637d.getAndSet(f94631M)) {
            m24653e(c14672a);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        int i = this.f94632C;
        if (i == this.f94636c) {
            C14673b<T> c14673b = new C14673b<>(i);
            c14673b.f94647a[0] = t;
            this.f94632C = 1;
            this.f94640m.f94648b = c14673b;
            this.f94640m = c14673b;
        } else {
            this.f94640m.f94647a[i] = t;
            this.f94632C = i + 1;
        }
        this.f94638e++;
        for (C14672a<T> c14672a : this.f94637d.get()) {
            m24653e(c14672a);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        C14672a<T> c14672a = new C14672a<>(t, this);
        t.onSubscribe(c14672a);
        m24649a(c14672a);
        if (this.f94635b.get() || !this.f94635b.compareAndSet(false, true)) {
            m24653e(c14672a);
        } else {
            this.f63101a.subscribe(this);
        }
    }
}
