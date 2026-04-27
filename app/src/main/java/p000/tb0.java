package p000;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class tb0 {

    /* JADX INFO: renamed from: d */
    public static final String f84133d = "AtomicFile";

    /* JADX INFO: renamed from: a */
    public final File f84134a;

    /* JADX INFO: renamed from: b */
    public final File f84135b;

    /* JADX INFO: renamed from: c */
    public final File f84136c;

    public tb0(@efb File file) {
        this.f84134a = file;
        this.f84135b = new File(file.getPath() + ".new");
        this.f84136c = new File(file.getPath() + ".bak");
    }

    private static void rename(@efb File file, @efb File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    private static boolean sync(@efb FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.f84134a.delete();
        this.f84135b.delete();
        this.f84136c.delete();
    }

    public void failWrite(@hib FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (this.f84135b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f84135b);
    }

    public void finishWrite(@hib FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        rename(this.f84135b, this.f84134a);
    }

    @efb
    public File getBaseFile() {
        return this.f84134a;
    }

    @efb
    public FileInputStream openRead() throws FileNotFoundException {
        if (this.f84136c.exists()) {
            rename(this.f84136c, this.f84134a);
        }
        if (this.f84135b.exists() && this.f84134a.exists() && !this.f84135b.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + this.f84135b);
        }
        return new FileInputStream(this.f84134a);
    }

    @efb
    public byte[] readFully() throws IOException {
        FileInputStream fileInputStreamOpenRead = openRead();
        try {
            byte[] bArr = new byte[fileInputStreamOpenRead.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamOpenRead.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStreamOpenRead.available();
                if (iAvailable > bArr.length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamOpenRead.close();
        }
    }

    @efb
    public FileOutputStream startWrite() throws IOException {
        if (this.f84136c.exists()) {
            rename(this.f84136c, this.f84134a);
        }
        try {
            return new FileOutputStream(this.f84135b);
        } catch (FileNotFoundException unused) {
            if (!this.f84135b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f84135b);
            }
            try {
                return new FileOutputStream(this.f84135b);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.f84135b, e);
            }
        }
    }
}
