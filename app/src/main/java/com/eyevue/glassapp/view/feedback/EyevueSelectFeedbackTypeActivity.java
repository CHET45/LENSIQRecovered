package com.eyevue.glassapp.view.feedback;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.util.ArrayList;
import java.util.List;
import p000.C11960ra;
import p000.bq5;
import p000.cq5;
import p000.g3c;
import p000.m3h;
import p000.mt0;
import p000.nc2;
import p000.ubb;
import p000.vp5;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueSelectFeedbackTypeActivity extends BaseActivity<C11960ra> implements vp5.InterfaceC14205d {

    /* JADX INFO: renamed from: a */
    public bq5 f18569a;

    /* JADX INFO: renamed from: b */
    public cq5 f18570b;

    /* JADX INFO: renamed from: c */
    public List<FeedbackTypeBean> f18571c;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.feedback.EyevueSelectFeedbackTypeActivity$a */
    public class ViewOnClickListenerC2771a implements View.OnClickListener {
        public ViewOnClickListenerC2771a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ubb.isNetworkAvailable(EyevueSelectFeedbackTypeActivity.this)) {
                m3h.showToastShort(EyevueSelectFeedbackTypeActivity.this.getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
            } else {
                ((C11960ra) ((BaseActivity) EyevueSelectFeedbackTypeActivity.this).binding).f77499b.setVisibility(8);
                EyevueSelectFeedbackTypeActivity.this.f18569a.requestData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(mt0 mt0Var, View view, int i) {
        FeedbackTypeBean item = this.f18570b.getItem(i);
        Intent intent = new Intent();
        intent.putExtra(EyevueFeedbackActivity.f18563e, item);
        setResult(-1, intent);
        finish();
    }

    private void setLocalData() {
        this.f18571c = new ArrayList();
        FeedbackTypeBean feedbackTypeBean = new FeedbackTypeBean();
        feedbackTypeBean.setLabel(getString(C2531R.string.eyevue_feedback_type_one));
        feedbackTypeBean.setType("7");
        this.f18571c.add(feedbackTypeBean);
        FeedbackTypeBean feedbackTypeBean2 = new FeedbackTypeBean();
        feedbackTypeBean2.setLabel(getString(C2531R.string.eyevue_feedback_type_two));
        feedbackTypeBean2.setType("8");
        this.f18571c.add(feedbackTypeBean2);
        FeedbackTypeBean feedbackTypeBean3 = new FeedbackTypeBean();
        feedbackTypeBean3.setLabel(getString(C2531R.string.eyevue_feedback_type_three));
        feedbackTypeBean3.setType("1");
        this.f18571c.add(feedbackTypeBean3);
        ((C11960ra) this.binding).f77499b.setVisibility(8);
        ((C11960ra) this.binding).f77500c.setVisibility(0);
        this.f18570b.setList(this.f18571c);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C11960ra getViewBinding() {
        return C11960ra.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18569a = new bq5(this);
        if (!ubb.isNetworkAvailable(this)) {
            m3h.showToastShort(getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
            ((C11960ra) this.binding).f77499b.setVisibility(0);
        }
        ((C11960ra) this.binding).f77502e.setOnClickListener(new ViewOnClickListenerC2771a());
        this.f18569a.requestData();
        ((C11960ra) this.binding).f77501d.setTitle(C2531R.string.eyevue_feedback_type, this);
        ((C11960ra) this.binding).f77501d.hideBottomLine();
        this.f18570b = new cq5();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        ((C11960ra) this.binding).f77500c.setLayoutManager(linearLayoutManager);
        ((C11960ra) this.binding).f77500c.setAdapter(this.f18570b);
        this.f18570b.setOnItemClickListener(new g3c() { // from class: xn5
            @Override // p000.g3c
            public final void onItemClick(mt0 mt0Var, View view, int i) {
                this.f98566a.lambda$initView$0(mt0Var, view, i);
            }
        });
    }

    @Override // p000.vp5.InterfaceC14205d
    public void onGetDataFail(int code, String msg) {
        setLocalData();
    }

    @Override // p000.vp5.InterfaceC14205d
    public void onGetDataSuccess(List<FeedbackTypeBean> typeBean, boolean isCache, boolean isRefresh) {
        if (nc2.isEmpty(typeBean)) {
            setLocalData();
            return;
        }
        ((C11960ra) this.binding).f77499b.setVisibility(8);
        ((C11960ra) this.binding).f77500c.setVisibility(0);
        this.f18570b.setList(typeBean);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }
}
