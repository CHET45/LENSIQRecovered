package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ys5 {
    public static final boolean atomicMoveTo(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "toFile");
        return m00.f59516a.move(file, file2);
    }
}
