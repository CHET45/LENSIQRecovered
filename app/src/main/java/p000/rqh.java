package p000;

import java.nio.ByteBuffer;
import java.util.UUID;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "UUIDUtil")
@p7e({p7e.EnumC10826a.f69936c})
public final class rqh {
    @yfb
    public static final UUID convertByteToUUID(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    @yfb
    public static final byte[] convertUUIDToByte(@yfb UUID uuid) {
        md8.checkNotNullParameter(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        md8.checkNotNullExpressionValue(bArrArray, "buffer.array()");
        return bArrArray;
    }
}
