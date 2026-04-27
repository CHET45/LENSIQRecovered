package com.eyevue.common.widget.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.loadmore.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import p000.gvd;

/* JADX INFO: loaded from: classes4.dex */
public class LoadMoreRecyclerView extends SmartRefreshLayout {

    /* JADX INFO: renamed from: y3 */
    public BaseRecyclerView f18109y3;

    /* JADX INFO: renamed from: z3 */
    public boolean f18110z3;

    public LoadMoreRecyclerView(Context context) {
        super(context);
        this.f18110z3 = true;
        addDefaultView(context);
    }

    private void addDefaultView(Context context) {
        addView(createHeader(context));
        addView(createFooter(context));
        addView(createRecyclerView(context));
        setDefaultValue();
    }

    private ClassicsFooter createFooter(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ClassicsFooter classicsFooter = new ClassicsFooter(context);
        classicsFooter.setLayoutParams(layoutParams);
        return classicsFooter;
    }

    private MaterialHeader createHeader(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        MaterialHeader materialHeader = new MaterialHeader(context);
        materialHeader.setSize(1);
        materialHeader.setLayoutParams(layoutParams);
        materialHeader.setColorSchemeColors(getResources().getColor(C2531R.color.base_purple, null), getResources().getColor(C2531R.color.blue_558CFF, null), getResources().getColor(C2531R.color.black, null));
        return materialHeader;
    }

    private View createRecyclerView(Context context) {
        gvd gvdVarInflate = gvd.inflate(LayoutInflater.from(context), this, false);
        this.f18109y3 = gvdVarInflate.f41483b;
        return gvdVarInflate.getRoot();
    }

    private void setDefaultValue() {
        setEnableHeaderTranslationContent(false);
        setEnableAutoLoadMore(true);
        setEnableLoadMoreWhenContentNotFull(false);
    }

    public RecyclerView getRecyclerView() {
        if (this.f18109y3 == null) {
            this.f18109y3 = (BaseRecyclerView) findViewById(C2531R.id.recyclerView);
        }
        return this.f18109y3;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.f18110z3) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    public void removeHeaderView() {
        setEnableRefresh(false);
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f18110z3 = enabled;
    }

    public void updateHasMore(boolean hasMore) {
        setNoMoreData(!hasMore);
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f18110z3 = true;
        addDefaultView(context);
    }
}
