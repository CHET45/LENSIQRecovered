package p000;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class jt6<E> extends lr6<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        return object == this || mo8967m().equals(object);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: h */
    public boolean mo14281h(Collection<?> collection) {
        return t6f.m22398c(this, (Collection) v7d.checkNotNull(collection));
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @Override // p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m */
    public abstract Set<E> mo8967m();

    /* JADX INFO: renamed from: n */
    public boolean m14282n(@wx1 Object object) {
        return t6f.m22396a(this, object);
    }

    /* JADX INFO: renamed from: o */
    public int m14283o() {
        return t6f.m22397b(this);
    }
}
