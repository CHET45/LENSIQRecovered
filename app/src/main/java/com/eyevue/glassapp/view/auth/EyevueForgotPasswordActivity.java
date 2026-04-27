package com.eyevue.glassapp.view.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.SmsCounter;
import com.eyevue.common.bean.login.UserBean;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C5690fa;
import p000.be3;
import p000.bw5;
import p000.ck9;
import p000.l8g;
import p000.m3h;
import p000.my4;
import p000.tq6;
import p000.ygi;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueForgotPasswordActivity extends BaseActivity<C5690fa> implements ck9.InterfaceC2347b, ck9.InterfaceC2349d {

    /* JADX INFO: renamed from: a2 */
    public static final String f18447a2 = "email";

    /* JADX INFO: renamed from: C */
    public String f18448C;

    /* JADX INFO: renamed from: H */
    public int f18450H;

    /* JADX INFO: renamed from: M */
    public int f18452M;

    /* JADX INFO: renamed from: M1 */
    public int f18453M1;

    /* JADX INFO: renamed from: Q */
    public int f18455Q;

    /* JADX INFO: renamed from: Y */
    public int f18458Y;

    /* JADX INFO: renamed from: c */
    public my4 f18463c;

    /* JADX INFO: renamed from: d */
    public bw5 f18464d;

    /* JADX INFO: renamed from: e */
    public SmsCounter f18465e;

    /* JADX INFO: renamed from: f */
    public ygi f18466f;

    /* JADX INFO: renamed from: m */
    public CountDownTimer f18467m;

    /* JADX INFO: renamed from: a */
    public boolean f18461a = true;

    /* JADX INFO: renamed from: b */
    public boolean f18462b = true;

    /* JADX INFO: renamed from: F */
    public final View.OnFocusChangeListener f18449F = new ViewOnFocusChangeListenerC2729b();

    /* JADX INFO: renamed from: L */
    public final TextWatcher f18451L = new C2730c();

    /* JADX INFO: renamed from: N */
    public final TextWatcher f18454N = new C2731d();

    /* JADX INFO: renamed from: X */
    public final TextWatcher f18457X = new C2732e();

    /* JADX INFO: renamed from: Z */
    public final TextWatcher f18459Z = new C2733f();

    /* JADX INFO: renamed from: V1 */
    public final TextWatcher f18456V1 = new C2734g();

    /* JADX INFO: renamed from: Z1 */
    public final View.OnClickListener f18460Z1 = new View.OnClickListener() { // from class: nm5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f64987a.lambda$new$1(view);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$a */
    public class CountDownTimerC2728a extends CountDownTimer {
        public CountDownTimerC2728a(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Log.i("sms", "-onFinish- ");
            SmsCounter smsCounter = new SmsCounter(0, 0);
            EyevueForgotPasswordActivity.this.f18467m = null;
            EyevueForgotPasswordActivity.this.showSmsCounterUI(smsCounter);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            EyevueForgotPasswordActivity.this.showSmsCounterUI(new SmsCounter(1, (int) (millisUntilFinished / 1000)));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$b */
    public class ViewOnFocusChangeListenerC2729b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2729b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                return;
            }
            if (v == ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35809e) {
                if (tq6.checkEmail(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35809e.getText().toString().trim()) || l8g.isEmpty(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35809e.getText().toString().trim())) {
                    return;
                }
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity).binding).f35809e, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
                return;
            }
            if (v == ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35811m) {
                if (tq6.checkSmsCode(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35811m.getText().toString().trim()) || l8g.isEmpty(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35811m.getText().toString().trim())) {
                    return;
                }
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity2 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity2.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity2).binding).f35811m, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_sms_code_tips_format_err));
                return;
            }
            if (v == ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f) {
                String strTrim = ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f.getText().toString().trim();
                if (tq6.checkPassword(strTrim)) {
                    return;
                }
                if (strTrim.length() < 6 || strTrim.length() > 12) {
                    EyevueForgotPasswordActivity eyevueForgotPasswordActivity3 = EyevueForgotPasswordActivity.this;
                    eyevueForgotPasswordActivity3.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity3).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
                    return;
                } else {
                    EyevueForgotPasswordActivity eyevueForgotPasswordActivity4 = EyevueForgotPasswordActivity.this;
                    eyevueForgotPasswordActivity4.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity4).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_input_password_tips));
                    return;
                }
            }
            if (v == ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d) {
                String strTrim2 = ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d.getText().toString().trim();
                if (tq6.checkPassword(strTrim2)) {
                    return;
                }
                if (strTrim2.length() < 6 || strTrim2.length() > 12) {
                    EyevueForgotPasswordActivity eyevueForgotPasswordActivity5 = EyevueForgotPasswordActivity.this;
                    eyevueForgotPasswordActivity5.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity5).binding).f35808d, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
                } else {
                    EyevueForgotPasswordActivity eyevueForgotPasswordActivity6 = EyevueForgotPasswordActivity.this;
                    eyevueForgotPasswordActivity6.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity6).binding).f35808d, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_input_password_tips));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$c */
    public class C2730c extends be3 {
        public C2730c() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35806b.setEnabled(tq6.checkPassword(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f.getText().toString().trim()) && tq6.checkPassword(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d.getText().toString().trim()) && ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f.getText().toString().trim().equals(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d.getText().toString().trim()));
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueForgotPasswordActivity.this.f18450H = count;
            EyevueForgotPasswordActivity.this.setHighLightButton();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$d */
    public class C2731d extends be3 {
        public C2731d() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (l8g.isEmpty(s)) {
                return;
            }
            String string = s.toString();
            if (tq6.checkPhoneNumber(string) || tq6.checkEmail(string) || string.length() < 11) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity).binding).f35809e, null);
            } else {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity2 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity2.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity2).binding).f35809e, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_phone_tips_format_err));
            }
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueForgotPasswordActivity.this.f18452M = count;
            EyevueForgotPasswordActivity.this.setHighLightButton();
            if (EyevueForgotPasswordActivity.this.f18452M > 0) {
                ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35796F.setVisibility(0);
            } else {
                ((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35796F.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$e */
    public class C2732e extends be3 {
        public C2732e() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (l8g.isEmpty(s)) {
                return;
            }
            String string = s.toString();
            if (tq6.checkSmsCode(string) || string.length() < 4) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity).binding).f35811m, null);
            } else {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity2 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity2.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity2).binding).f35811m, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_sms_code_tips_format_err));
            }
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            super.onTextChanged(s, start, before, count);
            EyevueForgotPasswordActivity.this.f18455Q = count;
            EyevueForgotPasswordActivity.this.setHighLightButton();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$f */
    public class C2733f extends be3 {
        public C2733f() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null) {
                return;
            }
            String string = s.toString();
            boolean zCheckPassword = tq6.checkPassword(string);
            if (zCheckPassword || string.length() < 6) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity).binding).f35810f, null);
                return;
            }
            if (!zCheckPassword && string.length() > 12) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity2 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity2.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity2).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
            } else if (!zCheckPassword && string.length() > 6 && string.length() < 12) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity3 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity3.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity3).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_input_password_tips));
            } else {
                if (((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d.getText().toString().trim().equals(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f.getText().toString().trim())) {
                    return;
                }
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity4 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity4.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity4).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_verify_same));
            }
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueForgotPasswordActivity.this.f18458Y = count;
            EyevueForgotPasswordActivity.this.setHighLightButton();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueForgotPasswordActivity$g */
    public class C2734g extends be3 {
        public C2734g() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null) {
                return;
            }
            String string = s.toString();
            boolean zCheckPassword = tq6.checkPassword(string);
            if (zCheckPassword || string.length() < 6) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity).binding).f35808d, null);
                return;
            }
            if (!zCheckPassword && string.length() > 12) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity2 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity2.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity2).binding).f35808d, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_password_tips_format_err));
            } else if (!zCheckPassword && string.length() > 6 && string.length() < 12) {
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity3 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity3.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity3).binding).f35808d, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_input_password_tips));
            } else {
                if (((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35808d.getText().toString().trim().equals(((C5690fa) ((BaseActivity) EyevueForgotPasswordActivity.this).binding).f35810f.getText().toString().trim())) {
                    return;
                }
                EyevueForgotPasswordActivity eyevueForgotPasswordActivity4 = EyevueForgotPasswordActivity.this;
                eyevueForgotPasswordActivity4.showEditError(((C5690fa) ((BaseActivity) eyevueForgotPasswordActivity4).binding).f35810f, EyevueForgotPasswordActivity.this.getString(C2531R.string.eyevue_verify_same));
            }
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EyevueForgotPasswordActivity.this.f18453M1 = count;
            EyevueForgotPasswordActivity.this.setHighLightButton();
        }
    }

    private void handleSendSmsCodeClick() {
        String strTrim = ((C5690fa) this.binding).f35809e.getText().toString().trim();
        if (!tq6.checkEmail(strTrim)) {
            m3h.showToastShort(getString(C2531R.string.eyevue_phone_tips_format_err));
            return;
        }
        SmsCounter smsCounter = this.f18465e;
        if (smsCounter == null || smsCounter.getOp() == 0) {
            this.f18463c.requestData(strTrim);
            startCountDownActual();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        handleSendSmsCodeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        T t = this.binding;
        if (view == ((C5690fa) t).f35795C) {
            finish();
            return;
        }
        if (view == ((C5690fa) t).f35798L) {
            this.f18461a = !this.f18461a;
            updateNewEditPwdState();
            return;
        }
        if (view == ((C5690fa) t).f35797H) {
            this.f18462b = !this.f18462b;
            updateConfirmEditPwdState();
            return;
        }
        if (view != ((C5690fa) t).f35806b) {
            if (view == ((C5690fa) t).f35796F) {
                ((C5690fa) t).f35809e.setText("");
                return;
            }
            return;
        }
        String strTrim = ((C5690fa) t).f35809e.getText().toString().trim();
        String strTrim2 = ((C5690fa) this.binding).f35811m.getText().toString().trim();
        String strTrim3 = ((C5690fa) this.binding).f35810f.getText().toString().trim();
        String strTrim4 = ((C5690fa) this.binding).f35808d.getText().toString().trim();
        if (!tq6.checkEmail(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3) || TextUtils.isEmpty(strTrim4)) {
            return;
        }
        UserBean userBean = new UserBean();
        userBean.setEmail(strTrim);
        userBean.setCode(strTrim2);
        userBean.setPassword(strTrim4);
        this.f18464d.requestData(userBean);
        if (this.f18466f == null) {
            this.f18466f = new ygi(this);
        }
        this.f18466f.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighLightButton() {
        if (this.f18450H <= 0 || this.f18453M1 <= 0 || this.f18452M <= 0 || this.f18458Y <= 0 || this.f18455Q <= 0) {
            ((C5690fa) this.binding).f35806b.setBackgroundResource(C2531R.drawable.bg_btn_main);
            ((C5690fa) this.binding).f35806b.setTextColor(getColor(C2531R.color.color_voice_notes_text));
        } else {
            ((C5690fa) this.binding).f35806b.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
            ((C5690fa) this.binding).f35806b.setTextColor(getColor(C2531R.color.black));
        }
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
        this.f18465e = counter;
        int op = counter.getOp();
        if (op == 0) {
            ((C5690fa) this.binding).f35802X.setText(getString(C2531R.string.eyevue_send_verification_code));
            ((C5690fa) this.binding).f35802X.setEnabled(true);
            return;
        }
        if (op == 1) {
            ((C5690fa) this.binding).f35802X.setTextColor(getResources().getColor(C2531R.color.base_blue));
            ((C5690fa) this.binding).f35802X.setEnabled(false);
            String str = Math.round(counter.getTime()) + "s";
            StringBuilder sb = new StringBuilder();
            sb.append("-onCountDown- timeFormat = ");
            sb.append(str);
            ((C5690fa) this.binding).f35802X.setText(getString(C2531R.string.eyevue_resend_sms_code, str));
            return;
        }
        if (op == 2) {
            if (this.f18466f == null) {
                this.f18466f = new ygi(this);
            }
            this.f18466f.show();
        } else if (op == 3 || op == 4) {
            ygi ygiVar = this.f18466f;
            if (ygiVar != null) {
                ygiVar.dismiss();
            }
            this.f18465e = new SmsCounter(0, 0);
        }
    }

    private void startCountDownActual() {
        showSmsCounterUI(new SmsCounter(1, 60));
        CountDownTimerC2728a countDownTimerC2728a = new CountDownTimerC2728a(60000, 1000L);
        this.f18467m = countDownTimerC2728a;
        countDownTimerC2728a.start();
    }

    private void updateConfirmEditPwdState() {
        if (this.f18462b) {
            ((C5690fa) this.binding).f35797H.setImageResource(C2531R.drawable.ic_password_eye_close);
            ((C5690fa) this.binding).f35808d.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C5690fa) this.binding).f35797H.setImageResource(C2531R.drawable.ic_password_eye_open);
            ((C5690fa) this.binding).f35808d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        Editable text = ((C5690fa) this.binding).f35808d.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }

    private void updateNewEditPwdState() {
        if (this.f18461a) {
            ((C5690fa) this.binding).f35798L.setImageResource(C2531R.drawable.ic_password_eye_close);
            ((C5690fa) this.binding).f35810f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C5690fa) this.binding).f35798L.setImageResource(C2531R.drawable.ic_password_eye_open);
            ((C5690fa) this.binding).f35810f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        Editable text = ((C5690fa) this.binding).f35810f.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C5690fa getViewBinding() {
        return C5690fa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String string = intent.getExtras().getString("email");
        this.f18448C = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("email =");
        sb.append(this.f18448C);
        ((C5690fa) this.binding).f35809e.setText(this.f18448C);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18463c = new my4(this);
        this.f18464d = new bw5(this);
        ((C5690fa) this.binding).f35796F.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35795C.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35809e.addTextChangedListener(this.f18454N);
        ((C5690fa) this.binding).f35809e.setOnFocusChangeListener(this.f18449F);
        ((C5690fa) this.binding).f35811m.addTextChangedListener(this.f18457X);
        ((C5690fa) this.binding).f35811m.setOnFocusChangeListener(this.f18449F);
        ((C5690fa) this.binding).f35810f.addTextChangedListener(this.f18459Z);
        ((C5690fa) this.binding).f35810f.setOnFocusChangeListener(this.f18449F);
        ((C5690fa) this.binding).f35808d.addTextChangedListener(this.f18456V1);
        ((C5690fa) this.binding).f35808d.setOnFocusChangeListener(this.f18449F);
        ((C5690fa) this.binding).f35810f.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35808d.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35810f.addTextChangedListener(this.f18451L);
        ((C5690fa) this.binding).f35808d.addTextChangedListener(this.f18451L);
        ((C5690fa) this.binding).f35806b.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35798L.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35797H.setOnClickListener(this.f18460Z1);
        ((C5690fa) this.binding).f35802X.setOnClickListener(new View.OnClickListener() { // from class: om5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68121a.lambda$initView$0(view);
            }
        });
        updateNewEditPwdState();
        updateConfirmEditPwdState();
    }

    @Override // p000.ck9.InterfaceC2349d
    public void onGetDataFail(String msg) {
        ygi ygiVar = this.f18466f;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        m3h.showToastShort(msg);
    }

    @Override // p000.ck9.InterfaceC2347b
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        showSmsCounterUI(new SmsCounter(3, 0));
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

    @Override // p000.ck9.InterfaceC2349d
    public void onGetDataSuccess(String s) {
        ygi ygiVar = this.f18466f;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (s.equals("200")) {
            m3h.showToastLong(C2531R.string.eyevue_update_password_success);
            startActivity(new Intent(this, (Class<?>) EyevueLoginActivity.class));
        }
    }

    @Override // p000.ck9.InterfaceC2347b
    public void onGetDataFail() {
        showSmsCounterUI(new SmsCounter(4, 0));
    }
}
