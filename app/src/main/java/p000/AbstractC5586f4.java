package p000;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC5586f4<T> extends quh<T> {

    /* JADX INFO: renamed from: a */
    @wx1
    public T f35009a;

    public AbstractC5586f4(@wx1 T firstOrNull) {
        this.f35009a = firstOrNull;
    }

    @wx1
    /* JADX INFO: renamed from: a */
    public abstract T mo10501a(T previous);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35009a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f35009a;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.f35009a = mo10501a(t);
        return t;
    }
}
