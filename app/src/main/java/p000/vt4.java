package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class vt4 extends gy4.AbstractC6646a {
    public vt4(final jy4 parser, final gy4.AbstractC6647b header, long baseOffset, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(header.f41792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j = baseOffset + ((long) (index * 8));
        this.f41787a = parser.m14382f(byteBufferAllocate, j);
        this.f41788b = parser.m14382f(byteBufferAllocate, j + 4);
    }
}
