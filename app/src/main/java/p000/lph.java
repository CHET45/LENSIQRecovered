package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public final class lph implements Iterator<woh>, uo8 {

    /* JADX INFO: renamed from: a */
    public final int f58437a;

    /* JADX INFO: renamed from: b */
    public boolean f58438b;

    /* JADX INFO: renamed from: c */
    public final int f58439c;

    /* JADX INFO: renamed from: d */
    public int f58440d;

    public /* synthetic */ lph(int i, int i2, int i3, jt3 jt3Var) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58438b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ woh next() {
        return woh.m32998boximpl(m30883nextpVg5ArA());
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m30883nextpVg5ArA() {
        int i = this.f58440d;
        if (i != this.f58437a) {
            this.f58440d = woh.m33004constructorimpl(this.f58439c + i);
        } else {
            if (!this.f58438b) {
                throw new NoSuchElementException();
            }
            this.f58438b = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private lph(int i, int i2, int i3) {
        this.f58437a = i2;
        boolean z = false;
        int iCompareUnsigned = Integer.compareUnsigned(i, i2);
        if (i3 <= 0 ? iCompareUnsigned >= 0 : iCompareUnsigned <= 0) {
            z = true;
        }
        this.f58438b = z;
        this.f58439c = woh.m33004constructorimpl(i3);
        this.f58440d = this.f58438b ? i : i2;
    }
}
