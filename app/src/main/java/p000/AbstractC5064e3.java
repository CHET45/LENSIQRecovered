package p000;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public abstract class AbstractC5064e3<E> extends AbstractCollection<E> implements Collection<E>, vo8 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
