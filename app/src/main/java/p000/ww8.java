package p000;

import java.util.List;
import p000.lw8;
import p000.sba;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,143:1\n33#2,6:144\n116#2,2:150\n33#2,6:152\n118#2:158\n116#2,2:159\n33#2,6:161\n118#2:167\n33#2,6:168\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:144,6\n59#1:150,2\n59#1:152,6\n59#1:158\n84#1:159,2\n84#1:161,6\n84#1:167\n136#1:168,6\n*E\n"})
@e0g(parameters = 0)
public final class ww8 {

    /* JADX INFO: renamed from: d */
    public static final int f95597d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f95598a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w64 f95599b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<sba.C12507a> f95600c;

    public ww8(@yfb lw8 lw8Var, @yfb w64 w64Var, @yfb List<sba.C12507a> list) {
        this.f95598a = lw8Var;
        this.f95599b = w64Var;
        this.f95600c = list;
    }

    private final boolean consistentLayoutState(lw8 lw8Var) {
        sba.C12507a c12507a;
        lw8 parent$ui_release = lw8Var.getParent$ui_release();
        sba.C12507a c12507a2 = null;
        lw8.EnumC9003e layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (lw8Var.isPlaced() || (lw8Var.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (lw8Var.getMeasurePending$ui_release()) {
                List<sba.C12507a> list = this.f95600c;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        c12507a = null;
                        break;
                    }
                    c12507a = list.get(i);
                    sba.C12507a c12507a3 = c12507a;
                    if (md8.areEqual(c12507a3.getNode(), lw8Var) && !c12507a3.isLookahead()) {
                        break;
                    }
                    i++;
                }
                if (c12507a != null) {
                    return true;
                }
            }
            if (lw8Var.getMeasurePending$ui_release()) {
                return this.f95599b.contains(lw8Var) || lw8Var.getLayoutState$ui_release() == lw8.EnumC9003e.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || ((parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == lw8.EnumC9003e.Measuring);
            }
            if (lw8Var.getLayoutPending$ui_release()) {
                return this.f95599b.contains(lw8Var) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == lw8.EnumC9003e.Measuring || layoutState$ui_release == lw8.EnumC9003e.LayingOut;
            }
        }
        if (md8.areEqual(lw8Var.isPlacedInLookahead(), Boolean.TRUE)) {
            if (lw8Var.getLookaheadMeasurePending$ui_release()) {
                List<sba.C12507a> list2 = this.f95600c;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    sba.C12507a c12507a4 = list2.get(i2);
                    sba.C12507a c12507a5 = c12507a4;
                    if (md8.areEqual(c12507a5.getNode(), lw8Var) && c12507a5.isLookahead()) {
                        c12507a2 = c12507a4;
                        break;
                    }
                    i2++;
                }
                if (c12507a2 != null) {
                    return true;
                }
            }
            if (lw8Var.getLookaheadMeasurePending$ui_release()) {
                return this.f95599b.contains(lw8Var, true) || (parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == lw8.EnumC9003e.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release() && md8.areEqual(lw8Var.getLookaheadRoot$ui_release(), lw8Var));
            }
            if (lw8Var.getLookaheadLayoutPending$ui_release()) {
                return this.f95599b.contains(lw8Var, true) || parent$ui_release == null || parent$ui_release.getLookaheadMeasurePending$ui_release() || parent$ui_release.getLookaheadLayoutPending$ui_release() || layoutState$ui_release == lw8.EnumC9003e.LookaheadMeasuring || layoutState$ui_release == lw8.EnumC9003e.LookaheadLayingOut || (parent$ui_release.getLayoutPending$ui_release() && md8.areEqual(lw8Var.getLookaheadRoot$ui_release(), lw8Var));
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(lw8 lw8Var) {
        if (!consistentLayoutState(lw8Var)) {
            return false;
        }
        List<lw8> children$ui_release = lw8Var.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            if (!isTreeConsistent(children$ui_release.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        md8.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        md8.checkNotNullExpressionValue(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.f95598a, 0);
        return sb.toString();
    }

    private static final void logTree$printSubTree(ww8 ww8Var, StringBuilder sb, lw8 lw8Var, int i) {
        String strNodeToString = ww8Var.nodeToString(lw8Var);
        if (strNodeToString.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strNodeToString);
            md8.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            md8.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<lw8> children$ui_release = lw8Var.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(ww8Var, sb, children$ui_release.get(i3), i);
        }
    }

    private final String nodeToString(lw8 lw8Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(lw8Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4584d2.f28242k);
        sb2.append(lw8Var.getLayoutState$ui_release());
        sb2.append(C4584d2.f28243l);
        sb.append(sb2.toString());
        if (!lw8Var.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + lw8Var.getMeasuredByParent$ui_release() + C4584d2.f28243l);
        if (!consistentLayoutState(lw8Var)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void assertConsistent() {
        if (isTreeConsistent(this.f95598a)) {
            return;
        }
        System.out.println((Object) logTree());
        throw new IllegalStateException("Inconsistency found!");
    }
}
