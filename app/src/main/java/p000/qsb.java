package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qsb extends vkb<Integer> {

    /* JADX INFO: renamed from: a */
    public final int f75492a;

    /* JADX INFO: renamed from: b */
    public final long f75493b;

    /* JADX INFO: renamed from: qsb$a */
    public static final class C11669a extends pv0<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Integer> f75494a;

        /* JADX INFO: renamed from: b */
        public final long f75495b;

        /* JADX INFO: renamed from: c */
        public long f75496c;

        /* JADX INFO: renamed from: d */
        public boolean f75497d;

        public C11669a(pxb<? super Integer> actual, long start, long end) {
            this.f75494a = actual;
            this.f75496c = start;
            this.f75495b = end;
        }

        @Override // p000.zif
        public void clear() {
            this.f75496c = this.f75495b;
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
            return this.f75496c == this.f75495b;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            this.f75497d = true;
            return 1;
        }

        public void run() {
            if (this.f75497d) {
                return;
            }
            pxb<? super Integer> pxbVar = this.f75494a;
            long j = this.f75495b;
            for (long j2 = this.f75496c; j2 != j && get() == 0; j2++) {
                pxbVar.onNext(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                pxbVar.onComplete();
            }
        }

        @Override // p000.zif
        @dib
        public Integer poll() {
            long j = this.f75496c;
            if (j != this.f75495b) {
                this.f75496c = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public qsb(int start, int count) {
        this.f75492a = start;
        this.f75493b = ((long) start) + ((long) count);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Integer> o) {
        C11669a c11669a = new C11669a(o, this.f75492a, this.f75493b);
        o.onSubscribe(c11669a);
        c11669a.run();
    }
}
