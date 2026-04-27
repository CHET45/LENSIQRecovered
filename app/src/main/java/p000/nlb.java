package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class nlb<T, U extends Collection<? super T>> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final int f64877b;

    /* JADX INFO: renamed from: c */
    public final int f64878c;

    /* JADX INFO: renamed from: d */
    public final nfg<U> f64879d;

    /* JADX INFO: renamed from: nlb$a */
    public static final class C9922a<T, U extends Collection<? super T>> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f64880a;

        /* JADX INFO: renamed from: b */
        public final int f64881b;

        /* JADX INFO: renamed from: c */
        public final nfg<U> f64882c;

        /* JADX INFO: renamed from: d */
        public U f64883d;

        /* JADX INFO: renamed from: e */
        public int f64884e;

        /* JADX INFO: renamed from: f */
        public lf4 f64885f;

        public C9922a(pxb<? super U> actual, int count, nfg<U> bufferSupplier) {
            this.f64880a = actual;
            this.f64881b = count;
            this.f64882c = bufferSupplier;
        }

        /* JADX INFO: renamed from: a */
        public boolean m17992a() {
            try {
                U u = this.f64882c.get();
                Objects.requireNonNull(u, "Empty buffer supplied");
                this.f64883d = u;
                return true;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f64883d = null;
                lf4 lf4Var = this.f64885f;
                if (lf4Var == null) {
                    b05.error(th, this.f64880a);
                    return false;
                }
                lf4Var.dispose();
                this.f64880a.onError(th);
                return false;
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f64885f.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f64885f.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            U u = this.f64883d;
            if (u != null) {
                this.f64883d = null;
                if (!u.isEmpty()) {
                    this.f64880a.onNext(u);
                }
                this.f64880a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f64883d = null;
            this.f64880a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            U u = this.f64883d;
            if (u != null) {
                u.add(t);
                int i = this.f64884e + 1;
                this.f64884e = i;
                if (i >= this.f64881b) {
                    this.f64880a.onNext(u);
                    this.f64884e = 0;
                    m17992a();
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f64885f, d)) {
                this.f64885f = d;
                this.f64880a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: nlb$b */
    public static final class C9923b<T, U extends Collection<? super T>> extends AtomicBoolean implements pxb<T>, lf4 {
        private static final long serialVersionUID = -8223395059921494546L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f64886a;

        /* JADX INFO: renamed from: b */
        public final int f64887b;

        /* JADX INFO: renamed from: c */
        public final int f64888c;

        /* JADX INFO: renamed from: d */
        public final nfg<U> f64889d;

        /* JADX INFO: renamed from: e */
        public lf4 f64890e;

        /* JADX INFO: renamed from: f */
        public final ArrayDeque<U> f64891f = new ArrayDeque<>();

        /* JADX INFO: renamed from: m */
        public long f64892m;

        public C9923b(pxb<? super U> actual, int count, int skip, nfg<U> bufferSupplier) {
            this.f64886a = actual;
            this.f64887b = count;
            this.f64888c = skip;
            this.f64889d = bufferSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f64890e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f64890e.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            while (!this.f64891f.isEmpty()) {
                this.f64886a.onNext(this.f64891f.poll());
            }
            this.f64886a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f64891f.clear();
            this.f64886a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = this.f64892m;
            this.f64892m = 1 + j;
            if (j % ((long) this.f64888c) == 0) {
                try {
                    this.f64891f.offer((U) ((Collection) k75.nullCheck(this.f64889d.get(), "The bufferSupplier returned a null Collection.")));
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f64891f.clear();
                    this.f64890e.dispose();
                    this.f64886a.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f64891f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.f64887b <= next.size()) {
                    it.remove();
                    this.f64886a.onNext(next);
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f64890e, d)) {
                this.f64890e = d;
                this.f64886a.onSubscribe(this);
            }
        }
    }

    public nlb(wub<T> source, int count, int skip, nfg<U> bufferSupplier) {
        super(source);
        this.f64877b = count;
        this.f64878c = skip;
        this.f64879d = bufferSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        int i = this.f64878c;
        int i2 = this.f64877b;
        if (i != i2) {
            this.f63101a.subscribe(new C9923b(t, this.f64877b, this.f64878c, this.f64879d));
            return;
        }
        C9922a c9922a = new C9922a(t, i2, this.f64879d);
        if (c9922a.m17992a()) {
            this.f63101a.subscribe(c9922a);
        }
    }
}
