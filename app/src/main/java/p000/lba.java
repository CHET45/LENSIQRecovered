package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.a9a;

/* JADX INFO: loaded from: classes7.dex */
public final class lba<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final z9a<? extends T>[] f57063a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Object[], ? extends R> f57064b;

    /* JADX INFO: renamed from: lba$a */
    public final class C8758a implements sy6<T, R> {
        public C8758a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = lba.this.f57064b.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    /* JADX INFO: renamed from: lba$b */
    public static final class C8759b<T, R> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f57066a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], ? extends R> f57067b;

        /* JADX INFO: renamed from: c */
        public final C8760c<T>[] f57068c;

        /* JADX INFO: renamed from: d */
        public Object[] f57069d;

        public C8759b(k9a<? super R> observer, int n, sy6<? super Object[], ? extends R> zipper) {
            super(n);
            this.f57066a = observer;
            this.f57067b = zipper;
            C8760c<T>[] c8760cArr = new C8760c[n];
            for (int i = 0; i < n; i++) {
                c8760cArr[i] = new C8760c<>(this, i);
            }
            this.f57068c = c8760cArr;
            this.f57069d = new Object[n];
        }

        /* JADX INFO: renamed from: a */
        public void m16076a(int index) {
            C8760c<T>[] c8760cArr = this.f57068c;
            int length = c8760cArr.length;
            for (int i = 0; i < index; i++) {
                c8760cArr[i].dispose();
            }
            while (true) {
                index++;
                if (index >= length) {
                    return;
                } else {
                    c8760cArr[index].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16077b(int index) {
            if (getAndSet(0) > 0) {
                m16076a(index);
                this.f57069d = null;
                this.f57066a.onComplete();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m16078c(Throwable ex, int index) {
            if (getAndSet(0) <= 0) {
                ofe.onError(ex);
                return;
            }
            m16076a(index);
            this.f57069d = null;
            this.f57066a.onError(ex);
        }

        /* JADX INFO: renamed from: d */
        public void m16079d(T value, int index) {
            Object[] objArr = this.f57069d;
            if (objArr != null) {
                objArr[index] = value;
            }
            if (decrementAndGet() == 0) {
                try {
                    R rApply = this.f57067b.apply(objArr);
                    Objects.requireNonNull(rApply, "The zipper returned a null value");
                    this.f57069d = null;
                    this.f57066a.onSuccess(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f57069d = null;
                    this.f57066a.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C8760c<T> c8760c : this.f57068c) {
                    c8760c.dispose();
                }
                this.f57069d = null;
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* JADX INFO: renamed from: lba$c */
    public static final class C8760c<T> extends AtomicReference<lf4> implements k9a<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: a */
        public final C8759b<T, ?> f57070a;

        /* JADX INFO: renamed from: b */
        public final int f57071b;

        public C8760c(C8759b<T, ?> parent, int index) {
            this.f57070a = parent;
            this.f57071b = index;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f57070a.m16077b(this.f57071b);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f57070a.m16078c(e, this.f57071b);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f57070a.m16079d(value, this.f57071b);
        }
    }

    public lba(z9a<? extends T>[] sources, sy6<? super Object[], ? extends R> zipper) {
        this.f57063a = sources;
        this.f57064b = zipper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        z9a<? extends T>[] z9aVarArr = this.f57063a;
        int length = z9aVarArr.length;
        if (length == 1) {
            z9aVarArr[0].subscribe(new a9a.C0106a(observer, new C8758a()));
            return;
        }
        C8759b c8759b = new C8759b(observer, length, this.f57064b);
        observer.onSubscribe(c8759b);
        for (int i = 0; i < length && !c8759b.isDisposed(); i++) {
            z9a<? extends T> z9aVar = z9aVarArr[i];
            if (z9aVar == null) {
                c8759b.m16078c(new NullPointerException("One of the sources is null"), i);
                return;
            }
            z9aVar.subscribe(c8759b.f57068c[i]);
        }
    }
}
