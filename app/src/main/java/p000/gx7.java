package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class gx7<E extends Enum<E>> extends dy7<E> {

    /* JADX INFO: renamed from: f */
    public final transient EnumSet<E> f41760f;

    /* JADX INFO: renamed from: m */
    @ez8
    public transient int f41761m;

    /* JADX INFO: renamed from: gx7$b */
    @yg8
    public static class C6638b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final EnumSet<E> f41762a;

        public C6638b(EnumSet<E> delegate) {
            this.f41762a = delegate;
        }

        public Object readResolve() {
            return new gx7(this.f41762a.clone());
        }
    }

    /* JADX INFO: renamed from: j */
    public static <E extends Enum<E>> dy7<E> m12020j(EnumSet<E> set) {
        int size = set.size();
        return size != 0 ? size != 1 ? new gx7(set) : dy7.m9576of((Enum) vg8.getOnlyElement(set)) : dy7.m9575of();
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return this.f41760f.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof gx7) {
            collection = ((gx7) collection).f41760f;
        }
        return this.f41760f.containsAll(collection);
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gx7) {
            object = ((gx7) object).f41760f;
        }
        return this.f41760f.equals(object);
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.f41761m;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f41760f.hashCode();
        this.f41761m = iHashCode;
        return iHashCode;
    }

    @Override // p000.dy7
    /* JADX INFO: renamed from: i */
    public boolean mo9583i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f41760f.isEmpty();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f41760f.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f41760f.toString();
    }

    @Override // p000.dy7, p000.ax7
    @yg8
    public Object writeReplace() {
        return new C6638b(this.f41760f);
    }

    private gx7(EnumSet<E> delegate) {
        this.f41760f = delegate;
    }

    @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return wg8.unmodifiableIterator(this.f41760f.iterator());
    }
}
