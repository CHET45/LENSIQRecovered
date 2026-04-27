package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes8.dex */
public class cq0 {

    /* JADX INFO: renamed from: a */
    public static final int f26747a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f26748b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f26749c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f26750d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f26751e = 16;

    /* JADX INFO: renamed from: f */
    public static final int f26752f = 32;

    /* JADX INFO: renamed from: g */
    public static final int f26753g = 76;

    /* JADX INFO: renamed from: h */
    public static final byte f26754h = 61;

    /* JADX INFO: renamed from: i */
    public static final byte f26755i = 10;

    /* JADX INFO: renamed from: j */
    public static final String f26756j = "US-ASCII";

    /* JADX INFO: renamed from: k */
    public static final byte f26757k = -5;

    /* JADX INFO: renamed from: l */
    public static final byte[] f26758l = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 75, 76, 77, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, 83, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, 88, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, 100, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, 103, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, 113, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 120, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, 48, 49, 50, 51, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, 43, 47};

    /* JADX INFO: renamed from: m */
    public static final byte[] f26759m = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, -9, 63, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: n */
    public static final byte[] f26760n = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 75, 76, 77, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, 83, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, 88, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, 100, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, 103, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, 113, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 120, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, 48, 49, 50, 51, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, 45, BuiltinOptions.NonMaxSuppressionV4Options};

    /* JADX INFO: renamed from: o */
    public static final byte[] f26761o = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: p */
    public static final byte[] f26762p = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 75, 76, 77, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, 83, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, 88, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, 100, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, 103, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, 113, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 120, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options};

    /* JADX INFO: renamed from: q */
    public static final byte[] f26763q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.LogicalAndOptions, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f26764r = false;

    /* JADX INFO: renamed from: cq0$a */
    public static class C4459a extends FilterOutputStream {

        /* JADX INFO: renamed from: C */
        public boolean f26765C;

        /* JADX INFO: renamed from: F */
        public int f26766F;

        /* JADX INFO: renamed from: H */
        public byte[] f26767H;

        /* JADX INFO: renamed from: a */
        public boolean f26768a;

        /* JADX INFO: renamed from: b */
        public int f26769b;

        /* JADX INFO: renamed from: c */
        public byte[] f26770c;

        /* JADX INFO: renamed from: d */
        public int f26771d;

        /* JADX INFO: renamed from: e */
        public int f26772e;

        /* JADX INFO: renamed from: f */
        public boolean f26773f;

        /* JADX INFO: renamed from: m */
        public byte[] f26774m;

        public C4459a(OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            flushBase64();
            super.close();
            this.f26770c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() throws IOException {
            int i = this.f26769b;
            if (i > 0) {
                if (!this.f26768a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(cq0.encode3to4(this.f26774m, this.f26770c, i, this.f26766F));
                this.f26769b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.f26765C) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (!this.f26768a) {
                byte b = this.f26767H[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f26770c;
                int i2 = this.f26769b;
                int i3 = i2 + 1;
                this.f26769b = i3;
                bArr[i2] = (byte) i;
                if (i3 >= this.f26771d) {
                    ((FilterOutputStream) this).out.write(this.f26774m, 0, cq0.decode4to3(bArr, 0, this.f26774m, 0, this.f26766F));
                    this.f26769b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f26770c;
            int i4 = this.f26769b;
            int i5 = i4 + 1;
            this.f26769b = i5;
            bArr2[i4] = (byte) i;
            int i6 = this.f26771d;
            if (i5 >= i6) {
                ((FilterOutputStream) this).out.write(cq0.encode3to4(this.f26774m, bArr2, i6, this.f26766F));
                int i7 = this.f26772e + 4;
                this.f26772e = i7;
                if (this.f26773f && i7 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f26772e = 0;
                }
                this.f26769b = 0;
            }
        }

        public C4459a(OutputStream outputStream, int i) {
            super(outputStream);
            this.f26773f = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.f26768a = z;
            int i2 = z ? 3 : 4;
            this.f26771d = i2;
            this.f26770c = new byte[i2];
            this.f26769b = 0;
            this.f26772e = 0;
            this.f26765C = false;
            this.f26774m = new byte[4];
            this.f26766F = i;
            this.f26767H = cq0.getDecodabet(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f26765C) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    private cq0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        }
        byte[] decodabet = getDecodabet(i3);
        byte b = bArr[i + 2];
        if (b == 61) {
            bArr2[i2] = (byte) ((((decodabet[bArr[i + 1]] & 255) << 12) | ((decodabet[bArr[i]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b2 = bArr[i4];
        if (b2 == 61) {
            int i6 = ((decodabet[bArr[i + 1]] & 255) << 12) | ((decodabet[bArr[i]] & 255) << 18) | ((decodabet[b] & 255) << 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = ((decodabet[bArr[i + 1]] & 255) << 12) | ((decodabet[bArr[i]] & 255) << 18) | ((decodabet[b] & 255) << 6) | (decodabet[b2] & 255);
        bArr2[i2] = (byte) (i7 >> 16);
        bArr2[i2 + 1] = (byte) (i7 >> 8);
        bArr2[i5] = (byte) i7;
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i, int i2) {
        encode3to4(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encodeBytesToBytes(byte[] r18, int r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cq0.encodeBytesToBytes(byte[], int, int, int):byte[]");
    }

    private static final byte[] getAlphabet(int i) {
        return (i & 16) == 16 ? f26760n : (i & 32) == 32 ? f26762p : f26758l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDecodabet(int i) {
        return (i & 16) == 16 ? f26761o : (i & 32) == 32 ? f26763q : f26759m;
    }

    private static byte[] encode3to4(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] alphabet = getAlphabet(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = alphabet[i5 >>> 18];
            bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = alphabet[i5 >>> 18];
            bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = alphabet[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = alphabet[i5 >>> 18];
        bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = alphabet[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = alphabet[i5 & 63];
        return bArr2;
    }

    public static String encodeBytes(byte[] bArr, int i, int i2, int i3) throws Throwable {
        byte[] bArrEncodeBytesToBytes = encodeBytesToBytes(bArr, i, i2, i3);
        try {
            return new String(bArrEncodeBytesToBytes, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrEncodeBytesToBytes);
        }
    }
}
