package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class psb extends Observable<Integer> {

    /* JADX INFO: renamed from: a */
    public final int f71927a;

    /* JADX INFO: renamed from: b */
    public final long f71928b;

    /* JADX INFO: renamed from: psb$a */
    public static final class C11107a extends qv0<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Integer> f71929a;

        /* JADX INFO: renamed from: b */
        public final long f71930b;

        /* JADX INFO: renamed from: c */
        public long f71931c;

        /* JADX INFO: renamed from: d */
        public boolean f71932d;

        public C11107a(oxb<? super Integer> oxbVar, long j, long j2) {
            this.f71929a = oxbVar;
            this.f71931c = j;
            this.f71930b = j2;
        }

        @Override // p000.ajf
        public void clear() {
            this.f71931c = this.f71930b;
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
            return this.f71931c == this.f71930b;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f71932d = true;
            return 1;
        }

        public void run() {
            if (this.f71932d) {
                return;
            }
            oxb<? super Integer> oxbVar = this.f71929a;
            long j = this.f71930b;
            for (long j2 = this.f71931c; j2 != j && get() == 0; j2++) {
                oxbVar.onNext(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                oxbVar.onComplete();
            }
        }

        @Override // p000.ajf
        @cib
        public Integer poll() throws Exception {
            long j = this.f71931c;
            if (j != this.f71930b) {
                this.f71931c = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public psb(int i, int i2) {
        this.f71927a = i;
        this.f71928b = ((long) i) + ((long) i2);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Integer> oxbVar) {
        C11107a c11107a = new C11107a(oxbVar, this.f71927a, this.f71928b);
        oxbVar.onSubscribe(c11107a);
        c11107a.run();
    }
}
