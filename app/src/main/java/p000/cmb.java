package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes7.dex */
public final class cmb<T, A, R> extends kjf<R> implements y07<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f16952a;

    /* JADX INFO: renamed from: b */
    public final Collector<? super T, A, R> f16953b;

    /* JADX INFO: renamed from: cmb$a */
    public static final class C2388a<T, A, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f16954a;

        /* JADX INFO: renamed from: b */
        public final BiConsumer<A, T> f16955b;

        /* JADX INFO: renamed from: c */
        public final Function<A, R> f16956c;

        /* JADX INFO: renamed from: d */
        public lf4 f16957d;

        /* JADX INFO: renamed from: e */
        public boolean f16958e;

        /* JADX INFO: renamed from: f */
        public A f16959f;

        public C2388a(hnf<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.f16954a = downstream;
            this.f16959f = container;
            this.f16955b = accumulator;
            this.f16956c = finisher;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f16957d.dispose();
            this.f16957d = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f16957d == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f16958e) {
                return;
            }
            this.f16958e = true;
            this.f16957d = zf4.DISPOSED;
            A a = this.f16959f;
            this.f16959f = null;
            try {
                R rApply = this.f16956c.apply(a);
                Objects.requireNonNull(rApply, "The finisher returned a null value");
                this.f16954a.onSuccess(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f16954a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f16958e) {
                ofe.onError(t);
                return;
            }
            this.f16958e = true;
            this.f16957d = zf4.DISPOSED;
            this.f16959f = null;
            this.f16954a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f16958e) {
                return;
            }
            try {
                this.f16955b.accept(this.f16959f, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f16957d.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f16957d, d)) {
                this.f16957d = d;
                this.f16954a.onSubscribe(this);
            }
        }
    }

    public cmb(vkb<T> source, Collector<? super T, A, R> collector) {
        this.f16952a = source;
        this.f16953b = collector;
    }

    @Override // p000.y07
    public vkb<R> fuseToObservable() {
        return new bmb(this.f16952a, this.f16953b);
    }

    @Override // p000.kjf
    public void subscribeActual(@cfb hnf<? super R> observer) {
        try {
            this.f16952a.subscribe(new C2388a(observer, this.f16953b.supplier().get(), this.f16953b.accumulator(), this.f16953b.finisher()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
