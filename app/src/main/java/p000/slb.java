package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class slb<T, U extends Collection<? super T>, B> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final wub<B> f82181b;

    /* JADX INFO: renamed from: c */
    public final nfg<U> f82182c;

    /* JADX INFO: renamed from: slb$a */
    public static final class C12649a<T, U extends Collection<? super T>, B> extends fg4<B> {

        /* JADX INFO: renamed from: b */
        public final C12650b<T, U, B> f82183b;

        public C12649a(C12650b<T, U, B> parent) {
            this.f82183b = parent;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f82183b.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f82183b.onError(t);
        }

        @Override // p000.pxb
        public void onNext(B t) {
            this.f82183b.m22092c();
        }
    }

    /* JADX INFO: renamed from: slb$b */
    public static final class C12650b<T, U extends Collection<? super T>, B> extends zmd<T, U, U> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: q2 */
        public final nfg<U> f82184q2;

        /* JADX INFO: renamed from: r2 */
        public final wub<B> f82185r2;

        /* JADX INFO: renamed from: s2 */
        public lf4 f82186s2;

        /* JADX INFO: renamed from: t2 */
        public lf4 f82187t2;

        /* JADX INFO: renamed from: u2 */
        public U f82188u2;

        public C12650b(pxb<? super U> actual, nfg<U> bufferSupplier, wub<B> boundary) {
            super(actual, new t1b());
            this.f82184q2 = bufferSupplier;
            this.f82185r2 = boundary;
        }

        @Override // p000.zmd, p000.nsb
        public /* bridge */ /* synthetic */ void accept(pxb a, Object v) {
            accept((pxb<? super Collection>) a, (Collection) v);
        }

        /* JADX INFO: renamed from: c */
        public void m22092c() {
            try {
                U u = this.f82184q2.get();
                Objects.requireNonNull(u, "The buffer supplied is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        U u3 = this.f82188u2;
                        if (u3 == null) {
                            return;
                        }
                        this.f82188u2 = u2;
                        m26900a(u3, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                dispose();
                this.f105481l2.onError(th2);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f105483n2) {
                return;
            }
            this.f105483n2 = true;
            this.f82187t2.dispose();
            this.f82186s2.dispose();
            if (enter()) {
                this.f105482m2.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105483n2;
        }

        @Override // p000.pxb
        public void onComplete() {
            synchronized (this) {
                try {
                    U u = this.f82188u2;
                    if (u == null) {
                        return;
                    }
                    this.f82188u2 = null;
                    this.f105482m2.offer(u);
                    this.f105484o2 = true;
                    if (enter()) {
                        xmd.drainLoop(this.f105482m2, this.f105481l2, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            dispose();
            this.f105481l2.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f82188u2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f82186s2, d)) {
                this.f82186s2 = d;
                try {
                    U u = this.f82184q2.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.f82188u2 = u;
                    C12649a c12649a = new C12649a(this);
                    this.f82187t2 = c12649a;
                    this.f105481l2.onSubscribe(this);
                    if (this.f105483n2) {
                        return;
                    }
                    this.f82185r2.subscribe(c12649a);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f105483n2 = true;
                    d.dispose();
                    b05.error(th, this.f105481l2);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(pxb<? super U> pxbVar, U u) {
            this.f105481l2.onNext((Object) u);
        }
    }

    public slb(wub<T> source, wub<B> boundary, nfg<U> bufferSupplier) {
        super(source);
        this.f82181b = boundary;
        this.f82182c = bufferSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        this.f63101a.subscribe(new C12650b(new m1f(t), this.f82182c, this.f82181b));
    }
}
