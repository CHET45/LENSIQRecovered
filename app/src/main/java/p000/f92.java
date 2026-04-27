package p000;

import android.os.Bundle;
import java.util.Arrays;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f92 implements gh1 {

    /* JADX INFO: renamed from: a */
    public final int f35737a;

    /* JADX INFO: renamed from: b */
    public final int f35738b;

    /* JADX INFO: renamed from: c */
    public final int f35739c;

    /* JADX INFO: renamed from: d */
    @hib
    public final byte[] f35740d;

    /* JADX INFO: renamed from: e */
    public int f35741e;

    /* JADX INFO: renamed from: f */
    public static final f92 f35735f = new f92(1, 2, 3, null);

    /* JADX INFO: renamed from: m */
    public static final f92 f35736m = new C5680b().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();

    /* JADX INFO: renamed from: C */
    public static final String f35730C = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: F */
    public static final String f35731F = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: H */
    public static final String f35732H = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: L */
    public static final String f35733L = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: M */
    public static final gh1.InterfaceC6311a<f92> f35734M = new gh1.InterfaceC6311a() { // from class: d92
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return f92.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: f92$b */
    public static final class C5680b {

        /* JADX INFO: renamed from: a */
        public int f35742a;

        /* JADX INFO: renamed from: b */
        public int f35743b;

        /* JADX INFO: renamed from: c */
        public int f35744c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f35745d;

        public f92 build() {
            return new f92(this.f35742a, this.f35743b, this.f35744c, this.f35745d);
        }

        @op1
        public C5680b setColorRange(int i) {
            this.f35743b = i;
            return this;
        }

        @op1
        public C5680b setColorSpace(int i) {
            this.f35742a = i;
            return this;
        }

        @op1
        public C5680b setColorTransfer(int i) {
            this.f35744c = i;
            return this;
        }

        @op1
        public C5680b setHdrStaticInfo(@hib byte[] bArr) {
            this.f35745d = bArr;
            return this;
        }

        public C5680b() {
            this.f35742a = -1;
            this.f35743b = -1;
            this.f35744c = -1;
        }

        private C5680b(f92 f92Var) {
            this.f35742a = f92Var.f35737a;
            this.f35743b = f92Var.f35738b;
            this.f35744c = f92Var.f35739c;
            this.f35745d = f92Var.f35740d;
        }
    }

    @Deprecated
    public f92(int i, int i2, int i3, @hib byte[] bArr) {
        this.f35737a = i;
        this.f35738b = i2;
        this.f35739c = i3;
        this.f35740d = bArr;
    }

    private static String colorRangeToString(int i) {
        return i != -1 ? i != 1 ? i != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String colorSpaceToString(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String colorTransferToString(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean isTransferHdr(@hib f92 f92Var) {
        int i;
        return f92Var != null && ((i = f92Var.f35739c) == 7 || i == 6);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f92 lambda$static$0(Bundle bundle) {
        return new f92(bundle.getInt(f35730C, -1), bundle.getInt(f35731F, -1), bundle.getInt(f35732H, -1), bundle.getByteArray(f35733L));
    }

    public C5680b buildUpon() {
        return new C5680b();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f92.class != obj.getClass()) {
            return false;
        }
        f92 f92Var = (f92) obj;
        return this.f35737a == f92Var.f35737a && this.f35738b == f92Var.f35738b && this.f35739c == f92Var.f35739c && Arrays.equals(this.f35740d, f92Var.f35740d);
    }

    public int hashCode() {
        if (this.f35741e == 0) {
            this.f35741e = ((((((527 + this.f35737a) * 31) + this.f35738b) * 31) + this.f35739c) * 31) + Arrays.hashCode(this.f35740d);
        }
        return this.f35741e;
    }

    public boolean isValid() {
        return (this.f35737a == -1 || this.f35738b == -1 || this.f35739c == -1) ? false : true;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f35730C, this.f35737a);
        bundle.putInt(f35731F, this.f35738b);
        bundle.putInt(f35732H, this.f35739c);
        bundle.putByteArray(f35733L, this.f35740d);
        return bundle;
    }

    public String toLogString() {
        return !isValid() ? "NA" : x0i.formatInvariant("%s/%s/%s", colorSpaceToString(this.f35737a), colorRangeToString(this.f35738b), colorTransferToString(this.f35739c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(colorSpaceToString(this.f35737a));
        sb.append(", ");
        sb.append(colorRangeToString(this.f35738b));
        sb.append(", ");
        sb.append(colorTransferToString(this.f35739c));
        sb.append(", ");
        sb.append(this.f35740d != null);
        sb.append(c0b.f15434d);
        return sb.toString();
    }
}
