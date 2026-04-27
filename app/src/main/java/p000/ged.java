package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class ged extends gy4.AbstractC6648c {
    public ged(final jy4 parser, final gy4.AbstractC6647b header, final long index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f41792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j = header.f41794c + (index * ((long) header.f41796e));
        this.f41803a = parser.m14382f(byteBufferAllocate, j);
        this.f41804b = parser.m14380d(byteBufferAllocate, 8 + j);
        this.f41805c = parser.m14380d(byteBufferAllocate, 16 + j);
        this.f41806d = parser.m14380d(byteBufferAllocate, j + 40);
    }
}
