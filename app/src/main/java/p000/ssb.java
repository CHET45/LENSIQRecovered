package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ssb extends vkb<Long> {

    /* JADX INFO: renamed from: a */
    public final long f82750a;

    /* JADX INFO: renamed from: b */
    public final long f82751b;

    /* JADX INFO: renamed from: ssb$a */
    public static final class C12766a extends pv0<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Long> f82752a;

        /* JADX INFO: renamed from: b */
        public final long f82753b;

        /* JADX INFO: renamed from: c */
        public long f82754c;

        /* JADX INFO: renamed from: d */
        public boolean f82755d;

        public C12766a(pxb<? super Long> actual, long start, long end) {
            this.f82752a = actual;
            this.f82754c = start;
            this.f82753b = end;
        }

        @Override // p000.zif
        public void clear() {
            this.f82754c = this.f82753b;
            lazySet(1);
        }

        @Override // p000.lf4
        public void dispose() {
            set(1);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f82754c == this.f82753b;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            this.f82755d = true;
            return 1;
        }

        public void run() {
            if (this.f82755d) {
                return;
            }
            pxb<? super Long> pxbVar = this.f82752a;
            long j = this.f82753b;
            for (long j2 = this.f82754c; j2 != j && get() == 0; j2++) {
                pxbVar.onNext(Long.valueOf(j2));
            }
            if (get() == 0) {
                lazySet(1);
                pxbVar.onComplete();
            }
        }

        @Override // p000.zif
        @dib
        public Long poll() {
            long j = this.f82754c;
            if (j != this.f82753b) {
                this.f82754c = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    public ssb(long start, long count) {
        this.f82750a = start;
        this.f82751b = count;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Long> o) {
        long j = this.f82750a;
        C12766a c12766a = new C12766a(o, j, j + this.f82751b);
        o.onSubscribe(c12766a);
        c12766a.run();
    }
}
