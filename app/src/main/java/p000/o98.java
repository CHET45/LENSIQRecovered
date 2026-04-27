package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class o98 {
    @yfb
    public static final m98 createSingleProcessCoordinator(@yfb File file) {
        md8.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        md8.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return n98.createSingleProcessCoordinator(absolutePath);
    }
}
