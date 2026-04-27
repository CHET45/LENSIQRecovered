package p000;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.C2468a;
import com.blankj.utilcode.util.C2473f;
import com.watchfun.callvideo.activity.InviteCallActivity;
import com.watchfun.callvideo.activity.TransVideoActivity;
import com.watchfun.callvideo.activity.VideoChatActivity;
import com.watchfun.callvideo.bean.CallAnswerBean;
import com.watchfun.transcommon.utils.MD5Util;
import im.zego.zegoexpress.ZegoExpressEngine;
import im.zego.zegoexpress.callback.IZegoApiCalledEventHandler;
import im.zego.zegoexpress.callback.IZegoCustomAudioProcessHandler;
import im.zego.zegoexpress.callback.IZegoEventHandler;
import im.zego.zegoexpress.callback.IZegoIMSendCustomCommandCallback;
import im.zego.zegoexpress.callback.IZegoRoomLoginCallback;
import im.zego.zegoexpress.constants.ZegoAudioChannel;
import im.zego.zegoexpress.constants.ZegoAudioDeviceMode;
import im.zego.zegoexpress.constants.ZegoAudioSampleRate;
import im.zego.zegoexpress.constants.ZegoDeviceExceptionType;
import im.zego.zegoexpress.constants.ZegoDeviceType;
import im.zego.zegoexpress.constants.ZegoPlayerState;
import im.zego.zegoexpress.constants.ZegoPublisherState;
import im.zego.zegoexpress.constants.ZegoRemoteDeviceState;
import im.zego.zegoexpress.constants.ZegoRoomStateChangedReason;
import im.zego.zegoexpress.constants.ZegoScenario;
import im.zego.zegoexpress.constants.ZegoStreamQualityLevel;
import im.zego.zegoexpress.constants.ZegoUpdateType;
import im.zego.zegoexpress.constants.ZegoViewMode;
import im.zego.zegoexpress.entity.ZegoAudioFrameParam;
import im.zego.zegoexpress.entity.ZegoCanvas;
import im.zego.zegoexpress.entity.ZegoCustomAudioProcessConfig;
import im.zego.zegoexpress.entity.ZegoEngineConfig;
import im.zego.zegoexpress.entity.ZegoEngineProfile;
import im.zego.zegoexpress.entity.ZegoRoomConfig;
import im.zego.zegoexpress.entity.ZegoStream;
import im.zego.zegoexpress.entity.ZegoUser;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o5i {

    /* JADX INFO: renamed from: o */
    public static volatile o5i f66504o = null;

    /* JADX INFO: renamed from: p */
    public static final int f66505p = 1801829883;

    /* JADX INFO: renamed from: q */
    public static final String f66506q = "5f809909687ba6018eafd905820f77b99cb74f47d92f0c3aa452d8aad6f5b42d";

    /* JADX INFO: renamed from: r */
    public static final String f66507r = "invite";

    /* JADX INFO: renamed from: s */
    public static final String f66508s = "inviteResult";

    /* JADX INFO: renamed from: t */
    public static final String f66509t = "translate";

    /* JADX INFO: renamed from: a */
    public final String f66510a;

    /* JADX INFO: renamed from: b */
    public final String f66511b;

    /* JADX INFO: renamed from: c */
    public final String f66512c;

    /* JADX INFO: renamed from: d */
    public ZegoPlayerState f66513d;

    /* JADX INFO: renamed from: e */
    public ZegoPublisherState f66514e;

    /* JADX INFO: renamed from: f */
    public ZegoRoomStateChangedReason f66515f;

    /* JADX INFO: renamed from: g */
    public String f66516g;

    /* JADX INFO: renamed from: h */
    public ZegoExpressEngine f66517h;

    /* JADX INFO: renamed from: i */
    public ZegoCanvas f66518i;

    /* JADX INFO: renamed from: j */
    public ZegoUpdateType f66519j;

    /* JADX INFO: renamed from: k */
    public long f66520k;

    /* JADX INFO: renamed from: l */
    public InterfaceC10200f f66521l;

    /* JADX INFO: renamed from: m */
    public InterfaceC10201g f66522m;

    /* JADX INFO: renamed from: n */
    public InterfaceC10202h f66523n;

    /* JADX INFO: renamed from: o5i$a */
    public class C10195a extends IZegoEventHandler {
        public C10195a() {
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onIMRecvCustomCommand(String str, ZegoUser zegoUser, String str2) {
            super.onIMRecvCustomCommand(str, zegoUser, str2);
            try {
                if (!new JSONObject(str2).getString("messageType").equals(o5i.f66507r)) {
                    InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
                    if (interfaceC10200f != null) {
                        interfaceC10200f.onIMRecvCustomCommand(str2);
                        return;
                    }
                    return;
                }
                if (C2468a.getTopActivity() instanceof InviteCallActivity) {
                    return;
                }
                if (C2468a.getTopActivity() instanceof VideoChatActivity) {
                    o5i.this.sendMessageToOtherUser(qc7.toJson(new CallAnswerBean("1", o5i.f66508s)));
                    if (o5i.this.f66523n != null) {
                        o5i.this.f66523n.onInviteMessage(str2);
                        return;
                    }
                    return;
                }
                if ((C2468a.getTopActivity() instanceof TransVideoActivity) && System.currentTimeMillis() - o5i.this.f66520k > 1000) {
                    Intent intent = new Intent(C2468a.getTopActivity(), (Class<?>) InviteCallActivity.class);
                    intent.putExtra(InviteCallActivity.f25119e, str2);
                    C2468a.startActivity(intent);
                    o5i.this.f66520k = System.currentTimeMillis();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onLocalDeviceExceptionOccurred(ZegoDeviceExceptionType zegoDeviceExceptionType, ZegoDeviceType zegoDeviceType, String str) {
            InterfaceC10200f interfaceC10200f;
            super.onLocalDeviceExceptionOccurred(zegoDeviceExceptionType, zegoDeviceType, str);
            if (zegoDeviceExceptionType != ZegoDeviceExceptionType.UNKNOWN || (interfaceC10200f = o5i.this.f66521l) == null) {
                return;
            }
            interfaceC10200f.onLocalDeviceError();
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onNetworkQuality(String str, ZegoStreamQualityLevel zegoStreamQualityLevel, ZegoStreamQualityLevel zegoStreamQualityLevel2) {
            super.onNetworkQuality(str, zegoStreamQualityLevel, zegoStreamQualityLevel2);
            if (zegoStreamQualityLevel.value() == 3 || zegoStreamQualityLevel.value() == 4 || zegoStreamQualityLevel2.value() == 3 || zegoStreamQualityLevel2.value() == 4) {
                InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
                if (interfaceC10200f != null) {
                    interfaceC10200f.onNetWorkStateChange(false);
                    return;
                }
                return;
            }
            InterfaceC10200f interfaceC10200f2 = o5i.this.f66521l;
            if (interfaceC10200f2 != null) {
                interfaceC10200f2.onNetWorkStateChange(true);
            }
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onPlayerStateUpdate(String str, ZegoPlayerState zegoPlayerState, int i, JSONObject jSONObject) {
            super.onPlayerStateUpdate(str, zegoPlayerState, i, jSONObject);
            C2473f.m4168e("Player State Update State: %d", Integer.valueOf(zegoPlayerState.value()));
            o5i.this.f66513d = zegoPlayerState;
            InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
            if (interfaceC10200f != null) {
                interfaceC10200f.onPlayerStateUpdate(zegoPlayerState);
            }
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onPublisherStateUpdate(String str, ZegoPublisherState zegoPublisherState, int i, JSONObject jSONObject) {
            super.onPublisherStateUpdate(str, zegoPublisherState, i, jSONObject);
            C2473f.m4168e("Publisher State Update State: %d", Integer.valueOf(zegoPublisherState.value()));
            o5i.this.f66514e = zegoPublisherState;
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onRemoteCameraStateUpdate(String str, ZegoRemoteDeviceState zegoRemoteDeviceState) {
            super.onRemoteCameraStateUpdate(str, zegoRemoteDeviceState);
            InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
            if (interfaceC10200f != null) {
                if (zegoRemoteDeviceState == ZegoRemoteDeviceState.DISABLE) {
                    interfaceC10200f.onRemoteCameraSwitch(false);
                } else if (zegoRemoteDeviceState == ZegoRemoteDeviceState.OPEN) {
                    interfaceC10200f.onRemoteCameraSwitch(true);
                }
            }
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onRoomStateChanged(String str, ZegoRoomStateChangedReason zegoRoomStateChangedReason, int i, JSONObject jSONObject) {
            C2473f.m4168e("onRoomStateChanged, roomID:%s, reason:%s, errorCode:%d", str, zegoRoomStateChangedReason.toString(), Integer.valueOf(i));
            o5i.this.f66515f = zegoRoomStateChangedReason;
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onRoomStreamUpdate(String str, ZegoUpdateType zegoUpdateType, ArrayList<ZegoStream> arrayList, JSONObject jSONObject) {
            super.onRoomStreamUpdate(str, zegoUpdateType, arrayList, jSONObject);
            C2473f.m4168e("lttt", "onRoomStreamUpdate状态变化::" + zegoUpdateType);
            o5i.this.f66519j = zegoUpdateType;
            if (zegoUpdateType != ZegoUpdateType.ADD) {
                if (o5i.this.f66513d == ZegoPlayerState.NO_PLAY) {
                    return;
                }
                Iterator<ZegoStream> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (o5i.this.f66516g.equals(it.next().streamID)) {
                        o5i.this.f66517h.stopPlayingStream(o5i.this.f66516g);
                        o5i.this.f66516g = null;
                    }
                }
                if (zegoUpdateType != ZegoUpdateType.DELETE || o5i.this.f66522m == null) {
                    return;
                }
                o5i.this.f66522m.onCancelCall();
                return;
            }
            if (o5i.this.f66513d != ZegoPlayerState.NO_PLAY) {
                o5i.this.f66517h.stopPlayingStream(o5i.this.f66516g);
                o5i.this.f66516g = null;
            }
            o5i.this.f66516g = arrayList.get(0).streamID;
            C2473f.m4168e("ltttt", "h5流id:::" + o5i.this.f66516g);
            InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
            if (interfaceC10200f != null) {
                interfaceC10200f.onStartPullStream();
            }
        }

        @Override // im.zego.zegoexpress.callback.IZegoEventHandler
        public void onRoomUserUpdate(String str, ZegoUpdateType zegoUpdateType, ArrayList<ZegoUser> arrayList) {
            super.onRoomUserUpdate(str, zegoUpdateType, arrayList);
            C2473f.m4168e("lttt", "状态变化::" + zegoUpdateType);
            if (zegoUpdateType == ZegoUpdateType.DELETE) {
                for (ZegoUser zegoUser : arrayList) {
                }
                InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
                if (interfaceC10200f != null) {
                    interfaceC10200f.onOtherUserLoginOut();
                }
                if (o5i.this.f66522m != null) {
                    o5i.this.f66522m.onCancelCall();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o5i$b */
    public class C10196b extends IZegoCustomAudioProcessHandler {
        public C10196b() {
        }

        @Override // im.zego.zegoexpress.callback.IZegoCustomAudioProcessHandler
        public void onProcessCapturedAudioData(ByteBuffer byteBuffer, int i, ZegoAudioFrameParam zegoAudioFrameParam, double d) {
            super.onProcessCapturedAudioData(byteBuffer, i, zegoAudioFrameParam, d);
            InterfaceC10200f interfaceC10200f = o5i.this.f66521l;
            if (interfaceC10200f != null) {
                interfaceC10200f.onProcessCapturedAudioData(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: o5i$c */
    public class C10197c implements IZegoRoomLoginCallback {
        public C10197c() {
        }

        @Override // im.zego.zegoexpress.callback.IZegoRoomLoginCallback
        public void onRoomLoginResult(int i, JSONObject jSONObject) {
            if (i == 0) {
                C2473f.m4168e("登录成功");
                return;
            }
            C2473f.m4168e("登录失败，请参考 errorCode 说明 https://doc-zh.zego.im/article/4378::::" + i);
        }
    }

    /* JADX INFO: renamed from: o5i$d */
    public class C10198d implements IZegoIMSendCustomCommandCallback {
        public C10198d() {
        }

        @Override // im.zego.zegoexpress.callback.IZegoIMSendCustomCommandCallback
        public void onIMSendCustomCommandResult(int i) {
        }
    }

    /* JADX INFO: renamed from: o5i$e */
    public class C10199e extends IZegoApiCalledEventHandler {
        public C10199e() {
        }

        @Override // im.zego.zegoexpress.callback.IZegoApiCalledEventHandler
        public void onApiCalledResult(int i, String str, String str2) {
            super.onApiCalledResult(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: o5i$f */
    public interface InterfaceC10200f {
        void onIMRecvCustomCommand(String str);

        void onLocalDeviceError();

        void onNetWorkStateChange(boolean z);

        void onOtherUserLoginOut();

        void onPlayerStateUpdate(ZegoPlayerState zegoPlayerState);

        void onProcessCapturedAudioData(ByteBuffer byteBuffer);

        void onRemoteCameraSwitch(boolean z);

        void onStartPullStream();
    }

    /* JADX INFO: renamed from: o5i$g */
    public interface InterfaceC10201g {
        void onCancelCall();
    }

    /* JADX INFO: renamed from: o5i$h */
    public interface InterfaceC10202h {
        void onInviteMessage(String str);
    }

    public o5i() {
        String sha256String = MD5Util.getSha256String(l84.getDeviceId(iy2.getAppContext()));
        if (sha256String.length() > 12) {
            this.f66510a = sha256String.substring(0, 12);
        } else {
            this.f66510a = sha256String;
        }
        this.f66511b = "Push" + this.f66510a;
        this.f66512c = "Room" + this.f66510a;
    }

    public static o5i getInstance() {
        if (f66504o == null) {
            synchronized (o5i.class) {
                try {
                    if (f66504o == null) {
                        f66504o = new o5i();
                    }
                } finally {
                }
            }
        }
        return f66504o;
    }

    public void createEngine() {
        ZegoEngineProfile zegoEngineProfile = new ZegoEngineProfile();
        zegoEngineProfile.appID = 1801829883L;
        zegoEngineProfile.appSign = f66506q;
        zegoEngineProfile.scenario = ZegoScenario.STANDARD_VIDEO_CALL;
        zegoEngineProfile.application = (Application) iy2.getAppContext().getApplicationContext();
        this.f66517h = ZegoExpressEngine.createEngine(zegoEngineProfile, null);
        ZegoEngineConfig zegoEngineConfig = new ZegoEngineConfig();
        zegoEngineConfig.advancedConfig.put("bluetooth_capture_only_voip", "true");
        ZegoExpressEngine.setEngineConfig(zegoEngineConfig);
        this.f66517h.setAudioDeviceMode(ZegoAudioDeviceMode.GENERAL);
        ZegoCustomAudioProcessConfig zegoCustomAudioProcessConfig = new ZegoCustomAudioProcessConfig();
        zegoCustomAudioProcessConfig.channel = ZegoAudioChannel.MONO;
        zegoCustomAudioProcessConfig.sampleRate = ZegoAudioSampleRate.ZEGO_AUDIO_SAMPLE_RATE_44K;
        zegoCustomAudioProcessConfig.samples = 0;
        this.f66517h.enableCustomAudioCaptureProcessing(true, zegoCustomAudioProcessConfig);
    }

    public void destroyEngine() {
        stopStream();
        ZegoExpressEngine zegoExpressEngine = this.f66517h;
        if (zegoExpressEngine != null) {
            zegoExpressEngine.logoutRoom();
        }
        ZegoExpressEngine.destroyEngine(null);
    }

    public void enableAudioCaptureDevice(boolean z) {
        ZegoExpressEngine zegoExpressEngine = this.f66517h;
        if (zegoExpressEngine != null) {
            zegoExpressEngine.enableAudioCaptureDevice(z);
        }
    }

    public void enableCamera(boolean z) {
        ZegoExpressEngine zegoExpressEngine = this.f66517h;
        if (zegoExpressEngine != null) {
            zegoExpressEngine.enableCamera(z);
        }
    }

    public ZegoExpressEngine getEngine() {
        return this.f66517h;
    }

    public String getPublishStreamID() {
        return this.f66511b;
    }

    public String getRoomID() {
        return this.f66512c;
    }

    public String getUserID() {
        return this.f66510a;
    }

    public void initEngine() {
        createEngine();
        setEventHandler();
        loginRoom();
        setApiCalledResult();
    }

    public void loginRoom() {
        C2473f.m4168e("Login Room, roomID:%s", this.f66512c + "::::" + this.f66510a);
        ZegoRoomConfig zegoRoomConfig = new ZegoRoomConfig();
        zegoRoomConfig.isUserStatusNotify = true;
        zegoRoomConfig.maxMemberCount = 2;
        this.f66517h.loginRoom(this.f66512c, new ZegoUser(this.f66510a), zegoRoomConfig, new C10197c());
    }

    public void sendMessageToOtherUser(String str) {
        this.f66517h.sendCustomCommand(this.f66512c, str, null, new C10198d());
    }

    public void setApiCalledResult() {
        ZegoExpressEngine.setApiCalledCallback(new C10199e());
    }

    public void setEventHandler() {
        this.f66517h.setEventHandler(new C10195a());
        this.f66517h.setCustomAudioProcessHandler(new C10196b());
    }

    public void setOnEngineCallBack(InterfaceC10200f interfaceC10200f) {
        this.f66521l = interfaceC10200f;
    }

    public void setOnInviteCallCallBack(InterfaceC10201g interfaceC10201g) {
        this.f66522m = interfaceC10201g;
    }

    public void setOnInviteMessageCallBack(InterfaceC10202h interfaceC10202h) {
        this.f66523n = interfaceC10202h;
    }

    public void startLive(boolean z, View view, View view2) {
        C2473f.m4168e("Start preview");
        if (TextUtils.isEmpty(this.f66511b)) {
            return;
        }
        if (view != null && view2 != null) {
            if (this.f66518i == null) {
                this.f66518i = new ZegoCanvas(view);
            }
            if (z) {
                this.f66518i.view = view2;
            } else {
                this.f66518i.view = view;
            }
            ZegoCanvas zegoCanvas = this.f66518i;
            zegoCanvas.viewMode = ZegoViewMode.ASPECT_FILL;
            this.f66517h.startPreview(zegoCanvas);
        }
        C2473f.m4168e("Start publishing stream. streamID:%s", this.f66511b);
        this.f66517h.startPublishingStream(this.f66511b);
    }

    public void startOtherLive(View view) {
        if (this.f66519j == ZegoUpdateType.ADD && !TextUtils.isEmpty(this.f66516g)) {
            if (view == null) {
                this.f66517h.startPlayingStream(this.f66516g);
                return;
            }
            ZegoCanvas zegoCanvas = new ZegoCanvas(view);
            zegoCanvas.viewMode = ZegoViewMode.ASPECT_FILL;
            this.f66517h.startPlayingStream(this.f66516g, zegoCanvas);
        }
    }

    public void stopStream() {
        ZegoExpressEngine zegoExpressEngine = this.f66517h;
        if (zegoExpressEngine != null) {
            zegoExpressEngine.stopPublishingStream();
            this.f66517h.stopPreview();
            if (!TextUtils.isEmpty(this.f66516g)) {
                this.f66517h.stopPlayingStream(this.f66516g);
            }
            enableAudioCaptureDevice(false);
            enableCamera(false);
        }
        this.f66521l = null;
        this.f66522m = null;
        this.f66523n = null;
    }
}
