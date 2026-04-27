package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ffc<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final fec<List<T>> f36366b;

    /* JADX INFO: renamed from: c */
    public final Comparator<? super T> f36367c;

    /* JADX INFO: renamed from: ffc$a */
    public static final class C5766a<T> extends AtomicReference<fdg> implements lj6<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;

        /* JADX INFO: renamed from: a */
        public final C5767b<T> f36368a;

        /* JADX INFO: renamed from: b */
        public final int f36369b;

        public C5766a(C5767b<T> c5767b, int i) {
            this.f36368a = c5767b;
            this.f36369b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m10869a() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f36368a.m10872c(th);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }

        @Override // p000.ycg
        public void onNext(List<T> list) {
            this.f36368a.m10873d(list, this.f36369b);
        }
    }

    /* JADX INFO: renamed from: ffc$b */
    public static final class C5767b<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 3481980673745556697L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f36372a;

        /* JADX INFO: renamed from: b */
        public final C5766a<T>[] f36373b;

        /* JADX INFO: renamed from: c */
        public final List<T>[] f36374c;

        /* JADX INFO: renamed from: d */
        public final int[] f36375d;

        /* JADX INFO: renamed from: e */
        public final Comparator<? super T> f36376e;

        /* JADX INFO: renamed from: m */
        public volatile boolean f36378m;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f36377f = new AtomicLong();

        /* JADX INFO: renamed from: C */
        public final AtomicInteger f36370C = new AtomicInteger();

        /* JADX INFO: renamed from: F */
        public final AtomicReference<Throwable> f36371F = new AtomicReference<>();

        public C5767b(ycg<? super T> ycgVar, int i, Comparator<? super T> comparator) {
            this.f36372a = ycgVar;
            this.f36376e = comparator;
            C5766a<T>[] c5766aArr = new C5766a[i];
            for (int i2 = 0; i2 < i; i2++) {
                c5766aArr[i2] = new C5766a<>(this, i2);
            }
            this.f36373b = c5766aArr;
            this.f36374c = new List[i];
            this.f36375d = new int[i];
            this.f36370C.lazySet(i);
        }

        /* JADX INFO: renamed from: a */
        public void m10870a() {
            for (C5766a<T> c5766a : this.f36373b) {
                c5766a.m10869a();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        
            if (r11 != r7) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
        
            if (r16.f36378m == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        
            r10 = r16.f36371F.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
        
            if (r10 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
        
            m10870a();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
        
            if (r14 >= r4) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
        
            if (r0[r14] == r3[r14].size()) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
        
            r14 = r14 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00da, code lost:
        
            if (r11 == 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
        
            if (r7 == Long.MAX_VALUE) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
        
            r16.f36377f.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
        
            if (r5 != r6) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:
        
            r5 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
        
            if (r5 != 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10871b() {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ffc.C5767b.m10871b():void");
        }

        /* JADX INFO: renamed from: c */
        public void m10872c(Throwable th) {
            if (v7b.m23844a(this.f36371F, null, th)) {
                m10871b();
            } else if (th != this.f36371F.get()) {
                pfe.onError(th);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f36378m) {
                return;
            }
            this.f36378m = true;
            m10870a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f36374c, (Object) null);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m10873d(List<T> list, int i) {
            this.f36374c[i] = list;
            if (this.f36370C.decrementAndGet() == 0) {
                m10871b();
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f36377f, j);
                if (this.f36370C.get() == 0) {
                    m10871b();
                }
            }
        }
    }

    public ffc(fec<List<T>> fecVar, Comparator<? super T> comparator) {
        this.f36366b = fecVar;
        this.f36367c = comparator;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C5767b c5767b = new C5767b(ycgVar, this.f36366b.parallelism(), this.f36367c);
        ycgVar.onSubscribe(c5767b);
        this.f36366b.subscribe(c5767b.f36373b);
    }
}
