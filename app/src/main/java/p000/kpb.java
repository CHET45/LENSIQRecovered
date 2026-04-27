package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class kpb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final T[] f54892a;

    /* JADX INFO: renamed from: kpb$a */
    public static final class C8482a<T> extends zv0<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f54893a;

        /* JADX INFO: renamed from: b */
        public final T[] f54894b;

        /* JADX INFO: renamed from: c */
        public int f54895c;

        /* JADX INFO: renamed from: d */
        public boolean f54896d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f54897e;

        public C8482a(pxb<? super T> actual, T[] array) {
            this.f54893a = actual;
            this.f54894b = array;
        }

        /* JADX INFO: renamed from: a */
        public void m14889a() {
            T[] tArr = this.f54894b;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.f54893a.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f54893a.onNext(t);
            }
            if (isDisposed()) {
                return;
            }
            this.f54893a.onComplete();
        }

        @Override // p000.zif
        public void clear() {
            this.f54895c = this.f54894b.length;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f54897e = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54897e;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f54895c == this.f54894b.length;
        }

        @Override // p000.zif
        @dib
        public T poll() {
            int i = this.f54895c;
            T[] tArr = this.f54894b;
            if (i == tArr.length) {
                return null;
            }
            this.f54895c = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "The array element is null");
            return t;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            this.f54896d = true;
            return 1;
        }
    }

    public kpb(T[] array) {
        this.f54892a = array;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C8482a c8482a = new C8482a(observer, this.f54892a);
        observer.onSubscribe(c8482a);
        if (c8482a.f54896d) {
            return;
        }
        c8482a.m14889a();
    }
}
