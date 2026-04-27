package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n158#1,8:4237\n174#1,5:4245\n180#1,3:4257\n1#2:4152\n1#2:4256\n4551#3,7:4153\n4551#3,7:4160\n4551#3,7:4167\n4551#3,7:4187\n4551#3,7:4194\n4551#3,7:4208\n4551#3,7:4215\n4551#3,7:4222\n33#4,7:4174\n33#4,7:4201\n33#4,7:4230\n50#4,7:4260\n50#4,7:4267\n33#4,7:4278\n33#4,7:4285\n33#4,7:4293\n33#4,7:4300\n50#4,7:4307\n50#4,7:4314\n50#4,7:4321\n50#4,7:4328\n50#4,7:4335\n50#4,7:4342\n50#4,7:4349\n50#4,7:4356\n50#4,7:4363\n50#4,7:4370\n50#4,7:4377\n33#4,7:4388\n33#4,7:4395\n4018#5,6:4181\n89#6:4229\n33#7,6:4250\n33#7,4:4274\n38#7:4292\n33#7,4:4384\n38#7:4402\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n357#1:4237,8\n394#1:4245,5\n394#1:4257,3\n394#1:4256\n203#1:4153,7\n204#1:4160,7\n220#1:4167,7\n233#1:4187,7\n244#1:4194,7\n264#1:4208,7\n265#1:4215,7\n277#1:4222,7\n221#1:4174,7\n245#1:4201,7\n306#1:4230,7\n513#1:4260,7\n520#1:4267,7\n529#1:4278,7\n532#1:4285,7\n555#1:4293,7\n558#1:4300,7\n451#1:4307,7\n456#1:4314,7\n459#1:4321,7\n465#1:4328,7\n468#1:4335,7\n472#1:4342,7\n478#1:4349,7\n482#1:4356,7\n491#1:4363,7\n496#1:4370,7\n501#1:4377,7\n541#1:4388,7\n544#1:4395,7\n224#1:4181,6\n280#1:4229\n396#1:4250,6\n527#1:4274,4\n527#1:4292\n538#1:4384,4\n538#1:4402\n*E\n"})
@e0g(parameters = 0)
public final class mrf implements fn2, Iterable<gn2>, uo8 {

    /* JADX INFO: renamed from: L */
    public static final int f61846L = 8;

    /* JADX INFO: renamed from: F */
    @gib
    public HashMap<C5897fo, qb7> f61848F;

    /* JADX INFO: renamed from: H */
    @gib
    public i5b<j5b> f61849H;

    /* JADX INFO: renamed from: b */
    public int f61851b;

    /* JADX INFO: renamed from: d */
    public int f61853d;

    /* JADX INFO: renamed from: e */
    public int f61854e;

    /* JADX INFO: renamed from: f */
    public boolean f61855f;

    /* JADX INFO: renamed from: m */
    public int f61856m;

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f61850a = new int[0];

    /* JADX INFO: renamed from: c */
    @yfb
    public Object[] f61852c = new Object[0];

    /* JADX INFO: renamed from: C */
    @yfb
    public ArrayList<C5897fo> f61847C = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return orf.dataAnchors(this.f61850a, this.f61851b * 5);
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(c0b.f15434d);
        qb7 qb7VarSourceInformationOf = sourceInformationOf(i);
        if (qb7VarSourceInformationOf != null && (sourceInformation = qb7VarSourceInformationOf.getSourceInformation()) != null && (h9g.startsWith$default(sourceInformation, "C(", false, 2, null) || h9g.startsWith$default(sourceInformation, "CC(", false, 2, null))) {
            int iIndexOf$default = m9g.indexOf$default((CharSequence) sourceInformation, c0b.f15433c, 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = m9g.indexOf$default((CharSequence) sourceInformation, ')', 0, false, 6, (Object) null);
            sb.append(C2473f.f17566z);
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(orf.key(this.f61850a, i));
        int iGroupSize = orf.groupSize(this.f61850a, i);
        sb.append(", nodes=");
        sb.append(orf.nodeCount(this.f61850a, i));
        sb.append(", size=");
        sb.append(iGroupSize);
        if (orf.hasMark(this.f61850a, i)) {
            sb.append(", mark");
        }
        if (orf.containsMark(this.f61850a, i)) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int iEmitGroup = i + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.f61853d) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (orf.hasObjectKey(this.f61850a, i)) {
                sb.append(" objectKey=" + orf.summarize(String.valueOf(this.f61852c[orf.objectKeyIndex(this.f61850a, i)]), 10));
            }
            if (orf.isNode(this.f61850a, i)) {
                sb.append(" node=" + orf.summarize(String.valueOf(this.f61852c[orf.nodeIndex(this.f61850a, i)]), 10));
            }
            if (orf.hasAux(this.f61850a, i)) {
                sb.append(" aux=" + orf.summarize(String.valueOf(this.f61852c[orf.auxIndex(this.f61850a, i)]), 10));
            }
            int iSlotAnchor = orf.slotAnchor(this.f61850a, i);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i4 = iSlotAnchor; i4 < iEmitGroup$dataIndex2; i4++) {
                    if (i4 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(orf.summarize(String.valueOf(this.f61852c[i4]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i5 = i + iGroupSize;
        while (iEmitGroup < i5) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i2 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(mrf mrfVar, int i) {
        return i >= mrfVar.f61851b ? mrfVar.f61853d : orf.dataAnchor(mrfVar.f61850a, i);
    }

    private final ssd findEffectiveRecomposeScope(int i) {
        int iParentAnchor = i;
        while (iParentAnchor > 0) {
            for (Object obj : new sg3(this, iParentAnchor)) {
                if (obj instanceof ssd) {
                    ssd ssdVar = (ssd) obj;
                    if (ssdVar.getUsed() && iParentAnchor != i) {
                        return ssdVar;
                    }
                    ssdVar.setForcedRecompose(true);
                }
            }
            iParentAnchor = orf.parentAnchor(this.f61850a, iParentAnchor);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return orf.groupSizes(this.f61850a, this.f61851b * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(lrf lrfVar, j5b j5bVar, List<C5897fo> list, jvd.C8114a c8114a, mrf mrfVar, List<ssd> list2) {
        ssd ssdVarFindEffectiveRecomposeScope;
        int groupKey = lrfVar.getGroupKey();
        if (!j5bVar.contains(groupKey)) {
            lrfVar.startGroup();
            while (!lrfVar.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(lrfVar, j5bVar, list, c8114a, mrfVar, list2);
            }
            lrfVar.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(lrf.anchor$default(lrfVar, 0, 1, null));
        }
        if (c8114a.f52103a) {
            ssd ssdVarFindEffectiveRecomposeScope2 = mrfVar.findEffectiveRecomposeScope(lrfVar.getCurrentGroup());
            if (ssdVarFindEffectiveRecomposeScope2 != null) {
                list2.add(ssdVarFindEffectiveRecomposeScope2);
                C5897fo anchor = ssdVarFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation$runtime_release() == lrfVar.getCurrentGroup() && (ssdVarFindEffectiveRecomposeScope = mrfVar.findEffectiveRecomposeScope(lrfVar.getParent())) != null) {
                    list2.add(ssdVarFindEffectiveRecomposeScope);
                }
            } else {
                c8114a.f52103a = false;
                list2.clear();
            }
        }
        lrfVar.skipGroup();
    }

    private final List<Integer> keys() {
        return orf.keys(this.f61850a, this.f61851b * 5);
    }

    private final List<Integer> nodes() {
        return orf.nodeCounts(this.f61850a, this.f61851b * 5);
    }

    private final List<Integer> parentIndexes() {
        return orf.parentAnchors(this.f61850a, this.f61851b * 5);
    }

    private final C5897fo tryAnchor(int i) {
        int i2;
        if (this.f61855f) {
            gm2.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i < 0 || i >= (i2 = this.f61851b)) {
            return null;
        }
        return orf.find(this.f61847C, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static final int verifyWellFormed$validateGroup(jvd.C8119f c8119f, mrf mrfVar, int i, int i2) {
        int i3 = c8119f.f52108a;
        int i4 = i3 + 1;
        c8119f.f52108a = i4;
        int iParentAnchor = orf.parentAnchor(mrfVar.f61850a, i3);
        if ((iParentAnchor == i) == false) {
            a8d.throwIllegalStateException("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + iParentAnchor);
        }
        int iGroupSize = orf.groupSize(mrfVar.f61850a, i3) + i3;
        if ((iGroupSize <= mrfVar.f61851b) == false) {
            a8d.throwIllegalStateException("A group extends past the end of the table at " + i3);
        }
        if ((iGroupSize <= i2) == false) {
            a8d.throwIllegalStateException("A group extends past its parent group at " + i3);
        }
        int iDataAnchor = orf.dataAnchor(mrfVar.f61850a, i3);
        int iDataAnchor2 = i3 >= mrfVar.f61851b - 1 ? mrfVar.f61853d : orf.dataAnchor(mrfVar.f61850a, i4);
        if ((iDataAnchor2 <= mrfVar.f61852c.length) == false) {
            a8d.throwIllegalStateException("Slots for " + i3 + " extend past the end of the slot table");
        }
        if ((iDataAnchor <= iDataAnchor2) == false) {
            a8d.throwIllegalStateException("Invalid data anchor at " + i3);
        }
        if ((orf.slotAnchor(mrfVar.f61850a, i3) <= iDataAnchor2) == false) {
            a8d.throwIllegalStateException("Slots start out of range at " + i3);
        }
        if ((iDataAnchor2 - iDataAnchor >= ((orf.isNode(mrfVar.f61850a, i3) ? 1 : 0) + (orf.hasObjectKey(mrfVar.f61850a, i3) ? 1 : 0)) + (orf.hasAux(mrfVar.f61850a, i3) ? 1 : 0)) == false) {
            a8d.throwIllegalStateException("Not enough slots added for group " + i3);
        }
        boolean zIsNode = orf.isNode(mrfVar.f61850a, i3);
        if (((zIsNode && mrfVar.f61852c[orf.nodeIndex(mrfVar.f61850a, i3)] == null) ? false : true) == false) {
            a8d.throwIllegalStateException("No node recorded for a node group at " + i3);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (c8119f.f52108a < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(c8119f, mrfVar, i3, iGroupSize);
        }
        int iNodeCount = orf.nodeCount(mrfVar.f61850a, i3);
        int iGroupSize2 = orf.groupSize(mrfVar.f61850a, i3);
        if ((iNodeCount == iVerifyWellFormed$validateGroup) == false) {
            a8d.throwIllegalStateException("Incorrect node count detected at " + i3 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup);
        }
        int i5 = c8119f.f52108a - i3;
        if ((iGroupSize2 == i5) == false) {
            a8d.throwIllegalStateException("Incorrect slot count detected at " + i3 + ", expected " + iGroupSize2 + ", received " + i5);
        }
        if (orf.containsAnyMark(mrfVar.f61850a, i3)) {
            if (!(i3 <= 0 || orf.containsMark(mrfVar.f61850a, i))) {
                a8d.throwIllegalStateException("Expected group " + i + " to record it contains a mark because " + i3 + " does");
            }
        }
        if (zIsNode) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(mrf mrfVar, qb7 qb7Var) {
        ArrayList<Object> groups = qb7Var.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj = groups.get(i);
                if (obj instanceof C5897fo) {
                    C5897fo c5897fo = (C5897fo) obj;
                    if (!c5897fo.getValid()) {
                        a8d.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!mrfVar.ownsAnchor(c5897fo)) {
                        a8d.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof qb7) {
                    verifyWellFormed$verifySourceGroup(mrfVar, (qb7) obj);
                }
            }
        }
    }

    @yfb
    public final C5897fo anchor(int i) {
        if (this.f61855f) {
            gm2.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (i >= 0 && i < this.f61851b) {
            z = true;
        }
        if (!z) {
            a8d.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<C5897fo> arrayList = this.f61847C;
        int iSearch = orf.search(arrayList, i, this.f61851b);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        C5897fo c5897fo = new C5897fo(i);
        arrayList.add(-(iSearch + 1), c5897fo);
        return c5897fo;
    }

    public final int anchorIndex(@yfb C5897fo c5897fo) {
        if (this.f61855f) {
            gm2.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!c5897fo.getValid()) {
            a8d.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return c5897fo.getLocation$runtime_release();
    }

    public final void close$runtime_release(@yfb lrf lrfVar, @gib HashMap<C5897fo, qb7> map) {
        if (!(lrfVar.getTable$runtime_release() == this && this.f61854e > 0)) {
            gm2.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.f61854e--;
        if (map != null) {
            synchronized (this) {
                try {
                    HashMap<C5897fo, qb7> map2 = this.f61848F;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f61848F = map;
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.f61849H = new i5b<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.f61848F = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.f61851b > 0 && orf.containsMark(this.f61850a, 0);
    }

    @Override // p000.fn2
    @gib
    public gn2 find(@yfb Object obj) {
        return new nrf(this, 0, 0, 4, null).find(obj);
    }

    @yfb
    public final ArrayList<C5897fo> getAnchors$runtime_release() {
        return this.f61847C;
    }

    @gib
    public final i5b<j5b> getCalledByMap$runtime_release() {
        return this.f61849H;
    }

    @Override // p000.fn2
    @yfb
    public Iterable<gn2> getCompositionGroups() {
        return this;
    }

    @yfb
    public final int[] getGroups() {
        return this.f61850a;
    }

    public final int getGroupsSize() {
        return this.f61851b;
    }

    @yfb
    public final Object[] getSlots() {
        return this.f61852c;
    }

    public final int getSlotsSize() {
        return this.f61853d;
    }

    @gib
    public final HashMap<C5897fo, qb7> getSourceInformationMap$runtime_release() {
        return this.f61848F;
    }

    public final int getVersion$runtime_release() {
        return this.f61856m;
    }

    public final boolean getWriter$runtime_release() {
        return this.f61855f;
    }

    public final boolean groupContainsAnchor(int i, @yfb C5897fo c5897fo) {
        if (this.f61855f) {
            gm2.composeImmediateRuntimeError("Writer is active");
        }
        if (!(i >= 0 && i < this.f61851b)) {
            gm2.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(c5897fo)) {
            int iGroupSize = orf.groupSize(this.f61850a, i) + i;
            int location$runtime_release = c5897fo.getLocation$runtime_release();
            if (i <= location$runtime_release && location$runtime_release < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    @gib
    public final List<ssd> invalidateGroupsWithKey$runtime_release(int i) {
        j5b j5bVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jvd.C8114a c8114a = new jvd.C8114a();
        c8114a.f52103a = true;
        j5b j5bVar2 = new j5b(0, 1, null);
        j5bVar2.add(i);
        j5bVar2.add(-3);
        i5b<j5b> i5bVar = this.f61849H;
        if (i5bVar != null && (j5bVar = i5bVar.get(i)) != null) {
            j5bVar2.addAll(j5bVar);
        }
        lrf lrfVarOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(lrfVarOpenReader, j5bVar2, arrayList, c8114a, this, arrayList2);
            bth bthVar = bth.f14751a;
            lrfVarOpenReader.close();
            prf prfVarOpenWriter = openWriter();
            try {
                prfVarOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C5897fo c5897fo = (C5897fo) arrayList.get(i2);
                    if (c5897fo.toIndexFor(prfVarOpenWriter) >= prfVarOpenWriter.getCurrentGroup()) {
                        prfVarOpenWriter.seek(c5897fo);
                        prfVarOpenWriter.bashCurrentGroup();
                    }
                }
                prfVarOpenWriter.skipToGroupEnd();
                prfVarOpenWriter.endGroup();
                prfVarOpenWriter.close(true);
                if (c8114a.f52103a) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                prfVarOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            lrfVarOpenReader.close();
            throw th2;
        }
    }

    @Override // p000.fn2
    public boolean isEmpty() {
        return this.f61851b == 0;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<gn2> iterator() {
        return new ob7(this, 0, this.f61851b);
    }

    @yfb
    public final lrf openReader() {
        if (this.f61855f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f61854e++;
        return new lrf(this);
    }

    @yfb
    public final prf openWriter() {
        if (this.f61855f) {
            gm2.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.f61854e <= 0)) {
            gm2.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.f61855f = true;
        this.f61856m++;
        return new prf(this);
    }

    public final boolean ownsAnchor(@yfb C5897fo c5897fo) {
        int iSearch;
        return c5897fo.getValid() && (iSearch = orf.search(this.f61847C, c5897fo.getLocation$runtime_release(), this.f61851b)) >= 0 && md8.areEqual(this.f61847C.get(iSearch), c5897fo);
    }

    public final <T> T read(@yfb qy6<? super lrf, ? extends T> qy6Var) {
        lrf lrfVarOpenReader = openReader();
        try {
            return qy6Var.invoke(lrfVarOpenReader);
        } finally {
            o28.finallyStart(1);
            lrfVarOpenReader.close();
            o28.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(@yfb ArrayList<C5897fo> arrayList) {
        this.f61847C = arrayList;
    }

    public final void setCalledByMap$runtime_release(@gib i5b<j5b> i5bVar) {
        this.f61849H = i5bVar;
    }

    public final void setSourceInformationMap$runtime_release(@gib HashMap<C5897fo, qb7> map) {
        this.f61848F = map;
    }

    public final void setTo$runtime_release(@yfb int[] iArr, int i, @yfb Object[] objArr, int i2, @yfb ArrayList<C5897fo> arrayList, @gib HashMap<C5897fo, qb7> map, @gib i5b<j5b> i5bVar) {
        this.f61850a = iArr;
        this.f61851b = i;
        this.f61852c = objArr;
        this.f61853d = i2;
        this.f61847C = arrayList;
        this.f61848F = map;
        this.f61849H = i5bVar;
    }

    public final void setVersion$runtime_release(int i) {
        this.f61856m = i;
    }

    @gib
    public final Object slot$runtime_release(int i, int i2) {
        int iSlotAnchor = orf.slotAnchor(this.f61850a, i);
        int i3 = i + 1;
        return (i2 < 0 || i2 >= (i3 < this.f61851b ? orf.dataAnchor(this.f61850a, i3) : this.f61852c.length) - iSlotAnchor) ? zl2.f105372a.getEmpty() : this.f61852c[iSlotAnchor + i2];
    }

    @yfb
    public final List<Object> slotsOf$runtime_release(int i) {
        int iDataAnchor = orf.dataAnchor(this.f61850a, i);
        int i2 = i + 1;
        return e80.toList(this.f61852c).subList(iDataAnchor, i2 < this.f61851b ? orf.dataAnchor(this.f61850a, i2) : this.f61852c.length);
    }

    @gib
    public final qb7 sourceInformationOf(int i) {
        C5897fo c5897foTryAnchor;
        HashMap<C5897fo, qb7> map = this.f61848F;
        if (map == null || (c5897foTryAnchor = tryAnchor(i)) == null) {
            return null;
        }
        return map.get(c5897foTryAnchor);
    }

    @yfb
    public final String toDebugString() {
        if (this.f61855f) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.f61851b;
        if (i > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void verifyWellFormed() {
        int i;
        int i2;
        jvd.C8119f c8119f = new jvd.C8119f();
        int i3 = -1;
        if (this.f61851b > 0) {
            while (true) {
                i = c8119f.f52108a;
                i2 = this.f61851b;
                if (i >= i2) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(c8119f, this, -1, i + orf.groupSize(this.f61850a, i));
                }
            }
            if (!(i == i2)) {
                a8d.throwIllegalStateException("Incomplete group at root " + c8119f.f52108a + " expected to be " + this.f61851b);
            }
        }
        int length = this.f61852c.length;
        for (int i4 = this.f61853d; i4 < length; i4++) {
            if (!(this.f61852c[i4] == null)) {
                a8d.throwIllegalStateException("Non null value in the slot gap at index " + i4);
            }
        }
        ArrayList<C5897fo> arrayList = this.f61847C;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int indexFor = arrayList.get(i5).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.f61851b)) {
                a8d.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i3 < indexFor)) {
                a8d.throwIllegalArgumentException("Anchor is out of order");
            }
            i5++;
            i3 = indexFor;
        }
        HashMap<C5897fo, qb7> map = this.f61848F;
        if (map != null) {
            for (Map.Entry<C5897fo, qb7> entry : map.entrySet()) {
                C5897fo key = entry.getKey();
                qb7 value = entry.getValue();
                if (!key.getValid()) {
                    a8d.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    a8d.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    public final <T> T write(@yfb qy6<? super prf, ? extends T> qy6Var) {
        prf prfVarOpenWriter = openWriter();
        try {
            T tInvoke = qy6Var.invoke(prfVarOpenWriter);
            o28.finallyStart(1);
            prfVarOpenWriter.close(true);
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            prfVarOpenWriter.close(false);
            o28.finallyEnd(1);
            throw th;
        }
    }

    public final void close$runtime_release(@yfb prf prfVar, @yfb int[] iArr, int i, @yfb Object[] objArr, int i2, @yfb ArrayList<C5897fo> arrayList, @gib HashMap<C5897fo, qb7> map, @gib i5b<j5b> i5bVar) {
        if (!(prfVar.getTable$runtime_release() == this && this.f61855f)) {
            a8d.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.f61855f = false;
        setTo$runtime_release(iArr, i, objArr, i2, arrayList, map, i5bVar);
    }
}
