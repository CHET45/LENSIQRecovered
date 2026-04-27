package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes5.dex */
public final class fae extends naf {

    /* JADX INFO: renamed from: a */
    public final SideSheetBehavior<? extends View> f35941a;

    public fae(@efb SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f35941a = sideSheetBehavior;
    }

    private boolean isReleasedCloseToOriginEdge(@efb View view) {
        return view.getLeft() > (mo10792e() - mo10791d()) / 2;
    }

    private boolean isSwipeSignificant(float f, float f2) {
        return qaf.m20183a(f, f2) && f2 > ((float) this.f35941a.getSignificantVelocityThreshold());
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: a */
    public int mo10788a(@efb ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: b */
    public float mo10789b(int i) {
        float fMo10792e = mo10792e();
        return (fMo10792e - i) / (fMo10792e - mo10791d());
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: c */
    public int mo10790c(@efb View view, float f, float f2) {
        if (f < 0.0f) {
            return 3;
        }
        if (mo10796i(view, f)) {
            if (!isSwipeSignificant(f, f2) && !isReleasedCloseToOriginEdge(view)) {
                return 3;
            }
        } else if (f == 0.0f || !qaf.m20183a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - mo10791d()) < Math.abs(left - mo10792e())) {
                return 3;
            }
        }
        return 5;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: d */
    public int mo10791d() {
        return Math.max(0, (mo10792e() - this.f35941a.m6371k()) - this.f35941a.m6373m());
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: e */
    public int mo10792e() {
        return this.f35941a.m6375o();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: f */
    public <V extends View> int mo10793f(@efb V v) {
        return v.getLeft() - this.f35941a.m6373m();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: g */
    public int mo10794g() {
        return 0;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: h */
    public boolean mo10795h(View view, int i, boolean z) {
        int iM6374n = this.f35941a.m6374n(i);
        z8i z8iVarM6376p = this.f35941a.m6376p();
        return z8iVarM6376p != null && (!z ? !z8iVarM6376p.smoothSlideViewTo(view, iM6374n, view.getTop()) : !z8iVarM6376p.settleCapturedViewAt(iM6374n, view.getTop()));
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: i */
    public boolean mo10796i(@efb View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.f35941a.getHideFriction())) > this.f35941a.m6372l();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: j */
    public void mo10797j(@efb ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iM6375o = this.f35941a.m6375o();
        if (i <= iM6375o) {
            marginLayoutParams.rightMargin = iM6375o - i;
        }
    }
}
