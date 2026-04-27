package p000;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidViewsHandler;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.jae;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,234:1\n288#2,2:235\n26#3:237\n26#3:238\n26#3:239\n26#3:240\n26#3:241\n26#3:242\n26#3:243\n26#3:244\n26#3:245\n26#3:246\n26#3:247\n26#3:248\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n*L\n137#1:235,2\n162#1:237\n163#1:238\n164#1:239\n165#1:240\n178#1:241\n179#1:242\n180#1:243\n181#1:244\n215#1:245\n216#1:246\n217#1:247\n218#1:248\n*E\n"})
public final class gye {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final rud f41839a = new rud(0.0f, 0.0f, 10.0f, 10.0f);

    @gib
    public static final ure findById(@yfb List<ure> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    @yfb
    public static final y68<wxe> getAllUncoveredSemanticsNodesToIntObjectMap(@yfb xxe xxeVar) {
        txe unmergedRootSemanticsNode = xxeVar.getUnmergedRootSemanticsNode();
        i5b i5bVarMutableIntObjectMapOf = z68.mutableIntObjectMapOf();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            rud boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            m12042x1b6f0f0a(new Region(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom())), unmergedRootSemanticsNode, i5bVarMutableIntObjectMapOf, unmergedRootSemanticsNode, new Region());
        }
        return i5bVarMutableIntObjectMapOf;
    }

    /* JADX INFO: renamed from: getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive */
    private static final void m12042x1b6f0f0a(Region region, txe txeVar, i5b<wxe> i5bVar, txe txeVar2, Region region2) {
        xv8 layoutInfo;
        boolean z = (txeVar2.getLayoutNode$ui_release().isPlaced() && txeVar2.getLayoutNode$ui_release().isAttached()) ? false : true;
        if (!region.isEmpty() || txeVar2.getId() == txeVar.getId()) {
            if (!z || txeVar2.isFake$ui_release()) {
                rud touchBoundsInRoot = txeVar2.getTouchBoundsInRoot();
                int iRound = Math.round(touchBoundsInRoot.getLeft());
                int iRound2 = Math.round(touchBoundsInRoot.getTop());
                int iRound3 = Math.round(touchBoundsInRoot.getRight());
                int iRound4 = Math.round(touchBoundsInRoot.getBottom());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int id = txeVar2.getId() == txeVar.getId() ? -1 : txeVar2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (txeVar2.isFake$ui_release()) {
                        txe parent = txeVar2.getParent();
                        rud boundsInRoot = (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? f41839a : parent.getBoundsInRoot();
                        i5bVar.set(id, new wxe(txeVar2, new Rect(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom()))));
                        return;
                    } else {
                        if (id == -1) {
                            i5bVar.set(id, new wxe(txeVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                i5bVar.set(id, new wxe(txeVar2, region2.getBounds()));
                List<txe> replacedChildren$ui_release = txeVar2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    m12042x1b6f0f0a(region, txeVar, i5bVar, replacedChildren$ui_release.get(size), region2);
                }
                if (isImportantForAccessibility(txeVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @yfb
    public static final rud getDefaultFakeNodeBounds() {
        return f41839a;
    }

    @gib
    @igg({"PrimitiveInCollection"})
    public static final Float getScrollViewportLength(@yfb nxe nxeVar) {
        qy6 qy6Var;
        ArrayList arrayList = new ArrayList();
        C4623d6 c4623d6 = (C4623d6) oxe.getOrNull(nxeVar, mxe.f62738a.getGetScrollViewportLength());
        if (c4623d6 == null || (qy6Var = (qy6) c4623d6.getAction()) == null || !((Boolean) qy6Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    @gib
    public static final hug getTextLayoutResult(@yfb nxe nxeVar) {
        qy6 qy6Var;
        ArrayList arrayList = new ArrayList();
        C4623d6 c4623d6 = (C4623d6) oxe.getOrNull(nxeVar, mxe.f62738a.getGetTextLayoutResult());
        if (c4623d6 == null || (qy6Var = (qy6) c4623d6.getAction()) == null || !((Boolean) qy6Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (hug) arrayList.get(0);
    }

    public static final boolean isAncestorOf(@yfb lw8 lw8Var, @yfb lw8 lw8Var2) {
        lw8 parent$ui_release = lw8Var2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        return md8.areEqual(parent$ui_release, lw8Var) || isAncestorOf(lw8Var, parent$ui_release);
    }

    public static final boolean isImportantForAccessibility(@yfb txe txeVar) {
        return txeVar.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || txeVar.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release();
    }

    @gib
    public static final View semanticsIdToView(@yfb AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((lw8) ((Map.Entry) next).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    @gib
    /* JADX INFO: renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m29878toLegacyClassNameV4PA4sw(int i) {
        jae.C7826a c7826a = jae.f50116b;
        if (jae.m30497equalsimpl0(i, c7826a.m30501getButtono7Vup1c())) {
            return Chip.f21360p2;
        }
        if (jae.m30497equalsimpl0(i, c7826a.m30502getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (jae.m30497equalsimpl0(i, c7826a.m30505getRadioButtono7Vup1c())) {
            return Chip.f21361q2;
        }
        if (jae.m30497equalsimpl0(i, c7826a.m30504getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (jae.m30497equalsimpl0(i, c7826a.m30503getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
