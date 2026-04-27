package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class rsb extends Observable<Long> {

    /* JADX INFO: renamed from: a */
    public final long f79198a;

    /* JADX INFO: renamed from: b */
    public final long f79199b;

    /* JADX INFO: renamed from: rsb$a */
    public static final class C12234a extends qv0<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Long> f79200a;

        /* JADX INFO: renamed from: b */
        public final long f79201b;

        /* JADX INFO: renamed from: c */
        public long f79202c;

        /* JADX INFO: renamed from: d */
        public boolean f79203d;

        public C12234a(oxb<? super Long> oxbVar, long j, long j2) {
            this.f79200a = oxbVar;
            this.f79202c = j;
            this.f79201b = j2;
        }

        @Override // p000.ajf
        public void clear() {
            this.f79202c = this.f79201b;
            lazySet(1);
        }

        @Override // p000.mf4
        public void dispose() {
            set(1);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f79202c == this.f79201b;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f79203d = true;
            return 1;
        }

        public void run() {
            if (this.f79203d) {
                return;
            }
            oxb<? super Long> oxbVar = this.f79200a;
            long j = this.f79201b;
            for (long j2 = this.f79202c; j2 != j && get() == 0; j2++) {
                oxbVar.onNext(Long.valueOf(j2));
            }
            if (get() == 0) {
                lazySet(1);
                oxbVar.onComplete();
            }
        }

        @Override // p000.ajf
        @cib
        public Long poll() throws Exception {
            long j = this.f79202c;
            if (j != this.f79201b) {
                this.f79202c = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    public rsb(long j, long j2) {
        this.f79198a = j;
        this.f79199b = j2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Long> oxbVar) {
        long j = this.f79198a;
        C12234a c12234a = new C12234a(oxbVar, j, j + this.f79199b);
        oxbVar.onSubscribe(c12234a);
        c12234a.run();
    }
}
