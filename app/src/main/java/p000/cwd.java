package p000;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface cwd {
    boolean canLoadMore();

    boolean canRefresh();

    @efb
    View getScrollableView();

    @efb
    View getView();

    void moveSpinner(int i, int i2, int i3);

    void onActionDown(MotionEvent motionEvent);

    ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i);

    void setEnableLoadMoreWhenContentNotFull(boolean z);

    void setScrollBoundaryDecider(jre jreVar);

    void setUpComponent(gwd gwdVar, View view, View view2);
}
