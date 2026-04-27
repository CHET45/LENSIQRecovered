package p000;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class ebb {

    /* JADX INFO: renamed from: a */
    @efb
    public final qo9 f32535a;

    public ebb(@efb qo9 qo9Var) {
        this.f32535a = qo9Var;
    }

    private static String filenameForUrl(String str, ts5 ts5Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? ts5Var.tempExtension() : ts5Var.f85705a);
        return sb.toString();
    }

    @hib
    private File getCachedFile(String str) throws FileNotFoundException {
        File file = new File(parentDir(), filenameForUrl(str, ts5.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(parentDir(), filenameForUrl(str, ts5.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File parentDir() {
        File cacheDir = this.f32535a.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    @xqi
    @hib
    /* JADX INFO: renamed from: a */
    public Pair<ts5, InputStream> m9854a(String str) {
        try {
            File cachedFile = getCachedFile(str);
            if (cachedFile == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(cachedFile);
            ts5 ts5Var = cachedFile.getAbsolutePath().endsWith(zyb.f106510h) ? ts5.ZIP : ts5.JSON;
            dj9.debug("Cache hit for " + str + " at " + cachedFile.getAbsolutePath());
            return new Pair<>(ts5Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9855b(String str, ts5 ts5Var) {
        File file = new File(parentDir(), filenameForUrl(str, ts5Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        dj9.debug("Copying temp file to real file (" + file2 + c0b.f15434d);
        if (zRenameTo) {
            return;
        }
        dj9.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: renamed from: c */
    public File m9856c(String str, InputStream inputStream, ts5 ts5Var) throws IOException {
        File file = new File(parentDir(), filenameForUrl(str, ts5Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void clear() {
        File fileParentDir = parentDir();
        if (fileParentDir.exists()) {
            File[] fileArrListFiles = fileParentDir.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileParentDir.listFiles()) {
                    file.delete();
                }
            }
            fileParentDir.delete();
        }
    }
}
