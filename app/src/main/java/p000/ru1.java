package p000;

import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ru1 extends lq0 {

    /* JADX INFO: renamed from: i */
    @hib
    public int[] f79579i;

    /* JADX INFO: renamed from: j */
    @hib
    public int[] f79580j;

    @Override // p000.lq0
    /* JADX INFO: renamed from: b */
    public void mo3214b() {
        this.f79580j = this.f79579i;
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: d */
    public void mo3216d() {
        this.f79580j = null;
        this.f79579i = null;
    }

    @Override // p000.lq0
    @op1
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        int[] iArr = this.f79579i;
        if (iArr == null) {
            return if0.C7262a.f46719e;
        }
        if (c7262a.f46722c != 2) {
            throw new if0.C7263b(c7262a);
        }
        boolean z = c7262a.f46721b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= c7262a.f46721b) {
                throw new if0.C7263b(c7262a);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new if0.C7262a(c7262a.f46720a, iArr.length, 2) : if0.C7262a.f46719e;
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) u80.checkNotNull(this.f79580j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM16315e = m16315e(((iLimit - iPosition) / this.f58444b.f46723d) * this.f58445c.f46723d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM16315e.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f58444b.f46723d;
        }
        byteBuffer.position(iLimit);
        byteBufferM16315e.flip();
    }

    public void setChannelMap(@hib int[] iArr) {
        this.f79579i = iArr;
    }
}
