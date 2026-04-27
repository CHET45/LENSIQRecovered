package com.eyevue.glassapp.view.home;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.C2468a;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2474g;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.AITransBean;
import com.eyevue.common.bean.ProjectInfoBean;
import com.eyevue.common.bean.SupportDeviceBean;
import com.eyevue.common.bean.ota.OtaBean;
import com.eyevue.common.bean.update.VersionData;
import com.eyevue.glassapp.base.BaseBluetoothFragment;
import com.eyevue.glassapp.bluetooth.BluetoothUtil;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.database.device.DeviceInfoBean;
import com.eyevue.glassapp.database.device.DeviceListDao;
import com.eyevue.glassapp.database.device.DeviceListDatabase;
import com.eyevue.glassapp.floatwindow.service.DaemonService;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.helper.UpdateHelper;
import com.eyevue.glassapp.location.LocationManager;
import com.eyevue.glassapp.services.EyevueAiService;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.eyevue.glassapp.view.MainActivity;
import com.eyevue.glassapp.view.connect.EyevueDeviceListActivity;
import com.eyevue.glassapp.view.guidance.EyevueGuideActivity;
import com.eyevue.glassapp.view.guidance.EyevueVoiceAssistantActivity;
import com.eyevue.glassapp.view.home.HomeFragment;
import com.eyevue.glassapp.view.live.EyevueLiveActivity;
import com.eyevue.glassapp.view.setting.EyevueDeviceSettingActivity;
import com.eyevue.glassapp.view.setting.EyevueOtaActivity;
import com.eyevue.glassapp.view.sound.EyevueQuickVolumeActivity;
import com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity;
import com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity;
import com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity;
import com.google.gson.Gson;
import com.watchfun.callvideo.activity.TransVideoActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transphoto.PhotoTransActivity;
import com.watchfun.voicenotes.RecordActivity;
import com.watchfun.voicenotes.VoiceNoteActivityV1;
import com.watchfun.voicenotes.VoiceNoteActivityV2;
import com.watchfun.voicenotes.bean.BleConnectStatusEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opencv.videoio.Videoio;
import p000.AbstractC11416qc;
import p000.C6045g;
import p000.C7330im;
import p000.C9278mc;
import p000.InterfaceC5717fc;
import p000.a8c;
import p000.c1i;
import p000.c40;
import p000.d94;
import p000.dc2;
import p000.dr2;
import p000.e8c;
import p000.efb;
import p000.ek9;
import p000.gkg;
import p000.hib;
import p000.i91;
import p000.lx2;
import p000.m3h;
import p000.mu6;
import p000.ne4;
import p000.nfd;
import p000.pb9;
import p000.pfd;
import p000.phg;
import p000.qgi;
import p000.qwh;
import p000.qxb;
import p000.rc7;
import p000.rgi;
import p000.sfe;
import p000.swh;
import p000.t77;
import p000.t84;
import p000.t94;
import p000.u56;
import p000.u77;
import p000.u91;
import p000.v84;
import p000.vfe;
import p000.x4f;
import p000.x7c;
import p000.xcg;
import p000.xnc;
import p000.yp0;
import p000.yv7;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class HomeFragment extends BaseBluetoothFragment<mu6> implements nfd.InterfaceC9862b, t84.InterfaceC12946b, BaseBluetoothFragment.InterfaceC2567e, qxb<Boolean>, x7c.InterfaceC14970b, qwh.InterfaceC11753b {

    /* JADX INFO: renamed from: n2 */
    public static final String f18611n2 = "HomeFragment";

    /* JADX INFO: renamed from: C */
    public boolean f18612C;

    /* JADX INFO: renamed from: F */
    public long f18613F;

    /* JADX INFO: renamed from: L */
    public DeviceListDao f18615L;

    /* JADX INFO: renamed from: M */
    public GridLayoutManager f18616M;

    /* JADX INFO: renamed from: N */
    public C6045g f18618N;

    /* JADX INFO: renamed from: Q */
    public rgi f18619Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f18620V1;

    /* JADX INFO: renamed from: X */
    public qgi f18621X;

    /* JADX INFO: renamed from: Y */
    public v84 f18622Y;

    /* JADX INFO: renamed from: Z */
    public int f18623Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f18624Z1;

    /* JADX INFO: renamed from: a */
    public pfd f18625a;

    /* JADX INFO: renamed from: a2 */
    public String f18626a2;

    /* JADX INFO: renamed from: b2 */
    public String f18628b2;

    /* JADX INFO: renamed from: c */
    public Runnable f18629c;

    /* JADX INFO: renamed from: c2 */
    public e8c f18630c2;

    /* JADX INFO: renamed from: d */
    public boolean f18631d;

    /* JADX INFO: renamed from: d2 */
    public swh f18632d2;

    /* JADX INFO: renamed from: e */
    public boolean f18633e;

    /* JADX INFO: renamed from: e2 */
    public AbstractC11416qc<Intent> f18634e2;

    /* JADX INFO: renamed from: f */
    public dr2 f18635f;

    /* JADX INFO: renamed from: f2 */
    public boolean f18636f2;

    /* JADX INFO: renamed from: g2 */
    public BluetoothDevice f18637g2;

    /* JADX INFO: renamed from: m */
    public u91 f18643m;

    /* JADX INFO: renamed from: m2 */
    public dc2 f18644m2;

    /* JADX INFO: renamed from: b */
    public final Handler f18627b = new Handler();

    /* JADX INFO: renamed from: H */
    public final int f18614H = 3;

    /* JADX INFO: renamed from: M1 */
    public final int f18617M1 = 3;

    /* JADX INFO: renamed from: h2 */
    public final xcg<i91> f18638h2 = new xcg() { // from class: rk7
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f78556a.lambda$new$18((i91) obj);
        }
    };

    /* JADX INFO: renamed from: i2 */
    public final ModBleResponse.OnBatterDataListener f18639i2 = new C2797i();

    /* JADX INFO: renamed from: j2 */
    public final xcg<d94> f18640j2 = new xcg() { // from class: tk7
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f85131a.lambda$new$19((d94) obj);
        }
    };

    /* JADX INFO: renamed from: k2 */
    public final xcg<a8c> f18641k2 = new xcg() { // from class: uk7
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f88234a.lambda$new$20((a8c) obj);
        }
    };

    /* JADX INFO: renamed from: l2 */
    public final AbstractC11416qc<String[]> f18642l2 = registerForActivityResult(new C9278mc.k(), new InterfaceC5717fc() { // from class: vk7
        @Override // p000.InterfaceC5717fc
        public final void onActivityResult(Object obj) {
            this.f91520a.lambda$new$22((Map) obj);
        }
    });

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$a */
    public class ViewOnClickListenerC2789a implements View.OnClickListener {
        public ViewOnClickListenerC2789a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ModUtils.bleCore.isConnected()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            if (u77.f86955C || u77.f86954B) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_recording_tip));
            } else if (u77.f86956D) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_isp_importing));
            } else {
                HomeFragment.this.startActivity(new Intent(HomeFragment.this.getContext(), (Class<?>) EyevueGuideActivity.class));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$b */
    public class ViewOnClickListenerC2790b implements View.OnClickListener {
        public ViewOnClickListenerC2790b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ModUtils.bleCore.isConnected()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            if (u77.f86955C || u77.f86954B) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_recording_tip));
            } else if (u77.f86956D) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_isp_importing));
            } else {
                ModUtils.sendViaBle().takePhoto(Command.Param.TAKE_PHOTO_THUMBNAIL);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$c */
    public class ViewOnClickListenerC2791c implements View.OnClickListener {
        public ViewOnClickListenerC2791c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ModUtils.bleCore.isConnected()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            if (u77.f86955C) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_recording_tip));
                return;
            }
            if (u77.f86956D) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_isp_importing));
            } else if (u77.f86954B) {
                ModUtils.sendViaBle().stopRecord();
            } else {
                ModUtils.sendViaBle().startRecord();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$d */
    public class ViewOnClickListenerC2792d implements View.OnClickListener {
        public ViewOnClickListenerC2792d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ModUtils.bleCore.isConnected()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            if (u77.f86954B) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_recording_tip));
                return;
            }
            if (u77.f86956D) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_isp_importing));
            } else if (u77.f86955C) {
                ModUtils.sendViaBle().controlRecordAudio(Command.Param.RECORD_AUDIO_END);
            } else {
                ModUtils.sendViaBle().controlRecordAudio(Command.Param.RECORD_AUDIO_START);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$e */
    public class ViewOnClickListenerC2793e implements View.OnClickListener {
        public ViewOnClickListenerC2793e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (ModUtils.bleCore.isConnected()) {
                HomeFragment.this.startActivity(new Intent(HomeFragment.this.requireContext(), (Class<?>) EyevueQuickVolumeActivity.class));
            } else {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$f */
    public class ViewOnClickListenerC2794f implements View.OnClickListener {
        public ViewOnClickListenerC2794f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!ModUtils.bleCore.isConnected()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                return;
            }
            if (u77.f86955C || u77.f86954B) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_recording_tip));
            } else if (u77.f86956D) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.string_isp_importing));
            } else {
                HomeFragment.this.startActivity(new Intent(HomeFragment.this.requireContext(), (Class<?>) EyevueLiveActivity.class));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$g */
    public class ViewOnClickListenerC2795g implements View.OnClickListener {
        public ViewOnClickListenerC2795g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            HomeFragment.this.startActivity(new Intent(HomeFragment.this.requireContext(), (Class<?>) EyevueVoiceAssistantActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$h */
    public class ViewOnClickListenerC2796h implements View.OnClickListener {
        public ViewOnClickListenerC2796h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (HomeFragment.this.f18637g2 != null) {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62163d.setText(HomeFragment.this.getString(C2531R.string.eyevue_status_connecting));
                BluetoothUtil.createBond(HomeFragment.this.f18637g2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$i */
    public class C2797i implements ModBleResponse.OnBatterDataListener {
        public C2797i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBatterData$0(int i, boolean z) {
            if (((BaseBluetoothFragment) HomeFragment.this).binding != null) {
                if (i < 0) {
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62159b.setVisibility(8);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62174l2.setVisibility(8);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62176m2.setVisibility(8);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62149M1.setVisibility(8);
                } else if (ModUtils.bleCore.isConnected()) {
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62159b.setVisibility(0);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62174l2.setVisibility(0);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62176m2.setVisibility(0);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62159b.setPower(i);
                    ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62174l2.setText(i + yv7.f103133a);
                    if (z) {
                        ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62149M1.setVisibility(0);
                    } else {
                        ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62149M1.setVisibility(8);
                    }
                }
                u77.f86963g = i;
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnBatterDataListener
        public void onBatterData(final int value, final boolean isCharging) {
            C2478k.runOnUiThread(new Runnable() { // from class: el7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33338a.lambda$onBatterData$0(value, isCharging);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$j */
    public class C2798j implements dr2.InterfaceC4923l {
        public C2798j() {
        }

        @Override // p000.dr2.InterfaceC4923l
        public void onFinish() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$k */
    public class C2799k extends ViewPager2.OnPageChangeCallback {
        public C2799k() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (HomeFragment.this.f18619Q != null) {
                HomeFragment.this.f18619Q.setSelectPosition(position);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$l */
    public class DialogInterfaceOnDismissListenerC2800l implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC2800l() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            if (HomeFragment.this.f18624Z1 && ModUtils.bleCore.isConnected() && !TextUtils.isEmpty(t77.f83923b)) {
                HomeFragment.this.showGuideAct();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$m */
    public class C2801m implements u91.InterfaceC13412a {
        public C2801m() {
        }

        @Override // p000.u91.InterfaceC13412a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$n */
    public class C2802n implements ModBleResponse.OnTakePhotoStatusListener {
        public C2802n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onTakePhotoState$0(boolean z) {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakePhotoStatusListener
        public void onTakePhotoState(final boolean isTakePhoto) {
            C2478k.runOnUiThread(new Runnable() { // from class: fl7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.C2802n.lambda$onTakePhotoState$0(isTakePhoto);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$o */
    public class C2803o implements ModBleResponse.OnTakeVideoStatusListener {
        public C2803o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTakeVideoState$0(boolean z) {
            if (((BaseBluetoothFragment) HomeFragment.this).binding == null) {
                return;
            }
            u77.f86954B = z;
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62162c2.setVisibility(z ? 0 : 8);
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62179p2.setText(z ? C2531R.string.string_video_recoeding : C2531R.string.string_take_video);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakeVideoStatusListener
        public void onTakeVideoState(final boolean isTakeVideo) {
            C2478k.runOnUiThread(new Runnable() { // from class: gl7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40135a.lambda$onTakeVideoState$0(isTakeVideo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$p */
    public class C2804p implements ModBleResponse.OnTakeAudioStatusListener {
        public C2804p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTakeAudioState$0(boolean z) {
            if (((BaseBluetoothFragment) HomeFragment.this).binding == null) {
                return;
            }
            u77.f86955C = z;
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62160b2.setVisibility(z ? 0 : 8);
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62178o2.setText(z ? C2531R.string.string_audio_recoeding : C2531R.string.string_record);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakeAudioStatusListener
        public void onTakeAudioState(final boolean isTakeAudio) {
            C2478k.runOnUiThread(new Runnable() { // from class: hl7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44075a.lambda$onTakeAudioState$0(isTakeAudio);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$q */
    public class C2805q implements ModBleResponse.OnCustomerListener {
        public C2805q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCustomer$0(String str) {
            if (!str.contains(t94.f84019d) && !str.contains(t94.f84020e)) {
                HomeFragment.this.f18620V1 = false;
                return;
            }
            HomeFragment.this.f18620V1 = true;
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62152V1.showHomeImg(null);
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnCustomerListener
        public void onCustomer(final String customer, String project) {
            C2473f.m4168e(HomeFragment.f18611n2, customer + ":::::" + project);
            HomeFragment.this.f18626a2 = project + customer;
            if (!HomeFragment.this.f18624Z1) {
                HomeFragment.this.f18625a.requestData(HomeFragment.this.f18626a2);
            }
            ModUtils.sendViaBle().appGetDevicdInfo();
            if (project.startsWith("T")) {
                u77.f86970n = true;
            } else {
                u77.f86970n = false;
            }
            C2478k.runOnUiThread(new Runnable() { // from class: il7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47346a.lambda$onCustomer$0(customer);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$r */
    public class C2806r implements ModBleResponse.OnSupportFunctionListener {
        public C2806r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSupport$0(boolean z, boolean z2) {
            if (z) {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62146H.setVisibility(0);
            } else {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62146H.setVisibility(8);
            }
            if (z2) {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62147L.setVisibility(0);
            } else {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62147L.setVisibility(8);
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnSupportFunctionListener
        public void onSupport(final boolean supportLive, final boolean supportQuickVolume) {
            C2478k.runOnUiThread(new Runnable() { // from class: jl7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51115a.lambda$onSupport$0(supportLive, supportQuickVolume);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$s */
    public class C2807s implements ModBleResponse.OnDeviceInfoListener {
        public C2807s() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnDeviceInfoListener
        public void onDeviceInfo(String btVersion, String ispVersion, String deviceVersion) {
            HomeFragment.this.f18628b2 = btVersion;
            if (HomeFragment.this.f18636f2) {
                return;
            }
            HomeFragment.this.f18630c2.requestData(HomeFragment.this.f18628b2, HomeFragment.this.f18626a2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$t */
    public class ViewOnClickListenerC2808t implements View.OnClickListener {
        public ViewOnClickListenerC2808t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!BluetoothUtil.isBluetoothEnable()) {
                m3h.showToastShort(HomeFragment.this.getString(C2531R.string.eyevue_bluetooth_is_close));
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62158a2.setVisibility(8);
                HomeFragment.this.openBluetoothSettings();
                return;
            }
            DeviceInfoBean latestOne = HomeFragment.this.f18615L.getLatestOne();
            if (latestOne == null || TextUtils.isEmpty(latestOne.getMac())) {
                return;
            }
            HomeFragment.m4890P(HomeFragment.this);
            ModUtils.bleCore.connect(latestOne.getMac());
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62158a2.setVisibility(0);
            ComponentCallbacks2C2485a.with(HomeFragment.this.getContext()).asGif().load(Integer.valueOf(C2531R.drawable.gif_reconnect)).diskCacheStrategy(ne4.f64120d).into(((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62158a2);
            ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62152V1.showHomeImg(null);
            if (TextUtils.isEmpty(latestOne.getName()) || !(latestOne.getName().contains(t94.f84019d) || latestOne.getName().contains(t94.f84020e))) {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
            } else {
                ((mu6) ((BaseBluetoothFragment) HomeFragment.this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.home.HomeFragment$u */
    public class ViewOnClickListenerC2809u implements View.OnClickListener {
        public ViewOnClickListenerC2809u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HomeFragment.this.startActivity(new Intent(HomeFragment.this.getContext(), (Class<?>) EyevueDeviceListActivity.class));
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ long m4890P(HomeFragment homeFragment) {
        long j = homeFragment.f18613F;
        homeFragment.f18613F = 1 + j;
        return j;
    }

    private void addDevicePermission() {
        try {
            if (PermissionUtil.isHasScanPermission(getContext()) && PermissionUtil.isHasConnectPermission(getContext())) {
                startReceiver();
                showGuideDialog(0);
            } else if (Build.VERSION.SDK_INT >= 31 && (!PermissionUtil.isHasScanPermission(getContext()) || !PermissionUtil.isHasConnectPermission(getContext()))) {
                this.f18642l2.launch(new String[]{xnc.f98624u, xnc.f98625v});
            }
        } catch (SecurityException e) {
            Log.e("PermissionError", "权限请求失败: " + e.getMessage());
        }
    }

    private void cancelTimeoutTimer() {
        Runnable runnable = this.f18629c;
        if (runnable != null) {
            this.f18627b.removeCallbacks(runnable);
            this.f18629c = null;
        }
    }

    private void checkConnect() {
        if (u77.f86961e) {
            u77.f86961e = false;
            gkg gkgVar = new gkg();
            gkgVar.f40039a = 1;
            zgb.defaultCenter().publish(gkgVar);
            d94 d94Var = new d94();
            d94Var.f28798a = 1;
            zgb.defaultCenter().publish(d94Var);
        }
    }

    private void checkStoragePermission(VersionData versionData, boolean isClick) {
        if (lx2.checkSelfPermission(getActivity(), xnc.f98580E) != 0) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{xnc.f98580E}, 10000);
        } else {
            UpdateHelper.getInstance().checkVersion(getActivity(), versionData, this.f18634e2, isClick);
        }
    }

    private void dismissTipDialog() {
        u91 u91Var = this.f18643m;
        if (u91Var != null) {
            if (u91Var.isShowing()) {
                this.f18643m.dismiss();
            }
            this.f18643m = null;
        }
    }

    private VersionData getData(String text) {
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return (VersionData) new Gson().fromJson(text, VersionData.class);
    }

    private void initLocation() {
        if (PermissionUtil.isHasLocationPermission(getContext()) && PermissionUtil.checkGpsProviderEnable(getContext())) {
            C2473f.m4168e(f18611n2, "有权限去，去定位");
            LocationManager.getInstance().startLocation();
        }
    }

    private void initTransView() {
        if (this.f18633e) {
            return;
        }
        this.f18633e = true;
        if (((BaseBluetoothFragment) this).binding != 0) {
            this.f18616M = new GridLayoutManager(getContext(), 3);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62171i2.setPadding(0, 0, 0, 0);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62171i2.setLayoutManager(this.f18616M);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62171i2.addItemDecoration(sfe.builder().type(0).prop(c1i.dip2px(getContext(), 12.0f), c1i.dip2px(getContext(), 0.0f), true, true).buildType().type(1).prop(c1i.dip2px(getContext(), 12.0f), c1i.dip2px(getContext(), 0.0f), true, true).buildType().type(2).prop(c1i.dip2px(getContext(), 12.0f), c1i.dip2px(getContext(), 12.0f), true, true).buildType().build());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_ai_record, C2531R.string.string_ai_record));
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_trans, C2531R.string.trans_phone_tip));
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_realtime, C2531R.string.string_realtime_trans_tip));
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_video_trans, C2531R.string.trans_video_or_audio_tip));
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_glasses_phone, C2531R.string.trans_ear_glasses_tip));
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_photo_trans, C2531R.string.trans_photo_tip));
        C6045g c6045g = new C6045g(arrayList, getContext());
        this.f18618N = c6045g;
        c6045g.setOnItemClickListener(new C6045g.e() { // from class: pk7
            @Override // p000.C6045g.e
            public final void onItemClick(AITransBean aITransBean) {
                this.f71167a.lambda$initTransView$7(aITransBean);
            }
        });
        T t = ((BaseBluetoothFragment) this).binding;
        if (t != 0) {
            ((mu6) t).f62171i2.setAdapter(this.f18618N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTransView$7(AITransBean aITransBean) {
        if (c1i.isFastClick()) {
            return;
        }
        if (aITransBean.getIconResId() == C2531R.drawable.ic_main_realtime) {
            startToTransView(new Intent(getContext(), (Class<?>) RealTimeTranslationActivity.class), ek9.REAL_TIME_TRANS);
            return;
        }
        if (aITransBean.getIconResId() == C2531R.drawable.ic_main_trans) {
            AiWebSocketManager.getInstance().setCanUseAi(false);
            AiWebSocketManager.getInstance().stopAi();
            toTrans(new Intent(getContext(), (Class<?>) TransChatFreelyActivity.class), ek9.TRANSLATOR);
            return;
        }
        if (aITransBean.getIconResId() == C2531R.drawable.ic_main_glasses_phone) {
            startToTransView(new Intent(getContext(), (Class<?>) TransAiActivity.class), ek9.PHONE_HEADSET);
            return;
        }
        if (aITransBean.getIconResId() != C2531R.drawable.ic_main_ai_record) {
            if (aITransBean.getIconResId() == C2531R.drawable.ic_main_photo_trans) {
                startToTransView(new Intent(getContext(), (Class<?>) PhotoTransActivity.class), ek9.PHOTO_TRANS);
                return;
            } else {
                if (aITransBean.getIconResId() == C2531R.drawable.ic_main_video_trans) {
                    startToTransView(new Intent(getContext(), (Class<?>) TransVideoActivity.class), ek9.VIDEO_AUDIO_CALL);
                    return;
                }
                return;
            }
        }
        if (u77.f86965i) {
            C2473f.m4168e(f18611n2, "使用V1版本的语音笔记");
            startToTransView(new Intent(getContext(), (Class<?>) VoiceNoteActivityV2.class), ek9.AI_RECORD);
        } else {
            Intent intent = new Intent(getContext(), (Class<?>) VoiceNoteActivityV1.class);
            intent.putExtra(RecordActivity.f26232f2, true);
            intent.putExtra(RecordActivity.f26233g2, true);
            startToTransView(intent, ek9.VOICE_NOTE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$12() {
        ModUtils.sendViaBle().getCustomer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$13() {
        ModUtils.sendViaBle().appGetDeviceStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$14() {
        ModUtils.sendViaBle().getSupportFunction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$15() {
        ModUtils.sendViaBle().actionSync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$16() {
        ModUtils.sendViaBle().setTime(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$17() {
        Resources resources;
        if (!u77.f86979w || !isAdded() || getActivity() == null || (resources = getResources()) == null) {
            return;
        }
        String string = resources.getConfiguration().locale.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (string.contains("zh")) {
            ModUtils.sendViaBle().setOfflineLanguage(Command.Param.OFFLINE_LANGUAGE_ZH);
        } else {
            ModUtils.sendViaBle().setOfflineLanguage(Command.Param.OFFLINE_LANGUAGE_EN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$18(i91 i91Var) {
        String str = i91Var.f46089a;
        str.hashCode();
        if (str.equals(i91.f46088f)) {
            C2473f.m4168e(f18611n2, "断开连接");
            this.f18624Z1 = false;
            this.f18636f2 = false;
            this.f18637g2 = null;
            dismissBindDeviceDialog();
            u77.f86970n = false;
            u77.f86956D = false;
            AiWebSocketManager.getInstance().stopAi();
            ((mu6) ((BaseBluetoothFragment) this).binding).f62158a2.setVisibility(8);
            setInitView();
            if (this.f18613F >= 3) {
                dr2 dr2Var = this.f18635f;
                if (dr2Var == null || dr2Var.canShowFailView()) {
                    showGuideDialog(2);
                    return;
                }
                return;
            }
            dr2 dr2Var2 = this.f18635f;
            if ((dr2Var2 != null && dr2Var2.isShowing()) || (C2468a.getTopActivity() instanceof EyevueOtaActivity) || ((BaseBluetoothFragment) this).binding == 0) {
                return;
            }
            C2473f.m4168e(f18611n2, "连接失败，重新连接");
            ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.performClick();
            return;
        }
        if (str.equals(i91.f46087e)) {
            if (!TextUtils.isEmpty(i91Var.f46091c)) {
                if (i91Var.f46091c.contains(t94.f84019d) || i91Var.f46091c.contains(t94.f84020e)) {
                    this.f18620V1 = true;
                } else {
                    this.f18620V1 = false;
                }
            }
            C2473f.m4168e(f18611n2, "连接成功");
            this.f18613F = 0L;
            BluetoothDevice bluetoothDevice = i91Var.f46092d;
            this.f18637g2 = bluetoothDevice;
            saveDevice(bluetoothDevice);
            T t = ((BaseBluetoothFragment) this).binding;
            if (t != 0) {
                ((mu6) t).f62176m2.setText(getString(C2531R.string.eyevue_status_connected));
                ((mu6) ((BaseBluetoothFragment) this).binding).f62164d2.setVisibility(8);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62156Z1.setVisibility(0);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.setVisibility(8);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62158a2.setVisibility(8);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62177n2.setText(t77.f83922a);
            }
            dr2 dr2Var3 = this.f18635f;
            if ((dr2Var3 == null || !dr2Var3.isShowing()) && C2468a.getTopActivity() != null && (C2468a.getTopActivity() instanceof MainActivity)) {
                m3h.showToastShort(getString(C2531R.string.string_connect_success));
            }
            ModUtils.sendViaBle().getDevicePower();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: jk7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$new$12();
                }
            }, 200L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: kk7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$new$13();
                }
            }, 400L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: lk7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$new$14();
                }
            }, 600L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: mk7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$new$15();
                }
            }, 800L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: nk7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$new$16();
                }
            }, 2000L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: ok7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67901a.lambda$new$17();
                }
            }, 3000L);
            saveDeviceToDb(i91Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$19(d94 d94Var) {
        if (d94Var.f28798a == 2) {
            String str = t77.f83924c;
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
            if (this.f18620V1) {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                T t = ((BaseBluetoothFragment) this).binding;
                if (t != 0) {
                    ((mu6) t).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
                    return;
                }
                return;
            }
            T t2 = ((BaseBluetoothFragment) this).binding;
            if (t2 != 0) {
                ((mu6) t2).f62152V1.showHomeImg(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$20(a8c a8cVar) {
        T t = ((BaseBluetoothFragment) this).binding;
        if (t != 0) {
            ((mu6) t).f62148M.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$22(Map map) {
        if (Build.VERSION.SDK_INT >= 31) {
            Boolean bool = (Boolean) map.get(xnc.f98625v);
            Boolean bool2 = Boolean.TRUE;
            if (bool == bool2) {
                bool = (Boolean) map.get(xnc.f98624u);
            }
            if (bool != bool2) {
                dismissTipDialog();
                m3h.showToastShort(getString(C2531R.string.eyevue_user_denies_permissions));
                return;
            }
            dismissTipDialog();
            StringBuilder sb = new StringBuilder();
            sb.append("mBtPermissionLauncher ==PermissionUtil.checkGpsProviderEnable(this)======");
            sb.append(PermissionUtil.checkGpsProviderEnable(getContext()));
            startReceiver();
            showGuideDialog(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFragmentResume$1() {
        if (((BaseBluetoothFragment) this).binding != 0) {
            List<DeviceInfoBean> all = this.f18615L.getAll();
            if (TextUtils.isEmpty(t77.f83923b) && all.isEmpty()) {
                showAddDeviceView();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentResume$2() {
        ModUtils.sendViaBle().appGetDeviceStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentResume$3() {
        ModUtils.sendViaBle().getSupportFunction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentResume$4() {
        ModUtils.sendViaBle().actionSync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentResume$5() {
        ModUtils.sendViaBle().getCustomer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInitView$6() {
        if (((BaseBluetoothFragment) this).binding != 0) {
            List<DeviceInfoBean> all = this.f18615L.getAll();
            if (TextUtils.isEmpty(t77.f83923b) && all.isEmpty()) {
                C2473f.m4168e(f18611n2, TextUtils.isEmpty(t77.f83923b) + ":出时添加布局::" + all.isEmpty());
                showAddDeviceView();
            }
            initTransView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$10(View view) {
        if (((mu6) ((BaseBluetoothFragment) this).binding).f62158a2.getVisibility() == 0) {
            this.f18613F = 0L;
            ModUtils.bleCore.disconnect();
        }
        showGuideDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$11() {
        ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$8(View view) {
        if (PermissionUtil.isHasScanPermission(getContext()) && PermissionUtil.isHasConnectPermission(getContext())) {
            showGuideDialog(0);
        } else {
            showBlueToothPermissionDialog();
            addDevicePermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$9(View view) {
        startActivity(new Intent(getContext(), (Class<?>) EyevueDeviceSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBtDisConnect$23() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimeoutTimer$21() {
        ToastUtils.showShort(C2531R.string.eyevue_network_loss);
        cancelTimeoutTimer();
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    private void reSetBleListener() {
        ModUtils.modBleResponse().setOnTakePhotoStatusListener(new C2802n());
        ModUtils.modBleResponse().setOnTakeVideoStatusListener(new C2803o());
        ModUtils.modBleResponse().setOnTakeAudioStatusListener(new C2804p());
        ModUtils.modBleResponse().setOnCustomerListener(new C2805q());
        ModUtils.modBleResponse().setOnSupportFunctionListener(new C2806r());
        ModUtils.modBleResponse().setOnDeviceInfoListener(new C2807s());
    }

    private void registerVoiceNoteEventCallback() {
        pb9.get(BleConnectStatusEvent.EVENT_KEY_SHOW_DISCONNECT_BT_CONNECT_DIALOG, Boolean.class).observe(this, this);
    }

    private void resetInitCode() {
        t77.f83923b = "";
        t77.f83922a = "";
        t77.f83924c = "";
        t77.f83926e = false;
        t77.f83925d = false;
        t77.f83927f = false;
        t77.f83929h = false;
        t77.f83931j = false;
        t77.f83932k = false;
        t77.f83933l = false;
        t77.f83936o = -1;
        t77.f83938q = "";
        t77.f83937p = 0;
        t77.f83939r = "";
        u77.reset();
        dismissLoadingView();
        this.f18620V1 = false;
        ((mu6) ((BaseBluetoothFragment) this).binding).f62146H.setVisibility(8);
        ((mu6) ((BaseBluetoothFragment) this).binding).f62147L.setVisibility(8);
        DeviceInfoBean latestOne = this.f18615L.getLatestOne();
        if (latestOne != null && (!ModUtils.bleCore.isConnected() || !BluetoothUtil.isBluetoothEnable() || TextUtils.isEmpty(t77.f83923b))) {
            u77.f86958b = TextUtils.isEmpty(latestOne.getProjectFunctionType()) ? u77.f86957a : latestOne.getProjectFunctionType();
            u77.f86959c = latestOne.getProjectCompatibleSdk();
            showDisConnectBleView(latestOne.getName());
        }
        gkg gkgVar = new gkg();
        gkgVar.f40039a = 1;
        zgb.defaultCenter().publish(gkgVar);
        if (this.f18612C) {
            this.f18612C = false;
            phg phgVar = new phg();
            phgVar.f70839a = true;
            zgb.defaultCenter().publish(phgVar);
        }
        pb9.get(BleConnectStatusEvent.EVENT_KEY_DISCONNECT_BT_CONNECT).post(Boolean.TRUE);
    }

    private void saveDevice(BluetoothDevice device) {
        DeviceInfoBean deviceByMac;
        C2473f.m4168e("------------------------------", "saveDevice " + device.getName() + " is bonded");
        this.f18612C = true;
        ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setVisibility(0);
        ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
        if (this.f18620V1) {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
        } else {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
        }
        ((mu6) ((BaseBluetoothFragment) this).binding).f62170h2.setVisibility(8);
        ((mu6) ((BaseBluetoothFragment) this).binding).f62155Z.setVisibility(0);
        setConnectView();
        String deviceName = c40.getDeviceName(device);
        t77.f83923b = device.getAddress();
        t77.f83922a = deviceName;
        DeviceListDao deviceListDao = this.f18615L;
        if (deviceListDao != null && (deviceByMac = deviceListDao.getDeviceByMac(device.getAddress())) != null && Objects.equals(t77.f83923b, t77.f83922a) && !TextUtils.isEmpty(deviceByMac.getName())) {
            t77.f83922a = deviceByMac.getName();
        }
        startTimeoutTimer();
    }

    private void saveDeviceToDb(i91 bluetoothEvent) {
        String name = !TextUtils.isEmpty(bluetoothEvent.f46091c) ? bluetoothEvent.f46091c : !TextUtils.isEmpty(t77.f83922a) ? t77.f83922a : !TextUtils.isEmpty(bluetoothEvent.f46092d.getName()) ? bluetoothEvent.f46092d.getName() : bluetoothEvent.f46090b;
        String address = !TextUtils.isEmpty(bluetoothEvent.f46090b) ? bluetoothEvent.f46090b : !TextUtils.isEmpty(t77.f83923b) ? t77.f83923b : bluetoothEvent.f46092d.getAddress();
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(address) || !BluetoothUtil.isValidBluetoothAddress(address)) {
            return;
        }
        this.f18615L.insert(new DeviceInfoBean(name, address, u77.f86958b, u77.f86959c));
    }

    private void sendConnectMsg() {
        BluetoothDevice curBluetoothDevice = ModUtils.bleCore.getCurBluetoothDevice();
        StringBuilder sb = new StringBuilder();
        sb.append("sendConnectMsg: ");
        sb.append(ModUtils.bleCore.isConnected());
        sb.append(":::");
        sb.append(curBluetoothDevice != null);
        C2473f.m4168e(f18611n2, sb.toString());
        if (!ModUtils.bleCore.isConnected() || curBluetoothDevice == null) {
            return;
        }
        i91 i91Var = new i91();
        i91Var.f46089a = i91.f46087e;
        i91Var.f46090b = curBluetoothDevice.getAddress();
        i91Var.f46091c = curBluetoothDevice.getName();
        i91Var.f46092d = curBluetoothDevice;
        zgb.defaultCenter().publish(i91Var);
    }

    private void setConnectView() {
        if (((BaseBluetoothFragment) this).binding != 0) {
            dismissLoadingView();
            ((mu6) ((BaseBluetoothFragment) this).binding).f62170h2.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62155Z.setVisibility(0);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setAlpha(1.0f);
        }
        updateHomeView();
    }

    private void setInitView() {
        resetInitCode();
        C2478k.runOnUiThread(new Runnable() { // from class: qk7
            @Override // java.lang.Runnable
            public final void run() {
                this.f74753a.lambda$setInitView$6();
            }
        });
        d94 d94Var = new d94();
        d94Var.f28798a = 3;
        zgb.defaultCenter().publish(d94Var);
    }

    private void setLister() {
        setOnBluetoothSettingsListener(this);
        ModUtils.modBleResponse().setOnBatterDataListener(this.f18639i2);
        ((mu6) ((BaseBluetoothFragment) this).binding).f62144C.setOnClickListener(new View.OnClickListener() { // from class: hk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43887a.lambda$setLister$8(view);
            }
        });
        ((mu6) ((BaseBluetoothFragment) this).binding).f62175m.setOnClickListener(new View.OnClickListener() { // from class: sk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82124a.lambda$setLister$9(view);
            }
        });
        ((mu6) ((BaseBluetoothFragment) this).binding).f62167f.setOnClickListener(new View.OnClickListener() { // from class: wk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94508a.lambda$setLister$10(view);
            }
        });
        zgb.defaultCenter().subscribeStrongly(i91.class, this.f18638h2);
        if (this.f18615L.getLatestOne() != null && ((mu6) ((BaseBluetoothFragment) this).binding).f62158a2.getVisibility() != 0 && !ModUtils.bleCore.isConnected()) {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.post(new Runnable() { // from class: xk7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98292a.lambda$setLister$11();
                }
            });
        }
        ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.setOnClickListener(new ViewOnClickListenerC2808t());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62165e.setOnClickListener(new ViewOnClickListenerC2809u());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62154Y.setOnClickListener(new ViewOnClickListenerC2789a());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62153X.setOnClickListener(new ViewOnClickListenerC2790b());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62151Q.setOnClickListener(new ViewOnClickListenerC2791c());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62150N.setOnClickListener(new ViewOnClickListenerC2792d());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62147L.setOnClickListener(new ViewOnClickListenerC2793e());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62146H.setOnClickListener(new ViewOnClickListenerC2794f());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62161c.setOnClickListener(new ViewOnClickListenerC2795g());
        ((mu6) ((BaseBluetoothFragment) this).binding).f62163d.setOnClickListener(new ViewOnClickListenerC2796h());
    }

    private void showAddDeviceView() {
        if (this.f18619Q == null) {
            this.f18619Q = new rgi();
            ((mu6) ((BaseBluetoothFragment) this).binding).f62173k2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            ((mu6) ((BaseBluetoothFragment) this).binding).f62173k2.setAdapter(this.f18619Q);
        }
        if (this.f18621X == null) {
            qgi qgiVar = new qgi();
            this.f18621X = qgiVar;
            ((mu6) ((BaseBluetoothFragment) this).binding).f62183t2.setAdapter(qgiVar);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62183t2.setCurrentItem(Videoio.CAP_PROP_XI_TRG_SELECTOR, false);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62183t2.registerOnPageChangeCallback(new C2799k());
        }
        ((mu6) ((BaseBluetoothFragment) this).binding).f62170h2.setVisibility(0);
        ((mu6) ((BaseBluetoothFragment) this).binding).f62155Z.setVisibility(8);
    }

    private void showBlueToothPermissionDialog() {
        u91 u91Var = new u91(getContext(), new C2801m());
        this.f18643m = u91Var;
        u91Var.show();
    }

    private void showBtDisConnect() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || !isAdded()) {
            return;
        }
        if (this.f18644m2 == null) {
            dc2 dc2Var = new dc2(activity, new dc2.InterfaceC4732a() { // from class: yk7
                @Override // p000.dc2.InterfaceC4732a
                public final void onOk() {
                    HomeFragment.lambda$showBtDisConnect$23();
                }
            });
            this.f18644m2 = dc2Var;
            dc2Var.setLeftText(getString(C2531R.string.confirm));
            this.f18644m2.setTitle(getString(C2531R.string.device_status_tip));
            this.f18644m2.hideLeftText();
        }
        if (this.f18644m2.isShowing()) {
            return;
        }
        this.f18644m2.show();
    }

    private void showDisConnectBleView(String name) {
        T t = ((BaseBluetoothFragment) this).binding;
        if (t != 0) {
            ((mu6) t).f62177n2.setText(name);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62176m2.setText(getString(C2531R.string.eyevue_status_disconnect));
            ((mu6) ((BaseBluetoothFragment) this).binding).f62164d2.setVisibility(0);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62156Z1.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62159b.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62149M1.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62174l2.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62148M.setVisibility(0);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62158a2.setVisibility(8);
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
            if (name.contains(t94.f84019d) || name.contains(t94.f84020e)) {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
            } else {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
            }
        }
    }

    private void showGuideDialog(int type) {
        if (this.f18635f == null) {
            dr2 dr2Var = new dr2(getContext(), type, new C2798j());
            this.f18635f = dr2Var;
            dr2Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC2800l());
        }
        dr2 dr2Var2 = this.f18635f;
        if (dr2Var2 != null) {
            dr2Var2.setCurType(type);
            this.f18635f.show();
        }
    }

    private void startTimeoutTimer() {
        Runnable runnable = new Runnable() { // from class: ik7
            @Override // java.lang.Runnable
            public final void run() {
                this.f47236a.lambda$startTimeoutTimer$21();
            }
        };
        this.f18629c = runnable;
        this.f18627b.postDelayed(runnable, 5000L);
    }

    private void unRegisterVoiceNoteEventCallback() {
        pb9.get(BleConnectStatusEvent.EVENT_KEY_SHOW_DISCONNECT_BT_CONNECT_DIALOG, Boolean.class).removeObserver(this);
    }

    private void updateHomeView() {
        if (((BaseBluetoothFragment) this).binding == 0 || TextUtils.isEmpty(t77.f83939r)) {
            return;
        }
        boolean z = t77.f83927f;
        boolean z2 = t77.f83931j;
        boolean z3 = u77.f86965i;
        boolean z4 = t77.f83932k;
        boolean z5 = t77.f83933l;
        boolean z6 = t77.f83929h;
        ArrayList arrayList = new ArrayList();
        if (z2 || z3) {
            arrayList.add(new AITransBean(C2531R.drawable.ic_main_ai_record, C2531R.string.string_ai_record));
        }
        arrayList.add(new AITransBean(C2531R.drawable.ic_main_trans, C2531R.string.trans_phone_tip));
        if (z6) {
            arrayList.add(new AITransBean(C2531R.drawable.ic_main_realtime, C2531R.string.string_realtime_trans_tip));
        }
        if (z5) {
            arrayList.add(new AITransBean(C2531R.drawable.ic_main_video_trans, C2531R.string.trans_video_or_audio_tip));
        }
        if (z) {
            arrayList.add(new AITransBean(C2531R.drawable.ic_main_glasses_phone, C2531R.string.trans_ear_glasses_tip));
        }
        if (z4) {
            arrayList.add(new AITransBean(C2531R.drawable.ic_main_photo_trans, C2531R.string.trans_photo_tip));
        }
        C6045g c6045g = this.f18618N;
        if (c6045g != null) {
            c6045g.updateData(arrayList);
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        this.f18615L = DeviceListDatabase.getDatabase(getContext()).getDeviceListDao();
        this.f18625a = new pfd(this);
        this.f18630c2 = new e8c(this);
        this.f18622Y = new v84(this);
        this.f18632d2 = new swh(this);
        this.f18622Y.refreshData();
        zgb.defaultCenter().subscriber(d94.class, this.f18640j2);
        zgb.defaultCenter().subscribeStrongly(a8c.class, this.f18641k2);
        C4032a.setStatusBarDark(getActivity(), false, false, false, getContext().getColor(C2531R.color.tab_bg));
        yp0.setStatusBarLightMode((Activity) getActivity(), false);
        startReceiver();
        initLocation();
        setInitView();
        setLister();
        sendConnectMsg();
        registerVoiceNoteEventCallback();
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // p000.t84.InterfaceC12946b
    public void loadDeviceListSuccess(List<SupportDeviceBean> deviceList, boolean isCache) {
        if (deviceList.isEmpty()) {
            return;
        }
        C2473f.m4168e(f18611n2, "支持的列表::" + rc7.toJson(deviceList));
        vfe.getInstance().putString(dr2.f30427o2, rc7.toJson(deviceList));
    }

    @Override // p000.qwh.InterfaceC11753b
    public void loadVersionSuccess(VersionData versionData, boolean isCache) {
        String str = "v" + c1i.getVersion(getActivity());
        if (!versionData.isNeedUpdate() || versionData.getVersion().equals(str)) {
            vfe.getInstance().putString("SP_UPDATE_DATA", "");
            UpdateHelper.getInstance().deleteApkIfExists(getActivity());
        } else {
            vfe.getInstance().putBoolean("SP_UPDATE_GET", true);
            vfe.getInstance().putString("SP_UPDATE_DATA", VersionData.toJson(versionData));
            checkStoragePermission(versionData, false);
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onBondFail() {
        C2473f.m4168e(f18611n2, "获取经典设备失败");
        AiWebSocketManager.getInstance().stopAi();
        this.isConnectBt = false;
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onBondSuccess(BluetoothDevice device) {
        C2473f.m4168e(f18611n2, "获取经典设备成功:" + device.getAddress());
        this.isConnectBt = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@hib Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@efb LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C4032a.setStatusBarDark(getActivity(), false, false, false, getContext().getColor(C2531R.color.tab_bg));
        yp0.setStatusBarLightMode((Activity) getActivity(), false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(d94.class, this.f18640j2);
        zgb.defaultCenter().unsubscribe(i91.class, this.f18638h2);
        zgb.defaultCenter().unsubscribe(a8c.class, this.f18641k2);
        unRegisterVoiceNoteEventCallback();
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentFirstVisible() {
        super.onFragmentFirstVisible();
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentPause() {
        super.onFragmentPause();
        this.f18631d = true;
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
        this.f18631d = false;
        C4032a.setStatusBarDark(getActivity(), false, false, false, getContext().getColor(C2531R.color.tab_bg));
        yp0.setStatusBarLightMode((Activity) getActivity(), false);
        C7330im c7330im = new C7330im();
        c7330im.f47358a = false;
        zgb.defaultCenter().publish(c7330im);
        C2478k.runOnUiThread(new Runnable() { // from class: zk7
            @Override // java.lang.Runnable
            public final void run() {
                this.f105344a.lambda$onFragmentResume$1();
            }
        });
        if (C2474g.areNotificationsEnabled() && PermissionUtil.isHasLocationPermission(getContext()) && PermissionUtil.checkGpsProviderEnable(getContext()) && (!x4f.isServiceRunning((Class<?>) DaemonService.class) || !x4f.isServiceRunning((Class<?>) EyevueAiService.class))) {
            u56.getInstance(getContext()).create(getActivity());
        }
        reSetBleListener();
        if (!TextUtils.isEmpty(t77.f83923b) && ModUtils.bleCore.isConnected()) {
            ModUtils.sendViaBle().getDevicePower();
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: al7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$onFragmentResume$2();
                }
            }, 200L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: bl7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$onFragmentResume$3();
                }
            }, 400L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: cl7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$onFragmentResume$4();
                }
            }, 600L);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: dl7
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.lambda$onFragmentResume$5();
                }
            }, 800L);
        }
        initLocation();
        checkConnect();
    }

    @Override // p000.x7c.InterfaceC14970b
    public void onGetDataFail(int code, String msg) {
    }

    @Override // p000.nfd.InterfaceC9862b
    public void onGetDataSuccess(ProjectInfoBean projectInfo, boolean isCache, boolean isRefresh) {
        cancelTimeoutTimer();
        this.f18623Z = 0;
        if (isAdded()) {
            if (projectInfo == null) {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
                if (this.f18620V1) {
                    ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
                } else {
                    ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
                }
                setConnectView();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setDataSuccess projectInfo================= ");
            sb.append(projectInfo);
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
            t77.f83944w = rc7.toJson(projectInfo.getAiModels());
            t77.f83946y = projectInfo.getSpeechProvider();
            t77.f83947z = projectInfo.getTranslationProvider();
            t77.f83921A = projectInfo.getTtsProvider();
            u77.f86982z = projectInfo.getOfflineCommands();
            u77.f86953A = projectInfo.getAiModelAwakening();
            u77.f86962f = projectInfo.isSupportTextTranslation();
            u77.f86958b = TextUtils.isEmpty(projectInfo.getProjectFunctionType()) ? u77.f86957a : projectInfo.getProjectFunctionType();
            u77.f86959c = projectInfo.getProjectCompatibleSdk();
            u77.f86960d = projectInfo.getAiModelAwakening();
            u77.f86965i = projectInfo.isSupportVoiceNotesV1();
            u77.f86967k = Integer.parseInt(projectInfo.getAiModelRoleId());
            u77.f86968l = projectInfo.getAiModelRoleName();
            String imageUrl = projectInfo.getImageUrl();
            if (this.f18620V1) {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
            } else if (TextUtils.isEmpty(imageUrl)) {
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ivDeviceImg---------------------------- ");
                sb2.append(imageUrl);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("setDataSuccess projectInfo==========imgUrl======= ");
                sb3.append(imageUrl);
                ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(imageUrl);
                t77.f83924c = imageUrl;
            }
            u77.f86961e = true;
            if (!this.f18631d) {
                checkConnect();
            }
            setConnectView();
            this.f18624Z1 = checkAuth();
            if (TextUtils.isEmpty(t77.f83922a) || TextUtils.isEmpty(t77.f83923b) || !BluetoothUtil.isValidBluetoothAddress(t77.f83923b)) {
                return;
            }
            this.f18615L.insert(new DeviceInfoBean(t77.f83922a, t77.f83923b, projectInfo.getProjectFunctionType(), projectInfo.getProjectCompatibleSdk()));
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onGetFirstDeviceSuccess(BluetoothDevice bluetoothDevice) {
        C2473f.m4168e(f18611n2, "获取到已连接设备:::" + bluetoothDevice.getAddress());
        this.isConnectBt = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        VersionData data;
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 10000 && grantResults.length > 0 && grantResults[0] == 0) {
            String string = vfe.getInstance().getString("SP_UPDATE_DATA");
            if (TextUtils.isEmpty(string) || (data = getData(string)) == null) {
                return;
            }
            String str = "v" + c1i.getVersion(getActivity());
            if (!data.isNeedUpdate() || data.getVersion().equals(str)) {
                return;
            }
            UpdateHelper.getInstance().checkVersion(getActivity(), data, this.f18634e2, false);
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            setInitView();
        } else if (PermissionUtil.isHasScanPermission(getActivity()) && PermissionUtil.isHasConnectPermission(getActivity())) {
            searBoundDevice();
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public mu6 provideViewBinding(ViewGroup container) {
        return mu6.inflate(getLayoutInflater(), container, false);
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void searBoundDeviceSuccess(BluetoothDevice device) {
        C2473f.m4168e(f18611n2, "searBoundDeviceSuccess 获取经典设备成功:" + device.getAddress());
        this.isConnectBt = true;
    }

    @Override // p000.qxb
    public void onChanged(Boolean isNeedShowBtDisDialog) {
        if (isNeedShowBtDisDialog.booleanValue()) {
            showBtDisConnect();
        }
    }

    @Override // p000.nfd.InterfaceC9862b
    public void onGetDataFail() {
        cancelTimeoutTimer();
        ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.showHomeImg(null);
        if (this.f18620V1) {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
        } else {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62152V1.setImageResource(C2531R.drawable.ic_default_icon);
        }
        setConnectView();
        if (this.f18623Z >= 3 || TextUtils.isEmpty(this.f18626a2)) {
            return;
        }
        this.f18623Z++;
        this.f18625a.requestData(this.f18626a2);
    }

    @Override // p000.x7c.InterfaceC14970b
    public void onGetDataSuccess(OtaBean otaBean, boolean isCache, boolean isRefresh) {
        this.f18636f2 = true;
        if (otaBean.getBle() == null && otaBean.getWifi() == null) {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62175m.setBackgroundResource(C2531R.drawable.ic_device_setting);
            return;
        }
        OtaBean.WifiDTO wifi = otaBean.getWifi();
        if (wifi != null && wifi.getOtaPackage() != null) {
            ((mu6) ((BaseBluetoothFragment) this).binding).f62175m.setBackgroundResource(C2531R.drawable.ic_device_setting_update);
        }
        OtaBean.BleDTO ble = otaBean.getBle();
        if (ble == null || ble.getOtaPackage() == null) {
            return;
        }
        ((mu6) ((BaseBluetoothFragment) this).binding).f62175m.setBackgroundResource(C2531R.drawable.ic_device_setting_update);
    }
}
