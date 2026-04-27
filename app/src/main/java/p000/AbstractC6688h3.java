package p000;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public abstract class AbstractC6688h3<E> extends AbstractSet<E> implements Set<E>, fp8 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
