package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class hlf<E> extends AbstractC7718j2<E> {

    /* JADX INFO: renamed from: e */
    public static final int f44092e = 0;

    /* JADX INFO: renamed from: d */
    public final E f44093d;

    public hlf(E e, int i) {
        super(i, 1);
        this.f44093d = e;
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime_release();
        setIndex(getIndex() + 1);
        return this.f44093d;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime_release();
        setIndex(getIndex() - 1);
        return this.f44093d;
    }
}
