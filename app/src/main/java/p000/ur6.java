package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ur6 implements ak5 {

    /* JADX INFO: renamed from: b */
    public final ak5 f88857b;

    public ur6(ak5 ak5Var) {
        this.f88857b = ak5Var;
    }

    @Override // p000.ak5
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.f88857b.advancePeekPosition(i, z);
    }

    @Override // p000.ak5
    public long getLength() {
        return this.f88857b.getLength();
    }

    @Override // p000.ak5
    public long getPeekPosition() {
        return this.f88857b.getPeekPosition();
    }

    @Override // p000.ak5
    public long getPosition() {
        return this.f88857b.getPosition();
    }

    @Override // p000.ak5
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.f88857b.peek(bArr, i, i2);
    }

    @Override // p000.ak5
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f88857b.peekFully(bArr, i, i2, z);
    }

    @Override // p000.ak5, p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f88857b.read(bArr, i, i2);
    }

    @Override // p000.ak5
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f88857b.readFully(bArr, i, i2, z);
    }

    @Override // p000.ak5
    public void resetPeekPosition() {
        this.f88857b.resetPeekPosition();
    }

    @Override // p000.ak5
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.f88857b.setRetryPosition(j, e);
    }

    @Override // p000.ak5
    public int skip(int i) throws IOException {
        return this.f88857b.skip(i);
    }

    @Override // p000.ak5
    public boolean skipFully(int i, boolean z) throws IOException {
        return this.f88857b.skipFully(i, z);
    }

    @Override // p000.ak5
    public void advancePeekPosition(int i) throws IOException {
        this.f88857b.advancePeekPosition(i);
    }

    @Override // p000.ak5
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.f88857b.peekFully(bArr, i, i2);
    }

    @Override // p000.ak5
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f88857b.readFully(bArr, i, i2);
    }

    @Override // p000.ak5
    public void skipFully(int i) throws IOException {
        this.f88857b.skipFully(i);
    }
}
