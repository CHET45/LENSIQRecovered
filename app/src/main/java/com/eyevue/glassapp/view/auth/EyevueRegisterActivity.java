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
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.SmsCounter;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C11394qa;
import p000.axd;
import p000.be3;
import p000.ck9;
import p000.efb;
import p000.l8g;
import p000.m3h;
import p000.my4;
import p000.tq6;
import p000.vfe;
import p000.ygi;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueRegisterActivity extends BaseActivity<C11394qa> implements ck9.InterfaceC2347b, ck9.InterfaceC2357l {

    /* JADX INFO: renamed from: F */
    public int f18506F;

    /* JADX INFO: renamed from: L */
    public int f18508L;

    /* JADX INFO: renamed from: c */
    public my4 f18516c;

    /* JADX INFO: renamed from: d */
    public axd f18517d;

    /* JADX INFO: renamed from: e */
    public SmsCounter f18518e;

    /* JADX INFO: renamed from: f */
    public ygi f18519f;

    /* JADX INFO: renamed from: m */
    public CountDownTimer f18520m;

    /* JADX INFO: renamed from: a */
    public boolean f18514a = true;

    /* JADX INFO: renamed from: b */
    public boolean f18515b = true;

    /* JADX INFO: renamed from: C */
    public final View.OnFocusChangeListener f18505C = new ViewOnFocusChangeListenerC2751b();

    /* JADX INFO: renamed from: H */
    public final TextWatcher f18507H = new C2752c();

    /* JADX INFO: renamed from: M */
    public final TextWatcher f18509M = new C2753d();

    /* JADX INFO: renamed from: N */
    public final TextWatcher f18510N = new C2754e();

    /* JADX INFO: renamed from: Q */
    public final TextWatcher f18511Q = new C2755f();

    /* JADX INFO: renamed from: X */
    public final TextWatcher f18512X = new C2756g();

    /* JADX INFO: renamed from: Y */
    public final View.OnClickListener f18513Y = new View.OnClickListener() { // from class: wn5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f94823a.lambda$new$1(view);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$a */
    public class CountDownTimerC2750a extends CountDownTimer {
        public CountDownTimerC2750a(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Log.i("sms", "-onFinish- ");
            SmsCounter smsCounter = new SmsCounter(0, 0);
            EyevueRegisterActivity.this.f18520m = null;
            EyevueRegisterActivity.this.showSmsCounterUI(smsCounter);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            EyevueRegisterActivity.this.showSmsCounterUI(new SmsCounter(1, (int) (millisUntilFinished / 1000)));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$b */
    public class ViewOnFocusChangeListenerC2751b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2751b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus || v != ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73725f || tq6.checkEmail(((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73725f.getText().toString().trim()) || l8g.isEmpty(((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73725f.getText().toString().trim())) {
                return;
            }
            EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
            eyevueRegisterActivity.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity).binding).f73725f, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$c */
    public class C2752c extends be3 {
        public C2752c() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setEnabled(true);
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueRegisterActivity.this.f18506F = count;
            if (EyevueRegisterActivity.this.f18506F <= 0 || EyevueRegisterActivity.this.f18508L <= 0) {
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setTextColor(EyevueRegisterActivity.this.getColor(C2531R.color.color_voice_notes_text));
            } else {
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setTextColor(EyevueRegisterActivity.this.getColor(C2531R.color.black));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$d */
    public class C2753d extends be3 {
        public C2753d() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (l8g.isEmpty(s)) {
                return;
            }
            String string = s.toString();
            if (tq6.checkEmail(string) || string.length() < 11) {
                EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
                eyevueRegisterActivity.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity).binding).f73725f, null);
            } else {
                EyevueRegisterActivity eyevueRegisterActivity2 = EyevueRegisterActivity.this;
                eyevueRegisterActivity2.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity2).binding).f73725f, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
            }
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueRegisterActivity.this.f18508L = count;
            if (EyevueRegisterActivity.this.f18506F <= 0 || EyevueRegisterActivity.this.f18508L <= 0) {
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setTextColor(EyevueRegisterActivity.this.getColor(C2531R.color.color_voice_notes_text));
            } else {
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73720b.setTextColor(EyevueRegisterActivity.this.getColor(C2531R.color.black));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$e */
    public class C2754e extends be3 {
        public C2754e() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (l8g.isEmpty(s)) {
                return;
            }
            String string = s.toString();
            if (tq6.checkSmsCode(string) || string.length() < 4) {
                EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
                eyevueRegisterActivity.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity).binding).f73705C, null);
            } else {
                EyevueRegisterActivity eyevueRegisterActivity2 = EyevueRegisterActivity.this;
                eyevueRegisterActivity2.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity2).binding).f73705C, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_sms_code_tips_format_err));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$f */
    public class C2755f extends be3 {
        public C2755f() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null) {
                return;
            }
            String string = s.toString();
            boolean zCheckPassword = tq6.checkPassword(string);
            if (zCheckPassword || string.length() < 6) {
                EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
                eyevueRegisterActivity.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity).binding).f73726m, null);
                return;
            }
            if (!zCheckPassword && string.length() > 12) {
                EyevueRegisterActivity eyevueRegisterActivity2 = EyevueRegisterActivity.this;
                eyevueRegisterActivity2.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity2).binding).f73726m, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
            } else if (!zCheckPassword && string.length() > 6 && string.length() < 12) {
                EyevueRegisterActivity eyevueRegisterActivity3 = EyevueRegisterActivity.this;
                eyevueRegisterActivity3.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity3).binding).f73726m, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_input_password_tips));
            } else {
                if (((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73724e.getText().toString().trim().equals(((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73726m.getText().toString().trim())) {
                    return;
                }
                EyevueRegisterActivity eyevueRegisterActivity4 = EyevueRegisterActivity.this;
                eyevueRegisterActivity4.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity4).binding).f73726m, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_verify_same));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$g */
    public class C2756g extends be3 {
        public C2756g() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null) {
                return;
            }
            String string = s.toString();
            boolean zCheckPassword = tq6.checkPassword(string);
            if (zCheckPassword || string.length() < 6) {
                EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
                eyevueRegisterActivity.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity).binding).f73724e, null);
                return;
            }
            if (!zCheckPassword && string.length() > 12) {
                EyevueRegisterActivity eyevueRegisterActivity2 = EyevueRegisterActivity.this;
                eyevueRegisterActivity2.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity2).binding).f73724e, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
            } else if (!zCheckPassword && string.length() > 6 && string.length() < 12) {
                EyevueRegisterActivity eyevueRegisterActivity3 = EyevueRegisterActivity.this;
                eyevueRegisterActivity3.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity3).binding).f73724e, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_input_password_tips));
            } else {
                if (((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73724e.getText().toString().trim().equals(((C11394qa) ((BaseActivity) EyevueRegisterActivity.this).binding).f73726m.getText().toString().trim())) {
                    return;
                }
                EyevueRegisterActivity eyevueRegisterActivity4 = EyevueRegisterActivity.this;
                eyevueRegisterActivity4.showEditError(((C11394qa) ((BaseActivity) eyevueRegisterActivity4).binding).f73724e, EyevueRegisterActivity.this.getString(C2531R.string.eyevue_verify_same));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$h */
    public class C2757h extends ClickableSpan {
        public C2757h() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
            eyevueRegisterActivity.onUserService(eyevueRegisterActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueRegisterActivity.this.getResources().getColor(C2531R.color.base_blue));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueRegisterActivity$i */
    public class C2758i extends ClickableSpan {
        public C2758i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            EyevueRegisterActivity eyevueRegisterActivity = EyevueRegisterActivity.this;
            eyevueRegisterActivity.onPrivacyPolicy(eyevueRegisterActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(EyevueRegisterActivity.this.getResources().getColor(C2531R.color.base_blue));
            ds.setUnderlineText(false);
        }
    }

    private void handleSendSmsCodeClick() {
        String strTrim = ((C11394qa) this.binding).f73725f.getText().toString().trim();
        if (!tq6.checkEmail(strTrim)) {
            m3h.showToastLong(C2531R.string.eyevue_phone_tips_format_err);
            return;
        }
        SmsCounter smsCounter = this.f18518e;
        if (smsCounter == null || smsCounter.getOp() == 0) {
            this.f18516c.requestData(strTrim);
            startCountDownActual();
        }
    }

    private void initUserServiceView() {
        String string = getString(C2531R.string.eyevue_privacy_tip_content);
        String string2 = getString(C2531R.string.eyevue_user_service_name);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C2757h(), iIndexOf, length, 33);
        String string3 = getString(C2531R.string.eyevue_privacy_policy_name);
        int iIndexOf2 = string.indexOf(string3);
        spannableString.setSpan(new C2758i(), iIndexOf2, string3.length() + iIndexOf2, 33);
        ((C11394qa) this.binding).f73713V1.append(spannableString);
        ((C11394qa) this.binding).f73713V1.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        T t = this.binding;
        if (view == ((C11394qa) t).f73711N) {
            this.f18514a = !this.f18514a;
            updateNewEditPwdState();
            return;
        }
        if (view == ((C11394qa) t).f73709M) {
            this.f18515b = !this.f18515b;
            updateConfirmEditPwdState();
            return;
        }
        if (view == ((C11394qa) t).f73706F) {
            toLogin();
            return;
        }
        if (view == ((C11394qa) t).f73720b) {
            String strTrim = ((C11394qa) t).f73725f.getText().toString().trim();
            String strTrim2 = ((C11394qa) this.binding).f73726m.getText().toString().trim();
            String strTrim3 = ((C11394qa) this.binding).f73724e.getText().toString().trim();
            if (!TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim3) && !strTrim2.equals(strTrim3)) {
                m3h.showToastShort(getString(C2531R.string.eyevue_verify_same));
                return;
            }
            if (!tq6.checkEmail(strTrim) || TextUtils.isEmpty("999999")) {
                return;
            }
            UserBean userBean = new UserBean();
            userBean.setEmail(strTrim);
            userBean.setCode("999999");
            userBean.setPassword(strTrim2);
            this.f18517d.requestData(userBean);
            if (this.f18519f == null) {
                this.f18519f = new ygi(this);
            }
            this.f18519f.show();
        }
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
    public void showSmsCounterUI(SmsCounter counter) {
        this.f18518e = counter;
        int op = counter.getOp();
        if (op == 0) {
            ((C11394qa) this.binding).f73717Z1.setText(getString(C2531R.string.eyevue_send_verification_code));
            ((C11394qa) this.binding).f73717Z1.setEnabled(true);
            return;
        }
        if (op == 1) {
            ((C11394qa) this.binding).f73717Z1.setTextColor(getResources().getColor(C2531R.color.base_blue));
            ((C11394qa) this.binding).f73717Z1.setEnabled(false);
            String str = Math.round(counter.getTime()) + "s";
            StringBuilder sb = new StringBuilder();
            sb.append("-onCountDown- timeFormat = ");
            sb.append(str);
            ((C11394qa) this.binding).f73717Z1.setText(getString(C2531R.string.eyevue_resend_sms_code, str));
            return;
        }
        if (op == 2) {
            if (this.f18519f == null) {
                this.f18519f = new ygi(this);
            }
            this.f18519f.show();
        } else if (op == 3 || op == 4) {
            ygi ygiVar = this.f18519f;
            if (ygiVar != null) {
                ygiVar.dismiss();
            }
            this.f18518e = new SmsCounter(0, 0);
        }
    }

    private void startCountDownActual() {
        showSmsCounterUI(new SmsCounter(1, 60));
        CountDownTimerC2750a countDownTimerC2750a = new CountDownTimerC2750a(60000, 1000L);
        this.f18520m = countDownTimerC2750a;
        countDownTimerC2750a.start();
    }

    private void toLogin() {
        startActivity(new Intent(this, (Class<?>) EyevueLoginActivity.class));
    }

    private void updateConfirmEditPwdState() {
        if (this.f18515b) {
            ((C11394qa) this.binding).f73709M.setImageResource(C2531R.drawable.ic_password_eye_close);
            ((C11394qa) this.binding).f73724e.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C11394qa) this.binding).f73709M.setImageResource(C2531R.drawable.ic_password_eye_open);
            ((C11394qa) this.binding).f73724e.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        Editable text = ((C11394qa) this.binding).f73724e.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }

    private void updateNewEditPwdState() {
        if (this.f18514a) {
            ((C11394qa) this.binding).f73711N.setImageResource(C2531R.drawable.ic_password_eye_close);
            ((C11394qa) this.binding).f73726m.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C11394qa) this.binding).f73711N.setImageResource(C2531R.drawable.ic_password_eye_open);
            ((C11394qa) this.binding).f73726m.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        Editable text = ((C11394qa) this.binding).f73726m.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public C11394qa getViewBinding() {
        return C11394qa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18516c = new my4(this);
        this.f18517d = new axd(this);
        ((C11394qa) this.binding).f73725f.addTextChangedListener(this.f18509M);
        ((C11394qa) this.binding).f73725f.setOnFocusChangeListener(this.f18505C);
        ((C11394qa) this.binding).f73726m.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73724e.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73726m.addTextChangedListener(this.f18507H);
        ((C11394qa) this.binding).f73724e.addTextChangedListener(this.f18507H);
        ((C11394qa) this.binding).f73720b.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73711N.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73709M.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73706F.setOnClickListener(this.f18513Y);
        ((C11394qa) this.binding).f73708L.setOnClickListener(new View.OnClickListener() { // from class: vn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91775a.lambda$initView$0(view);
            }
        });
        updateNewEditPwdState();
        updateConfirmEditPwdState();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p000.ck9.InterfaceC2357l
    public void onGetDataFail(int code, String msg) {
        ygi ygiVar = this.f18519f;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (!TextUtils.isEmpty(msg)) {
            m3h.showToastLong(msg);
        }
        if (code == 10023) {
            String strTrim = ((C11394qa) this.binding).f73725f.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            vfe.getInstance().putString("SP_KEY_REGISTER_EMAIL", strTrim);
        }
    }

    @Override // p000.ck9.InterfaceC2347b
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        showSmsCounterUI(new SmsCounter(3, 0));
        ygi ygiVar = this.f18519f;
        if (ygiVar != null) {
            ygiVar.dismiss();
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
        vfe.getInstance().putString("SP_KEY_REGISTER_EMAIL", "");
    }

    @Override // p000.ck9.InterfaceC2357l
    public void onGetDataSuccess(int code, UserTokenBean userTokenVO) {
        ygi ygiVar = this.f18519f;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (code == 200) {
            if (userTokenVO != null) {
                vfe.getInstance().putString("KEY_TOKEN", userTokenVO.getAccessToken());
                vfe.getInstance().putString("SP_KEY_REFRESH_TOKEN", userTokenVO.getRefreshToken());
            }
            m3h.showToastLong(C2531R.string.eyevue_register_sucess);
            String strTrim = ((C11394qa) this.binding).f73725f.getText().toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                vfe.getInstance().putString("SP_KEY_REGISTER_EMAIL", strTrim);
            }
            finish();
        }
    }

    @Override // p000.ck9.InterfaceC2347b
    public void onGetDataFail() {
        showSmsCounterUI(new SmsCounter(4, 0));
    }
}
