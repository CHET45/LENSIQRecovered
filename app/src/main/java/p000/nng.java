package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public final class nng implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final nng f65123a = new nng();

    private nng() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        tnc.stopTask();
    }
}
