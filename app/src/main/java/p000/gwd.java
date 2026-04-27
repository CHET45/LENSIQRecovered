package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public interface gwd {
    ValueAnimator animSpinner(int i);

    gwd finishTwoLevel();

    @efb
    cwd getRefreshContent();

    @efb
    hwd getRefreshLayout();

    gwd moveSpinner(int i, boolean z);

    gwd onAutoLoadMoreAnimationEnd(Animator animator, boolean z);

    gwd onAutoRefreshAnimationEnd(Animator animator, boolean z);

    gwd requestDefaultTranslationContentFor(@efb bwd bwdVar, boolean z);

    gwd requestDrawBackgroundFor(@efb bwd bwdVar, int i);

    gwd requestFloorBottomPullUpToCloseRate(float f);

    gwd requestFloorDuration(int i);

    gwd requestNeedTouchEventFor(@efb bwd bwdVar, boolean z);

    gwd requestRemeasureHeightFor(@efb bwd bwdVar);

    gwd setState(@efb iwd iwdVar);

    gwd startTwoLevel(boolean z);
}
