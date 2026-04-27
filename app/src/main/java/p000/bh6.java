package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bh6 extends l86<Long> {

    /* JADX INFO: renamed from: b */
    public final long f13736b;

    /* JADX INFO: renamed from: c */
    public final long f13737c;

    /* JADX INFO: renamed from: bh6$a */
    public static abstract class AbstractC1896a extends bw0<Long> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: a */
        public final long f13738a;

        /* JADX INFO: renamed from: b */
        public long f13739b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f13740c;

        public AbstractC1896a(long index, long end) {
            this.f13739b = index;
            this.f13738a = end;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo3167a();

        /* JADX INFO: renamed from: b */
        public abstract void mo3168b(long r);

        @Override // p000.fdg
        public final void cancel() {
            this.f13740c = true;
        }

        @Override // p000.zif
        public final void clear() {
            this.f13739b = this.f13738a;
        }

        @Override // p000.zif
        public final boolean isEmpty() {
            return this.f13739b == this.f13738a;
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n) && ro0.add(this, n) == 0) {
                if (n == Long.MAX_VALUE) {
                    mo3167a();
                } else {
                    mo3168b(n);
                }
            }
        }

        @Override // p000.vnd
        public final int requestFusion(int mode) {
            return mode & 1;
        }

        @Override // p000.zif
        @dib
        public final Long poll() {
            long j = this.f13739b;
            if (j == this.f13738a) {
                return null;
            }
            this.f13739b = 1 + j;
            return Long.valueOf(j);
        }
    }

    /* JADX INFO: renamed from: bh6$b */
    public static final class C1897b extends AbstractC1896a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final bq2<? super Long> f13741d;

        public C1897b(bq2<? super Long> actual, long index, long end) {
            super(index, end);
            this.f13741d = actual;
        }

        @Override // p000.bh6.AbstractC1896a
        /* JADX INFO: renamed from: a */
        public void mo3167a() {
            long j = this.f13738a;
            bq2<? super Long> bq2Var = this.f13741d;
            for (long j2 = this.f13739b; j2 != j; j2++) {
                if (this.f13740c) {
                    return;
                }
                bq2Var.tryOnNext(Long.valueOf(j2));
            }
            if (this.f13740c) {
                return;
            }
            bq2Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            r12.f13739b = r2;
            r13 = addAndGet(-r7);
         */
        @Override // p000.bh6.AbstractC1896a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo3168b(long r13) {
            /*
                r12 = this;
                long r0 = r12.f13738a
                long r2 = r12.f13739b
                bq2<? super java.lang.Long> r4 = r12.f13741d
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L25
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L25
                boolean r9 = r12.f13740c
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
                boolean r13 = r12.f13740c
                if (r13 != 0) goto L30
                r4.onComplete()
            L30:
                return
            L31:
                long r13 = r12.get()
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 != 0) goto L9
                r12.f13739b = r2
                long r13 = -r7
                long r13 = r12.addAndGet(r13)
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bh6.C1897b.mo3168b(long):void");
        }
    }

    /* JADX INFO: renamed from: bh6$c */
    public static final class C1898c extends AbstractC1896a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: d */
        public final ycg<? super Long> f13742d;

        public C1898c(ycg<? super Long> actual, long index, long end) {
            super(index, end);
            this.f13742d = actual;
        }

        @Override // p000.bh6.AbstractC1896a
        /* JADX INFO: renamed from: a */
        public void mo3167a() {
            long j = this.f13738a;
            ycg<? super Long> ycgVar = this.f13742d;
            for (long j2 = this.f13739b; j2 != j; j2++) {
                if (this.f13740c) {
                    return;
                }
                ycgVar.onNext(Long.valueOf(j2));
            }
            if (this.f13740c) {
                return;
            }
            ycgVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            r11.f13739b = r2;
            r12 = addAndGet(-r7);
         */
        @Override // p000.bh6.AbstractC1896a
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo3168b(long r12) {
            /*
                r11 = this;
                long r0 = r11.f13738a
                long r2 = r11.f13739b
                ycg<? super java.lang.Long> r4 = r11.f13742d
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 == 0) goto L22
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L22
                boolean r9 = r11.f13740c
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
                boolean r12 = r11.f13740c
                if (r12 != 0) goto L2d
                r4.onComplete()
            L2d:
                return
            L2e:
                long r12 = r11.get()
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 != 0) goto L9
                r11.f13739b = r2
                long r12 = -r7
                long r12 = r11.addAndGet(r12)
                int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bh6.C1898c.mo3168b(long):void");
        }
    }

    public bh6(long start, long count) {
        this.f13736b = start;
        this.f13737c = start + count;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Long> s) {
        if (s instanceof bq2) {
            s.onSubscribe(new C1897b((bq2) s, this.f13736b, this.f13737c));
        } else {
            s.onSubscribe(new C1898c(s, this.f13736b, this.f13737c));
        }
    }
}
