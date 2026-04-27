package p000;

import java.io.File;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C2207c6 extends lt5 {
    public /* synthetic */ C2207c6(File file, File file2, String str, int i, jt3 jt3Var) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2207c6(@yfb File file, @gib File file2, @gib String str) {
        super(file, file2, str);
        md8.checkNotNullParameter(file, "file");
    }
}
