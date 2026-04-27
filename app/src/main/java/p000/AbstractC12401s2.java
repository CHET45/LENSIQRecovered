package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.d4b;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class AbstractC12401s2<E> extends AbstractC4593d3<E> implements Serializable {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public transient qjb<E> f80399c;

    /* JADX INFO: renamed from: d */
    public transient long f80400d;

    /* JADX INFO: renamed from: s2$a */
    public class a extends AbstractC12401s2<E>.c<E> {
        public a() {
            super();
        }

        @Override // p000.AbstractC12401s2.c
        @dgc
        /* JADX INFO: renamed from: a */
        public E mo21654a(int entryIndex) {
            return AbstractC12401s2.this.f80399c.m20390f(entryIndex);
        }
    }

    /* JADX INFO: renamed from: s2$b */
    public class b extends AbstractC12401s2<E>.c<d4b.InterfaceC4612a<E>> {
        public b() {
            super();
        }

        @Override // p000.AbstractC12401s2.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d4b.InterfaceC4612a<E> mo21654a(int entryIndex) {
            return AbstractC12401s2.this.f80399c.m20389e(entryIndex);
        }
    }

    /* JADX INFO: renamed from: s2$c */
    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f80403a;

        /* JADX INFO: renamed from: b */
        public int f80404b = -1;

        /* JADX INFO: renamed from: c */
        public int f80405c;

        public c() {
            this.f80403a = AbstractC12401s2.this.f80399c.mo20388d();
            this.f80405c = AbstractC12401s2.this.f80399c.f74617d;
        }

        private void checkForConcurrentModification() {
            if (AbstractC12401s2.this.f80399c.f74617d != this.f80405c) {
                throw new ConcurrentModificationException();
            }
        }

        @dgc
        /* JADX INFO: renamed from: a */
        public abstract T mo21654a(int entryIndex);

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.f80403a >= 0;
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tMo21654a = mo21654a(this.f80403a);
            int i = this.f80403a;
            this.f80404b = i;
            this.f80403a = AbstractC12401s2.this.f80399c.mo20396l(i);
            return tMo21654a;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            s72.m21768e(this.f80404b != -1);
            AbstractC12401s2 abstractC12401s2 = AbstractC12401s2.this;
            abstractC12401s2.f80400d -= (long) abstractC12401s2.f80399c.m20398n(this.f80404b);
            this.f80403a = AbstractC12401s2.this.f80399c.mo20397m(this.f80403a, this.f80404b);
            this.f80404b = -1;
            this.f80405c = AbstractC12401s2.this.f80399c.f74617d;
        }
    }

    public AbstractC12401s2(int distinctElements) {
        this.f80399c = mo21653f(distinctElements);
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int iM2797h = b1f.m2797h(stream);
        this.f80399c = mo21653f(3);
        b1f.m2796g(this, stream, iM2797h);
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        b1f.m2800k(this, stream);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public final int add(@dgc E element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        v7d.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iM20392h = this.f80399c.m20392h(element);
        if (iM20392h == -1) {
            this.f80399c.put(element, occurrences);
            this.f80400d += (long) occurrences;
            return 0;
        }
        int iM20391g = this.f80399c.m20391g(iM20392h);
        long j = occurrences;
        long j2 = ((long) iM20391g) + j;
        v7d.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.f80399c.m20400p(iM20392h, (int) j2);
        this.f80400d += j;
        return iM20391g;
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: b */
    public final int mo2917b() {
        return this.f80399c.m20401q();
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: c */
    public final Iterator<E> mo2918c() {
        return new a();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f80399c.clear();
        this.f80400d = 0L;
    }

    @Override // p000.d4b
    public final int count(@wx1 Object element) {
        return this.f80399c.get(element);
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: d */
    public final Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public void m21652e(d4b<? super E> d4bVar) {
        v7d.checkNotNull(d4bVar);
        int iMo20388d = this.f80399c.mo20388d();
        while (iMo20388d >= 0) {
            d4bVar.add(this.f80399c.m20390f(iMo20388d), this.f80399c.m20391g(iMo20388d));
            iMo20388d = this.f80399c.mo20396l(iMo20388d);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract qjb<E> mo21653f(int distinctElements);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
    public final Iterator<E> iterator() {
        return e4b.m9662f(this);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public final int remove(@wx1 Object element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        v7d.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iM20392h = this.f80399c.m20392h(element);
        if (iM20392h == -1) {
            return 0;
        }
        int iM20391g = this.f80399c.m20391g(iM20392h);
        if (iM20391g > occurrences) {
            this.f80399c.m20400p(iM20392h, iM20391g - occurrences);
        } else {
            this.f80399c.m20398n(iM20392h);
            occurrences = iM20391g;
        }
        this.f80400d -= (long) occurrences;
        return iM20391g;
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public final int setCount(@dgc E element, int count) {
        s72.m21765b(count, "count");
        qjb<E> qjbVar = this.f80399c;
        int iRemove = count == 0 ? qjbVar.remove(element) : qjbVar.put(element, count);
        this.f80400d += (long) (count - iRemove);
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public final int size() {
        return rd8.saturatedCast(this.f80400d);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public final boolean setCount(@dgc E element, int oldCount, int newCount) {
        s72.m21765b(oldCount, "oldCount");
        s72.m21765b(newCount, "newCount");
        int iM20392h = this.f80399c.m20392h(element);
        if (iM20392h == -1) {
            if (oldCount != 0) {
                return false;
            }
            if (newCount > 0) {
                this.f80399c.put(element, newCount);
                this.f80400d += (long) newCount;
            }
            return true;
        }
        if (this.f80399c.m20391g(iM20392h) != oldCount) {
            return false;
        }
        if (newCount == 0) {
            this.f80399c.m20398n(iM20392h);
            this.f80400d -= (long) oldCount;
        } else {
            this.f80399c.m20400p(iM20392h, newCount);
            this.f80400d += (long) (newCount - oldCount);
        }
        return true;
    }
}
