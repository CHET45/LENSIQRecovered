package p000;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class p45 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final String f69629a = "unknown";

    /* JADX INFO: renamed from: p45$a */
    @c5e(21)
    public static class C10789a {
        private C10789a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m19265a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private p45() {
    }

    @efb
    public static String getStorageState(@efb File file) {
        return C10789a.m19265a(file);
    }
}
