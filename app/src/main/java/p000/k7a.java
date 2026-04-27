package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class k7a<T, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f52731b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super Throwable, ? extends z9a<? extends R>> f52732c;

    /* JADX INFO: renamed from: d */
    public final nfg<? extends z9a<? extends R>> f52733d;

    /* JADX INFO: renamed from: k7a$a */
    public static final class C8223a<T, R> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f52734a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends z9a<? extends R>> f52735b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super Throwable, ? extends z9a<? extends R>> f52736c;

        /* JADX INFO: renamed from: d */
        public final nfg<? extends z9a<? extends R>> f52737d;

        /* JADX INFO: renamed from: e */
        public lf4 f52738e;

        /* JADX INFO: renamed from: k7a$a$a */
        public final class a implements k9a<R> {
            public a() {
            }

            @Override // p000.k9a
            public void onComplete() {
                C8223a.this.f52734a.onComplete();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                C8223a.this.f52734a.onError(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(C8223a.this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R value) {
                C8223a.this.f52734a.onSuccess(value);
            }
        }

        public C8223a(k9a<? super R> actual, sy6<? super T, ? extends z9a<? extends R>> onSuccessMapper, sy6<? super Throwable, ? extends z9a<? extends R>> onErrorMapper, nfg<? extends z9a<? extends R>> onCompleteSupplier) {
            this.f52734a = actual;
            this.f52735b = onSuccessMapper;
            this.f52736c = onErrorMapper;
            this.f52737d = onCompleteSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f52738e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            try {
                z9a<? extends R> z9aVar = this.f52737d.get();
                Objects.requireNonNull(z9aVar, "The onCompleteSupplier returned a null MaybeSource");
                z9a<? extends R> z9aVar2 = z9aVar;
                if (isDisposed()) {
                    return;
                }
                z9aVar2.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f52734a.onError(th);
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            try {
                z9a<? extends R> z9aVarApply = this.f52736c.apply(e);
                Objects.requireNonNull(z9aVarApply, "The onErrorMapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                if (isDisposed()) {
                    return;
                }
                z9aVar.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f52734a.onError(new qm2(e, th));
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f52738e, d)) {
                this.f52738e = d;
                this.f52734a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                z9a<? extends R> z9aVarApply = this.f52735b.apply(value);
                Objects.requireNonNull(z9aVarApply, "The onSuccessMapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                if (isDisposed()) {
                    return;
                }
                z9aVar.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f52734a.onError(th);
            }
        }
    }

    public k7a(z9a<T> source, sy6<? super T, ? extends z9a<? extends R>> onSuccessMapper, sy6<? super Throwable, ? extends z9a<? extends R>> onErrorMapper, nfg<? extends z9a<? extends R>> onCompleteSupplier) {
        super(source);
        this.f52731b = onSuccessMapper;
        this.f52732c = onErrorMapper;
        this.f52733d = onCompleteSupplier;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f100099a.subscribe(new C8223a(observer, this.f52731b, this.f52732c, this.f52733d));
    }
}
