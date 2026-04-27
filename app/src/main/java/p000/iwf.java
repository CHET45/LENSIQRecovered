package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n33#2,6:4152\n1#3:4158\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3681#1:4152,6\n*E\n"})
public final class iwf implements Iterable<Object>, Iterator<Object>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f48724a;

    /* JADX INFO: renamed from: b */
    public final int f48725b;

    /* JADX INFO: renamed from: c */
    public final int f48726c;

    /* JADX INFO: renamed from: d */
    public final int f48727d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final h31 f48728e;

    /* JADX INFO: renamed from: f */
    public int f48729f;

    public iwf(@yfb mrf mrfVar, int i, @yfb qb7 qb7Var) {
        this.f48724a = mrfVar;
        int iDataAnchor = orf.dataAnchor(mrfVar.getGroups(), i);
        this.f48725b = iDataAnchor;
        this.f48726c = qb7Var.getDataStartOffset();
        int dataEndOffset = qb7Var.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i2 = i + 1;
            dataEndOffset = (i2 < mrfVar.getGroupsSize() ? orf.dataAnchor(mrfVar.getGroups(), i2) : mrfVar.getSlotsSize()) - iDataAnchor;
        }
        this.f48727d = dataEndOffset;
        h31 h31Var = new h31();
        ArrayList<Object> groups = qb7Var.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = groups.get(i3);
                if (obj instanceof qb7) {
                    qb7 qb7Var2 = (qb7) obj;
                    h31Var.setRange(qb7Var2.getDataStartOffset(), qb7Var2.getDataEndOffset());
                }
            }
        }
        this.f48728e = h31Var;
        this.f48729f = h31Var.nextClear(this.f48726c);
    }

    @yfb
    public final mrf getTable() {
        return this.f48724a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48729f < this.f48727d;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @gib
    public Object next() {
        int i = this.f48727d;
        int i2 = this.f48729f;
        Object obj = (i2 < 0 || i2 >= i) ? null : this.f48724a.getSlots()[this.f48725b + this.f48729f];
        this.f48729f = this.f48728e.nextClear(this.f48729f + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
