package p000;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class thi {

    /* JADX INFO: renamed from: a */
    public static final String f84898a = "WavHeaderReader";

    /* JADX INFO: renamed from: thi$a */
    public static final class C13054a {

        /* JADX INFO: renamed from: c */
        public static final int f84899c = 8;

        /* JADX INFO: renamed from: a */
        public final int f84900a;

        /* JADX INFO: renamed from: b */
        public final long f84901b;

        private C13054a(int i, long j) {
            this.f84900a = i;
            this.f84901b = j;
        }

        public static C13054a peek(zj5 zj5Var, ihc ihcVar) throws IOException {
            zj5Var.peekFully(ihcVar.getData(), 0, 8);
            ihcVar.setPosition(0);
            return new C13054a(ihcVar.readInt(), ihcVar.readLittleEndianUnsignedInt());
        }
    }

    private thi() {
    }

    public static boolean checkFileType(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(8);
        int i = C13054a.peek(zj5Var, ihcVar).f84900a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zj5Var.peekFully(ihcVar.getData(), 0, 4);
        ihcVar.setPosition(0);
        int i2 = ihcVar.readInt();
        if (i2 == 1463899717) {
            return true;
        }
        yh9.m25915e("WavHeaderReader", "Unsupported form type: " + i2);
        return false;
    }

    public static qhi readFormat(zj5 zj5Var) throws IOException {
        byte[] bArr;
        ihc ihcVar = new ihc(16);
        C13054a c13054aSkipToChunk = skipToChunk(1718449184, zj5Var, ihcVar);
        u80.checkState(c13054aSkipToChunk.f84901b >= 16);
        zj5Var.peekFully(ihcVar.getData(), 0, 16);
        ihcVar.setPosition(0);
        int littleEndianUnsignedShort = ihcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = ihcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = ihcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = ihcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = ihcVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = ihcVar.readLittleEndianUnsignedShort();
        int i = ((int) c13054aSkipToChunk.f84901b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zj5Var.peekFully(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = x0i.f95983f;
        }
        zj5Var.skipFully((int) (zj5Var.getPeekPosition() - zj5Var.getPosition()));
        return new qhi(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr);
    }

    public static long readRf64SampleDataSize(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(8);
        C13054a c13054aPeek = C13054a.peek(zj5Var, ihcVar);
        if (c13054aPeek.f84900a != 1685272116) {
            zj5Var.resetPeekPosition();
            return -1L;
        }
        zj5Var.advancePeekPosition(8);
        ihcVar.setPosition(0);
        zj5Var.peekFully(ihcVar.getData(), 0, 8);
        long littleEndianLong = ihcVar.readLittleEndianLong();
        zj5Var.skipFully(((int) c13054aPeek.f84901b) + 8);
        return littleEndianLong;
    }

    private static C13054a skipToChunk(int i, zj5 zj5Var, ihc ihcVar) throws IOException {
        C13054a c13054aPeek = C13054a.peek(zj5Var, ihcVar);
        while (c13054aPeek.f84900a != i) {
            yh9.m25919w("WavHeaderReader", "Ignoring unknown WAV chunk: " + c13054aPeek.f84900a);
            long j = c13054aPeek.f84901b + 8;
            if (j > 2147483647L) {
                throw xhc.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + c13054aPeek.f84900a);
            }
            zj5Var.skipFully((int) j);
            c13054aPeek = C13054a.peek(zj5Var, ihcVar);
        }
        return c13054aPeek;
    }

    public static Pair<Long, Long> skipToSampleData(zj5 zj5Var) throws IOException {
        zj5Var.resetPeekPosition();
        C13054a c13054aSkipToChunk = skipToChunk(1684108385, zj5Var, new ihc(8));
        zj5Var.skipFully(8);
        return Pair.create(Long.valueOf(zj5Var.getPosition()), Long.valueOf(c13054aSkipToChunk.f84901b));
    }
}
