package p000;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: renamed from: t2 */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 8)
public abstract class AbstractC12852t2<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC6688h3<E> {

    /* JADX INFO: renamed from: a */
    public static final int f83443a = 0;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@yfb Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean removeEntry(@yfb Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(@yfb E e) {
        if ((e != null ? e : null) == null) {
            return false;
        }
        return containsEntry(e);
    }

    public final boolean remove(@yfb E e) {
        if ((e != null ? e : null) == null) {
            return false;
        }
        return removeEntry(e);
    }
}
