package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class osc<T> extends AbstractC7718j2<T> {

    /* JADX INFO: renamed from: f */
    public static final int f68573f = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public final T[] f68574d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final mih<T> f68575e;

    public osc(@yfb Object[] objArr, @yfb T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.f68574d = tArr;
        int iRootSize = j1i.rootSize(i2);
        this.f68575e = new mih<>(objArr, kpd.coerceAtMost(i, iRootSize), iRootSize, i3);
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime_release();
        if (this.f68575e.hasNext()) {
            setIndex(getIndex() + 1);
            return this.f68575e.next();
        }
        T[] tArr = this.f68574d;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.f68575e.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime_release();
        if (getIndex() <= this.f68575e.getSize()) {
            setIndex(getIndex() - 1);
            return this.f68575e.previous();
        }
        T[] tArr = this.f68574d;
        setIndex(getIndex() - 1);
        return tArr[getIndex() - this.f68575e.getSize()];
    }
}
