package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,104:1\n33#2,6:105\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n93#1:105,6\n*E\n"})
public final class yxe {
    @yfb
    public static final List<txe> getAllSemanticsNodes(@yfb xxe xxeVar, boolean z, boolean z2) {
        return v82.toList(getAllSemanticsNodesToMap(xxeVar, !z, z2).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(xxe xxeVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodes(xxeVar, z, z2);
    }

    @yfb
    public static final Map<Integer, txe> getAllSemanticsNodesToMap(@yfb xxe xxeVar, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        txe unmergedRootSemanticsNode = z ? xxeVar.getUnmergedRootSemanticsNode() : xxeVar.getRootSemanticsNode();
        if (!z2 || !unmergedRootSemanticsNode.getLayoutNode$ui_release().isDeactivated()) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z2, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(xxe xxeVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodesToMap(xxeVar, z, z2);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, txe> map, boolean z, txe txeVar) {
        map.put(Integer.valueOf(txeVar.getId()), txeVar);
        List children$ui_release$default = txe.getChildren$ui_release$default(txeVar, false, false, !z, 3, null);
        int size = children$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z, (txe) children$ui_release$default.get(i));
        }
    }
}
