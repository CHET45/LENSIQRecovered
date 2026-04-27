package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class l0b<E> extends AbstractC7110i2<E> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<E> f55854a;

    /* JADX INFO: renamed from: b */
    public int f55855b;

    /* JADX INFO: renamed from: c */
    public int f55856c;

    /* JADX WARN: Multi-variable type inference failed */
    public l0b(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "list");
        this.f55854a = list;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public E get(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f55856c);
        return this.f55854a.get(this.f55855b + i);
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f55856c;
    }

    public final void move(int i, int i2) {
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.f55854a.size());
        this.f55855b = i;
        this.f55856c = i2 - i;
    }
}
