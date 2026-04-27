package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class t7a<T, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f83949b;

    /* JADX INFO: renamed from: t7a$a */
    public static final class C12943a<T, R> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f83950a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends z9a<? extends R>> f83951b;

        /* JADX INFO: renamed from: c */
        public lf4 f83952c;

        /* JADX INFO: renamed from: t7a$a$a */
        public final class a implements k9a<R> {
            public a() {
            }

            @Override // p000.k9a
            public void onComplete() {
                C12943a.this.f83950a.onComplete();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                C12943a.this.f83950a.onError(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(C12943a.this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R value) {
                C12943a.this.f83950a.onSuccess(value);
            }
        }

        public C12943a(k9a<? super R> actual, sy6<? super T, ? extends z9a<? extends R>> mapper) {
            this.f83950a = actual;
            this.f83951b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f83952c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f83950a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f83950a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f83952c, d)) {
                this.f83952c = d;
                this.f83950a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                z9a<? extends R> z9aVarApply = this.f83951b.apply(value);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                if (isDisposed()) {
                    return;
                }
                z9aVar.subscribe(new a());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f83950a.onError(th);
            }
        }
    }

    public t7a(z9a<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper) {
        super(source);
        this.f83949b = mapper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f100099a.subscribe(new C12943a(observer, this.f83949b));
    }
}
