package p000;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class h37 {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f42166a;

    public h37(@efb Context context, @efb GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean isLongpressEnabled() {
        return this.f42166a.isLongpressEnabled();
    }

    public boolean onTouchEvent(@efb MotionEvent motionEvent) {
        return this.f42166a.onTouchEvent(motionEvent);
    }

    @igg({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z) {
        this.f42166a.setIsLongpressEnabled(z);
    }

    public void setOnDoubleTapListener(@hib GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f42166a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public h37(@efb Context context, @efb GestureDetector.OnGestureListener onGestureListener, @hib Handler handler) {
        this.f42166a = new GestureDetector(context, onGestureListener, handler);
    }
}
