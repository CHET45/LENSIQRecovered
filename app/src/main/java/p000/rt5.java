package p000;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* JADX INFO: loaded from: classes5.dex */
public class rt5 {

    /* JADX INFO: renamed from: rt5$a */
    @omg(26)
    public static class C12278a {
        private C12278a() {
        }

        public static void delete(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e) {
                throw new IOException("Failed to delete file " + file + ": " + e);
            }
        }
    }

    /* JADX INFO: renamed from: rt5$b */
    public static class C12279b {
        private C12279b() {
        }

        public static void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }

    public static void delete(File file) throws IOException {
        C12278a.delete(file);
    }
}
