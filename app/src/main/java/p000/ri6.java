package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ri6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final T f78381c;

    /* JADX INFO: renamed from: d */
    public final boolean f78382d;

    /* JADX INFO: renamed from: ri6$a */
    public static final class C12105a<T> extends j34<T> implements kj6<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* JADX INFO: renamed from: L */
        public final T f78383L;

        /* JADX INFO: renamed from: M */
        public final boolean f78384M;

        /* JADX INFO: renamed from: N */
        public fdg f78385N;

        /* JADX INFO: renamed from: Q */
        public boolean f78386Q;

        public C12105a(ycg<? super T> actual, T defaultValue, boolean failOnEmpty) {
            super(actual);
            this.f78383L = defaultValue;
            this.f78384M = failOnEmpty;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f78385N.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f78386Q) {
                return;
            }
            this.f78386Q = true;
            T t = this.f49484b;
            this.f49484b = null;
            if (t == null) {
                t = this.f78383L;
            }
            if (t != null) {
                complete(t);
            } else if (this.f78384M) {
                this.f49483a.onError(new NoSuchElementException());
            } else {
                this.f49483a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f78386Q) {
                ofe.onError(t);
            } else {
                this.f78386Q = true;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f78386Q) {
                return;
            }
            if (this.f49484b == null) {
                this.f49484b = t;
                return;
            }
            this.f78386Q = true;
            this.f78385N.cancel();
            this.f49483a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f78385N, s)) {
                this.f78385N = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public ri6(l86<T> source, T defaultValue, boolean failOnEmpty) {
        super(source);
        this.f78381c = defaultValue;
        this.f78382d = failOnEmpty;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C12105a(s, this.f78381c, this.f78382d));
    }
}
