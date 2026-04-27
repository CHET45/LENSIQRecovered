package com.watchfun.callvideo.base;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1143j;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.watchfun.base.BaseActivity;
import com.watchfun.callvideo.bean.CallInviteBean;
import com.watchfun.callvideo.bean.CallMessageBean;
import com.watchfun.callvideo.bean.CallTransMessage;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.WsMessageBean;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.utils.HeaderUtils;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.VideoCallRealWebSocketManager;
import im.zego.zegoexpress.ZegoExpressEngine;
import im.zego.zegoexpress.constants.ZegoPlayerState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000.C4826dk;
import p000.e10;
import p000.efb;
import p000.gu8;
import p000.igg;
import p000.j8i;
import p000.l3h;
import p000.lx2;
import p000.mf4;
import p000.o5i;
import p000.qc7;
import p000.qr0;
import p000.t77;
import p000.vfe;
import p000.wn1;
import p000.wu0;
import p000.xnc;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseCallActivity<T extends j8i> extends BaseActivity<T> implements wu0 {

    /* JADX INFO: renamed from: h2 */
    public static final String f25140h2 = "video";

    /* JADX INFO: renamed from: i2 */
    public static final String f25141i2 = "audio";

    /* JADX INFO: renamed from: j2 */
    public static final String f25142j2 = "language";

    /* JADX INFO: renamed from: k2 */
    public static final String f25143k2 = "targetLanguage";

    /* JADX INFO: renamed from: l2 */
    public static final String f25144l2 = "streamID";

    /* JADX INFO: renamed from: m2 */
    public static final String f25145m2 = "isInvited";

    /* JADX INFO: renamed from: n2 */
    public static final String f25146n2 = "callType";

    /* JADX INFO: renamed from: o2 */
    public static final String f25147o2 = "callPath";

    /* JADX INFO: renamed from: C */
    public String f25148C;

    /* JADX INFO: renamed from: F */
    public String f25149F;

    /* JADX INFO: renamed from: M */
    public ZegoExpressEngine f25152M;

    /* JADX INFO: renamed from: M1 */
    public int f25153M1;

    /* JADX INFO: renamed from: N */
    public TransLanguageData f25154N;

    /* JADX INFO: renamed from: Q */
    public TransLanguageData f25155Q;

    /* JADX INFO: renamed from: V1 */
    public wn1 f25156V1;

    /* JADX INFO: renamed from: X */
    public CallTransMessage f25157X;

    /* JADX INFO: renamed from: Y */
    public CallTransMessage f25158Y;

    /* JADX INFO: renamed from: Z */
    public int f25159Z;

    /* JADX INFO: renamed from: Z1 */
    public LinearLayoutManager f25160Z1;

    /* JADX INFO: renamed from: a */
    public qr0 f25161a;

    /* JADX INFO: renamed from: a2 */
    public String[] f25162a2;

    /* JADX INFO: renamed from: b */
    public PowerManager.WakeLock f25163b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25165c;

    /* JADX INFO: renamed from: c2 */
    public PermissionExplanationDialog f25166c2;

    /* JADX INFO: renamed from: d */
    public AudioManager f25167d;

    /* JADX INFO: renamed from: e */
    public boolean f25169e;

    /* JADX INFO: renamed from: e2 */
    public boolean f25170e2;

    /* JADX INFO: renamed from: f */
    public String f25171f;

    /* JADX INFO: renamed from: f2 */
    public int f25172f2;

    /* JADX INFO: renamed from: m */
    public String f25174m;

    /* JADX INFO: renamed from: H */
    public boolean f25150H = false;

    /* JADX INFO: renamed from: L */
    public boolean f25151L = false;

    /* JADX INFO: renamed from: b2 */
    public String f25164b2 = "";

    /* JADX INFO: renamed from: d2 */
    public Handler f25168d2 = new Handler();

    /* JADX INFO: renamed from: g2 */
    public BaseNewWebSocketManager.AsrDataListener f25173g2 = new C4018d();

    /* JADX INFO: renamed from: com.watchfun.callvideo.base.BaseCallActivity$a */
    public class C4015a implements o5i.InterfaceC10200f {
        public C4015a() {
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onIMRecvCustomCommand(String str) {
            WsMessageBean wsMessageBean = (WsMessageBean) qc7.fromJson(str, WsMessageBean.class);
            BaseCallActivity.this.m7526r(wsMessageBean.getLanguage(), wsMessageBean.getText(), wsMessageBean.getTargetText(), wsMessageBean.isFinal());
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onLocalDeviceError() {
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onNetWorkStateChange(boolean z) {
            BaseCallActivity.this.mo7512l(z);
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onOtherUserLoginOut() {
            l3h.showToastShort(BaseCallActivity.this.getString(C4201R.string.string_they_hungup));
            BaseCallActivity.this.finish();
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onPlayerStateUpdate(ZegoPlayerState zegoPlayerState) {
            BaseCallActivity.this.m7525m(zegoPlayerState);
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onProcessCapturedAudioData(ByteBuffer byteBuffer) {
            if (BaseCallActivity.this.isFinishing() || BaseCallActivity.this.isDestroyed()) {
                return;
            }
            BaseCallActivity baseCallActivity = BaseCallActivity.this;
            baseCallActivity.sendMsgWs(baseCallActivity.convertByteBufferToBytes(byteBuffer));
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onRemoteCameraSwitch(boolean z) {
            BaseCallActivity.this.mo7513n(z);
        }

        @Override // p000.o5i.InterfaceC10200f
        public void onStartPullStream() {
            BaseCallActivity.this.mo7514o();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.base.BaseCallActivity$b */
    public class C4016b implements o5i.InterfaceC10202h {
        public C4016b() {
        }

        @Override // p000.o5i.InterfaceC10202h
        public void onInviteMessage(String str) {
            CallInviteBean callInviteBean = (CallInviteBean) qc7.fromJson(str, CallInviteBean.class);
            BaseCallActivity.this.f25149F = callInviteBean.getType();
            BaseCallActivity.this.initLanguage(callInviteBean.getLanguage(), callInviteBean.getTargetLanguage());
            BaseCallActivity.this.mo7515p();
            BaseCallActivity.this.mo7514o();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.base.BaseCallActivity$c */
    public class C4017c implements PermissionExplanationDialog.OnClickListListener {
        public C4017c() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            BaseCallActivity.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            l3h.showToastShort(BaseCallActivity.this.getString(C4201R.string.permission_tip5));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.base.BaseCallActivity$d */
    public class C4018d extends BaseNewWebSocketManager.AsrDataListener {
        public C4018d() {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
            super.onMessageOnce(str, str2, str3, str4, str5, z);
            BaseCallActivity.this.showTextGPTResult(str, str2, str3, z);
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.AsrDataListener, com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onOpen() {
            super.onOpen();
            VideoCallRealWebSocketManager.getInstance().sendInitCommand(BaseCallActivity.this.f25154N.getIatLanguage(), BaseCallActivity.this.f25155Q.getIatLanguage(), "1.0", "", t77.f83946y, t77.f83947z, t77.f83921A, BaseCallActivity.this.f25172f2);
            BaseCallActivity baseCallActivity = BaseCallActivity.this;
            if (baseCallActivity.f25170e2) {
                baseCallActivity.startAsr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f25162a2) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f25162a2, 200);
                return;
            }
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f25166c2;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f25166c2.dismiss();
            }
            this.f25166c2 = null;
        }
    }

    public static String encodeBase64(String str) {
        return new String(Base64.encode(str.getBytes(), 2));
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

    private void initEngine() {
        this.f25152M = o5i.getInstance().getEngine();
        o5i.getInstance().setOnEngineCallBack(new C4015a());
        o5i.getInstance().setOnInviteMessageCallBack(new C4016b());
        mo7515p();
        if (this.f25169e) {
            mo7514o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initLanguage(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f25154N = AiLangUtil.getLanguageDataByCode(this, str);
        }
        if (this.f25154N == null) {
            this.f25154N = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90973k1));
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f25155Q = AiLangUtil.getLanguageDataByCode(this, str2);
        }
        if (this.f25155Q == null) {
            this.f25155Q = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90976l1));
        }
        mo7511j();
    }

    @igg({"InvalidWakeLockTag"})
    private void initWakeLock() {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(805306394, "target");
        this.f25163b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOtherTextGPTResult$1(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            return;
        }
        if (this.f25158Y == null) {
            CallTransMessage callTransMessage = new CallTransMessage();
            this.f25158Y = callTransMessage;
            callTransMessage.setMessageTime(System.currentTimeMillis());
            this.f25156V1.addData(this.f25158Y);
            this.f25153M1 = this.f25156V1.getData().size() - 1;
        }
        this.f25158Y.setResult(str);
        this.f25158Y.setTransResult(str2);
        this.f25158Y.setType(1);
        this.f25158Y.setIsLangCode(this.f25154N.getIatLanguage());
        this.f25156V1.notifyItemChanged(this.f25153M1);
        mo7516q();
        if (z) {
            this.f25158Y = null;
            this.f25153M1 = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextGPTResult$0(String str, String str2, boolean z) {
        if (this.f25151L || TextUtils.isEmpty(str) || str.equals("null")) {
            return;
        }
        if (this.f25157X == null) {
            CallTransMessage callTransMessage = new CallTransMessage();
            this.f25157X = callTransMessage;
            callTransMessage.setMessageTime(System.currentTimeMillis());
            this.f25156V1.addData(this.f25157X);
            this.f25159Z = this.f25156V1.getData().size() - 1;
        }
        this.f25157X.setResult(str);
        this.f25157X.setTransResult(str2);
        this.f25157X.setType(0);
        this.f25157X.setIsLangCode(this.f25155Q.getIatLanguage());
        this.f25156V1.notifyItemChanged(this.f25159Z);
        mo7516q();
        if (z) {
            this.f25157X = null;
            this.f25159Z = -1;
        }
        String iatLanguage = this.f25154N.getIatLanguage();
        String str3 = z ? C4826dk.f29845f : "recognizing";
        String iatLanguage2 = this.f25155Q.getIatLanguage();
        o5i.getInstance();
        o5i.getInstance().sendMessageToOtherUser(qc7.toJson(new CallMessageBean(str, iatLanguage, str3, str2, iatLanguage2, o5i.f66509t)));
    }

    private void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.f25163b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f25166c2 == null) {
            this.f25166c2 = new PermissionExplanationDialog(this, new C4017c());
        }
        if (!TextUtils.isEmpty(this.f25164b2)) {
            this.f25166c2.setTipContent(this.f25164b2);
        }
        if (this.f25166c2.isShowing()) {
            return;
        }
        this.f25166c2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTextGPTResult(String str, final String str2, final String str3, final boolean z) {
        runOnUiThread(new Runnable() { // from class: qq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75094a.lambda$showTextGPTResult$0(str2, str3, z);
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public void addNetDisposable(mf4 mf4Var) {
        this.f25161a.addNetDisposable(mf4Var);
    }

    public boolean checkAndRequestPermissions() {
        String str = this.f25149F;
        if (str == null || !str.equals("video")) {
            this.f25162a2 = new String[]{xnc.f98582G};
            this.f25164b2 = getString(C4201R.string.permission_tip2);
        } else {
            this.f25162a2 = new String[]{xnc.f98581F, xnc.f98582G};
            this.f25164b2 = getString(C4201R.string.string_video_call_permission);
        }
        if (findUnaskedPermissions(this.f25162a2).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    public byte[] convertByteBufferToBytes(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public String getPageName() {
        return getClass().getName();
    }

    @Override // com.watchfun.base.BaseActivity
    public abstract T getViewBinding();

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        this.f25149F = getIntent().getStringExtra(f25146n2);
        initWakeLock();
        this.f25169e = getIntent().getBooleanExtra(f25145m2, false);
        this.f25171f = o5i.getInstance().getRoomID();
        this.f25174m = o5i.getInstance().getUserID();
        this.f25148C = o5i.getInstance().getPublishStreamID();
        initLanguage(getIntent().getStringExtra(f25142j2), getIntent().getStringExtra(f25143k2));
        String stringExtra = getIntent().getStringExtra(f25147o2);
        if (!this.f25169e) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", stringExtra);
            intent.setType("text/plain");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(Intent.createChooser(intent, ""));
            }
        }
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stringExtra));
        if (checkAndRequestPermissions()) {
            initEngine();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
    }

    /* JADX INFO: renamed from: j */
    public void mo7511j() {
    }

    /* JADX INFO: renamed from: k */
    public void m7524k() {
        zi9.m26852e("Websocket", "initWebScoket");
        VideoCallRealWebSocketManager.getInstance().startSocket(this, e10.f31492h, e10.f31486b, e10.f31487c, e10.f31485a, HeaderUtils.buildWebsocketHeader(2));
        VideoCallRealWebSocketManager.getInstance().setAsrDataListener(this.f25173g2);
    }

    /* JADX INFO: renamed from: l */
    public void mo7512l(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public void m7525m(ZegoPlayerState zegoPlayerState) {
    }

    /* JADX INFO: renamed from: n */
    public void mo7513n(boolean z) {
    }

    /* JADX INFO: renamed from: o */
    public void mo7514o() {
        this.f25170e2 = true;
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        gu8.setLanguage(this);
        this.f25156V1 = new wn1(this);
        this.f25160Z1 = new LinearLayoutManager(this, 1, false);
        super.onCreate(bundle);
        this.f25161a = new qr0();
        getLifecycle().addObserver(this.f25161a);
        m7524k();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            this.f25168d2.removeCallbacksAndMessages(null);
            releaseWakeLock();
            o5i.getInstance().sendMessageToOtherUser("{\"messageType\":\"callEnd\"}");
            o5i.getInstance().stopStream();
            VideoCallRealWebSocketManager.getInstance().release();
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
                    l3h.showToastShort(getString(C4201R.string.permission_system_set));
                    return;
                }
            }
            onPermissionSuccess();
            initEngine();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    /* JADX INFO: renamed from: p */
    public void mo7515p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo7516q() {
    }

    /* JADX INFO: renamed from: r */
    public void m7526r(String str, final String str2, final String str3, final boolean z) {
        runOnUiThread(new Runnable() { // from class: rq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79014a.lambda$showOtherTextGPTResult$1(str2, str3, z);
            }
        });
    }

    public void sendMsgWs(byte[] bArr) {
        VideoCallRealWebSocketManager.getInstance().send(bArr);
    }

    public void setTransMode(int i) {
        this.f25172f2 = i;
    }

    public void startAsr() {
        VideoCallRealWebSocketManager.getInstance().startAsr(this.f25154N.getIatLanguage(), this.f25155Q.getIatLanguage(), 86400000L);
    }

    public void stopAsr() {
        VideoCallRealWebSocketManager.getInstance().stopAsr();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView(Bundle bundle) {
    }
}
