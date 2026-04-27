package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class k60<T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T[] f52618a;

    /* JADX INFO: renamed from: b */
    public int f52619b;

    public k60(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        this.f52618a = tArr;
    }

    @yfb
    public final T[] getArray() {
        return this.f52618a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52619b < this.f52618a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f52618a;
            int i = this.f52619b;
            this.f52619b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f52619b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
