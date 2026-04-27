package p000;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class qai {

    /* JADX INFO: renamed from: a */
    public final View f73774a;

    /* JADX INFO: renamed from: b */
    public int f73775b;

    /* JADX INFO: renamed from: c */
    public int f73776c;

    /* JADX INFO: renamed from: d */
    public int f73777d;

    /* JADX INFO: renamed from: e */
    public int f73778e;

    /* JADX INFO: renamed from: f */
    public boolean f73779f = true;

    /* JADX INFO: renamed from: g */
    public boolean f73780g = true;

    public qai(View view) {
        this.f73774a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m20184a() {
        View view = this.f73774a;
        o8i.offsetTopAndBottom(view, this.f73777d - (view.getTop() - this.f73775b));
        View view2 = this.f73774a;
        o8i.offsetLeftAndRight(view2, this.f73778e - (view2.getLeft() - this.f73776c));
    }

    /* JADX INFO: renamed from: b */
    public void m20185b() {
        this.f73775b = this.f73774a.getTop();
        this.f73776c = this.f73774a.getLeft();
    }

    public int getLayoutLeft() {
        return this.f73776c;
    }

    public int getLayoutTop() {
        return this.f73775b;
    }

    public int getLeftAndRightOffset() {
        return this.f73778e;
    }

    public int getTopAndBottomOffset() {
        return this.f73777d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.f73780g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.f73779f;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        this.f73780g = z;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (!this.f73780g || this.f73778e == i) {
            return false;
        }
        this.f73778e = i;
        m20184a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (!this.f73779f || this.f73777d == i) {
            return false;
        }
        this.f73777d = i;
        m20184a();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        this.f73779f = z;
    }
}
