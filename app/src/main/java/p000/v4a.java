package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class v4a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<? extends T>[] f89912a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends z9a<? extends T>> f89913b;

    /* JADX INFO: renamed from: v4a$a */
    public static final class C13861a<T> implements k9a<T> {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f89914a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f89915b;

        /* JADX INFO: renamed from: c */
        public final mm2 f89916c;

        /* JADX INFO: renamed from: d */
        public lf4 f89917d;

        public C13861a(k9a<? super T> downstream, mm2 set, AtomicBoolean winner) {
            this.f89914a = downstream;
            this.f89916c = set;
            this.f89915b = winner;
        }

        @Override // p000.k9a
        public void onComplete() {
            if (this.f89915b.compareAndSet(false, true)) {
                this.f89916c.delete(this.f89917d);
                this.f89916c.dispose();
                this.f89914a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            if (!this.f89915b.compareAndSet(false, true)) {
                ofe.onError(e);
                return;
            }
            this.f89916c.delete(this.f89917d);
            this.f89916c.dispose();
            this.f89914a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f89917d = d;
            this.f89916c.add(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            if (this.f89915b.compareAndSet(false, true)) {
                this.f89916c.delete(this.f89917d);
                this.f89916c.dispose();
                this.f89914a.onSuccess(value);
            }
        }
    }

    public v4a(z9a<? extends T>[] sources, Iterable<? extends z9a<? extends T>> sourcesIterable) {
        this.f89912a = sources;
        this.f89913b = sourcesIterable;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        int length;
        z9a<? extends T>[] z9aVarArr = this.f89912a;
        if (z9aVarArr == null) {
            z9aVarArr = new z9a[8];
            try {
                length = 0;
                for (z9a<? extends T> z9aVar : this.f89913b) {
                    if (z9aVar == null) {
                        b05.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == z9aVarArr.length) {
                        z9a<? extends T>[] z9aVarArr2 = new z9a[(length >> 2) + length];
                        System.arraycopy(z9aVarArr, 0, z9aVarArr2, 0, length);
                        z9aVarArr = z9aVarArr2;
                    }
                    int i = length + 1;
                    z9aVarArr[length] = z9aVar;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
                return;
            }
        } else {
            length = z9aVarArr.length;
        }
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            z9a<? extends T> z9aVar2 = z9aVarArr[i2];
            if (mm2Var.isDisposed()) {
                return;
            }
            if (z9aVar2 == null) {
                mm2Var.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    observer.onError(nullPointerException);
                    return;
                } else {
                    ofe.onError(nullPointerException);
                    return;
                }
            }
            z9aVar2.subscribe(new C13861a(observer, mm2Var, atomicBoolean));
        }
        if (length == 0) {
            observer.onComplete();
        }
    }
}
