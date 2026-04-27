package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class id6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final T[] f46537b;

    /* JADX INFO: renamed from: id6$a */
    public static final class C7237a<T> extends AbstractC7239c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final bq2<? super T> f46538d;

        public C7237a(bq2<? super T> actual, T[] array) {
            super(array);
            this.f46538d = actual;
        }

        @Override // p000.id6.AbstractC7239c
        /* JADX INFO: renamed from: a */
        public void mo12893a() {
            T[] tArr = this.f46540a;
            int length = tArr.length;
            bq2<? super T> bq2Var = this.f46538d;
            for (int i = this.f46541b; i != length; i++) {
                if (this.f46542c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    bq2Var.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                bq2Var.tryOnNext(t);
            }
            if (this.f46542c) {
                return;
            }
            bq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r10.f46541b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p000.id6.AbstractC7239c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo12894b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f46540a
                int r1 = r0.length
                int r2 = r10.f46541b
                bq2<? super T> r3 = r10.f46538d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L44
                if (r2 == r1) goto L44
                boolean r8 = r10.f46542c
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
                boolean r11 = r10.f46542c
                if (r11 != 0) goto L4d
                r3.onComplete()
            L4d:
                return
            L4e:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f46541b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.id6.C7237a.mo12894b(long):void");
        }
    }

    /* JADX INFO: renamed from: id6$b */
    public static final class C7238b<T> extends AbstractC7239c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f46539d;

        public C7238b(ycg<? super T> actual, T[] array) {
            super(array);
            this.f46539d = actual;
        }

        @Override // p000.id6.AbstractC7239c
        /* JADX INFO: renamed from: a */
        public void mo12893a() {
            T[] tArr = this.f46540a;
            int length = tArr.length;
            ycg<? super T> ycgVar = this.f46539d;
            for (int i = this.f46541b; i != length; i++) {
                if (this.f46542c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    ycgVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                ycgVar.onNext(t);
            }
            if (this.f46542c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            r10.f46541b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p000.id6.AbstractC7239c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo12894b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f46540a
                int r1 = r0.length
                int r2 = r10.f46541b
                ycg<? super T> r3 = r10.f46539d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L41
                if (r2 == r1) goto L41
                boolean r8 = r10.f46542c
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
                boolean r11 = r10.f46542c
                if (r11 != 0) goto L4a
                r3.onComplete()
            L4a:
                return
            L4b:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f46541b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.id6.C7238b.mo12894b(long):void");
        }
    }

    /* JADX INFO: renamed from: id6$c */
    public static abstract class AbstractC7239c<T> extends bw0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final T[] f46540a;

        /* JADX INFO: renamed from: b */
        public int f46541b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f46542c;

        public AbstractC7239c(T[] array) {
            this.f46540a = array;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo12893a();

        /* JADX INFO: renamed from: b */
        public abstract void mo12894b(long r);

        @Override // p000.fdg
        public final void cancel() {
            this.f46542c = true;
        }

        @Override // p000.zif
        public final void clear() {
            this.f46541b = this.f46540a.length;
        }

        @Override // p000.zif
        public final boolean isEmpty() {
            return this.f46541b == this.f46540a.length;
        }

        @Override // p000.zif
        @dib
        public final T poll() {
            int i = this.f46541b;
            T[] tArr = this.f46540a;
            if (i == tArr.length) {
                return null;
            }
            this.f46541b = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "array element is null");
            return t;
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n) && ro0.add(this, n) == 0) {
                if (n == Long.MAX_VALUE) {
                    mo12893a();
                } else {
                    mo12894b(n);
                }
            }
        }

        @Override // p000.vnd
        public final int requestFusion(int mode) {
            return mode & 1;
        }
    }

    public id6(T[] array) {
        this.f46537b = array;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            s.onSubscribe(new C7237a((bq2) s, this.f46537b));
        } else {
            s.onSubscribe(new C7238b(s, this.f46537b));
        }
    }
}
