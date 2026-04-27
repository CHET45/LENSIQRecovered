package p000;

import java.util.Objects;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC7714j1<T, R> extends l86<R> implements dh7<T> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f49321b;

    public AbstractC7714j1(l86<T> source) {
        Objects.requireNonNull(source, "source is null");
        this.f49321b = source;
    }

    @Override // p000.dh7
    public final zjd<T> source() {
        return this.f49321b;
    }
}
