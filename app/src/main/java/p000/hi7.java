package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hi7 extends pai<View> {

    /* JADX INFO: renamed from: i */
    public final Rect f43732i;

    /* JADX INFO: renamed from: j */
    public final Rect f43733j;

    /* JADX INFO: renamed from: k */
    public int f43734k;

    /* JADX INFO: renamed from: l */
    public int f43735l;

    public hi7() {
        this.f43732i = new Rect();
        this.f43733j = new Rect();
        this.f43734k = 0;
    }

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // p000.pai
    /* JADX INFO: renamed from: a */
    public void mo12398a(@efb CoordinatorLayout coordinatorLayout, @efb View view, int i) {
        View viewMo5832b = mo5832b(coordinatorLayout.getDependencies(view));
        if (viewMo5832b == null) {
            super.mo12398a(coordinatorLayout, view, i);
            this.f43734k = 0;
            return;
        }
        CoordinatorLayout.C0912g c0912g = (CoordinatorLayout.C0912g) view.getLayoutParams();
        Rect rect = this.f43732i;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0912g).leftMargin, viewMo5832b.getBottom() + ((ViewGroup.MarginLayoutParams) c0912g).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0912g).rightMargin, ((coordinatorLayout.getHeight() + viewMo5832b.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0912g).bottomMargin);
        smi lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && o8i.getFitsSystemWindows(coordinatorLayout) && !o8i.getFitsSystemWindows(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f43733j;
        cb7.apply(resolveGravity(c0912g.f7375c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM12399c = m12399c(viewMo5832b);
        view.layout(rect2.left, rect2.top - iM12399c, rect2.right, rect2.bottom - iM12399c);
        this.f43734k = rect2.top - viewMo5832b.getBottom();
    }

    @hib
    /* JADX INFO: renamed from: b */
    public abstract View mo5832b(List<View> list);

    /* JADX INFO: renamed from: c */
    public final int m12399c(View view) {
        if (this.f43735l == 0) {
            return 0;
        }
        float fMo5833d = mo5833d(view);
        int i = this.f43735l;
        return r3a.clamp((int) (fMo5833d * i), 0, i);
    }

    /* JADX INFO: renamed from: d */
    public float mo5833d(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public int mo5834e(@efb View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: f */
    public final int m12400f() {
        return this.f43734k;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo6315g() {
        return false;
    }

    public final int getOverlayTop() {
        return this.f43735l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0908c
    public boolean onMeasureChild(@efb CoordinatorLayout coordinatorLayout, @efb View view, int i, int i2, int i3, int i4) {
        View viewMo5832b;
        smi lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewMo5832b = mo5832b(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (o8i.getFitsSystemWindows(viewMo5832b) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iMo5834e = size + mo5834e(viewMo5832b);
        int measuredHeight = viewMo5832b.getMeasuredHeight();
        if (mo6315g()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo5834e -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(iMo5834e, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.f43735l = i;
    }

    public hi7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43732i = new Rect();
        this.f43733j = new Rect();
        this.f43734k = 0;
    }
}
