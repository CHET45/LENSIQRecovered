package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class tr6 implements zj5 {

    /* JADX INFO: renamed from: b */
    public final zj5 f85662b;

    public tr6(zj5 zj5Var) {
        this.f85662b = zj5Var;
    }

    @Override // p000.zj5
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.f85662b.advancePeekPosition(i, z);
    }

    @Override // p000.zj5
    public long getLength() {
        return this.f85662b.getLength();
    }

    @Override // p000.zj5
    public long getPeekPosition() {
        return this.f85662b.getPeekPosition();
    }

    @Override // p000.zj5
    public long getPosition() {
        return this.f85662b.getPosition();
    }

    @Override // p000.zj5
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.f85662b.peek(bArr, i, i2);
    }

    @Override // p000.zj5
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f85662b.peekFully(bArr, i, i2, z);
    }

    @Override // p000.zj5, p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f85662b.read(bArr, i, i2);
    }

    @Override // p000.zj5
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f85662b.readFully(bArr, i, i2, z);
    }

    @Override // p000.zj5
    public void resetPeekPosition() {
        this.f85662b.resetPeekPosition();
    }

    @Override // p000.zj5
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.f85662b.setRetryPosition(j, e);
    }

    @Override // p000.zj5
    public int skip(int i) throws IOException {
        return this.f85662b.skip(i);
    }

    @Override // p000.zj5
    public boolean skipFully(int i, boolean z) throws IOException {
        return this.f85662b.skipFully(i, z);
    }

    @Override // p000.zj5
    public void advancePeekPosition(int i) throws IOException {
        this.f85662b.advancePeekPosition(i);
    }

    @Override // p000.zj5
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.f85662b.peekFully(bArr, i, i2);
    }

    @Override // p000.zj5
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f85662b.readFully(bArr, i, i2);
    }

    @Override // p000.zj5
    public void skipFully(int i) throws IOException {
        this.f85662b.skipFully(i);
    }
}
