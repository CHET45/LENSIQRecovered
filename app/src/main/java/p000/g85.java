package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@dwf({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,111:1\n1208#2:112\n1187#2,2:113\n138#3:115\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n103#1:112\n103#1:113,2\n104#1:115\n*E\n"})
public final class g85 extends yud {
    public g85(@gib qy6<? super mv8, rud> qy6Var) {
        super(qy6Var);
    }

    @Override // p000.yud
    @yfb
    public f7b<Rect> currentRects() {
        f7b<Rect> f7bVar = new f7b<>(new Rect[16], 0);
        f7bVar.addAll(f7bVar.getSize(), m26356a().getSystemGestureExclusionRects());
        return f7bVar;
    }

    @Override // p000.yud
    public void updateRects(@yfb f7b<Rect> f7bVar) {
        m26356a().setSystemGestureExclusionRects(f7bVar.asMutableList());
    }
}
