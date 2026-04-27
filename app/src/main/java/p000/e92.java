package p000;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e92 {

    /* JADX INFO: renamed from: h */
    public static final e92 f32165h = new C5196b().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();

    /* JADX INFO: renamed from: i */
    public static final e92 f32166i = new C5196b().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();

    /* JADX INFO: renamed from: j */
    public static final String f32167j = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: k */
    public static final String f32168k = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: l */
    public static final String f32169l = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: m */
    public static final String f32170m = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: n */
    public static final String f32171n = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: o */
    public static final String f32172o = t0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: a */
    public final int f32173a;

    /* JADX INFO: renamed from: b */
    public final int f32174b;

    /* JADX INFO: renamed from: c */
    public final int f32175c;

    /* JADX INFO: renamed from: d */
    @hib
    public final byte[] f32176d;

    /* JADX INFO: renamed from: e */
    public final int f32177e;

    /* JADX INFO: renamed from: f */
    public final int f32178f;

    /* JADX INFO: renamed from: g */
    public int f32179g;

    /* JADX INFO: renamed from: e92$b */
    public static final class C5196b {

        /* JADX INFO: renamed from: a */
        public int f32180a;

        /* JADX INFO: renamed from: b */
        public int f32181b;

        /* JADX INFO: renamed from: c */
        public int f32182c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f32183d;

        /* JADX INFO: renamed from: e */
        public int f32184e;

        /* JADX INFO: renamed from: f */
        public int f32185f;

        public e92 build() {
            return new e92(this.f32180a, this.f32181b, this.f32182c, this.f32183d, this.f32184e, this.f32185f);
        }

        @op1
        public C5196b setChromaBitdepth(int i) {
            this.f32185f = i;
            return this;
        }

        @op1
        public C5196b setColorRange(int i) {
            this.f32181b = i;
            return this;
        }

        @op1
        public C5196b setColorSpace(int i) {
            this.f32180a = i;
            return this;
        }

        @op1
        public C5196b setColorTransfer(int i) {
            this.f32182c = i;
            return this;
        }

        @op1
        public C5196b setHdrStaticInfo(@hib byte[] bArr) {
            this.f32183d = bArr;
            return this;
        }

        @op1
        public C5196b setLumaBitdepth(int i) {
            this.f32184e = i;
            return this;
        }

        public C5196b() {
            this.f32180a = -1;
            this.f32181b = -1;
            this.f32182c = -1;
            this.f32184e = -1;
            this.f32185f = -1;
        }

        private C5196b(e92 e92Var) {
            this.f32180a = e92Var.f32173a;
            this.f32181b = e92Var.f32174b;
            this.f32182c = e92Var.f32175c;
            this.f32183d = e92Var.f32176d;
            this.f32184e = e92Var.f32177e;
            this.f32185f = e92Var.f32178f;
        }
    }

    private static String chromaBitdepthToString(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Chroma";
    }

    private static String colorRangeToString(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    public static int colorSpaceToIsoColorPrimaries(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 6;
    }

    private static String colorSpaceToString(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    public static int colorTransferToIsoTransferCharacteristics(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 6) {
            return 16;
        }
        if (i != 7) {
            return i != 10 ? 1 : 4;
        }
        return 18;
    }

    private static String colorTransferToString(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    public static e92 fromBundle(Bundle bundle) {
        return new e92(bundle.getInt(f32167j, -1), bundle.getInt(f32168k, -1), bundle.getInt(f32169l, -1), bundle.getByteArray(f32170m), bundle.getInt(f32171n, -1), bundle.getInt(f32172o, -1));
    }

    @a35(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(@hib e92 e92Var) {
        int i;
        int i2;
        int i3;
        int i4;
        if (e92Var == null) {
            return true;
        }
        int i5 = e92Var.f32173a;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = e92Var.f32174b) == -1 || i == 2) && (((i2 = e92Var.f32175c) == -1 || i2 == 3) && e92Var.f32176d == null && (((i3 = e92Var.f32178f) == -1 || i3 == 8) && ((i4 = e92Var.f32177e) == -1 || i4 == 8)));
    }

    public static boolean isTransferHdr(@hib e92 e92Var) {
        int i;
        return e92Var != null && ((i = e92Var.f32175c) == 7 || i == 6);
    }

    @bkd
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @bkd
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String lumaBitdepthToString(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Luma";
    }

    public C5196b buildUpon() {
        return new C5196b();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e92.class != obj.getClass()) {
            return false;
        }
        e92 e92Var = (e92) obj;
        return this.f32173a == e92Var.f32173a && this.f32174b == e92Var.f32174b && this.f32175c == e92Var.f32175c && Arrays.equals(this.f32176d, e92Var.f32176d) && this.f32177e == e92Var.f32177e && this.f32178f == e92Var.f32178f;
    }

    public int hashCode() {
        if (this.f32179g == 0) {
            this.f32179g = ((((((((((527 + this.f32173a) * 31) + this.f32174b) * 31) + this.f32175c) * 31) + Arrays.hashCode(this.f32176d)) * 31) + this.f32177e) * 31) + this.f32178f;
        }
        return this.f32179g;
    }

    public boolean isBitdepthValid() {
        return (this.f32177e == -1 || this.f32178f == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.f32173a == -1 || this.f32174b == -1 || this.f32175c == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f32167j, this.f32173a);
        bundle.putInt(f32168k, this.f32174b);
        bundle.putInt(f32169l, this.f32175c);
        bundle.putByteArray(f32170m, this.f32176d);
        bundle.putInt(f32171n, this.f32177e);
        bundle.putInt(f32172o, this.f32178f);
        return bundle;
    }

    public String toLogString() {
        String str;
        String invariant = isDataSpaceValid() ? t0i.formatInvariant("%s/%s/%s", colorSpaceToString(this.f32173a), colorRangeToString(this.f32174b), colorTransferToString(this.f32175c)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.f32177e + pj4.f71071b + this.f32178f;
        } else {
            str = "NA/NA";
        }
        return invariant + pj4.f71071b + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(colorSpaceToString(this.f32173a));
        sb.append(", ");
        sb.append(colorRangeToString(this.f32174b));
        sb.append(", ");
        sb.append(colorTransferToString(this.f32175c));
        sb.append(", ");
        sb.append(this.f32176d != null);
        sb.append(", ");
        sb.append(lumaBitdepthToString(this.f32177e));
        sb.append(", ");
        sb.append(chromaBitdepthToString(this.f32178f));
        sb.append(c0b.f15434d);
        return sb.toString();
    }

    private e92(int i, int i2, int i3, @hib byte[] bArr, int i4, int i5) {
        this.f32173a = i;
        this.f32174b = i2;
        this.f32175c = i3;
        this.f32176d = bArr;
        this.f32177e = i4;
        this.f32178f = i5;
    }
}
