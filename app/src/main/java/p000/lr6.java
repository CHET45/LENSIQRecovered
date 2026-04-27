package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class lr6<E> extends zs6 implements Collection<E> {
    @Override // p000.zs6
    /* JADX INFO: renamed from: a */
    public abstract Collection<E> mo8967m();

    @op1
    public boolean add(@dgc E element) {
        return mo8967m().add(element);
    }

    @op1
    public boolean addAll(Collection<? extends E> collection) {
        return mo8967m().addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    public boolean mo16320b(Collection<? extends E> collection) {
        return wg8.addAll(this, collection.iterator());
    }

    /* JADX INFO: renamed from: c */
    public void mo16321c() {
        wg8.m24509c(iterator());
    }

    public void clear() {
        mo8967m().clear();
    }

    public boolean contains(@wx1 Object object) {
        return mo8967m().contains(object);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo8967m().containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo16322d(@wx1 Object object) {
        return wg8.contains(iterator(), object);
    }

    /* JADX INFO: renamed from: e */
    public boolean m16323e(Collection<?> collection) {
        return h82.m12261b(this, collection);
    }

    /* JADX INFO: renamed from: f */
    public boolean m16324f() {
        return !iterator().hasNext();
    }

    /* JADX INFO: renamed from: g */
    public boolean mo16325g(@wx1 Object object) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (okb.equal(it.next(), object)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo14281h(Collection<?> collection) {
        return wg8.removeAll(iterator(), collection);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo16326i(Collection<?> collection) {
        return wg8.retainAll(iterator(), collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo8967m().isEmpty();
    }

    public Iterator<E> iterator() {
        return mo8967m().iterator();
    }

    /* JADX INFO: renamed from: j */
    public Object[] m16327j() {
        return toArray(new Object[size()]);
    }

    /* JADX INFO: renamed from: k */
    public <T> T[] m16328k(T[] tArr) {
        return (T[]) pjb.m19537g(this, tArr);
    }

    /* JADX INFO: renamed from: l */
    public String mo16329l() {
        return h82.m12265f(this);
    }

    @op1
    public boolean remove(@wx1 Object object) {
        return mo8967m().remove(object);
    }

    @op1
    public boolean removeAll(Collection<?> collection) {
        return mo8967m().removeAll(collection);
    }

    @op1
    public boolean retainAll(Collection<?> collection) {
        return mo8967m().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return mo8967m().size();
    }

    public Object[] toArray() {
        return mo8967m().toArray();
    }

    @op1
    public <T> T[] toArray(T[] tArr) {
        return (T[]) mo8967m().toArray(tArr);
    }
}
