package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class gf6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f39668b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, Optional<? extends R>> f39669c;

    /* JADX INFO: renamed from: gf6$a */
    public static final class C6280a<T, R> extends jv0<T, R> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, Optional<? extends R>> f39670f;

        public C6280a(bq2<? super R> downstream, sy6<? super T, Optional<? extends R>> mapper) {
            super(downstream);
            this.f39670f = mapper;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f51989b.request(1L);
        }

        @Override // p000.zif
        public R poll() throws Throwable {
            while (true) {
                T tPoll = this.f51990c.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f39670f.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    return optional.get();
                }
                if (this.f51992e == 2) {
                    this.f51990c.request(1L);
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m14344d(mode);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f51991d) {
                return true;
            }
            if (this.f51992e != 0) {
                this.f51988a.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f39670f.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    return this.f51988a.tryOnNext(optional.get());
                }
                return false;
            } catch (Throwable th) {
                m14343c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: gf6$b */
    public static final class C6281b<T, R> extends nv0<T, R> implements bq2<T> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, Optional<? extends R>> f39671f;

        public C6281b(ycg<? super R> downstream, sy6<? super T, Optional<? extends R>> mapper) {
            super(downstream);
            this.f39671f = mapper;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f65772b.request(1L);
        }

        @Override // p000.zif
        public R poll() throws Throwable {
            while (true) {
                T tPoll = this.f65773c.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f39671f.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    return optional.get();
                }
                if (this.f65775e == 2) {
                    this.f65773c.request(1L);
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f65774d) {
                return true;
            }
            if (this.f65775e != 0) {
                this.f65771a.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f39671f.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (!optional.isPresent()) {
                    return false;
                }
                this.f65771a.onNext(optional.get());
                return true;
            } catch (Throwable th) {
                m18144c(th);
                return true;
            }
        }
    }

    public gf6(l86<T> source, sy6<? super T, Optional<? extends R>> mapper) {
        this.f39668b = source;
        this.f39669c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        if (s instanceof bq2) {
            this.f39668b.subscribe((kj6) new C6280a((bq2) s, this.f39669c));
        } else {
            this.f39668b.subscribe((kj6) new C6281b(s, this.f39669c));
        }
    }
}
