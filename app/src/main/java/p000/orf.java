package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n82#2,3:4152\n33#2,4:4155\n85#2,2:4159\n38#2:4161\n87#2:4162\n1#3:4163\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3941#1:4152,3\n3941#1:4155,4\n3941#1:4159,2\n3941#1:4161\n3941#1:4162\n*E\n"})
public final class orf {

    /* JADX INFO: renamed from: a */
    public static final int f68399a = -2;

    /* JADX INFO: renamed from: b */
    public static final int f68400b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f68401c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f68402d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f68403e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f68404f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f68405g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f68406h = 1073741824;

    /* JADX INFO: renamed from: i */
    public static final int f68407i = 536870912;

    /* JADX INFO: renamed from: j */
    public static final int f68408j = 29;

    /* JADX INFO: renamed from: k */
    public static final int f68409k = 268435456;

    /* JADX INFO: renamed from: l */
    public static final int f68410l = 28;

    /* JADX INFO: renamed from: m */
    public static final int f68411m = 134217728;

    /* JADX INFO: renamed from: n */
    public static final int f68412n = 67108864;

    /* JADX INFO: renamed from: o */
    public static final int f68413o = 28;

    /* JADX INFO: renamed from: p */
    public static final int f68414p = 67108863;

    /* JADX INFO: renamed from: q */
    public static final int f68415q = 32;

    /* JADX INFO: renamed from: r */
    public static final int f68416r = 32;

    /* JADX INFO: renamed from: s */
    public static final int f68417s = -3;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m18821a(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return dataAnchors(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(i5b<j5b> i5bVar, int i, int i2) {
        j5b j5bVar = i5bVar.get(i);
        if (j5bVar == null) {
            j5bVar = new j5b(0, 1, null);
            i5bVar.set(i, j5bVar);
        }
        j5bVar.add(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m18822b(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return groupSizes(iArr, i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m18823c(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return keys(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsAnyMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countOneBits(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m18824d(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return nodeCounts(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dataAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i) {
        return slice(iArr, kpd.step(kpd.until(4, i), 5));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ List m18825e(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return parentAnchors(iArr, i);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, qy6<? super T, Boolean> qy6Var) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (qy6Var.invoke(arrayList.get(i)).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, qy6<? super T, Boolean> qy6Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = arrayList.get(size);
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5897fo find(ArrayList<C5897fo> arrayList, int i, int i2) {
        int iSearch = search(arrayList, i, i2);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    private static final C5897fo getOrAdd(ArrayList<C5897fo> arrayList, int i, int i2, ny6<C5897fo> ny6Var) {
        int iSearch = search(arrayList, i, i2);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        C5897fo c5897foInvoke = ny6Var.invoke();
        arrayList.add(-(iSearch + 1), c5897foInvoke);
        return c5897foInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupInfo(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i) {
        return slice(iArr, kpd.step(kpd.until(3, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAux(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasObjectKey(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = z ? 1073741824 : 0;
        int i6 = z2 ? 536870912 : 0;
        int i7 = z3 ? 268435456 : 0;
        int i8 = i * 5;
        iArr[i8] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNode(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int key(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i) {
        return slice(iArr, kpd.step(kpd.until(0, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<C5897fo> arrayList, int i, int i2) {
        int iSearch = search(arrayList, i, i2);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeCount(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & f68414p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i) {
        List<Integer> listSlice = slice(iArr, kpd.step(kpd.until(1, i), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(listSlice.get(i2).intValue() & f68414p));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeIndex(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int parentAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i) {
        return slice(iArr, kpd.step(kpd.until(2, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<C5897fo> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location$runtime_release = arrayList.get(i4).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i2;
            }
            int iCompare = md8.compare(location$runtime_release, i);
            if (iCompare < 0) {
                i3 = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i) {
        String strReplace$default = h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(h9g.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i, strReplace$default.length()));
        md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDataAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i, int i2) {
        iArr[i * 5] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i, int i2) {
        gm2.runtimeCheck(i2 >= 0);
        iArr[(i * 5) + 3] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i, int i2) {
        gm2.runtimeCheck(i2 >= 0 && i2 < 67108863);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateParentAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
