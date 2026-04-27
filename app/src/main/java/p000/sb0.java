package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class sb0 {

    /* JADX INFO: renamed from: c */
    public static final String f81102c = "AtomicFile";

    /* JADX INFO: renamed from: a */
    public final File f81103a;

    /* JADX INFO: renamed from: b */
    public final File f81104b;

    /* JADX INFO: renamed from: sb0$a */
    public static final class C12503a extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final FileOutputStream f81105a;

        /* JADX INFO: renamed from: b */
        public boolean f81106b = false;

        public C12503a(File file) throws FileNotFoundException {
            this.f81105a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f81106b) {
                return;
            }
            this.f81106b = true;
            flush();
            try {
                this.f81105a.getFD().sync();
            } catch (IOException e) {
                yh9.m25920w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f81105a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f81105a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f81105a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f81105a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f81105a.write(bArr, i, i2);
        }
    }

    public sb0(File file) {
        this.f81103a = file;
        this.f81104b = new File(file.getPath() + ".bak");
    }

    private void restoreBackup() {
        if (this.f81104b.exists()) {
            this.f81103a.delete();
            this.f81104b.renameTo(this.f81103a);
        }
    }

    public void delete() {
        this.f81103a.delete();
        this.f81104b.delete();
    }

    public void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f81104b.delete();
    }

    public boolean exists() {
        return this.f81103a.exists() || this.f81104b.exists();
    }

    public InputStream openRead() throws FileNotFoundException {
        restoreBackup();
        return new FileInputStream(this.f81103a);
    }

    public OutputStream startWrite() throws IOException {
        if (this.f81103a.exists()) {
            if (this.f81104b.exists()) {
                this.f81103a.delete();
            } else if (!this.f81103a.renameTo(this.f81104b)) {
                yh9.m25919w("AtomicFile", "Couldn't rename file " + this.f81103a + " to backup file " + this.f81104b);
            }
        }
        try {
            return new C12503a(this.f81103a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f81103a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f81103a, e);
            }
            try {
                return new C12503a(this.f81103a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f81103a, e2);
            }
        }
    }
}
