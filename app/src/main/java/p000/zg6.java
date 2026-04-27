package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zg6 extends l86<Integer> {

    /* JADX INFO: renamed from: b */
    public final int f105045b;

    /* JADX INFO: renamed from: c */
    public final int f105046c;

    /* JADX INFO: renamed from: zg6$a */
    public static abstract class AbstractC16128a extends bw0<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final int f105047a;

        /* JADX INFO: renamed from: b */
        public int f105048b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f105049c;

        public AbstractC16128a(int index, int end) {
            this.f105048b = index;
            this.f105047a = end;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo26796a();

        /* JADX INFO: renamed from: b */
        public abstract void mo26797b(long r);

        @Override // p000.fdg
        public final void cancel() {
            this.f105049c = true;
        }

        @Override // p000.zif
        public final void clear() {
            this.f105048b = this.f105047a;
        }

        @Override // p000.zif
        public final boolean isEmpty() {
            return this.f105048b == this.f105047a;
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n) && ro0.add(this, n) == 0) {
                if (n == Long.MAX_VALUE) {
                    mo26796a();
                } else {
                    mo26797b(n);
                }
            }
        }

        @Override // p000.vnd
        public final int requestFusion(int mode) {
            return mode & 1;
        }

        @Override // p000.zif
        @dib
        public final Integer poll() {
            int i = this.f105048b;
            if (i == this.f105047a) {
                return null;
            }
            this.f105048b = i + 1;
            return Integer.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: zg6$b */
    public static final class C16129b extends AbstractC16128a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final bq2<? super Integer> f105050d;

        public C16129b(bq2<? super Integer> actual, int index, int end) {
            super(index, end);
            this.f105050d = actual;
        }

        @Override // p000.zg6.AbstractC16128a
        /* JADX INFO: renamed from: a */
        public void mo26796a() {
            int i = this.f105047a;
            bq2<? super Integer> bq2Var = this.f105050d;
            for (int i2 = this.f105048b; i2 != i; i2++) {
                if (this.f105049c) {
                    return;
                }
                bq2Var.tryOnNext(Integer.valueOf(i2));
            }
            if (this.f105049c) {
                return;
            }
            bq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.f105048b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p000.zg6.AbstractC16128a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo26797b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f105047a
                int r1 = r9.f105048b
                bq2<? super java.lang.Integer> r2 = r9.f105050d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.f105049c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.tryOnNext(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.f105049c
                if (r10 != 0) goto L2d
                r2.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f105048b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zg6.C16129b.mo26797b(long):void");
        }
    }

    /* JADX INFO: renamed from: zg6$c */
    public static final class C16130c extends AbstractC16128a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super Integer> f105051d;

        public C16130c(ycg<? super Integer> actual, int index, int end) {
            super(index, end);
            this.f105051d = actual;
        }

        @Override // p000.zg6.AbstractC16128a
        /* JADX INFO: renamed from: a */
        public void mo26796a() {
            int i = this.f105047a;
            ycg<? super Integer> ycgVar = this.f105051d;
            for (int i2 = this.f105048b; i2 != i; i2++) {
                if (this.f105049c) {
                    return;
                }
                ycgVar.onNext(Integer.valueOf(i2));
            }
            if (this.f105049c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.f105048b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p000.zg6.AbstractC16128a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo26797b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f105047a
                int r1 = r9.f105048b
                ycg<? super java.lang.Integer> r2 = r9.f105051d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.f105049c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.f105049c
                if (r10 != 0) goto L2a
                r2.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f105048b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zg6.C16130c.mo26797b(long):void");
        }
    }

    public zg6(int start, int count) {
        this.f105045b = start;
        this.f105046c = start + count;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Integer> s) {
        if (s instanceof bq2) {
            s.onSubscribe(new C16129b((bq2) s, this.f105045b, this.f105046c));
        } else {
            s.onSubscribe(new C16130c(s, this.f105045b, this.f105046c));
        }
    }
}
