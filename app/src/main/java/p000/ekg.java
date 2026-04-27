package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity;
import com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity;
import com.eyevue.glassapp.view.translate.text.TextTranslateActivity;
import com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity;
import com.watchfun.aichat.ChatGptAiActivity;
import com.watchfun.callvideo.activity.TransVideoActivity;
import com.watchfun.trans.freedomtalk.FreedomTalkActivity;
import com.watchfun.trans.twoear.TransTwoEarAiActivity;
import com.watchfun.transphoto.PhotoTransActivity;
import com.watchfun.voicenotes.VoiceNoteActivity;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public enum ekg {
    GLASSES_PAIR(1, C2531R.string.glasses_pair, null, new InterfaceC5361b() { // from class: ekg.a
        @Override // p000.ekg.InterfaceC5361b
        public void execute(Context context) {
            Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }),
    AI_DIALOG(2, C2531R.string.ai_mode, ChatGptAiActivity.class, null),
    FREEDOM_TALK(3, C2531R.string.trans_freedom_talk, FreedomTalkActivity.class, null),
    TRANSLATOR(4, C2531R.string.trans_phone_tip, TransChatFreelyActivity.class, null),
    PHONE_HEADSET(5, C2531R.string.trans_ear, TransAiActivity.class, null),
    GLASSES_HEADSET(6, C2531R.string.trans_ear_glasses_tip, TransAiActivity.class, null),
    DUAL_EAR(7, C2531R.string.trans_two_ear, TransTwoEarAiActivity.class, null),
    VOICE_NOTE(8, C2531R.string.trans_voice_notes, VoiceNoteActivity.class, null),
    PHOTO_TRANSLATE(9, C2531R.string.trans_photo_tip, PhotoTransActivity.class, null),
    AUDIO_VIDEO(10, C2531R.string.trans_video_or_audio_tip, TransVideoActivity.class, null),
    SIMULTANEOUS(11, C2531R.string.string_realtime_trans_tip, RealTimeTranslationActivity.class, null),
    TEXT_TRANS(12, C2531R.string.trans_text_tip, TextTranslateActivity.class, null);


    /* JADX INFO: renamed from: a */
    public final int f33296a;

    /* JADX INFO: renamed from: b */
    public final int f33297b;

    /* JADX INFO: renamed from: c */
    public final Class<? extends Activity> f33298c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5361b f33299d;

    /* JADX INFO: renamed from: ekg$b */
    public interface InterfaceC5361b {
        void execute(Context context);
    }

    ekg(int id, int description, Class activityClass, InterfaceC5361b action) {
        this.f33296a = id;
        this.f33297b = description;
        this.f33298c = activityClass;
        this.f33299d = action;
    }

    public static ekg fromCode(int code) {
        for (ekg ekgVar : values()) {
            if (ekgVar.getId() == code) {
                return ekgVar;
            }
        }
        throw new IllegalArgumentException("无效的模式代码: " + code);
    }

    public static Class<? extends Activity> getActivityClassByCode(int code) {
        for (ekg ekgVar : values()) {
            if (ekgVar.getId() == code) {
                return ekgVar.getActivityClass();
            }
        }
        throw new IllegalArgumentException("无效的模式代码: " + code);
    }

    public static ekg[] getTabNameModes(Map<ekg, Boolean> visibilityMap) {
        ArrayList arrayList = new ArrayList();
        for (ekg ekgVar : values()) {
            if (Boolean.TRUE.equals(visibilityMap.getOrDefault(ekgVar, Boolean.FALSE))) {
                arrayList.add(ekgVar);
            }
        }
        return (ekg[]) arrayList.toArray(new ekg[0]);
    }

    public void executeAction(Context context) {
        InterfaceC5361b interfaceC5361b = this.f33299d;
        if (interfaceC5361b != null) {
            interfaceC5361b.execute(context);
        }
    }

    public InterfaceC5361b getAction() {
        return this.f33299d;
    }

    public Class<? extends Activity> getActivityClass() {
        return this.f33298c;
    }

    public int getDescription() {
        return this.f33297b;
    }

    public int getId() {
        return this.f33296a;
    }
}
