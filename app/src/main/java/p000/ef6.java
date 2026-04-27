package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ef6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends R> f32800c;

    /* JADX INFO: renamed from: d */
    public final py6<? super Throwable, ? extends R> f32801d;

    /* JADX INFO: renamed from: e */
    public final Callable<? extends R> f32802e;

    /* JADX INFO: renamed from: ef6$a */
    public static final class C5281a<T, R> extends vnf<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;

        /* JADX INFO: renamed from: C */
        public final py6<? super Throwable, ? extends R> f32803C;

        /* JADX INFO: renamed from: F */
        public final Callable<? extends R> f32804F;

        /* JADX INFO: renamed from: m */
        public final py6<? super T, ? extends R> f32805m;

        public C5281a(ycg<? super R> ycgVar, py6<? super T, ? extends R> py6Var, py6<? super Throwable, ? extends R> py6Var2, Callable<? extends R> callable) {
            super(ycgVar);
            this.f32805m = py6Var;
            this.f32803C = py6Var2;
            this.f32804F = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onComplete() {
            try {
                m24079a(xjb.requireNonNull(this.f32804F.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f91810a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onError(Throwable th) {
            try {
                m24079a(xjb.requireNonNull(this.f32803C.apply(th), "The onError publisher returned is null"));
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f91810a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                Object objRequireNonNull = xjb.requireNonNull(this.f32805m.apply(t), "The onNext publisher returned is null");
                this.f91813d++;
                this.f91810a.onNext(objRequireNonNull);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f91810a.onError(th);
            }
        }
    }

    public ef6(m86<T> m86Var, py6<? super T, ? extends R> py6Var, py6<? super Throwable, ? extends R> py6Var2, Callable<? extends R> callable) {
        super(m86Var);
        this.f32800c = py6Var;
        this.f32801d = py6Var2;
        this.f32802e = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f52360b.subscribe((lj6) new C5281a(ycgVar, this.f32800c, this.f32801d, this.f32802e));
    }
}
