package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class wt4 extends gy4.AbstractC6646a {
    public wt4(final jy4 parser, final gy4.AbstractC6647b header, long baseOffset, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f41792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j = baseOffset + ((long) (index * 16));
        this.f41787a = parser.m14380d(byteBufferAllocate, j);
        this.f41788b = parser.m14380d(byteBufferAllocate, j + 8);
    }
}
