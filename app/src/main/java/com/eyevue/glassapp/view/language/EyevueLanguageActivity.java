package com.eyevue.glassapp.view.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.view.splash.EyevueSplashActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C7198ia;
import p000.bu8;
import p000.fu8;
import p000.hu8;
import p000.u77;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueLanguageActivity extends BaseActivity<C7198ia> {

    /* JADX INFO: renamed from: a */
    public boolean f18666a;

    private static void killProcess() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(int[] iArr, int i) {
        updateLanguage(iArr[i]);
    }

    private void updateLanguage(int tag) {
        String code;
        bu8[] bu8VarArrValues = bu8.values();
        int length = bu8VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                code = null;
                break;
            }
            bu8 bu8Var = bu8VarArrValues[i];
            if (tag == bu8Var.getStringResId()) {
                code = bu8Var.getCode();
                break;
            }
            i++;
        }
        Log.e("ContentValues", "setLanguage: " + code + "," + code);
        hu8.changeLanguage(this, code, "");
        if (u77.f86979w && ModUtils.bleCore.isConnected() && !this.f18666a) {
            this.f18666a = true;
            String string = getResources().getConfiguration().locale.toString();
            if ((TextUtils.isEmpty(code) || !(code.contains("ch") || code.contains("zh"))) && !(!TextUtils.isEmpty(code) && code.contains("default") && string.contains("zh"))) {
                ModUtils.sendViaBle().setOfflineLanguage(Command.Param.OFFLINE_LANGUAGE_EN);
            } else {
                ModUtils.sendViaBle().setOfflineLanguage(Command.Param.OFFLINE_LANGUAGE_ZH);
            }
        }
        recreate();
        Intent intent = new Intent(this, (Class<?>) EyevueSplashActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        finish();
        killProcess();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7198ia getViewBinding() {
        return C7198ia.inflate(getLayoutInflater());
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
        hu8.setLanguage(this);
        ((C7198ia) this.binding).f46155c.setTitle(C2531R.string.text_select_language, this);
        ((C7198ia) this.binding).f46155c.hideBottomLine();
        final int[] iArr = new int[bu8.values().length];
        for (int i = 0; i < bu8.values().length; i++) {
            iArr[i] = bu8.values()[i].getStringResId();
        }
        fu8 fu8Var = new fu8(this);
        fu8Var.setData(iArr);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        ((C7198ia) this.binding).f46154b.setLayoutManager(linearLayoutManager);
        ((C7198ia) this.binding).f46154b.setAdapter(fu8Var);
        fu8Var.setOnItemClickListener(new fu8.InterfaceC5990c() { // from class: hn5
            @Override // p000.fu8.InterfaceC5990c
            public final void click(int i2) {
                this.f44204a.lambda$initView$0(iArr, i2);
            }
        });
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
