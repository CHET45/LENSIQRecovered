package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public class pai<V extends View> extends CoordinatorLayout.AbstractC0908c<V> {

    /* JADX INFO: renamed from: f */
    public qai f70194f;

    /* JADX INFO: renamed from: g */
    public int f70195g;

    /* JADX INFO: renamed from: h */
    public int f70196h;

    public pai() {
        this.f70195g = 0;
        this.f70196h = 0;
    }

    /* JADX INFO: renamed from: a */
    public void mo12398a(@efb CoordinatorLayout coordinatorLayout, @efb V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public int getLeftAndRightOffset() {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            return qaiVar.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            return qaiVar.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        qai qaiVar = this.f70194f;
        return qaiVar != null && qaiVar.isHorizontalOffsetEnabled();
    }

    public boolean isVerticalOffsetEnabled() {
        qai qaiVar = this.f70194f;
        return qaiVar != null && qaiVar.isVerticalOffsetEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0908c
    public boolean onLayoutChild(@efb CoordinatorLayout coordinatorLayout, @efb V v, int i) {
        mo12398a(coordinatorLayout, v, i);
        if (this.f70194f == null) {
            this.f70194f = new qai(v);
        }
        this.f70194f.m20185b();
        this.f70194f.m20184a();
        int i2 = this.f70195g;
        if (i2 != 0) {
            this.f70194f.setTopAndBottomOffset(i2);
            this.f70195g = 0;
        }
        int i3 = this.f70196h;
        if (i3 == 0) {
            return true;
        }
        this.f70194f.setLeftAndRightOffset(i3);
        this.f70196h = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            qaiVar.setHorizontalOffsetEnabled(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            return qaiVar.setLeftAndRightOffset(i);
        }
        this.f70196h = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            return qaiVar.setTopAndBottomOffset(i);
        }
        this.f70195g = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        qai qaiVar = this.f70194f;
        if (qaiVar != null) {
            qaiVar.setVerticalOffsetEnabled(z);
        }
    }

    public pai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70195g = 0;
        this.f70196h = 0;
    }
}
