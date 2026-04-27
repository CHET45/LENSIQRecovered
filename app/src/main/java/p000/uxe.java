package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,234:1\n33#2,6:235\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n*L\n53#1:235,6\n*E\n"})
@e0g(parameters = 0)
public final class uxe {

    /* JADX INFO: renamed from: c */
    public static final int f89422c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final nxe f89423a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final j5b f89424b = q78.mutableIntSetOf();

    public uxe(@yfb txe txeVar, @yfb y68<wxe> y68Var) {
        this.f89423a = txeVar.getUnmergedConfig$ui_release();
        List<txe> replacedChildren$ui_release = txeVar.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            txe txeVar2 = replacedChildren$ui_release.get(i);
            if (y68Var.contains(txeVar2.getId())) {
                this.f89424b.add(txeVar2.getId());
            }
        }
    }

    @yfb
    public final j5b getChildren() {
        return this.f89424b;
    }

    @yfb
    public final nxe getUnmergedConfig() {
        return this.f89423a;
    }
}
