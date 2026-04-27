package p000;

import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class p1c {
    @yfb
    public static final m98 createSingleProcessCoordinator(@yfb Path path) {
        md8.checkNotNullParameter(path, "path");
        return n98.createSingleProcessCoordinator(path.normalized().toString());
    }
}
