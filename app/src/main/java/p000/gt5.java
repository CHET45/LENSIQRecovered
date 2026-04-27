package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class gt5 {
    public boolean exists(File file) {
        return file.exists();
    }

    public File get(String str) {
        return new File(str);
    }

    public long length(File file) {
        return file.length();
    }
}
