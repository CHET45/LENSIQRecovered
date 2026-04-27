package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public abstract class AbstractC7141i4<E> extends AbstractC10126o0<E> implements Set<E>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a f45709a = new a(null);

    /* JADX INFO: renamed from: i4$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        public final boolean setEquals$kotlin_stdlib(@yfb Set<?> set, @yfb Set<?> set2) {
            md8.checkNotNullParameter(set, "c");
            md8.checkNotNullParameter(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int unorderedHashCode$kotlin_stdlib(@yfb Collection<?> collection) {
            md8.checkNotNullParameter(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        private a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@gib Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f45709a.setEquals$kotlin_stdlib(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f45709a.unorderedHashCode$kotlin_stdlib(this);
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
