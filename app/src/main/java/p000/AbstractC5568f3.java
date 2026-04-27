package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public abstract class AbstractC5568f3<E> extends AbstractList<E> implements List<E>, yo8 {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
