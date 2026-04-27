package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pr2<T> extends Observable<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private pr2<T> onRefCount() {
        return this instanceof ksb ? pfe.onAssembly((pr2) new jsb(((ksb) this).publishSource())) : this;
    }

    @bfb
    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public final mf4 connect() {
        xq2 xq2Var = new xq2();
        connect(xq2Var);
        return xq2Var.f98895a;
    }

    public abstract void connect(@bfb tu2<? super mf4> tu2Var);

    @bfb
    @by1
    @hpe("none")
    public Observable<T> refCount() {
        return pfe.onAssembly(new zsb(onRefCount()));
    }

    @bfb
    public Observable<T> autoConnect(int i) {
        return autoConnect(i, q07.emptyConsumer());
    }

    @by1
    @hpe("none")
    public final Observable<T> refCount(int i) {
        return refCount(i, 0L, TimeUnit.NANOSECONDS, npe.trampoline());
    }

    @bfb
    public Observable<T> autoConnect(int i, @bfb tu2<? super mf4> tu2Var) {
        if (i <= 0) {
            connect(tu2Var);
            return pfe.onAssembly((pr2) this);
        }
        return pfe.onAssembly(new jlb(this, i, tu2Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final Observable<T> refCount(long j, TimeUnit timeUnit) {
        return refCount(1, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    public final Observable<T> refCount(long j, TimeUnit timeUnit, voe voeVar) {
        return refCount(1, j, timeUnit, voeVar);
    }

    @by1
    @hpe("io.reactivex:computation")
    public final Observable<T> refCount(int i, long j, TimeUnit timeUnit) {
        return refCount(i, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    public final Observable<T> refCount(int i, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.verifyPositive(i, "subscriberCount");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new zsb(onRefCount(), i, j, timeUnit, voeVar));
    }
}
