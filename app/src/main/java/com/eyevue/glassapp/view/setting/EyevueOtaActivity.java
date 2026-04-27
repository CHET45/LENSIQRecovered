package com.eyevue.glassapp.view.setting;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.ota.ble.BleManager;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.helper.WifiP2pConnector;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.eyevue.glassapp.utils.photo.FileUtils;
import com.eyevue.glassapp.view.setting.C2917b;
import com.watchfun.base.BaseActivity;
import com.watchfun.base.BaseApplication;
import com.watchfun.theme.C4032a;
import java.io.File;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p000.C9231ma;
import p000.a8c;
import p000.b8c;
import p000.c8e;
import p000.cn4;
import p000.cng;
import p000.cr0;
import p000.e87;
import p000.efb;
import p000.hib;
import p000.k95;
import p000.lp7;
import p000.lq7;
import p000.lx2;
import p000.ma9;
import p000.njb;
import p000.oe1;
import p000.pj4;
import p000.t77;
import p000.td9;
import p000.u77;
import p000.wl7;
import p000.x15;
import p000.xl4;
import p000.xnc;
import p000.xt5;
import p000.y7c;
import p000.yi9;
import p000.yp0;
import p000.yv7;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueOtaActivity extends BaseActivity<C9231ma> {

    /* JADX INFO: renamed from: h2 */
    public static final String f19095h2 = "EyevueOtaActivigy";

    /* JADX INFO: renamed from: i2 */
    public static final int f19096i2 = 100;

    /* JADX INFO: renamed from: j2 */
    public static final String f19097j2 = "wifi_download_url";

    /* JADX INFO: renamed from: k2 */
    public static final String f19098k2 = "ble_download_url";

    /* JADX INFO: renamed from: l2 */
    public static final String f19099l2 = "version";

    /* JADX INFO: renamed from: m2 */
    public static final String f19100m2 = "update_content";

    /* JADX INFO: renamed from: n2 */
    public static final String f19101n2 = "update_type";

    /* JADX INFO: renamed from: o2 */
    public static final String f19102o2 = "isSuccess";

    /* JADX INFO: renamed from: p2 */
    public static final int f19103p2 = 2;

    /* JADX INFO: renamed from: q2 */
    public static final int f19104q2 = 1;

    /* JADX INFO: renamed from: C */
    public boolean f19105C;

    /* JADX INFO: renamed from: F */
    public boolean f19106F;

    /* JADX INFO: renamed from: H */
    public boolean f19107H;

    /* JADX INFO: renamed from: L */
    public boolean f19108L;

    /* JADX INFO: renamed from: M */
    public boolean f19109M;

    /* JADX INFO: renamed from: M1 */
    public e87 f19110M1;

    /* JADX INFO: renamed from: N */
    public njb f19111N;

    /* JADX INFO: renamed from: Q */
    public b8c f19112Q;

    /* JADX INFO: renamed from: V1 */
    public WifiManager f19113V1;

    /* JADX INFO: renamed from: X */
    public y7c f19114X;

    /* JADX INFO: renamed from: Y */
    public ValueAnimator f19115Y;

    /* JADX INFO: renamed from: Z */
    public td9 f19116Z;

    /* JADX INFO: renamed from: Z1 */
    public String f19117Z1;

    /* JADX INFO: renamed from: a */
    public String f19118a;

    /* JADX INFO: renamed from: a2 */
    public String f19119a2;

    /* JADX INFO: renamed from: b */
    public cn4 f19120b;

    /* JADX INFO: renamed from: b2 */
    public boolean f19121b2;

    /* JADX INFO: renamed from: c */
    public int f19122c;

    /* JADX INFO: renamed from: c2 */
    public int f19123c2;

    /* JADX INFO: renamed from: d */
    public WifiP2pConnector f19124d;

    /* JADX INFO: renamed from: d2 */
    public int f19125d2;

    /* JADX INFO: renamed from: e */
    public String f19126e;

    /* JADX INFO: renamed from: e2 */
    public boolean f19127e2;

    /* JADX INFO: renamed from: f */
    public String f19128f;

    /* JADX INFO: renamed from: f2 */
    public boolean f19129f2;

    /* JADX INFO: renamed from: g2 */
    public final oe1 f19130g2 = new C2909i();

    /* JADX INFO: renamed from: m */
    public boolean f19131m;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$a */
    public class ViewOnClickListenerC2901a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$a$a */
        public class a implements C2475h.f {
            public a() {
            }

            @Override // com.blankj.utilcode.util.C2475h.f
            public void onDenied() {
            }

            @Override // com.blankj.utilcode.util.C2475h.f
            public void onGranted() {
                EyevueOtaActivity.this.showOtaDialog();
            }
        }

        public ViewOnClickListenerC2901a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (EyevueOtaActivity.this.f19108L) {
                EyevueOtaActivity.this.finish();
                return;
            }
            if (u77.f86963g < 50 && !EyevueOtaActivity.this.f19129f2) {
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.showOtaTipDialog(eyevueOtaActivity.getString(C2531R.string.string_system_update_dialog_title), EyevueOtaActivity.this.getString(C2531R.string.string_battery_low_tip));
                return;
            }
            if (EyevueOtaActivity.this.f19122c == 2) {
                if (EyevueOtaActivity.this.f19113V1 != null && !EyevueOtaActivity.this.f19113V1.isWifiEnabled()) {
                    EyevueOtaActivity.this.showOpenWifiDialog();
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    if (lx2.checkSelfPermission(EyevueOtaActivity.this, xnc.f98619p) != 0) {
                        C2475h.permission(xnc.f98619p).callback(new a()).request();
                        return;
                    }
                } else if (i >= 29 && (!PermissionUtil.isHasLocationPermission(EyevueOtaActivity.this) || !PermissionUtil.checkGpsProviderEnable(EyevueOtaActivity.this))) {
                    EyevueOtaActivity.this.showGPSLocationDialog();
                    return;
                }
            }
            EyevueOtaActivity.this.showOtaDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$b */
    public class C2902b extends xl4 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f19134b;

        public C2902b(final String val$finalDeletePath) {
            this.f19134b = val$finalDeletePath;
        }

        @Override // p000.ma9.InterfaceC9236a
        public void connected(@efb cn4 task, int blockCount, long currentOffset, long totalLength) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void progress(@efb cn4 task, long currentOffset, long totalLength) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "下载进度：" + task.getId() + C2473f.f17566z + task.getUrl() + C2473f.f17566z + currentOffset + pj4.f71071b + totalLength);
            int progressPercentage = EyevueOtaActivity.this.getProgressPercentage(currentOffset, totalLength);
            if (EyevueOtaActivity.this.f19121b2) {
                progressPercentage /= 2;
            }
            EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
            eyevueOtaActivity.f19123c2 = eyevueOtaActivity.f19125d2 + progressPercentage;
            EyevueOtaActivity eyevueOtaActivity2 = EyevueOtaActivity.this;
            eyevueOtaActivity2.showOtaProgressView(eyevueOtaActivity2.getString(C2531R.string.string_downloading), EyevueOtaActivity.this.f19123c2);
        }

        @Override // p000.ma9.InterfaceC9236a
        public void retry(@efb cn4 task, @efb c8e cause) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskEnd(@efb cn4 task, @efb x15 cause, @hib Exception realCause, @efb ma9.C9237b model) {
            StringBuilder sb = new StringBuilder();
            sb.append("下载结果：");
            sb.append(task.getId());
            sb.append(C2473f.f17566z);
            sb.append(task.getUrl());
            sb.append(C2473f.f17566z);
            sb.append(cause.name());
            sb.append(":::");
            sb.append(realCause == null ? "" : realCause.getMessage());
            C2473f.m4168e(EyevueOtaActivity.f19095h2, sb.toString());
            if (!cause.name().equals("COMPLETED")) {
                EyevueOtaActivity.this.f19105C = false;
                boolean zDelete = TextUtils.isEmpty(this.f19134b) ? xt5.delete(this.f19134b) : false;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ota下载失败：");
                sb2.append(task.getId());
                sb2.append(C2473f.f17566z);
                sb2.append(task.getUrl());
                sb2.append(C2473f.f17566z);
                sb2.append(cause.name());
                sb2.append(":::");
                sb2.append(realCause != null ? realCause.getMessage() : "");
                sb2.append(":::删除失败文件:");
                sb2.append(zDelete);
                C2473f.m4168e(EyevueOtaActivity.f19095h2, sb2.toString());
                EyevueOtaActivity.this.showOtaFailView();
                return;
            }
            if (EyevueOtaActivity.this.f19121b2 && !task.getUrl().equals(EyevueOtaActivity.this.f19118a)) {
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.downloadOtaFile(eyevueOtaActivity.f19118a);
                EyevueOtaActivity.this.f19125d2 = 50;
                return;
            }
            EyevueOtaActivity.this.f19105C = true;
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "ota下载成功:" + task.getUrl() + "::::" + EyevueOtaActivity.this.f19122c);
            if (EyevueOtaActivity.this.f19122c != 2) {
                if (EyevueOtaActivity.this.f19122c == 1 && EyevueOtaActivity.this.f19107H) {
                    EyevueOtaActivity eyevueOtaActivity2 = EyevueOtaActivity.this;
                    eyevueOtaActivity2.startBleOta(eyevueOtaActivity2.f19128f);
                    return;
                }
                return;
            }
            if (EyevueOtaActivity.this.f19131m) {
                EyevueOtaActivity eyevueOtaActivity3 = EyevueOtaActivity.this;
                eyevueOtaActivity3.startWifiOta(eyevueOtaActivity3.f19126e);
            } else {
                ((C9231ma) ((BaseActivity) EyevueOtaActivity.this).binding).f60308M.setText(EyevueOtaActivity.this.getString(C2531R.string.string_wifi_connecting));
                EyevueOtaActivity.this.openWifiOTA();
            }
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskStart(@efb cn4 task, @efb ma9.C9237b model) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$c */
    public class C2903c implements y7c.InterfaceC15541c {
        public C2903c() {
        }

        @Override // p000.y7c.InterfaceC15541c
        public void onAgree() {
            if (!TextUtils.isEmpty(EyevueOtaActivity.this.f19119a2)) {
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.showOtaProgressView(eyevueOtaActivity.getString(C2531R.string.string_downloading), 0);
                EyevueOtaActivity eyevueOtaActivity2 = EyevueOtaActivity.this;
                eyevueOtaActivity2.downloadOtaFile(eyevueOtaActivity2.f19119a2);
                return;
            }
            if (TextUtils.isEmpty(EyevueOtaActivity.this.f19118a)) {
                return;
            }
            EyevueOtaActivity eyevueOtaActivity3 = EyevueOtaActivity.this;
            eyevueOtaActivity3.showOtaProgressView(eyevueOtaActivity3.getString(C2531R.string.string_downloading), 0);
            EyevueOtaActivity eyevueOtaActivity4 = EyevueOtaActivity.this;
            eyevueOtaActivity4.downloadOtaFile(eyevueOtaActivity4.f19118a);
        }

        @Override // p000.y7c.InterfaceC15541c
        public void onDisagree() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$d */
    public class C2904d implements b8c.InterfaceC1780b {
        public C2904d() {
        }

        @Override // p000.b8c.InterfaceC1780b
        public void onAgree() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$e */
    public class C2905e implements td9.InterfaceC12994a {
        public C2905e() {
        }

        @Override // p000.td9.InterfaceC12994a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$f */
    public class C2906f implements C2475h.f {
        public C2906f() {
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onDenied() {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "有权限去:::onDeniedonDeniedonDenied");
            EyevueOtaActivity.this.dismissLocationDialog();
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onGranted() {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "有权限去:::onGranted");
            EyevueOtaActivity.this.dismissLocationDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$g */
    public class ViewOnClickListenerC2907g implements View.OnClickListener {
        public ViewOnClickListenerC2907g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueOtaActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$h */
    public class C2908h implements ModBleResponse.OnWifiOtaResultListener {
        public C2908h() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnWifiOtaResultListener
        public void onResult(boolean isSuccess) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "wifi回调 ota结果 isSuccess = " + isSuccess);
            if (!isSuccess) {
                C2473f.m4168e(EyevueOtaActivity.f19095h2, "wifi回调 ota失败");
                EyevueOtaActivity.this.showOtaFailView();
                return;
            }
            ModUtils.sendViaBle().sendIspVersion(EyevueOtaActivity.this.f19117Z1);
            if (EyevueOtaActivity.this.f19124d != null) {
                EyevueOtaActivity.this.f19124d.disconnectP2p();
            }
            if (!EyevueOtaActivity.this.f19121b2) {
                EyevueOtaActivity.this.showOtaSuccessView();
                return;
            }
            EyevueOtaActivity.this.f19122c = 1;
            if (EyevueOtaActivity.this.f19107H) {
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.startBleOta(eyevueOtaActivity.f19128f);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$i */
    public class C2909i extends oe1 {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$i$a */
        public class a implements lp7<cng> {
            public a() {
            }

            @Override // p000.lp7
            public void onError(cr0 baseError) {
                if (baseError.getCode() == 0 && baseError.getSubCode() == 0) {
                    cng deviceInfo = EyevueOtaActivity.this.f19111N.getDeviceInfo();
                    yi9.m26092e(EyevueOtaActivity.f19095h2, "正常升级：" + deviceInfo.getVersionCode() + C2473f.f17566z + deviceInfo.getVersionName() + C2473f.f17566z + deviceInfo.getProjectCode());
                    EyevueOtaActivity.this.f19107H = true;
                    if (EyevueOtaActivity.this.f19105C) {
                        EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                        eyevueOtaActivity.startBleOta(eyevueOtaActivity.f19128f);
                    }
                }
            }

            @Override // p000.lp7
            public void onSuccess(cng deviceInfo) {
                yi9.m26092e(EyevueOtaActivity.f19095h2, "强制升级：" + deviceInfo.getVersionCode() + C2473f.f17566z + deviceInfo.getVersionName() + C2473f.f17566z + deviceInfo.getProjectCode());
                EyevueOtaActivity.this.f19107H = true;
                EyevueOtaActivity.this.f19129f2 = true;
                if (EyevueOtaActivity.this.f19105C) {
                    EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                    eyevueOtaActivity.startBleOta(eyevueOtaActivity.f19128f);
                }
            }
        }

        public C2909i() {
        }

        @Override // p000.oe1, p000.np7
        public void onConnection(BluetoothDevice device, int status) {
            if (status == 1) {
                if (EyevueOtaActivity.this.f19111N.isOTA()) {
                    return;
                }
                EyevueOtaActivity.this.f19111N.queryMandatoryUpdate(new a());
            } else {
                yi9.m26092e(EyevueOtaActivity.f19095h2, "OTA连接失败：" + status);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$j */
    public class C2910j implements lq7 {
        public C2910j() {
        }

        @Override // p000.lq7
        public void onCancelOTA() {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "OTA取消");
            EyevueOtaActivity.this.f19106F = false;
            EyevueOtaActivity.this.f19108L = false;
        }

        @Override // p000.lq7
        public void onError(cr0 error) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "OTA错误：" + error.getMessage() + "::::" + error.getCode() + "::" + error.getSubCode() + ":::" + error.getOpCode());
            if (error.getSubCode() != 16392) {
                EyevueOtaActivity.this.showOtaFailView();
            }
        }

        @Override // p000.lq7
        public void onNeedReconnect(String addr, boolean isNewReconnectWay) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "需要回连设备：" + addr);
            if (EyevueOtaActivity.this.f19111N.getBluetoothOption().isUseReconnect()) {
                BleManager.getInstance().reconnectDevice(addr, isNewReconnectWay);
            }
        }

        @Override // p000.lq7
        public void onProgress(int type, float progress) {
            EyevueOtaActivity.this.f19127e2 = true;
            int i = (int) progress;
            if (type == 0) {
                if (EyevueOtaActivity.this.f19121b2) {
                    i = (i / 4) + EyevueOtaActivity.this.f19125d2;
                }
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.showOtaProgressView(eyevueOtaActivity.getString(C2531R.string.string_updateing), i);
                return;
            }
            if (type != 1 || progress <= 0.0f) {
                return;
            }
            if (EyevueOtaActivity.this.f19121b2) {
                i = (i / 4) + EyevueOtaActivity.this.f19125d2 + 25;
            }
            EyevueOtaActivity eyevueOtaActivity2 = EyevueOtaActivity.this;
            eyevueOtaActivity2.showOtaProgressView(eyevueOtaActivity2.getString(C2531R.string.string_updateing), i);
        }

        @Override // p000.lq7
        public void onStartOTA() {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "开始OTA");
            EyevueOtaActivity.this.f19127e2 = true;
        }

        @Override // p000.lq7
        public void onStopOTA() {
            EyevueOtaActivity.this.showOtaSuccessView();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$k */
    public class C2911k implements WifiP2pConnector.WifiDirectCallback {
        public C2911k() {
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onDirectWifiConnected() {
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onError(String message) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "wifi连接失败 ota失败::" + message);
            EyevueOtaActivity.this.showOtaFailView();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$l */
    public class C2912l implements WifiP2pConnector.WifiDirectCallback {
        public C2912l() {
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onDirectWifiConnected() {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "WiFi连接成功");
            EyevueOtaActivity.this.f19131m = true;
            if (EyevueOtaActivity.this.f19105C) {
                EyevueOtaActivity eyevueOtaActivity = EyevueOtaActivity.this;
                eyevueOtaActivity.startWifiOta(eyevueOtaActivity.f19126e);
            }
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onError(String message) {
            if (message.equals(WifiP2pConnector.HOTSPOT_OPEN)) {
                ToastUtils.showShort(BaseApplication.getInstance().getString(C2531R.string.string_eyevue_import_media_hotspot_tip));
            }
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "WiFi连接失败: " + message);
            if (EyevueOtaActivity.this.f19108L || EyevueOtaActivity.this.f19109M) {
                return;
            }
            EyevueOtaActivity.this.f19131m = false;
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "WiFi连接失败,ota失败::::::___::" + message);
            if (EyevueOtaActivity.this.f19127e2) {
                return;
            }
            EyevueOtaActivity.this.showOtaFailView();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$m */
    public class C2913m implements C2917b.a {
        public C2913m() {
        }

        @Override // com.eyevue.glassapp.view.setting.C2917b.a
        public void onProgress(long currentBytes, long totalBytes, boolean done) {
            Log.i(EyevueOtaActivity.f19095h2, "上传进度：" + currentBytes + pj4.f71071b + totalBytes);
            if (EyevueOtaActivity.this.getProgressPercentage(currentBytes, totalBytes) == 100) {
                EyevueOtaActivity.this.f19109M = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueOtaActivity$n */
    public class C2914n implements Callback {
        public C2914n() {
        }

        @Override // okhttp3.Callback
        public void onFailure(@efb Call call, @efb IOException e) {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "上传失败,ota失败：" + e.getMessage());
            if (EyevueOtaActivity.this.f19109M) {
                return;
            }
            EyevueOtaActivity.this.showOtaFailView();
        }

        @Override // okhttp3.Callback
        public void onResponse(@efb Call call, @efb Response response) throws IOException {
            C2473f.m4168e(EyevueOtaActivity.f19095h2, "上传成功：");
            EyevueOtaActivity.this.f19109M = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLocationDialog() {
        td9 td9Var = this.f19116Z;
        if (td9Var != null) {
            if (td9Var.isShowing()) {
                this.f19116Z.dismiss();
            }
            this.f19116Z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadOtaFile(String url) {
        String str;
        this.f19106F = true;
        String lastPathSegment = Uri.parse(url).getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            str = "";
        } else if (lastPathSegment.endsWith(".bin")) {
            str = FileUtils.getOtaOutputPath() + pj4.f71071b + lastPathSegment;
            this.f19126e = str;
        } else {
            str = FileUtils.getOtaOutputPath() + pj4.f71071b + lastPathSegment;
            this.f19128f = str;
        }
        cn4 cn4VarBuild = new cn4.C2401a(url, FileUtils.getOtaOutputPath(), lastPathSegment).setMinIntervalMillisCallbackProcess(500).setPriority(10).setReadBufferSize(32768).setFlushBufferSize(131072).setSyncBufferSize(131072).setSyncBufferIntervalMillis(200).setConnectionCount(1).setPassIfAlreadyCompleted(true).build();
        this.f19120b = cn4VarBuild;
        cn4VarBuild.enqueue(new C2902b(str));
    }

    private void initBle() {
        C2473f.m4168e(f19095h2, "initBle");
        BluetoothDevice curBluetoothDevice = ModUtils.bleCore.getCurBluetoothDevice();
        if (curBluetoothDevice != null) {
            BleManager.getInstance().connectBleDevice(curBluetoothDevice);
        }
    }

    private void initOta() {
        C2473f.m4168e(f19095h2, "initOta");
        njb njbVar = new njb(this);
        this.f19111N = njbVar;
        njbVar.registerBluetoothCallback(this.f19130g2);
    }

    private boolean isActivityAlive() {
        return (isFinishing() || isDestroyed() || getWindow() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOpenWifiDialog$4() {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        dismissOpenWifiDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOtaFailView$3() {
        this.f19108L = false;
        this.f19106F = false;
        this.f19127e2 = false;
        ValueAnimator valueAnimator = this.f19115Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        showOtaTipDialog(getString(C2531R.string.string_system_update_fail), getString(C2531R.string.string_system_update_fail_tip));
        ((C9231ma) this.binding).f60304C.setVisibility(8);
        ((C9231ma) this.binding).f60308M.setVisibility(8);
        ((C9231ma) this.binding).f60316b.setVisibility(0);
        ((C9231ma) this.binding).f60316b.setText(getString(C2531R.string.eyevue_click_update));
        ((C9231ma) this.binding).f60304C.setProgress(0);
        ((C9231ma) this.binding).f60308M.setText("");
        if (this.f19122c == 2) {
            WifiP2pConnector wifiP2pConnector = this.f19124d;
            if (wifiP2pConnector != null) {
                wifiP2pConnector.disconnectP2p();
            }
            ModUtils.sendViaBle().fileDownloadFinish(Command.Param.WIFI_FILE_DOWNLOAD_FINISH, Command.Param.WIFI_FILE_DOWNLOAD_NOT_CLEAR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOtaProgressView$1(int i, String str) {
        ((C9231ma) this.binding).f60304C.setVisibility(0);
        ((C9231ma) this.binding).f60308M.setVisibility(0);
        ((C9231ma) this.binding).f60316b.setVisibility(8);
        ((C9231ma) this.binding).f60304C.setProgress(i);
        ((C9231ma) this.binding).f60308M.setText(str + i + yv7.f103133a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOtaSuccessView$2() {
        this.f19108L = true;
        this.f19106F = false;
        this.f19127e2 = false;
        ((C9231ma) this.binding).f60304C.setVisibility(8);
        ((C9231ma) this.binding).f60308M.setVisibility(8);
        ((C9231ma) this.binding).f60316b.setVisibility(0);
        ((C9231ma) this.binding).f60316b.setText(getString(C2531R.string.string_is_new));
        ((C9231ma) this.binding).f60320f.setVisibility(0);
        ((C9231ma) this.binding).f60317c.setVisibility(8);
        ValueAnimator valueAnimator = this.f19115Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C2473f.m4168e(f19095h2, "删除OTA成功文件:" + xt5.delete(this.f19126e) + ":::" + xt5.delete(this.f19128f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start2MinProgressAnimation$0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue <= (this.f19121b2 ? 49 : 99)) {
            showOtaProgressView(getString(C2531R.string.string_updateing), iIntValue);
        } else if (this.f19108L) {
            this.f19115Y.cancel();
            showOtaProgressView(getString(C2531R.string.string_updateing), 100);
        }
    }

    private void requestLocationPermission() {
        C2475h.permission(xnc.f98583H, xnc.f98584I).callback(new C2906f()).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGPSLocationDialog() {
        requestLocationPermission();
        td9 td9Var = new td9(this, new C2905e());
        this.f19116Z = td9Var;
        td9Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOpenWifiDialog() {
        if (this.f19110M1 == null) {
            this.f19110M1 = new e87(this, new e87.InterfaceC5190a() { // from class: mn5
                @Override // p000.e87.InterfaceC5190a
                public final void onOk() {
                    this.f61550a.lambda$showOpenWifiDialog$4();
                }
            });
        }
        if (this.f19110M1.isShowing()) {
            return;
        }
        this.f19110M1.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaDialog() {
        if (this.f19114X == null) {
            this.f19114X = new y7c(this, new C2903c());
        }
        y7c y7cVar = this.f19114X;
        if (y7cVar == null || y7cVar.isShowing()) {
            return;
        }
        this.f19114X.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaFailView() {
        runOnUiThread(new Runnable() { // from class: pn5
            @Override // java.lang.Runnable
            public final void run() {
                this.f71484a.lambda$showOtaFailView$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaProgressView(final String tip, final int progress) {
        runOnUiThread(new Runnable() { // from class: nn5
            @Override // java.lang.Runnable
            public final void run() {
                this.f65071a.lambda$showOtaProgressView$1(progress, tip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaSuccessView() {
        runOnUiThread(new Runnable() { // from class: on5
            @Override // java.lang.Runnable
            public final void run() {
                this.f68178a.lambda$showOtaSuccessView$2();
            }
        });
        a8c a8cVar = new a8c();
        a8cVar.f621a = true;
        zgb.defaultCenter().publish(a8cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaTipDialog(String tip, String tipContent) {
        if (isActivityAlive()) {
            if (this.f19112Q == null) {
                this.f19112Q = new b8c(this, new C2904d());
            }
            b8c b8cVar = this.f19112Q;
            if (b8cVar == null || b8cVar.isShowing()) {
                return;
            }
            this.f19112Q.setText(tip, tipContent);
            this.f19112Q.show();
        }
    }

    private void start2MinProgressAnimation() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f19121b2 ? 50 : 100);
        this.f19115Y = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(40000L);
        this.f19115Y.setInterpolator(null);
        this.f19115Y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qn5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f74999a.lambda$start2MinProgressAnimation$0(valueAnimator);
            }
        });
        this.f19115Y.start();
    }

    public static void startActivity(Activity context, int code, String bleDownloadUrl, String wifiDownloadUrl, String version, String updateContent) {
        Intent intent = new Intent(context, (Class<?>) EyevueOtaActivity.class);
        intent.putExtra(f19097j2, wifiDownloadUrl);
        intent.putExtra(f19098k2, bleDownloadUrl);
        intent.putExtra("version", version);
        intent.putExtra(f19100m2, updateContent);
        context.startActivityForResult(intent, code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBleOta(String filePath) {
        this.f19111N.getBluetoothOption().setFirmwareFilePath(filePath);
        this.f19111N.startOTA(new C2910j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWifiOta(String filePath) {
        File fileByPath = xt5.getFileByPath(filePath);
        if (fileByPath != null && fileByPath.exists()) {
            start2MinProgressAnimation();
            C2916a.uploadFile("http://192.168.49.207/?custom=1&cmd=5001&par=1", fileByPath, new C2913m(), new C2914n());
        } else {
            C2473f.m4168e(f19095h2, "wifi ota文件不存在:::" + filePath);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C9231ma getViewBinding() {
        return C9231ma.inflate(getLayoutInflater());
    }

    public void connectWifi(String ssid, String password) {
        this.f19124d.connectToDirectWifi(ssid, password, new C2912l());
    }

    public void dismissOpenWifiDialog() {
        e87 e87Var = this.f19110M1;
        if (e87Var != null) {
            if (e87Var.isShowing()) {
                this.f19110M1.dismiss();
            }
            this.f19110M1 = null;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra(f19102o2, this.f19108L);
        setResult(-1, intent);
        super.finish();
    }

    public int getProgressPercentage(long currentOffset, long totalLength) {
        if (totalLength <= 0) {
            return 0;
        }
        if (currentOffset >= totalLength) {
            return 100;
        }
        if (currentOffset < 0) {
            return 0;
        }
        return (int) ((currentOffset * 100) / totalLength);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        if (!TextUtils.isEmpty(t77.f83923b) && ModUtils.bleCore.isConnected()) {
            ModUtils.sendViaBle().getDevicePower();
        }
        this.f19118a = getIntent().getStringExtra(f19098k2);
        this.f19119a2 = getIntent().getStringExtra(f19097j2);
        this.f19117Z1 = getIntent().getStringExtra("version");
        String stringExtra = getIntent().getStringExtra(f19100m2);
        C2473f.m4168e(f19095h2, "bleDownloadUrl = " + this.f19118a);
        if (!TextUtils.isEmpty(this.f19118a)) {
            initOta();
            initBle();
        }
        if (!TextUtils.isEmpty(this.f19119a2) && !TextUtils.isEmpty(this.f19118a)) {
            this.f19121b2 = true;
            this.f19122c = 2;
        } else if (!TextUtils.isEmpty(this.f19119a2) || TextUtils.isEmpty(this.f19118a)) {
            this.f19122c = 2;
        } else {
            this.f19122c = 1;
        }
        this.f19113V1 = (WifiManager) getSystemService("wifi");
        ((C9231ma) this.binding).f60309M1.setText(k95.f53074X4 + this.f19117Z1);
        ((C9231ma) this.binding).f60307L.setText(k95.f53074X4 + this.f19117Z1);
        ((C9231ma) this.binding).f60313Y.setText(stringExtra);
        ((C9231ma) this.binding).f60312X.setText(getString(C2531R.string.string_system_update));
        this.f19124d = new WifiP2pConnector(this);
        ((C9231ma) this.binding).f60316b.setOnClickListener(new ViewOnClickListenerC2901a());
        ((C9231ma) this.binding).f60319e.setOnClickListener(new ViewOnClickListenerC2907g());
        ModUtils.modBleResponse().setOnWifiOtaResultListener(new C2908h());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f19106F) {
            showOtaTipDialog(getString(C2531R.string.string_updateing), getString(C2531R.string.string_updateing_exit_tip));
        } else {
            finish();
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WifiP2pConnector wifiP2pConnector = this.f19124d;
        if (wifiP2pConnector != null) {
            wifiP2pConnector.disconnectP2p();
            this.f19124d = null;
        }
        njb njbVar = this.f19111N;
        if (njbVar != null) {
            njbVar.unregisterBluetoothCallback(this.f19130g2);
            BluetoothDevice curBluetoothDevice = ModUtils.bleCore.getCurBluetoothDevice();
            if (curBluetoothDevice != null) {
                C2473f.m4168e(f19095h2, "断开蓝牙连接");
                this.f19111N.disconnectBluetoothDevice(curBluetoothDevice);
            }
            this.f19111N.release();
        }
        ValueAnimator valueAnimator = this.f19115Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BleManager.getInstance().destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }

    public void openWifiOTA() {
        if (wl7.isApWifiEnabled(this)) {
            ToastUtils.showShort(BaseApplication.getInstance().getString(C2531R.string.string_eyevue_import_media_hotspot_tip));
            C2473f.m4168e(f19095h2, "热点打开 ota失败");
            showOtaFailView();
        } else {
            ModUtils.sendViaBle().p2pWifiOta();
            this.f19124d.init();
            this.f19124d.setmCallback(new C2911k());
            ModUtils.modBleResponse().setOnWifiDataListener(new ModBleResponse.OnWifiDataListener() { // from class: rn5
                @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnWifiDataListener
                public final void onWifiData(String str, String str2) {
                    this.f78790a.connectWifi(str, str2);
                }
            });
        }
    }
}
