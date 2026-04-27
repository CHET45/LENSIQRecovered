package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class us6<E> extends lr6<E> implements d4b<E> {

    /* JADX INFO: renamed from: us6$a */
    public class C13692a extends e4b.AbstractC5106h<E> {
        public C13692a() {
        }

        @Override // p000.e4b.AbstractC5106h
        /* JADX INFO: renamed from: a */
        public d4b<E> mo8866a() {
            return us6.this;
        }

        @Override // p000.e4b.AbstractC5106h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return e4b.m9659c(mo8866a().entrySet().iterator());
        }
    }

    @op1
    public int add(@dgc E element, int occurrences) {
        return mo8967m().add(element, occurrences);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: b */
    public boolean mo16320b(Collection<? extends E> elementsToAdd) {
        return e4b.m9657a(this, elementsToAdd);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: c */
    public void mo16321c() {
        wg8.m24509c(entrySet().iterator());
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        return mo8967m().count(element);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: d */
    public boolean mo16322d(@wx1 Object object) {
        return count(object) > 0;
    }

    public Set<E> elementSet() {
        return mo8967m().elementSet();
    }

    public Set<d4b.InterfaceC4612a<E>> entrySet() {
        return mo8967m().entrySet();
    }

    @Override // java.util.Collection, p000.d4b
    public boolean equals(@wx1 Object object) {
        return object == this || mo8967m().equals(object);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: g */
    public boolean mo16325g(@wx1 Object element) {
        return remove(element, 1) > 0;
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: h */
    public boolean mo14281h(Collection<?> elementsToRemove) {
        return e4b.m9664h(this, elementsToRemove);
    }

    @Override // java.util.Collection, p000.d4b
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: i */
    public boolean mo16326i(Collection<?> elementsToRetain) {
        return e4b.m9665i(this, elementsToRetain);
    }

    @Override // p000.lr6
    /* JADX INFO: renamed from: l */
    public String mo16329l() {
        return entrySet().toString();
    }

    @Override // p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m */
    public abstract d4b<E> mo8967m();

    /* JADX INFO: renamed from: n */
    public boolean m23557n(@dgc E element) {
        add(element, 1);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public int m23558o(@wx1 Object object) {
        for (d4b.InterfaceC4612a<E> interfaceC4612a : entrySet()) {
            if (okb.equal(interfaceC4612a.getElement(), object)) {
                return interfaceC4612a.getCount();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m23559p(@wx1 Object object) {
        return e4b.m9660d(this, object);
    }

    /* JADX INFO: renamed from: q */
    public int m23560q() {
        return entrySet().hashCode();
    }

    /* JADX INFO: renamed from: r */
    public Iterator<E> m23561r() {
        return e4b.m9662f(this);
    }

    @op1
    public int remove(@wx1 Object element, int occurrences) {
        return mo8967m().remove(element, occurrences);
    }

    /* JADX INFO: renamed from: s */
    public int m23562s(@dgc E element, int count) {
        return e4b.m9666j(this, element, count);
    }

    @op1
    public int setCount(@dgc E element, int count) {
        return mo8967m().setCount(element, count);
    }

    /* JADX INFO: renamed from: t */
    public boolean m23563t(@dgc E element, int oldCount, int newCount) {
        return e4b.m9667k(this, element, oldCount, newCount);
    }

    /* JADX INFO: renamed from: u */
    public int m23564u() {
        return e4b.m9663g(this);
    }

    @op1
    public boolean setCount(@dgc E element, int oldCount, int newCount) {
        return mo8967m().setCount(element, oldCount, newCount);
    }
}
