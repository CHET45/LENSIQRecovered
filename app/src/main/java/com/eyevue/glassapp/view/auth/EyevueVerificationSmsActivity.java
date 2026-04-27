package com.eyevue.glassapp.view.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.blankj.utilcode.util.C2468a;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.SmsCounter;
import com.eyevue.common.bean.login.UserTokenBean;
import com.eyevue.common.widget.verification.VerificationCodeView;
import com.eyevue.glassapp.view.MainActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C15011xa;
import p000.bk9;
import p000.bsf;
import p000.ck9;
import p000.ek9;
import p000.m3h;
import p000.qt2;
import p000.tq6;
import p000.vfe;
import p000.ygi;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueVerificationSmsActivity extends BaseActivity<C15011xa> implements ck9.InterfaceC2361p, ck9.InterfaceC2351f, VerificationCodeView.InterfaceC2550c {

    /* JADX INFO: renamed from: C */
    public String f18530C;

    /* JADX INFO: renamed from: a */
    public bk9 f18531a;

    /* JADX INFO: renamed from: b */
    public bsf f18532b;

    /* JADX INFO: renamed from: c */
    public CountDownTimer f18533c;

    /* JADX INFO: renamed from: d */
    public ygi f18534d;

    /* JADX INFO: renamed from: e */
    public SmsCounter f18535e;

    /* JADX INFO: renamed from: f */
    public int f18536f;

    /* JADX INFO: renamed from: m */
    public int f18537m;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.auth.EyevueVerificationSmsActivity$a */
    public class CountDownTimerC2759a extends CountDownTimer {
        public CountDownTimerC2759a(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Log.i("sms", "-onFinish- ");
            SmsCounter smsCounter = new SmsCounter(0, 0);
            EyevueVerificationSmsActivity.this.f18533c = null;
            EyevueVerificationSmsActivity.this.showSmsCounterUI(smsCounter);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            EyevueVerificationSmsActivity.this.showSmsCounterUI(new SmsCounter(1, (int) (millisUntilFinished / 1000)));
        }
    }

    private void handleSendSmsCodeClick() {
        if (!tq6.checkPhoneNumber(this.f18530C) && !tq6.checkEmail(this.f18530C)) {
            m3h.showToastShort(getString(C2531R.string.eyevue_phone_tips_format_err));
            return;
        }
        SmsCounter smsCounter = this.f18535e;
        if (smsCounter == null || smsCounter.getOp() == 0) {
            this.f18532b.requestData(this.f18530C);
            startCountDownActual();
        }
    }

    public static String hideMiddlePhone(String phone) {
        if (phone == null || phone.length() != 11) {
            return phone;
        }
        return phone.substring(0, 3) + "****" + phone.substring(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        handleSendSmsCodeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSmsCounterUI(SmsCounter counter) {
        this.f18535e = counter;
        int op = counter.getOp();
        if (op == 0) {
            ((C15011xa) this.binding).f97337d.setText(getString(C2531R.string.eyevue_send_sms_code));
            ((C15011xa) this.binding).f97337d.setEnabled(true);
            return;
        }
        if (op == 1) {
            ((C15011xa) this.binding).f97337d.setTextColor(getResources().getColor(C2531R.color.base_purple));
            ((C15011xa) this.binding).f97337d.setEnabled(false);
            String str = Math.round(counter.getTime()) + "s";
            StringBuilder sb = new StringBuilder();
            sb.append("-onCountDown- timeFormat = ");
            sb.append(str);
            ((C15011xa) this.binding).f97337d.setText(getString(C2531R.string.eyevue_resend_sms_code, str));
            return;
        }
        if (op == 2) {
            if (this.f18534d == null) {
                this.f18534d = new ygi(this);
            }
            this.f18534d.show();
        } else if (op == 3 || op == 4) {
            ygi ygiVar = this.f18534d;
            if (ygiVar != null) {
                ygiVar.dismiss();
            }
            this.f18535e = new SmsCounter(0, 0);
        }
    }

    private void startCountDownActual() {
        showSmsCounterUI(new SmsCounter(1, 60));
        CountDownTimerC2759a countDownTimerC2759a = new CountDownTimerC2759a(60000, 1000L);
        this.f18533c = countDownTimerC2759a;
        countDownTimerC2759a.start();
    }

    private void toAiTransActivity() {
        startActivity(new Intent(this, ek9.getActivityClassByCode(this.f18537m)));
        finish();
    }

    private void toHomeActivity() {
        vfe.getInstance().putBoolean("KEY_RETRY_CONNECT_FIRST", true);
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C15011xa getViewBinding() {
        return C15011xa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.f18530C = intent.getStringExtra("mobile");
        this.f18536f = intent.getIntExtra(qt2.f75577a, 0);
        this.f18537m = intent.getIntExtra(qt2.f75578b, 0);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f18531a = new bk9(this);
        this.f18532b = new bsf(this);
        ((C15011xa) this.binding).f97337d.setOnClickListener(new View.OnClickListener() { // from class: zn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105506a.lambda$initView$0(view);
            }
        });
        ((C15011xa) this.binding).f97335b.setOnClickListener(new View.OnClickListener() { // from class: ao5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11437a.lambda$initView$1(view);
            }
        });
        ((C15011xa) this.binding).f97338e.setText(getString(C2531R.string.verify_code_sent, hideMiddlePhone(this.f18530C)));
        ((C15011xa) this.binding).f97339f.setOnCodeFinishListener(this);
        ((C15011xa) this.binding).f97337d.performClick();
    }

    @Override // com.eyevue.common.widget.verification.VerificationCodeView.InterfaceC2550c
    public void onComplete(View view, String content) {
        if (TextUtils.isEmpty(content)) {
            m3h.showToastShort(getString(C2531R.string.eyevue_sms_code_tips_empty));
            return;
        }
        this.f18531a.requestData(this.f18530C, content);
        if (this.f18534d == null) {
            this.f18534d = new ygi(this);
        }
        this.f18534d.show();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p000.ck9.InterfaceC2351f
    public void onGetDataFail(int code, String msg) {
        ygi ygiVar = this.f18534d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        m3h.showToastLong(msg);
    }

    @Override // p000.ck9.InterfaceC2361p
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        showSmsCounterUI(new SmsCounter(3, 0));
    }

    @Override // com.eyevue.common.widget.verification.VerificationCodeView.InterfaceC2550c
    public void onTextChange(View view, String content) {
    }

    @Override // p000.ck9.InterfaceC2351f
    public void onGetDataSuccess(UserTokenBean userInfo, boolean isCache, boolean isRefresh) {
        if (userInfo != null) {
            ygi ygiVar = this.f18534d;
            if (ygiVar != null) {
                ygiVar.dismiss();
            }
            vfe.getInstance().putString("KEY_LOGIN_MOBILE", this.f18530C);
            vfe.getInstance().putString("KEY_TOKEN", userInfo.getAccessToken());
            vfe.getInstance().putString("SP_KEY_REFRESH_TOKEN", userInfo.getRefreshToken());
            C2468a.finishActivity((Class<? extends Activity>) EyevueLoginBySmsActivity.class);
            int i = this.f18536f;
            if (i == 1) {
                toHomeActivity();
            } else if (i == 2) {
                toAiTransActivity();
            } else {
                finish();
            }
        }
    }

    @Override // p000.ck9.InterfaceC2361p
    public void onGetDataFail() {
        showSmsCounterUI(new SmsCounter(4, 0));
    }
}
