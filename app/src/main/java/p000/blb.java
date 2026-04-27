package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class blb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T>[] f14055a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends wub<? extends T>> f14056b;

    /* JADX INFO: renamed from: blb$a */
    public static final class C1937a<T> implements lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f14057a;

        /* JADX INFO: renamed from: b */
        public final C1938b<T>[] f14058b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f14059c = new AtomicInteger();

        public C1937a(pxb<? super T> actual, int count) {
            this.f14057a = actual;
            this.f14058b = new C1938b[count];
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f14059c.get() != -1) {
                this.f14059c.lazySet(-1);
                for (C1938b<T> c1938b : this.f14058b) {
                    c1938b.dispose();
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f14059c.get() == -1;
        }

        public void subscribe(wub<? extends T>[] sources) {
            C1938b<T>[] c1938bArr = this.f14058b;
            int length = c1938bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                c1938bArr[i] = new C1938b<>(this, i2, this.f14057a);
                i = i2;
            }
            this.f14059c.lazySet(0);
            this.f14057a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f14059c.get() == 0; i3++) {
                sources[i3].subscribe(c1938bArr[i3]);
            }
        }

        public boolean win(int index) {
            int i = 0;
            if (this.f14059c.get() != 0 || !this.f14059c.compareAndSet(0, index)) {
                return false;
            }
            C1938b<T>[] c1938bArr = this.f14058b;
            int length = c1938bArr.length;
            while (i < length) {
                int i2 = i + 1;
                if (i2 != index) {
                    c1938bArr[i].dispose();
                }
                i = i2;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: blb$b */
    public static final class C1938b<T> extends AtomicReference<lf4> implements pxb<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: a */
        public final C1937a<T> f14060a;

        /* JADX INFO: renamed from: b */
        public final int f14061b;

        /* JADX INFO: renamed from: c */
        public final pxb<? super T> f14062c;

        /* JADX INFO: renamed from: d */
        public boolean f14063d;

        public C1938b(C1937a<T> parent, int index, pxb<? super T> downstream) {
            this.f14060a = parent;
            this.f14061b = index;
            this.f14062c = downstream;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f14063d) {
                this.f14062c.onComplete();
            } else if (this.f14060a.win(this.f14061b)) {
                this.f14063d = true;
                this.f14062c.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f14063d) {
                this.f14062c.onError(t);
            } else if (!this.f14060a.win(this.f14061b)) {
                ofe.onError(t);
            } else {
                this.f14063d = true;
                this.f14062c.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f14063d) {
                this.f14062c.onNext(t);
            } else if (!this.f14060a.win(this.f14061b)) {
                get().dispose();
            } else {
                this.f14063d = true;
                this.f14062c.onNext(t);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public blb(wub<? extends T>[] sources, Iterable<? extends wub<? extends T>> sourcesIterable) {
        this.f14055a = sources;
        this.f14056b = sourcesIterable;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        int length;
        wub<? extends T>[] wubVarArr = this.f14055a;
        if (wubVarArr == null) {
            wubVarArr = new wub[8];
            try {
                length = 0;
                for (wub<? extends T> wubVar : this.f14056b) {
                    if (wubVar == null) {
                        b05.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == wubVarArr.length) {
                        wub<? extends T>[] wubVarArr2 = new wub[(length >> 2) + length];
                        System.arraycopy(wubVarArr, 0, wubVarArr2, 0, length);
                        wubVarArr = wubVarArr2;
                    }
                    int i = length + 1;
                    wubVarArr[length] = wubVar;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
                return;
            }
        } else {
            length = wubVarArr.length;
        }
        if (length == 0) {
            b05.complete(observer);
        } else if (length == 1) {
            wubVarArr[0].subscribe(observer);
        } else {
            new C1937a(observer, length).subscribe(wubVarArr);
        }
    }
}
