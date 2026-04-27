package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mre {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ScrollCaptureTarget m17538a(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }
}
