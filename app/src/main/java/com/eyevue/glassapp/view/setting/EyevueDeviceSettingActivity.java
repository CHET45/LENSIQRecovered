package com.eyevue.glassapp.view.setting;

import android.app.Activity;
import android.app.ComponentCaller;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.DeviceSettingBean;
import com.eyevue.common.bean.ota.OtaBean;
import com.eyevue.glassapp.bluetooth.BluetoothUtil;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.database.device.DeviceInfoBean;
import com.eyevue.glassapp.database.device.DeviceListDatabase;
import com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity;
import com.watchfun.base.BaseActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;
import p000.C4681da;
import p000.b8c;
import p000.e8c;
import p000.efb;
import p000.fzd;
import p000.hib;
import p000.i91;
import p000.k95;
import p000.q94;
import p000.qq9;
import p000.t77;
import p000.u77;
import p000.vfe;
import p000.x7c;
import p000.xcg;
import p000.yi9;
import p000.yp0;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueDeviceSettingActivity extends BaseActivity<C4681da> implements x7c.InterfaceC14970b {

    /* JADX INFO: renamed from: d2 */
    public static final String f19046d2 = "EyevueDeviceSettingActivity";

    /* JADX INFO: renamed from: C */
    public byte f19047C;

    /* JADX INFO: renamed from: F */
    public boolean f19048F;

    /* JADX INFO: renamed from: H */
    public String f19049H;

    /* JADX INFO: renamed from: L */
    public e8c f19050L;

    /* JADX INFO: renamed from: M */
    public String f19051M;

    /* JADX INFO: renamed from: N */
    public String f19053N;

    /* JADX INFO: renamed from: V1 */
    public boolean f19055V1;

    /* JADX INFO: renamed from: X */
    public b8c f19056X;

    /* JADX INFO: renamed from: Z */
    public String f19058Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f19059Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f19061a2;

    /* JADX INFO: renamed from: b */
    public List<DeviceSettingBean> f19062b;

    /* JADX INFO: renamed from: b2 */
    public boolean f19063b2;

    /* JADX INFO: renamed from: c */
    public List<DeviceSettingBean> f19064c;

    /* JADX INFO: renamed from: d */
    public int f19066d;

    /* JADX INFO: renamed from: e */
    public fzd f19067e;

    /* JADX INFO: renamed from: f */
    public boolean f19068f;

    /* JADX INFO: renamed from: m */
    public boolean f19069m;

    /* JADX INFO: renamed from: a */
    public final String f19060a = "customer_code";

    /* JADX INFO: renamed from: Q */
    public String f19054Q = "";

    /* JADX INFO: renamed from: Y */
    public int f19057Y = 0;

    /* JADX INFO: renamed from: M1 */
    public String f19052M1 = "";

    /* JADX INFO: renamed from: c2 */
    public final xcg<i91> f19065c2 = new xcg() { // from class: zl5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f105376a.lambda$new$4((i91) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$a */
    public class ViewOnClickListenerC2876a implements View.OnClickListener {
        public ViewOnClickListenerC2876a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EyevueDeviceSettingActivity.this.f19063b2 = !r3.f19063b2;
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28868c.setImageResource(EyevueDeviceSettingActivity.this.f19063b2 ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
            qq9.f75117a.putBoolean(qq9.C11584a.f75122c, EyevueDeviceSettingActivity.this.f19063b2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$b */
    public class ViewOnClickListenerC2877b implements View.OnClickListener {
        public ViewOnClickListenerC2877b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if ((TextUtils.isEmpty(EyevueDeviceSettingActivity.this.f19051M) && TextUtils.isEmpty(EyevueDeviceSettingActivity.this.f19058Z)) || TextUtils.isEmpty(EyevueDeviceSettingActivity.this.f19053N)) {
                EyevueDeviceSettingActivity eyevueDeviceSettingActivity = EyevueDeviceSettingActivity.this;
                eyevueDeviceSettingActivity.showOtaTipDialog(eyevueDeviceSettingActivity.getString(C2531R.string.string_system_update), EyevueDeviceSettingActivity.this.getString(C2531R.string.string_glass_system_is_new));
            } else {
                if (TextUtils.isEmpty(t77.f83923b) || !ModUtils.bleCore.isConnected()) {
                    ToastUtils.showShort(EyevueDeviceSettingActivity.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                    return;
                }
                EyevueDeviceSettingActivity eyevueDeviceSettingActivity2 = EyevueDeviceSettingActivity.this;
                if (eyevueDeviceSettingActivity2.f19057Y >= 10) {
                    eyevueDeviceSettingActivity2.f19051M = "";
                }
                EyevueDeviceSettingActivity eyevueDeviceSettingActivity3 = EyevueDeviceSettingActivity.this;
                EyevueOtaActivity.startActivity(eyevueDeviceSettingActivity3, 100, eyevueDeviceSettingActivity3.f19058Z, EyevueDeviceSettingActivity.this.f19051M, EyevueDeviceSettingActivity.this.f19053N, EyevueDeviceSettingActivity.this.f19054Q);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$c */
    public class ViewOnClickListenerC2878c implements View.OnClickListener {
        public ViewOnClickListenerC2878c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.f19055V1 = !r3.f19055V1;
            vfe.getInstance().putBoolean(u77.f86969m, EyevueDeviceSettingActivity.this.f19055V1);
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28882m.setImageResource(EyevueDeviceSettingActivity.this.f19055V1 ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$d */
    public class ViewOnClickListenerC2879d implements View.OnClickListener {
        public ViewOnClickListenerC2879d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.f19059Z1 = !r3.f19059Z1;
            ModUtils.sendViaBle().setVoiceAssistantStatus(EyevueDeviceSettingActivity.this.f19059Z1, EyevueDeviceSettingActivity.this.f19061a2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$e */
    public class ViewOnClickListenerC2880e implements View.OnClickListener {
        public ViewOnClickListenerC2880e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.f19061a2 = !r3.f19061a2;
            ModUtils.sendViaBle().setVoiceAssistantStatus(EyevueDeviceSettingActivity.this.f19059Z1, EyevueDeviceSettingActivity.this.f19061a2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$f */
    public class C2881f implements ModBleResponse.OnVideoTimeListener {
        public C2881f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoTime$0(int i) {
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28878i2.setText(i + "min");
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnVideoTimeListener
        public void onVideoTime(int time) {
            EyevueDeviceSettingActivity.this.f19066d = time;
            final int i = time / 60;
            EyevueDeviceSettingActivity.this.runOnUiThread(new Runnable() { // from class: em5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33455a.lambda$onVideoTime$0(i);
                }
            });
            EyevueDeviceSettingActivity.this.showSettingSuccess();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$g */
    public class C2882g implements ModBleResponse.OnRecoverFactoryListener {
        public C2882g() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnRecoverFactoryListener
        public void onRecoverFactory() {
            if (EyevueDeviceSettingActivity.this.isDestroyed()) {
                return;
            }
            EyevueDeviceSettingActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$h */
    public class C2883h implements ModBleResponse.OnWearListener {
        public C2883h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWear$0() {
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28851C.setImageResource(EyevueDeviceSettingActivity.this.f19068f ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnWearListener
        public void onWear(boolean isWear) {
            EyevueDeviceSettingActivity.this.f19068f = isWear;
            EyevueDeviceSettingActivity.this.runOnUiThread(new Runnable() { // from class: fm5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37103a.lambda$onWear$0();
                }
            });
            EyevueDeviceSettingActivity.this.showSettingSuccess();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$i */
    public class C2884i implements ModBleResponse.OnDirectionListener {
        public C2884i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDirection$0(byte b) {
            EyevueDeviceSettingActivity.this.f19047C = b;
            if (b == Command.Param.CAMERA_VERTICAL) {
                ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28877h2.setText(EyevueDeviceSettingActivity.this.getString(C2531R.string.string_video_vertical));
            } else if (b == Command.Param.CAMERA_HORIZONTAL) {
                ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28877h2.setText(EyevueDeviceSettingActivity.this.getString(C2531R.string.string_video_horizontal));
            }
            EyevueDeviceSettingActivity.this.showSettingSuccess();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnDirectionListener
        public void onDirection(final byte direction) {
            EyevueDeviceSettingActivity.this.runOnUiThread(new Runnable() { // from class: gm5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40184a.lambda$onDirection$0(direction);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$j */
    public class C2885j implements ModBleResponse.OnDeviceInfoListener {
        public C2885j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDeviceInfo$0(String str) {
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28881l2.setText(k95.f53074X4 + str);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnDeviceInfoListener
        public void onDeviceInfo(final String btVersion, String ispVersion, String deviceVersion) {
            yi9.m26092e("onDeviceInfo", "btVersion:" + btVersion + " ispVersion:" + ispVersion + " deviceVersion:" + deviceVersion);
            EyevueDeviceSettingActivity.this.runOnUiThread(new Runnable() { // from class: hm5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44106a.lambda$onDeviceInfo$0(btVersion);
                }
            });
            EyevueDeviceSettingActivity.this.f19049H = btVersion;
            EyevueDeviceSettingActivity.this.f19050L.requestData(EyevueDeviceSettingActivity.this.f19049H, EyevueDeviceSettingActivity.this.f19052M1);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$k */
    public class ViewOnClickListenerC2886k implements View.OnClickListener {
        public ViewOnClickListenerC2886k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity eyevueDeviceSettingActivity = EyevueDeviceSettingActivity.this;
            int i = eyevueDeviceSettingActivity.f19057Y + 1;
            eyevueDeviceSettingActivity.f19057Y = i;
            if (i >= 5 && i < 10) {
                ((C4681da) ((BaseActivity) eyevueDeviceSettingActivity).binding).f28856M1.setVisibility(0);
                return;
            }
            if (i >= 10) {
                String string = vfe.getInstance().getString("customer_code", "");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                ToastUtils.showShort("COMPULSORY OTA / 强制OTA");
                EyevueDeviceSettingActivity.this.f19049H = "1.0.0";
                EyevueDeviceSettingActivity.this.f19050L.requestData(EyevueDeviceSettingActivity.this.f19049H, string);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$l */
    public class C2887l implements ModBleResponse.OnCustomerListener {
        public C2887l() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnCustomerListener
        public void onCustomer(String customer, String project) {
            EyevueDeviceSettingActivity.this.f19052M1 = project + customer;
            vfe.getInstance().putString("customer_code", EyevueDeviceSettingActivity.this.f19052M1);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$m */
    public class C2888m implements ModBleResponse.OnVoiceAssistantStatusListener {
        public C2888m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVoiceAssistantDisable$0(boolean z, boolean z2) {
            EyevueDeviceSettingActivity.this.f19059Z1 = z;
            EyevueDeviceSettingActivity.this.f19061a2 = z2;
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28870d.setImageResource(z ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28874f.setImageResource(z2 ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnVoiceAssistantStatusListener
        public void onVoiceAssistantDisable(final boolean isLocalOfflineSpeech, final boolean isAiWakeUp) {
            EyevueDeviceSettingActivity.this.runOnUiThread(new Runnable() { // from class: im5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47433a.lambda$onVoiceAssistantDisable$0(isLocalOfflineSpeech, isAiWakeUp);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$n */
    public class C2889n implements q94.InterfaceC11390a {
        public C2889n() {
        }

        @Override // p000.q94.InterfaceC11390a
        public void onValue(int value) {
            ModUtils.sendViaBle().setCameraDirection(value);
            EyevueDeviceSettingActivity.this.f19069m = true;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$o */
    public class C2890o implements q94.InterfaceC11390a {
        public C2890o() {
        }

        @Override // p000.q94.InterfaceC11390a
        public void onValue(int value) {
            ModUtils.sendViaBle().setRecordDuration(value);
            EyevueDeviceSettingActivity.this.f19069m = true;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$p */
    public class C2891p implements fzd.InterfaceC6044c {
        public C2891p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onAgree$0() {
            ModUtils.bleCore.disconnect();
            BluetoothDevice remoteDevice = BluetoothUtil.getRemoteDevice(t77.f83923b);
            if (remoteDevice != null) {
                BluetoothUtil.removeBond(remoteDevice);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAgree$1() {
            EyevueDeviceSettingActivity.this.finish();
        }

        @Override // p000.fzd.InterfaceC6044c
        public void onAgree() {
            if (TextUtils.isEmpty(t77.f83923b)) {
                DeviceInfoBean latestOne = DeviceListDatabase.getDatabase(EyevueDeviceSettingActivity.this).getDeviceListDao().getLatestOne();
                if (latestOne != null) {
                    DeviceListDatabase.getDatabase(EyevueDeviceSettingActivity.this).getDeviceListDao().deleteByMac(latestOne.getMac());
                }
            } else {
                DeviceListDatabase.getDatabase(EyevueDeviceSettingActivity.this).getDeviceListDao().deleteByMac(t77.f83923b);
            }
            ModUtils.sendViaBle().resetFactory();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: jm5
                @Override // java.lang.Runnable
                public final void run() {
                    EyevueDeviceSettingActivity.C2891p.lambda$onAgree$0();
                }
            }, 500L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: km5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54677a.lambda$onAgree$1();
                }
            }, 1500L);
        }

        @Override // p000.fzd.InterfaceC6044c
        public void onDisagree() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$q */
    public class C2892q implements b8c.InterfaceC1780b {
        public C2892q() {
        }

        @Override // p000.b8c.InterfaceC1780b
        public void onAgree() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$r */
    public class ViewOnClickListenerC2893r implements View.OnClickListener {
        public ViewOnClickListenerC2893r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.showVideoDurationDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$s */
    public class ViewOnClickListenerC2894s implements View.OnClickListener {
        public ViewOnClickListenerC2894s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.startActivity(new Intent(EyevueDeviceSettingActivity.this, (Class<?>) EyevueDeviceGestureActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$t */
    public class ViewOnClickListenerC2895t implements View.OnClickListener {
        public ViewOnClickListenerC2895t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ModUtils.sendViaBle().getDeviceCapacity();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$u */
    public class ViewOnClickListenerC2896u implements View.OnClickListener {
        public ViewOnClickListenerC2896u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.f19068f = !r3.f19068f;
            EyevueDeviceSettingActivity.this.f19069m = true;
            if (EyevueDeviceSettingActivity.this.f19068f) {
                ModUtils.sendViaBle().setWearDetect(Command.Param.WEAR_DETECT_ON);
            } else {
                ModUtils.sendViaBle().setWearDetect(Command.Param.WEAR_DETECT_OFF);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$v */
    public class ViewOnClickListenerC2897v implements View.OnClickListener {
        public ViewOnClickListenerC2897v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.showRemoveBondDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$w */
    public class ViewOnClickListenerC2898w implements View.OnClickListener {
        public ViewOnClickListenerC2898w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.startActivity(new Intent(EyevueDeviceSettingActivity.this, (Class<?>) EyevueDeviceAboutActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$x */
    public class ViewOnClickListenerC2899x implements View.OnClickListener {
        public ViewOnClickListenerC2899x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueDeviceSettingActivity.this.showVideoDirectionDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity$y */
    public class ViewOnClickListenerC2900y implements View.OnClickListener {
        public ViewOnClickListenerC2900y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EyevueDeviceSettingActivity.this.f19048F = !r3.f19048F;
            ((C4681da) ((BaseActivity) EyevueDeviceSettingActivity.this).binding).f28872e.setImageResource(EyevueDeviceSettingActivity.this.f19048F ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
            qq9.f75117a.putBoolean(qq9.C11584a.f75121b, EyevueDeviceSettingActivity.this.f19048F);
        }
    }

    private void clearVersionData() {
        this.f19051M = "";
        this.f19058Z = "";
        this.f19053N = "";
        this.f19054Q = "";
        ((C4681da) this.binding).f28888r2.setVisibility(8);
        ((C4681da) this.binding).f28881l2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$0() {
        ModUtils.sendViaBle().getVoiceAssistantStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$1() {
        ModUtils.sendViaBle().appGetDevicdInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$2() {
        ModUtils.sendViaBle().getCustomer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(i91 i91Var) {
        T t;
        String str = i91Var.f46089a;
        str.hashCode();
        if (str.equals(i91.f46088f)) {
            T t2 = this.binding;
            if (t2 != 0) {
                ((C4681da) t2).f28858Q.setVisibility(0);
                return;
            }
            return;
        }
        if (str.equals(i91.f46087e) && (t = this.binding) != 0) {
            ((C4681da) t).f28858Q.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityResult$3() {
        ModUtils.sendViaBle().appGetDevicdInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onGetDataSuccess$5(String str, OtaBean.WifiDTO.InternationalDataDTO internationalDataDTO) {
        return str.contains(internationalDataDTO.getLanguageCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onGetDataSuccess$6(String str, OtaBean.BleDTO.InternationalDataDTO internationalDataDTO) {
        return str.contains(internationalDataDTO.getLanguageCode());
    }

    private void setListener() {
        zgb.defaultCenter().subscribeStrongly(i91.class, this.f19065c2);
        ((C4681da) this.binding).f28873e2.setOnClickListener(new ViewOnClickListenerC2886k());
        ((C4681da) this.binding).f28863Z1.setOnClickListener(new ViewOnClickListenerC2893r());
        ((C4681da) this.binding).f28879j2.setOnClickListener(new ViewOnClickListenerC2894s());
        ((C4681da) this.binding).f28876g2.setOnClickListener(new ViewOnClickListenerC2895t());
        ((C4681da) this.binding).f28851C.setOnClickListener(new ViewOnClickListenerC2896u());
        ((C4681da) this.binding).f28866b.setOnClickListener(new ViewOnClickListenerC2897v());
        ((C4681da) this.binding).f28876g2.setOnClickListener(new ViewOnClickListenerC2898w());
        ((C4681da) this.binding).f28859V1.setOnClickListener(new ViewOnClickListenerC2899x());
        ((C4681da) this.binding).f28872e.setOnClickListener(new ViewOnClickListenerC2900y());
        ((C4681da) this.binding).f28868c.setOnClickListener(new ViewOnClickListenerC2876a());
        ((C4681da) this.binding).f28856M1.setOnClickListener(new ViewOnClickListenerC2877b());
        boolean z = vfe.getInstance().getBoolean(u77.f86969m, false);
        this.f19055V1 = z;
        ((C4681da) this.binding).f28882m.setImageResource(z ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        ((C4681da) this.binding).f28882m.setOnClickListener(new ViewOnClickListenerC2878c());
        ((C4681da) this.binding).f28870d.setOnClickListener(new ViewOnClickListenerC2879d());
        ((C4681da) this.binding).f28874f.setOnClickListener(new ViewOnClickListenerC2880e());
        ModUtils.modBleResponse().setOnVideoTimeListener(new C2881f());
        ModUtils.modBleResponse().setOnRecoverFactoryListener(new C2882g());
        ModUtils.modBleResponse().setOnWearListener(new C2883h());
        ModUtils.modBleResponse().setOnDirectionListener(new C2884i());
        ModUtils.modBleResponse().setOnDeviceInfoListener(new C2885j());
        ModUtils.modBleResponse().setOnCustomerListener(new C2887l());
        ModUtils.modBleResponse().setOnVoiceAssistantStatusListener(new C2888m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOtaTipDialog(String tip, String tipContent) {
        if (this.f19056X == null) {
            this.f19056X = new b8c(this, new C2892q());
        }
        b8c b8cVar = this.f19056X;
        if (b8cVar == null || b8cVar.isShowing()) {
            return;
        }
        this.f19056X.setText(tip, tipContent);
        this.f19056X.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRemoveBondDialog() {
        if (this.f19067e == null) {
            this.f19067e = new fzd(this, new C2891p());
        }
        fzd fzdVar = this.f19067e;
        if (fzdVar == null || fzdVar.isShowing()) {
            return;
        }
        this.f19067e.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSettingSuccess() {
        if (this.f19069m) {
            ToastUtils.showShort(getString(C2531R.string.string_setting_success));
            this.f19069m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showVideoDirectionDialog() {
        if (this.f19064c == null) {
            this.f19064c = Arrays.asList(new DeviceSettingBean(getString(C2531R.string.string_video_horizontal), Command.Param.CAMERA_HORIZONTAL, 49), new DeviceSettingBean(getString(C2531R.string.string_video_vertical), Command.Param.CAMERA_VERTICAL, 48));
        }
        new q94(this, getString(C2531R.string.string_takepicture_mode), this.f19064c, this.f19047C, new C2889n()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showVideoDurationDialog() {
        if (this.f19062b == null) {
            this.f19062b = Arrays.asList(new DeviceSettingBean(getString(C2531R.string.string_10min), Command.Param.RECORD_TIME_10MIN, 600), new DeviceSettingBean(getString(C2531R.string.string_7min), Command.Param.RECORD_TIME_7MIN, 420), new DeviceSettingBean(getString(C2531R.string.string_5min), Command.Param.RECORD_TIME_5MIN, 300), new DeviceSettingBean(getString(C2531R.string.string_3min), Command.Param.RECORD_TIME_3MIN, 180), new DeviceSettingBean(getString(C2531R.string.string_1min), Command.Param.RECORD_TIME_1MIN, 60));
        }
        new q94(this, getString(C2531R.string.string_device_video_duration), this.f19062b, this.f19066d, new C2890o()).show();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C4681da getViewBinding() {
        return C4681da.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        yp0.setStatusBarLightMode((Activity) this, false);
        this.f19050L = new e8c(this);
        ((C4681da) this.binding).f28873e2.hideBottomLine();
        ((C4681da) this.binding).f28873e2.setTitle(getString(C2531R.string.eyevue_mine_setting));
        setListener();
        if (!ModUtils.bleCore.isConnected()) {
            ((C4681da) this.binding).f28858Q.setVisibility(0);
        }
        ModUtils.sendViaBle().appGetDeviceStatus();
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: am5
            @Override // java.lang.Runnable
            public final void run() {
                EyevueDeviceSettingActivity.lambda$initView$0();
            }
        }, 200L);
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: bm5
            @Override // java.lang.Runnable
            public final void run() {
                EyevueDeviceSettingActivity.lambda$initView$1();
            }
        }, 800L);
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: cm5
            @Override // java.lang.Runnable
            public final void run() {
                EyevueDeviceSettingActivity.lambda$initView$2();
            }
        }, 400L);
        qq9 qq9Var = qq9.f75117a;
        boolean z = qq9Var.getBoolean(qq9.C11584a.f75121b, false);
        this.f19048F = z;
        ((C4681da) this.binding).f28872e.setImageResource(z ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        boolean z2 = qq9Var.getBoolean(qq9.C11584a.f75122c, false);
        this.f19063b2 = z2;
        ((C4681da) this.binding).f28868c.setImageResource(z2 ? C2531R.drawable.ic_select : C2531R.drawable.ic_unselect);
        yi9.m26092e(f19046d2, "supportPhotoWatermark:" + u77.f86972p);
        ((C4681da) this.binding).f28869c2.setVisibility(u77.f86972p ? 0 : 8);
        if (!u77.f86972p) {
            vfe.getInstance().putBoolean(u77.f86969m, false);
        }
        yi9.m26092e("supportStabilizationDynamic", u77.f86975s + ":::" + u77.f86976t);
        if (u77.f86975s && !u77.f86976t) {
            ((C4681da) this.binding).f28865a2.setVisibility(8);
            qq9Var.putBoolean(qq9.C11584a.f75121b, false);
        } else {
            ((C4681da) this.binding).f28865a2.setVisibility(0);
        }
        yi9.m26092e("supportScreenOrientationDynamic", u77.f86977u + ":::" + u77.f86978v);
        if (u77.f86977u && !u77.f86978v) {
            ((C4681da) this.binding).f28859V1.setVisibility(8);
            ((C4681da) this.binding).f28853H.setVisibility(8);
        } else {
            ((C4681da) this.binding).f28859V1.setVisibility(0);
        }
        yi9.m26092e("supportWearDetectionDynamic", u77.f86973q + ":::" + u77.f86974r);
        if (u77.f86973q && !u77.f86974r) {
            ((C4681da) this.binding).f28871d2.setVisibility(8);
            ((C4681da) this.binding).f28857N.setVisibility(8);
        } else {
            ((C4681da) this.binding).f28871d2.setVisibility(0);
        }
        yi9.m26092e("supportAiWakeWord", u77.f86980x + ":::" + u77.f86981y);
        if (!u77.f86980x && !u77.f86981y) {
            ((C4681da) this.binding).f28875f2.setVisibility(8);
            ((C4681da) this.binding).f28862Z.setVisibility(8);
            ((C4681da) this.binding).f28867b2.setVisibility(8);
            ((C4681da) this.binding).f28860X.setVisibility(8);
            return;
        }
        ((C4681da) this.binding).f28875f2.setVisibility(0);
        ((C4681da) this.binding).f28860X.setVisibility(0);
        if (u77.f86980x) {
            ((C4681da) this.binding).f28867b2.setVisibility(0);
        } else {
            ((C4681da) this.binding).f28867b2.setVisibility(8);
            ((C4681da) this.binding).f28855M.setVisibility(8);
        }
        if (u77.f86981y) {
            ((C4681da) this.binding).f28862Z.setVisibility(0);
        } else {
            ((C4681da) this.binding).f28862Z.setVisibility(8);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, @hib Intent data, @efb ComponentCaller caller) {
        super.onActivityResult(requestCode, resultCode, data, caller);
        if (requestCode == 100 && resultCode == -1 && data != null && data.getBooleanExtra(EyevueOtaActivity.f19102o2, false)) {
            clearVersionData();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: dm5
                @Override // java.lang.Runnable
                public final void run() {
                    EyevueDeviceSettingActivity.lambda$onActivityResult$3();
                }
            }, 500L);
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(i91.class, this.f19065c2);
    }

    @Override // p000.x7c.InterfaceC14970b
    public void onGetDataFail(int code, String msg) {
    }

    @Override // p000.x7c.InterfaceC14970b
    public void onGetDataSuccess(OtaBean otaBean, boolean isCache, boolean isRefresh) {
        if (otaBean.getBle() == null && otaBean.getWifi() == null) {
            clearVersionData();
            return;
        }
        final String string = vfe.getInstance().getString(vfe.C14037b.f90986p);
        boolean z = vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true);
        if (TextUtils.isEmpty(string) || z) {
            string = Locale.getDefault().toString();
        }
        OtaBean.WifiDTO wifi = otaBean.getWifi();
        if (wifi != null) {
            OtaBean.WifiDTO.OtaPackageDTO otaPackage = wifi.getOtaPackage();
            if (otaPackage != null) {
                this.f19051M = otaPackage.getOtaArray();
                this.f19053N = otaPackage.getDeviceVersion();
            }
            if (wifi.getInternationalData() != null && !wifi.getInternationalData().isEmpty()) {
                if (TextUtils.isEmpty(string)) {
                    this.f19054Q = wifi.getInternationalData().get(0).getDetail();
                } else {
                    Optional<OtaBean.WifiDTO.InternationalDataDTO> optionalFindFirst = wifi.getInternationalData().stream().filter(new Predicate() { // from class: xl5
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return EyevueDeviceSettingActivity.lambda$onGetDataSuccess$5(string, (OtaBean.WifiDTO.InternationalDataDTO) obj);
                        }
                    }).findFirst();
                    if (optionalFindFirst.isPresent()) {
                        this.f19054Q = optionalFindFirst.get().getDetail();
                    } else {
                        this.f19054Q = wifi.getInternationalData().get(0).getDetail();
                    }
                }
            }
        }
        OtaBean.BleDTO ble = otaBean.getBle();
        if (ble != null) {
            OtaBean.BleDTO.OtaPackageDTO otaPackage2 = ble.getOtaPackage();
            if (otaPackage2 != null) {
                this.f19058Z = otaPackage2.getOtaArray();
                this.f19053N = otaPackage2.getDeviceVersion();
            }
            if (ble.getInternationalData() != null && !ble.getInternationalData().isEmpty()) {
                if (TextUtils.isEmpty(string)) {
                    this.f19054Q += "\n" + ble.getInternationalData().get(0).getDetail();
                } else {
                    Optional<OtaBean.BleDTO.InternationalDataDTO> optionalFindFirst2 = ble.getInternationalData().stream().filter(new Predicate() { // from class: yl5
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return EyevueDeviceSettingActivity.lambda$onGetDataSuccess$6(string, (OtaBean.BleDTO.InternationalDataDTO) obj);
                        }
                    }).findFirst();
                    if (optionalFindFirst2.isPresent()) {
                        this.f19054Q += "\n" + optionalFindFirst2.get().getDetail();
                    } else {
                        this.f19054Q += "\n" + ble.getInternationalData().get(0).getDetail();
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.f19053N)) {
            return;
        }
        ((C4681da) this.binding).f28888r2.setVisibility(0);
        ((C4681da) this.binding).f28881l2.setText(k95.f53074X4 + this.f19053N);
    }
}
