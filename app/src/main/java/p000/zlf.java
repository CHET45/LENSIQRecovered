package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zlf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f105436a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends R>> f105437b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super Throwable, ? extends oof<? extends R>> f105438c;

    /* JADX INFO: renamed from: zlf$a */
    public static final class C16182a<T, R> extends AtomicReference<lf4> implements hnf<T>, lf4 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f105439a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends oof<? extends R>> f105440b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super Throwable, ? extends oof<? extends R>> f105441c;

        /* JADX INFO: renamed from: d */
        public lf4 f105442d;

        /* JADX INFO: renamed from: zlf$a$a */
        public final class a implements hnf<R> {
            public a() {
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                C16182a.this.f105439a.onError(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(C16182a.this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R value) {
                C16182a.this.f105439a.onSuccess(value);
            }
        }

        public C16182a(hnf<? super R> actual, sy6<? super T, ? extends oof<? extends R>> onSuccessMapper, sy6<? super Throwable, ? extends oof<? extends R>> onErrorMapper) {
            this.f105439a = actual;
            this.f105440b = onSuccessMapper;
            this.f105441c = onErrorMapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f105442d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            try {
                oof<? extends R> oofVarApply = this.f105441c.apply(e);
                Objects.requireNonNull(oofVarApply, "The onErrorMapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                if (isDisposed()) {
                    return;
                }
                oofVar.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f105439a.onError(new qm2(e, th));
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f105442d, d)) {
                this.f105442d = d;
                this.f105439a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                oof<? extends R> oofVarApply = this.f105440b.apply(value);
                Objects.requireNonNull(oofVarApply, "The onSuccessMapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                if (isDisposed()) {
                    return;
                }
                oofVar.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f105439a.onError(th);
            }
        }
    }

    public zlf(oof<T> source, sy6<? super T, ? extends oof<? extends R>> onSuccessMapper, sy6<? super Throwable, ? extends oof<? extends R>> onErrorMapper) {
        this.f105436a = source;
        this.f105437b = onSuccessMapper;
        this.f105438c = onErrorMapper;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        this.f105436a.subscribe(new C16182a(observer, this.f105437b, this.f105438c));
    }
}
