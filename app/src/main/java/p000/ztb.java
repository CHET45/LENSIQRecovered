package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ztb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final i11<R, ? super T, R> f106069b;

    /* JADX INFO: renamed from: c */
    public final nfg<R> f106070c;

    /* JADX INFO: renamed from: ztb$a */
    public static final class C16251a<T, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f106071a;

        /* JADX INFO: renamed from: b */
        public final i11<R, ? super T, R> f106072b;

        /* JADX INFO: renamed from: c */
        public R f106073c;

        /* JADX INFO: renamed from: d */
        public lf4 f106074d;

        /* JADX INFO: renamed from: e */
        public boolean f106075e;

        public C16251a(pxb<? super R> actual, i11<R, ? super T, R> accumulator, R value) {
            this.f106071a = actual;
            this.f106072b = accumulator;
            this.f106073c = value;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f106074d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f106074d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f106075e) {
                return;
            }
            this.f106075e = true;
            this.f106071a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f106075e) {
                ofe.onError(t);
            } else {
                this.f106075e = true;
                this.f106071a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f106075e) {
                return;
            }
            try {
                R rApply = this.f106072b.apply(this.f106073c, t);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f106073c = rApply;
                this.f106071a.onNext(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f106074d.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 lf4Var) {
            if (zf4.validate(this.f106074d, lf4Var)) {
                this.f106074d = lf4Var;
                this.f106071a.onSubscribe(this);
                this.f106071a.onNext(this.f106073c);
            }
        }
    }

    public ztb(wub<T> source, nfg<R> seedSupplier, i11<R, ? super T, R> accumulator) {
        super(source);
        this.f106069b = accumulator;
        this.f106070c = seedSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> t) {
        try {
            R r = this.f106070c.get();
            Objects.requireNonNull(r, "The seed supplied is null");
            this.f63101a.subscribe(new C16251a(t, this.f106069b, r));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, t);
        }
    }
}
