package com.eyevue.glassapp.base;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1143j;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.helper.MusicPlayerManager;
import com.eyevue.glassapp.view.translate.simultaneous.C2957a;
import com.watchfun.base.BaseApplication;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.manager.WakeLockManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.HeaderUtils;
import com.watchfun.translatewebsocket.AsrNewActionMode;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy;
import java.io.File;
import java.util.ArrayList;
import p000.InterfaceC12632sk;
import p000.amc;
import p000.efb;
import p000.hu8;
import p000.i00;
import p000.j8i;
import p000.lx2;
import p000.m3h;
import p000.mf4;
import p000.p87;
import p000.qr0;
import p000.rc7;
import p000.t77;
import p000.uae;
import p000.ufh;
import p000.vfe;
import p000.wu0;
import p000.xnc;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAsrTransActivity<T extends j8i, DB extends uae> extends AppCompatActivity implements wu0, InterfaceC12632sk.b {

    /* JADX INFO: renamed from: C */
    public PermissionExplanationDialog f18210C;

    /* JADX INFO: renamed from: F */
    public WakeLockManager f18211F;

    /* JADX INFO: renamed from: H */
    public p87 f18212H;

    /* JADX INFO: renamed from: M1 */
    public int f18215M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f18218V1;

    /* JADX INFO: renamed from: X */
    public int f18219X;

    /* JADX INFO: renamed from: Y */
    public long f18220Y;

    /* JADX INFO: renamed from: Z */
    public WebSocketManagerStrategy f18221Z;

    /* JADX INFO: renamed from: a2 */
    public TransLanguageData f18224a2;

    /* JADX INFO: renamed from: b */
    public T f18225b;

    /* JADX INFO: renamed from: b2 */
    public TransLanguageData f18226b2;

    /* JADX INFO: renamed from: c */
    public DB f18227c;

    /* JADX INFO: renamed from: c2 */
    public InterfaceC2562d f18228c2;

    /* JADX INFO: renamed from: d */
    public String f18229d;

    /* JADX INFO: renamed from: e */
    public String f18231e;

    /* JADX INFO: renamed from: f */
    public qr0 f18232f;

    /* JADX INFO: renamed from: a */
    public final String f18223a = "BaseAsrTransActivity";

    /* JADX INFO: renamed from: m */
    public String[] f18233m = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: L */
    public boolean f18213L = false;

    /* JADX INFO: renamed from: M */
    public int f18214M = -1;

    /* JADX INFO: renamed from: N */
    public int f18216N = 1;

    /* JADX INFO: renamed from: Q */
    public int f18217Q = 2;

    /* JADX INFO: renamed from: Z1 */
    public final BaseNewWebSocketManager.AsrDataListener f18222Z1 = new C2559a();

    /* JADX INFO: renamed from: d2 */
    public final BroadcastReceiver f18230d2 = new C2561c();

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseAsrTransActivity$a */
    public class C2559a extends BaseNewWebSocketManager.AsrDataListener {
        public C2559a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageContinuous$1(String str, String str2, String str3, String str4, boolean z) {
            BaseAsrTransActivity.this.onAsrResultContinuous(str, str2, str3, str4, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageOnce$0(String str, String str2, String str3, String str4, String str5, boolean z) {
            BaseAsrTransActivity.this.onAsrResultOnce(str, str2, str3, str4, str5, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReconnectFail$2() {
            ToastUtils.showShort(BaseAsrTransActivity.this.getResources().getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onClose(int code) {
            BaseAsrTransActivity.this.onCloseWeb(code);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onError(Exception e) {
            super.onError(e);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageContinuous(final String result, final String transContent, final String mp3Filepath, final String startTimeId, final boolean isFinal) {
            if (TextUtils.isEmpty(result)) {
                return;
            }
            BaseAsrTransActivity baseAsrTransActivity = BaseAsrTransActivity.this;
            if (baseAsrTransActivity.f18213L) {
                return;
            }
            baseAsrTransActivity.runOnUiThread(new Runnable() { // from class: kq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54939a.lambda$onMessageContinuous$1(result, transContent, mp3Filepath, startTimeId, isFinal);
                }
            });
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageOnce(final String sourLanguage, final String result, final String transText, final String mp3Filepath, final String startTimeId, final boolean isFinal) {
            if (TextUtils.isEmpty(result) || BaseAsrTransActivity.this.f18213L) {
                return;
            }
            C2473f.m4167d("aaaaaaaa", "mp3Filepath--------------------------" + mp3Filepath);
            BaseAsrTransActivity.this.runOnUiThread(new Runnable() { // from class: iq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47900a.lambda$onMessageOnce$0(sourLanguage, result, transText, mp3Filepath, startTimeId, isFinal);
                }
            });
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onOpen() {
            C2473f.m4167d("aaaaaaaaaaaaaaaaaaaaaaaaa", "onOpen() =============");
            BaseAsrTransActivity.this.onWebSocketOpen();
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onReconnectFail() {
            super.onReconnectFail();
            BaseAsrTransActivity.this.runOnUiThread(new Runnable() { // from class: jq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51440a.lambda$onReconnectFail$2();
                }
            });
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onStopRecord() {
            BaseAsrTransActivity.this.onStopAsrView();
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTts(File file) {
            BaseAsrTransActivity.this.onTtsFile(file);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsMp3(byte[] pcmBytes) {
            BaseAsrTransActivity.this.onTtsMp3Byte(pcmBytes);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsPcm(byte[] pcmBytes, int outputSampleRate) {
            BaseAsrTransActivity.this.onTtsPcmByte(pcmBytes);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onVadTimeOut() {
            BaseAsrTransActivity.this.onVadTimeOutTip();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseAsrTransActivity$b */
    public class C2560b implements PermissionExplanationDialog.OnClickListListener {
        public C2560b() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            BaseAsrTransActivity.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(BaseAsrTransActivity.this, C2531R.string.permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseAsrTransActivity$c */
    public class C2561c extends BroadcastReceiver {
        public C2561c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InterfaceC2562d interfaceC2562d;
            String action = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("配对成功: action名称 = ");
            sb.append(action);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10 && (interfaceC2562d = BaseAsrTransActivity.this.f18228c2) != null) {
                    interfaceC2562d.onGetDeviceFail();
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra == 0) {
                    InterfaceC2562d interfaceC2562d2 = BaseAsrTransActivity.this.f18228c2;
                    if (interfaceC2562d2 != null) {
                        interfaceC2562d2.onGetDeviceFail();
                        return;
                    }
                    return;
                }
                if (intExtra != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("A2DP 设备连接状态变化: ");
                    sb2.append(intExtra);
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(action)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 11);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("A2DP playingState =");
                sb3.append(intExtra2);
                if (intExtra2 == 10) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("A2DP 音频正在播放 =");
                    sb4.append(bluetoothDevice.getName());
                } else if (intExtra2 != 11) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("A2DP 播放状态变化: ");
                    sb5.append(intExtra2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseAsrTransActivity$d */
    public interface InterfaceC2562d {
        void onGetDeviceFail();

        void onGetDeviceSuccess(BluetoothDevice device);

        void searBoundDeviceSuccess(BluetoothDevice device);

        void searBoundDeviceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f18233m) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f18233m, 200);
                return;
            }
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f18210C;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f18210C.dismiss();
            }
            this.f18210C = null;
        }
    }

    private String[] findUnaskedPermissions(String[] wanted) {
        ArrayList arrayList = new ArrayList();
        for (String str : wanted) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private void initAsrActionMode() {
        if (this.f18229d.equals(vfe.C14037b.f90919P)) {
            if (vfe.getInstance().getInt("SP_KEY_PROJECT_TYPE", -1) == 2) {
                this.f18219X = AsrNewActionMode.PHONE_GLASSES_TYPE.getCode();
                return;
            } else {
                this.f18219X = AsrNewActionMode.PHONE_HEADSET_TYPE.getCode();
                return;
            }
        }
        if (this.f18229d.equals(vfe.C14037b.f90927T)) {
            this.f18219X = AsrNewActionMode.TRANSLATOR_TYPE.getCode();
            return;
        }
        if (this.f18229d.equals("woke_language_from_two_ear_news")) {
            this.f18219X = AsrNewActionMode.DUAL_EAR_TYPE.getCode();
        } else if (this.f18229d.equals(vfe.C14037b.f90935X)) {
            this.f18219X = AsrNewActionMode.DUAL_FREEDOM_TALK_TYPE.getCode();
        } else {
            this.f18219X = AsrNewActionMode.TRANSLATOR_TYPE.getCode();
        }
    }

    private void initLanguage(String spKeyFrom, String spKeyTo) {
        TransLanguageData transLanguageData = rc7.getTransLanguageData(vfe.getInstance().getString(spKeyFrom));
        this.f18224a2 = transLanguageData;
        if (transLanguageData != null) {
            initFromLanguageView(transLanguageData);
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f18224a2 = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f18224a2.setDefaultName("中文");
            this.f18224a2.setSelect(true);
            this.f18224a2.setVoiceName("xiaoyan");
            this.f18224a2.setIatLanguage("zh-CN");
            this.f18224a2.setLangKey("cn");
            this.f18224a2.setKeyName("zh_name");
            this.f18224a2.setUseMicTTS(true);
            vfe.getInstance().putString(spKeyFrom, TransLanguageData.toJson(this.f18224a2));
            initFromLanguageView(this.f18224a2);
        }
        TransLanguageData transLanguageData3 = rc7.getTransLanguageData(vfe.getInstance().getString(spKeyTo));
        this.f18226b2 = transLanguageData3;
        if (transLanguageData3 != null) {
            initToLanguageView(transLanguageData3);
        } else {
            TransLanguageData transLanguageData4 = new TransLanguageData();
            this.f18226b2 = transLanguageData4;
            transLanguageData4.setTransId(2);
            this.f18226b2.setDefaultName("English");
            this.f18226b2.setSelect(true);
            this.f18226b2.setVoiceName("catherine");
            this.f18226b2.setIatLanguage("en-US");
            this.f18226b2.setLangKey(ufh.f87916c);
            this.f18226b2.setKeyName("en_name");
            this.f18226b2.setUseMicTTS(true);
            vfe.getInstance().putString(spKeyTo, TransLanguageData.toJson(this.f18226b2));
            initToLanguageView(this.f18226b2);
        }
        setTransLanguageData(this.f18224a2, this.f18226b2);
    }

    private void initWssAsr() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.setAsrDataListener(this.f18222Z1);
        }
    }

    private void release() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.unRegisterAsrDataListener();
            this.f18221Z.release();
        }
        C2957a.getInstance().stopAudio();
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f18210C == null) {
            this.f18210C = new PermissionExplanationDialog(this, new C2560b());
        }
        if (this.f18210C.isShowing()) {
            return;
        }
        this.f18210C.show();
    }

    @Override // p000.wu0
    public void addNetDisposable(mf4 disposable) {
        this.f18232f.addNetDisposable(disposable);
    }

    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f18233m).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    public void clearAudio() {
        amc.getInstance().clearMp3AudioQueue();
        amc.getInstance().pauseMp3Playback();
        amc.getInstance().clearAudioQueue();
        amc.getInstance().pausePlayback();
    }

    public void exchangeLanguage() {
        this.f18224a2 = rc7.getTransLanguageData(vfe.getInstance().getString(this.f18229d));
        this.f18226b2 = rc7.getTransLanguageData(vfe.getInstance().getString(this.f18231e));
        vfe.getInstance().putString(this.f18231e, TransLanguageData.toJson(this.f18224a2));
        vfe.getInstance().putString(this.f18229d, TransLanguageData.toJson(this.f18226b2));
        this.f18224a2 = rc7.getTransLanguageData(vfe.getInstance().getString(this.f18229d));
        this.f18226b2 = rc7.getTransLanguageData(vfe.getInstance().getString(this.f18231e));
    }

    public abstract DB getDatabase();

    @Override // p000.wu0
    public String getPageName() {
        return getClass().getName();
    }

    public abstract String getSpKeyFrom();

    public abstract String getSpKeyTo();

    public abstract T getViewBinding();

    @Override // p000.wu0
    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    public void init() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.sendInitCommand(this.f18224a2.getIatLanguage(), this.f18226b2.getIatLanguage(), "1.0", "", t77.f83946y, t77.f83947z, t77.f83921A, this.f18215M1);
        }
    }

    public void initData() {
    }

    public void initFromLanguageView(TransLanguageData fromLanguageData) {
    }

    public void initPcmAudio() {
        amc amcVar = amc.getInstance();
        if (!amcVar.isInitialized()) {
            amcVar.initialize(this);
        }
        amcVar.startMp3Playback();
        amcVar.startPlayback();
    }

    public void initToLanguageView(TransLanguageData toLanguageData) {
    }

    public void initView(Bundle savedInstanceState) {
    }

    public boolean isAsring() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            return webSocketManagerStrategy.isAsring();
        }
        return false;
    }

    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
    }

    public void onAsrResultOnce(String sourLangeuage, String result, String transText, String mp3Filepath, String startTimeId, boolean isFinal) {
    }

    public void onCloseWeb(int close) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        yp0.setStatusBarLightMode((Activity) this, false);
        supportRequestWindowFeature(1);
        hu8.setLanguage(this);
        super.onCreate(bundle);
        T t = (T) getViewBinding();
        this.f18225b = t;
        if (t != null) {
            setContentView(t.getRoot());
        }
        this.f18227c = (DB) getDatabase();
        this.f18229d = getSpKeyFrom();
        this.f18231e = getSpKeyTo();
        initAsrActionMode();
        this.f18232f = new qr0();
        getLifecycle().addObserver(this.f18232f);
        initView(bundle);
        initView();
        initData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        release();
        clearAudio();
        amc.getInstance().stopPlayback();
        amc.getInstance().stopMp3Playback();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f18211F.releaseWakeLock();
        if (isFinishing()) {
            release();
        }
    }

    public void onPermissionSuccess() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 200) {
            for (int i : grantResults) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("allGranted =");
                    sb.append(requestCode);
                    m3h.showToastShort(getString(C2531R.string.eyevue_permission_system_set));
                    return;
                }
            }
            vfe.getInstance().putBoolean("SP_KEY_PERMISSIONSGRANTED", true);
            onPermissionSuccess();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (MusicPlayerManager.getInstance(this).isPlaying()) {
            MusicPlayerManager.getInstance(this).pauseMusic(this);
        }
        this.f18212H = new p87(this);
        initWssAsr();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f18211F.acquireWakeLock();
        this.f18213L = false;
        initLanguage(this.f18229d, this.f18231e);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f18213L = true;
    }

    public void onStopAsrView() {
        C2473f.m4167d("aaaaaaaa", "onStopAsrView--111-");
    }

    public void onTtsFile(File file) {
    }

    public void onTtsMp3Byte(byte[] bytes) {
    }

    public void onTtsPcmByte(byte[] bytes) {
    }

    public void onVadTimeOutTip() {
    }

    public void onWebSocketOpen() {
        init();
    }

    public void setCurrentStrategy(WebSocketManagerStrategy strategy) {
        this.f18221Z = strategy;
        initWssAsr();
    }

    public void setOnBluetoothSettingsListener(InterfaceC2562d listener) {
        this.f18228c2 = listener;
    }

    public void setTransLanguageData(TransLanguageData fromLanguageData, TransLanguageData toLanguageData) {
        init();
    }

    public void setTransMode(int mode) {
        this.f18215M1 = mode;
    }

    public void startAsr(long vadTime) {
        C2957a.getInstance().stopAudio();
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            if (this.f18214M == this.f18216N) {
                webSocketManagerStrategy.startAsr(this.f18224a2.getIatLanguage(), this.f18226b2.getIatLanguage(), vadTime);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("toLanguageData.getIatLanguage()=");
            sb.append(this.f18226b2.getIatLanguage());
            sb.append("fromLanguageData.getIatLanguage() =");
            sb.append(this.f18224a2.getIatLanguage());
            this.f18221Z.startAsr(this.f18226b2.getIatLanguage(), this.f18224a2.getIatLanguage(), vadTime);
        }
    }

    public void startAsrSocket() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.startAsrSocket(BaseApplication.getInstance(), i00.f45347T, i00.f45345R, i00.f45346S, "ai.watchfun.cn", HeaderUtils.buildWebsocketHeader(this.f18219X));
        }
    }

    public void startReceiver() {
        this.f18218V1 = true;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f18230d2, intentFilter);
    }

    public void startSelectTransActivity(String strFrom, String strTo, int type, int actionType) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, strFrom);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, strTo);
        bundle.putInt(SelectTransActivity.KEY_TYPE, type);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, actionType);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void startTTS(String text, String language, String voicePath) {
        p87 p87Var = this.f18212H;
        if (p87Var != null) {
            p87Var.refreshData(this, text, language, voicePath);
        }
    }

    public void stopAsr() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.f18221Z;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.stopAsr();
        }
    }

    public void unregisterReceiver() {
        if (this.f18218V1) {
            unregisterReceiver(this.f18230d2);
            this.f18218V1 = false;
        }
    }

    public void initView() {
        if (MusicPlayerManager.getInstance(this).isPlaying()) {
            MusicPlayerManager.getInstance(this).pauseMusic(this);
        }
        checkAndRequestPermissions();
        this.f18211F = new WakeLockManager(this);
        this.f18212H = new p87(this);
        initWssAsr();
    }
}
