package p000;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
public final class m00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final m00 f59516a = new m00();

    private m00() {
    }

    public final boolean move(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "srcFile");
        md8.checkNotNullParameter(file2, "dstFile");
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
