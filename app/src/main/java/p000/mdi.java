package p000;

import android.content.Context;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class mdi {

    /* JADX INFO: renamed from: a */
    public static Map<String, Integer> f60718a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static VoiceNotesDao f60719b = null;

    /* JADX INFO: renamed from: c */
    public static final String f60720c = "VoiceConvertUtils";

    /* JADX INFO: renamed from: mdi$a */
    public class C9321a implements FFmpegSessionCompleteCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9323c f60721a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f60722b;

        public C9321a(InterfaceC9323c interfaceC9323c, String str) {
            this.f60721a = interfaceC9323c;
            this.f60722b = str;
        }

        @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
        public void apply(FFmpegSession fFmpegSession) {
            if (fFmpegSession.getReturnCode().isValueSuccess()) {
                InterfaceC9323c interfaceC9323c = this.f60721a;
                if (interfaceC9323c != null) {
                    interfaceC9323c.onSuccess(this.f60722b);
                    return;
                }
                return;
            }
            InterfaceC9323c interfaceC9323c2 = this.f60721a;
            if (interfaceC9323c2 != null) {
                interfaceC9323c2.onFail();
            }
        }
    }

    /* JADX INFO: renamed from: mdi$b */
    public class C9322b implements FFmpegSessionCompleteCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60723a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f60724b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f60725c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC9323c f60726d;

        public C9322b(String str, long j, String str2, InterfaceC9323c interfaceC9323c) {
            this.f60723a = str;
            this.f60724b = j;
            this.f60725c = str2;
            this.f60726d = interfaceC9323c;
        }

        @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
        public void apply(FFmpegSession fFmpegSession) {
            if (!fFmpegSession.getReturnCode().isValueSuccess()) {
                mdi.f60718a.put(this.f60723a, 2);
                InterfaceC9323c interfaceC9323c = this.f60726d;
                if (interfaceC9323c != null) {
                    interfaceC9323c.onFail();
                    return;
                }
                return;
            }
            mdi.f60718a.put(this.f60723a, 1);
            VoiceNotesBean voiceNotesBeanFindByMid = mdi.f60719b.findByMid(this.f60724b);
            voiceNotesBeanFindByMid.setRecordPath(this.f60725c);
            mdi.f60719b.updateMeetInfo(voiceNotesBeanFindByMid);
            InterfaceC9323c interfaceC9323c2 = this.f60726d;
            if (interfaceC9323c2 != null) {
                interfaceC9323c2.onSuccess(this.f60725c);
            }
        }
    }

    /* JADX INFO: renamed from: mdi$c */
    public interface InterfaceC9323c {
        void onFail();

        void onSuccess(String str);
    }

    public static void convertPCMToMP3(Context context, long j, String str, String str2, int i, InterfaceC9323c interfaceC9323c) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isFile() && file.length() != 0) {
            File file2 = new File(str2);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            f60719b = VoiceNotesDatabase.getDatabase(context).messageDao();
            f60718a.put(str, -1);
            FFmpegKit.executeAsync(String.format("-y -f s16le -ar %d -ac 1 -i %s %s", Integer.valueOf(i), str, str2), new C9322b(str, j, str2, interfaceC9323c));
        }
    }

    public static void convertWavToMp3(String str, String str2, InterfaceC9323c interfaceC9323c) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isFile() && file.length() != 0) {
            File file2 = new File(str2);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            FFmpegKit.executeAsync(String.format(Locale.US, "-i \"%s\" -b:a 64k \"%s\"", str.replace("\" ", "\\\" "), str2.replace("\" ", "\\\" ")), new C9321a(interfaceC9323c, str2));
        }
    }

    public static boolean isConverting(String str) {
        Integer num = f60718a.get(str);
        return num != null && num.intValue() == -1;
    }
}
