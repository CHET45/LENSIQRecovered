package p000;

import android.media.MediaParser$SeekableInputReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@c5e(30)
@ovh
public final class d48 implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a */
    @hib
    public bh3 f28390a;

    /* JADX INFO: renamed from: b */
    public long f28391b;

    /* JADX INFO: renamed from: c */
    public long f28392c;

    /* JADX INFO: renamed from: d */
    public long f28393d;

    public long getAndResetSeekPosition() {
        long j = this.f28393d;
        this.f28393d = -1L;
        return j;
    }

    public long getLength() {
        return this.f28391b;
    }

    public long getPosition() {
        return this.f28392c;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((bh3) t0i.castNonNull(this.f28390a)).read(bArr, i, i2);
        this.f28392c += (long) i3;
        return i3;
    }

    public void seekToPosition(long j) {
        this.f28393d = j;
    }

    public void setCurrentPosition(long j) {
        this.f28392c = j;
    }

    public void setDataReader(bh3 bh3Var, long j) {
        this.f28390a = bh3Var;
        this.f28391b = j;
        this.f28393d = -1L;
    }
}
