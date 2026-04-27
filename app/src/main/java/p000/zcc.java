package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@by4
public final class zcc<E, T extends E> extends r45<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final r45<E> f104793a;

    public zcc(r45<E> elementEquivalence) {
        this.f104793a = (r45) v7d.checkNotNull(elementEquivalence);
    }

    @Override // p000.r45
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo18242a(Iterable<T> iterableA, Iterable<T> iterableB) {
        Iterator<T> it = iterableA.iterator();
        Iterator<T> it2 = iterableB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f104793a.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // p000.r45
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int mo18243b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.f104793a.hash(it.next());
        }
        return iHash;
    }

    public boolean equals(@wx1 Object object) {
        if (object instanceof zcc) {
            return this.f104793a.equals(((zcc) object).f104793a);
        }
        return false;
    }

    public int hashCode() {
        return this.f104793a.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.f104793a + ".pairwise()";
    }
}
