package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f9e extends BufferedOutputStream {

    /* JADX INFO: renamed from: a */
    public boolean f35791a;

    public f9e(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f35791a = true;
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
            x0i.sneakyThrow(th);
        }
    }

    public void reset(OutputStream outputStream) {
        u80.checkState(this.f35791a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f35791a = false;
    }

    public f9e(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
