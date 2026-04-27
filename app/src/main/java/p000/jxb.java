package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class jxb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    @dib
    public final wub<?>[] f52181b;

    /* JADX INFO: renamed from: c */
    @dib
    public final Iterable<? extends wub<?>> f52182c;

    /* JADX INFO: renamed from: d */
    @cfb
    public final sy6<? super Object[], R> f52183d;

    /* JADX INFO: renamed from: jxb$a */
    public final class C8136a implements sy6<T, R> {
        public C8136a() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            R rApply = jxb.this.f52183d.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    /* JADX INFO: renamed from: jxb$b */
    public static final class C8137b<T, R> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f52185a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], R> f52186b;

        /* JADX INFO: renamed from: c */
        public final C8138c[] f52187c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceArray<Object> f52188d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<lf4> f52189e;

        /* JADX INFO: renamed from: f */
        public final bc0 f52190f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f52191m;

        public C8137b(pxb<? super R> actual, sy6<? super Object[], R> combiner, int n) {
            this.f52185a = actual;
            this.f52186b = combiner;
            C8138c[] c8138cArr = new C8138c[n];
            for (int i = 0; i < n; i++) {
                c8138cArr[i] = new C8138c(this, i);
            }
            this.f52187c = c8138cArr;
            this.f52188d = new AtomicReferenceArray<>(n);
            this.f52189e = new AtomicReference<>();
            this.f52190f = new bc0();
        }

        /* JADX INFO: renamed from: a */
        public void m14366a(int index) {
            C8138c[] c8138cArr = this.f52187c;
            for (int i = 0; i < c8138cArr.length; i++) {
                if (i != index) {
                    c8138cArr[i].dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14367b(int index, boolean nonEmpty) {
            if (nonEmpty) {
                return;
            }
            this.f52191m = true;
            m14366a(index);
            xd7.onComplete(this.f52185a, this, this.f52190f);
        }

        /* JADX INFO: renamed from: c */
        public void m14368c(int index, Throwable t) {
            this.f52191m = true;
            zf4.dispose(this.f52189e);
            m14366a(index);
            xd7.onError(this.f52185a, t, this, this.f52190f);
        }

        /* JADX INFO: renamed from: d */
        public void m14369d(int index, Object o) {
            this.f52188d.set(index, o);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f52189e);
            for (C8138c c8138c : this.f52187c) {
                c8138c.dispose();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m14370e(wub<?>[] others, int n) {
            C8138c[] c8138cArr = this.f52187c;
            AtomicReference<lf4> atomicReference = this.f52189e;
            for (int i = 0; i < n && !zf4.isDisposed(atomicReference.get()) && !this.f52191m; i++) {
                others[i].subscribe(c8138cArr[i]);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f52189e.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f52191m) {
                return;
            }
            this.f52191m = true;
            m14366a(-1);
            xd7.onComplete(this.f52185a, this, this.f52190f);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f52191m) {
                ofe.onError(t);
                return;
            }
            this.f52191m = true;
            m14366a(-1);
            xd7.onError(this.f52185a, t, this, this.f52190f);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f52191m) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f52188d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                R rApply = this.f52186b.apply(objArr);
                Objects.requireNonNull(rApply, "combiner returned a null value");
                xd7.onNext(this.f52185a, rApply, this, this.f52190f);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f52189e, d);
        }
    }

    /* JADX INFO: renamed from: jxb$c */
    public static final class C8138c extends AtomicReference<lf4> implements pxb<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a */
        public final C8137b<?, ?> f52192a;

        /* JADX INFO: renamed from: b */
        public final int f52193b;

        /* JADX INFO: renamed from: c */
        public boolean f52194c;

        public C8138c(C8137b<?, ?> parent, int index) {
            this.f52192a = parent;
            this.f52193b = index;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f52192a.m14367b(this.f52193b, this.f52194c);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f52192a.m14368c(this.f52193b, t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            if (!this.f52194c) {
                this.f52194c = true;
            }
            this.f52192a.m14369d(this.f52193b, t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public jxb(@cfb wub<T> source, @cfb wub<?>[] otherArray, @cfb sy6<? super Object[], R> combiner) {
        super(source);
        this.f52181b = otherArray;
        this.f52182c = null;
        this.f52183d = combiner;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        int length;
        wub<?>[] wubVarArr = this.f52181b;
        if (wubVarArr == null) {
            wubVarArr = new wub[8];
            try {
                length = 0;
                for (wub<?> wubVar : this.f52182c) {
                    if (length == wubVarArr.length) {
                        wubVarArr = (wub[]) Arrays.copyOf(wubVarArr, (length >> 1) + length);
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
            new hrb(this.f63101a, new C8136a()).subscribeActual(observer);
            return;
        }
        C8137b c8137b = new C8137b(observer, this.f52183d, length);
        observer.onSubscribe(c8137b);
        c8137b.m14370e(wubVarArr, length);
        this.f63101a.subscribe(c8137b);
    }

    public jxb(@cfb wub<T> source, @cfb Iterable<? extends wub<?>> otherIterable, @cfb sy6<? super Object[], R> combiner) {
        super(source);
        this.f52181b = null;
        this.f52182c = otherIterable;
        this.f52183d = combiner;
    }
}
