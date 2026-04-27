package p000;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rm1 {

    /* JADX INFO: renamed from: k */
    public static final int f78697k = 131072;

    /* JADX INFO: renamed from: a */
    public final ml1 f78698a;

    /* JADX INFO: renamed from: b */
    public final dl1 f78699b;

    /* JADX INFO: renamed from: c */
    public final yh3 f78700c;

    /* JADX INFO: renamed from: d */
    public final String f78701d;

    /* JADX INFO: renamed from: e */
    public final byte[] f78702e;

    /* JADX INFO: renamed from: f */
    @hib
    public final InterfaceC12151a f78703f;

    /* JADX INFO: renamed from: g */
    public long f78704g;

    /* JADX INFO: renamed from: h */
    public long f78705h;

    /* JADX INFO: renamed from: i */
    public long f78706i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f78707j;

    /* JADX INFO: renamed from: rm1$a */
    public interface InterfaceC12151a {
        void onProgress(long j, long j2, long j3);
    }

    public rm1(ml1 ml1Var, yh3 yh3Var, @hib byte[] bArr, @hib InterfaceC12151a interfaceC12151a) {
        this.f78698a = ml1Var;
        this.f78699b = ml1Var.getCache();
        this.f78700c = yh3Var;
        this.f78702e = bArr == null ? new byte[131072] : bArr;
        this.f78703f = interfaceC12151a;
        this.f78701d = ml1Var.getCacheKeyFactory().buildCacheKey(yh3Var);
        this.f78704g = yh3Var.f101491g;
    }

    private long getLength() {
        long j = this.f78705h;
        if (j == -1) {
            return -1L;
        }
        return j - this.f78700c.f101491g;
    }

    private void onNewBytesCached(long j) {
        this.f78706i += j;
        InterfaceC12151a interfaceC12151a = this.f78703f;
        if (interfaceC12151a != null) {
            interfaceC12151a.onProgress(getLength(), this.f78706i, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.f78705h == j) {
            return;
        }
        this.f78705h = j;
        InterfaceC12151a interfaceC12151a = this.f78703f;
        if (interfaceC12151a != null) {
            interfaceC12151a.onProgress(getLength(), this.f78706i, 0L);
        }
    }

    private long readBlockToCache(long j, long j2) throws IOException {
        long jOpen;
        boolean z = true;
        boolean z2 = j + j2 == this.f78705h || j2 == -1;
        if (j2 != -1) {
            try {
                jOpen = this.f78698a.open(this.f78700c.buildUpon().setPosition(j).setLength(j2).build());
            } catch (IOException unused) {
                vh3.closeQuietly(this.f78698a);
                z = false;
                jOpen = -1;
            }
        } else {
            z = false;
            jOpen = -1;
        }
        if (!z) {
            throwIfCanceled();
            try {
                jOpen = this.f78698a.open(this.f78700c.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (IOException e) {
                vh3.closeQuietly(this.f78698a);
                throw e;
            }
        }
        if (z2 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (IOException e2) {
                vh3.closeQuietly(this.f78698a);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            throwIfCanceled();
            ml1 ml1Var = this.f78698a;
            byte[] bArr = this.f78702e;
            i = ml1Var.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i2 += i;
            }
        }
        if (z2) {
            onRequestEndPosition(j + ((long) i2));
        }
        this.f78698a.close();
        return i2;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.f78707j) {
            throw new InterruptedIOException();
        }
    }

    @xqi
    public void cache() throws IOException {
        throwIfCanceled();
        dl1 dl1Var = this.f78699b;
        String str = this.f78701d;
        yh3 yh3Var = this.f78700c;
        this.f78706i = dl1Var.getCachedBytes(str, yh3Var.f101491g, yh3Var.f101492h);
        yh3 yh3Var2 = this.f78700c;
        long j = yh3Var2.f101492h;
        if (j != -1) {
            this.f78705h = yh3Var2.f101491g + j;
        } else {
            long contentLength = ow2.getContentLength(this.f78699b.getContentMetadata(this.f78701d));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.f78705h = contentLength;
        }
        InterfaceC12151a interfaceC12151a = this.f78703f;
        if (interfaceC12151a != null) {
            interfaceC12151a.onProgress(getLength(), this.f78706i, 0L);
        }
        while (true) {
            long j2 = this.f78705h;
            if (j2 != -1 && this.f78704g >= j2) {
                return;
            }
            throwIfCanceled();
            long j3 = this.f78705h;
            long cachedLength = this.f78699b.getCachedLength(this.f78701d, this.f78704g, j3 == -1 ? Long.MAX_VALUE : j3 - this.f78704g);
            if (cachedLength > 0) {
                this.f78704g += cachedLength;
            } else {
                long j4 = -cachedLength;
                if (j4 == Long.MAX_VALUE) {
                    j4 = -1;
                }
                long j5 = this.f78704g;
                this.f78704g = j5 + readBlockToCache(j5, j4);
            }
        }
    }

    public void cancel() {
        this.f78707j = true;
    }
}
