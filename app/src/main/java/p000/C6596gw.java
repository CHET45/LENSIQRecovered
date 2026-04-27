package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: gw */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C6596gw implements u8i {

    /* JADX INFO: renamed from: b */
    public static final int f41520b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ViewConfiguration f41521a;

    public C6596gw(@yfb ViewConfiguration viewConfiguration) {
        this.f41521a = viewConfiguration;
    }

    @Override // p000.u8i
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // p000.u8i
    public long getDoubleTapTimeoutMillis() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.u8i
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT >= 34 ? C8125jw.f52118a.getScaledHandwritingGestureLineMargin(this.f41521a) : super.getHandwritingGestureLineMargin();
    }

    @Override // p000.u8i
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT >= 34 ? C8125jw.f52118a.getScaledHandwritingSlop(this.f41521a) : super.getHandwritingSlop();
    }

    @Override // p000.u8i
    public long getLongPressTimeoutMillis() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p000.u8i
    public float getMaximumFlingVelocity() {
        return this.f41521a.getScaledMaximumFlingVelocity();
    }

    @Override // p000.u8i
    public float getTouchSlop() {
        return this.f41521a.getScaledTouchSlop();
    }
}
