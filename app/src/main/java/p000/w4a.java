package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class w4a<T> extends s4a<T> implements l9a<T> {

    /* JADX INFO: renamed from: e */
    public static final C14380a[] f93234e = new C14380a[0];

    /* JADX INFO: renamed from: f */
    public static final C14380a[] f93235f = new C14380a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<aaa<T>> f93236a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C14380a<T>[]> f93237b = new AtomicReference<>(f93234e);

    /* JADX INFO: renamed from: c */
    public T f93238c;

    /* JADX INFO: renamed from: d */
    public Throwable f93239d;

    /* JADX INFO: renamed from: w4a$a */
    public static final class C14380a<T> extends AtomicReference<w4a<T>> implements mf4 {
        private static final long serialVersionUID = -5791853038359966195L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f93240a;

        public C14380a(l9a<? super T> l9aVar, w4a<T> w4aVar) {
            super(w4aVar);
            this.f93240a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            w4a<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m24327b(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public w4a(aaa<T> aaaVar) {
        this.f93236a = new AtomicReference<>(aaaVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m24326a(C14380a<T> c14380a) {
        C14380a<T>[] c14380aArr;
        C14380a[] c14380aArr2;
        do {
            c14380aArr = this.f93237b.get();
            if (c14380aArr == f93235f) {
                return false;
            }
            int length = c14380aArr.length;
            c14380aArr2 = new C14380a[length + 1];
            System.arraycopy(c14380aArr, 0, c14380aArr2, 0, length);
            c14380aArr2[length] = c14380a;
        } while (!v7b.m23844a(this.f93237b, c14380aArr, c14380aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m24327b(C14380a<T> c14380a) {
        C14380a<T>[] c14380aArr;
        C14380a[] c14380aArr2;
        do {
            c14380aArr = this.f93237b.get();
            int length = c14380aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14380aArr[i] == c14380a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14380aArr2 = f93234e;
            } else {
                C14380a[] c14380aArr3 = new C14380a[length - 1];
                System.arraycopy(c14380aArr, 0, c14380aArr3, 0, i);
                System.arraycopy(c14380aArr, i + 1, c14380aArr3, i, (length - i) - 1);
                c14380aArr2 = c14380aArr3;
            }
        } while (!v7b.m23844a(this.f93237b, c14380aArr, c14380aArr2));
    }

    @Override // p000.l9a
    public void onComplete() {
        for (C14380a<T> c14380a : this.f93237b.getAndSet(f93235f)) {
            if (!c14380a.isDisposed()) {
                c14380a.f93240a.onComplete();
            }
        }
    }

    @Override // p000.l9a
    public void onError(Throwable th) {
        this.f93239d = th;
        for (C14380a<T> c14380a : this.f93237b.getAndSet(f93235f)) {
            if (!c14380a.isDisposed()) {
                c14380a.f93240a.onError(th);
            }
        }
    }

    @Override // p000.l9a
    public void onSubscribe(mf4 mf4Var) {
    }

    @Override // p000.l9a
    public void onSuccess(T t) {
        this.f93238c = t;
        for (C14380a<T> c14380a : this.f93237b.getAndSet(f93235f)) {
            if (!c14380a.isDisposed()) {
                c14380a.f93240a.onSuccess(t);
            }
        }
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C14380a<T> c14380a = new C14380a<>(l9aVar, this);
        l9aVar.onSubscribe(c14380a);
        if (m24326a(c14380a)) {
            if (c14380a.isDisposed()) {
                m24327b(c14380a);
                return;
            }
            aaa<T> andSet = this.f93236a.getAndSet(null);
            if (andSet != null) {
                andSet.subscribe(this);
                return;
            }
            return;
        }
        if (c14380a.isDisposed()) {
            return;
        }
        Throwable th = this.f93239d;
        if (th != null) {
            l9aVar.onError(th);
            return;
        }
        T t = this.f93238c;
        if (t != null) {
            l9aVar.onSuccess(t);
        } else {
            l9aVar.onComplete();
        }
    }
}
