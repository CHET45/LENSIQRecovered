package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes7.dex */
public final class q96<T, A, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f73684b;

    /* JADX INFO: renamed from: c */
    public final Collector<? super T, A, R> f73685c;

    /* JADX INFO: renamed from: q96$a */
    public static final class C11391a<T, A, R> extends j34<R> implements kj6<T> {
        private static final long serialVersionUID = -229544830565448758L;

        /* JADX INFO: renamed from: L */
        public final BiConsumer<A, T> f73686L;

        /* JADX INFO: renamed from: M */
        public final Function<A, R> f73687M;

        /* JADX INFO: renamed from: N */
        public fdg f73688N;

        /* JADX INFO: renamed from: Q */
        public boolean f73689Q;

        /* JADX INFO: renamed from: X */
        public A f73690X;

        public C11391a(ycg<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.f73690X = container;
            this.f73686L = accumulator;
            this.f73687M = finisher;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f73688N.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f73689Q) {
                return;
            }
            this.f73689Q = true;
            this.f73688N = ldg.CANCELLED;
            A a = this.f73690X;
            this.f73690X = null;
            try {
                R rApply = this.f73687M.apply(a);
                Objects.requireNonNull(rApply, "The finisher returned a null value");
                complete(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f49483a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f73689Q) {
                ofe.onError(t);
                return;
            }
            this.f73689Q = true;
            this.f73688N = ldg.CANCELLED;
            this.f73690X = null;
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f73689Q) {
                return;
            }
            try {
                this.f73686L.accept(this.f73690X, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f73688N.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(@cfb fdg s) {
            if (ldg.validate(this.f73688N, s)) {
                this.f73688N = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public q96(l86<T> source, Collector<? super T, A, R> collector) {
        this.f73684b = source;
        this.f73685c = collector;
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super R> s) {
        try {
            this.f73684b.subscribe((kj6) new C11391a(s, this.f73685c.supplier().get(), this.f73685c.accumulator(), this.f73685c.finisher()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
