package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p000.qm4;

/* JADX INFO: loaded from: classes6.dex */
public class dn4 implements qm4 {

    /* JADX INFO: renamed from: a */
    @efb
    public final FileChannel f30182a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ParcelFileDescriptor f30183b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BufferedOutputStream f30184c;

    /* JADX INFO: renamed from: d */
    @efb
    public final FileOutputStream f30185d;

    /* JADX INFO: renamed from: dn4$a */
    public static class C4876a implements qm4.InterfaceC11553a {
        @Override // p000.qm4.InterfaceC11553a
        public qm4 create(Context context, File file, int i) throws FileNotFoundException {
            return new dn4(context, Uri.fromFile(file), i);
        }

        @Override // p000.qm4.InterfaceC11553a
        public boolean supportSeek() {
            return true;
        }

        @Override // p000.qm4.InterfaceC11553a
        public qm4 create(Context context, Uri uri, int i) throws FileNotFoundException {
            return new dn4(context, uri, i);
        }
    }

    public dn4(Context context, Uri uri, int i) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new FileNotFoundException("result of " + uri + " is null!");
        }
        this.f30183b = parcelFileDescriptorOpenFileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        this.f30185d = fileOutputStream;
        this.f30182a = fileOutputStream.getChannel();
        this.f30184c = new BufferedOutputStream(fileOutputStream, i);
    }

    @Override // p000.qm4
    public void close() throws IOException {
        this.f30184c.close();
        this.f30185d.close();
        this.f30183b.close();
    }

    @Override // p000.qm4
    public void flushAndSync() throws IOException {
        this.f30184c.flush();
        this.f30183b.getFileDescriptor().sync();
    }

    @Override // p000.qm4
    public void seek(long j) throws IOException {
        this.f30182a.position(j);
    }

    @Override // p000.qm4
    public void setLength(long j) {
        try {
            Os.posix_fallocate(this.f30183b.getFileDescriptor(), 0L, j);
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                q0i.m19916w("DownloadUriOutputStream", "It can't pre-allocate length(" + j + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th);
                return;
            }
            int i = th.errno;
            if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP) {
                q0i.m19916w("DownloadUriOutputStream", "fallocate() not supported; falling back to ftruncate()");
                try {
                    Os.ftruncate(this.f30183b.getFileDescriptor(), j);
                } catch (Throwable th2) {
                    q0i.m19916w("DownloadUriOutputStream", "It can't pre-allocate length(" + j + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th2);
                }
            }
        }
    }

    @Override // p000.qm4
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f30184c.write(bArr, i, i2);
    }

    public dn4(@efb FileChannel fileChannel, @efb ParcelFileDescriptor parcelFileDescriptor, @efb FileOutputStream fileOutputStream, @efb BufferedOutputStream bufferedOutputStream) {
        this.f30182a = fileChannel;
        this.f30183b = parcelFileDescriptor;
        this.f30185d = fileOutputStream;
        this.f30184c = bufferedOutputStream;
    }
}
