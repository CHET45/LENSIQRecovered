package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class mih<E> extends AbstractC7718j2<E> {

    /* JADX INFO: renamed from: m */
    public static final int f61086m = 8;

    /* JADX INFO: renamed from: d */
    public int f61087d;

    /* JADX INFO: renamed from: e */
    @yfb
    public Object[] f61088e;

    /* JADX INFO: renamed from: f */
    public boolean f61089f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public mih(@yfb Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f61087d = i3;
        Object[] objArr2 = new Object[i3];
        this.f61088e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f61089f = r5;
        objArr2[0] = objArr;
        fillPath(i - r5, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.f61088e[this.f61087d - 1];
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void fillPath(int i, int i2) {
        int i3 = (this.f61087d - i2) * 5;
        while (i2 < this.f61087d) {
            Object[] objArr = this.f61088e;
            Object obj = objArr[i2 - 1];
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[j1i.indexSegment(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void fillPathIfNeeded(int i) {
        int i2 = 0;
        while (j1i.indexSegment(getIndex(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            fillPath(getIndex(), ((this.f61087d - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // p000.AbstractC7718j2, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eElementAtCurrentIndex = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.f61089f = true;
            return eElementAtCurrentIndex;
        }
        fillPathIfNeeded(0);
        return eElementAtCurrentIndex;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.f61089f) {
            this.f61089f = false;
            return elementAtCurrentIndex();
        }
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(@yfb Object[] objArr, int i, int i2, int i3) {
        setIndex(i);
        setSize(i2);
        this.f61087d = i3;
        if (this.f61088e.length < i3) {
            this.f61088e = new Object[i3];
        }
        this.f61088e[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.f61089f = r0;
        fillPath(i - r0, 1);
    }
}
