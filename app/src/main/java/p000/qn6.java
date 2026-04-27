package p000;

import androidx.compose.p002ui.focus.C0729r;
import androidx.compose.p002ui.focus.FocusTargetNode;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,266:1\n1#2:267\n48#3:268\n523#3:269\n523#3:270\n1208#4:271\n1187#4,2:272\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n245#1:268\n249#1:269\n250#1:270\n257#1:271\n257#1:272,2\n*E\n"})
public final class qn6 implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qn6 f75000a = new qn6();

    private qn6() {
    }

    private final f7b<lw8> pathFromRoot(lw8 lw8Var) {
        f7b<lw8> f7bVar = new f7b<>(new lw8[16], 0);
        while (lw8Var != null) {
            f7bVar.add(0, lw8Var);
            lw8Var = lw8Var.getParent$ui_release();
        }
        return f7bVar;
    }

    @Override // java.util.Comparator
    public int compare(@gib FocusTargetNode focusTargetNode, @gib FocusTargetNode focusTargetNode2) {
        if (focusTargetNode == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (focusTargetNode2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i = 0;
        if (!C0729r.isEligibleForFocusSearch(focusTargetNode) || !C0729r.isEligibleForFocusSearch(focusTargetNode2)) {
            if (C0729r.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            return C0729r.isEligibleForFocusSearch(focusTargetNode2) ? 1 : 0;
        }
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(focusTargetNode);
        lw8 lw8VarRequireLayoutNode2 = w34.requireLayoutNode(focusTargetNode2);
        if (md8.areEqual(lw8VarRequireLayoutNode, lw8VarRequireLayoutNode2)) {
            return 0;
        }
        f7b<lw8> f7bVarPathFromRoot = pathFromRoot(lw8VarRequireLayoutNode);
        f7b<lw8> f7bVarPathFromRoot2 = pathFromRoot(lw8VarRequireLayoutNode2);
        int iMin = Math.min(f7bVarPathFromRoot.getSize() - 1, f7bVarPathFromRoot2.getSize() - 1);
        if (iMin >= 0) {
            while (md8.areEqual(f7bVarPathFromRoot.getContent()[i], f7bVarPathFromRoot2.getContent()[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return md8.compare(f7bVarPathFromRoot.getContent()[i].getPlaceOrder$ui_release(), f7bVarPathFromRoot2.getContent()[i].getPlaceOrder$ui_release());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
