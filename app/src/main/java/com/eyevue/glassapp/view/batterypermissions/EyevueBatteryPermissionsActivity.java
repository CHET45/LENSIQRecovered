package com.eyevue.glassapp.view.batterypermissions;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.utils.BatteryOptimization.BatteryOptimizationCallback;
import com.eyevue.glassapp.utils.BatteryOptimization.BatteryOptimizationUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C16038z9;
import p000.hib;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueBatteryPermissionsActivity extends BaseActivity<C16038z9> {

    /* JADX INFO: renamed from: a */
    public BatteryOptimizationCallback f18539a = new C2761b();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevueBatteryPermissionsActivity$a */
    public class ViewOnClickListenerC2760a implements View.OnClickListener {
        public ViewOnClickListenerC2760a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EyevueBatteryPermissionsActivity.this.startActivity(new Intent(EyevueBatteryPermissionsActivity.this, (Class<?>) EyevuePhoneListActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevueBatteryPermissionsActivity$b */
    public class C2761b implements BatteryOptimizationCallback {
        public C2761b() {
        }

        @Override // com.eyevue.glassapp.utils.BatteryOptimization.BatteryOptimizationCallback
        public void onResult(boolean isSuccess, int requestCode) {
            EyevueBatteryPermissionsActivity.this.updateBatteryOptimizationText(isSuccess);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListeners$0(View view) {
        BatteryOptimizationUtils.requestIgnoreBatteryOptimizations(this, this.f18539a);
    }

    private void setOnClickListeners() {
        ((C16038z9) this.binding).f104428c.setOnClickListener(new View.OnClickListener() { // from class: il5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47340a.lambda$setOnClickListeners$0(view);
            }
        });
        ((C16038z9) this.binding).f104427b.setOnClickListener(new ViewOnClickListenerC2760a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBatteryOptimizationText(boolean isSet) {
        ((C16038z9) this.binding).f104431f.setText(isSet ? C2531R.string.already_set : C2531R.string.to_setting);
        ((C16038z9) this.binding).f104431f.setBackgroundResource(isSet ? C2531R.drawable.bg_btn_set_sure : C2531R.drawable.bg_btn_set_nol);
        ((C16038z9) this.binding).f104431f.setTextColor(Color.parseColor(isSet ? "#576061" : "#000000"));
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C16038z9 getViewBinding() {
        return C16038z9.inflate(getLayoutInflater());
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
        ((C16038z9) this.binding).f104429d.setTitle(C2531R.string.background_permission_settings, this);
        ((C16038z9) this.binding).f104429d.hideBottomLine();
        updateBatteryOptimizationText(BatteryOptimizationUtils.isIgnoringBatteryOptimizations(this));
        setOnClickListeners();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @hib Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        BatteryOptimizationUtils.handleActivityResult(requestCode, resultCode, data, this);
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
