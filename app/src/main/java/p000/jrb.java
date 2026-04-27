package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class jrb<T, R> extends AbstractC9666n3<T, wub<? extends R>> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends R>> f51607b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super Throwable, ? extends wub<? extends R>> f51608c;

    /* JADX INFO: renamed from: d */
    public final nfg<? extends wub<? extends R>> f51609d;

    /* JADX INFO: renamed from: jrb$a */
    public static final class C8041a<T, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super wub<? extends R>> f51610a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f51611b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super Throwable, ? extends wub<? extends R>> f51612c;

        /* JADX INFO: renamed from: d */
        public final nfg<? extends wub<? extends R>> f51613d;

        /* JADX INFO: renamed from: e */
        public lf4 f51614e;

        public C8041a(pxb<? super wub<? extends R>> actual, sy6<? super T, ? extends wub<? extends R>> onNextMapper, sy6<? super Throwable, ? extends wub<? extends R>> onErrorMapper, nfg<? extends wub<? extends R>> onCompleteSupplier) {
            this.f51610a = actual;
            this.f51611b = onNextMapper;
            this.f51612c = onErrorMapper;
            this.f51613d = onCompleteSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f51614e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f51614e.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            try {
                wub<? extends R> wubVar = this.f51613d.get();
                Objects.requireNonNull(wubVar, "The onComplete ObservableSource returned is null");
                this.f51610a.onNext(wubVar);
                this.f51610a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f51610a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            try {
                wub<? extends R> wubVarApply = this.f51612c.apply(t);
                Objects.requireNonNull(wubVarApply, "The onError ObservableSource returned is null");
                this.f51610a.onNext(wubVarApply);
                this.f51610a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f51610a.onError(new qm2(t, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            try {
                wub<? extends R> wubVarApply = this.f51611b.apply(t);
                Objects.requireNonNull(wubVarApply, "The onNext ObservableSource returned is null");
                this.f51610a.onNext(wubVarApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f51610a.onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f51614e, d)) {
                this.f51614e = d;
                this.f51610a.onSubscribe(this);
            }
        }
    }

    public jrb(wub<T> source, sy6<? super T, ? extends wub<? extends R>> onNextMapper, sy6<? super Throwable, ? extends wub<? extends R>> onErrorMapper, nfg<? extends wub<? extends R>> onCompleteSupplier) {
        super(source);
        this.f51607b = onNextMapper;
        this.f51608c = onErrorMapper;
        this.f51609d = onCompleteSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super wub<? extends R>> t) {
        this.f63101a.subscribe(new C8041a(t, this.f51607b, this.f51608c, this.f51609d));
    }
}
