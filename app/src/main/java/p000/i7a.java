package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class i7a<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f45916a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Iterable<? extends R>> f45917b;

    /* JADX INFO: renamed from: i7a$a */
    public static final class C7176a<T, R> extends zv0<R> implements k9a<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f45918a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f45919b;

        /* JADX INFO: renamed from: c */
        public lf4 f45920c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator<? extends R> f45921d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f45922e;

        /* JADX INFO: renamed from: f */
        public boolean f45923f;

        public C7176a(pxb<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f45918a = actual;
            this.f45919b = mapper;
        }

        @Override // p000.zif
        public void clear() {
            this.f45921d = null;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f45922e = true;
            this.f45920c.dispose();
            this.f45920c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f45922e;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f45921d == null;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f45918a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f45920c = zf4.DISPOSED;
            this.f45918a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f45920c, d)) {
                this.f45920c = d;
                this.f45918a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            pxb<? super R> pxbVar = this.f45918a;
            try {
                Iterator<? extends R> it = this.f45919b.apply(t).iterator();
                if (!it.hasNext()) {
                    pxbVar.onComplete();
                    return;
                }
                this.f45921d = it;
                if (this.f45923f) {
                    pxbVar.onNext(null);
                    pxbVar.onComplete();
                    return;
                }
                while (!this.f45922e) {
                    try {
                        pxbVar.onNext(it.next());
                        if (this.f45922e) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                pxbVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            pxbVar.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        pxbVar.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                pxbVar.onError(th3);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() {
            Iterator<? extends R> it = this.f45921d;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f45921d = null;
            }
            return next;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f45923f = true;
            return 2;
        }
    }

    public i7a(z9a<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
        this.f45916a = source;
        this.f45917b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f45916a.subscribe(new C7176a(observer, this.f45917b));
    }
}
