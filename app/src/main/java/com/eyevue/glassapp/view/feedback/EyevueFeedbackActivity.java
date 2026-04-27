package com.eyevue.glassapp.view.feedback;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import com.eyevue.common.bean.feedback.SaveFeedbackBean;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.util.regex.Pattern;
import p000.C5210ea;
import p000.be3;
import p000.hib;
import p000.m3h;
import p000.vp5;
import p000.yp0;
import p000.zp5;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueFeedbackActivity extends BaseActivity<C5210ea> implements vp5.InterfaceC14203b {

    /* JADX INFO: renamed from: d */
    public static final int f18562d = 136;

    /* JADX INFO: renamed from: e */
    public static final String f18563e = "problem_type";

    /* JADX INFO: renamed from: a */
    public FeedbackTypeBean f18564a;

    /* JADX INFO: renamed from: b */
    public zp5 f18565b;

    /* JADX INFO: renamed from: c */
    public TextWatcher f18566c = new C2770b();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.feedback.EyevueFeedbackActivity$a */
    public class C2769a implements TextWatcher {
        public C2769a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            ((C5210ea) ((BaseActivity) EyevueFeedbackActivity.this).binding).f32297b.setEnabled(!TextUtils.isEmpty(((C5210ea) ((BaseActivity) EyevueFeedbackActivity.this).binding).f32301f.getText().toString().trim()));
            if (s.length() > 100) {
                ((C5210ea) ((BaseActivity) EyevueFeedbackActivity.this).binding).f32300e.setFocusable(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.feedback.EyevueFeedbackActivity$b */
    public class C2770b extends be3 {
        public C2770b() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            ((C5210ea) ((BaseActivity) EyevueFeedbackActivity.this).binding).f32297b.setEnabled(!TextUtils.isEmpty(((C5210ea) ((BaseActivity) EyevueFeedbackActivity.this).binding).f32301f.getText().toString().trim()));
        }
    }

    private void handleSubmitClick() {
        if (this.f18564a == null) {
            m3h.showToastShort(getString(C2531R.string.eyevue_select_feedback_type));
            return;
        }
        if (TextUtils.isEmpty(((C5210ea) this.binding).f32300e.getText().toString())) {
            m3h.showToastShort(getString(C2531R.string.eyevue_feedback_comment));
            return;
        }
        if (TextUtils.isEmpty(((C5210ea) this.binding).f32298c.getText().toString())) {
            m3h.showToastShort(getString(C2531R.string.eyevue_feedback_contact));
            return;
        }
        if (!isMobilePhoneNumber(((C5210ea) this.binding).f32298c.getText().toString()) && !isValidateEmail(((C5210ea) this.binding).f32298c.getText().toString())) {
            m3h.showToastShort(getString(C2531R.string.string_please_correct_contact));
            return;
        }
        SaveFeedbackBean saveFeedbackBean = new SaveFeedbackBean();
        saveFeedbackBean.setContent(((C5210ea) this.binding).f32300e.getText().toString());
        saveFeedbackBean.setType(this.f18564a.getType());
        saveFeedbackBean.setContactInfo(((C5210ea) this.binding).f32298c.getText().toString());
        this.f18565b.requestData(saveFeedbackBean);
    }

    public static boolean isMobilePhoneNumber(String str) {
        if (str == null || str.length() != 11) {
            return false;
        }
        return Pattern.compile("^(13[0-9]|14[5-9]|15[0-35-9]|16[6-7]|17[1-8]|18[0-9]|19[135689])\\d{8}$").matcher(str).matches();
    }

    public static boolean isValidateEmail(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        toFeedBackTypeActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        handleSubmitClick();
    }

    private void toFeedBackTypeActivity() {
        startActivityForResult(new Intent(this, (Class<?>) EyevueSelectFeedbackTypeActivity.class), 136);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18565b = new zp5(this);
        ((C5210ea) this.binding).f32302m.setTitle(C2531R.string.me_feedback, this);
        ((C5210ea) this.binding).f32302m.hideBottomLine();
        ((C5210ea) this.binding).f32301f.addTextChangedListener(this.f18566c);
        ((C5210ea) this.binding).f32300e.addTextChangedListener(new C2769a());
        ((C5210ea) this.binding).f32294L.setOnClickListener(new View.OnClickListener() { // from class: lm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f58223a.lambda$initView$0(view);
            }
        });
        ((C5210ea) this.binding).f32297b.setOnClickListener(new View.OnClickListener() { // from class: mm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f61472a.lambda$initView$1(view);
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5210ea getViewBinding() {
        return C5210ea.inflate(getLayoutInflater());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @hib Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null && requestCode == 136) {
            FeedbackTypeBean feedbackTypeBean = (FeedbackTypeBean) data.getSerializableExtra(f18563e);
            this.f18564a = feedbackTypeBean;
            ((C5210ea) this.binding).f32301f.setText(feedbackTypeBean.getLabel());
            ((C5210ea) this.binding).f32301f.setTextColor(getResources().getColor(C2531R.color.base_purple, null));
        }
    }

    @Override // p000.vp5.InterfaceC14203b
    public void onGetDataFail(int code, String msg) {
        m3h.showToastShort(this, C2531R.string.eyevue_feedback_submit_fail);
    }

    @Override // p000.vp5.InterfaceC14203b
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        Log.i("aaaaaaaa", "status =");
        m3h.showToastShort(this, C2531R.string.eyevue_feedback_submit_success);
        finish();
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
