package p000;

import android.media.MediaParser$SeekableInputReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@c5e(30)
@igg({"Override"})
@Deprecated
public final class c48 implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a */
    @hib
    public ah3 f15760a;

    /* JADX INFO: renamed from: b */
    public long f15761b;

    /* JADX INFO: renamed from: c */
    public long f15762c;

    /* JADX INFO: renamed from: d */
    public long f15763d;

    public long getAndResetSeekPosition() {
        long j = this.f15763d;
        this.f15763d = -1L;
        return j;
    }

    public long getLength() {
        return this.f15761b;
    }

    public long getPosition() {
        return this.f15762c;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((ah3) x0i.castNonNull(this.f15760a)).read(bArr, i, i2);
        this.f15762c += (long) i3;
        return i3;
    }

    public void seekToPosition(long j) {
        this.f15763d = j;
    }

    public void setCurrentPosition(long j) {
        this.f15762c = j;
    }

    public void setDataReader(ah3 ah3Var, long j) {
        this.f15760a = ah3Var;
        this.f15761b = j;
        this.f15763d = -1L;
    }
}
