package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rb0 {

    /* JADX INFO: renamed from: c */
    public static final String f77636c = "AtomicFile";

    /* JADX INFO: renamed from: a */
    public final File f77637a;

    /* JADX INFO: renamed from: b */
    public final File f77638b;

    /* JADX INFO: renamed from: rb0$a */
    public static final class C11988a extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final FileOutputStream f77639a;

        /* JADX INFO: renamed from: b */
        public boolean f77640b = false;

        public C11988a(File file) throws FileNotFoundException {
            this.f77639a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f77640b) {
                return;
            }
            this.f77640b = true;
            flush();
            try {
                this.f77639a.getFD().sync();
            } catch (IOException e) {
                xh9.m25149w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f77639a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f77639a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f77639a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f77639a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f77639a.write(bArr, i, i2);
        }
    }

    public rb0(File file) {
        this.f77637a = file;
        this.f77638b = new File(file.getPath() + ".bak");
    }

    private void restoreBackup() {
        if (this.f77638b.exists()) {
            this.f77637a.delete();
            this.f77638b.renameTo(this.f77637a);
        }
    }

    public void delete() {
        this.f77637a.delete();
        this.f77638b.delete();
    }

    public void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f77638b.delete();
    }

    public boolean exists() {
        return this.f77637a.exists() || this.f77638b.exists();
    }

    public InputStream openRead() throws FileNotFoundException {
        restoreBackup();
        return new FileInputStream(this.f77637a);
    }

    public OutputStream startWrite() throws IOException {
        if (this.f77637a.exists()) {
            if (this.f77638b.exists()) {
                this.f77637a.delete();
            } else if (!this.f77637a.renameTo(this.f77638b)) {
                xh9.m25148w("AtomicFile", "Couldn't rename file " + this.f77637a + " to backup file " + this.f77638b);
            }
        }
        try {
            return new C11988a(this.f77637a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f77637a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f77637a, e);
            }
            try {
                return new C11988a(this.f77637a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f77637a, e2);
            }
        }
    }
}
