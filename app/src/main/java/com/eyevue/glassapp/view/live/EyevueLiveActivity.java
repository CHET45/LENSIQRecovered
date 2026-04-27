package com.eyevue.glassapp.view.live;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.helper.WifiP2pConnector;
import com.watchfun.base.BaseActivity;
import com.watchfun.base.BaseApplication;
import com.watchfun.theme.C4032a;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import p000.C7821ja;
import p000.hac;
import p000.u77;
import p000.xb9;
import p000.yp0;
import p000.yrf;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueLiveActivity extends BaseActivity<C7821ja> implements hac.InterfaceC6775j {

    /* JADX INFO: renamed from: a */
    public final String f18667a = "EyevueLiveActivity";

    /* JADX INFO: renamed from: b */
    public WifiP2pConnector f18668b;

    /* JADX INFO: renamed from: c */
    public LibVLC f18669c;

    /* JADX INFO: renamed from: d */
    public MediaPlayer f18670d;

    /* JADX INFO: renamed from: e */
    public float f18671e;

    /* JADX INFO: renamed from: f */
    public xb9 f18672f;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.live.EyevueLiveActivity$a */
    public class RunnableC2810a implements Runnable {
        public RunnableC2810a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EyevueLiveActivity.this.f18671e = ((C7821ja) ((BaseActivity) EyevueLiveActivity.this).binding).f50059f.getWidth() / ((C7821ja) ((BaseActivity) EyevueLiveActivity.this).binding).f50059f.getHeight();
            EyevueLiveActivity.this.applyVideoTransform(270.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.live.EyevueLiveActivity$b */
    public class ViewOnClickListenerC2811b implements View.OnClickListener {
        public ViewOnClickListenerC2811b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C7821ja) ((BaseActivity) EyevueLiveActivity.this).binding).f50052C.setVisibility(0);
            ModUtils.sendViaBle().startLive(Command.Param.LIVE_TYPE_P2P);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.live.EyevueLiveActivity$c */
    public class ViewOnClickListenerC2812c implements View.OnClickListener {
        public ViewOnClickListenerC2812c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueLiveActivity.this.rotation();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.live.EyevueLiveActivity$d */
    public class C2813d implements WifiP2pConnector.WifiDirectCallback {
        public C2813d() {
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onDirectWifiConnected() {
            C2473f.m4168e("EyevueLiveActivity", "WiFi连接成功");
            if (EyevueLiveActivity.this.f18672f != null) {
                EyevueLiveActivity.this.f18672f.requestData();
            }
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onError(String message) {
            if (message.equals(WifiP2pConnector.HOTSPOT_OPEN)) {
                ToastUtils.showShort(BaseApplication.getInstance().getString(C2531R.string.string_eyevue_import_media_hotspot_tip));
            }
            ((C7821ja) ((BaseActivity) EyevueLiveActivity.this).binding).f50055b.setVisibility(0);
            ((C7821ja) ((BaseActivity) EyevueLiveActivity.this).binding).f50053F.setVisibility(0);
            EyevueLiveActivity.this.disConnectWifi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyVideoTransform(float targetRotation, boolean animate) {
        float fillScaleForRotation = getFillScaleForRotation(targetRotation);
        ((C7821ja) this.binding).f50058e.animate().cancel();
        if (animate) {
            ((C7821ja) this.binding).f50058e.animate().rotation(targetRotation).scaleX(fillScaleForRotation).scaleY(fillScaleForRotation).setDuration(400L).start();
            return;
        }
        ((C7821ja) this.binding).f50058e.setRotation(targetRotation);
        ((C7821ja) this.binding).f50058e.setScaleX(fillScaleForRotation);
        ((C7821ja) this.binding).f50058e.setScaleY(fillScaleForRotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disConnectWifi() {
        WifiP2pConnector wifiP2pConnector = this.f18668b;
        if (wifiP2pConnector != null) {
            wifiP2pConnector.disconnectP2p();
        }
        ModUtils.sendViaBle().fileDownloadFinish(Command.Param.WIFI_FILE_DOWNLOAD_FINISH, Command.Param.WIFI_FILE_DOWNLOAD_NOT_CLEAR);
    }

    private float getFillScaleForRotation(float rotation) {
        if ((((Math.round(rotation) % 360) + 360) % 360) % 180 == 0) {
            return 1.0f;
        }
        float width = ((C7821ja) this.binding).f50058e.getWidth();
        float height = ((C7821ja) this.binding).f50058e.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return 1.0f;
        }
        return Math.max(width / height, height / width);
    }

    private void playLive() {
        this.f18669c = new LibVLC(this);
        MediaPlayer mediaPlayer = new MediaPlayer(this.f18669c);
        this.f18670d = mediaPlayer;
        mediaPlayer.attachViews(((C7821ja) this.binding).f50059f, null, false, true);
        Media media = new Media(this.f18669c, Uri.parse("rtsp://192.168.49.207/xxx.mov"));
        media.setHWDecoderEnabled(true, false);
        media.addOption(":network-caching=1000");
        media.addOption(":rtsp-tcp");
        media.addOption(":file-caching=1000");
        media.addOption(":live-caching=100");
        media.addOption(":drop-late-frames=true");
        media.addOption(":skip-frames=true");
        this.f18670d.setScale(this.f18671e);
        this.f18670d.setMedia(media);
        this.f18670d.play();
        media.release();
        ((C7821ja) this.binding).f50052C.setVisibility(8);
        ((C7821ja) this.binding).f50053F.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotation() {
        applyVideoTransform(((C7821ja) this.binding).f50058e.getRotation() + 90.0f, true);
    }

    public void connectWifi(String ssid, String password) {
        this.f18668b.connectToDirectWifi(ssid, password, new C2813d());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C7821ja) this.binding).f50060m.setTitle(getString(C2531R.string.string_live_preview));
        this.f18672f = new xb9(this);
        this.f18668b = new WifiP2pConnector(this);
        ModUtils.sendViaBle().startLive(Command.Param.LIVE_TYPE_P2P);
        this.f18668b.init();
        u77.f86964h = true;
        int iDp2px = getResources().getDisplayMetrics().widthPixels - yrf.dp2px(36.0f);
        ViewGroup.LayoutParams layoutParams = ((C7821ja) this.binding).f50058e.getLayoutParams();
        layoutParams.height = (int) ((iDp2px * 3) / 4.0f);
        ((C7821ja) this.binding).f50058e.setLayoutParams(layoutParams);
        ((C7821ja) this.binding).f50058e.post(new RunnableC2810a());
        ModUtils.modBleResponse().setOnWifiDataListener(new ModBleResponse.OnWifiDataListener() { // from class: in5
            @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnWifiDataListener
            public final void onWifiData(String str, String str2) {
                this.f47596a.connectWifi(str, str2);
            }
        });
        ((C7821ja) this.binding).f50055b.setOnClickListener(new ViewOnClickListenerC2811b());
        ((C7821ja) this.binding).f50056c.setOnClickListener(new ViewOnClickListenerC2812c());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C7821ja getViewBinding() {
        return C7821ja.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        disConnectWifi();
        MediaPlayer mediaPlayer = this.f18670d;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f18670d.release();
        }
        u77.f86964h = false;
    }

    @Override // p000.hac.InterfaceC6775j
    public void onLiveFail(String msg) {
        ((C7821ja) this.binding).f50055b.setVisibility(0);
        ((C7821ja) this.binding).f50053F.setVisibility(0);
        disConnectWifi();
        C2473f.m4168e("EyevueLiveActivity", "请求直播失败:" + msg);
    }

    @Override // p000.hac.InterfaceC6775j
    public void onLiveSuccess() {
        C2473f.m4168e("EyevueLiveActivity", "请求直播成功");
        playLive();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            disConnectWifi();
            u77.f86964h = false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }
}
