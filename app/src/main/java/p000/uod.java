package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class uod {

    /* JADX INFO: renamed from: a */
    public static final byte f88682a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    public static final byte f88683b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: c */
    public static final int f88684c = 22;

    private static String encodeFidBase64UrlSafe(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] getBytesFromUUID(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    @efb
    public String createRandomFid() {
        byte[] bytesFromUUID = getBytesFromUUID(UUID.randomUUID(), new byte[17]);
        byte b = bytesFromUUID[0];
        bytesFromUUID[16] = b;
        bytesFromUUID[0] = (byte) ((b & f88683b) | f88682a);
        return encodeFidBase64UrlSafe(bytesFromUUID);
    }
}
