package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sg6<T> extends nr2<T> implements eh7<T>, vg6<T> {

    /* JADX INFO: renamed from: f */
    public static final long f81709f = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public final m86<T> f81710b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C12568c<T>> f81711c;

    /* JADX INFO: renamed from: d */
    public final int f81712d;

    /* JADX INFO: renamed from: e */
    public final zjd<T> f81713e;

    /* JADX INFO: renamed from: sg6$a */
    public static final class C12566a<T> implements zjd<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C12568c<T>> f81714a;

        /* JADX INFO: renamed from: b */
        public final int f81715b;

        public C12566a(AtomicReference<C12568c<T>> atomicReference, int i) {
            this.f81714a = atomicReference;
            this.f81715b = i;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> ycgVar) {
            C12568c<T> c12568c;
            C12567b<T> c12567b = new C12567b<>(ycgVar);
            ycgVar.onSubscribe(c12567b);
            while (true) {
                c12568c = this.f81714a.get();
                if (c12568c == null || c12568c.isDisposed()) {
                    C12568c<T> c12568c2 = new C12568c<>(this.f81714a, this.f81715b);
                    if (v7b.m23844a(this.f81714a, c12568c, c12568c2)) {
                        c12568c = c12568c2;
                    } else {
                        continue;
                    }
                }
                if (c12568c.m21949a(c12567b)) {
                    break;
                }
            }
            if (c12567b.get() == Long.MIN_VALUE) {
                c12568c.m21952d(c12567b);
            } else {
                c12567b.f81717b = c12568c;
            }
            c12568c.m21951c();
        }
    }

    /* JADX INFO: renamed from: sg6$b */
    public static final class C12567b<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f81716a;

        /* JADX INFO: renamed from: b */
        public volatile C12568c<T> f81717b;

        /* JADX INFO: renamed from: c */
        public long f81718c;

        public C12567b(ycg<? super T> ycgVar) {
            this.f81716a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            C12568c<T> c12568c;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (c12568c = this.f81717b) == null) {
                return;
            }
            c12568c.m21952d(this);
            c12568c.m21951c();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.addCancel(this, j);
                C12568c<T> c12568c = this.f81717b;
                if (c12568c != null) {
                    c12568c.m21951c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: sg6$c */
    public static final class C12568c<T> extends AtomicInteger implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: F */
        public static final C12567b[] f81719F = new C12567b[0];

        /* JADX INFO: renamed from: H */
        public static final C12567b[] f81720H = new C12567b[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* JADX INFO: renamed from: C */
        public volatile ajf<T> f81721C;

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C12568c<T>> f81722a;

        /* JADX INFO: renamed from: b */
        public final int f81723b;

        /* JADX INFO: renamed from: f */
        public volatile Object f81727f;

        /* JADX INFO: renamed from: m */
        public int f81728m;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<fdg> f81726e = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C12567b<T>[]> f81724c = new AtomicReference<>(f81719F);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f81725d = new AtomicBoolean();

        public C12568c(AtomicReference<C12568c<T>> atomicReference, int i) {
            this.f81722a = atomicReference;
            this.f81723b = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m21949a(C12567b<T> c12567b) {
            C12567b<T>[] c12567bArr;
            C12567b[] c12567bArr2;
            do {
                c12567bArr = this.f81724c.get();
                if (c12567bArr == f81720H) {
                    return false;
                }
                int length = c12567bArr.length;
                c12567bArr2 = new C12567b[length + 1];
                System.arraycopy(c12567bArr, 0, c12567bArr2, 0, length);
                c12567bArr2[length] = c12567b;
            } while (!v7b.m23844a(this.f81724c, c12567bArr, c12567bArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m21950b(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!ehb.isComplete(obj)) {
                    Throwable error = ehb.getError(obj);
                    v7b.m23844a(this.f81722a, this, null);
                    C12567b<T>[] andSet = this.f81724c.getAndSet(f81720H);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].f81716a.onError(error);
                            i++;
                        }
                    } else {
                        pfe.onError(error);
                    }
                    return true;
                }
                if (z) {
                    v7b.m23844a(this.f81722a, this, null);
                    C12567b<T>[] andSet2 = this.f81724c.getAndSet(f81720H);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].f81716a.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
        
            if (r11 == 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
        
            if (r25.f81728m == 1) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
        
            r25.f81726e.get().request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0137, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m21951c() {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sg6.C12568c.m21951c():void");
        }

        /* JADX INFO: renamed from: d */
        public void m21952d(C12567b<T> c12567b) {
            C12567b<T>[] c12567bArr;
            C12567b[] c12567bArr2;
            do {
                c12567bArr = this.f81724c.get();
                int length = c12567bArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c12567bArr[i].equals(c12567b)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c12567bArr2 = f81719F;
                } else {
                    C12567b[] c12567bArr3 = new C12567b[length - 1];
                    System.arraycopy(c12567bArr, 0, c12567bArr3, 0, i);
                    System.arraycopy(c12567bArr, i + 1, c12567bArr3, i, (length - i) - 1);
                    c12567bArr2 = c12567bArr3;
                }
            } while (!v7b.m23844a(this.f81724c, c12567bArr, c12567bArr2));
        }

        @Override // p000.mf4
        public void dispose() {
            C12567b<T>[] c12567bArr = this.f81724c.get();
            C12567b<T>[] c12567bArr2 = f81720H;
            if (c12567bArr == c12567bArr2 || this.f81724c.getAndSet(c12567bArr2) == c12567bArr2) {
                return;
            }
            v7b.m23844a(this.f81722a, this, null);
            mdg.cancel(this.f81726e);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f81724c.get() == f81720H;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81727f == null) {
                this.f81727f = ehb.complete();
                m21951c();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f81727f != null) {
                pfe.onError(th);
            } else {
                this.f81727f = ehb.error(th);
                m21951c();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f81728m != 0 || this.f81721C.offer(t)) {
                m21951c();
            } else {
                onError(new cwa("Prefetch queue is full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f81726e, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f81728m = iRequestFusion;
                        this.f81721C = codVar;
                        this.f81727f = ehb.complete();
                        m21951c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f81728m = iRequestFusion;
                        this.f81721C = codVar;
                        fdgVar.request(this.f81723b);
                        return;
                    }
                }
                this.f81721C = new pzf(this.f81723b);
                fdgVar.request(this.f81723b);
            }
        }
    }

    private sg6(zjd<T> zjdVar, m86<T> m86Var, AtomicReference<C12568c<T>> atomicReference, int i) {
        this.f81713e = zjdVar;
        this.f81710b = m86Var;
        this.f81711c = atomicReference;
        this.f81712d = i;
    }

    public static <T> nr2<T> create(m86<T> m86Var, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return pfe.onAssembly((nr2) new sg6(new C12566a(atomicReference, i), m86Var, atomicReference, i));
    }

    @Override // p000.nr2
    public void connect(tu2<? super mf4> tu2Var) {
        C12568c<T> c12568c;
        while (true) {
            c12568c = this.f81711c.get();
            if (c12568c != null && !c12568c.isDisposed()) {
                break;
            }
            C12568c<T> c12568c2 = new C12568c<>(this.f81711c, this.f81712d);
            if (v7b.m23844a(this.f81711c, c12568c, c12568c2)) {
                c12568c = c12568c2;
                break;
            }
        }
        boolean z = false;
        if (!c12568c.f81725d.get() && c12568c.f81725d.compareAndSet(false, true)) {
            z = true;
        }
        try {
            tu2Var.accept(c12568c);
            if (z) {
                this.f81710b.subscribe((lj6) c12568c);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.vg6
    public int publishBufferSize() {
        return this.f81712d;
    }

    @Override // p000.vg6
    public zjd<T> publishSource() {
        return this.f81710b;
    }

    @Override // p000.eh7
    public zjd<T> source() {
        return this.f81710b;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f81713e.subscribe(ycgVar);
    }
}
