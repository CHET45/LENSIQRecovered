package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class b9a<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final r4a<T> f13068a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, Optional<? extends R>> f13069b;

    /* JADX INFO: renamed from: b9a$a */
    public static final class C1790a<T, R> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f13070a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f13071b;

        /* JADX INFO: renamed from: c */
        public lf4 f13072c;

        public C1790a(k9a<? super R> downstream, sy6<? super T, Optional<? extends R>> mapper) {
            this.f13070a = downstream;
            this.f13071b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f13072c;
            this.f13072c = zf4.DISPOSED;
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f13072c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f13070a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f13070a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f13072c, d)) {
                this.f13072c = d;
                this.f13070a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            try {
                Optional<? extends R> optionalApply = this.f13071b.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null item");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    this.f13070a.onSuccess(optional.get());
                } else {
                    this.f13070a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f13070a.onError(th);
            }
        }
    }

    public b9a(r4a<T> source, sy6<? super T, Optional<? extends R>> mapper) {
        this.f13068a = source;
        this.f13069b = mapper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f13068a.subscribe(new C1790a(observer, this.f13069b));
    }
}
