package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ug6<T> extends nr2<T> implements eh7<T>, m5e {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f87960b;

    /* JADX INFO: renamed from: c */
    public final int f87961c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C13537b<T>> f87962d = new AtomicReference<>();

    /* JADX INFO: renamed from: ug6$a */
    public static final class C13536a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 2845000326761540265L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f87963a;

        /* JADX INFO: renamed from: b */
        public final C13537b<T> f87964b;

        /* JADX INFO: renamed from: c */
        public long f87965c;

        public C13536a(ycg<? super T> ycgVar, C13537b<T> c13537b) {
            this.f87963a = ycgVar;
            this.f87964b = c13537b;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f87964b.m23342d(this);
                this.f87964b.m23341c();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.addCancel(this, j);
            this.f87964b.m23341c();
        }
    }

    /* JADX INFO: renamed from: ug6$b */
    public static final class C13537b<T> extends AtomicInteger implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: L */
        public static final C13536a[] f87966L = new C13536a[0];

        /* JADX INFO: renamed from: M */
        public static final C13536a[] f87967M = new C13536a[0];
        private static final long serialVersionUID = -1672047311619175801L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f87968C;

        /* JADX INFO: renamed from: F */
        public Throwable f87969F;

        /* JADX INFO: renamed from: H */
        public int f87970H;

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C13537b<T>> f87971a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f87972b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f87973c = new AtomicBoolean();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<C13536a<T>[]> f87974d = new AtomicReference<>(f87966L);

        /* JADX INFO: renamed from: e */
        public final int f87975e;

        /* JADX INFO: renamed from: f */
        public volatile ajf<T> f87976f;

        /* JADX INFO: renamed from: m */
        public int f87977m;

        public C13537b(AtomicReference<C13537b<T>> atomicReference, int i) {
            this.f87971a = atomicReference;
            this.f87975e = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m23339a(C13536a<T> c13536a) {
            C13536a<T>[] c13536aArr;
            C13536a[] c13536aArr2;
            do {
                c13536aArr = this.f87974d.get();
                if (c13536aArr == f87967M) {
                    return false;
                }
                int length = c13536aArr.length;
                c13536aArr2 = new C13536a[length + 1];
                System.arraycopy(c13536aArr, 0, c13536aArr2, 0, length);
                c13536aArr2[length] = c13536a;
            } while (!v7b.m23844a(this.f87974d, c13536aArr, c13536aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m23340b(boolean z, boolean z2) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.f87969F;
            if (th != null) {
                m23343e(th);
                return true;
            }
            for (C13536a<T> c13536a : this.f87974d.getAndSet(f87967M)) {
                if (!c13536a.isCancelled()) {
                    c13536a.f87963a.onComplete();
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m23341c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ajf<T> ajfVar = this.f87976f;
            int i = this.f87970H;
            int i2 = this.f87975e;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.f87977m != 1;
            int iAddAndGet = 1;
            ajf<T> ajfVar2 = ajfVar;
            int i4 = i;
            while (true) {
                if (ajfVar2 != null) {
                    C13536a<T>[] c13536aArr = this.f87974d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z2 = false;
                    for (C13536a<T> c13536a : c13536aArr) {
                        long j = c13536a.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - c13536a.f87965c, jMin);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        jMin = 0;
                    }
                    for (long j2 = 0; jMin != j2; j2 = 0) {
                        boolean z3 = this.f87968C;
                        try {
                            T tPoll = ajfVar2.poll();
                            boolean z4 = tPoll == null;
                            if (m23340b(z3, z4)) {
                                return;
                            }
                            if (z4) {
                                break;
                            }
                            for (C13536a<T> c13536a2 : c13536aArr) {
                                if (!c13536a2.isCancelled()) {
                                    c13536a2.f87963a.onNext(tPoll);
                                    c13536a2.f87965c++;
                                }
                            }
                            if (z && (i4 = i4 + 1) == i3) {
                                this.f87972b.get().request(i3);
                                i4 = 0;
                            }
                            jMin--;
                            if (c13536aArr != this.f87974d.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f87972b.get().cancel();
                            ajfVar2.clear();
                            this.f87968C = true;
                            m23343e(th);
                            return;
                        }
                    }
                    if (m23340b(this.f87968C, ajfVar2.isEmpty())) {
                        return;
                    }
                }
                this.f87970H = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (ajfVar2 == null) {
                    ajfVar2 = this.f87976f;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m23342d(C13536a<T> c13536a) {
            C13536a<T>[] c13536aArr;
            C13536a[] c13536aArr2;
            do {
                c13536aArr = this.f87974d.get();
                int length = c13536aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c13536aArr[i] == c13536a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c13536aArr2 = f87966L;
                } else {
                    C13536a[] c13536aArr3 = new C13536a[length - 1];
                    System.arraycopy(c13536aArr, 0, c13536aArr3, 0, i);
                    System.arraycopy(c13536aArr, i + 1, c13536aArr3, i, (length - i) - 1);
                    c13536aArr2 = c13536aArr3;
                }
            } while (!v7b.m23844a(this.f87974d, c13536aArr, c13536aArr2));
        }

        @Override // p000.mf4
        public void dispose() {
            this.f87974d.getAndSet(f87967M);
            v7b.m23844a(this.f87971a, this, null);
            mdg.cancel(this.f87972b);
        }

        /* JADX INFO: renamed from: e */
        public void m23343e(Throwable th) {
            for (C13536a<T> c13536a : this.f87974d.getAndSet(f87967M)) {
                if (!c13536a.isCancelled()) {
                    c13536a.f87963a.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f87974d.get() == f87967M;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f87968C = true;
            m23341c();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f87968C) {
                pfe.onError(th);
                return;
            }
            this.f87969F = th;
            this.f87968C = true;
            m23341c();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f87977m != 0 || this.f87976f.offer(t)) {
                m23341c();
            } else {
                onError(new cwa("Prefetch queue is full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f87972b, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f87977m = iRequestFusion;
                        this.f87976f = codVar;
                        this.f87968C = true;
                        m23341c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f87977m = iRequestFusion;
                        this.f87976f = codVar;
                        fdgVar.request(this.f87975e);
                        return;
                    }
                }
                this.f87976f = new pzf(this.f87975e);
                fdgVar.request(this.f87975e);
            }
        }
    }

    public ug6(zjd<T> zjdVar, int i) {
        this.f87960b = zjdVar;
        this.f87961c = i;
    }

    @Override // p000.nr2
    public void connect(tu2<? super mf4> tu2Var) {
        C13537b<T> c13537b;
        while (true) {
            c13537b = this.f87962d.get();
            if (c13537b != null && !c13537b.isDisposed()) {
                break;
            }
            C13537b<T> c13537b2 = new C13537b<>(this.f87962d, this.f87961c);
            if (v7b.m23844a(this.f87962d, c13537b, c13537b2)) {
                c13537b = c13537b2;
                break;
            }
        }
        boolean z = false;
        if (!c13537b.f87973c.get() && c13537b.f87973c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            tu2Var.accept(c13537b);
            if (z) {
                this.f87960b.subscribe(c13537b);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    public int publishBufferSize() {
        return this.f87961c;
    }

    @Override // p000.m5e
    public void resetIf(mf4 mf4Var) {
        v7b.m23844a(this.f87962d, (C13537b) mf4Var, null);
    }

    @Override // p000.eh7
    public zjd<T> source() {
        return this.f87960b;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C13537b<T> c13537b;
        while (true) {
            c13537b = this.f87962d.get();
            if (c13537b != null) {
                break;
            }
            C13537b<T> c13537b2 = new C13537b<>(this.f87962d, this.f87961c);
            if (v7b.m23844a(this.f87962d, c13537b, c13537b2)) {
                c13537b = c13537b2;
                break;
            }
        }
        C13536a<T> c13536a = new C13536a<>(ycgVar, c13537b);
        ycgVar.onSubscribe(c13536a);
        if (c13537b.m23339a(c13536a)) {
            if (c13536a.isCancelled()) {
                c13537b.m23342d(c13536a);
                return;
            } else {
                c13537b.m23341c();
                return;
            }
        }
        Throwable th = c13537b.f87969F;
        if (th != null) {
            ycgVar.onError(th);
        } else {
            ycgVar.onComplete();
        }
    }
}
