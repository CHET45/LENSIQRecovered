package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.ky7;

/* JADX INFO: loaded from: classes5.dex */
public class qy7<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final ky7<T, Void> f76300a;

    /* JADX INFO: renamed from: qy7$a */
    public static class C11763a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<T, Void>> f76301a;

        public C11763a(Iterator<Map.Entry<T, Void>> it) {
            this.f76301a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76301a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f76301a.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f76301a.remove();
        }
    }

    public qy7(List<T> list, Comparator<T> comparator) {
        this.f76300a = ky7.C8553a.buildFrom(list, Collections.emptyMap(), ky7.C8553a.identityTranslator(), comparator);
    }

    public boolean contains(T t) {
        return this.f76300a.containsKey(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qy7) {
            return this.f76300a.equals(((qy7) obj).f76300a);
        }
        return false;
    }

    public T getMaxEntry() {
        return this.f76300a.getMaxKey();
    }

    public T getMinEntry() {
        return this.f76300a.getMinKey();
    }

    public T getPredecessorEntry(T t) {
        return this.f76300a.getPredecessorKey(t);
    }

    public int hashCode() {
        return this.f76300a.hashCode();
    }

    public int indexOf(T t) {
        return this.f76300a.indexOf(t);
    }

    public qy7<T> insert(T t) {
        return new qy7<>(this.f76300a.insert(t, null));
    }

    public boolean isEmpty() {
        return this.f76300a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C11763a(this.f76300a.iterator());
    }

    public Iterator<T> iteratorFrom(T t) {
        return new C11763a(this.f76300a.iteratorFrom(t));
    }

    public qy7<T> remove(T t) {
        ky7<T, Void> ky7VarRemove = this.f76300a.remove(t);
        return ky7VarRemove == this.f76300a ? this : new qy7<>(ky7VarRemove);
    }

    public Iterator<T> reverseIterator() {
        return new C11763a(this.f76300a.reverseIterator());
    }

    public Iterator<T> reverseIteratorFrom(T t) {
        return new C11763a(this.f76300a.reverseIteratorFrom(t));
    }

    public int size() {
        return this.f76300a.size();
    }

    public qy7<T> unionWith(qy7<T> qy7Var) {
        qy7<T> qy7VarInsert;
        if (size() < qy7Var.size()) {
            qy7VarInsert = qy7Var;
            qy7Var = this;
        } else {
            qy7VarInsert = this;
        }
        Iterator<T> it = qy7Var.iterator();
        while (it.hasNext()) {
            qy7VarInsert = qy7VarInsert.insert(it.next());
        }
        return qy7VarInsert;
    }

    private qy7(ky7<T, Void> ky7Var) {
        this.f76300a = ky7Var;
    }
}
