package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class a9a<T, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends R> f726b;

    /* JADX INFO: renamed from: a9a$a */
    public static final class C0106a<T, R> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f727a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f728b;

        /* JADX INFO: renamed from: c */
        public lf4 f729c;

        public C0106a(k9a<? super R> actual, sy6<? super T, ? extends R> mapper) {
            this.f727a = actual;
            this.f728b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f729c;
            this.f729c = zf4.DISPOSED;
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f729c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f727a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f727a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f729c, d)) {
                this.f729c = d;
                this.f727a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                R rApply = this.f728b.apply(value);
                Objects.requireNonNull(rApply, "The mapper returned a null item");
                this.f727a.onSuccess(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f727a.onError(th);
            }
        }
    }

    public a9a(z9a<T> source, sy6<? super T, ? extends R> mapper) {
        super(source);
        this.f726b = mapper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f100099a.subscribe(new C0106a(observer, this.f726b));
    }
}
