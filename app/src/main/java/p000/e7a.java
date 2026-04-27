package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e7a<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f32045a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f32046b;

    /* JADX INFO: renamed from: e7a$a */
    public static final class C5158a<T> extends AtomicReference<lf4> implements k9a<T>, ch2, lf4 {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: a */
        public final ch2 f32047a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends ph2> f32048b;

        public C5158a(ch2 actual, sy6<? super T, ? extends ph2> mapper) {
            this.f32047a = actual;
            this.f32048b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f32047a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f32047a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                ph2 ph2VarApply = this.f32048b.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                if (isDisposed()) {
                    return;
                }
                ph2Var.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public e7a(z9a<T> source, sy6<? super T, ? extends ph2> mapper) {
        this.f32045a = source;
        this.f32046b = mapper;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C5158a c5158a = new C5158a(observer, this.f32046b);
        observer.onSubscribe(c5158a);
        this.f32045a.subscribe(c5158a);
    }
}
