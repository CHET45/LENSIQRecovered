package p000;

import com.iflytek.aikit.core.AiHelper;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,257:1\n257#1:258\n257#1:259\n257#1:260\n257#1:261\n257#1:262\n257#1:263\n257#1:264\n257#1:265\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n119#1:258\n120#1:259\n164#1:260\n165#1:261\n204#1:262\n205#1:263\n251#1:264\n252#1:265\n*E\n"})
public class q1i {
    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final m1i getUuid(@yfb ByteBuffer byteBuffer) {
        md8.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long jReverseBytes = byteBuffer.getLong();
        long jReverseBytes2 = byteBuffer.getLong();
        if (md8.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        return m1i.f59664c.fromLongs(jReverseBytes, jReverseBytes2);
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final ByteBuffer putUuid(@yfb ByteBuffer byteBuffer, @yfb m1i m1iVar) {
        ByteBuffer byteBufferPutLong;
        md8.checkNotNullParameter(byteBuffer, "<this>");
        md8.checkNotNullParameter(m1iVar, "uuid");
        long mostSignificantBits = m1iVar.getMostSignificantBits();
        long leastSignificantBits = m1iVar.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (md8.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            byteBufferPutLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            byteBufferPutLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        md8.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
        return byteBufferPutLong;
    }

    public static final long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    @yfb
    @zh5
    public static final m1i secureRandomUuid() {
        byte[] bArr = new byte[16];
        aue.f11892a.getInstance().nextBytes(bArr);
        return r1i.uuidFromRandomBytes(bArr);
    }

    @yfb
    @zh5
    public static final Object serializedUuid(@yfb m1i m1iVar) {
        md8.checkNotNullParameter(m1iVar, "uuid");
        return new s1i(m1iVar.getMostSignificantBits(), m1iVar.getLeastSignificantBits());
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final UUID toJavaUuid(@yfb m1i m1iVar) {
        md8.checkNotNullParameter(m1iVar, "<this>");
        return new UUID(m1iVar.getMostSignificantBits(), m1iVar.getLeastSignificantBits());
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final m1i toKotlinUuid(@yfb UUID uuid) {
        md8.checkNotNullParameter(uuid, "<this>");
        return m1i.f59664c.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final m1i getUuid(@yfb ByteBuffer byteBuffer, int i) {
        md8.checkNotNullParameter(byteBuffer, "<this>");
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                long jReverseBytes = byteBuffer.getLong(i);
                long jReverseBytes2 = byteBuffer.getLong(i + 8);
                if (md8.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                    jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                }
                return m1i.f59664c.fromLongs(jReverseBytes, jReverseBytes2);
            }
            throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    @zh5
    public static final ByteBuffer putUuid(@yfb ByteBuffer byteBuffer, int i, @yfb m1i m1iVar) {
        ByteBuffer byteBufferPutLong;
        md8.checkNotNullParameter(byteBuffer, "<this>");
        md8.checkNotNullParameter(m1iVar, "uuid");
        long mostSignificantBits = m1iVar.getMostSignificantBits();
        long leastSignificantBits = m1iVar.getLeastSignificantBits();
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                if (md8.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i, mostSignificantBits);
                    byteBufferPutLong = byteBuffer.putLong(i + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i, Long.reverseBytes(mostSignificantBits));
                    byteBufferPutLong = byteBuffer.putLong(i + 8, Long.reverseBytes(leastSignificantBits));
                }
                md8.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
                return byteBufferPutLong;
            }
            throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }
}
