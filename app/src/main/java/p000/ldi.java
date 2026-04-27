package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import p000.n93;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ldi implements peg {

    /* JADX INFO: renamed from: e */
    public static final int f57289e = 2;

    /* JADX INFO: renamed from: f */
    public static final String f57290f = "VobsubParser";

    /* JADX INFO: renamed from: g */
    public static final int f57291g = 5000000;

    /* JADX INFO: renamed from: a */
    public final jhc f57292a = new jhc();

    /* JADX INFO: renamed from: b */
    public final jhc f57293b = new jhc();

    /* JADX INFO: renamed from: c */
    public final C8778b f57294c;

    /* JADX INFO: renamed from: d */
    @hib
    public Inflater f57295d;

    /* JADX INFO: renamed from: ldi$b */
    public static final class C8778b {

        /* JADX INFO: renamed from: j */
        public static final int f57296j = 0;

        /* JADX INFO: renamed from: k */
        public static final int f57297k = 1;

        /* JADX INFO: renamed from: l */
        public static final int f57298l = 2;

        /* JADX INFO: renamed from: m */
        public static final int f57299m = 3;

        /* JADX INFO: renamed from: n */
        public static final int f57300n = 4;

        /* JADX INFO: renamed from: o */
        public static final int f57301o = 5;

        /* JADX INFO: renamed from: p */
        public static final int f57302p = 6;

        /* JADX INFO: renamed from: q */
        public static final int f57303q = 255;

        /* JADX INFO: renamed from: b */
        public boolean f57305b;

        /* JADX INFO: renamed from: c */
        public boolean f57306c;

        /* JADX INFO: renamed from: d */
        public int[] f57307d;

        /* JADX INFO: renamed from: e */
        public int f57308e;

        /* JADX INFO: renamed from: f */
        public int f57309f;

        /* JADX INFO: renamed from: g */
        @hib
        public Rect f57310g;

        /* JADX INFO: renamed from: a */
        public final int[] f57304a = new int[4];

        /* JADX INFO: renamed from: h */
        public int f57311h = -1;

        /* JADX INFO: renamed from: i */
        public int f57312i = -1;

        /* JADX INFO: renamed from: ldi$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public int f57313a;

            /* JADX INFO: renamed from: b */
            public int f57314b;

            private a() {
            }
        }

        private static int getColor(int[] iArr, int i) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        private static int parseColor(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void parseControl(int[] iArr, jhc jhcVar, int i) {
            while (jhcVar.getPosition() < i && jhcVar.bytesLeft() > 0) {
                switch (jhcVar.readUnsignedByte()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!parseControlColors(iArr, jhcVar)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!parseControlAlpha(jhcVar)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!parseControlArea(jhcVar)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!parseControlOffsets(jhcVar)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean parseControlAlpha(jhc jhcVar) {
            if (jhcVar.bytesLeft() < 2 || !this.f57306c) {
                return false;
            }
            int unsignedByte = jhcVar.readUnsignedByte();
            int unsignedByte2 = jhcVar.readUnsignedByte();
            int[] iArr = this.f57304a;
            iArr[3] = setAlpha(iArr[3], unsignedByte >> 4);
            int[] iArr2 = this.f57304a;
            iArr2[2] = setAlpha(iArr2[2], unsignedByte & 15);
            int[] iArr3 = this.f57304a;
            iArr3[1] = setAlpha(iArr3[1], unsignedByte2 >> 4);
            int[] iArr4 = this.f57304a;
            iArr4[0] = setAlpha(iArr4[0], unsignedByte2 & 15);
            return true;
        }

        private boolean parseControlArea(jhc jhcVar) {
            if (jhcVar.bytesLeft() < 6) {
                return false;
            }
            int unsignedByte = jhcVar.readUnsignedByte();
            int unsignedByte2 = jhcVar.readUnsignedByte();
            int i = (unsignedByte << 4) | (unsignedByte2 >> 4);
            int unsignedByte3 = ((unsignedByte2 & 15) << 8) | jhcVar.readUnsignedByte();
            int unsignedByte4 = jhcVar.readUnsignedByte();
            int unsignedByte5 = jhcVar.readUnsignedByte();
            this.f57310g = new Rect(i, (unsignedByte4 << 4) | (unsignedByte5 >> 4), unsignedByte3 + 1, (jhcVar.readUnsignedByte() | ((unsignedByte5 & 15) << 8)) + 1);
            return true;
        }

        private boolean parseControlColors(int[] iArr, jhc jhcVar) {
            if (jhcVar.bytesLeft() < 2) {
                return false;
            }
            int unsignedByte = jhcVar.readUnsignedByte();
            int unsignedByte2 = jhcVar.readUnsignedByte();
            this.f57304a[3] = getColor(iArr, unsignedByte >> 4);
            this.f57304a[2] = getColor(iArr, unsignedByte & 15);
            this.f57304a[1] = getColor(iArr, unsignedByte2 >> 4);
            this.f57304a[0] = getColor(iArr, unsignedByte2 & 15);
            this.f57306c = true;
            return true;
        }

        private boolean parseControlOffsets(jhc jhcVar) {
            if (jhcVar.bytesLeft() < 4) {
                return false;
            }
            this.f57311h = jhcVar.readUnsignedShort();
            this.f57312i = jhcVar.readUnsignedShort();
            return true;
        }

        private void parseRleData(hhc hhcVar, boolean z, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i = !z ? 1 : 0;
            int i2 = i * iWidth;
            a aVar = new a();
            while (true) {
                int i3 = 0;
                do {
                    parseRun(hhcVar, iWidth, aVar);
                    int iMin = Math.min(aVar.f57314b, iWidth - i3);
                    if (iMin > 0) {
                        int i4 = i2 + iMin;
                        Arrays.fill(iArr, i2, i4, this.f57304a[aVar.f57313a]);
                        i3 += iMin;
                        i2 = i4;
                    }
                } while (i3 < iWidth);
                i += 2;
                if (i >= iHeight) {
                    return;
                }
                i2 = i * iWidth;
                hhcVar.byteAlign();
            }
        }

        private static void parseRun(hhc hhcVar, int i, a aVar) {
            int bits = 0;
            for (int i2 = 1; bits < i2 && i2 <= 64; i2 <<= 2) {
                if (hhcVar.bitsLeft() < 4) {
                    aVar.f57313a = -1;
                    aVar.f57314b = 0;
                    return;
                }
                bits = (bits << 4) | hhcVar.readBits(4);
            }
            aVar.f57313a = bits & 3;
            if (bits >= 4) {
                i = bits >> 2;
            }
            aVar.f57314b = i;
        }

        private static int setAlpha(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        @hib
        public n93 build(jhc jhcVar) {
            Rect rect;
            if (this.f57307d == null || !this.f57305b || !this.f57306c || (rect = this.f57310g) == null || this.f57311h == -1 || this.f57312i == -1 || rect.width() < 2 || this.f57310g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f57310g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            hhc hhcVar = new hhc();
            jhcVar.setPosition(this.f57311h);
            hhcVar.reset(jhcVar);
            parseRleData(hhcVar, true, rect2, iArr);
            jhcVar.setPosition(this.f57312i);
            hhcVar.reset(jhcVar);
            parseRleData(hhcVar, false, rect2, iArr);
            return new n93.C9750c().setBitmap(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).setPosition(rect2.left / this.f57308e).setPositionAnchor(0).setLine(rect2.top / this.f57309f, 0).setLineAnchor(0).setSize(rect2.width() / this.f57308e).setBitmapHeight(rect2.height() / this.f57309f).build();
        }

        public void parseIdx(String str) {
            for (String str2 : t0i.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrSplit = t0i.split(str2.substring(9), ",");
                    this.f57307d = new int[strArrSplit.length];
                    for (int i = 0; i < strArrSplit.length; i++) {
                        this.f57307d[i] = parseColor(strArrSplit[i].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrSplit2 = t0i.split(str2.substring(6).trim(), "x");
                    if (strArrSplit2.length == 2) {
                        try {
                            this.f57308e = Integer.parseInt(strArrSplit2[0]);
                            this.f57309f = Integer.parseInt(strArrSplit2[1]);
                            this.f57305b = true;
                        } catch (RuntimeException e) {
                            xh9.m25149w(ldi.f57290f, "Parsing IDX failed", e);
                        }
                    }
                }
            }
        }

        public void parseSpu(jhc jhcVar) {
            int[] iArr = this.f57307d;
            if (iArr == null || !this.f57305b) {
                return;
            }
            jhcVar.skipBytes(jhcVar.readUnsignedShort() - 2);
            parseControl(iArr, jhcVar, jhcVar.readUnsignedShort());
        }

        public void reset() {
            this.f57306c = false;
            this.f57310g = null;
            this.f57311h = -1;
            this.f57312i = -1;
        }
    }

    public ldi(List<byte[]> list) {
        C8778b c8778b = new C8778b();
        this.f57294c = c8778b;
        c8778b.parseIdx(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        this.f57292a.reset(bArr, i2 + i);
        this.f57292a.setPosition(i);
        n93 n93Var = parse();
        qu2Var.accept(new ba3(n93Var != null ? kx7.m15111of(n93Var) : kx7.m15110of(), -9223372036854775807L, 5000000L));
    }

    @hib
    private n93 parse() {
        if (this.f57295d == null) {
            this.f57295d = new Inflater();
        }
        if (t0i.maybeInflate(this.f57292a, this.f57293b, this.f57295d)) {
            this.f57292a.reset(this.f57293b.getData(), this.f57293b.limit());
        }
        this.f57294c.reset();
        int iBytesLeft = this.f57292a.bytesLeft();
        if (iBytesLeft < 2 || this.f57292a.readUnsignedShort() != iBytesLeft) {
            return null;
        }
        this.f57294c.parseSpu(this.f57292a);
        return this.f57294c.build(this.f57292a);
    }
}
