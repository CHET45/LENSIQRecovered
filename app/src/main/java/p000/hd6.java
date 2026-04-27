package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hd6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final T[] f43187b;

    /* JADX INFO: renamed from: hd6$a */
    public static final class C6807a<T> extends AbstractC6809c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final cq2<? super T> f43188d;

        public C6807a(cq2<? super T> cq2Var, T[] tArr) {
            super(tArr);
            this.f43188d = cq2Var;
        }

        @Override // p000.hd6.AbstractC6809c
        /* JADX INFO: renamed from: a */
        public void mo12319a() {
            T[] tArr = this.f43190a;
            int length = tArr.length;
            cq2<? super T> cq2Var = this.f43188d;
            for (int i = this.f43191b; i != length; i++) {
                if (this.f43192c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    cq2Var.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                cq2Var.tryOnNext(t);
            }
            if (this.f43192c) {
                return;
            }
            cq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r10.f43191b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p000.hd6.AbstractC6809c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo12320b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f43190a
                int r1 = r0.length
                int r2 = r10.f43191b
                cq2<? super T> r3 = r10.f43188d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L44
                if (r2 == r1) goto L44
                boolean r8 = r10.f43192c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                boolean r8 = r3.tryOnNext(r8)
                if (r8 == 0) goto L41
                r8 = 1
                long r6 = r6 + r8
            L41:
                int r2 = r2 + 1
                goto La
            L44:
                if (r2 != r1) goto L4e
                boolean r11 = r10.f43192c
                if (r11 != 0) goto L4d
                r3.onComplete()
            L4d:
                return
            L4e:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f43191b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.hd6.C6807a.mo12320b(long):void");
        }
    }

    /* JADX INFO: renamed from: hd6$b */
    public static final class C6808b<T> extends AbstractC6809c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f43189d;

        public C6808b(ycg<? super T> ycgVar, T[] tArr) {
            super(tArr);
            this.f43189d = ycgVar;
        }

        @Override // p000.hd6.AbstractC6809c
        /* JADX INFO: renamed from: a */
        public void mo12319a() {
            T[] tArr = this.f43190a;
            int length = tArr.length;
            ycg<? super T> ycgVar = this.f43189d;
            for (int i = this.f43191b; i != length; i++) {
                if (this.f43192c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    ycgVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                ycgVar.onNext(t);
            }
            if (this.f43192c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            r10.f43191b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p000.hd6.AbstractC6809c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo12320b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f43190a
                int r1 = r0.length
                int r2 = r10.f43191b
                ycg<? super T> r3 = r10.f43189d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L41
                if (r2 == r1) goto L41
                boolean r8 = r10.f43192c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                r3.onNext(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L41:
                if (r2 != r1) goto L4b
                boolean r11 = r10.f43192c
                if (r11 != 0) goto L4a
                r3.onComplete()
            L4a:
                return
            L4b:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f43191b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.hd6.C6808b.mo12320b(long):void");
        }
    }

    /* JADX INFO: renamed from: hd6$c */
    public static abstract class AbstractC6809c<T> extends cw0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final T[] f43190a;

        /* JADX INFO: renamed from: b */
        public int f43191b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f43192c;

        public AbstractC6809c(T[] tArr) {
            this.f43190a = tArr;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo12319a();

        /* JADX INFO: renamed from: b */
        public abstract void mo12320b(long j);

        @Override // p000.fdg
        public final void cancel() {
            this.f43192c = true;
        }

        @Override // p000.ajf
        public final void clear() {
            this.f43191b = this.f43190a.length;
        }

        @Override // p000.ajf
        public final boolean isEmpty() {
            return this.f43191b == this.f43190a.length;
        }

        @Override // p000.ajf
        @cib
        public final T poll() {
            int i = this.f43191b;
            T[] tArr = this.f43190a;
            if (i == tArr.length) {
                return null;
            }
            this.f43191b = i + 1;
            return (T) xjb.requireNonNull(tArr[i], "array element is null");
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j) && so0.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo12319a();
                } else {
                    mo12320b(j);
                }
            }
        }

        @Override // p000.wnd
        public final int requestFusion(int i) {
            return i & 1;
        }
    }

    public hd6(T[] tArr) {
        this.f43187b = tArr;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            ycgVar.onSubscribe(new C6807a((cq2) ycgVar, this.f43187b));
        } else {
            ycgVar.onSubscribe(new C6808b(ycgVar, this.f43187b));
        }
    }
}
