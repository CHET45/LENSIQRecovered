package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
@dwf({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,112:1\n1208#2:113\n1187#2,2:114\n138#3:116\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n*L\n103#1:113\n103#1:114,2\n104#1:116\n*E\n"})
public final class t8d extends yud {
    public t8d(@gib qy6<? super mv8, rud> qy6Var) {
        super(qy6Var);
    }

    @Override // p000.yud
    @yfb
    public f7b<Rect> currentRects() {
        f7b<Rect> f7bVar = new f7b<>(new Rect[16], 0);
        f7bVar.addAll(f7bVar.getSize(), m26356a().getPreferKeepClearRects());
        return f7bVar;
    }

    @Override // p000.yud
    public void updateRects(@yfb f7b<Rect> f7bVar) {
        m26356a().setPreferKeepClearRects(f7bVar.asMutableList());
    }
}
