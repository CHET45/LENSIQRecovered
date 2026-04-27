package com.eyevue.glassapp.view.p008qr;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.app.ActivityCompat;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.ProjectInfoBean;
import com.eyevue.common.bean.authcode.CheckDeviceNameBean;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.util.List;
import p000.C0117aa;
import p000.be3;
import p000.d94;
import p000.efb;
import p000.gkg;
import p000.hib;
import p000.i91;
import p000.lp1;
import p000.lx2;
import p000.m3h;
import p000.mkd;
import p000.nfd;
import p000.okd;
import p000.pfd;
import p000.sx1;
import p000.t77;
import p000.ti7;
import p000.u77;
import p000.vx1;
import p000.xcg;
import p000.xnc;
import p000.ygi;
import p000.yp0;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueBindDeviceActivity extends BaseActivity<C0117aa> implements mkd.InterfaceC9384b, mkd.InterfaceC9386d, nfd.InterfaceC9862b {

    /* JADX INFO: renamed from: L */
    public static final int f19007L = 100;

    /* JADX INFO: renamed from: a */
    public okd f19011a;

    /* JADX INFO: renamed from: b */
    public vx1 f19012b;

    /* JADX INFO: renamed from: c */
    public pfd f19013c;

    /* JADX INFO: renamed from: d */
    public ygi f19014d;

    /* JADX INFO: renamed from: f */
    public String f19016f;

    /* JADX INFO: renamed from: e */
    public boolean f19015e = false;

    /* JADX INFO: renamed from: m */
    public final BroadcastReceiver f19017m = new C2866a();

    /* JADX INFO: renamed from: C */
    public final xcg<i91> f19008C = new xcg() { // from class: ll5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f58106a.lambda$new$2((i91) obj);
        }
    };

    /* JADX INFO: renamed from: F */
    public TextWatcher f19009F = new C2867b();

    /* JADX INFO: renamed from: H */
    public final xcg<d94> f19010H = new xcg() { // from class: ml5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f61365a.lambda$new$3((d94) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueBindDeviceActivity$a */
    public class C2866a extends BroadcastReceiver {
        public C2866a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("配对成功: action名称 = ");
            sb.append(action);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10) {
                EyevueBindDeviceActivity.this.getDeviceFail();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueBindDeviceActivity$b */
    public class C2867b extends be3 {
        public C2867b() {
        }

        @Override // p000.be3, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f786d.setEnabled(!TextUtils.isEmpty(((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f787e.getText().toString().trim()));
        }

        @Override // p000.be3, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() > 0) {
                ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f786d.setBackgroundResource(C2531R.drawable.bg_btn_main_base_purple);
                ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f786d.setTextColor(EyevueBindDeviceActivity.this.getColor(C2531R.color.black));
            } else {
                ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f786d.setBackgroundResource(C2531R.drawable.bg_btn_main);
                ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f786d.setTextColor(EyevueBindDeviceActivity.this.getColor(C2531R.color.color_voice_notes_text));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueBindDeviceActivity$c */
    public class C2868c implements lp1.InterfaceC8924a {
        public C2868c() {
        }

        @Override // p000.lp1.InterfaceC8924a
        public void onOk() {
            EyevueBindDeviceActivity.this.checkAndRequestCameraPermission();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueBindDeviceActivity$d */
    public class C2869d implements ModBleResponse.OnCustomerListener {
        public C2869d() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnCustomerListener
        public void onCustomer(String customer, String project) {
            EyevueBindDeviceActivity.this.f19013c.requestData(project + customer);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.qr.EyevueBindDeviceActivity$e */
    public class C2870e implements sx1.InterfaceC12820a {
        public C2870e() {
        }

        @Override // p000.sx1.InterfaceC12820a
        public void onSettingChanged() {
            EyevueBindDeviceActivity.this.startReceiver();
            EyevueBindDeviceActivity.this.openBluetoothSettings();
            EyevueBindDeviceActivity.this.finish();
        }

        @Override // p000.sx1.InterfaceC12820a
        public void onSubmit() {
            String strTrim = ((C0117aa) ((BaseActivity) EyevueBindDeviceActivity.this).binding).f787e.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            EyevueBindDeviceActivity.this.f19011a.requestData(strTrim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndRequestCameraPermission() {
        if (lx2.checkSelfPermission(this, xnc.f98581F) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{xnc.f98581F}, 100);
        } else {
            startScanner();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDeviceFail() {
        ((C0117aa) this.binding).f788f.setImageResource(C2531R.drawable.ic_default_icon);
        ((C0117aa) this.binding).f785c.setText("");
        ((C0117aa) this.binding).f784b.setText("");
    }

    private void getDeviceSuccess(BluetoothDevice device) {
        String deviceName = ti7.getDeviceName(device);
        t77.f83923b = device.getAddress();
        t77.f83922a = deviceName;
        showView();
    }

    private void handleSubmitCodeClick() {
        String strTrim = ((C0117aa) this.binding).f787e.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        String string = ((C0117aa) this.binding).f784b.getText().toString();
        this.f19016f = string;
        if (TextUtils.isEmpty(string)) {
            m3h.showToastShort(getString(C2531R.string.eyevue_add_device_dialog_tip));
            return;
        }
        this.f19011a.requestData(strTrim);
        if (this.f19014d == null) {
            this.f19014d = new ygi(this);
        }
        this.f19014d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        toCustomCaptureActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        handleSubmitCodeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(i91 i91Var) {
        String str = i91Var.f46089a;
        str.hashCode();
        if (str.equals(i91.f46088f)) {
            AiWebSocketManager.getInstance().stopAi();
            getDeviceFail();
        } else if (str.equals(i91.f46087e)) {
            getDeviceSuccess(i91Var.f46092d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(d94 d94Var) {
        int i = d94Var.f28798a;
        if (i == 3 || i == 1) {
            showView();
        }
    }

    private void showCameraPermissionDialog() {
        if (this.f19015e) {
            m3h.showToastShort(getString(C2531R.string.eyevue_permission_system_set));
        } else {
            new lp1(this, new C2868c()).show();
        }
    }

    private void showCheckDeviceNameDialog(List<String> deviceNames) {
        new sx1(this, (deviceNames == null || deviceNames.isEmpty()) ? "" : TextUtils.join("，", deviceNames), new C2870e()).show();
    }

    private void showView() {
        String str = t77.f83922a;
        this.f19016f = t77.f83923b;
        String str2 = t77.f83924c;
        if (TextUtils.isEmpty(str2)) {
            ((C0117aa) this.binding).f788f.setImageResource(C2531R.drawable.ic_default_icon);
        } else {
            ((C0117aa) this.binding).f788f.showHomeImg(str2);
        }
        if (TextUtils.isEmpty(str)) {
            ((C0117aa) this.binding).f785c.setText("");
        } else {
            ((C0117aa) this.binding).f785c.setText(str);
        }
        if (TextUtils.isEmpty(this.f19016f)) {
            ((C0117aa) this.binding).f784b.setText("");
        } else {
            ((C0117aa) this.binding).f784b.setText(this.f19016f);
        }
    }

    private void startScanner() {
        new IntentIntegrator(this).setDesiredBarcodeFormats("QR_CODE").setCameraId(0).setBeepEnabled(true).setBarcodeImageEnabled(false).setCaptureActivity(EyevueQrCaptureActivity.class).initiateScan();
    }

    private void toCustomCaptureActivity() {
        if (lx2.checkSelfPermission(this, xnc.f98581F) == 0) {
            startScanner();
        } else {
            showCameraPermissionDialog();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        zgb.defaultCenter().subscribeStrongly(i91.class, this.f19008C);
        this.f19012b = new vx1(this);
        this.f19013c = new pfd(this);
        this.f19011a = new okd(this);
        ((C0117aa) this.binding).f782F.setTitle(C2531R.string.eyevue_binding_device, this);
        ((C0117aa) this.binding).f782F.hideBottomLine();
        ((C0117aa) this.binding).f787e.addTextChangedListener(this.f19009F);
        ((C0117aa) this.binding).f781C.setOnClickListener(new View.OnClickListener() { // from class: jl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51105a.lambda$initView$0(view);
            }
        });
        ((C0117aa) this.binding).f786d.setOnClickListener(new View.OnClickListener() { // from class: kl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54606a.lambda$initView$1(view);
            }
        });
        showView();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @hib Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult activityResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (activityResult == null) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (activityResult.getContents() == null) {
            m3h.showToastShort(getString(C2531R.string.eyevue_scan_qr_code_error));
        } else {
            ((C0117aa) this.binding).f787e.setText(activityResult.getContents());
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(i91.class, this.f19008C);
        ygi ygiVar = this.f19014d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
    }

    @Override // p000.mkd.InterfaceC9384b, p000.mkd.InterfaceC9386d
    public void onGetDataFail(int code, String msg) {
        ygi ygiVar = this.f19014d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        m3h.showToastShort(msg);
    }

    @Override // p000.mkd.InterfaceC9386d
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        StringBuilder sb = new StringBuilder();
        sb.append("status =");
        sb.append(status);
        ModUtils.sendViaBle().getCustomer();
        ModUtils.modBleResponse().setOnCustomerListener(new C2869d());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 100) {
            if (grantResults.length > 0 && grantResults[0] == 0) {
                startScanner();
                return;
            }
            if (!ActivityCompat.shouldShowRequestPermissionRationale(this, xnc.f98581F)) {
                this.f19015e = true;
            }
            m3h.showToastShort(getString(C2531R.string.eyevue_permission_system_set));
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

    public void openBluetoothSettings() {
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0117aa getViewBinding() {
        return C0117aa.inflate(getLayoutInflater());
    }

    public void startReceiver() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f19017m, intentFilter);
    }

    @Override // p000.mkd.InterfaceC9384b
    public void onGetDataSuccess(CheckDeviceNameBean deviceNameVO, boolean isCache, boolean isRefresh) {
        ygi ygiVar = this.f19014d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        boolean zIsPassed = deviceNameVO.isPassed();
        List<String> deviceNames = deviceNameVO.getDeviceNames();
        if (zIsPassed) {
            String strTrim = ((C0117aa) this.binding).f787e.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            this.f19011a.requestData(strTrim);
            return;
        }
        showCheckDeviceNameDialog(deviceNames);
    }

    @Override // p000.nfd.InterfaceC9862b
    public void onGetDataFail() {
        finish();
        ygi ygiVar = this.f19014d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
    }

    @Override // p000.nfd.InterfaceC9862b
    public void onGetDataSuccess(ProjectInfoBean projectInfo, boolean isCache, boolean isRefresh) {
        ygi ygiVar = this.f19014d;
        if (ygiVar != null) {
            ygiVar.dismiss();
        }
        if (projectInfo != null) {
            t77.f83926e = projectInfo.isSupportAi();
            t77.f83928g = projectInfo.isSupportDoubleHeadset();
            t77.f83929h = projectInfo.isSupportSimultaneousInterpretation();
            t77.f83925d = projectInfo.isSupportTranslation();
            t77.f83927f = projectInfo.isSupportHeadsetMobile();
            t77.f83936o = projectInfo.isExceptionCode();
            t77.f83938q = projectInfo.getExceptionMsg();
            t77.f83937p = projectInfo.getProjectType();
            t77.f83930i = projectInfo.isSupportFreeTalk();
            t77.f83931j = projectInfo.isSupportVoiceNote();
            t77.f83932k = projectInfo.isSupportPhotoTranslation();
            t77.f83933l = projectInfo.isSupportVideoTranslation();
            t77.f83939r = projectInfo.getAuthCode();
            t77.f83946y = projectInfo.getSpeechProvider();
            t77.f83947z = projectInfo.getTranslationProvider();
            t77.f83921A = projectInfo.getTtsProvider();
            u77.f86962f = projectInfo.isSupportTextTranslation();
            u77.f86958b = projectInfo.getProjectFunctionType();
            u77.f86959c = projectInfo.getProjectCompatibleSdk();
            u77.f86960d = projectInfo.getAiModelAwakening();
            u77.f86961e = true;
            u77.f86965i = projectInfo.isSupportVoiceNotesV1();
            u77.f86982z = projectInfo.getOfflineCommands();
            u77.f86953A = projectInfo.getAiModelAwakening();
            u77.f86967k = Integer.parseInt(projectInfo.getAiModelRoleId());
            u77.f86968l = projectInfo.getAiModelRoleName();
            String imageUrl = projectInfo.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                t77.f83924c = imageUrl;
            }
            gkg gkgVar = new gkg();
            gkgVar.f40039a = 1;
            zgb.defaultCenter().publish(gkgVar);
            d94 d94Var = new d94();
            d94Var.f28798a = 2;
            zgb.defaultCenter().publish(d94Var);
            m3h.showToastShort(getString(C2531R.string.eyevue_binding_device_success));
            finish();
        }
    }
}
