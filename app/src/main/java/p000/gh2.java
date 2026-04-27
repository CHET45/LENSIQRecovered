package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class gh2<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final ph2 f39813a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends T> f39814b;

    /* JADX INFO: renamed from: gh2$a */
    public static final class C6312a<T> implements ch2, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f39815a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends T> f39816b;

        /* JADX INFO: renamed from: c */
        public lf4 f39817c;

        public C6312a(k9a<? super T> actual, sy6<? super Throwable, ? extends T> itemSupplier) {
            this.f39815a = actual;
            this.f39816b = itemSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f39817c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f39817c.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f39815a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            try {
                T tApply = this.f39816b.apply(e);
                Objects.requireNonNull(tApply, "The itemSupplier returned a null value");
                this.f39815a.onSuccess(tApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f39815a.onError(new qm2(e, th));
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f39817c, d)) {
                this.f39817c = d;
                this.f39815a.onSubscribe(this);
            }
        }
    }

    public gh2(ph2 source, sy6<? super Throwable, ? extends T> valueSupplier) {
        this.f39813a = source;
        this.f39814b = valueSupplier;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f39813a.subscribe(new C6312a(observer, this.f39814b));
    }
}
