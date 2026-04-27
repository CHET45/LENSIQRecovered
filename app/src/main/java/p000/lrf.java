package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,4151:1\n33#2,7:4152\n33#2,7:4159\n33#2,7:4166\n33#2,7:4173\n4551#3,7:4180\n4551#3,7:4187\n4551#3,7:4194\n4551#3,7:4201\n4551#3,7:4208\n4018#4,6:4215\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1078#1:4152,7\n1149#1:4159,7\n1169#1:4166,7\n1196#1:4173,7\n1205#1:4180,7\n1215#1:4187,7\n1225#1:4194,7\n1244#1:4201,7\n1258#1:4208,7\n1311#1:4215,6\n*E\n"})
@e0g(parameters = 0)
public final class lrf {

    /* JADX INFO: renamed from: p */
    public static final int f58551p = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f58552a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final int[] f58553b;

    /* JADX INFO: renamed from: c */
    public final int f58554c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Object[] f58555d;

    /* JADX INFO: renamed from: e */
    public final int f58556e;

    /* JADX INFO: renamed from: f */
    @gib
    public HashMap<C5897fo, qb7> f58557f;

    /* JADX INFO: renamed from: g */
    public boolean f58558g;

    /* JADX INFO: renamed from: h */
    public int f58559h;

    /* JADX INFO: renamed from: i */
    public int f58560i;

    /* JADX INFO: renamed from: j */
    public int f58561j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final v78 f58562k;

    /* JADX INFO: renamed from: l */
    public int f58563l;

    /* JADX INFO: renamed from: m */
    public int f58564m;

    /* JADX INFO: renamed from: n */
    public int f58565n;

    /* JADX INFO: renamed from: o */
    public boolean f58566o;

    public lrf(@yfb mrf mrfVar) {
        this.f58552a = mrfVar;
        this.f58553b = mrfVar.getGroups();
        int groupsSize = mrfVar.getGroupsSize();
        this.f58554c = groupsSize;
        this.f58555d = mrfVar.getSlots();
        this.f58556e = mrfVar.getSlotsSize();
        this.f58560i = groupsSize;
        this.f58561j = -1;
        this.f58562k = new v78();
    }

    public static /* synthetic */ C5897fo anchor$default(lrf lrfVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = lrfVar.f58559h;
        }
        return lrfVar.anchor(i);
    }

    private final Object aux(int[] iArr, int i) {
        return orf.hasAux(iArr, i) ? this.f58555d[orf.auxIndex(iArr, i)] : zl2.f105372a.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if (orf.hasObjectKey(iArr, i)) {
            return this.f58555d[orf.objectKeyIndex(iArr, i)];
        }
        return null;
    }

    @yfb
    public final C5897fo anchor(int i) {
        ArrayList<C5897fo> anchors$runtime_release = this.f58552a.getAnchors$runtime_release();
        int iSearch = orf.search(anchors$runtime_release, i, this.f58554c);
        if (iSearch >= 0) {
            return anchors$runtime_release.get(iSearch);
        }
        C5897fo c5897fo = new C5897fo(i);
        anchors$runtime_release.add(-(iSearch + 1), c5897fo);
        return c5897fo;
    }

    public final void beginEmpty() {
        this.f58563l++;
    }

    public final void close() {
        this.f58558g = true;
        this.f58552a.close$runtime_release(this, this.f58557f);
    }

    public final boolean containsMark(int i) {
        return orf.containsMark(this.f58553b, i);
    }

    public final void endEmpty() {
        if (!(this.f58563l > 0)) {
            a8d.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.f58563l--;
    }

    public final void endGroup() {
        if (this.f58563l == 0) {
            if (!(this.f58559h == this.f58560i)) {
                gm2.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int iParentAnchor = orf.parentAnchor(this.f58553b, this.f58561j);
            this.f58561j = iParentAnchor;
            this.f58560i = iParentAnchor < 0 ? this.f58554c : orf.groupSize(this.f58553b, iParentAnchor) + iParentAnchor;
            int iPop = this.f58562k.pop();
            if (iPop < 0) {
                this.f58564m = 0;
                this.f58565n = 0;
            } else {
                this.f58564m = iPop;
                this.f58565n = iParentAnchor >= this.f58554c - 1 ? this.f58556e : orf.dataAnchor(this.f58553b, iParentAnchor + 1);
            }
        }
    }

    @yfb
    public final List<wq8> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.f58563l > 0) {
            return arrayList;
        }
        int iGroupSize = this.f58559h;
        int i = 0;
        while (iGroupSize < this.f58560i) {
            arrayList.add(new wq8(orf.key(this.f58553b, iGroupSize), objectKey(this.f58553b, iGroupSize), iGroupSize, orf.isNode(this.f58553b, iGroupSize) ? 1 : orf.nodeCount(this.f58553b, iGroupSize), i));
            iGroupSize += orf.groupSize(this.f58553b, iGroupSize);
            i++;
        }
        return arrayList;
    }

    @gib
    public final Object get(int i) {
        int i2 = this.f58564m + i;
        return i2 < this.f58565n ? this.f58555d[i2] : zl2.f105372a.getEmpty();
    }

    public final boolean getClosed() {
        return this.f58558g;
    }

    public final int getCurrentEnd() {
        return this.f58560i;
    }

    public final int getCurrentGroup() {
        return this.f58559h;
    }

    @gib
    public final Object getGroupAux() {
        int i = this.f58559h;
        if (i < this.f58560i) {
            return aux(this.f58553b, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.f58560i;
    }

    public final int getGroupKey() {
        int i = this.f58559h;
        if (i < this.f58560i) {
            return orf.key(this.f58553b, i);
        }
        return 0;
    }

    @gib
    public final Object getGroupNode() {
        int i = this.f58559h;
        if (i < this.f58560i) {
            return node(this.f58553b, i);
        }
        return null;
    }

    @gib
    public final Object getGroupObjectKey() {
        int i = this.f58559h;
        if (i < this.f58560i) {
            return objectKey(this.f58553b, i);
        }
        return null;
    }

    public final int getGroupSize() {
        return orf.groupSize(this.f58553b, this.f58559h);
    }

    public final int getGroupSlotCount() {
        int i = this.f58559h;
        int iSlotAnchor = orf.slotAnchor(this.f58553b, i);
        int i2 = i + 1;
        return (i2 < this.f58554c ? orf.dataAnchor(this.f58553b, i2) : this.f58556e) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.f58564m - orf.slotAnchor(this.f58553b, this.f58561j);
    }

    public final boolean getHadNext() {
        return this.f58566o;
    }

    public final boolean getHasObjectKey() {
        int i = this.f58559h;
        return i < this.f58560i && orf.hasObjectKey(this.f58553b, i);
    }

    public final boolean getInEmpty() {
        return this.f58563l > 0;
    }

    public final int getNodeCount() {
        return orf.nodeCount(this.f58553b, this.f58559h);
    }

    public final int getParent() {
        return this.f58561j;
    }

    public final int getParentNodes() {
        int i = this.f58561j;
        if (i >= 0) {
            return orf.nodeCount(this.f58553b, i);
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.f58565n - this.f58564m;
    }

    public final int getSize() {
        return this.f58554c;
    }

    public final int getSlot() {
        return this.f58564m - orf.slotAnchor(this.f58553b, this.f58561j);
    }

    @yfb
    public final mrf getTable$runtime_release() {
        return this.f58552a;
    }

    @gib
    public final Object groupAux(int i) {
        return aux(this.f58553b, i);
    }

    public final int groupEnd(int i) {
        return i + orf.groupSize(this.f58553b, i);
    }

    @gib
    public final Object groupGet(int i) {
        return groupGet(this.f58559h, i);
    }

    public final int groupKey(int i) {
        return orf.key(this.f58553b, i);
    }

    @gib
    public final Object groupObjectKey(int i) {
        return objectKey(this.f58553b, i);
    }

    public final int groupSize(int i) {
        return orf.groupSize(this.f58553b, i);
    }

    public final boolean hasMark(int i) {
        return orf.hasMark(this.f58553b, i);
    }

    public final boolean hasObjectKey(int i) {
        return orf.hasObjectKey(this.f58553b, i);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.f58559h == this.f58560i;
    }

    public final boolean isNode() {
        return orf.isNode(this.f58553b, this.f58559h);
    }

    @gib
    public final Object next() {
        int i;
        if (this.f58563l > 0 || (i = this.f58564m) >= this.f58565n) {
            this.f58566o = false;
            return zl2.f105372a.getEmpty();
        }
        this.f58566o = true;
        Object[] objArr = this.f58555d;
        this.f58564m = i + 1;
        return objArr[i];
    }

    @gib
    public final Object node(int i) {
        if (orf.isNode(this.f58553b, i)) {
            return node(this.f58553b, i);
        }
        return null;
    }

    public final int nodeCount(int i) {
        return orf.nodeCount(this.f58553b, i);
    }

    public final int parent(int i) {
        return orf.parentAnchor(this.f58553b, i);
    }

    public final int parentOf(int i) {
        if (!(i >= 0 && i < this.f58554c)) {
            a8d.throwIllegalArgumentException("Invalid group index " + i);
        }
        return orf.parentAnchor(this.f58553b, i);
    }

    public final void reposition(int i) {
        if (!(this.f58563l == 0)) {
            gm2.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.f58559h = i;
        int iParentAnchor = i < this.f58554c ? orf.parentAnchor(this.f58553b, i) : -1;
        this.f58561j = iParentAnchor;
        if (iParentAnchor < 0) {
            this.f58560i = this.f58554c;
        } else {
            this.f58560i = iParentAnchor + orf.groupSize(this.f58553b, iParentAnchor);
        }
        this.f58564m = 0;
        this.f58565n = 0;
    }

    public final void restoreParent(int i) {
        int iGroupSize = orf.groupSize(this.f58553b, i) + i;
        int i2 = this.f58559h;
        if (!(i2 >= i && i2 <= iGroupSize)) {
            gm2.composeImmediateRuntimeError("Index " + i + " is not a parent of " + i2);
        }
        this.f58561j = i;
        this.f58560i = iGroupSize;
        this.f58564m = 0;
        this.f58565n = 0;
    }

    public final int skipGroup() {
        if (!(this.f58563l == 0)) {
            gm2.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int iNodeCount = orf.isNode(this.f58553b, this.f58559h) ? 1 : orf.nodeCount(this.f58553b, this.f58559h);
        int i = this.f58559h;
        this.f58559h = i + orf.groupSize(this.f58553b, i);
        return iNodeCount;
    }

    public final void skipToGroupEnd() {
        if (!(this.f58563l == 0)) {
            gm2.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.f58559h = this.f58560i;
        this.f58564m = 0;
        this.f58565n = 0;
    }

    public final void startGroup() {
        qb7 qb7Var;
        if (this.f58563l <= 0) {
            int i = this.f58561j;
            int i2 = this.f58559h;
            if (!(orf.parentAnchor(this.f58553b, i2) == i)) {
                a8d.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<C5897fo, qb7> map = this.f58557f;
            if (map != null && (qb7Var = map.get(anchor(i))) != null) {
                qb7Var.reportGroup(this.f58552a, i2);
            }
            v78 v78Var = this.f58562k;
            int i3 = this.f58564m;
            int i4 = this.f58565n;
            if (i3 == 0 && i4 == 0) {
                v78Var.push(-1);
            } else {
                v78Var.push(i3);
            }
            this.f58561j = i2;
            this.f58560i = orf.groupSize(this.f58553b, i2) + i2;
            int i5 = i2 + 1;
            this.f58559h = i5;
            this.f58564m = orf.slotAnchor(this.f58553b, i2);
            this.f58565n = i2 >= this.f58554c - 1 ? this.f58556e : orf.dataAnchor(this.f58553b, i5);
        }
    }

    public final void startNode() {
        if (this.f58563l <= 0) {
            if (!orf.isNode(this.f58553b, this.f58559h)) {
                a8d.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    @yfb
    public String toString() {
        return "SlotReader(current=" + this.f58559h + ", key=" + getGroupKey() + ", parent=" + this.f58561j + ", end=" + this.f58560i + ')';
    }

    private final Object node(int[] iArr, int i) {
        return orf.isNode(iArr, i) ? this.f58555d[orf.nodeIndex(iArr, i)] : zl2.f105372a.getEmpty();
    }

    @gib
    public final Object groupGet(int i, int i2) {
        int iSlotAnchor = orf.slotAnchor(this.f58553b, i);
        int i3 = i + 1;
        int i4 = iSlotAnchor + i2;
        return i4 < (i3 < this.f58554c ? orf.dataAnchor(this.f58553b, i3) : this.f58556e) ? this.f58555d[i4] : zl2.f105372a.getEmpty();
    }

    public final int groupKey(@yfb C5897fo c5897fo) {
        if (c5897fo.getValid()) {
            return orf.key(this.f58553b, this.f58552a.anchorIndex(c5897fo));
        }
        return 0;
    }

    public final boolean isNode(int i) {
        return orf.isNode(this.f58553b, i);
    }
}
