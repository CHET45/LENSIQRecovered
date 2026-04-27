package com.watchfun.transcommon.base;

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
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.presenter.GptAiTextToAudioPresenter;
import com.watchfun.transcommon.manager.WakeLockManager;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.utils.HeaderUtils;
import com.watchfun.translatewebsocket.AsrNewActionMode;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy;
import java.io.File;
import java.util.ArrayList;
import p000.amc;
import p000.e10;
import p000.efb;
import p000.gu8;
import p000.j8i;
import p000.l3h;
import p000.lx2;
import p000.mf4;
import p000.qr0;
import p000.t77;
import p000.uae;
import p000.ufh;
import p000.vfe;
import p000.wu0;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAsrTransActivity<T extends j8i, DB extends uae> extends AppCompatActivity implements wu0, GPTContract.AiGPTTextToAudioView {
    private GptAiTextToAudioPresenter aiTextToAudioPresenter;
    private int asrfunctionMode;
    protected T binding;
    private WebSocketManagerStrategy currentStrategy;
    protected DB database;
    protected TransLanguageData fromLanguageData;
    private qr0 mBaseLifecycle;
    protected OnBluetoothSettingsListener mBluetoothSettingsListener;
    private PermissionExplanationDialog mPermissionExplanationDialog;
    private String spKeyFrom;
    private String spKeyTo;
    private long startTime;
    protected TransLanguageData toLanguageData;
    private int tranMode;
    private WakeLockManager wakeLockManager;
    private final String TAG = "BaseAsrTransActivity";

    /* JADX INFO: renamed from: permissions, reason: collision with root package name */
    String[] f106654permissions = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};
    public boolean isStop = false;
    protected int type = -1;
    protected int phoneType = 1;
    protected int earType = 2;
    private final BaseNewWebSocketManager.AsrDataListener asrDataListener = new C42041();
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.watchfun.transcommon.base.BaseAsrTransActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OnBluetoothSettingsListener onBluetoothSettingsListener;
            String action = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("配对成功: action名称 = ");
            sb.append(action);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10 && (onBluetoothSettingsListener = BaseAsrTransActivity.this.mBluetoothSettingsListener) != null) {
                    onBluetoothSettingsListener.onGetDeviceFail();
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra == 0) {
                    OnBluetoothSettingsListener onBluetoothSettingsListener2 = BaseAsrTransActivity.this.mBluetoothSettingsListener;
                    if (onBluetoothSettingsListener2 != null) {
                        onBluetoothSettingsListener2.onGetDeviceFail();
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
    };

    /* JADX INFO: renamed from: com.watchfun.transcommon.base.BaseAsrTransActivity$1 */
    public class C42041 extends BaseNewWebSocketManager.AsrDataListener {
        public C42041() {
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
            ToastUtils.showShort(BaseAsrTransActivity.this.getResources().getString(C4201R.string.loading_no_net_view_text_hint));
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onClose(int i) {
            BaseAsrTransActivity.this.onCloseWeb(i);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onError(Exception exc) {
            super.onError(exc);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageContinuous(final String str, final String str2, final String str3, final String str4, final boolean z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            BaseAsrTransActivity baseAsrTransActivity = BaseAsrTransActivity.this;
            if (baseAsrTransActivity.isStop) {
                return;
            }
            baseAsrTransActivity.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25967a.lambda$onMessageContinuous$1(str, str2, str3, str4, z);
                }
            });
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageOnce(final String str, final String str2, final String str3, final String str4, final String str5, final boolean z) {
            if (TextUtils.isEmpty(str2) || BaseAsrTransActivity.this.isStop) {
                return;
            }
            C2473f.m4167d("aaaaaaaa", "mp3Filepath--------------------------" + str4);
            BaseAsrTransActivity.this.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25960a.lambda$onMessageOnce$0(str, str2, str3, str4, str5, z);
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
            BaseAsrTransActivity.this.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25973a.lambda$onReconnectFail$2();
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
        public void onTtsMp3(byte[] bArr) {
            BaseAsrTransActivity.this.onTtsMp3Byte(bArr);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsPcm(byte[] bArr, int i) {
            BaseAsrTransActivity.this.onTtsPcmByte(bArr);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onVadTimeOut() {
            BaseAsrTransActivity.this.onVadTimeOutTip();
        }
    }

    public interface OnBluetoothSettingsListener {
        void onGetDeviceFail();

        void onGetDeviceSuccess(BluetoothDevice bluetoothDevice);

        void searBoundDeviceSuccess(BluetoothDevice bluetoothDevice);

        void searBoundDeviceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f106654permissions) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f106654permissions, 200);
                return;
            }
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.mPermissionExplanationDialog;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.mPermissionExplanationDialog.dismiss();
            }
            this.mPermissionExplanationDialog = null;
        }
    }

    private String[] findUnaskedPermissions(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private void initAsrActionMode() {
        if (this.spKeyFrom.equals(vfe.C14037b.f90919P)) {
            if (vfe.getInstance().getInt("SP_KEY_PROJECT_TYPE", -1) == 2) {
                this.asrfunctionMode = AsrNewActionMode.PHONE_GLASSES_TYPE.getCode();
                return;
            } else {
                this.asrfunctionMode = AsrNewActionMode.PHONE_HEADSET_TYPE.getCode();
                return;
            }
        }
        if (this.spKeyFrom.equals(vfe.C14037b.f90927T)) {
            this.asrfunctionMode = AsrNewActionMode.TRANSLATOR_TYPE.getCode();
            return;
        }
        if (this.spKeyFrom.equals("woke_language_from_two_ear_news")) {
            this.asrfunctionMode = AsrNewActionMode.DUAL_EAR_TYPE.getCode();
        } else if (this.spKeyFrom.equals(vfe.C14037b.f90935X)) {
            this.asrfunctionMode = AsrNewActionMode.DUAL_FREEDOM_TALK_TYPE.getCode();
        } else {
            this.asrfunctionMode = AsrNewActionMode.TRANSLATOR_TYPE.getCode();
        }
    }

    private void initLanguage(String str, String str2) {
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(str));
        this.fromLanguageData = transLanguageData;
        if (transLanguageData != null) {
            initFromLanguageView(transLanguageData);
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.fromLanguageData = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.fromLanguageData.setDefaultName("中文");
            this.fromLanguageData.setSelect(true);
            this.fromLanguageData.setVoiceName("xiaoyan");
            this.fromLanguageData.setIatLanguage("zh-CN");
            this.fromLanguageData.setLangKey("cn");
            this.fromLanguageData.setKeyName("zh_name");
            this.fromLanguageData.setUseMicTTS(true);
            vfe.getInstance().putString(str, TransLanguageData.toJson(this.fromLanguageData));
            initFromLanguageView(this.fromLanguageData);
        }
        TransLanguageData transLanguageData3 = AppUtils.getTransLanguageData(vfe.getInstance().getString(str2));
        this.toLanguageData = transLanguageData3;
        if (transLanguageData3 != null) {
            initToLanguageView(transLanguageData3);
        } else {
            TransLanguageData transLanguageData4 = new TransLanguageData();
            this.toLanguageData = transLanguageData4;
            transLanguageData4.setTransId(2);
            this.toLanguageData.setDefaultName("English");
            this.toLanguageData.setSelect(true);
            this.toLanguageData.setVoiceName("catherine");
            this.toLanguageData.setIatLanguage("en-US");
            this.toLanguageData.setLangKey(ufh.f87916c);
            this.toLanguageData.setKeyName("en_name");
            this.toLanguageData.setUseMicTTS(true);
            vfe.getInstance().putString(str2, TransLanguageData.toJson(this.toLanguageData));
            initToLanguageView(this.toLanguageData);
        }
        setTransLanguageData(this.fromLanguageData, this.toLanguageData);
    }

    private void initWssAsr() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.setAsrDataListener(this.asrDataListener);
        }
    }

    private void release() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.unRegisterAsrDataListener();
            this.currentStrategy.release();
        }
        AudioPlayerManager.getInstance().stopAudio();
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.mPermissionExplanationDialog == null) {
            this.mPermissionExplanationDialog = new PermissionExplanationDialog(this, new PermissionExplanationDialog.OnClickListListener() { // from class: com.watchfun.transcommon.base.BaseAsrTransActivity.2
                @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
                public void onOk() {
                    BaseAsrTransActivity.this.checkPermission();
                }

                @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
                public void onRefuse() {
                    Toast.makeText(BaseAsrTransActivity.this, C4201R.string.permission_tip5, 0).show();
                }
            });
        }
        if (this.mPermissionExplanationDialog.isShowing()) {
            return;
        }
        this.mPermissionExplanationDialog.show();
    }

    @Override // p000.wu0
    public void addNetDisposable(mf4 mf4Var) {
        this.mBaseLifecycle.addNetDisposable(mf4Var);
    }

    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f106654permissions).length <= 0) {
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
        this.fromLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyFrom));
        this.toLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyTo));
        vfe.getInstance().putString(this.spKeyTo, TransLanguageData.toJson(this.fromLanguageData));
        vfe.getInstance().putString(this.spKeyFrom, TransLanguageData.toJson(this.toLanguageData));
        this.fromLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyFrom));
        this.toLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyTo));
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
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.sendInitCommand(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), "1.0", "", t77.f83946y, t77.f83947z, t77.f83921A, this.tranMode);
        }
    }

    public void initData() {
    }

    public void initFromLanguageView(TransLanguageData transLanguageData) {
    }

    public void initPcmAudio() {
        amc amcVar = amc.getInstance();
        if (!amcVar.isInitialized()) {
            amcVar.initialize(this);
        }
        amcVar.startMp3Playback();
        amcVar.startPlayback();
    }

    public void initToLanguageView(TransLanguageData transLanguageData) {
    }

    public void initView(Bundle bundle) {
    }

    public boolean isAsring() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            return webSocketManagerStrategy.isAsring();
        }
        return false;
    }

    public void onAsrResultContinuous(String str, String str2, String str3, String str4, boolean z) {
    }

    public void onAsrResultOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
    }

    public void onCloseWeb(int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        gu8.setLanguage(this);
        super.onCreate(bundle);
        T t = (T) getViewBinding();
        this.binding = t;
        if (t != null) {
            setContentView(t.getRoot());
        }
        this.database = (DB) getDatabase();
        this.spKeyFrom = getSpKeyFrom();
        this.spKeyTo = getSpKeyTo();
        initAsrActionMode();
        this.mBaseLifecycle = new qr0();
        getLifecycle().addObserver(this.mBaseLifecycle);
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
        this.wakeLockManager.releaseWakeLock();
        if (isFinishing()) {
            release();
        }
    }

    public void onPermissionSuccess() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 200) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("allGranted =");
                    sb.append(i);
                    l3h.showToastShort(getString(C4201R.string.permission_system_set));
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
        this.aiTextToAudioPresenter = new GptAiTextToAudioPresenter(this);
        initWssAsr();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.wakeLockManager.acquireWakeLock();
        this.isStop = false;
        initLanguage(this.spKeyFrom, this.spKeyTo);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.isStop = true;
    }

    public void onStopAsrView() {
        C2473f.m4167d("aaaaaaaa", "onStopAsrView--111-");
    }

    public void onTtsFile(File file) {
    }

    public void onTtsMp3Byte(byte[] bArr) {
    }

    public void onTtsPcmByte(byte[] bArr) {
    }

    public void onVadTimeOutTip() {
    }

    public void onWebSocketOpen() {
        init();
    }

    public void setCurrentStrategy(WebSocketManagerStrategy webSocketManagerStrategy) {
        this.currentStrategy = webSocketManagerStrategy;
        initWssAsr();
    }

    public void setOnBluetoothSettingsListener(OnBluetoothSettingsListener onBluetoothSettingsListener) {
        this.mBluetoothSettingsListener = onBluetoothSettingsListener;
    }

    public void setTransLanguageData(TransLanguageData transLanguageData, TransLanguageData transLanguageData2) {
        init();
    }

    public void setTransMode(int i) {
        this.tranMode = i;
    }

    public void startAsr(long j) {
        AudioPlayerManager.getInstance().stopAudio();
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            if (this.type == this.phoneType) {
                webSocketManagerStrategy.startAsr(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("toLanguageData.getIatLanguage()=");
            sb.append(this.toLanguageData.getIatLanguage());
            sb.append("fromLanguageData.getIatLanguage() =");
            sb.append(this.fromLanguageData.getIatLanguage());
            this.currentStrategy.startAsr(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), j);
        }
    }

    public void startAsrSocket() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.startAsrSocket(this, e10.f31492h, e10.f31486b, e10.f31487c, e10.f31485a, HeaderUtils.buildWebsocketHeader(this.asrfunctionMode));
        }
    }

    public void startReceiver() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.mReceiver, intentFilter);
    }

    public void startSelectTransActivity(String str, String str2, int i, int i2) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, str);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, str2);
        bundle.putInt(SelectTransActivity.KEY_TYPE, i);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, i2);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void startTTS(String str, String str2, String str3) {
        GptAiTextToAudioPresenter gptAiTextToAudioPresenter = this.aiTextToAudioPresenter;
        if (gptAiTextToAudioPresenter != null) {
            gptAiTextToAudioPresenter.refreshData(this, str, str2, str3);
        }
    }

    public void stopAsr() {
        WebSocketManagerStrategy webSocketManagerStrategy = this.currentStrategy;
        if (webSocketManagerStrategy != null) {
            webSocketManagerStrategy.stopAsr();
        }
    }

    public void initView() {
        checkAndRequestPermissions();
        this.wakeLockManager = new WakeLockManager(this);
        this.aiTextToAudioPresenter = new GptAiTextToAudioPresenter(this);
        initWssAsr();
    }
}
