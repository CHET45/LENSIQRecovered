package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class r9a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends T> f77457b;

    /* JADX INFO: renamed from: r9a$a */
    public static final class C11948a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f77458a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends T> f77459b;

        /* JADX INFO: renamed from: c */
        public lf4 f77460c;

        public C11948a(k9a<? super T> actual, sy6<? super Throwable, ? extends T> valueSupplier) {
            this.f77458a = actual;
            this.f77459b = valueSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f77460c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f77460c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f77458a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            try {
                T tApply = this.f77459b.apply(e);
                Objects.requireNonNull(tApply, "The itemSupplier returned a null value");
                this.f77458a.onSuccess(tApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f77458a.onError(new qm2(e, th));
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f77460c, d)) {
                this.f77460c = d;
                this.f77458a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f77458a.onSuccess(value);
        }
    }

    public r9a(z9a<T> source, sy6<? super Throwable, ? extends T> itemSupplier) {
        super(source);
        this.f77457b = itemSupplier;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C11948a(observer, this.f77457b));
    }
}
