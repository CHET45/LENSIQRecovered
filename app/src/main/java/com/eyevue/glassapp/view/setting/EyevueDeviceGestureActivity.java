package com.eyevue.glassapp.view.setting;

import android.app.Activity;
import android.view.View;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.DeviceSettingBean;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.view.setting.EyevueDeviceGestureActivity;
import com.watchfun.base.BaseActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p000.C6177ga;
import p000.pud;
import p000.q94;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueDeviceGestureActivity extends BaseActivity<C6177ga> {

    /* JADX INFO: renamed from: F */
    public int f19030F;

    /* JADX INFO: renamed from: H */
    public int f19031H;

    /* JADX INFO: renamed from: L */
    public int f19032L;

    /* JADX INFO: renamed from: M */
    public int f19033M;

    /* JADX INFO: renamed from: N */
    public int f19034N;

    /* JADX INFO: renamed from: Q */
    public pud f19035Q;

    /* JADX INFO: renamed from: X */
    public boolean f19036X;

    /* JADX INFO: renamed from: f */
    public q94 f19042f;

    /* JADX INFO: renamed from: m */
    public List<DeviceSettingBean> f19043m;

    /* JADX INFO: renamed from: a */
    public final int f19037a = 0;

    /* JADX INFO: renamed from: b */
    public final int f19038b = 1;

    /* JADX INFO: renamed from: c */
    public final int f19039c = 2;

    /* JADX INFO: renamed from: d */
    public final int f19040d = 3;

    /* JADX INFO: renamed from: e */
    public final int f19041e = 4;

    /* JADX INFO: renamed from: C */
    public HashMap<Integer, String> f19029C = new HashMap<>();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceGestureActivity$a */
    public class C2874a implements ModBleResponse.onGestureListener {
        public C2874a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGesture$0(int i, int i2) {
            if (i == 7) {
                EyevueDeviceGestureActivity.this.f19030F = i2;
                ((C6177ga) ((BaseActivity) EyevueDeviceGestureActivity.this).binding).f39077M.setText((CharSequence) EyevueDeviceGestureActivity.this.f19029C.get(Integer.valueOf(i2)));
                EyevueDeviceGestureActivity.this.showSettingSuccess();
                return;
            }
            if (i == 8) {
                EyevueDeviceGestureActivity.this.f19031H = i2;
                ((C6177ga) ((BaseActivity) EyevueDeviceGestureActivity.this).binding).f39076L.setText((CharSequence) EyevueDeviceGestureActivity.this.f19029C.get(Integer.valueOf(i2)));
                EyevueDeviceGestureActivity.this.showSettingSuccess();
                return;
            }
            if (i == 9) {
                EyevueDeviceGestureActivity.this.f19032L = i2;
                ((C6177ga) ((BaseActivity) EyevueDeviceGestureActivity.this).binding).f39075H.setText((CharSequence) EyevueDeviceGestureActivity.this.f19029C.get(Integer.valueOf(i2)));
                EyevueDeviceGestureActivity.this.showSettingSuccess();
            } else if (i == 16) {
                EyevueDeviceGestureActivity.this.f19033M = i2;
                ((C6177ga) ((BaseActivity) EyevueDeviceGestureActivity.this).binding).f39074F.setText((CharSequence) EyevueDeviceGestureActivity.this.f19029C.get(Integer.valueOf(i2)));
                EyevueDeviceGestureActivity.this.showSettingSuccess();
            } else {
                if (i != 17) {
                    return;
                }
                EyevueDeviceGestureActivity.this.f19034N = i2;
                ((C6177ga) ((BaseActivity) EyevueDeviceGestureActivity.this).binding).f39078N.setText((CharSequence) EyevueDeviceGestureActivity.this.f19029C.get(Integer.valueOf(i2)));
                EyevueDeviceGestureActivity.this.showSettingSuccess();
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.onGestureListener
        public void onGesture(final int commandId, final int gesture) {
            EyevueDeviceGestureActivity.this.runOnUiThread(new Runnable() { // from class: ul5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88314a.lambda$onGesture$0(commandId, gesture);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceGestureActivity$b */
    public class C2875b implements pud.InterfaceC11130c {
        public C2875b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onAgree$0() {
            ModUtils.sendViaBle().appGetDeviceStatus();
        }

        @Override // p000.pud.InterfaceC11130c
        public void onAgree() {
            ModUtils.sendViaBle().gestureRecover();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: vl5
                @Override // java.lang.Runnable
                public final void run() {
                    EyevueDeviceGestureActivity.C2875b.lambda$onAgree$0();
                }
            }, 1000L);
        }

        @Override // p000.pud.InterfaceC11130c
        public void onDisagree() {
        }
    }

    private void initListener() {
        ((C6177ga) this.binding).f39084f.setOnClickListener(new View.OnClickListener() { // from class: nl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f64842a.lambda$initListener$0(view);
            }
        });
        ((C6177ga) this.binding).f39083e.setOnClickListener(new View.OnClickListener() { // from class: ol5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68030a.lambda$initListener$1(view);
            }
        });
        ((C6177ga) this.binding).f39082d.setOnClickListener(new View.OnClickListener() { // from class: pl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71309a.lambda$initListener$2(view);
            }
        });
        ((C6177ga) this.binding).f39081c.setOnClickListener(new View.OnClickListener() { // from class: ql5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74789a.lambda$initListener$3(view);
            }
        });
        ((C6177ga) this.binding).f39085m.setOnClickListener(new View.OnClickListener() { // from class: rl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78614a.lambda$initListener$4(view);
            }
        });
        ((C6177ga) this.binding).f39080b.setOnClickListener(new View.OnClickListener() { // from class: sl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82169a.lambda$initListener$5(view);
            }
        });
        ModUtils.modBleResponse().setOnGestureListener(new C2874a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        showSettingDialog(0, getString(C2531R.string.string_slide_forward), this.f19030F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        showSettingDialog(1, getString(C2531R.string.string_slide_back), this.f19031H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        showSettingDialog(2, getString(C2531R.string.eyevue_single_click), this.f19032L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(View view) {
        showSettingDialog(3, getString(C2531R.string.eyevue_double_click), this.f19033M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(View view) {
        showSettingDialog(4, getString(C2531R.string.eyevue_three_click), this.f19034N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(View view) {
        showRecoverDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSettingDialog$6(int i, int i2) {
        if (i == 0) {
            ModUtils.sendViaBle().gestureFrontSwipe(i2);
        } else if (i == 1) {
            ModUtils.sendViaBle().gestureBackSwipe(i2);
        } else if (i == 2) {
            ModUtils.sendViaBle().gestureClick(i2);
        } else if (i == 3) {
            ModUtils.sendViaBle().gestureDoubleClick(i2);
        } else if (i == 4) {
            ModUtils.sendViaBle().gestureTripleClick(i2);
        }
        this.f19036X = true;
    }

    private void showRecoverDialog() {
        if (this.f19035Q == null) {
            this.f19035Q = new pud(this, new C2875b());
        }
        pud pudVar = this.f19035Q;
        if (pudVar == null || pudVar.isShowing()) {
            return;
        }
        this.f19035Q.show();
    }

    private void showSettingDialog(final int type, String title, int intValue) {
        q94 q94Var = this.f19042f;
        if (q94Var != null) {
            q94Var.dismiss();
            this.f19042f = null;
        }
        q94 q94Var2 = new q94(this, title, this.f19043m, intValue, new q94.InterfaceC11390a() { // from class: tl5
            @Override // p000.q94.InterfaceC11390a
            public final void onValue(int i) {
                this.f85181a.lambda$showSettingDialog$6(type, i);
            }
        });
        this.f19042f = q94Var2;
        q94Var2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSettingSuccess() {
        if (this.f19036X) {
            ToastUtils.showShort(getString(C2531R.string.string_setting_success));
            this.f19036X = false;
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        yp0.setStatusBarLightMode((Activity) this, false);
        ((C6177ga) this.binding).f39073C.setTitle(getString(C2531R.string.string_device_gesture));
        this.f19043m = Arrays.asList(new DeviceSettingBean(getString(C2531R.string.string_next_song), Command.Param.MUSIC_NEXT, 52), new DeviceSettingBean(getString(C2531R.string.string_pre_song), Command.Param.MUSIC_PREV, 51), new DeviceSettingBean(getString(C2531R.string.string_pause_play_answer), Command.Param.VOLUME_PAUSE_PLAY_ANSWER_HANGUP, 50), new DeviceSettingBean(getString(C2531R.string.string_volume_up), Command.Param.VOLUME_BIG, 49), new DeviceSettingBean(getString(C2531R.string.string_volume_down), Command.Param.VOLUME_SMALL, 48));
        this.f19029C.put(Integer.valueOf(Command.Param.MUSIC_NEXT), getString(C2531R.string.string_next_song));
        this.f19029C.put(Integer.valueOf(Command.Param.MUSIC_PREV), getString(C2531R.string.string_pre_song));
        this.f19029C.put(Integer.valueOf(Command.Param.VOLUME_PAUSE_PLAY_ANSWER_HANGUP), getString(C2531R.string.string_pause_play_answer));
        this.f19029C.put(Integer.valueOf(Command.Param.VOLUME_BIG), getString(C2531R.string.string_volume_up));
        this.f19029C.put(Integer.valueOf(Command.Param.VOLUME_SMALL), getString(C2531R.string.string_volume_down));
        initListener();
        ModUtils.sendViaBle().appGetDeviceStatus();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C6177ga getViewBinding() {
        return C6177ga.inflate(getLayoutInflater());
    }
}
