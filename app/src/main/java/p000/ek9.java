package p000;

import android.app.Activity;
import com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity;
import com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity;
import com.eyevue.glassapp.view.translate.text.TextTranslateActivity;
import com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity;
import com.watchfun.callvideo.activity.TransVideoActivity;
import com.watchfun.trans.freedomtalk.FreedomTalkActivity;
import com.watchfun.trans.twoear.TransTwoEarAiActivity;
import com.watchfun.transphoto.PhotoTransActivity;
import com.watchfun.voicenotes.VoiceNoteActivityV1;
import com.watchfun.voicenotes.VoiceNoteActivityV2;

/* JADX INFO: loaded from: classes4.dex */
public enum ek9 {
    TRANSLATOR(2, "翻译机页面", TransChatFreelyActivity.class),
    PHONE_HEADSET(3, "手机眼镜模式", TransAiActivity.class),
    DUAL_EAR(4, "双耳模式", TransTwoEarAiActivity.class),
    FREEDOM_TALK(5, "自由说模式", FreedomTalkActivity.class),
    VOICE_NOTE(6, "语音笔记", VoiceNoteActivityV1.class),
    VIDEO_AUDIO_CALL(7, "音视频翻译", TransVideoActivity.class),
    TEXT_TRANS(8, "文本翻译", TextTranslateActivity.class),
    PHOTO_TRANS(9, "拍照翻译", PhotoTransActivity.class),
    REAL_TIME_TRANS(10, "同声传译", RealTimeTranslationActivity.class),
    AI_RECORD(11, "AI录音", VoiceNoteActivityV2.class);


    /* JADX INFO: renamed from: a */
    public final int f33261a;

    /* JADX INFO: renamed from: b */
    public final String f33262b;

    /* JADX INFO: renamed from: c */
    public final Class<? extends Activity> f33263c;

    ek9(int code, String description, Class activityClass) {
        this.f33261a = code;
        this.f33262b = description;
        this.f33263c = activityClass;
    }

    public static ek9 fromCode(int code) {
        for (ek9 ek9Var : values()) {
            if (ek9Var.getCode() == code) {
                return ek9Var;
            }
        }
        throw new IllegalArgumentException("无效的模式代码: " + code);
    }

    public static Class<? extends Activity> getActivityClassByCode(int code) {
        for (ek9 ek9Var : values()) {
            if (ek9Var.getCode() == code) {
                return ek9Var.getActivityClass();
            }
        }
        throw new IllegalArgumentException("无效的模式代码: " + code);
    }

    public Class<? extends Activity> getActivityClass() {
        return this.f33263c;
    }

    public int getCode() {
        return this.f33261a;
    }

    public String getDescription() {
        return this.f33262b;
    }
}
