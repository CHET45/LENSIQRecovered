package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class y23 {

    /* JADX INFO: renamed from: d */
    public static final String f100125d = "aqs.";

    /* JADX INFO: renamed from: e */
    public static final FilenameFilter f100126e = new FilenameFilter() { // from class: w23
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return y23.lambda$static$0(file, str);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final Comparator<File> f100127f = new Comparator() { // from class: x23
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y23.lambda$static$1((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public final kt5 f100128a;

    /* JADX INFO: renamed from: b */
    @hib
    public String f100129b = null;

    /* JADX INFO: renamed from: c */
    @hib
    public String f100130c = null;

    public y23(kt5 kt5Var) {
        this.f100128a = kt5Var;
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: c */
    public static String m25630c(kt5 kt5Var, @efb String str) {
        List<File> sessionFiles = kt5Var.getSessionFiles(str, f100126e);
        if (!sessionFiles.isEmpty()) {
            return ((File) Collections.min(sessionFiles, f100127f)).getName().substring(4);
        }
        ej9.getLogger().m10069w("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(File file, String str) {
        return str.startsWith(f100125d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void persist(kt5 kt5Var, @hib String str, @hib String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            kt5Var.getSessionFile(str, f100125d + str2).createNewFile();
        } catch (IOException e) {
            ej9.getLogger().m10070w("Failed to persist App Quality Sessions session id.", e);
        }
    }

    @hib
    public synchronized String getAppQualitySessionId(@efb String str) {
        if (Objects.equals(this.f100129b, str)) {
            return this.f100130c;
        }
        return m25630c(this.f100128a, str);
    }

    public synchronized void rotateAppQualitySessionId(@efb String str) {
        if (!Objects.equals(this.f100130c, str)) {
            persist(this.f100128a, this.f100129b, str);
            this.f100130c = str;
        }
    }

    public synchronized void rotateSessionId(@hib String str) {
        if (!Objects.equals(this.f100129b, str)) {
            persist(this.f100128a, str, this.f100130c);
            this.f100129b = str;
        }
    }
}
