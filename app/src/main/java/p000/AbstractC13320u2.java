package p000;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13320u2<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC6688h3<E> {
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
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public final boolean contains(@yfb E e) {
        md8.checkNotNullParameter(e, "element");
        return containsEntry(e);
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> entry) {
        return super.remove((Object) entry);
    }
}
