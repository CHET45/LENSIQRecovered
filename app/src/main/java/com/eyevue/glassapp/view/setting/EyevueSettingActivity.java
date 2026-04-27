package com.eyevue.glassapp.view.setting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.watchfun.base.BaseActivity;
import p000.C12963ta;
import p000.ck9;
import p000.g55;
import p000.hk9;
import p000.igg;
import p000.li9;
import p000.vfe;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueSettingActivity extends BaseActivity<C12963ta> implements View.OnClickListener, ck9.InterfaceC2353h {

    /* JADX INFO: renamed from: a */
    public hk9 f19149a;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueSettingActivity$a */
    public class C2915a implements li9.InterfaceC8829c {
        public C2915a() {
        }

        @Override // p000.li9.InterfaceC8829c
        public void onAgree() {
            EyevueSettingActivity.this.f19149a.requestData();
        }

        @Override // p000.li9.InterfaceC8829c
        public void onDisagree() {
        }
    }

    private void showDialog(String title, String content) {
        new li9(this, title, content, new C2915a()).show();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C12963ta getViewBinding() {
        return C12963ta.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C12963ta) this.binding).f84066e.setTitle(C2531R.string.account_and_security, this);
        ((C12963ta) this.binding).f84066e.hideBottomLine();
        ((C12963ta) this.binding).f84067f.setOnClickListener(this);
        ((C12963ta) this.binding).f84065d.setOnClickListener(this);
        if (TextUtils.isEmpty(vfe.getInstance().getString("KEY_TOKEN"))) {
            ((C12963ta) this.binding).f84064c.setEnabled(false);
            ((C12963ta) this.binding).f84064c.setTextColor(getColor(C2531R.color.gray_8B8B8B));
            ((C12963ta) this.binding).f84063b.setEnabled(false);
            ((C12963ta) this.binding).f84063b.setTextColor(getColor(C2531R.color.gray_8B8B8B));
            return;
        }
        this.f19149a = new hk9(this);
        ((C12963ta) this.binding).f84064c.setOnClickListener(this);
        ((C12963ta) this.binding).f84063b.setOnClickListener(this);
        vfe.getInstance().putBoolean("SP_KEY_LOGIN_SKIP", false);
    }

    @Override // android.view.View.OnClickListener
    @igg({"NonConstantResourceId"})
    public void onClick(View v) {
        if (v.getId() == C2531R.id.privacy_agreement) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, (Class<?>) EyevueStatementActivity.class);
            bundle.putBoolean("isUserAgreement", false);
            bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        if (v.getId() == C2531R.id.tv_user_agreement) {
            Bundle bundle2 = new Bundle();
            Intent intent2 = new Intent(this, (Class<?>) EyevueStatementActivity.class);
            bundle2.putBoolean("isUserAgreement", true);
            bundle2.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
            intent2.putExtras(bundle2);
            startActivity(intent2);
            return;
        }
        if (v.getId() == C2531R.id.log_off) {
            showDialog(getString(C2531R.string.eyevue_log_off), getString(C2531R.string.eyevue_log_off_dialog));
        } else if (v.getId() == C2531R.id.log_out) {
            showDialog(getString(C2531R.string.eyevue_log_out), getString(C2531R.string.eyevue_log_out_dialog));
        }
    }

    @Override // p000.ck9.InterfaceC2353h
    public void onGetDataFail(int code, String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(g55.f38796e);
        sb.append(code);
    }

    @Override // p000.ck9.InterfaceC2353h
    public void onGetDataSuccess(int code) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDataSuccess code");
        sb.append(code);
        if (code == 200) {
            vfe.getInstance().putString("SP_KEY_REFRESH_TOKEN", "");
            vfe.getInstance().putString("KEY_TOKEN", "");
            vfe.getInstance().putString("KEY_LOGIN_EMAIL", "");
            if (TextUtils.isEmpty(vfe.getInstance().getString("KEY_TOKEN"))) {
                ((C12963ta) this.binding).f84064c.setEnabled(false);
                ((C12963ta) this.binding).f84064c.setTextColor(getColor(C2531R.color.gray_8B8B8B));
                ((C12963ta) this.binding).f84063b.setEnabled(false);
                ((C12963ta) this.binding).f84063b.setTextColor(getColor(C2531R.color.gray_8B8B8B));
            }
        }
    }
}
