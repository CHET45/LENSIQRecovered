package p000;

import android.graphics.Rect;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: is */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC7580is extends fq0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: f */
    public int f48113f;

    /* JADX INFO: renamed from: m */
    public int f48114m;

    public SurfaceHolderCallbackC7580is(@yfb x13 x13Var) {
        super(x13Var);
        this.f48113f = -1;
        this.f48114m = -1;
    }

    public final int getLastHeight() {
        return this.f48114m;
    }

    public final int getLastWidth() {
        return this.f48113f;
    }

    public final void setLastHeight(int i) {
        this.f48114m = i;
    }

    public final void setLastWidth(int i) {
        this.f48113f = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@yfb SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f48113f == i2 && this.f48114m == i3) {
            return;
        }
        this.f48113f = i2;
        this.f48114m = i3;
        dispatchSurfaceChanged(surfaceHolder.getSurface(), i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@yfb SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f48113f = surfaceFrame.width();
        this.f48114m = surfaceFrame.height();
        dispatchSurfaceCreated(surfaceHolder.getSurface(), this.f48113f, this.f48114m);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@yfb SurfaceHolder surfaceHolder) {
        dispatchSurfaceDestroyed(surfaceHolder.getSurface());
    }
}
