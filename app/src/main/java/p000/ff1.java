package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ff1<T> extends AbstractC7718j2<T> {

    /* JADX INFO: renamed from: e */
    public static final int f36344e = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public final T[] f36345d;

    public ff1(@yfb T[] tArr, int i, int i2) {
        super(i, i2);
        this.f36345d = tArr;
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f36345d;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f36345d;
        setIndex(getIndex() - 1);
        return tArr[getIndex()];
    }
}
