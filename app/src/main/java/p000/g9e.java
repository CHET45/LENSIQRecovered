package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g9e extends BufferedOutputStream {

    /* JADX INFO: renamed from: a */
    public boolean f39061a;

    public g9e(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f39061a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            t0i.sneakyThrow(th);
        }
    }

    public void reset(OutputStream outputStream) {
        v80.checkState(this.f39061a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f39061a = false;
    }

    public g9e(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
