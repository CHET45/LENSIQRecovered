package com.eyevue.glassapp.services;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2468a;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.C2478k;
import com.book.studio.opus.OpusBridge;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.p006ai.AiCommandBean;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.database.aichat.AiChatMessage;
import com.eyevue.glassapp.database.aichat.AiChatMessageDao;
import com.eyevue.glassapp.database.aichat.AiChatMessageDatabase;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.utils.photo.ImageUtils;
import com.eyevue.glassapp.view.translate.simultaneous.C2957a;
import com.watchfun.base.BaseApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import p000.C14131vk;
import p000.C5372em;
import p000.d94;
import p000.efb;
import p000.hib;
import p000.i00;
import p000.igg;
import p000.kn1;
import p000.m3h;
import p000.nn1;
import p000.u1b;
import p000.u77;
import p000.xcg;
import p000.xnc;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueAiService extends Service {

    /* JADX INFO: renamed from: C */
    public kn1 f18316C;

    /* JADX INFO: renamed from: b */
    public AiChatMessageDao f18320b;

    /* JADX INFO: renamed from: d */
    public long f18322d;

    /* JADX INFO: renamed from: e */
    public String f18323e;

    /* JADX INFO: renamed from: f */
    public String f18324f;

    /* JADX INFO: renamed from: m */
    public String f18325m;

    /* JADX INFO: renamed from: a */
    public final String f18319a = "EyevueAiService";

    /* JADX INFO: renamed from: c */
    public final short[] f18321c = new short[1920];

    /* JADX INFO: renamed from: F */
    public final xcg<d94> f18317F = new xcg() { // from class: xk5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f98267a.lambda$new$1((d94) obj);
        }
    };

    /* JADX INFO: renamed from: H */
    public final AiWebSocketManager.AsrDataListener f18318H = new C2672b();

    /* JADX INFO: renamed from: com.eyevue.glassapp.services.EyevueAiService$a */
    public class C2671a implements ModBleResponse.OnPcmDataListener {
        public C2671a() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPcmDataListener
        public void onAiCancel() {
            AiWebSocketManager.getInstance().stopAi();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPcmDataListener
        public void onPcmCancel() {
            zi9.m26852e("EyevueAiService", "设备端已处理，ai不处理pcm");
            C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
            AiWebSocketManager.getInstance().stopAi();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPcmDataListener
        public void onPcmData(byte[] data) {
            if (AiWebSocketManager.getInstance().isCanUseAi()) {
                EyevueAiService.this.processAudioData(data);
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPcmDataListener
        public void onPcmEnd() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPcmDataListener
        public void onPcmStart() {
            if (!AiWebSocketManager.getInstance().isCanUseAi()) {
                C2473f.m4168e("EyevueAiService", "ai不可用时，完全停止");
                AiWebSocketManager.getInstance().stopAi();
            } else {
                if (AiWebSocketManager.getInstance().isAsring()) {
                    C2473f.m4168e("EyevueAiService", "ai过程中唤醒对话，重置ai对话，先停止再重新开始识别");
                    AiWebSocketManager.getInstance().stopAiNoStopSdk();
                }
                AiWebSocketManager.getInstance().startAiAsr(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.services.EyevueAiService$b */
    public class C2672b extends AiWebSocketManager.AsrDataListener {
        public C2672b() {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.AsrDataListener, com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onAiMessage(String msg, String voicePath, String startTimeId, boolean isFinal) {
            super.onAiMessage(msg, voicePath, startTimeId, isFinal);
            C14131vk c14131vk = new C14131vk();
            c14131vk.f91476b = 2001;
            c14131vk.f91477c = msg;
            c14131vk.f91475a = isFinal;
            c14131vk.f91478d = voicePath;
            zgb.defaultCenter().publish(c14131vk);
            if (isFinal) {
                AiChatMessage aiChatMessage = new AiChatMessage();
                aiChatMessage.setMessageTime(System.currentTimeMillis());
                aiChatMessage.setMsgId(System.currentTimeMillis() + "");
                aiChatMessage.setMsgType(2001);
                aiChatMessage.setContent(msg);
                aiChatMessage.setVoicePath(voicePath);
                EyevueAiService.this.f18320b.insert(aiChatMessage);
            }
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.AsrDataListener, com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onCommand(String cmd, List<AiCommandBean.QueryDescDTO> queryDesc) {
            super.onCommand(cmd, queryDesc);
            cmd.hashCode();
            switch (cmd) {
                case "decrease_volume_default":
                case "decrease_volume":
                    ModUtils.sendViaBle().controlVolume(Command.Param.VOLUME_DOWN);
                    break;
                case "start_over":
                case "resume_play":
                case "play":
                case "play_music":
                    ModUtils.sendViaBle().controlMusic(Command.Param.CONTROL_MUSIC_PLAY);
                    break;
                case "increase_volume_default":
                case "increase_volume":
                    ModUtils.sendViaBle().controlVolume(Command.Param.VOLUME_UP);
                    break;
                case "previous":
                case "previous_song":
                    ModUtils.sendViaBle().switchMusic(Command.Param.SWITCH_MUSIC_PREV);
                    break;
                case "video_recording":
                    if (!u77.f86964h) {
                        ModUtils.sendViaBle().startRecord();
                        break;
                    } else {
                        AiWebSocketManager.getInstance().stopAi();
                        C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
                        break;
                    }
                    break;
                case "stop_video_record":
                    ModUtils.sendViaBle().stopRecord();
                    break;
                case "stop_music":
                case "stop":
                case "stop_play":
                    ModUtils.sendViaBle().controlMusic(Command.Param.CONTROL_MUSIC_PAUSE);
                    break;
                case "take_photo":
                    if (!u77.f86964h) {
                        ModUtils.sendViaBle().takePhoto(Command.Param.TAKE_PHOTO_THUMBNAIL);
                        break;
                    } else {
                        AiWebSocketManager.getInstance().stopAi();
                        C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
                        break;
                    }
                    break;
                case "answer_call":
                    ModUtils.sendViaBle().controlCall(Command.Param.CONTROL_CALL_ANSWER);
                    break;
                case "next":
                case "next_song":
                    ModUtils.sendViaBle().switchMusic(Command.Param.SWITCH_MUSIC_NEXT);
                    break;
                case "quit":
                    AiWebSocketManager.getInstance().stopAiNoStopAudio();
                    C14131vk c14131vk = new C14131vk();
                    c14131vk.f91476b = u1b.f86555d;
                    zgb.defaultCenter().publish(c14131vk);
                    break;
                case "audio_recording":
                    if (!u77.f86964h) {
                        ModUtils.sendViaBle().controlRecordAudio(Command.Param.RECORD_AUDIO_START);
                        break;
                    } else {
                        AiWebSocketManager.getInstance().stopAi();
                        C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
                        break;
                    }
                    break;
                case "make_clock":
                    if (!C2475h.isGranted(xnc.f98588M) || !C2475h.isGranted(xnc.f98589N)) {
                        EyevueAiService.this.showPermissionDialog(queryDesc, cmd);
                        zi9.m26852e("EyevueAiService", "没有日历权限");
                        break;
                    } else {
                        EyevueAiService.this.setAlarm(queryDesc);
                        break;
                    }
                    break;
                case "quit_audio_recording":
                    ModUtils.sendViaBle().controlRecordAudio(Command.Param.RECORD_AUDIO_END);
                    break;
                case "quit_call":
                    ModUtils.sendViaBle().controlCall(Command.Param.CONTROL_CALL_HANGUP);
                    break;
                case "make_itinerary":
                    if (!C2475h.isGranted(xnc.f98588M) || !C2475h.isGranted(xnc.f98589N)) {
                        EyevueAiService.this.showPermissionDialog(queryDesc, cmd);
                        zi9.m26852e("EyevueAiService", "没有日历权限");
                        break;
                    } else {
                        EyevueAiService.this.setAlarm(queryDesc);
                        break;
                    }
                    break;
            }
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.AsrDataListener, com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onPhotoIdentify(String query) {
            super.onPhotoIdentify(query);
            EyevueAiService.this.f18324f = query;
            zi9.m26852e("EyevueAiService", "收到去拍照图片消息:::" + query);
            if (!u77.f86964h) {
                ModUtils.sendViaBle().takePhoto(Command.Param.TAKE_PHOTO_HIGH_QUALITY);
            } else {
                AiWebSocketManager.getInstance().stopAi();
                C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
            }
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.AsrDataListener, com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onUserMessage(String msg, String startTimeId, boolean isFinal) {
            super.onUserMessage(msg, startTimeId, isFinal);
            C14131vk c14131vk = new C14131vk();
            c14131vk.f91476b = 1001;
            c14131vk.f91477c = msg;
            c14131vk.f91475a = isFinal;
            zgb.defaultCenter().publish(c14131vk);
            if (isFinal) {
                AiChatMessage aiChatMessage = new AiChatMessage();
                aiChatMessage.setMessageTime(System.currentTimeMillis());
                aiChatMessage.setMsgType(1001);
                aiChatMessage.setContent(msg);
                EyevueAiService.this.f18320b.insert(aiChatMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.services.EyevueAiService$c */
    public class C2673c implements kn1.InterfaceC8459a {
        public C2673c() {
        }

        @Override // p000.kn1.InterfaceC8459a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.services.EyevueAiService$d */
    public class C2674d implements C2475h.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f18329a;

        public C2674d(final List val$queryDesc) {
            this.f18329a = val$queryDesc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGranted$0(List list) {
            C2473f.m4168e("EyevueAiService", "尝试再次设置闹钟:::" + list.size());
            EyevueAiService.this.setAlarm(list);
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onDenied(@efb List<String> deniedForever, @efb List<String> denied) {
            C2473f.m4168e("EyevueAiService", "日历权限请求失败！！！2222222！！！！");
            m3h.showToastShort(EyevueAiService.this.getString(C2531R.string.eyevue_permission_system_set));
            if (EyevueAiService.this.f18316C == null || !EyevueAiService.this.f18316C.isShowing()) {
                return;
            }
            EyevueAiService.this.f18316C.dismiss();
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onGranted(@efb List<String> granted) {
            C2473f.m4168e("EyevueAiService", "日历权限请求成功！！！！");
            AlarmManager alarmManager = (AlarmManager) EyevueAiService.this.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null && Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + EyevueAiService.this.getPackageName()));
                if (C2468a.getTopActivity() != null) {
                    C2468a.getTopActivity().startActivity(intent);
                    final List list = this.f18329a;
                    C2478k.runOnUiThreadDelayed(new Runnable() { // from class: yk5
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f101896a.lambda$onGranted$0(list);
                        }
                    }, 8000L);
                    return;
                }
            }
            EyevueAiService.this.setAlarm(this.f18329a);
            if (EyevueAiService.this.f18316C == null || !EyevueAiService.this.f18316C.isShowing()) {
                return;
            }
            EyevueAiService.this.f18316C.dismiss();
        }
    }

    @igg({"CheckResult"})
    private void initListener() {
        ModUtils.modBleResponse().setOnPcmDataListener(new C2671a());
        ModUtils.modBleResponse().setOnAiPhotoListener(new ModBleResponse.OnAiPhotoListener() { // from class: wk5
            @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnAiPhotoListener
            public final void onAiPhoto(byte[] bArr) {
                this.f94490a.lambda$initListener$0(bArr);
            }
        });
        AiWebSocketManager.getInstance().setAsrDataListener(this.f18318H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(byte[] bArr) {
        C2473f.m4168e("EyevueAiService", "收到图片数据:::" + bArr.length + "   ai功能是否可用:" + AiWebSocketManager.getInstance().isCanUseAi());
        if (AiWebSocketManager.getInstance().isCanUseAi()) {
            this.f18323e = ImageUtils.saveImage(this, bArr, "AiChat_" + System.currentTimeMillis() + ".jpg");
            C14131vk c14131vk = new C14131vk();
            c14131vk.f91476b = 1002;
            c14131vk.f91479e = this.f18323e;
            zgb.defaultCenter().publish(c14131vk);
            String strEncodeImageToBase64 = ImageUtils.encodeImageToBase64(bArr);
            this.f18325m = strEncodeImageToBase64;
            if (TextUtils.isEmpty(strEncodeImageToBase64)) {
                return;
            }
            AiWebSocketManager.getInstance().sendPhotoMsg(this.f18324f, this.f18325m);
            if (TextUtils.isEmpty(this.f18323e)) {
                return;
            }
            AiChatMessage aiChatMessage = new AiChatMessage();
            aiChatMessage.setMessageTime(System.currentTimeMillis());
            aiChatMessage.setMsgType(1002);
            aiChatMessage.setImagePath(this.f18323e);
            this.f18320b.insert(aiChatMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(d94 d94Var) {
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAlarm$2(List list) {
        C2473f.m4168e("EyevueAiService", "尝试再次设置闹钟:::" + list.size());
        setAlarm(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPermissionDialog$3(List list) {
        kn1 kn1Var = this.f18316C;
        if (kn1Var != null) {
            kn1Var.dismiss();
            this.f18316C = null;
        }
        kn1 kn1Var2 = new kn1(C2468a.getTopActivity(), new C2673c());
        this.f18316C = kn1Var2;
        if (kn1Var2.isShowing()) {
            return;
        }
        this.f18316C.show();
        C2475h.permission(xnc.f98588M, xnc.f98589N).callback(new C2674d(list)).request();
    }

    public static String saveByteToPCMFile(byte[] bytes, String mp3Filepath, boolean isAppend) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(mp3Filepath);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, isAppend);
                try {
                    fileOutputStream2.write(bytes);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    String absolutePath = fileByPath.getAbsolutePath();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarm(final List<AiCommandBean.QueryDescDTO> queryDesc) {
        if (queryDesc == null || queryDesc.isEmpty()) {
            return;
        }
        AlarmManager alarmManager = (AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null && Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
            intent.setData(Uri.parse("package:" + getPackageName()));
            if (C2468a.getTopActivity() != null) {
                C2468a.getTopActivity().startActivity(intent);
                C2478k.runOnUiThreadDelayed(new Runnable() { // from class: uk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f88225a.lambda$setAlarm$2(queryDesc);
                    }
                }, 8000L);
                return;
            }
        }
        for (AiCommandBean.QueryDescDTO queryDescDTO : queryDesc) {
            String content = queryDescDTO.getContent();
            String time = queryDescDTO.getTime();
            long jConvertToTimestamp = nn1.convertToTimestamp(time);
            zi9.m26852e("EyevueAiService", "闹钟意图:" + content + "   时间:" + time + "   时间戳:" + jConvertToTimestamp);
            C5372em.setAlarm(this, -1, 0L, jConvertToTimestamp, 0, content, true, 0L, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPermissionDialog(final List<AiCommandBean.QueryDescDTO> queryDesc, String cmd) {
        C2478k.runOnUiThread(new Runnable() { // from class: vk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f91501a.lambda$showPermissionDialog$3(queryDesc);
            }
        });
    }

    public String getOutputPath() {
        File file = new File(BaseApplication.getInstance().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/tts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // android.app.Service
    @hib
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f18320b = AiChatMessageDatabase.getDatabase(this).messageDao();
        this.f18322d = OpusBridge.createDecoder(16000, 1);
        AiWebSocketManager.getInstance().startSocket(this, i00.f45345R, i00.f45346S);
        zgb.defaultCenter().subscriber(d94.class, this.f18317F);
        initListener();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(d94.class, this.f18317F);
        AiWebSocketManager.getInstance().unRegisterAsrDataListener();
        AiWebSocketManager.getInstance().release();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        return 1;
    }

    public void processAudioData(byte[] newData) {
        int i = 0;
        while (true) {
            int i2 = i + 40;
            if (i2 > newData.length) {
                return;
            }
            int iDecode = OpusBridge.decode(this.f18322d, Arrays.copyOfRange(newData, i, i2), this.f18321c);
            if (iDecode > 0) {
                AiWebSocketManager.getInstance().send(shortsToBytesWithByteBuffer(Arrays.copyOf(this.f18321c, iDecode), ByteOrder.LITTLE_ENDIAN));
            }
            i = i2;
        }
    }

    public byte[] shortsToBytesWithByteBuffer(short[] shortArray, ByteOrder byteOrder) {
        if (shortArray == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(shortArray.length * 2);
        byteBufferAllocate.order(byteOrder);
        for (short s : shortArray) {
            byteBufferAllocate.putShort(s);
        }
        return byteBufferAllocate.array();
    }
}
