package p000;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qm1 {

    /* JADX INFO: renamed from: k */
    public static final int f74896k = 131072;

    /* JADX INFO: renamed from: a */
    public final ll1 f74897a;

    /* JADX INFO: renamed from: b */
    public final cl1 f74898b;

    /* JADX INFO: renamed from: c */
    public final xh3 f74899c;

    /* JADX INFO: renamed from: d */
    public final String f74900d;

    /* JADX INFO: renamed from: e */
    public final byte[] f74901e;

    /* JADX INFO: renamed from: f */
    @hib
    public final InterfaceC11548a f74902f;

    /* JADX INFO: renamed from: g */
    public long f74903g;

    /* JADX INFO: renamed from: h */
    public long f74904h;

    /* JADX INFO: renamed from: i */
    public long f74905i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f74906j;

    /* JADX INFO: renamed from: qm1$a */
    public interface InterfaceC11548a {
        void onProgress(long j, long j2, long j3);
    }

    public qm1(ll1 ll1Var, xh3 xh3Var, @hib byte[] bArr, @hib InterfaceC11548a interfaceC11548a) {
        this.f74897a = ll1Var;
        this.f74898b = ll1Var.getCache();
        this.f74899c = xh3Var;
        this.f74901e = bArr == null ? new byte[131072] : bArr;
        this.f74902f = interfaceC11548a;
        this.f74900d = ll1Var.getCacheKeyFactory().buildCacheKey(xh3Var);
        this.f74903g = xh3Var.f97806g;
    }

    private long getLength() {
        long j = this.f74904h;
        if (j == -1) {
            return -1L;
        }
        return j - this.f74899c.f97806g;
    }

    private void onNewBytesCached(long j) {
        this.f74905i += j;
        InterfaceC11548a interfaceC11548a = this.f74902f;
        if (interfaceC11548a != null) {
            interfaceC11548a.onProgress(getLength(), this.f74905i, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.f74904h == j) {
            return;
        }
        this.f74904h = j;
        InterfaceC11548a interfaceC11548a = this.f74902f;
        if (interfaceC11548a != null) {
            interfaceC11548a.onProgress(getLength(), this.f74905i, 0L);
        }
    }

    private long readBlockToCache(long j, long j2) throws Exception {
        long jOpen;
        boolean z = true;
        boolean z2 = j + j2 == this.f74904h || j2 == -1;
        if (j2 != -1) {
            try {
                jOpen = this.f74897a.open(this.f74899c.buildUpon().setPosition(j).setLength(j2).build());
            } catch (Exception unused) {
                wh3.closeQuietly(this.f74897a);
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
                jOpen = this.f74897a.open(this.f74899c.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (Exception e) {
                wh3.closeQuietly(this.f74897a);
                throw e;
            }
        }
        if (z2 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (Exception e2) {
                wh3.closeQuietly(this.f74897a);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            throwIfCanceled();
            ll1 ll1Var = this.f74897a;
            byte[] bArr = this.f74901e;
            i = ll1Var.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i2 += i;
            }
        }
        if (z2) {
            onRequestEndPosition(j + ((long) i2));
        }
        this.f74897a.close();
        return i2;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.f74906j) {
            throw new InterruptedIOException();
        }
    }

    @xqi
    public void cache() throws IOException {
        throwIfCanceled();
        cl1 cl1Var = this.f74898b;
        String str = this.f74900d;
        xh3 xh3Var = this.f74899c;
        this.f74905i = cl1Var.getCachedBytes(str, xh3Var.f97806g, xh3Var.f97807h);
        xh3 xh3Var2 = this.f74899c;
        long j = xh3Var2.f97807h;
        if (j != -1) {
            this.f74904h = xh3Var2.f97806g + j;
        } else {
            long contentLength = pw2.getContentLength(this.f74898b.getContentMetadata(this.f74900d));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.f74904h = contentLength;
        }
        InterfaceC11548a interfaceC11548a = this.f74902f;
        if (interfaceC11548a != null) {
            interfaceC11548a.onProgress(getLength(), this.f74905i, 0L);
        }
        while (true) {
            long j2 = this.f74904h;
            if (j2 != -1 && this.f74903g >= j2) {
                return;
            }
            throwIfCanceled();
            long j3 = this.f74904h;
            long cachedLength = this.f74898b.getCachedLength(this.f74900d, this.f74903g, j3 == -1 ? Long.MAX_VALUE : j3 - this.f74903g);
            if (cachedLength > 0) {
                this.f74903g += cachedLength;
            } else {
                long j4 = -cachedLength;
                if (j4 == Long.MAX_VALUE) {
                    j4 = -1;
                }
                long j5 = this.f74903g;
                this.f74903g = j5 + readBlockToCache(j5, j4);
            }
        }
    }

    public void cancel() {
        this.f74906j = true;
    }
}
