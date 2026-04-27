package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class lt5 extends IOException {

    /* JADX INFO: renamed from: a */
    @yfb
    public final File f58688a;

    /* JADX INFO: renamed from: b */
    @gib
    public final File f58689b;

    /* JADX INFO: renamed from: c */
    @gib
    public final String f58690c;

    public /* synthetic */ lt5(File file, File file2, String str, int i, jt3 jt3Var) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    @yfb
    public final File getFile() {
        return this.f58688a;
    }

    @gib
    public final File getOther() {
        return this.f58689b;
    }

    @gib
    public final String getReason() {
        return this.f58690c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt5(@yfb File file, @gib File file2, @gib String str) {
        super(x75.constructMessage(file, file2, str));
        md8.checkNotNullParameter(file, "file");
        this.f58688a = file;
        this.f58689b = file2;
        this.f58690c = str;
    }
}
