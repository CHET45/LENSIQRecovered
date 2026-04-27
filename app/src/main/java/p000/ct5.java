package p000;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class ct5 {
    public static String getMP3Path(Context context, long startTime) {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US).format(new Date(startTime));
        File file = new File(context.getExternalFilesDir(null), amc.f2088w);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator + str + ".mp3";
    }

    public static String getTextPath(Context context, String fileName) {
        File file = new File(context.getExternalFilesDir(null), "textFiles");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator + fileName + hi9.f43738c;
    }

    public static boolean renameFile(String filePath, jbh record) {
        File file = new File(record.getSourceVoicePath());
        return file.exists() && file.renameTo(new File(filePath));
    }

    public static String getMP3Path(Context context, String secondDir, String fileName) {
        StringBuilder sb = new StringBuilder();
        sb.append(amc.f2088w);
        String str = File.separator;
        sb.append(str);
        sb.append(secondDir);
        File file = new File(context.getExternalFilesDir(null), sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + str + fileName + ".mp3";
    }
}
