package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@w01
@yg8
public final class js5 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final int f51675a;

    /* JADX INFO: renamed from: b */
    public final boolean f51676b;

    /* JADX INFO: renamed from: c */
    public final rj1 f51677c;

    /* JADX INFO: renamed from: d */
    @uc7("this")
    public OutputStream f51678d;

    /* JADX INFO: renamed from: e */
    @wx1
    @uc7("this")
    public C8049c f51679e;

    /* JADX INFO: renamed from: f */
    @wx1
    @uc7("this")
    public File f51680f;

    /* JADX INFO: renamed from: js5$a */
    public class C8047a extends rj1 {
        public C8047a() {
        }

        public void finalize() {
            try {
                js5.this.reset();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return js5.this.openInputStream();
        }
    }

    /* JADX INFO: renamed from: js5$b */
    public class C8048b extends rj1 {
        public C8048b() {
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return js5.this.openInputStream();
        }
    }

    /* JADX INFO: renamed from: js5$c */
    public static class C8049c extends ByteArrayOutputStream {
        private C8049c() {
        }

        /* JADX INFO: renamed from: a */
        public byte[] m14274a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ C8049c(C8047a c8047a) {
            this();
        }
    }

    public js5(int fileThreshold) {
        this(fileThreshold, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream openInputStream() throws IOException {
        if (this.f51680f != null) {
            return new FileInputStream(this.f51680f);
        }
        Objects.requireNonNull(this.f51679e);
        return new ByteArrayInputStream(this.f51679e.m14274a(), 0, this.f51679e.getCount());
    }

    @uc7("this")
    private void update(int len) throws IOException {
        C8049c c8049c = this.f51679e;
        if (c8049c == null || c8049c.getCount() + len <= this.f51675a) {
            return;
        }
        File fileMo3285b = bog.f14314a.mo3285b("FileBackedOutputStream");
        if (this.f51676b) {
            fileMo3285b.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileMo3285b);
            fileOutputStream.write(this.f51679e.m14274a(), 0, this.f51679e.getCount());
            fileOutputStream.flush();
            this.f51678d = fileOutputStream;
            this.f51680f = fileMo3285b;
            this.f51679e = null;
        } catch (IOException e) {
            fileMo3285b.delete();
            throw e;
        }
    }

    public rj1 asByteSource() {
        return this.f51677c;
    }

    @gdi
    @wx1
    /* JADX INFO: renamed from: b */
    public synchronized File m14273b() {
        return this.f51680f;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f51678d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f51678d.flush();
    }

    public synchronized void reset() throws IOException {
        C8047a c8047a = null;
        try {
            close();
            C8049c c8049c = this.f51679e;
            if (c8049c == null) {
                this.f51679e = new C8049c(c8047a);
            } else {
                c8049c.reset();
            }
            this.f51678d = this.f51679e;
            File file = this.f51680f;
            if (file != null) {
                this.f51680f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } catch (Throwable th) {
            if (this.f51679e == null) {
                this.f51679e = new C8049c(c8047a);
            } else {
                this.f51679e.reset();
            }
            this.f51678d = this.f51679e;
            File file2 = this.f51680f;
            if (file2 != null) {
                this.f51680f = null;
                if (!file2.delete()) {
                    throw new IOException("Could not delete: " + file2);
                }
            }
            throw th;
        } finally {
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int b) throws IOException {
        update(1);
        this.f51678d.write(b);
    }

    public js5(int fileThreshold, boolean resetOnFinalize) {
        v7d.checkArgument(fileThreshold >= 0, "fileThreshold must be non-negative, but was %s", fileThreshold);
        this.f51675a = fileThreshold;
        this.f51676b = resetOnFinalize;
        C8049c c8049c = new C8049c(null);
        this.f51679e = c8049c;
        this.f51678d = c8049c;
        if (resetOnFinalize) {
            this.f51677c = new C8047a();
        } else {
            this.f51677c = new C8048b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b, int off, int len) throws IOException {
        update(len);
        this.f51678d.write(b, off, len);
    }
}
