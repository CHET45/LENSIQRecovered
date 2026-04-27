package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class ww7<E> extends kx7<E> {

    /* JADX INFO: renamed from: ww7$a */
    @jd7
    @yg8
    public static class C14813a implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ax7<?> f95596a;

        public C14813a(ax7<?> collection) {
            this.f95596a = collection;
        }

        public Object readResolve() {
            return this.f95596a.asList();
        }
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.kx7, p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object target) {
        return mo13535h().contains(target);
    }

    /* JADX INFO: renamed from: h */
    public abstract ax7<E> mo13535h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return mo13535h().isEmpty();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return mo13535h().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return mo13535h().size();
    }

    @Override // p000.kx7, p000.ax7
    @jd7
    @yg8
    public Object writeReplace() {
        return new C14813a(mo13535h());
    }
}
