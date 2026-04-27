package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class do7 extends IOException {

    /* JADX INFO: renamed from: b */
    public static final int f30266b = -1;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final int f30267a;

    public do7(int i) {
        this("Http request failed", i);
    }

    public int getStatusCode() {
        return this.f30267a;
    }

    @Deprecated
    public do7(String str) {
        this(str, -1);
    }

    public do7(String str, int i) {
        this(str, i, null);
    }

    public do7(String str, int i, @hib Throwable th) {
        super(str + ", status code: " + i, th);
        this.f30267a = i;
    }
}
