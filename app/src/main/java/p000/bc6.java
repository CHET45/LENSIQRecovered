package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class bc6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f13301c;

    /* JADX INFO: renamed from: d */
    public final T f13302d;

    /* JADX INFO: renamed from: e */
    public final boolean f13303e;

    /* JADX INFO: renamed from: bc6$a */
    public static final class C1828a<T> extends j34<T> implements kj6<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* JADX INFO: renamed from: L */
        public final long f13304L;

        /* JADX INFO: renamed from: M */
        public final T f13305M;

        /* JADX INFO: renamed from: N */
        public final boolean f13306N;

        /* JADX INFO: renamed from: Q */
        public fdg f13307Q;

        /* JADX INFO: renamed from: X */
        public long f13308X;

        /* JADX INFO: renamed from: Y */
        public boolean f13309Y;

        public C1828a(ycg<? super T> actual, long index, T defaultValue, boolean errorOnFewer) {
            super(actual);
            this.f13304L = index;
            this.f13305M = defaultValue;
            this.f13306N = errorOnFewer;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f13307Q.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13309Y) {
                return;
            }
            this.f13309Y = true;
            T t = this.f13305M;
            if (t != null) {
                complete(t);
            } else if (this.f13306N) {
                this.f49483a.onError(new NoSuchElementException());
            } else {
                this.f49483a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f13309Y) {
                ofe.onError(t);
            } else {
                this.f13309Y = true;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13309Y) {
                return;
            }
            long j = this.f13308X;
            if (j != this.f13304L) {
                this.f13308X = j + 1;
                return;
            }
            this.f13309Y = true;
            this.f13307Q.cancel();
            complete(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13307Q, s)) {
                this.f13307Q = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public bc6(l86<T> source, long index, T defaultValue, boolean errorOnFewer) {
        super(source);
        this.f13301c = index;
        this.f13302d = defaultValue;
        this.f13303e = errorOnFewer;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C1828a(s, this.f13301c, this.f13302d, this.f13303e));
    }
}
