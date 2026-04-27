package p000;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class qj1 {

    /* JADX INFO: renamed from: qj1$b */
    public final class C11491b extends gw1 {

        /* JADX INFO: renamed from: a */
        public final Charset f74563a;

        @Override // p000.gw1
        public Writer openStream() throws IOException {
            return new OutputStreamWriter(qj1.this.openStream(), this.f74563a);
        }

        public String toString() {
            return qj1.this.toString() + ".asCharSink(" + this.f74563a + c0b.f15434d;
        }

        private C11491b(Charset charset) {
            this.f74563a = (Charset) v7d.checkNotNull(charset);
        }
    }

    public gw1 asCharSink(Charset charset) {
        return new C11491b(charset);
    }

    public OutputStream openBufferedStream() throws IOException {
        OutputStream outputStreamOpenStream = openStream();
        return outputStreamOpenStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamOpenStream : new BufferedOutputStream(outputStreamOpenStream);
    }

    public abstract OutputStream openStream() throws IOException;

    public void write(byte[] bytes) throws IOException {
        v7d.checkNotNull(bytes);
        try {
            OutputStream outputStream = (OutputStream) d62.create().register(openStream());
            outputStream.write(bytes);
            outputStream.flush();
        } finally {
        }
    }

    @op1
    public long writeFrom(InputStream input) throws IOException {
        v7d.checkNotNull(input);
        try {
            OutputStream outputStream = (OutputStream) d62.create().register(openStream());
            long jCopy = tj1.copy(input, outputStream);
            outputStream.flush();
            return jCopy;
        } finally {
        }
    }
}
