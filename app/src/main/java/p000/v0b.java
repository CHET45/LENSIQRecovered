package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class v0b implements gh3 {

    /* JADX INFO: renamed from: g */
    public static final String f89618g = "Mp3PlayerThread";

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<byte[]> f89619b;

    /* JADX INFO: renamed from: c */
    public boolean f89620c = false;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f89621d = null;

    /* JADX INFO: renamed from: e */
    public volatile int f89622e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f89623f = false;

    public v0b(LinkedBlockingQueue<byte[]> linkedBlockingQueue) {
        if (linkedBlockingQueue == null) {
            throw new IllegalArgumentException("audioQueue cannot be null");
        }
        this.f89619b = linkedBlockingQueue;
    }

    @Override // p000.gh3
    @igg({"UnsafeOptInUsageError"})
    public void addTransferListener(qdh qdhVar) {
    }

    public void clearBuffer() {
        this.f89621d = null;
        this.f89622e = 0;
    }

    @Override // p000.gh3
    @igg({"UnsafeOptInUsageError"})
    public void close() throws IOException {
        this.f89620c = false;
        clearBuffer();
        ji9.m14108d(f89618g, "MP3 DataSource closed");
    }

    @Override // p000.gh3
    @igg({"UnsafeOptInUsageError"})
    public Uri getUri() {
        return Uri.EMPTY;
    }

    public void markStreamEnded() {
        this.f89623f = true;
    }

    @Override // p000.gh3
    @igg({"UnsafeOptInUsageError"})
    public long open(xh3 xh3Var) throws IOException {
        this.f89620c = true;
        this.f89623f = false;
        this.f89621d = null;
        this.f89622e = 0;
        ji9.m14108d(f89618g, "MP3 DataSource opened");
        return -1L;
    }

    @Override // p000.bh3
    @igg({"UnsafeOptInUsageError"})
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f89623f && ((this.f89621d == null || this.f89622e >= this.f89621d.length) && this.f89619b.isEmpty())) {
            ji9.m14108d(f89618g, "Stream ended, returning END_OF_INPUT");
            return -1;
        }
        try {
            if (this.f89621d == null || this.f89622e >= this.f89621d.length) {
                this.f89621d = this.f89619b.poll();
                this.f89622e = 0;
                if (this.f89621d == null) {
                    return 0;
                }
                ji9.m14108d(f89618g, "New MP3 buffer acquired, size: " + this.f89621d.length + " bytes, queue remaining: " + this.f89619b.size());
            }
            int iMin = Math.min(i2, this.f89621d.length - this.f89622e);
            if (iMin > 0) {
                System.arraycopy(this.f89621d, this.f89622e, bArr, i, iMin);
                this.f89622e += iMin;
            }
            return iMin;
        } catch (Exception e) {
            ji9.m14109e(f89618g, "Error reading MP3 data: " + e.getMessage());
            return -1;
        }
    }
}
