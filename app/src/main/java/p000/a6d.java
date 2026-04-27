package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class a6d extends IOException {

    /* JADX INFO: renamed from: a */
    public final long f507a;

    /* JADX INFO: renamed from: b */
    public final long f508b;

    public a6d(long j, long j2) {
        super("There is Free space less than Require space: " + j2 + " < " + j);
        this.f507a = j;
        this.f508b = j2;
    }

    public long getFreeSpace() {
        return this.f508b;
    }

    public long getRequireSpace() {
        return this.f507a;
    }
}
