package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes6.dex */
public interface hwd {
    boolean autoLoadMore();

    boolean autoLoadMore(int i);

    boolean autoLoadMore(int i, int i2, float f, boolean z);

    boolean autoLoadMoreAnimationOnly();

    boolean autoRefresh();

    boolean autoRefresh(int i);

    boolean autoRefresh(int i, int i2, float f, boolean z);

    boolean autoRefreshAnimationOnly();

    hwd closeHeaderOrFooter();

    hwd finishLoadMore();

    hwd finishLoadMore(int i);

    hwd finishLoadMore(int i, boolean z, boolean z2);

    hwd finishLoadMore(boolean z);

    hwd finishLoadMoreWithNoMoreData();

    hwd finishRefresh();

    hwd finishRefresh(int i);

    hwd finishRefresh(int i, boolean z, Boolean bool);

    hwd finishRefresh(boolean z);

    hwd finishRefreshWithNoMoreData();

    @efb
    ViewGroup getLayout();

    @hib
    ewd getRefreshFooter();

    @hib
    fwd getRefreshHeader();

    @efb
    iwd getState();

    boolean isLoading();

    boolean isRefreshing();

    hwd resetNoMoreData();

    hwd setDisableContentWhenLoading(boolean z);

    hwd setDisableContentWhenRefresh(boolean z);

    hwd setDragRate(@y46(from = 0.0d, m25645to = 1.0d) float f);

    hwd setEnableAutoLoadMore(boolean z);

    hwd setEnableClipFooterWhenFixedBehind(boolean z);

    hwd setEnableClipHeaderWhenFixedBehind(boolean z);

    hwd setEnableFooterFollowWhenNoMoreData(boolean z);

    hwd setEnableFooterTranslationContent(boolean z);

    hwd setEnableHeaderTranslationContent(boolean z);

    hwd setEnableLoadMore(boolean z);

    hwd setEnableLoadMoreWhenContentNotFull(boolean z);

    hwd setEnableNestedScroll(boolean z);

    hwd setEnableOverScrollBounce(boolean z);

    hwd setEnableOverScrollDrag(boolean z);

    hwd setEnablePureScrollMode(boolean z);

    hwd setEnableRefresh(boolean z);

    hwd setEnableScrollContentWhenLoaded(boolean z);

    hwd setEnableScrollContentWhenRefreshed(boolean z);

    hwd setFixedFooterViewId(@kr7 int i);

    hwd setFixedHeaderViewId(@kr7 int i);

    hwd setFooterHeight(float f);

    hwd setFooterHeightPx(int i);

    hwd setFooterInsetStart(float f);

    hwd setFooterInsetStartPx(int i);

    hwd setFooterMaxDragRate(@y46(from = 1.0d, m25645to = 10.0d) float f);

    hwd setFooterTranslationViewId(@kr7 int i);

    hwd setFooterTriggerRate(@y46(from = 0.0d, m25645to = 1.0d) float f);

    hwd setHeaderHeight(float f);

    hwd setHeaderHeightPx(int i);

    hwd setHeaderInsetStart(float f);

    hwd setHeaderInsetStartPx(int i);

    hwd setHeaderMaxDragRate(@y46(from = 1.0d, m25645to = 10.0d) float f);

    hwd setHeaderTranslationViewId(@kr7 int i);

    hwd setHeaderTriggerRate(@y46(from = 0.0d, m25645to = 1.0d) float f);

    hwd setNoMoreData(boolean z);

    hwd setOnLoadMoreListener(p3c p3cVar);

    hwd setOnMultiListener(v3c v3cVar);

    hwd setOnRefreshListener(l4c l4cVar);

    hwd setOnRefreshLoadMoreListener(m4c m4cVar);

    hwd setPrimaryColors(@g92 int... iArr);

    hwd setPrimaryColorsId(@w92 int... iArr);

    hwd setReboundDuration(int i);

    hwd setReboundInterpolator(@efb Interpolator interpolator);

    hwd setRefreshContent(@efb View view);

    hwd setRefreshContent(@efb View view, int i, int i2);

    hwd setRefreshFooter(@efb ewd ewdVar);

    hwd setRefreshFooter(@efb ewd ewdVar, int i, int i2);

    hwd setRefreshHeader(@efb fwd fwdVar);

    hwd setRefreshHeader(@efb fwd fwdVar, int i, int i2);

    hwd setScrollBoundaryDecider(jre jreVar);
}
