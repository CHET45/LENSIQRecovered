package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class sg3 implements Iterable<Object>, Iterator<Object>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f81704a;

    /* JADX INFO: renamed from: b */
    public final int f81705b;

    /* JADX INFO: renamed from: c */
    public final int f81706c;

    /* JADX INFO: renamed from: d */
    public int f81707d;

    public sg3(@yfb mrf mrfVar, int i) {
        this.f81704a = mrfVar;
        int iDataAnchor = orf.dataAnchor(mrfVar.getGroups(), i);
        this.f81705b = iDataAnchor;
        int i2 = i + 1;
        this.f81706c = i2 < mrfVar.getGroupsSize() ? orf.dataAnchor(mrfVar.getGroups(), i2) : mrfVar.getSlotsSize();
        this.f81707d = iDataAnchor;
    }

    public final int getEnd() {
        return this.f81706c;
    }

    public final int getIndex() {
        return this.f81707d;
    }

    public final int getStart() {
        return this.f81705b;
    }

    @yfb
    public final mrf getTable() {
        return this.f81704a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81707d < this.f81706c;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @gib
    public Object next() {
        int i = this.f81707d;
        Object obj = (i < 0 || i >= this.f81704a.getSlots().length) ? null : this.f81704a.getSlots()[this.f81707d];
        this.f81707d++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.f81707d = i;
    }
}
