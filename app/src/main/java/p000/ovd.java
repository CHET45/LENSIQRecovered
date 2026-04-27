package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ovd<T> extends AtomicReference<T> implements lf4 {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovd(T value) {
        super(value);
        Objects.requireNonNull(value, "value is null");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14065a(@cfb T value);

    @Override // p000.lf4
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo14065a(andSet);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return get() == null;
    }
}
