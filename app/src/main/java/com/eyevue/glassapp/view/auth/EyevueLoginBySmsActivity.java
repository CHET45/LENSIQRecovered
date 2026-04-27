package com.eyevue.glassapp.view.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.MainActivity;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C8735la;
import p000.be3;
import p000.efb;
import p000.ek9;
import p000.l8g;
import p000.m3h;
import p000.qt2;
import p000.tq6;
import p000.vfe;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueLoginBySmsActivity extends BaseActivity<C8735la> {

    /* JADX INFO: renamed from: a */
    public int f18496a;

    /* JADX INFO: renamed from: b */
    public int f18497b;

    /* JADX INFO: renamed from: c */
    public final View.OnFocusChangeListener f18498c = new ViewOnFocusChangeListenerC2749f();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$a */
    public class ViewOnClickListenerC2744a implements View.OnClickListener {
        public ViewOnClickListenerC2744a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            vfe.getInstance().putBoolean("SP_KEY_LOGIN_SKIP", true);
            vfe.getInstance().putString("KEY_LOGIN_MOBILE", "");
            if (EyevueLoginBySmsActivity.this.f18496a == 1) {
                EyevueLoginBySmsActivity.this.toHomeActivity();
            } else if (EyevueLoginBySmsActivity.this.f18496a != 2) {
                EyevueLoginBySmsActivity.this.finish();
            } else {
                vfe.getInstance().putBoolean("SP_KEY_TRANS_LOGIN_SKIP", true);
                EyevueLoginBySmsActivity.this.toAiTransActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$b */
    public class C2745b extends be3 {
        public C2745b() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (count > 0) {
                ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56931F.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56931F.setTextColor(EyevueLoginBySmsActivity.this.getColor(C2531R.color.black));
            } else {
                ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56931F.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56931F.setTextColor(EyevueLoginBySmsActivity.this.getColor(C2531R.color.color_main_text));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$c */
    public class ViewOnClickListenerC2746c implements View.OnClickListener {
        public ViewOnClickListenerC2746c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56934c.isChecked()) {
                m3h.showToastLong(EyevueLoginBySmsActivity.this.getString(C2531R.string.eyevue_check_user_privacy));
                return;
            }
            String strTrim = ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56935d.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                m3h.showToastShort(EyevueLoginBySmsActivity.this.getString(C2531R.string.eyevue_hint_input_phone_number));
            } else if (tq6.checkPhoneNumber(strTrim)) {
                EyevueLoginBySmsActivity.this.toVerification(strTrim);
            } else {
                EyevueLoginBySmsActivity eyevueLoginBySmsActivity = EyevueLoginBySmsActivity.this;
                eyevueLoginBySmsActivity.showEditError(((C8735la) ((BaseActivity) eyevueLoginBySmsActivity).binding).f56935d, EyevueLoginBySmsActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$d */
    public class C2747d extends ClickableSpan {
        public C2747d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueLoginBySmsActivity.this.onUserService();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueLoginBySmsActivity.this.getResources().getColor(C2531R.color.color_main_text));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$e */
    public class C2748e extends ClickableSpan {
        public C2748e() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueLoginBySmsActivity.this.onPrivacyPolicy();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueLoginBySmsActivity.this.getResources().getColor(C2531R.color.color_main_text));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginBySmsActivity$f */
    public class ViewOnFocusChangeListenerC2749f implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2749f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus || v != ((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56935d || tq6.checkPhoneNumber(((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56935d.getText().toString().trim()) || l8g.isEmpty(((C8735la) ((BaseActivity) EyevueLoginBySmsActivity.this).binding).f56935d.getText().toString().trim())) {
                return;
            }
            EyevueLoginBySmsActivity eyevueLoginBySmsActivity = EyevueLoginBySmsActivity.this;
            eyevueLoginBySmsActivity.showEditError(((C8735la) ((BaseActivity) eyevueLoginBySmsActivity).binding).f56935d, EyevueLoginBySmsActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
        }
    }

    private void initUserServiceView() {
        String string = getString(C2531R.string.eyevue_privacy_tip_content);
        String string2 = getString(C2531R.string.eyevue_user_service_name);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C2747d(), iIndexOf, length, 33);
        String string3 = getString(C2531R.string.eyevue_privacy_policy_name);
        int iIndexOf2 = string.indexOf(string3);
        spannableString.setSpan(new C2748e(), iIndexOf2, string3.length() + iIndexOf2, 33);
        ((C8735la) this.binding).f56930C.append(spannableString);
        ((C8735la) this.binding).f56930C.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        ((C8735la) this.binding).f56935d.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrivacyPolicy() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", false);
        bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserService() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", true);
        bundle.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEditError(EditText editText, String error) {
        if (editText == null) {
            return;
        }
        editText.setError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toAiTransActivity() {
        startActivity(new Intent(this, ek9.getActivityClassByCode(this.f18497b)));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toHomeActivity() {
        vfe.getInstance().putBoolean("KEY_RETRY_CONNECT_FIRST", true);
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toVerification(String mobile) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, (Class<?>) EyevueVerificationSmsActivity.class);
        bundle.putString("mobile", mobile);
        bundle.putInt(qt2.f75577a, this.f18496a);
        bundle.putInt(qt2.f75578b, this.f18497b);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else {
            this.f18496a = intent.getIntExtra(qt2.f75577a, 0);
            this.f18497b = intent.getIntExtra(qt2.f75578b, 0);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        initUserServiceView();
        ((C8735la) this.binding).f56938m.setOnClickListener(new ViewOnClickListenerC2744a());
        ((C8735la) this.binding).f56936e.setOnClickListener(new View.OnClickListener() { // from class: ln5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f58295a.lambda$initView$0(view);
            }
        });
        ((C8735la) this.binding).f56935d.setOnFocusChangeListener(this.f18498c);
        ((C8735la) this.binding).f56935d.addTextChangedListener(new C2745b());
        ((C8735la) this.binding).f56931F.setOnClickListener(new ViewOnClickListenerC2746c());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C8735la getViewBinding() {
        return C8735la.inflate(getLayoutInflater());
    }
}
