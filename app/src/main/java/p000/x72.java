package p000;

import java.util.ArrayList;
import java.util.List;
import p000.C6730h7;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,154:1\n33#2,6:155\n33#2,6:161\n340#2,11:167\n372#2,7:178\n70#3,4:185\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:155,6\n87#1:161,6\n122#1:167,11\n130#1:178,7\n128#1:185,4\n*E\n"})
public final class x72 {

    /* JADX INFO: renamed from: x72$a */
    public static final class C14946a extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C14946a f96941a = new C14946a();

        public C14946a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: x72$b */
    public static final class C14947b extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C14947b f96942a = new C14947b();

        public C14947b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean calculateIfHorizontallyStacked(List<txe> list) {
        List listEmptyList;
        long jM30439unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listEmptyList = l82.emptyList();
        } else {
            listEmptyList = new ArrayList();
            txe txeVar = list.get(0);
            int lastIndex = l82.getLastIndex(list);
            int i = 0;
            while (i < lastIndex) {
                i++;
                txe txeVar2 = list.get(i);
                txe txeVar3 = txeVar2;
                txe txeVar4 = txeVar;
                listEmptyList.add(izb.m30418boximpl(mzb.Offset(Math.abs(izb.m30429getXimpl(txeVar4.getBoundsInRoot().m32203getCenterF1C5BW0()) - izb.m30429getXimpl(txeVar3.getBoundsInRoot().m32203getCenterF1C5BW0())), Math.abs(izb.m30430getYimpl(txeVar4.getBoundsInRoot().m32203getCenterF1C5BW0()) - izb.m30430getYimpl(txeVar3.getBoundsInRoot().m32203getCenterF1C5BW0())))));
                txeVar = txeVar2;
            }
        }
        if (listEmptyList.size() == 1) {
            jM30439unboximpl = ((izb) v82.first(listEmptyList)).m30439unboximpl();
        } else {
            if (listEmptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objFirst = v82.first((List<? extends Object>) listEmptyList);
            int lastIndex2 = l82.getLastIndex(listEmptyList);
            if (1 <= lastIndex2) {
                int i2 = 1;
                while (true) {
                    objFirst = izb.m30418boximpl(izb.m30434plusMKHz9U(((izb) objFirst).m30439unboximpl(), ((izb) listEmptyList.get(i2)).m30439unboximpl()));
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            jM30439unboximpl = ((izb) objFirst).m30439unboximpl();
        }
        return izb.m30430getYimpl(jM30439unboximpl) < izb.m30429getXimpl(jM30439unboximpl);
    }

    public static final boolean hasCollectionInfo(@yfb txe txeVar) {
        nxe config = txeVar.getConfig();
        zxe zxeVar = zxe.f106362a;
        return (oxe.getOrNull(config, zxeVar.getCollectionInfo()) == null && oxe.getOrNull(txeVar.getConfig(), zxeVar.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(w72 w72Var) {
        return w72Var.getRowCount() < 0 || w72Var.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(@yfb txe txeVar, @yfb C6730h7 c6730h7) {
        nxe config = txeVar.getConfig();
        zxe zxeVar = zxe.f106362a;
        w72 w72Var = (w72) oxe.getOrNull(config, zxeVar.getCollectionInfo());
        if (w72Var != null) {
            c6730h7.setCollectionInfo(toAccessibilityCollectionInfo(w72Var));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (oxe.getOrNull(txeVar.getConfig(), zxeVar.getSelectableGroup()) != null) {
            List<txe> replacedChildren$ui_release = txeVar.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                txe txeVar2 = replacedChildren$ui_release.get(i);
                if (txeVar2.getConfig().contains(zxe.f106362a.getSelected())) {
                    arrayList.add(txeVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        c6730h7.setCollectionInfo(C6730h7.f.obtain(zCalculateIfHorizontallyStacked ? 1 : arrayList.size(), zCalculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(@yfb txe txeVar, @yfb C6730h7 c6730h7) {
        nxe config = txeVar.getConfig();
        zxe zxeVar = zxe.f106362a;
        y72 y72Var = (y72) oxe.getOrNull(config, zxeVar.getCollectionItemInfo());
        if (y72Var != null) {
            c6730h7.setCollectionItemInfo(toAccessibilityCollectionItemInfo(y72Var, txeVar));
        }
        txe parent = txeVar.getParent();
        if (parent == null || oxe.getOrNull(parent.getConfig(), zxeVar.getSelectableGroup()) == null) {
            return;
        }
        w72 w72Var = (w72) oxe.getOrNull(parent.getConfig(), zxeVar.getCollectionInfo());
        if ((w72Var == null || !isLazyCollection(w72Var)) && txeVar.getConfig().contains(zxeVar.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<txe> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                txe txeVar2 = replacedChildren$ui_release.get(i2);
                if (txeVar2.getConfig().contains(zxe.f106362a.getSelected())) {
                    arrayList.add(txeVar2);
                    if (txeVar2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < txeVar.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            C6730h7.g gVarObtain = C6730h7.g.obtain(zCalculateIfHorizontallyStacked ? 0 : i, 1, zCalculateIfHorizontallyStacked ? i : 0, 1, false, ((Boolean) txeVar.getConfig().getOrElse(zxe.f106362a.getSelected(), C14946a.f96941a)).booleanValue());
            if (gVarObtain != null) {
                c6730h7.setCollectionItemInfo(gVarObtain);
            }
        }
    }

    private static final C6730h7.f toAccessibilityCollectionInfo(w72 w72Var) {
        return C6730h7.f.obtain(w72Var.getRowCount(), w72Var.getColumnCount(), false, 0);
    }

    private static final C6730h7.g toAccessibilityCollectionItemInfo(y72 y72Var, txe txeVar) {
        return C6730h7.g.obtain(y72Var.getRowIndex(), y72Var.getRowSpan(), y72Var.getColumnIndex(), y72Var.getColumnSpan(), false, ((Boolean) txeVar.getConfig().getOrElse(zxe.f106362a.getSelected(), C14947b.f96942a)).booleanValue());
    }
}
