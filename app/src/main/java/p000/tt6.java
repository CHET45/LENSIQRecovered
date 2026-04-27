package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class tt6<E> extends jt6<E> implements SortedSet<E> {
    @wx1
    public Comparator<? super E> comparator() {
        return mo8967m().comparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.lr6
    /* JADX INFO: renamed from: d */
    public boolean mo16322d(@wx1 Object object) {
        try {
            return rt6.m21513m(comparator(), tailSet(object).first(), object) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    @dgc
    public E first() {
        return mo8967m().first();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.lr6
    /* JADX INFO: renamed from: g */
    public boolean mo16325g(@wx1 Object object) {
        try {
            Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (rt6.m21513m(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> headSet(@dgc E toElement) {
        return mo8967m().headSet(toElement);
    }

    @dgc
    public E last() {
        return mo8967m().last();
    }

    @Override // p000.jt6
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet<E> mo8967m();

    /* JADX INFO: renamed from: q */
    public SortedSet<E> mo22770q(@dgc E fromElement, @dgc E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }

    public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
        return mo8967m().subSet(fromElement, toElement);
    }

    public SortedSet<E> tailSet(@dgc E fromElement) {
        return mo8967m().tailSet(fromElement);
    }
}
