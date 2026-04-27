package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.watchfun.voicenotes.C4297R;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class l9f {

    /* JADX INFO: renamed from: a */
    public static final int f56919a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f56920b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f56921c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f56922d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f56923e = 5;

    public static void checkPermissionAndShareFile(Activity activity, int i, byte[] bArr, String str) throws Throwable {
        if (Build.VERSION.SDK_INT < 33) {
            toShareFile(activity, i, bArr, str);
        } else {
            toShareFile(activity, i, bArr, str);
        }
    }

    public static void doShare(Context context, int i, String str, String str2, String str3, String str4) {
        shareFile(context, str2, i, str3, str4);
    }

    private static String getAudioMimeType(String str) {
        if (str == null) {
            return "audio/*";
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".mp3") ? "audio/mpeg" : lowerCase.endsWith(".wav") ? "audio/wav" : lowerCase.endsWith(".ogg") ? "audio/ogg" : lowerCase.endsWith(".aac") ? "audio/aac" : lowerCase.endsWith(".flac") ? "audio/flac" : lowerCase.endsWith(".pcm") ? "audio/x-pcm" : "audio/*";
    }

    public static void shareFile(Context context, String str, int i, String str2, String str3) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            Intent intent = new Intent("android.intent.action.SEND");
            if (i == 2) {
                intent.setType("application/octet-stream");
            } else if (i == 3) {
                intent.setType("application/msword");
            } else if (i == 1) {
                intent.setType("text/plain");
            } else if (i == 4) {
                intent.setType("image/jpeg");
            } else if (i == 5) {
                intent.setType(getAudioMimeType(str));
            }
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file);
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            context.startActivity(Intent.createChooser(intent, str3));
        }
    }

    private static void shareText(String str, Context context, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, str2));
    }

    public static void toShareFile(Context context, int i, byte[] bArr, String str) throws Throwable {
        String str2 = context.getExternalFilesDir("").getAbsolutePath() + File.separator;
        if (TextUtils.isEmpty(str)) {
            String str3 = System.currentTimeMillis() + "";
            if (i == 4) {
                str = str3 + ".jpg";
            } else if (i == 2) {
                str = str3 + ".md";
            } else if (i == 3) {
                str = str3 + ".doc";
            } else if (i == 1) {
                str = str3 + hi9.f43738c;
            } else if (i == 5) {
                str = str3 + ".wav";
            } else {
                str = "";
            }
        }
        String str4 = str2 + str;
        vt5.saveToFileWithBuffer(new File(str4), bArr, 1024);
        doShare(context, i, "", str4, context.getString(C4297R.string.ai_voice_note_share_documemt), context.getString(C4297R.string.ai_voice_note_choose_app_to_share));
    }

    public static void checkPermissionAndShareFile(Activity activity, int i, File file, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            toShareFile(activity, i, file, str);
        } else {
            toShareFile(activity, i, file, str);
        }
    }

    public static void toShareFile(Context context, int i, File file, String str) {
        if (file != null && file.exists() && file.isFile()) {
            doShare(context, i, "", file.getAbsolutePath(), context.getString(C4297R.string.ai_voice_note_share_documemt), context.getString(C4297R.string.ai_voice_note_choose_app_to_share));
        }
    }
}
