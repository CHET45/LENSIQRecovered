package p000;

import java.util.ArrayList;
import java.util.List;
import p000.lw8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n1#3:59\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
public final class yba {

    /* JADX INFO: renamed from: yba$a */
    public /* synthetic */ class C15603a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101044a;

        static {
            int[] iArr = new int[lw8.EnumC9003e.values().length];
            try {
                iArr[lw8.EnumC9003e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lw8.EnumC9003e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lw8.EnumC9003e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lw8.EnumC9003e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lw8.EnumC9003e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f101044a = iArr;
        }
    }

    @yfb
    public static final List<List<rba>> getChildrenOfVirtualChildren(@yfb gd8 gd8Var) {
        md8.checkNotNull(gd8Var, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        lw8 layoutNode = ((xba) gd8Var).getLayoutNode();
        boolean zIsInLookaheadPass = isInLookaheadPass(layoutNode);
        List<lw8> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        ArrayList arrayList = new ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            lw8 lw8Var = foldedChildren$ui_release.get(i);
            arrayList.add(zIsInLookaheadPass ? lw8Var.getChildLookaheadMeasurables$ui_release() : lw8Var.getChildMeasurables$ui_release());
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(lw8 lw8Var) {
        int i = C15603a.f101044a[lw8Var.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new ceb();
        }
        lw8 parent$ui_release = lw8Var.getParent$ui_release();
        if (parent$ui_release != null) {
            return isInLookaheadPass(parent$ui_release);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
