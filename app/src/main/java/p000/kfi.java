package p000;

import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import p000.qt5;

/* JADX INFO: loaded from: classes7.dex */
public class kfi {

    /* JADX INFO: renamed from: a */
    public static final String f53995a = "VoiceNoteUploadUtils";

    private kfi() {
    }

    public static String startFileUpload(qt5 qt5Var, File file, String str, Map<String, String> map) {
        if (qt5Var == null || file == null || !file.exists() || !file.isFile() || TextUtils.isEmpty(str)) {
            return null;
        }
        String strAddUploadTask = qt5Var.addUploadTask(new qt5.C11688g(file, str, map, null, false));
        StringBuilder sb = new StringBuilder();
        sb.append("Added upload task : ");
        sb.append(strAddUploadTask);
        return strAddUploadTask;
    }
}
