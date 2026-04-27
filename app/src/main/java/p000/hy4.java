package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class hy4 extends gy4.AbstractC6647b {

    /* JADX INFO: renamed from: m */
    public final jy4 f45218m;

    public hy4(final boolean bigEndian, final jy4 parser) throws IOException {
        this.f41792a = bigEndian;
        this.f45218m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f41793b = parser.m14379c(byteBufferAllocate, 16L);
        this.f41794c = parser.m14382f(byteBufferAllocate, 28L);
        this.f41795d = parser.m14382f(byteBufferAllocate, 32L);
        this.f41796e = parser.m14379c(byteBufferAllocate, 42L);
        this.f41797f = parser.m14379c(byteBufferAllocate, 44L);
        this.f41798g = parser.m14379c(byteBufferAllocate, 46L);
        this.f41799h = parser.m14379c(byteBufferAllocate, 48L);
        this.f41800i = parser.m14379c(byteBufferAllocate, 50L);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6646a getDynamicStructure(final long baseOffset, final int index) throws IOException {
        return new vt4(this.f45218m, this, baseOffset, index);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6648c getProgramHeader(final long index) throws IOException {
        return new fed(this.f45218m, this, index);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6649d getSectionHeader(final int index) throws IOException {
        return new rte(this.f45218m, this, index);
    }
}
