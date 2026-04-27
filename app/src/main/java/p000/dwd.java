package p000;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smart.refresh.layout.kernel.C3941R;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class dwd implements cwd, b03, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public View f31211a;

    /* JADX INFO: renamed from: b */
    public View f31212b;

    /* JADX INFO: renamed from: c */
    public View f31213c;

    /* JADX INFO: renamed from: d */
    public View f31214d;

    /* JADX INFO: renamed from: e */
    public View f31215e;

    /* JADX INFO: renamed from: f */
    public int f31216f = 0;

    /* JADX INFO: renamed from: m */
    public boolean f31217m = true;

    /* JADX INFO: renamed from: C */
    public boolean f31209C = true;

    /* JADX INFO: renamed from: F */
    public aif f31210F = new aif();

    public dwd(@efb View view) {
        this.f31213c = view;
        this.f31212b = view;
        this.f31211a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m9503a(View view, gwd gwdVar) {
        boolean zIsInEditMode = this.f31211a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof vab) || (view2 instanceof rab))) {
                break;
            }
            view = m9505c(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                v74.checkCoordinatorLayout(view, gwdVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f31213c = view2;
        }
    }

    /* JADX INFO: renamed from: b */
    public View m9504b(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (yrf.isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && yrf.isContentView(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewM9504b = m9504b(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewM9504b;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: c */
    public View m9505c(View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && yrf.isContentView(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    @Override // p000.cwd
    public boolean canLoadMore() {
        return this.f31209C && this.f31210F.canLoadMore(this.f31211a);
    }

    @Override // p000.cwd
    public boolean canRefresh() {
        return this.f31217m && this.f31210F.canRefresh(this.f31211a);
    }

    @Override // p000.cwd
    @efb
    public View getScrollableView() {
        return this.f31213c;
    }

    @Override // p000.cwd
    @efb
    public View getView() {
        return this.f31211a;
    }

    @Override // p000.cwd
    public void moveSpinner(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        if (i2 == -1 || (viewFindViewById2 = this.f31212b.findViewById(i2)) == null) {
            z = false;
        } else if (i > 0) {
            viewFindViewById2.setTranslationY(i);
            z = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z = false;
        }
        if (i3 == -1 || (viewFindViewById = this.f31212b.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z2 = z;
        }
        if (z2) {
            this.f31212b.setTranslationY(0.0f);
        } else {
            this.f31212b.setTranslationY(i);
        }
        View view = this.f31214d;
        if (view != null) {
            view.setTranslationY(Math.max(0, i));
        }
        View view2 = this.f31215e;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i));
        }
    }

    @Override // p000.cwd
    public void onActionDown(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f31211a.getLeft(), -this.f31211a.getTop());
        View view = this.f31213c;
        View view2 = this.f31211a;
        if (view != view2) {
            this.f31213c = m9504b(view2, pointF, view);
        }
        if (this.f31213c == this.f31211a) {
            this.f31210F.f1674a = null;
        } else {
            this.f31210F.f1674a = pointF;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f31216f) * this.f31213c.getScaleY();
            View view = this.f31213c;
            if (view instanceof AbsListView) {
                yrf.scrollListBy((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f31216f = iIntValue;
    }

    @Override // p000.b03
    public void onCoordinatorUpdate(boolean z, boolean z2) {
        this.f31217m = z;
        this.f31209C = z2;
    }

    @Override // p000.cwd
    public ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i) {
        View view = this.f31213c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.f31213c.canScrollVertically(-1))) {
            return null;
        }
        this.f31216f = i;
        return this;
    }

    @Override // p000.cwd
    public void setEnableLoadMoreWhenContentNotFull(boolean z) {
        this.f31210F.f1676c = z;
    }

    @Override // p000.cwd
    public void setScrollBoundaryDecider(jre jreVar) {
        if (jreVar instanceof aif) {
            this.f31210F = (aif) jreVar;
        } else {
            this.f31210F.f1675b = jreVar;
        }
    }

    @Override // p000.cwd
    public void setUpComponent(gwd gwdVar, View view, View view2) {
        m9503a(this.f31211a, gwdVar);
        if (view == null && view2 == null) {
            return;
        }
        this.f31214d = view;
        this.f31215e = view2;
        FrameLayout frameLayout = new FrameLayout(this.f31211a.getContext());
        int iIndexOfChild = gwdVar.getRefreshLayout().getLayout().indexOfChild(this.f31211a);
        gwdVar.getRefreshLayout().getLayout().removeView(this.f31211a);
        frameLayout.addView(this.f31211a, 0, new ViewGroup.LayoutParams(-1, -1));
        gwdVar.getRefreshLayout().getLayout().addView(frameLayout, iIndexOfChild, this.f31211a.getLayoutParams());
        this.f31211a = frameLayout;
        if (view != null) {
            view.setTag(C3941R.id.srl_tag, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = yrf.measureViewHeight(view);
            viewGroup.addView(new Space(this.f31211a.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(C3941R.id.srl_tag, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = yrf.measureViewHeight(view2);
            viewGroup2.addView(new Space(this.f31211a.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }
}
