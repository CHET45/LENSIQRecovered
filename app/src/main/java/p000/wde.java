package p000;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class wde {

    /* JADX INFO: renamed from: a */
    public static final String f93993a = "GlideRuntimeCompat";

    /* JADX INFO: renamed from: b */
    public static final String f93994b = "cpu[0-9]+";

    /* JADX INFO: renamed from: c */
    public static final String f93995c = "/sys/devices/system/cpu/";

    /* JADX INFO: renamed from: wde$a */
    public class C14562a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pattern f93996a;

        public C14562a(Pattern pattern) {
            this.f93996a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f93996a.matcher(str).matches();
        }
    }

    private wde() {
    }

    /* JADX INFO: renamed from: a */
    public static int m24488a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int getCoreCountPre17() {
        File[] fileArrListFiles;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArrListFiles = new File(f93995c).listFiles(new C14562a(Pattern.compile(f93994b)));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(f93993a, 6)) {
                    Log.e(f93993a, "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                fileArrListFiles = null;
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return Math.max(1, fileArrListFiles != null ? fileArrListFiles.length : 0);
    }
}
