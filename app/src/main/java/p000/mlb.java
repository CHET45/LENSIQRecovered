package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class mlb<T, U extends Collection<? super T>> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final int f61411b;

    /* JADX INFO: renamed from: c */
    public final int f61412c;

    /* JADX INFO: renamed from: d */
    public final Callable<U> f61413d;

    /* JADX INFO: renamed from: mlb$a */
    public static final class C9403a<T, U extends Collection<? super T>> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f61414a;

        /* JADX INFO: renamed from: b */
        public final int f61415b;

        /* JADX INFO: renamed from: c */
        public final Callable<U> f61416c;

        /* JADX INFO: renamed from: d */
        public U f61417d;

        /* JADX INFO: renamed from: e */
        public int f61418e;

        /* JADX INFO: renamed from: f */
        public mf4 f61419f;

        public C9403a(oxb<? super U> oxbVar, int i, Callable<U> callable) {
            this.f61414a = oxbVar;
            this.f61415b = i;
            this.f61416c = callable;
        }

        /* JADX INFO: renamed from: a */
        public boolean m17381a() {
            try {
                this.f61417d = (U) xjb.requireNonNull(this.f61416c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f61417d = null;
                mf4 mf4Var = this.f61419f;
                if (mf4Var == null) {
                    c05.error(th, this.f61414a);
                    return false;
                }
                mf4Var.dispose();
                this.f61414a.onError(th);
                return false;
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f61419f.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f61419f.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            U u = this.f61417d;
            if (u != null) {
                this.f61417d = null;
                if (!u.isEmpty()) {
                    this.f61414a.onNext(u);
                }
                this.f61414a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f61417d = null;
            this.f61414a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            U u = this.f61417d;
            if (u != null) {
                u.add(t);
                int i = this.f61418e + 1;
                this.f61418e = i;
                if (i >= this.f61415b) {
                    this.f61414a.onNext(u);
                    this.f61418e = 0;
                    m17381a();
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f61419f, mf4Var)) {
                this.f61419f = mf4Var;
                this.f61414a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: mlb$b */
    public static final class C9404b<T, U extends Collection<? super T>> extends AtomicBoolean implements oxb<T>, mf4 {
        private static final long serialVersionUID = -8223395059921494546L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f61420a;

        /* JADX INFO: renamed from: b */
        public final int f61421b;

        /* JADX INFO: renamed from: c */
        public final int f61422c;

        /* JADX INFO: renamed from: d */
        public final Callable<U> f61423d;

        /* JADX INFO: renamed from: e */
        public mf4 f61424e;

        /* JADX INFO: renamed from: f */
        public final ArrayDeque<U> f61425f = new ArrayDeque<>();

        /* JADX INFO: renamed from: m */
        public long f61426m;

        public C9404b(oxb<? super U> oxbVar, int i, int i2, Callable<U> callable) {
            this.f61420a = oxbVar;
            this.f61421b = i;
            this.f61422c = i2;
            this.f61423d = callable;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f61424e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f61424e.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            while (!this.f61425f.isEmpty()) {
                this.f61420a.onNext(this.f61425f.poll());
            }
            this.f61420a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f61425f.clear();
            this.f61420a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = this.f61426m;
            this.f61426m = 1 + j;
            if (j % ((long) this.f61422c) == 0) {
                try {
                    this.f61425f.offer((U) ((Collection) xjb.requireNonNull(this.f61423d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th) {
                    this.f61425f.clear();
                    this.f61424e.dispose();
                    this.f61420a.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f61425f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.f61421b <= next.size()) {
                    it.remove();
                    this.f61420a.onNext(next);
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f61424e, mf4Var)) {
                this.f61424e = mf4Var;
                this.f61420a.onSubscribe(this);
            }
        }
    }

    public mlb(xub<T> xubVar, int i, int i2, Callable<U> callable) {
        super(xubVar);
        this.f61411b = i;
        this.f61412c = i2;
        this.f61413d = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        int i = this.f61412c;
        int i2 = this.f61411b;
        if (i != i2) {
            this.f66354a.subscribe(new C9404b(oxbVar, this.f61411b, this.f61412c, this.f61413d));
            return;
        }
        C9403a c9403a = new C9403a(oxbVar, i2, this.f61413d);
        if (c9403a.m17381a()) {
            this.f66354a.subscribe(c9403a);
        }
    }
}
