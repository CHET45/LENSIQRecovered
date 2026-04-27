package com.watchfun.transcommon.base;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1143j;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.presenter.GptAiTextToAudioPresenter;
import com.watchfun.transcommon.manager.WakeLockManager;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.utils.HeaderUtils;
import com.watchfun.translatemodule.AsrActionMode;
import com.watchfun.translatemodule.BaseWebSocketManager;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.util.ArrayList;
import p000.e10;
import p000.efb;
import p000.j8i;
import p000.l3h;
import p000.lx2;
import p000.mf4;
import p000.qr0;
import p000.uae;
import p000.ubb;
import p000.ufh;
import p000.vfe;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAsrActivity<T extends j8i, DB extends uae> extends BaseActivity<T> implements GPTContract.AiGPTTextToAudioView {
    private GptAiTextToAudioPresenter aiTextToAudioPresenter;
    private int asrfunctionMode;
    protected DB database;
    protected TransLanguageData fromLanguageData;
    private qr0 mBaseLifecycle;
    private PermissionExplanationDialog mPermissionExplanationDialog;
    private boolean needUseOfflineMode;
    private String spKeyFrom;
    private String spKeyTo;
    protected TransLanguageData toLanguageData;
    private WakeLockManager wakeLockManager;
    private final String TAG = "BaseAsrActivity";

    /* JADX INFO: renamed from: permissions, reason: collision with root package name */
    String[] f106653permissions = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};
    public boolean isStop = false;
    protected int type = -1;
    protected int phoneType = 1;
    protected int earType = 2;
    private final BaseWebSocketManager.AsrDataListener asrDataListener = new C42021();

    /* JADX INFO: renamed from: com.watchfun.transcommon.base.BaseAsrActivity$1 */
    public class C42021 extends BaseWebSocketManager.AsrDataListener {
        public C42021() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageContinuous$1(String str, String str2, String str3, String str4, boolean z) {
            BaseAsrActivity.this.onAsrResultContinuous(str, str2, str3, str4, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageOnce$0(String str, String str2, String str3, String str4, String str5, boolean z) {
            BaseAsrActivity.this.onAsrResultOnce(str, str2, str3, str4, str5, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReconnectFail$2() {
            ToastUtils.showShort(C4201R.string.loading_no_net_view_text_hint);
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onClose(int i) {
            BaseAsrActivity.this.onClose(i);
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onMessageContinuous(final String str, final String str2, final String str3, final String str4, final boolean z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            BaseAsrActivity baseAsrActivity = BaseAsrActivity.this;
            if (baseAsrActivity.isStop) {
                return;
            }
            baseAsrActivity.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25954a.lambda$onMessageContinuous$1(str, str2, str3, str4, z);
                }
            });
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onMessageOnce(final String str, final String str2, final String str3, final String str4, final String str5, final boolean z) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            BaseAsrActivity baseAsrActivity = BaseAsrActivity.this;
            if (baseAsrActivity.isStop) {
                return;
            }
            baseAsrActivity.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25947a.lambda$onMessageOnce$0(str, str2, str3, str4, str5, z);
                }
            });
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onOpen() {
            BaseAsrActivity.this.onWebSocketOpen();
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onReconnectFail() {
            super.onReconnectFail();
            if (BaseAsrActivity.this.isNetOffline() && BaseAsrActivity.this.needUseOfflineMode) {
                return;
            }
            BaseAsrActivity.this.runOnUiThread(new Runnable() { // from class: com.watchfun.transcommon.base.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseAsrActivity.C42021.lambda$onReconnectFail$2();
                }
            });
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onStopRecord() {
            BaseAsrActivity.this.onStopAsrView();
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onTts(File file) {
            BaseAsrActivity.this.onTtsFile(file);
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onTtsPcm(byte[] bArr, int i) {
            super.onTtsPcm(bArr, i);
            BaseAsrActivity.this.onTtsPcm(bArr, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f106653permissions) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f106653permissions, 200);
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
                this.asrfunctionMode = AsrActionMode.PHONE_GLASSES_TYPE.getCode();
                return;
            } else {
                this.asrfunctionMode = AsrActionMode.PHONE_HEADSET_TYPE.getCode();
                return;
            }
        }
        if (this.spKeyFrom.equals(vfe.C14037b.f90927T)) {
            this.asrfunctionMode = AsrActionMode.TRANSLATOR_TYPE.getCode();
            return;
        }
        if (this.spKeyFrom.equals("woke_language_from_two_ear_news")) {
            this.asrfunctionMode = AsrActionMode.DUAL_EAR_TYPE.getCode();
        } else if (this.spKeyFrom.equals(vfe.C14037b.f90935X)) {
            this.asrfunctionMode = AsrActionMode.DUAL_FREEDOM_TALK_TYPE.getCode();
        } else {
            this.asrfunctionMode = AsrActionMode.TRANSLATOR_TYPE.getCode();
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
            return;
        }
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

    private void initWssAsr() {
        TranslateWebSocketManager.getInstance().setAsrDataListener(this.asrDataListener);
    }

    private void release() {
        TranslateWebSocketManager.getInstance().unRegisterAsrDataListener();
        TranslateWebSocketManager.getInstance().release();
        AudioPlayerManager.getInstance().stopAudio();
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.mPermissionExplanationDialog == null) {
            this.mPermissionExplanationDialog = new PermissionExplanationDialog(this, new PermissionExplanationDialog.OnClickListListener() { // from class: com.watchfun.transcommon.base.BaseAsrActivity.2
                @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
                public void onOk() {
                    BaseAsrActivity.this.checkPermission();
                }

                @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
                public void onRefuse() {
                    Toast.makeText(BaseAsrActivity.this, C4201R.string.permission_tip5, 0).show();
                }
            });
        }
        if (this.mPermissionExplanationDialog.isShowing()) {
            return;
        }
        this.mPermissionExplanationDialog.show();
    }

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public void addNetDisposable(mf4 mf4Var) {
        this.mBaseLifecycle.addNetDisposable(mf4Var);
    }

    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f106653permissions).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    public void exchangeLanguage() {
        this.fromLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyFrom));
        this.toLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyTo));
        vfe.getInstance().putString(this.spKeyTo, TransLanguageData.toJson(this.fromLanguageData));
        vfe.getInstance().putString(this.spKeyFrom, TransLanguageData.toJson(this.toLanguageData));
        this.fromLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyFrom));
        this.toLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(this.spKeyTo));
    }

    @Override // android.app.Activity
    public void finish() {
        release();
        super.finish();
    }

    public abstract DB getDatabase();

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public String getPageName() {
        return getClass().getName();
    }

    public abstract String getSpKeyFrom();

    public abstract String getSpKeyTo();

    @Override // com.watchfun.base.BaseActivity
    public abstract T getViewBinding();

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
    }

    public void initFromLanguageView(TransLanguageData transLanguageData) {
    }

    public void initToLanguageView(TransLanguageData transLanguageData) {
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView(Bundle bundle) {
    }

    public boolean isAsring() {
        return TranslateWebSocketManager.getInstance().isAsring();
    }

    public boolean isNetOffline() {
        return !ubb.isNetworkAvailable(this);
    }

    public void onAsrResultContinuous(String str, String str2, String str3, String str4, boolean z) {
    }

    public void onAsrResultOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    public void onClose(int i) {
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        this.database = (DB) getDatabase();
        this.spKeyFrom = getSpKeyFrom();
        this.spKeyTo = getSpKeyTo();
        initAsrActionMode();
        super.onCreate(bundle);
        this.mBaseLifecycle = new qr0();
        getLifecycle().addObserver(this.mBaseLifecycle);
        initData();
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
    }

    public void onTtsFile(File file) {
    }

    public void onTtsPcm(byte[] bArr, int i) {
    }

    public void onWebSocketOpen() {
    }

    public void setNeedUseOfflineMode(boolean z) {
        this.needUseOfflineMode = z;
    }

    public void startAsr(boolean z) {
        AudioPlayerManager.getInstance().stopAudio();
        float f = vfe.getInstance().getFloat("voice_speed", 1L);
        if (this.type == this.phoneType) {
            TranslateWebSocketManager.getInstance().startAsr(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), z, f);
        } else {
            TranslateWebSocketManager.getInstance().startAsr(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), z, f);
        }
    }

    public void startAsrNoVad() {
        float f = vfe.getInstance().getFloat("voice_speed", 1L);
        if (this.type == this.phoneType) {
            TranslateWebSocketManager.getInstance().startAsrVad(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), 300000L, f);
        } else {
            TranslateWebSocketManager.getInstance().startAsrVad(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), 300000L, f);
        }
    }

    public void startAsrSocket() {
        StringBuilder sb = new StringBuilder();
        sb.append("startAsrSocket -----------------=");
        sb.append(e10.f31486b);
        TranslateWebSocketManager.getInstance().startSocket(this, e10.f31491g, e10.f31486b, e10.f31487c, e10.f31485a, HeaderUtils.buildWebsocketHeader(this.asrfunctionMode));
    }

    public void startAsrSocketAsLanguages() {
        TranslateWebSocketManager.getInstance().setVadTime(90000L, 90000L);
        TranslateWebSocketManager.getInstance().startSocket(this, e10.f31491g, e10.f31486b, e10.f31487c, e10.f31485a, HeaderUtils.buildWebsocketHeader(this.asrfunctionMode));
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

    public void startSelectTransActivityForResult(String str, String str2, int i, int i2, int i3) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, str);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, str2);
        bundle.putInt(SelectTransActivity.KEY_TYPE, i);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, i2);
        intent.putExtras(bundle);
        startActivityForResult(intent, i3);
    }

    public void startTTS(String str, String str2, String str3) {
        if (this.aiTextToAudioPresenter != null) {
            this.aiTextToAudioPresenter.refreshDataBySpeed(this, str, str2, str3, vfe.getInstance().getFloat("voice_speed", 1L));
        }
    }

    public void stopAsr() {
        TranslateWebSocketManager.getInstance().stopAsr();
    }

    public void stopAsrSocket() {
        TranslateWebSocketManager.getInstance().stopSocket();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        this.wakeLockManager = new WakeLockManager(this);
        this.aiTextToAudioPresenter = new GptAiTextToAudioPresenter(this);
        initWssAsr();
    }
}
