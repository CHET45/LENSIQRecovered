package p000;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
@ovh
public class xea extends wq0 {

    /* JADX INFO: renamed from: f */
    public final MediaDataSource f97593f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f97594g;

    /* JADX INFO: renamed from: h */
    public long f97595h;

    /* JADX INFO: renamed from: i */
    public long f97596i;

    /* JADX INFO: renamed from: j */
    public boolean f97597j;

    public xea(MediaDataSource mediaDataSource, boolean z) {
        super(z);
        this.f97593f = mediaDataSource;
    }

    @Override // p000.gh3
    public void close() throws IOException {
        this.f97594g = null;
        if (this.f97597j) {
            this.f97597j = false;
            m24715c();
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f97594g;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        this.f97594g = xh3Var.f97800a;
        this.f97595h = xh3Var.f97806g;
        m24716d(xh3Var);
        if (this.f97593f.getSize() != -1 && this.f97595h > this.f97593f.getSize()) {
            throw new sh3(2008);
        }
        if (this.f97593f.getSize() == -1) {
            this.f97596i = -1L;
        } else {
            this.f97596i = this.f97593f.getSize() - this.f97595h;
        }
        long jMin = xh3Var.f97807h;
        if (jMin != -1) {
            long j = this.f97596i;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            this.f97596i = jMin;
        }
        this.f97597j = true;
        m24717e(xh3Var);
        long j2 = xh3Var.f97807h;
        return j2 != -1 ? j2 : this.f97596i;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws sh3 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f97596i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int at = this.f97593f.readAt(this.f97595h, bArr, i, i2);
            if (at == -1) {
                return -1;
            }
            long j2 = at;
            this.f97595h += j2;
            long j3 = this.f97596i;
            if (j3 != -1) {
                this.f97596i = j3 - j2;
            }
            m24714b(at);
            return at;
        } catch (IOException e) {
            throw new sh3(e, 2000);
        }
    }
}
