package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class lxb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T>[] f59144a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends wub<? extends T>> f59145b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super Object[], ? extends R> f59146c;

    /* JADX INFO: renamed from: d */
    public final int f59147d;

    /* JADX INFO: renamed from: e */
    public final boolean f59148e;

    /* JADX INFO: renamed from: lxb$a */
    public static final class C9028a<T, R> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 2983708048395377667L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f59149a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], ? extends R> f59150b;

        /* JADX INFO: renamed from: c */
        public final C9029b<T, R>[] f59151c;

        /* JADX INFO: renamed from: d */
        public final T[] f59152d;

        /* JADX INFO: renamed from: e */
        public final boolean f59153e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f59154f;

        public C9028a(pxb<? super R> pxbVar, sy6<? super Object[], ? extends R> sy6Var, int i, boolean z) {
            this.f59149a = pxbVar;
            this.f59150b = sy6Var;
            this.f59151c = new C9029b[i];
            this.f59152d = (T[]) new Object[i];
            this.f59153e = z;
        }

        /* JADX INFO: renamed from: a */
        public void m16455a() {
            m16458d();
            m16456b();
        }

        /* JADX INFO: renamed from: b */
        public void m16456b() {
            for (C9029b<T, R> c9029b : this.f59151c) {
                c9029b.dispose();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m16457c(boolean d, boolean empty, pxb<? super R> a, boolean delayError, C9029b<?, ?> source) {
            if (this.f59154f) {
                m16455a();
                return true;
            }
            if (!d) {
                return false;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = source.f59158d;
                this.f59154f = true;
                m16455a();
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                return true;
            }
            Throwable th2 = source.f59158d;
            if (th2 != null) {
                this.f59154f = true;
                m16455a();
                a.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f59154f = true;
            m16455a();
            a.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void m16458d() {
            for (C9029b<T, R> c9029b : this.f59151c) {
                c9029b.f59156b.clear();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f59154f) {
                return;
            }
            this.f59154f = true;
            m16456b();
            if (getAndIncrement() == 0) {
                m16458d();
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            C9029b<T, R>[] c9029bArr = this.f59151c;
            pxb<? super R> pxbVar = this.f59149a;
            T[] tArr = this.f59152d;
            boolean z = this.f59153e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (C9029b<T, R> c9029b : c9029bArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = c9029b.f59157c;
                        T tPoll = c9029b.f59156b.poll();
                        boolean z3 = tPoll == null;
                        if (m16457c(z2, z3, pxbVar, z, c9029b)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (c9029b.f59157c && !z && (th = c9029b.f59158d) != null) {
                        this.f59154f = true;
                        m16455a();
                        pxbVar.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.f59150b.apply(tArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        pxbVar.onNext(rApply);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        m16455a();
                        pxbVar.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f59154f;
        }

        public void subscribe(wub<? extends T>[] sources, int bufferSize) {
            C9029b<T, R>[] c9029bArr = this.f59151c;
            int length = c9029bArr.length;
            for (int i = 0; i < length; i++) {
                c9029bArr[i] = new C9029b<>(this, bufferSize);
            }
            lazySet(0);
            this.f59149a.onSubscribe(this);
            for (int i2 = 0; i2 < length && !this.f59154f; i2++) {
                sources[i2].subscribe(c9029bArr[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: lxb$b */
    public static final class C9029b<T, R> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final C9028a<T, R> f59155a;

        /* JADX INFO: renamed from: b */
        public final qzf<T> f59156b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f59157c;

        /* JADX INFO: renamed from: d */
        public Throwable f59158d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<lf4> f59159e = new AtomicReference<>();

        public C9029b(C9028a<T, R> parent, int bufferSize) {
            this.f59155a = parent;
            this.f59156b = new qzf<>(bufferSize);
        }

        public void dispose() {
            zf4.dispose(this.f59159e);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f59157c = true;
            this.f59155a.drain();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f59158d = t;
            this.f59157c = true;
            this.f59155a.drain();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f59156b.offer(t);
            this.f59155a.drain();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f59159e, d);
        }
    }

    public lxb(wub<? extends T>[] sources, Iterable<? extends wub<? extends T>> sourcesIterable, sy6<? super Object[], ? extends R> zipper, int bufferSize, boolean delayError) {
        this.f59144a = sources;
        this.f59145b = sourcesIterable;
        this.f59146c = zipper;
        this.f59147d = bufferSize;
        this.f59148e = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        int length;
        wub<? extends T>[] wubVarArr = this.f59144a;
        if (wubVarArr == null) {
            wubVarArr = new wub[8];
            length = 0;
            for (wub<? extends T> wubVar : this.f59145b) {
                if (length == wubVarArr.length) {
                    wub<? extends T>[] wubVarArr2 = new wub[(length >> 2) + length];
                    System.arraycopy(wubVarArr, 0, wubVarArr2, 0, length);
                    wubVarArr = wubVarArr2;
                }
                wubVarArr[length] = wubVar;
                length++;
            }
        } else {
            length = wubVarArr.length;
        }
        if (length == 0) {
            b05.complete(observer);
        } else {
            new C9028a(observer, this.f59146c, length, this.f59148e).subscribe(wubVarArr, this.f59147d);
        }
    }
}
