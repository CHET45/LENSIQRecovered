package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class vc4 {

    /* JADX INFO: renamed from: a */
    public final Context f90591a;

    /* JADX INFO: renamed from: b */
    public final wc4 f90592b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13991b f90593c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13990a f90594d;

    /* JADX INFO: renamed from: e */
    @hib
    public VelocityTracker f90595e;

    /* JADX INFO: renamed from: f */
    public float f90596f;

    /* JADX INFO: renamed from: g */
    public int f90597g;

    /* JADX INFO: renamed from: h */
    public int f90598h;

    /* JADX INFO: renamed from: i */
    public int f90599i;

    /* JADX INFO: renamed from: j */
    public final int[] f90600j;

    /* JADX INFO: renamed from: vc4$a */
    @fdi
    public interface InterfaceC13990a {
        float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: renamed from: vc4$b */
    @fdi
    public interface InterfaceC13991b {
        void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public vc4(@efb Context context, @efb wc4 wc4Var) {
        this(context, wc4Var, new InterfaceC13991b() { // from class: tc4
            @Override // p000.vc4.InterfaceC13991b
            public final void calculateFlingVelocityThresholds(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                vc4.calculateFlingVelocityThresholds(context2, iArr, motionEvent, i);
            }
        }, new InterfaceC13990a() { // from class: uc4
            @Override // p000.vc4.InterfaceC13990a
            public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return vc4.getCurrentVelocity(velocityTracker, motionEvent, i);
            }
        });
    }

    private boolean calculateFlingVelocityThresholds(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f90598h == source && this.f90599i == deviceId && this.f90597g == i) {
            return false;
        }
        this.f90593c.calculateFlingVelocityThresholds(this.f90591a, this.f90600j, motionEvent, i);
        this.f90598h = source;
        this.f90599i = deviceId;
        this.f90597g = i;
        return true;
    }

    private float getCurrentVelocity(MotionEvent motionEvent, int i) {
        if (this.f90595e == null) {
            this.f90595e = VelocityTracker.obtain();
        }
        return this.f90594d.getCurrentVelocity(this.f90595e, motionEvent, i);
    }

    public void onMotionEvent(@efb MotionEvent motionEvent, int i) {
        boolean zCalculateFlingVelocityThresholds = calculateFlingVelocityThresholds(motionEvent, i);
        if (this.f90600j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f90595e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f90595e = null;
                return;
            }
            return;
        }
        float currentVelocity = getCurrentVelocity(motionEvent, i) * this.f90592b.getScaledScrollFactor();
        float fSignum = Math.signum(currentVelocity);
        if (zCalculateFlingVelocityThresholds || (fSignum != Math.signum(this.f90596f) && fSignum != 0.0f)) {
            this.f90592b.stopDifferentialMotionFling();
        }
        float fAbs = Math.abs(currentVelocity);
        int[] iArr = this.f90600j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(currentVelocity, iArr[1]));
        this.f90596f = this.f90592b.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
    }

    @fdi
    public vc4(Context context, wc4 wc4Var, InterfaceC13991b interfaceC13991b, InterfaceC13990a interfaceC13990a) {
        this.f90597g = -1;
        this.f90598h = -1;
        this.f90599i = -1;
        this.f90600j = new int[]{Integer.MAX_VALUE, 0};
        this.f90591a = context;
        this.f90592b = wc4Var;
        this.f90593c = interfaceC13991b;
        this.f90594d = interfaceC13990a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        n4i.addMovement(velocityTracker, motionEvent);
        n4i.computeCurrentVelocity(velocityTracker, 1000);
        return n4i.getAxisVelocity(velocityTracker, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = x8i.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = x8i.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }
}
