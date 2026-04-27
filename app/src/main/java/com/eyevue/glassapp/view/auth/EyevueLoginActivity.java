package com.eyevue.glassapp.view.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.SmsCounter;
import com.eyevue.common.bean.login.UserTokenBean;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.MainActivity;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C8262ka;
import p000.be3;
import p000.ck9;
import p000.dk9;
import p000.efb;
import p000.ek9;
import p000.l8g;
import p000.m3h;
import p000.my4;
import p000.qt2;
import p000.tq6;
import p000.vfe;
import p000.ygi;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueLoginActivity extends BaseActivity<C8262ka> implements ck9.InterfaceC2351f {

    /* JADX INFO: renamed from: C */
    public int f18475C;

    /* JADX INFO: renamed from: F */
    public int f18476F;

    /* JADX INFO: renamed from: H */
    public int f18477H;

    /* JADX INFO: renamed from: a */
    public dk9 f18480a;

    /* JADX INFO: renamed from: b */
    public my4 f18481b;

    /* JADX INFO: renamed from: c */
    public CountDownTimer f18482c;

    /* JADX INFO: renamed from: d */
    public ygi f18483d;

    /* JADX INFO: renamed from: e */
    public SmsCounter f18484e;

    /* JADX INFO: renamed from: m */
    public int f18486m;

    /* JADX INFO: renamed from: f */
    public boolean f18485f = true;

    /* JADX INFO: renamed from: L */
    public TextWatcher f18478L = new C2740f();

    /* JADX INFO: renamed from: M */
    public final View.OnFocusChangeListener f18479M = new ViewOnFocusChangeListenerC2741g();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$a */
    public class C2735a extends be3 {
        public C2735a() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueLoginActivity.this.f18476F = count;
            if (EyevueLoginActivity.this.f18476F <= 0 || EyevueLoginActivity.this.f18477H <= 0) {
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setTextColor(EyevueLoginActivity.this.getColor(C2531R.color.color_voice_notes_text));
            } else {
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setTextColor(EyevueLoginActivity.this.getColor(C2531R.color.black));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$b */
    public class C2736b extends be3 {
        public C2736b() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueLoginActivity.this.f18477H = count;
            if (EyevueLoginActivity.this.f18476F <= 0 || EyevueLoginActivity.this.f18477H <= 0) {
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setTextColor(EyevueLoginActivity.this.getColor(C2531R.color.color_voice_notes_text));
            } else {
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setTextColor(EyevueLoginActivity.this.getColor(C2531R.color.black));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$c */
    public class ViewOnClickListenerC2737c implements View.OnClickListener {
        public ViewOnClickListenerC2737c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            vfe.getInstance().putBoolean("SP_KEY_LOGIN_SKIP", true);
            vfe.getInstance().putString("SP_KEY_REGISTER_EMAIL", "");
            if (EyevueLoginActivity.this.f18486m == 1) {
                EyevueLoginActivity.this.toHomeActivity();
            } else if (EyevueLoginActivity.this.f18486m != 2) {
                EyevueLoginActivity.this.finish();
            } else {
                vfe.getInstance().putBoolean("SP_KEY_TRANS_LOGIN_SKIP", true);
                EyevueLoginActivity.this.toAiTransActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$d */
    public class ViewOnClickListenerC2738d implements View.OnClickListener {
        public ViewOnClickListenerC2738d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueLoginActivity.this.toForgetPasswordActivity();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$e */
    public class ViewOnClickListenerC2739e implements View.OnClickListener {
        public ViewOnClickListenerC2739e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueLoginActivity.this.toRegisterActivity();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$f */
    public class C2740f extends be3 {
        public C2740f() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53410c.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$g */
    public class ViewOnFocusChangeListenerC2741g implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2741g() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus || v != ((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53412e || tq6.checkEmail(((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53412e.getText().toString().trim()) || l8g.isEmpty(((C8262ka) ((BaseActivity) EyevueLoginActivity.this).binding).f53412e.getText().toString().trim())) {
                return;
            }
            EyevueLoginActivity eyevueLoginActivity = EyevueLoginActivity.this;
            eyevueLoginActivity.showEditError(((C8262ka) ((BaseActivity) eyevueLoginActivity).binding).f53412e, EyevueLoginActivity.this.getString(C2531R.string.eyevue_email_tips_format_err));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$h */
    public class C2742h extends ClickableSpan {
        public C2742h() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueLoginActivity eyevueLoginActivity = EyevueLoginActivity.this;
            eyevueLoginActivity.onUserService(eyevueLoginActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueLoginActivity.this.getResources().getColor(C2531R.color.color_main_text));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueLoginActivity$i */
    public class C2743i extends ClickableSpan {
        public C2743i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueLoginActivity eyevueLoginActivity = EyevueLoginActivity.this;
            eyevueLoginActivity.onPrivacyPolicy(eyevueLoginActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueLoginActivity.this.getResources().getColor(C2531R.color.color_main_text));
            ds.setUnderlineText(false);
        }
    }

    private void initUserServiceView() {
        String string = getString(C2531R.string.eyevue_privacy_tip_content);
        String string2 = getString(C2531R.string.eyevue_user_service_name);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C2742h(), iIndexOf, length, 33);
        String string3 = getString(C2531R.string.eyevue_privacy_policy_name);
        int iIndexOf2 = string.indexOf(string3);
        spannableString.setSpan(new C2743i(), iIndexOf2, string3.length() + iIndexOf2, 33);
        ((C8262ka) this.binding).f53407Q.append(spannableString);
        ((C8262ka) this.binding).f53407Q.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        if (!((C8262ka) this.binding).f53411d.isChecked()) {
            m3h.showToastLong(getString(C2531R.string.eyevue_check_user_privacy));
            return;
        }
        String strTrim = ((C8262ka) this.binding).f53412e.getText().toString().trim();
        String strTrim2 = ((C8262ka) this.binding).f53413f.getText().toString().trim();
        if (!tq6.checkEmail(strTrim) || TextUtils.isEmpty(strTrim2)) {
            return;
        }
        this.f18480a.requestData(strTrim, strTrim2);
        if (this.f18483d == null) {
            this.f18483d = new ygi(this);
        }
        this.f18483d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f18485f = !this.f18485f;
        updateNewEditPwdState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrivacyPolicy(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", false);
        bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserService(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", true);
        bundle.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
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
        startActivity(new Intent(this, ek9.getActivityClassByCode(this.f18475C)));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toForgetPasswordActivity() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, (Class<?>) EyevueForgotPasswordActivity.class);
        bundle.putString("email", ((C8262ka) this.binding).f53412e.getText().toString().trim());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toHomeActivity() {
        vfe.getInstance().putBoolean("KEY_RETRY_CONNECT_FIRST", true);
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toRegisterActivity() {
        startActivity(new Intent(this, (Class<?>) EyevueRegisterActivity.class));
    }

    private void updateNewEditPwdState() {
        StringBuilder sb = new StringBuilder();
        sb.append("updateNewEditPwdState isHidePassword=");
        sb.append(this.f18485f);
        if (this.f18485f) {
            ((C8262ka) this.binding).f53404L.setImageResource(C2531R.drawable.ic_password_eye_close);
            ((C8262ka) this.binding).f53413f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C8262ka) this.binding).f53404L.setImageResource(C2531R.drawable.ic_password_eye_open);
            ((C8262ka) this.binding).f53413f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        Editable text = ((C8262ka) this.binding).f53413f.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C8262ka getViewBinding() {
        return C8262ka.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else {
            this.f18486m = intent.getIntExtra(qt2.f75577a, 0);
            this.f18475C = intent.getIntExtra(qt2.f75578b, 0);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18480a = new dk9(this);
        initUserServiceView();
        ((C8262ka) this.binding).f53412e.addTextChangedListener(this.f18478L);
        ((C8262ka) this.binding).f53412e.setOnFocusChangeListener(this.f18479M);
        ((C8262ka) this.binding).f53413f.addTextChangedListener(this.f18478L);
        ((C8262ka) this.binding).f53412e.addTextChangedListener(new C2735a());
        ((C8262ka) this.binding).f53413f.addTextChangedListener(new C2736b());
        updateNewEditPwdState();
        ((C8262ka) this.binding).f53410c.setOnClickListener(new View.OnClickListener() { // from class: jn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51287a.lambda$initView$0(view);
            }
        });
        ((C8262ka) this.binding).f53405M.setOnClickListener(new ViewOnClickListenerC2737c());
        ((C8262ka) this.binding).f53404L.setOnClickListener(new View.OnClickListener() { // from class: kn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54779a.lambda$initView$1(view);
            }
        });
        ((C8262ka) this.binding).f53414m.setOnClickListener(new ViewOnClickListenerC2738d());
        ((C8262ka) this.binding).f53403H.setOnClickListener(new ViewOnClickListenerC2739e());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vfe.getInstance().putString("SP_KEY_REGISTER_EMAIL", "");
    }

    @Override // p000.ck9.InterfaceC2351f
    public void onGetDataFail(int code, String msg) {
        ygi ygiVar = this.f18483d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msg =");
        sb.append(msg);
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        m3h.showToastLong(msg.toString());
    }

    @Override // p000.ck9.InterfaceC2351f
    public void onGetDataSuccess(UserTokenBean userInfo, boolean isCache, boolean isRefresh) {
        if (userInfo != null) {
            ygi ygiVar = this.f18483d;
            if (ygiVar != null) {
                ygiVar.dismiss();
            }
            m3h.showToastLong(C2531R.string.eyevue_login_success);
            vfe.getInstance().putString("KEY_LOGIN_EMAIL", ((C8262ka) this.binding).f53412e.getText().toString().trim());
            vfe.getInstance().putString("KEY_TOKEN", userInfo.getAccessToken());
            vfe.getInstance().putString("SP_KEY_REFRESH_TOKEN", userInfo.getRefreshToken());
            int i = this.f18486m;
            if (i == 1) {
                toHomeActivity();
            } else if (i == 2) {
                toAiTransActivity();
            } else {
                finish();
            }
        }
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
        String string = vfe.getInstance().getString("SP_KEY_REGISTER_EMAIL");
        StringBuilder sb = new StringBuilder();
        sb.append("registerEmail =");
        sb.append(string);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        ((C8262ka) this.binding).f53412e.setText(string);
    }
}
