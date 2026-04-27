package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wzb {

    /* JADX INFO: renamed from: d */
    public static final int f95853d = 22;

    /* JADX INFO: renamed from: e */
    public static final int f95854e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f95855f = 28;

    /* JADX INFO: renamed from: g */
    public static final int f95856g = 0;

    /* JADX INFO: renamed from: h */
    public static final byte[] f95857h = {BuiltinOptions.SplitVOptions, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, k95.f53246s7, -9, 1, 19, BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ScatterNdOptions, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f95858i = {BuiltinOptions.SplitVOptions, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, BuiltinOptions.ReverseSequenceOptions, 83, 1, 16, BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.ScatterNdOptions, 103, BuiltinOptions.BucketizeOptions, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f95859a = if0.f46718a;

    /* JADX INFO: renamed from: c */
    public int f95861c = 0;

    /* JADX INFO: renamed from: b */
    public int f95860b = 2;

    private ByteBuffer packetizeInternal(ByteBuffer byteBuffer, @hib byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int length = i3 + 27 + i2;
        if (this.f95860b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f95857h.length;
            length += f95858i.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        if (this.f95860b == 2) {
            if (bArr != null) {
                writeOggIdHeaderPage(byteBufferReplaceOutputBuffer, bArr);
            } else {
                byteBufferReplaceOutputBuffer.put(f95857h);
            }
            byteBufferReplaceOutputBuffer.put(f95858i);
        }
        int packetAudioSampleCount = this.f95861c + l7c.parsePacketAudioSampleCount(byteBuffer);
        this.f95861c = packetAudioSampleCount;
        writeOggPacketHeader(byteBufferReplaceOutputBuffer, packetAudioSampleCount, this.f95860b, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferReplaceOutputBuffer.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferReplaceOutputBuffer.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
        if (this.f95860b == 2) {
            byte[] bArrArray = byteBufferReplaceOutputBuffer.array();
            int iArrayOffset = byteBufferReplaceOutputBuffer.arrayOffset() + i;
            byte[] bArr2 = f95858i;
            byteBufferReplaceOutputBuffer.putInt(i + bArr2.length + 22, x0i.crc32(bArrArray, iArrayOffset + bArr2.length, byteBufferReplaceOutputBuffer.limit() - byteBufferReplaceOutputBuffer.position(), 0));
        } else {
            byteBufferReplaceOutputBuffer.putInt(22, x0i.crc32(byteBufferReplaceOutputBuffer.array(), byteBufferReplaceOutputBuffer.arrayOffset(), byteBufferReplaceOutputBuffer.limit() - byteBufferReplaceOutputBuffer.position(), 0));
        }
        this.f95860b++;
        return byteBufferReplaceOutputBuffer;
    }

    private ByteBuffer replaceOutputBuffer(int i) {
        if (this.f95859a.capacity() < i) {
            this.f95859a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f95859a.clear();
        }
        return this.f95859a;
    }

    private void writeOggIdHeaderPage(ByteBuffer byteBuffer, byte[] bArr) {
        writeOggPacketHeader(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(hvh.checkedCast(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, x0i.crc32(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void writeOggPacketHeader(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put(BuiltinOptions.SplitVOptions);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(hvh.checkedCast(i2));
    }

    public void packetize(sl3 sl3Var, List<byte[]> list) {
        u80.checkNotNull(sl3Var.f82162d);
        if (sl3Var.f82162d.limit() - sl3Var.f82162d.position() == 0) {
            return;
        }
        this.f95859a = packetizeInternal(sl3Var.f82162d, (this.f95860b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        sl3Var.clear();
        sl3Var.ensureSpaceForWrite(this.f95859a.remaining());
        sl3Var.f82162d.put(this.f95859a);
        sl3Var.flip();
    }

    public void reset() {
        this.f95859a = if0.f46718a;
        this.f95861c = 0;
        this.f95860b = 2;
    }
}
