package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4151:1\n158#2,8:4152\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3522#1:4152,8\n*E\n"})
public final class nrf implements gn2, Iterable<gn2>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f65397a;

    /* JADX INFO: renamed from: b */
    public final int f65398b;

    /* JADX INFO: renamed from: c */
    public final int f65399c;

    public nrf(@yfb mrf mrfVar, int i, int i2) {
        this.f65397a = mrfVar;
        this.f65398b = i;
        this.f65399c = i2;
    }

    private static final gn2 find$findAnchoredGroup(nrf nrfVar, C5897fo c5897fo) {
        int iAnchorIndex;
        int i;
        if (!nrfVar.f65397a.ownsAnchor(c5897fo) || (iAnchorIndex = nrfVar.f65397a.anchorIndex(c5897fo)) < (i = nrfVar.f65398b) || iAnchorIndex - i >= orf.groupSize(nrfVar.f65397a.getGroups(), nrfVar.f65398b)) {
            return null;
        }
        return new nrf(nrfVar.f65397a, iAnchorIndex, nrfVar.f65399c);
    }

    private static final gn2 find$findRelativeGroup(gn2 gn2Var, int i) {
        return (gn2) v82.firstOrNull(v82.drop(gn2Var.getCompositionGroups(), i));
    }

    private final void validateRead() {
        if (this.f65397a.getVersion$runtime_release() != this.f65399c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p000.fn2
    @gib
    public gn2 find(@yfb Object obj) {
        if (obj instanceof C5897fo) {
            return find$findAnchoredGroup(this, (C5897fo) obj);
        }
        if (obj instanceof mwf) {
            mwf mwfVar = (mwf) obj;
            gn2 gn2VarFind = find(mwfVar.getParentIdentity());
            if (gn2VarFind != null) {
                return find$findRelativeGroup(gn2VarFind, mwfVar.getIndex());
            }
        }
        return null;
    }

    @Override // p000.fn2
    @yfb
    public Iterable<gn2> getCompositionGroups() {
        return this;
    }

    @Override // p000.gn2
    @yfb
    public Iterable<Object> getData() {
        qb7 qb7VarSourceInformationOf = this.f65397a.sourceInformationOf(this.f65398b);
        return qb7VarSourceInformationOf != null ? new iwf(this.f65397a, this.f65398b, qb7VarSourceInformationOf) : new sg3(this.f65397a, this.f65398b);
    }

    public final int getGroup() {
        return this.f65398b;
    }

    @Override // p000.gn2
    public int getGroupSize() {
        return orf.groupSize(this.f65397a.getGroups(), this.f65398b);
    }

    @Override // p000.gn2
    @yfb
    public Object getIdentity() {
        validateRead();
        lrf lrfVarOpenReader = this.f65397a.openReader();
        try {
            return lrfVarOpenReader.anchor(this.f65398b);
        } finally {
            lrfVarOpenReader.close();
        }
    }

    @Override // p000.gn2
    @yfb
    public Object getKey() {
        if (!orf.hasObjectKey(this.f65397a.getGroups(), this.f65398b)) {
            return Integer.valueOf(orf.key(this.f65397a.getGroups(), this.f65398b));
        }
        Object obj = this.f65397a.getSlots()[orf.objectKeyIndex(this.f65397a.getGroups(), this.f65398b)];
        md8.checkNotNull(obj);
        return obj;
    }

    @Override // p000.gn2
    @gib
    public Object getNode() {
        if (orf.isNode(this.f65397a.getGroups(), this.f65398b)) {
            return this.f65397a.getSlots()[orf.nodeIndex(this.f65397a.getGroups(), this.f65398b)];
        }
        return null;
    }

    @Override // p000.gn2
    public int getSlotsSize() {
        int groupSize = this.f65398b + getGroupSize();
        return (groupSize < this.f65397a.getGroupsSize() ? orf.dataAnchor(this.f65397a.getGroups(), groupSize) : this.f65397a.getSlotsSize()) - orf.dataAnchor(this.f65397a.getGroups(), this.f65398b);
    }

    @Override // p000.gn2
    @gib
    public String getSourceInfo() {
        if (orf.hasAux(this.f65397a.getGroups(), this.f65398b)) {
            Object obj = this.f65397a.getSlots()[orf.auxIndex(this.f65397a.getGroups(), this.f65398b)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        qb7 qb7VarSourceInformationOf = this.f65397a.sourceInformationOf(this.f65398b);
        if (qb7VarSourceInformationOf != null) {
            return qb7VarSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    @yfb
    public final mrf getTable() {
        return this.f65397a;
    }

    public final int getVersion() {
        return this.f65399c;
    }

    @Override // p000.fn2
    public boolean isEmpty() {
        return orf.groupSize(this.f65397a.getGroups(), this.f65398b) == 0;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<gn2> iterator() {
        validateRead();
        qb7 qb7VarSourceInformationOf = this.f65397a.sourceInformationOf(this.f65398b);
        if (qb7VarSourceInformationOf != null) {
            mrf mrfVar = this.f65397a;
            int i = this.f65398b;
            return new jwf(mrfVar, i, qb7VarSourceInformationOf, new C7988jo(i));
        }
        mrf mrfVar2 = this.f65397a;
        int i2 = this.f65398b;
        return new ob7(mrfVar2, i2 + 1, i2 + orf.groupSize(mrfVar2.getGroups(), this.f65398b));
    }

    public /* synthetic */ nrf(mrf mrfVar, int i, int i2, int i3, jt3 jt3Var) {
        this(mrfVar, i, (i3 & 4) != 0 ? mrfVar.getVersion$runtime_release() : i2);
    }
}
