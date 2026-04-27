package p000;

import android.graphics.Canvas;

/* JADX INFO: renamed from: eq */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public final class C5437eq {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Canvas f33826a = new Canvas();

    @yfb
    public static final vq1 ActualCanvas(@yfb rs7 rs7Var) {
        C4905dq c4905dq = new C4905dq();
        c4905dq.setInternalCanvas(new Canvas(C5460et.asAndroidBitmap(rs7Var)));
        return c4905dq;
    }

    @yfb
    public static final vq1 Canvas(@yfb Canvas canvas) {
        C4905dq c4905dq = new C4905dq();
        c4905dq.setInternalCanvas(canvas);
        return c4905dq;
    }

    @yfb
    public static final Canvas getNativeCanvas(@yfb vq1 vq1Var) {
        md8.checkNotNull(vq1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C4905dq) vq1Var).getInternalCanvas();
    }
}
