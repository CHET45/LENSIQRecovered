package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes7.dex */
public final class r96<T, A, R> extends kjf<R> implements u07<R> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f77449a;

    /* JADX INFO: renamed from: b */
    public final Collector<? super T, A, R> f77450b;

    /* JADX INFO: renamed from: r96$a */
    public static final class C11946a<T, A, R> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f77451a;

        /* JADX INFO: renamed from: b */
        public final BiConsumer<A, T> f77452b;

        /* JADX INFO: renamed from: c */
        public final Function<A, R> f77453c;

        /* JADX INFO: renamed from: d */
        public fdg f77454d;

        /* JADX INFO: renamed from: e */
        public boolean f77455e;

        /* JADX INFO: renamed from: f */
        public A f77456f;

        public C11946a(hnf<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.f77451a = downstream;
            this.f77456f = container;
            this.f77452b = accumulator;
            this.f77453c = finisher;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f77454d.cancel();
            this.f77454d = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f77454d == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f77455e) {
                return;
            }
            this.f77455e = true;
            this.f77454d = ldg.CANCELLED;
            A a = this.f77456f;
            this.f77456f = null;
            try {
                R rApply = this.f77453c.apply(a);
                Objects.requireNonNull(rApply, "The finisher returned a null value");
                this.f77451a.onSuccess(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f77451a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f77455e) {
                ofe.onError(t);
                return;
            }
            this.f77455e = true;
            this.f77454d = ldg.CANCELLED;
            this.f77456f = null;
            this.f77451a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f77455e) {
                return;
            }
            try {
                this.f77452b.accept(this.f77456f, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f77454d.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(@cfb fdg s) {
            if (ldg.validate(this.f77454d, s)) {
                this.f77454d = s;
                this.f77451a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public r96(l86<T> source, Collector<? super T, A, R> collector) {
        this.f77449a = source;
        this.f77450b = collector;
    }

    @Override // p000.u07
    public l86<R> fuseToFlowable() {
        return new q96(this.f77449a, this.f77450b);
    }

    @Override // p000.kjf
    public void subscribeActual(@cfb hnf<? super R> observer) {
        try {
            this.f77449a.subscribe((kj6) new C11946a(observer, this.f77450b.supplier().get(), this.f77450b.accumulator(), this.f77450b.finisher()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
