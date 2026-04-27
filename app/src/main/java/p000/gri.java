package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class gri extends Exception {

    /* JADX INFO: renamed from: a */
    public final iii f40875a;

    /* JADX INFO: renamed from: b */
    public final IOException f40876b;

    public gri(iii iiiVar, IOException iOException) {
        this.f40875a = iiiVar;
        this.f40876b = iOException;
    }

    public iii getConnection() {
        return this.f40875a;
    }

    public IOException getIOException() {
        return this.f40876b;
    }
}
