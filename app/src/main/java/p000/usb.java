package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class usb<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f89036a;

    /* JADX INFO: renamed from: b */
    public final i11<T, T, T> f89037b;

    /* JADX INFO: renamed from: usb$a */
    public static final class C13693a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f89038a;

        /* JADX INFO: renamed from: b */
        public final i11<T, T, T> f89039b;

        /* JADX INFO: renamed from: c */
        public boolean f89040c;

        /* JADX INFO: renamed from: d */
        public T f89041d;

        /* JADX INFO: renamed from: e */
        public lf4 f89042e;

        public C13693a(k9a<? super T> observer, i11<T, T, T> reducer) {
            this.f89038a = observer;
            this.f89039b = reducer;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f89042e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f89042e.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f89040c) {
                return;
            }
            this.f89040c = true;
            T t = this.f89041d;
            this.f89041d = null;
            if (t != null) {
                this.f89038a.onSuccess(t);
            } else {
                this.f89038a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f89040c) {
                ofe.onError(e);
                return;
            }
            this.f89040c = true;
            this.f89041d = null;
            this.f89038a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T value) {
            if (this.f89040c) {
                return;
            }
            T t = this.f89041d;
            if (t == null) {
                this.f89041d = value;
                return;
            }
            try {
                T tApply = this.f89039b.apply(t, value);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f89041d = tApply;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f89042e.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f89042e, d)) {
                this.f89042e = d;
                this.f89038a.onSubscribe(this);
            }
        }
    }

    public usb(wub<T> source, i11<T, T, T> reducer) {
        this.f89036a = source;
        this.f89037b = reducer;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f89036a.subscribe(new C13693a(observer, this.f89037b));
    }
}
