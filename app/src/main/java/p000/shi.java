package p000;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class shi {

    /* JADX INFO: renamed from: a */
    public static final String f81874a = "WavHeaderReader";

    /* JADX INFO: renamed from: b */
    public static final byte[] f81875b = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: c */
    public static final byte[] f81876c = {0, 0, 33, 7, -45, 17, -122, BuiltinOptions.FillOptions, -56, k95.f53222p7, k95.f53280w7, 0, 0, 0};

    /* JADX INFO: renamed from: shi$a */
    public static final class C12598a {

        /* JADX INFO: renamed from: c */
        public static final int f81877c = 8;

        /* JADX INFO: renamed from: a */
        public final int f81878a;

        /* JADX INFO: renamed from: b */
        public final long f81879b;

        private C12598a(int i, long j) {
            this.f81878a = i;
            this.f81879b = j;
        }

        public static C12598a peek(ak5 ak5Var, jhc jhcVar) throws IOException {
            ak5Var.peekFully(jhcVar.getData(), 0, 8);
            jhcVar.setPosition(0);
            return new C12598a(jhcVar.readInt(), jhcVar.readLittleEndianUnsignedInt());
        }
    }

    private shi() {
    }

    public static boolean checkFileType(ak5 ak5Var) throws IOException {
        jhc jhcVar = new jhc(8);
        int i = C12598a.peek(ak5Var, jhcVar).f81878a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ak5Var.peekFully(jhcVar.getData(), 0, 4);
        jhcVar.setPosition(0);
        int i2 = jhcVar.readInt();
        if (i2 == 1463899717) {
            return true;
        }
        xh9.m25144e("WavHeaderReader", "Unsupported form type: " + i2);
        return false;
    }

    public static rhi readFormat(ak5 ak5Var) throws IOException {
        byte[] bArr;
        jhc jhcVar = new jhc(16);
        C12598a c12598aSkipToChunk = skipToChunk(1718449184, ak5Var, jhcVar);
        v80.checkState(c12598aSkipToChunk.f81879b >= 16);
        ak5Var.peekFully(jhcVar.getData(), 0, 16);
        jhcVar.setPosition(0);
        int littleEndianUnsignedShort = jhcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = jhcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = jhcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = jhcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = jhcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = jhcVar.readLittleEndianUnsignedShort();
        int i = ((int) c12598aSkipToChunk.f81879b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            ak5Var.peekFully(bArr2, 0, i);
            if (littleEndianUnsignedShort == 65534 && i == 24) {
                jhc jhcVar2 = new jhc(bArr2);
                jhcVar2.readLittleEndianUnsignedShort();
                int littleEndianUnsignedShort5 = jhcVar2.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort5 != 0 && littleEndianUnsignedShort5 != littleEndianUnsignedShort4) {
                    throw yhc.createForUnsupportedContainerFeature("validBits ( " + littleEndianUnsignedShort5 + ")  != bitsPerSample( " + littleEndianUnsignedShort4 + ") are not supported");
                }
                int littleEndianUnsignedIntToInt3 = jhcVar2.readLittleEndianUnsignedIntToInt();
                if ((littleEndianUnsignedIntToInt3 >> 18) != 0) {
                    throw yhc.createForUnsupportedContainerFeature("invalid channel mask " + littleEndianUnsignedIntToInt3);
                }
                if (littleEndianUnsignedIntToInt3 != 0 && Integer.bitCount(littleEndianUnsignedIntToInt3) != littleEndianUnsignedShort2) {
                    throw yhc.createForUnsupportedContainerFeature("invalid number of channels (" + Integer.bitCount(littleEndianUnsignedIntToInt3) + ") in channel mask " + littleEndianUnsignedIntToInt3);
                }
                littleEndianUnsignedShort = jhcVar2.readLittleEndianUnsignedShort();
                byte[] bArr3 = new byte[14];
                jhcVar2.readBytes(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, f81875b) && !Arrays.equals(bArr3, f81876c)) {
                    throw yhc.createForUnsupportedContainerFeature("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = t0i.f83321f;
        }
        int i2 = littleEndianUnsignedShort;
        ak5Var.skipFully((int) (ak5Var.getPeekPosition() - ak5Var.getPosition()));
        return new rhi(i2, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr);
    }

    public static long readRf64SampleDataSize(ak5 ak5Var) throws IOException {
        jhc jhcVar = new jhc(8);
        C12598a c12598aPeek = C12598a.peek(ak5Var, jhcVar);
        if (c12598aPeek.f81878a != 1685272116) {
            ak5Var.resetPeekPosition();
            return -1L;
        }
        ak5Var.advancePeekPosition(8);
        jhcVar.setPosition(0);
        ak5Var.peekFully(jhcVar.getData(), 0, 8);
        long littleEndianLong = jhcVar.readLittleEndianLong();
        ak5Var.skipFully(((int) c12598aPeek.f81879b) + 8);
        return littleEndianLong;
    }

    private static C12598a skipToChunk(int i, ak5 ak5Var, jhc jhcVar) throws IOException {
        C12598a c12598aPeek = C12598a.peek(ak5Var, jhcVar);
        while (c12598aPeek.f81878a != i) {
            xh9.m25148w("WavHeaderReader", "Ignoring unknown WAV chunk: " + c12598aPeek.f81878a);
            long j = c12598aPeek.f81879b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw yhc.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + c12598aPeek.f81878a);
            }
            ak5Var.skipFully((int) j2);
            c12598aPeek = C12598a.peek(ak5Var, jhcVar);
        }
        return c12598aPeek;
    }

    public static Pair<Long, Long> skipToSampleData(ak5 ak5Var) throws IOException {
        ak5Var.resetPeekPosition();
        C12598a c12598aSkipToChunk = skipToChunk(1684108385, ak5Var, new jhc(8));
        ak5Var.skipFully(8);
        return Pair.create(Long.valueOf(ak5Var.getPosition()), Long.valueOf(c12598aSkipToChunk.f81879b));
    }
}
