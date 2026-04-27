package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yg6 extends m86<Integer> {

    /* JADX INFO: renamed from: b */
    public final int f101431b;

    /* JADX INFO: renamed from: c */
    public final int f101432c;

    /* JADX INFO: renamed from: yg6$a */
    public static abstract class AbstractC15653a extends cw0<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final int f101433a;

        /* JADX INFO: renamed from: b */
        public int f101434b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f101435c;

        public AbstractC15653a(int i, int i2) {
            this.f101434b = i;
            this.f101433a = i2;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo25896a();

        /* JADX INFO: renamed from: b */
        public abstract void mo25897b(long j);

        @Override // p000.fdg
        public final void cancel() {
            this.f101435c = true;
        }

        @Override // p000.ajf
        public final void clear() {
            this.f101434b = this.f101433a;
        }

        @Override // p000.ajf
        public final boolean isEmpty() {
            return this.f101434b == this.f101433a;
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j) && so0.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo25896a();
                } else {
                    mo25897b(j);
                }
            }
        }

        @Override // p000.wnd
        public final int requestFusion(int i) {
            return i & 1;
        }

        @Override // p000.ajf
        @cib
        public final Integer poll() {
            int i = this.f101434b;
            if (i == this.f101433a) {
                return null;
            }
            this.f101434b = i + 1;
            return Integer.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: yg6$b */
    public static final class C15654b extends AbstractC15653a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final cq2<? super Integer> f101436d;

        public C15654b(cq2<? super Integer> cq2Var, int i, int i2) {
            super(i, i2);
            this.f101436d = cq2Var;
        }

        @Override // p000.yg6.AbstractC15653a
        /* JADX INFO: renamed from: a */
        public void mo25896a() {
            int i = this.f101433a;
            cq2<? super Integer> cq2Var = this.f101436d;
            for (int i2 = this.f101434b; i2 != i; i2++) {
                if (this.f101435c) {
                    return;
                }
                cq2Var.tryOnNext(Integer.valueOf(i2));
            }
            if (this.f101435c) {
                return;
            }
            cq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.f101434b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p000.yg6.AbstractC15653a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo25897b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f101433a
                int r1 = r9.f101434b
                cq2<? super java.lang.Integer> r2 = r9.f101436d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.f101435c
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
                boolean r10 = r9.f101435c
                if (r10 != 0) goto L2d
                r2.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f101434b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.yg6.C15654b.mo25897b(long):void");
        }
    }

    /* JADX INFO: renamed from: yg6$c */
    public static final class C15655c extends AbstractC15653a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super Integer> f101437d;

        public C15655c(ycg<? super Integer> ycgVar, int i, int i2) {
            super(i, i2);
            this.f101437d = ycgVar;
        }

        @Override // p000.yg6.AbstractC15653a
        /* JADX INFO: renamed from: a */
        public void mo25896a() {
            int i = this.f101433a;
            ycg<? super Integer> ycgVar = this.f101437d;
            for (int i2 = this.f101434b; i2 != i; i2++) {
                if (this.f101435c) {
                    return;
                }
                ycgVar.onNext(Integer.valueOf(i2));
            }
            if (this.f101435c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.f101434b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p000.yg6.AbstractC15653a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo25897b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f101433a
                int r1 = r9.f101434b
                ycg<? super java.lang.Integer> r2 = r9.f101437d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.f101435c
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
                boolean r10 = r9.f101435c
                if (r10 != 0) goto L2a
                r2.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f101434b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.yg6.C15655c.mo25897b(long):void");
        }
    }

    public yg6(int i, int i2) {
        this.f101431b = i;
        this.f101432c = i + i2;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Integer> ycgVar) {
        if (ycgVar instanceof cq2) {
            ycgVar.onSubscribe(new C15654b((cq2) ycgVar, this.f101431b, this.f101432c));
        } else {
            ycgVar.onSubscribe(new C15655c(ycgVar, this.f101431b, this.f101432c));
        }
    }
}
