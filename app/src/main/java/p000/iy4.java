package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class iy4 extends gy4.AbstractC6647b {

    /* JADX INFO: renamed from: m */
    public final jy4 f48853m;

    public iy4(final boolean bigEndian, final jy4 parser) throws IOException {
        this.f41792a = bigEndian;
        this.f48853m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f41793b = parser.m14379c(byteBufferAllocate, 16L);
        this.f41794c = parser.m14380d(byteBufferAllocate, 32L);
        this.f41795d = parser.m14380d(byteBufferAllocate, 40L);
        this.f41796e = parser.m14379c(byteBufferAllocate, 54L);
        this.f41797f = parser.m14379c(byteBufferAllocate, 56L);
        this.f41798g = parser.m14379c(byteBufferAllocate, 58L);
        this.f41799h = parser.m14379c(byteBufferAllocate, 60L);
        this.f41800i = parser.m14379c(byteBufferAllocate, 62L);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6646a getDynamicStructure(final long baseOffset, final int index) throws IOException {
        return new wt4(this.f48853m, this, baseOffset, index);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6648c getProgramHeader(final long index) throws IOException {
        return new ged(this.f48853m, this, index);
    }

    @Override // p000.gy4.AbstractC6647b
    public gy4.AbstractC6649d getSectionHeader(final int index) throws IOException {
        return new ste(this.f48853m, this, index);
    }
}
