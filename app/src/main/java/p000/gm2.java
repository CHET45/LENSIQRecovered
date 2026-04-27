package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4582:1\n4184#1,8:4591\n4184#1,8:4606\n4551#1,7:4615\n4551#1,7:4630\n1#2:4583\n2272#3,7:4584\n2280#3:4599\n2262#3,6:4600\n2269#3:4614\n158#4,8:4622\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4166#1:4591,8\n4221#1:4606,8\n4241#1:4615,7\n4559#1:4630,7\n4157#1:4584,7\n4157#1:4599\n4212#1:4600,6\n4212#1:4614\n4404#1:4622,8\n*E\n"})
public final class gm2 {

    /* JADX INFO: renamed from: a */
    @gib
    public static ao2 f40164a = null;

    /* JADX INFO: renamed from: b */
    public static final int f40165b = 100;

    /* JADX INFO: renamed from: c */
    public static final int f40166c = 125;

    /* JADX INFO: renamed from: d */
    public static final int f40167d = -127;

    /* JADX INFO: renamed from: e */
    public static final int f40168e = 200;

    /* JADX INFO: renamed from: g */
    public static final int f40170g = 201;

    /* JADX INFO: renamed from: i */
    public static final int f40172i = 202;

    /* JADX INFO: renamed from: k */
    public static final int f40174k = 203;

    /* JADX INFO: renamed from: m */
    public static final int f40176m = 204;

    /* JADX INFO: renamed from: o */
    public static final int f40178o = 206;

    /* JADX INFO: renamed from: q */
    public static final int f40180q = 207;

    /* JADX INFO: renamed from: r */
    public static final int f40181r = -2;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final Object f40169f = new n5c("provider");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final Object f40171h = new n5c("provider");

    /* JADX INFO: renamed from: j */
    @yfb
    public static final Object f40173j = new n5c("compositionLocalMap");

    /* JADX INFO: renamed from: l */
    @yfb
    public static final Object f40175l = new n5c("providerValues");

    /* JADX INFO: renamed from: n */
    @yfb
    public static final Object f40177n = new n5c("providers");

    /* JADX INFO: renamed from: p */
    @yfb
    public static final Object f40179p = new n5c("reference");

    /* JADX INFO: renamed from: s */
    @yfb
    public static final Comparator<fe8> f40182s = new Comparator() { // from class: fm2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gm2.InvalidationLocationAscending$lambda$15((fe8) obj, (fe8) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$15(fe8 fe8Var, fe8 fe8Var2) {
        return md8.compare(fe8Var.getLocation(), fe8Var2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    @fl2
    public static final <T> T cache(@yfb zl2 zl2Var, boolean z, @yfb ny6<? extends T> ny6Var) {
        T t = (T) zl2Var.rememberedValue();
        if (!z && t != zl2.f105372a.getEmpty()) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        zl2Var.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(mrf mrfVar, C5897fo c5897fo) {
        ArrayList arrayList = new ArrayList();
        lrf lrfVarOpenReader = mrfVar.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(lrfVarOpenReader, arrayList, mrfVar.anchorIndex(c5897fo));
            bth bthVar = bth.f14751a;
            return arrayList;
        } finally {
            lrfVarOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(lrf lrfVar, List<Object> list, int i) {
        if (lrfVar.isNode(i)) {
            list.add(lrfVar.node(i));
            return;
        }
        int iGroupSize = i + 1;
        int iGroupSize2 = i + lrfVar.groupSize(i);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(lrfVar, list, iGroupSize);
            iGroupSize += lrfVar.groupSize(iGroupSize);
        }
    }

    public static final void composeImmediateRuntimeError(@yfb String str) {
        throw new ql2("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @yfb
    public static final Void composeRuntimeError(@yfb String str) {
        throw new ql2("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(@yfb prf prfVar, @yfb dyd dydVar) {
        int iAnchorIndex;
        int slotsSize;
        int currentGroup = prfVar.getCurrentGroup();
        int currentGroupEnd = prfVar.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object objNode = prfVar.node(currentGroup);
            if (objNode instanceof pl2) {
                dydVar.deactivating((pl2) objNode, prfVar.getSlotsSize() - prfVar.slotsStartIndex$runtime_release(currentGroup), -1, -1);
            }
            int iSlotIndex = prfVar.slotIndex(prfVar.f71750b, prfVar.groupIndexToAddress(currentGroup));
            int i = currentGroup + 1;
            int iDataIndex = prfVar.dataIndex(prfVar.f71750b, prfVar.groupIndexToAddress(i));
            for (int i2 = iSlotIndex; i2 < iDataIndex; i2++) {
                int i3 = i2 - iSlotIndex;
                Object obj = prfVar.f71751c[prfVar.dataIndexToDataAddress(i2)];
                if (obj instanceof fyd) {
                    fyd fydVar = (fyd) obj;
                    eyd wrapped = fydVar.getWrapped();
                    if (!(wrapped instanceof i9e)) {
                        removeData(prfVar, currentGroup, i3, obj);
                        int slotsSize2 = prfVar.getSlotsSize() - i3;
                        C5897fo after = fydVar.getAfter();
                        if (after == null || !after.getValid()) {
                            iAnchorIndex = -1;
                            slotsSize = -1;
                        } else {
                            iAnchorIndex = prfVar.anchorIndex(after);
                            slotsSize = prfVar.getSlotsSize() - prfVar.slotsEndAllIndex$runtime_release(iAnchorIndex);
                        }
                        dydVar.forgetting(wrapped, slotsSize2, iAnchorIndex, slotsSize);
                    }
                } else if (obj instanceof ssd) {
                    removeData(prfVar, currentGroup, i3, obj);
                    ((ssd) obj).release();
                }
            }
            currentGroup = i;
        }
    }

    private static final int distanceFrom(lrf lrfVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = lrfVar.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<fe8> filterToRange(List<fe8> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            fe8 fe8Var = list.get(iFindInsertLocation);
            if (fe8Var.getLocation() >= i2) {
                break;
            }
            arrayList.add(fe8Var);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<fe8> list, int i) {
        int iFindLocation = findLocation(list, i);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<fe8> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iCompare = md8.compare(list.get(i3).getLocation(), i);
            if (iCompare < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe8 firstInRange(List<fe8> list, int i, int i2) {
        int iFindInsertLocation = findInsertLocation(list, i);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        fe8 fe8Var = list.get(iFindInsertLocation);
        if (fe8Var.getLocation() < i2) {
            return fe8Var;
        }
        return null;
    }

    @yfb
    public static final Object getCompositionLocalMap() {
        return f40173j;
    }

    @yjd
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @yjd
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    @yfb
    public static final Object getInvocation() {
        return f40169f;
    }

    @yjd
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @yjd
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(wq8 wq8Var) {
        return wq8Var.getObjectKey() != null ? new wj8(Integer.valueOf(wq8Var.getKey()), wq8Var.getObjectKey()) : Integer.valueOf(wq8Var.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        wj8 wj8Var = obj instanceof wj8 ? (wj8) obj : null;
        if (wj8Var == null) {
            return null;
        }
        if ((!md8.areEqual(wj8Var.getLeft(), obj2) || !md8.areEqual(wj8Var.getRight(), obj3)) && (obj = getKey(wj8Var.getLeft(), obj2, obj3)) == null) {
            obj = getKey(wj8Var.getRight(), obj2, obj3);
        }
        return obj;
    }

    @yfb
    public static final Object getProvider() {
        return f40171h;
    }

    @yjd
    public static /* synthetic */ void getProvider$annotations() {
    }

    @yjd
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @yfb
    public static final Object getProviderMaps() {
        return f40177n;
    }

    @yjd
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @yjd
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @yfb
    public static final Object getProviderValues() {
        return f40175l;
    }

    @yjd
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @yjd
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @yfb
    public static final Object getReference() {
        return f40179p;
    }

    @yjd
    public static /* synthetic */ void getReference$annotations() {
    }

    @yjd
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @yjd
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<fe8> list, int i, ssd ssdVar, Object obj) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation < 0) {
            int i2 = -(iFindLocation + 1);
            if (!(obj instanceof z64)) {
                obj = null;
            }
            list.add(i2, new fe8(ssdVar, i, obj));
            return;
        }
        fe8 fe8Var = list.get(iFindLocation);
        if (!(obj instanceof z64)) {
            fe8Var.setInstances(null);
            return;
        }
        Object instances = fe8Var.getInstances();
        if (instances == null) {
            fe8Var.setInstances(obj);
        } else if (instances instanceof u6b) {
            ((u6b) instances).add(obj);
        } else {
            fe8Var.setInstances(eoe.mutableScatterSetOf(instances, obj));
        }
    }

    public static final boolean isAfterFirstChild(@yfb prf prfVar) {
        return prfVar.getCurrentGroup() > prfVar.getParent() + 1;
    }

    @fl2
    public static final boolean isTraceInProgress() {
        ao2 ao2Var = f40164a;
        return ao2Var != null && ao2Var.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> s6b<K, Object> multiMap(int i) {
        return t6b.m32375constructorimpl(new s6b(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(lrf lrfVar, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (lrfVar.parent(i) == i2) {
            return i2;
        }
        if (lrfVar.parent(i2) == i) {
            return i;
        }
        if (lrfVar.parent(i) == lrfVar.parent(i2)) {
            return lrfVar.parent(i);
        }
        int iDistanceFrom = distanceFrom(lrfVar, i, i3);
        int iDistanceFrom2 = distanceFrom(lrfVar, i2, i3);
        int i4 = iDistanceFrom - iDistanceFrom2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = lrfVar.parent(i);
        }
        int i6 = iDistanceFrom2 - iDistanceFrom;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = lrfVar.parent(i2);
        }
        while (i != i2) {
            i = lrfVar.parent(i);
            i2 = lrfVar.parent(i2);
        }
        return i;
    }

    public static final void removeCurrentGroup(@yfb prf prfVar, @yfb dyd dydVar) {
        int slotsSize;
        int iDataIndex = prfVar.dataIndex(prfVar.f71750b, prfVar.groupIndexToAddress(prfVar.getCurrentGroup() + prfVar.groupSize(prfVar.getCurrentGroup())));
        for (int iDataIndex2 = prfVar.dataIndex(prfVar.f71750b, prfVar.groupIndexToAddress(prfVar.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = prfVar.f71751c[prfVar.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof pl2) {
                dydVar.releasing((pl2) obj, prfVar.getSlotsSize() - iDataIndex2, -1, -1);
            }
            if (obj instanceof fyd) {
                int slotsSize2 = prfVar.getSlotsSize() - iDataIndex2;
                fyd fydVar = (fyd) obj;
                C5897fo after = fydVar.getAfter();
                if (after == null || !after.getValid()) {
                    slotsSize = -1;
                } else {
                    iAnchorIndex = prfVar.anchorIndex(after);
                    slotsSize = prfVar.getSlotsSize() - prfVar.slotsEndAllIndex$runtime_release(iAnchorIndex);
                }
                dydVar.forgetting(fydVar.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
            }
            if (obj instanceof ssd) {
                ((ssd) obj).release();
            }
        }
        prfVar.removeGroup();
    }

    private static final void removeData(prf prfVar, int i, int i2, Object obj) {
        if (obj == prfVar.set(i, i2, zl2.f105372a.getEmpty())) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe8 removeLocation(List<fe8> list, int i) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<fe8> list, int i, int i2) {
        int iFindInsertLocation = findInsertLocation(list, i);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i2) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError(ny6Var.invoke());
    }

    @fl2
    public static final void sourceInformation(@yfb zl2 zl2Var, @yfb String str) {
        zl2Var.sourceInformation(str);
    }

    @fl2
    public static final void sourceInformationMarkerEnd(@yfb zl2 zl2Var) {
        zl2Var.sourceInformationMarkerEnd();
    }

    @fl2
    public static final void sourceInformationMarkerStart(@yfb zl2 zl2Var, int i, @yfb String str) {
        zl2Var.sourceInformationMarkerStart(i, str);
    }

    @fl2
    public static final void traceEventEnd() {
        ao2 ao2Var = f40164a;
        if (ao2Var != null) {
            ao2Var.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(@yfb prf prfVar, @gib C5897fo c5897fo, @yfb gz6<? super Integer, ? super Integer, ? extends R> gz6Var) {
        int iAnchorIndex;
        int slotsSize;
        if (c5897fo == null || !c5897fo.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = prfVar.anchorIndex(c5897fo);
            slotsSize = prfVar.getSlotsSize() - prfVar.slotsEndAllIndex$runtime_release(iAnchorIndex);
        }
        gz6Var.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final boolean isAfterFirstChild(@yfb lrf lrfVar) {
        return lrfVar.getCurrentGroup() > lrfVar.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @fl2
    public static final void traceEventStart(int i, int i2, int i3, @yfb String str) {
        ao2 ao2Var = f40164a;
        if (ao2Var != null) {
            ao2Var.traceEventStart(i, i2, i3, str);
        }
    }
}
