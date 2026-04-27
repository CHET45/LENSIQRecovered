package p000;

import android.graphics.Canvas;
import p000.e5i;

/* JADX INFO: renamed from: fw */
/* JADX INFO: loaded from: classes.dex */
public final class C6000fw {
    @yfb
    /* JADX INFO: renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m29671toAndroidVertexModeJOOmi9M(int i) {
        e5i.C5133a c5133a = e5i.f31871b;
        return e5i.m28734equalsimpl0(i, c5133a.m28740getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : e5i.m28734equalsimpl0(i, c5133a.m28739getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : e5i.m28734equalsimpl0(i, c5133a.m28738getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
