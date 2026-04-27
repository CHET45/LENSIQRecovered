package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class df6<T, U> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends U> f29561c;

    /* JADX INFO: renamed from: df6$a */
    public static final class C4777a<T, U> extends jv0<T, U> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, ? extends U> f29562f;

        public C4777a(bq2<? super U> actual, sy6<? super T, ? extends U> function) {
            super(actual);
            this.f29562f = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f51991d) {
                return;
            }
            if (this.f51992e != 0) {
                this.f51988a.onNext(null);
                return;
            }
            try {
                U uApply = this.f29562f.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f51988a.onNext((Object) uApply);
            } catch (Throwable th) {
                m14343c(th);
            }
        }

        @Override // p000.zif
        @dib
        public U poll() throws Throwable {
            T tPoll = this.f51990c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f29562f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m14344d(mode);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f51991d) {
                return true;
            }
            if (this.f51992e != 0) {
                this.f51988a.tryOnNext(null);
                return true;
            }
            try {
                U uApply = this.f29562f.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return this.f51988a.tryOnNext((Object) uApply);
            } catch (Throwable th) {
                m14343c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: df6$b */
    public static final class C4778b<T, U> extends nv0<T, U> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, ? extends U> f29563f;

        public C4778b(ycg<? super U> actual, sy6<? super T, ? extends U> mapper) {
            super(actual);
            this.f29563f = mapper;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f65774d) {
                return;
            }
            if (this.f65775e != 0) {
                this.f65771a.onNext(null);
                return;
            }
            try {
                U uApply = this.f29563f.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f65771a.onNext((Object) uApply);
            } catch (Throwable th) {
                m18144c(th);
            }
        }

        @Override // p000.zif
        @dib
        public U poll() throws Throwable {
            T tPoll = this.f65773c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f29563f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }
    }

    public df6(l86<T> source, sy6<? super T, ? extends U> mapper) {
        super(source);
        this.f29561c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C4777a((bq2) s, this.f29561c));
        } else {
            this.f49321b.subscribe((kj6) new C4778b(s, this.f29561c));
        }
    }
}
