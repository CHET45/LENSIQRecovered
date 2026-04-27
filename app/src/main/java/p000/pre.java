package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,238:1\n205#1:239\n206#1:243\n207#1,2:245\n209#1:248\n210#1,5:258\n1208#2:240\n1187#2,2:241\n1208#2:263\n1187#2,2:264\n138#3:244\n48#3:247\n138#3:266\n48#3:267\n138#3:268\n66#4,9:249\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n135#1:239\n135#1:243\n135#1:245,2\n135#1:248\n135#1:258,5\n135#1:240\n135#1:241,2\n205#1:263\n205#1:264,2\n135#1:244\n135#1:247\n206#1:266\n208#1:267\n211#1:268\n141#1:249,9\n*E\n"})
public final class pre {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19722a(txe txeVar, int i, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        visitScrollCaptureCandidates(txeVar, i, qy6Var);
    }

    private static final boolean getCanScrollVertically(txe txeVar) {
        gz6<izb, zy2<? super izb>, Object> scrollCaptureScrollByAction = getScrollCaptureScrollByAction(txeVar);
        ire ireVar = (ire) oxe.getOrNull(txeVar.getUnmergedConfig$ui_release(), zxe.f106362a.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || ireVar == null || ireVar.getMaxValue().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<txe> getChildrenForSearch(txe txeVar) {
        return txeVar.getChildren$ui_release(false, false, false);
    }

    @gib
    public static final gz6<izb, zy2<? super izb>, Object> getScrollCaptureScrollByAction(@yfb txe txeVar) {
        return (gz6) oxe.getOrNull(txeVar.getUnmergedConfig$ui_release(), mxe.f62738a.getScrollByOffset());
    }

    private static final boolean isVisible(txe txeVar) {
        return (txeVar.isTransparent$ui_release() || txeVar.getUnmergedConfig$ui_release().contains(zxe.f106362a.getInvisibleToUser())) ? false : true;
    }

    private static /* synthetic */ void isVisible$annotations(txe txeVar) {
    }

    private static final void visitDescendants(txe txeVar, qy6<? super txe, Boolean> qy6Var) {
        f7b f7bVar = new f7b(new txe[16], 0);
        f7bVar.addAll(f7bVar.getSize(), (List) getChildrenForSearch(txeVar));
        while (f7bVar.isNotEmpty()) {
            txe txeVar2 = (txe) f7bVar.removeAt(f7bVar.getSize() - 1);
            if (qy6Var.invoke(txeVar2).booleanValue()) {
                f7bVar.addAll(f7bVar.getSize(), (List) getChildrenForSearch(txeVar2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(txe txeVar, int i, qy6<? super ore, bth> qy6Var) {
        txe txeVar2;
        f7b f7bVar = new f7b(new txe[16], 0);
        List<txe> childrenForSearch = getChildrenForSearch(txeVar);
        while (true) {
            f7bVar.addAll(f7bVar.getSize(), (List) childrenForSearch);
            while (f7bVar.isNotEmpty()) {
                txeVar2 = (txe) f7bVar.removeAt(f7bVar.getSize() - 1);
                if (isVisible(txeVar2) && !txeVar2.getUnmergedConfig$ui_release().contains(zxe.f106362a.getDisabled())) {
                    heb hebVarFindCoordinatorToGetBounds$ui_release = txeVar2.findCoordinatorToGetBounds$ui_release();
                    if (hebVarFindCoordinatorToGetBounds$ui_release == null) {
                        g28.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
                        throw new us8();
                    }
                    mv8 coordinates = hebVarFindCoordinatorToGetBounds$ui_release.getCoordinates();
                    l78 l78VarRoundToIntRect = m78.roundToIntRect(nv8.boundsInWindow(coordinates));
                    if (l78VarRoundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(txeVar2)) {
                            break;
                        }
                        int i2 = i + 1;
                        qy6Var.invoke(new ore(txeVar2, i2, l78VarRoundToIntRect, coordinates));
                        visitScrollCaptureCandidates(txeVar2, i2, qy6Var);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(txeVar2);
        }
    }
}
