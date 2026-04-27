package p000;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class pr1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C4905dq f71726a = new C4905dq();

    @yjd
    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }

    public final void drawInto(@yfb Canvas canvas, @yfb qy6<? super vq1, bth> qy6Var) {
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        qy6Var.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @yfb
    public final C4905dq getAndroidCanvas() {
        return this.f71726a;
    }
}
