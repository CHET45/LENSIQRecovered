package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes7.dex */
public final class bmb<T, A, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f14142a;

    /* JADX INFO: renamed from: b */
    public final Collector<? super T, A, R> f14143b;

    /* JADX INFO: renamed from: bmb$a */
    public static final class C1948a<T, A, R> extends d34<R> implements pxb<T> {
        private static final long serialVersionUID = -229544830565448758L;

        /* JADX INFO: renamed from: C */
        public final BiConsumer<A, T> f14144C;

        /* JADX INFO: renamed from: F */
        public final Function<A, R> f14145F;

        /* JADX INFO: renamed from: H */
        public lf4 f14146H;

        /* JADX INFO: renamed from: L */
        public boolean f14147L;

        /* JADX INFO: renamed from: M */
        public A f14148M;

        public C1948a(pxb<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(downstream);
            this.f14148M = container;
            this.f14144C = accumulator;
            this.f14145F = finisher;
        }

        @Override // p000.d34, p000.lf4
        public void dispose() {
            super.dispose();
            this.f14146H.dispose();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f14147L) {
                return;
            }
            this.f14147L = true;
            this.f14146H = zf4.DISPOSED;
            A a = this.f14148M;
            this.f14148M = null;
            try {
                R rApply = this.f14145F.apply(a);
                Objects.requireNonNull(rApply, "The finisher returned a null value");
                complete(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f28317a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f14147L) {
                ofe.onError(t);
                return;
            }
            this.f14147L = true;
            this.f14146H = zf4.DISPOSED;
            this.f14148M = null;
            this.f28317a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f14147L) {
                return;
            }
            try {
                this.f14144C.accept(this.f14148M, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f14146H.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f14146H, d)) {
                this.f14146H = d;
                this.f28317a.onSubscribe(this);
            }
        }
    }

    public bmb(vkb<T> source, Collector<? super T, A, R> collector) {
        this.f14142a = source;
        this.f14143b = collector;
    }

    @Override // p000.vkb
    public void subscribeActual(@cfb pxb<? super R> observer) {
        try {
            this.f14142a.subscribe(new C1948a(observer, this.f14143b.supplier().get(), this.f14143b.accumulator(), this.f14143b.finisher()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
