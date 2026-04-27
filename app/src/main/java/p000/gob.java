package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class gob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f40656b;

    /* JADX INFO: renamed from: c */
    public final T f40657c;

    /* JADX INFO: renamed from: d */
    public final boolean f40658d;

    /* JADX INFO: renamed from: gob$a */
    public static final class C6447a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f40659a;

        /* JADX INFO: renamed from: b */
        public final long f40660b;

        /* JADX INFO: renamed from: c */
        public final T f40661c;

        /* JADX INFO: renamed from: d */
        public final boolean f40662d;

        /* JADX INFO: renamed from: e */
        public lf4 f40663e;

        /* JADX INFO: renamed from: f */
        public long f40664f;

        /* JADX INFO: renamed from: m */
        public boolean f40665m;

        public C6447a(pxb<? super T> actual, long index, T defaultValue, boolean errorOnFewer) {
            this.f40659a = actual;
            this.f40660b = index;
            this.f40661c = defaultValue;
            this.f40662d = errorOnFewer;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f40663e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f40663e.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f40665m) {
                return;
            }
            this.f40665m = true;
            T t = this.f40661c;
            if (t == null && this.f40662d) {
                this.f40659a.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.f40659a.onNext(t);
            }
            this.f40659a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f40665m) {
                ofe.onError(t);
            } else {
                this.f40665m = true;
                this.f40659a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f40665m) {
                return;
            }
            long j = this.f40664f;
            if (j != this.f40660b) {
                this.f40664f = j + 1;
                return;
            }
            this.f40665m = true;
            this.f40663e.dispose();
            this.f40659a.onNext(t);
            this.f40659a.onComplete();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f40663e, d)) {
                this.f40663e = d;
                this.f40659a.onSubscribe(this);
            }
        }
    }

    public gob(wub<T> source, long index, T defaultValue, boolean errorOnFewer) {
        super(source);
        this.f40656b = index;
        this.f40657c = defaultValue;
        this.f40658d = errorOnFewer;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C6447a(t, this.f40656b, this.f40657c, this.f40658d));
    }
}
