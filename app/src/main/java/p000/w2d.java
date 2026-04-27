package p000;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class w2d {
    public static final void emptyCancelMotionEventScope(long j, @yfb qy6<? super MotionEvent, bth> qy6Var) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        qy6Var.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, qy6Var);
    }

    /* JADX INFO: renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m32845toCancelMotionEventScoped4ec7I(@yfb t1d t1dVar, long j, @yfb qy6<? super MotionEvent, bth> qy6Var) {
        m32847toMotionEventScopeubNVwUQ(t1dVar, j, qy6Var, true);
    }

    /* JADX INFO: renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m32846toMotionEventScoped4ec7I(@yfb t1d t1dVar, long j, @yfb qy6<? super MotionEvent, bth> qy6Var) {
        m32847toMotionEventScopeubNVwUQ(t1dVar, j, qy6Var, false);
    }

    /* JADX INFO: renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m32847toMotionEventScopeubNVwUQ(t1d t1dVar, long j, qy6<? super MotionEvent, bth> qy6Var, boolean z) {
        MotionEvent motionEvent$ui_release = t1dVar.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent$ui_release.getAction();
        if (z) {
            motionEvent$ui_release.setAction(3);
        }
        motionEvent$ui_release.offsetLocation(-izb.m30429getXimpl(j), -izb.m30430getYimpl(j));
        qy6Var.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
        motionEvent$ui_release.setAction(action);
    }
}
