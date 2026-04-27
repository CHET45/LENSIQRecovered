package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "MultiProcessCoordinatorKt")
public final class b3b {
    @yfb
    public static final m98 createMultiProcessCoordinator(@yfb e13 e13Var, @yfb File file) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(file, "file");
        return new a3b(e13Var, file);
    }
}
