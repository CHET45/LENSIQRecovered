package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class q48 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    @efb
    public final Dialog f73186a;

    /* JADX INFO: renamed from: b */
    public final int f73187b;

    /* JADX INFO: renamed from: c */
    public final int f73188c;

    /* JADX INFO: renamed from: d */
    public final int f73189d;

    public q48(@efb Dialog dialog, @efb Rect rect) {
        this.f73186a = dialog;
        this.f73187b = rect.left;
        this.f73188c = rect.top;
        this.f73189d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@efb View view, @efb MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f73187b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f73188c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f73189d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f73186a.onTouchEvent(motionEventObtain);
    }
}
