package p000;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class cse {

    /* JADX INFO: renamed from: a */
    public OverScroller f27305a;

    public cse(Context context, Interpolator interpolator) {
        this.f27305a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static cse create(Context context) {
        return create(context, null);
    }

    @Deprecated
    public void abortAnimation() {
        this.f27305a.abortAnimation();
    }

    @Deprecated
    public boolean computeScrollOffset() {
        return this.f27305a.computeScrollOffset();
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f27305a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public float getCurrVelocity() {
        return this.f27305a.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        return this.f27305a.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        return this.f27305a.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        return this.f27305a.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        return this.f27305a.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f27305a.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        return this.f27305a.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.f27305a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.f27305a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f27305a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4) {
        this.f27305a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public static cse create(Context context, Interpolator interpolator) {
        return new cse(context, interpolator);
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f27305a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.f27305a.startScroll(i, i2, i3, i4, i5);
    }
}
