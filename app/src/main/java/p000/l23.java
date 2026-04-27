package p000;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class l23 {
    public static String getMP3Path(Context context, long startTime) {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(startTime));
        File file = new File(context.getExternalFilesDir(null), amc.f2088w);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator + str + ".mp3";
    }
}
