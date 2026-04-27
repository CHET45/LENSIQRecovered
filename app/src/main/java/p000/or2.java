package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class or2<T> extends vkb<T> {
    @gpe("none")
    @cfb
    @cy1
    public vkb<T> autoConnect() {
        return autoConnect(1);
    }

    @gpe("none")
    @cfb
    public final lf4 connect() {
        wq2 wq2Var = new wq2();
        connect(wq2Var);
        return wq2Var.f95063a;
    }

    @gpe("none")
    public abstract void connect(@cfb uu2<? super lf4> connection);

    @gpe("none")
    @cfb
    @cy1
    public vkb<T> refCount() {
        return ofe.onAssembly(new atb(this));
    }

    @gpe("none")
    public abstract void reset();

    @cy1
    @gpe("none")
    @cfb
    public vkb<T> autoConnect(int numberOfObservers) {
        return autoConnect(numberOfObservers, r07.emptyConsumer());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> refCount(int observerCount) {
        return refCount(observerCount, 0L, TimeUnit.NANOSECONDS, mpe.trampoline());
    }

    @cy1
    @gpe("none")
    @cfb
    public vkb<T> autoConnect(int numberOfObservers, @cfb uu2<? super lf4> connection) {
        Objects.requireNonNull(connection, "connection is null");
        if (numberOfObservers <= 0) {
            connect(connection);
            return ofe.onAssembly((or2) this);
        }
        return ofe.onAssembly(new ilb(this, numberOfObservers, connection));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> refCount(long timeout, @cfb TimeUnit unit) {
        return refCount(1, timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> refCount(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return refCount(1, timeout, unit, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> refCount(int observerCount, long timeout, @cfb TimeUnit unit) {
        return refCount(observerCount, timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> refCount(int observerCount, long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        yjb.verifyPositive(observerCount, "observerCount");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new atb(this, observerCount, timeout, unit, scheduler));
    }
}
