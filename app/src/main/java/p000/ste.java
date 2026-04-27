package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class ste extends gy4.AbstractC6649d {
    public ste(final jy4 parser, final gy4.AbstractC6647b header, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f41792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f41807a = parser.m14382f(byteBufferAllocate, header.f41795d + ((long) (index * header.f41798g)) + 44);
    }
}
