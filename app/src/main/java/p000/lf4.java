package p000;

import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public interface lf4 {
    @cfb
    static lf4 disposed() {
        return b05.INSTANCE;
    }

    @cfb
    static lf4 empty() {
        return fromRunnable(r07.f76638b);
    }

    @cfb
    static lf4 fromAction(@cfb InterfaceC7776j8 action) {
        Objects.requireNonNull(action, "action is null");
        return new C12484s8(action);
    }

    @cfb
    static lf4 fromAutoCloseable(@cfb AutoCloseable autoCloseable) {
        Objects.requireNonNull(autoCloseable, "autoCloseable is null");
        return new oi0(autoCloseable);
    }

    @cfb
    static lf4 fromFuture(@cfb Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return fromFuture(future, true);
    }

    @cfb
    static lf4 fromRunnable(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return new lde(run);
    }

    @cfb
    static lf4 fromSubscription(@cfb fdg subscription) {
        Objects.requireNonNull(subscription, "subscription is null");
        return new jdg(subscription);
    }

    @cfb
    static AutoCloseable toAutoCloseable(@cfb final lf4 disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        return new AutoCloseable() { // from class: kf4
            @Override // java.lang.AutoCloseable
            public final void close() {
                this.f53864a.dispose();
            }
        };
    }

    void dispose();

    boolean isDisposed();

    @cfb
    static lf4 fromFuture(@cfb Future<?> future, boolean allowInterrupt) {
        Objects.requireNonNull(future, "future is null");
        return new d17(future, allowInterrupt);
    }
}
