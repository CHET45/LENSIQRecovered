package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nr2<T> extends m86<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private nr2<T> onRefCount() {
        if (!(this instanceof vg6)) {
            return this;
        }
        vg6 vg6Var = (vg6) this;
        return pfe.onAssembly((nr2) new ug6(vg6Var.publishSource(), vg6Var.publishBufferSize()));
    }

    @bfb
    public m86<T> autoConnect() {
        return autoConnect(1);
    }

    public final mf4 connect() {
        xq2 xq2Var = new xq2();
        connect(xq2Var);
        return xq2Var.f98895a;
    }

    public abstract void connect(@bfb tu2<? super mf4> tu2Var);

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public m86<T> refCount() {
        return pfe.onAssembly(new kh6(onRefCount()));
    }

    @bfb
    public m86<T> autoConnect(int i) {
        return autoConnect(i, q07.emptyConsumer());
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> refCount(int i) {
        return refCount(i, 0L, TimeUnit.NANOSECONDS, npe.trampoline());
    }

    @bfb
    public m86<T> autoConnect(int i, @bfb tu2<? super mf4> tu2Var) {
        if (i <= 0) {
            connect(tu2Var);
            return pfe.onAssembly((nr2) this);
        }
        return pfe.onAssembly(new y86(this, i, tu2Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> refCount(long j, TimeUnit timeUnit) {
        return refCount(1, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> refCount(long j, TimeUnit timeUnit, voe voeVar) {
        return refCount(1, j, timeUnit, voeVar);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> refCount(int i, long j, TimeUnit timeUnit) {
        return refCount(i, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> refCount(int i, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.verifyPositive(i, "subscriberCount");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new kh6(onRefCount(), i, j, timeUnit, voeVar));
    }
}
