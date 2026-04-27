package p000;

import java.util.List;

/* JADX INFO: renamed from: kr */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,36:1\n256#2,3:37\n33#2,4:40\n259#2,2:44\n38#2:46\n261#2:47\n148#3:48\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:37,3\n33#1:40,4\n33#1:44,2\n33#1:46\n33#1:47\n33#1:48\n*E\n"})
public final class C8504kr implements qre {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8504kr f55078a = new C8504kr();

    private C8504kr() {
    }

    @Override // p000.qre
    /* JADX INFO: renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo30744calculateMouseWheelScroll8xgXZGE(@yfb c64 c64Var, @yfb t1d t1dVar, long j) {
        List<h2d> changes = t1dVar.getChanges();
        izb izbVarM30418boximpl = izb.m30418boximpl(izb.f49009b.m30445getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            izbVarM30418boximpl = izb.m30418boximpl(izb.m30434plusMKHz9U(izbVarM30418boximpl.m30439unboximpl(), changes.get(i).m29913getScrollDeltaF1C5BW0()));
        }
        return izb.m30436timestuRUvjQ(izbVarM30418boximpl.m30439unboximpl(), -c64Var.mo27173toPx0680j_4(kn4.m30705constructorimpl(64)));
    }
}
