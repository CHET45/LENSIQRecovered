package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ah6 extends m86<Long> {

    /* JADX INFO: renamed from: b */
    public final long f1612b;

    /* JADX INFO: renamed from: c */
    public final long f1613c;

    /* JADX INFO: renamed from: ah6$a */
    public static abstract class AbstractC0248a extends cw0<Long> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final long f1614a;

        /* JADX INFO: renamed from: b */
        public long f1615b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f1616c;

        public AbstractC0248a(long j, long j2) {
            this.f1615b = j;
            this.f1614a = j2;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo580a();

        /* JADX INFO: renamed from: b */
        public abstract void mo581b(long j);

        @Override // p000.fdg
        public final void cancel() {
            this.f1616c = true;
        }

        @Override // p000.ajf
        public final void clear() {
            this.f1615b = this.f1614a;
        }

        @Override // p000.ajf
        public final boolean isEmpty() {
            return this.f1615b == this.f1614a;
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j) && so0.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo580a();
                } else {
                    mo581b(j);
                }
            }
        }

        @Override // p000.wnd
        public final int requestFusion(int i) {
            return i & 1;
        }

        @Override // p000.ajf
        @cib
        public final Long poll() {
            long j = this.f1615b;
            if (j == this.f1614a) {
                return null;
            }
            this.f1615b = 1 + j;
            return Long.valueOf(j);
        }
    }

    /* JADX INFO: renamed from: ah6$b */
    public static final class C0249b extends AbstractC0248a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final cq2<? super Long> f1617d;

        public C0249b(cq2<? super Long> cq2Var, long j, long j2) {
            super(j, j2);
            this.f1617d = cq2Var;
        }

        @Override // p000.ah6.AbstractC0248a
        /* JADX INFO: renamed from: a */
        public void mo580a() {
            long j = this.f1614a;
            cq2<? super Long> cq2Var = this.f1617d;
            for (long j2 = this.f1615b; j2 != j; j2++) {
                if (this.f1616c) {
                    return;
                }
                cq2Var.tryOnNext(Long.valueOf(j2));
            }
            if (this.f1616c) {
                return;
            }
            cq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            r12.f1615b = r2;
            r13 = addAndGet(-r7);
         */
        @Override // p000.ah6.AbstractC0248a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo581b(long r13) {
            /*
                r12 = this;
                long r0 = r12.f1614a
                long r2 = r12.f1615b
                cq2<? super java.lang.Long> r4 = r12.f1617d
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L25
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L25
                boolean r9 = r12.f1616c
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                boolean r9 = r4.tryOnNext(r9)
                r10 = 1
                if (r9 == 0) goto L23
                long r7 = r7 + r10
            L23:
                long r2 = r2 + r10
                goto L9
            L25:
                int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r13 != 0) goto L31
                boolean r13 = r12.f1616c
                if (r13 != 0) goto L30
                r4.onComplete()
            L30:
                return
            L31:
                long r13 = r12.get()
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 != 0) goto L9
                r12.f1615b = r2
                long r13 = -r7
                long r13 = r12.addAndGet(r13)
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ah6.C0249b.mo581b(long):void");
        }
    }

    /* JADX INFO: renamed from: ah6$c */
    public static final class C0250c extends AbstractC0248a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super Long> f1618d;

        public C0250c(ycg<? super Long> ycgVar, long j, long j2) {
            super(j, j2);
            this.f1618d = ycgVar;
        }

        @Override // p000.ah6.AbstractC0248a
        /* JADX INFO: renamed from: a */
        public void mo580a() {
            long j = this.f1614a;
            ycg<? super Long> ycgVar = this.f1618d;
            for (long j2 = this.f1615b; j2 != j; j2++) {
                if (this.f1616c) {
                    return;
                }
                ycgVar.onNext(Long.valueOf(j2));
            }
            if (this.f1616c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            r11.f1615b = r2;
            r12 = addAndGet(-r7);
         */
        @Override // p000.ah6.AbstractC0248a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo581b(long r12) {
            /*
                r11 = this;
                long r0 = r11.f1614a
                long r2 = r11.f1615b
                ycg<? super java.lang.Long> r4 = r11.f1618d
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 == 0) goto L22
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L22
                boolean r9 = r11.f1616c
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                r4.onNext(r9)
                r9 = 1
                long r7 = r7 + r9
                long r2 = r2 + r9
                goto L9
            L22:
                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r12 != 0) goto L2e
                boolean r12 = r11.f1616c
                if (r12 != 0) goto L2d
                r4.onComplete()
            L2d:
                return
            L2e:
                long r12 = r11.get()
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 != 0) goto L9
                r11.f1615b = r2
                long r12 = -r7
                long r12 = r11.addAndGet(r12)
                int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ah6.C0250c.mo581b(long):void");
        }
    }

    public ah6(long j, long j2) {
        this.f1612b = j;
        this.f1613c = j + j2;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Long> ycgVar) {
        if (ycgVar instanceof cq2) {
            ycgVar.onSubscribe(new C0249b((cq2) ycgVar, this.f1612b, this.f1613c));
        } else {
            ycgVar.onSubscribe(new C0250c(ycgVar, this.f1612b, this.f1613c));
        }
    }
}
