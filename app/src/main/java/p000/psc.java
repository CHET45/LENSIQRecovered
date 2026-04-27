package p000;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class psc<T> extends AbstractC7718j2<T> implements ListIterator<T>, zo8 {

    /* JADX INFO: renamed from: C */
    public static final int f71933C = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nsc<T> f71934d;

    /* JADX INFO: renamed from: e */
    public int f71935e;

    /* JADX INFO: renamed from: f */
    @gib
    public mih<? extends T> f71936f;

    /* JADX INFO: renamed from: m */
    public int f71937m;

    public psc(@yfb nsc<T> nscVar, int i) {
        super(i, nscVar.size());
        this.f71934d = nscVar;
        this.f71935e = nscVar.getModCount$runtime_release();
        this.f71937m = -1;
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.f71935e != this.f71934d.getModCount$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if (this.f71937m == -1) {
            throw new IllegalStateException();
        }
    }

    private final void reset() {
        setSize(this.f71934d.size());
        this.f71935e = this.f71934d.getModCount$runtime_release();
        this.f71937m = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] root$runtime_release = this.f71934d.getRoot$runtime_release();
        if (root$runtime_release == null) {
            this.f71936f = null;
            return;
        }
        int iRootSize = j1i.rootSize(this.f71934d.size());
        int iCoerceAtMost = kpd.coerceAtMost(getIndex(), iRootSize);
        int rootShift$runtime_release = (this.f71934d.getRootShift$runtime_release() / 5) + 1;
        mih<? extends T> mihVar = this.f71936f;
        if (mihVar == null) {
            this.f71936f = new mih<>(root$runtime_release, iCoerceAtMost, iRootSize, rootShift$runtime_release);
        } else {
            md8.checkNotNull(mihVar);
            mihVar.reset$runtime_release(root$runtime_release, iCoerceAtMost, iRootSize, rootShift$runtime_release);
        }
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator
    public void add(T t) {
        checkForComodification();
        this.f71934d.add(getIndex(), t);
        setIndex(getIndex() + 1);
        reset();
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        checkHasNext$runtime_release();
        this.f71937m = getIndex();
        mih<? extends T> mihVar = this.f71936f;
        if (mihVar == null) {
            Object[] tail$runtime_release = this.f71934d.getTail$runtime_release();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime_release[index];
        }
        if (mihVar.hasNext()) {
            setIndex(getIndex() + 1);
            return mihVar.next();
        }
        Object[] tail$runtime_release2 = this.f71934d.getTail$runtime_release();
        int index2 = getIndex();
        setIndex(index2 + 1);
        return (T) tail$runtime_release2[index2 - mihVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkForComodification();
        checkHasPrevious$runtime_release();
        this.f71937m = getIndex() - 1;
        mih<? extends T> mihVar = this.f71936f;
        if (mihVar == null) {
            Object[] tail$runtime_release = this.f71934d.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release[getIndex()];
        }
        if (getIndex() <= mihVar.getSize()) {
            setIndex(getIndex() - 1);
            return mihVar.previous();
        }
        Object[] tail$runtime_release2 = this.f71934d.getTail$runtime_release();
        setIndex(getIndex() - 1);
        return (T) tail$runtime_release2[getIndex() - mihVar.getSize()];
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.f71934d.remove(this.f71937m);
        if (this.f71937m < getIndex()) {
            setIndex(this.f71937m);
        }
        reset();
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator
    public void set(T t) {
        checkForComodification();
        checkHasIterated();
        this.f71934d.set(this.f71937m, t);
        this.f71935e = this.f71934d.getModCount$runtime_release();
        setupTrieIterator();
    }
}
