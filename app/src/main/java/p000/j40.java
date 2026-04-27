package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public class j40 extends Writer {

    /* JADX INFO: renamed from: a */
    public final Appendable f49494a;

    /* JADX INFO: renamed from: b */
    public boolean f49495b;

    public j40(Appendable target) {
        this.f49494a = (Appendable) v7d.checkNotNull(target);
    }

    private void checkNotClosed() throws IOException {
        if (this.f49495b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f49495b = true;
        Appendable appendable = this.f49494a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        checkNotClosed();
        Appendable appendable = this.f49494a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cbuf, int off, int len) throws IOException {
        checkNotClosed();
        this.f49494a.append(new String(cbuf, off, len));
    }

    @Override // java.io.Writer
    public void write(int c) throws IOException {
        checkNotClosed();
        this.f49494a.append((char) c);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        checkNotClosed();
        this.f49494a.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        v7d.checkNotNull(str);
        checkNotClosed();
        this.f49494a.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@wx1 CharSequence charSeq) throws IOException {
        checkNotClosed();
        this.f49494a.append(charSeq);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@wx1 CharSequence charSeq, int start, int end) throws IOException {
        checkNotClosed();
        this.f49494a.append(charSeq, start, end);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int off, int len) throws IOException {
        v7d.checkNotNull(str);
        checkNotClosed();
        this.f49494a.append(str, off, len + off);
    }
}
