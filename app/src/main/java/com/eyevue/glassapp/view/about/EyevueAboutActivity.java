package com.eyevue.glassapp.view.about;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.setting.EyevueDeviceAboutActivity;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C13407u9;
import p000.c1i;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueAboutActivity extends BaseActivity<C13407u9> implements View.OnClickListener {
    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C13407u9 getViewBinding() {
        return C13407u9.inflate(getLayoutInflater());
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
        ((C13407u9) this.binding).f87087d.setTitle(C2531R.string.eyevue_mine_about, this);
        ((C13407u9) this.binding).f87087d.hideBottomLine();
        ((C13407u9) this.binding).f87088e.setText(getString(C2531R.string.app_name));
        ((C13407u9) this.binding).f87089f.setText("V " + c1i.getVersion(this));
        ((C13407u9) this.binding).f87090m.setOnClickListener(this);
        ((C13407u9) this.binding).f87086c.setOnClickListener(this);
        ((C13407u9) this.binding).f87085b.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C2531R.id.privacy_agreement) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, (Class<?>) EyevueStatementActivity.class);
            bundle.putBoolean("isUserAgreement", false);
            bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        if (view.getId() != C2531R.id.tv_user_agreement) {
            if (view.getId() == C2558R.id.about_device) {
                startActivity(new Intent(this, (Class<?>) EyevueDeviceAboutActivity.class));
            }
        } else {
            Bundle bundle2 = new Bundle();
            Intent intent2 = new Intent(this, (Class<?>) EyevueStatementActivity.class);
            bundle2.putBoolean("isUserAgreement", true);
            bundle2.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
            intent2.putExtras(bundle2);
            startActivity(intent2);
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
    }
}
