package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mr2<T> extends l86<T> {
    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public l86<T> autoConnect() {
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

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public l86<T> refCount() {
        return ofe.onAssembly(new lh6(this));
    }

    @gpe("none")
    public abstract void reset();

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public l86<T> autoConnect(int numberOfSubscribers) {
        return autoConnect(numberOfSubscribers, r07.emptyConsumer());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> refCount(int subscriberCount) {
        return refCount(subscriberCount, 0L, TimeUnit.NANOSECONDS, mpe.trampoline());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public l86<T> autoConnect(int numberOfSubscribers, @cfb uu2<? super lf4> connection) {
        Objects.requireNonNull(connection, "connection is null");
        if (numberOfSubscribers <= 0) {
            connect(connection);
            return ofe.onAssembly((mr2) this);
        }
        return ofe.onAssembly(new x86(this, numberOfSubscribers, connection));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> refCount(long timeout, @cfb TimeUnit unit) {
        return refCount(1, timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> refCount(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return refCount(1, timeout, unit, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> refCount(int subscriberCount, long timeout, @cfb TimeUnit unit) {
        return refCount(subscriberCount, timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> refCount(int subscriberCount, long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        yjb.verifyPositive(subscriberCount, "subscriberCount");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new lh6(this, subscriberCount, timeout, unit, scheduler));
    }
}
