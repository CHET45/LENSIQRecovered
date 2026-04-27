package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class zx6 {
    /* JADX INFO: renamed from: a */
    private static String m27124a(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return "";
        }
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isDirectory()) {
                String strM27124a = m27124a(fileArrListFiles[i], str);
                if (!strM27124a.isEmpty()) {
                    return strM27124a;
                }
            } else if (fileArrListFiles[i].getName().equals(str)) {
                return fileArrListFiles[i].getPath();
            }
        }
        return "";
    }

    public static String getFilePath(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        return m27124a(new File(context.getFilesDir().toString() + "/aikit_resources/"), str);
    }
}
