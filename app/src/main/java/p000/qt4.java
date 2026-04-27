package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.n93;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qt4 implements peg {

    /* JADX INFO: renamed from: A */
    public static final byte[] f75585A = {0, 7, 8, 15};

    /* JADX INFO: renamed from: B */
    public static final byte[] f75586B = {0, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -1};

    /* JADX INFO: renamed from: C */
    public static final byte[] f75587C = {0, 17, BuiltinOptions.TopKV2Options, 51, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: h */
    public static final int f75588h = 2;

    /* JADX INFO: renamed from: i */
    public static final String f75589i = "DvbParser";

    /* JADX INFO: renamed from: j */
    public static final int f75590j = 16;

    /* JADX INFO: renamed from: k */
    public static final int f75591k = 17;

    /* JADX INFO: renamed from: l */
    public static final int f75592l = 18;

    /* JADX INFO: renamed from: m */
    public static final int f75593m = 19;

    /* JADX INFO: renamed from: n */
    public static final int f75594n = 20;

    /* JADX INFO: renamed from: o */
    public static final int f75595o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f75596p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f75597q = 3;

    /* JADX INFO: renamed from: r */
    public static final int f75598r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f75599s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f75600t = 16;

    /* JADX INFO: renamed from: u */
    public static final int f75601u = 17;

    /* JADX INFO: renamed from: v */
    public static final int f75602v = 18;

    /* JADX INFO: renamed from: w */
    public static final int f75603w = 32;

    /* JADX INFO: renamed from: x */
    public static final int f75604x = 33;

    /* JADX INFO: renamed from: y */
    public static final int f75605y = 34;

    /* JADX INFO: renamed from: z */
    public static final int f75606z = 240;

    /* JADX INFO: renamed from: a */
    public final Paint f75607a;

    /* JADX INFO: renamed from: b */
    public final Paint f75608b;

    /* JADX INFO: renamed from: c */
    public final Canvas f75609c;

    /* JADX INFO: renamed from: d */
    public final C11675b f75610d;

    /* JADX INFO: renamed from: e */
    public final C11674a f75611e;

    /* JADX INFO: renamed from: f */
    public final C11681h f75612f;

    /* JADX INFO: renamed from: g */
    public Bitmap f75613g;

    /* JADX INFO: renamed from: qt4$a */
    public static final class C11674a {

        /* JADX INFO: renamed from: a */
        public final int f75614a;

        /* JADX INFO: renamed from: b */
        public final int[] f75615b;

        /* JADX INFO: renamed from: c */
        public final int[] f75616c;

        /* JADX INFO: renamed from: d */
        public final int[] f75617d;

        public C11674a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f75614a = i;
            this.f75615b = iArr;
            this.f75616c = iArr2;
            this.f75617d = iArr3;
        }
    }

    /* JADX INFO: renamed from: qt4$b */
    public static final class C11675b {

        /* JADX INFO: renamed from: a */
        public final int f75618a;

        /* JADX INFO: renamed from: b */
        public final int f75619b;

        /* JADX INFO: renamed from: c */
        public final int f75620c;

        /* JADX INFO: renamed from: d */
        public final int f75621d;

        /* JADX INFO: renamed from: e */
        public final int f75622e;

        /* JADX INFO: renamed from: f */
        public final int f75623f;

        public C11675b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f75618a = i;
            this.f75619b = i2;
            this.f75620c = i3;
            this.f75621d = i4;
            this.f75622e = i5;
            this.f75623f = i6;
        }
    }

    /* JADX INFO: renamed from: qt4$c */
    public static final class C11676c {

        /* JADX INFO: renamed from: a */
        public final int f75624a;

        /* JADX INFO: renamed from: b */
        public final boolean f75625b;

        /* JADX INFO: renamed from: c */
        public final byte[] f75626c;

        /* JADX INFO: renamed from: d */
        public final byte[] f75627d;

        public C11676c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f75624a = i;
            this.f75625b = z;
            this.f75626c = bArr;
            this.f75627d = bArr2;
        }
    }

    /* JADX INFO: renamed from: qt4$d */
    public static final class C11677d {

        /* JADX INFO: renamed from: a */
        public final int f75628a;

        /* JADX INFO: renamed from: b */
        public final int f75629b;

        /* JADX INFO: renamed from: c */
        public final int f75630c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<C11678e> f75631d;

        public C11677d(int i, int i2, int i3, SparseArray<C11678e> sparseArray) {
            this.f75628a = i;
            this.f75629b = i2;
            this.f75630c = i3;
            this.f75631d = sparseArray;
        }
    }

    /* JADX INFO: renamed from: qt4$e */
    public static final class C11678e {

        /* JADX INFO: renamed from: a */
        public final int f75632a;

        /* JADX INFO: renamed from: b */
        public final int f75633b;

        public C11678e(int i, int i2) {
            this.f75632a = i;
            this.f75633b = i2;
        }
    }

    /* JADX INFO: renamed from: qt4$f */
    public static final class C11679f {

        /* JADX INFO: renamed from: a */
        public final int f75634a;

        /* JADX INFO: renamed from: b */
        public final boolean f75635b;

        /* JADX INFO: renamed from: c */
        public final int f75636c;

        /* JADX INFO: renamed from: d */
        public final int f75637d;

        /* JADX INFO: renamed from: e */
        public final int f75638e;

        /* JADX INFO: renamed from: f */
        public final int f75639f;

        /* JADX INFO: renamed from: g */
        public final int f75640g;

        /* JADX INFO: renamed from: h */
        public final int f75641h;

        /* JADX INFO: renamed from: i */
        public final int f75642i;

        /* JADX INFO: renamed from: j */
        public final int f75643j;

        /* JADX INFO: renamed from: k */
        public final SparseArray<C11680g> f75644k;

        public C11679f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C11680g> sparseArray) {
            this.f75634a = i;
            this.f75635b = z;
            this.f75636c = i2;
            this.f75637d = i3;
            this.f75638e = i4;
            this.f75639f = i5;
            this.f75640g = i6;
            this.f75641h = i7;
            this.f75642i = i8;
            this.f75643j = i9;
            this.f75644k = sparseArray;
        }

        public void mergeFrom(C11679f c11679f) {
            SparseArray<C11680g> sparseArray = c11679f.f75644k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f75644k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: qt4$g */
    public static final class C11680g {

        /* JADX INFO: renamed from: a */
        public final int f75645a;

        /* JADX INFO: renamed from: b */
        public final int f75646b;

        /* JADX INFO: renamed from: c */
        public final int f75647c;

        /* JADX INFO: renamed from: d */
        public final int f75648d;

        /* JADX INFO: renamed from: e */
        public final int f75649e;

        /* JADX INFO: renamed from: f */
        public final int f75650f;

        public C11680g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f75645a = i;
            this.f75646b = i2;
            this.f75647c = i3;
            this.f75648d = i4;
            this.f75649e = i5;
            this.f75650f = i6;
        }
    }

    /* JADX INFO: renamed from: qt4$h */
    public static final class C11681h {

        /* JADX INFO: renamed from: a */
        public final int f75651a;

        /* JADX INFO: renamed from: b */
        public final int f75652b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<C11679f> f75653c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<C11674a> f75654d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<C11676c> f75655e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<C11674a> f75656f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<C11676c> f75657g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        @hib
        public C11675b f75658h;

        /* JADX INFO: renamed from: i */
        @hib
        public C11677d f75659i;

        public C11681h(int i, int i2) {
            this.f75651a = i;
            this.f75652b = i2;
        }

        public void reset() {
            this.f75653c.clear();
            this.f75654d.clear();
            this.f75655e.clear();
            this.f75656f.clear();
            this.f75657g.clear();
            this.f75658h = null;
            this.f75659i = null;
        }
    }

    public qt4(List<byte[]> list) {
        jhc jhcVar = new jhc(list.get(0));
        int unsignedShort = jhcVar.readUnsignedShort();
        int unsignedShort2 = jhcVar.readUnsignedShort();
        Paint paint = new Paint();
        this.f75607a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f75608b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f75609c = new Canvas();
        this.f75610d = new C11675b(719, 575, 0, 719, 0, 575);
        this.f75611e = new C11674a(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.f75612f = new C11681h(unsignedShort, unsignedShort2);
    }

    private static byte[] buildClutMapTable(int i, int i2, hhc hhcVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) hhcVar.readBits(i2);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = getColor(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = getColor(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = getColor(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = dk4.f29869f;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static int paint2BitPixelCodeString(hhc hhcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int bits3 = hhcVar.readBits(2);
            if (bits3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (hhcVar.readBit()) {
                    bits = hhcVar.readBits(3) + 3;
                    bits2 = hhcVar.readBits(2);
                } else {
                    if (hhcVar.readBit()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int bits4 = hhcVar.readBits(2);
                        if (bits4 == 0) {
                            z = true;
                        } else if (bits4 == 1) {
                            z = z2;
                            i3 = 2;
                        } else if (bits4 == 2) {
                            bits = hhcVar.readBits(4) + 12;
                            bits2 = hhcVar.readBits(2);
                        } else if (bits4 != 3) {
                            z = z2;
                        } else {
                            bits = hhcVar.readBits(8) + 29;
                            bits2 = hhcVar.readBits(2);
                        }
                        bits3 = 0;
                        i3 = 0;
                    }
                    bits3 = 0;
                }
                z = z2;
                i3 = bits;
                bits3 = bits2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static int paint4BitPixelCodeString(hhc hhcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int bits3 = hhcVar.readBits(4);
            if (bits3 != 0) {
                z = z2;
                i3 = 1;
            } else if (hhcVar.readBit()) {
                if (hhcVar.readBit()) {
                    int bits4 = hhcVar.readBits(2);
                    if (bits4 == 0) {
                        z = z2;
                        i3 = 1;
                    } else if (bits4 == 1) {
                        z = z2;
                        i3 = 2;
                    } else if (bits4 == 2) {
                        bits = hhcVar.readBits(4) + 9;
                        bits2 = hhcVar.readBits(4);
                    } else if (bits4 != 3) {
                        z = z2;
                        bits3 = 0;
                        i3 = 0;
                    } else {
                        bits = hhcVar.readBits(8) + 25;
                        bits2 = hhcVar.readBits(4);
                    }
                    bits3 = 0;
                } else {
                    bits = hhcVar.readBits(2) + 4;
                    bits2 = hhcVar.readBits(4);
                }
                z = z2;
                i3 = bits;
                bits3 = bits2;
            } else {
                int bits5 = hhcVar.readBits(3);
                if (bits5 != 0) {
                    z = z2;
                    i3 = bits5 + 2;
                    bits3 = 0;
                } else {
                    z = true;
                    bits3 = 0;
                    i3 = 0;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static int paint8BitPixelCodeString(hhc hhcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int bits;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int bits2 = hhcVar.readBits(8);
            if (bits2 != 0) {
                z = z2;
                bits = 1;
            } else if (hhcVar.readBit()) {
                z = z2;
                bits = hhcVar.readBits(7);
                bits2 = hhcVar.readBits(8);
            } else {
                int bits3 = hhcVar.readBits(7);
                if (bits3 != 0) {
                    z = z2;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i3, i2, i3 + bits, i2 + 1, paint);
            }
            i3 += bits;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i, int i2, int i3, @hib Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        hhc hhcVar = new hhc(bArr);
        int iPaint2BitPixelCodeString = i2;
        int i4 = i3;
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        byte[] bArrBuildClutMapTable3 = null;
        while (hhcVar.bitsLeft() != 0) {
            int bits = hhcVar.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrBuildClutMapTable == null ? f75586B : bArrBuildClutMapTable;
                        } else if (i != 2) {
                            bArr2 = null;
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(hhcVar, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                            hhcVar.byteAlign();
                        } else {
                            bArr3 = bArrBuildClutMapTable3 == null ? f75585A : bArrBuildClutMapTable3;
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(hhcVar, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                        hhcVar.byteAlign();
                        break;
                    case 17:
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(hhcVar, iArr, i == 3 ? bArrBuildClutMapTable2 == null ? f75587C : bArrBuildClutMapTable2 : null, iPaint2BitPixelCodeString, i4, paint, canvas);
                        hhcVar.byteAlign();
                        break;
                    case 18:
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(hhcVar, iArr, null, iPaint2BitPixelCodeString, i4, paint, canvas);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 4, hhcVar);
                                break;
                            case 33:
                                bArrBuildClutMapTable = buildClutMapTable(4, 8, hhcVar);
                                break;
                            case 34:
                                bArrBuildClutMapTable2 = buildClutMapTable(16, 8, hhcVar);
                                break;
                        }
                        break;
                }
            } else {
                i4 += 2;
                iPaint2BitPixelCodeString = i2;
            }
        }
    }

    private static void paintPixelDataSubBlocks(C11676c c11676c, C11674a c11674a, int i, int i2, int i3, @hib Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? c11674a.f75617d : i == 2 ? c11674a.f75616c : c11674a.f75615b;
        paintPixelDataSubBlock(c11676c.f75626c, iArr, i, i2, i3, paint, canvas);
        paintPixelDataSubBlock(c11676c.f75627d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    private static C11674a parseClutDefinition(hhc hhcVar, int i) {
        int bits;
        int i2;
        int bits2;
        int bits3;
        int bits4;
        int i3 = 8;
        int bits5 = hhcVar.readBits(8);
        hhcVar.skipBits(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i5 > 0) {
            int bits6 = hhcVar.readBits(i3);
            int bits7 = hhcVar.readBits(i3);
            int[] iArr = (bits7 & 128) != 0 ? iArrGenerateDefault2BitClutEntries : (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            if ((bits7 & 1) != 0) {
                bits3 = hhcVar.readBits(i3);
                bits4 = hhcVar.readBits(i3);
                bits = hhcVar.readBits(i3);
                bits2 = hhcVar.readBits(i3);
                i2 = i5 - 6;
            } else {
                int bits8 = hhcVar.readBits(6) << i4;
                int bits9 = hhcVar.readBits(4) << 4;
                bits = hhcVar.readBits(4) << 4;
                i2 = i5 - 4;
                bits2 = hhcVar.readBits(i4) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d = bits3;
            double d2 = bits4 - 128;
            double d3 = bits - 128;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), t0i.constrainValue((int) (d + (1.402d * d2)), 0, 255), t0i.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), t0i.constrainValue((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            bits5 = bits5;
            i3 = 8;
            i4 = 2;
        }
        return new C11674a(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static C11675b parseDisplayDefinition(hhc hhcVar) {
        int i;
        int i2;
        int i3;
        int bits;
        hhcVar.skipBits(4);
        boolean bit = hhcVar.readBit();
        hhcVar.skipBits(3);
        int bits2 = hhcVar.readBits(16);
        int bits3 = hhcVar.readBits(16);
        if (bit) {
            int bits4 = hhcVar.readBits(16);
            int bits5 = hhcVar.readBits(16);
            int bits6 = hhcVar.readBits(16);
            bits = hhcVar.readBits(16);
            i3 = bits5;
            i2 = bits6;
            i = bits4;
        } else {
            i = 0;
            i2 = 0;
            i3 = bits2;
            bits = bits3;
        }
        return new C11675b(bits2, bits3, i, i3, i2, bits);
    }

    private static C11676c parseObjectData(hhc hhcVar) {
        byte[] bArr;
        int bits = hhcVar.readBits(16);
        hhcVar.skipBits(4);
        int bits2 = hhcVar.readBits(2);
        boolean bit = hhcVar.readBit();
        hhcVar.skipBits(1);
        byte[] bArr2 = t0i.f83321f;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = hhcVar.readBits(16);
                int bits4 = hhcVar.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    hhcVar.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    hhcVar.readBytes(bArr, 0, bits4);
                }
            }
            return new C11676c(bits, bit, bArr2, bArr);
        }
        hhcVar.skipBits(hhcVar.readBits(8) * 16);
        bArr = bArr2;
        return new C11676c(bits, bit, bArr2, bArr);
    }

    private static C11677d parsePageComposition(hhc hhcVar, int i) {
        int bits = hhcVar.readBits(8);
        int bits2 = hhcVar.readBits(4);
        int bits3 = hhcVar.readBits(2);
        hhcVar.skipBits(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int bits4 = hhcVar.readBits(8);
            hhcVar.skipBits(8);
            i2 -= 6;
            sparseArray.put(bits4, new C11678e(hhcVar.readBits(16), hhcVar.readBits(16)));
        }
        return new C11677d(bits, bits2, bits3, sparseArray);
    }

    private static C11679f parseRegionComposition(hhc hhcVar, int i) {
        int i2;
        int bits;
        int bits2;
        int bits3 = hhcVar.readBits(8);
        hhcVar.skipBits(4);
        boolean bit = hhcVar.readBit();
        hhcVar.skipBits(3);
        int i3 = 16;
        int bits4 = hhcVar.readBits(16);
        int bits5 = hhcVar.readBits(16);
        int bits6 = hhcVar.readBits(3);
        int bits7 = hhcVar.readBits(3);
        int i4 = 2;
        hhcVar.skipBits(2);
        int bits8 = hhcVar.readBits(8);
        int bits9 = hhcVar.readBits(8);
        int bits10 = hhcVar.readBits(4);
        int bits11 = hhcVar.readBits(2);
        hhcVar.skipBits(2);
        int i5 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int bits12 = hhcVar.readBits(i3);
            int bits13 = hhcVar.readBits(i4);
            int bits14 = hhcVar.readBits(i4);
            int bits15 = hhcVar.readBits(12);
            int i6 = bits11;
            hhcVar.skipBits(4);
            int bits16 = hhcVar.readBits(12);
            int i7 = i5 - 6;
            if (bits13 != 1) {
                i2 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i5 = i7;
                }
                sparseArray.put(bits12, new C11680g(bits13, bits14, bits15, bits16, bits2, bits));
                i4 = i2;
                bits11 = i6;
                i3 = 16;
            } else {
                i2 = 2;
            }
            i5 -= 8;
            bits2 = hhcVar.readBits(8);
            bits = hhcVar.readBits(8);
            sparseArray.put(bits12, new C11680g(bits13, bits14, bits15, bits16, bits2, bits));
            i4 = i2;
            bits11 = i6;
            i3 = 16;
        }
        return new C11679f(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(hhc hhcVar, C11681h c11681h) {
        C11679f c11679f;
        int bits = hhcVar.readBits(8);
        int bits2 = hhcVar.readBits(16);
        int bits3 = hhcVar.readBits(16);
        int bytePosition = hhcVar.getBytePosition() + bits3;
        if (bits3 * 8 > hhcVar.bitsLeft()) {
            xh9.m25148w("DvbParser", "Data field length exceeds limit");
            hhcVar.skipBits(hhcVar.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == c11681h.f75651a) {
                    C11677d c11677d = c11681h.f75659i;
                    C11677d pageComposition = parsePageComposition(hhcVar, bits3);
                    if (pageComposition.f75630c != 0) {
                        c11681h.f75659i = pageComposition;
                        c11681h.f75653c.clear();
                        c11681h.f75654d.clear();
                        c11681h.f75655e.clear();
                    } else if (c11677d != null && c11677d.f75629b != pageComposition.f75629b) {
                        c11681h.f75659i = pageComposition;
                    }
                }
                break;
            case 17:
                C11677d c11677d2 = c11681h.f75659i;
                if (bits2 == c11681h.f75651a && c11677d2 != null) {
                    C11679f regionComposition = parseRegionComposition(hhcVar, bits3);
                    if (c11677d2.f75630c == 0 && (c11679f = c11681h.f75653c.get(regionComposition.f75634a)) != null) {
                        regionComposition.mergeFrom(c11679f);
                    }
                    c11681h.f75653c.put(regionComposition.f75634a, regionComposition);
                }
                break;
            case 18:
                if (bits2 == c11681h.f75651a) {
                    C11674a clutDefinition = parseClutDefinition(hhcVar, bits3);
                    c11681h.f75654d.put(clutDefinition.f75614a, clutDefinition);
                } else if (bits2 == c11681h.f75652b) {
                    C11674a clutDefinition2 = parseClutDefinition(hhcVar, bits3);
                    c11681h.f75656f.put(clutDefinition2.f75614a, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == c11681h.f75651a) {
                    C11676c objectData = parseObjectData(hhcVar);
                    c11681h.f75655e.put(objectData.f75624a, objectData);
                } else if (bits2 == c11681h.f75652b) {
                    C11676c objectData2 = parseObjectData(hhcVar);
                    c11681h.f75657g.put(objectData2.f75624a, objectData2);
                }
                break;
            case 20:
                if (bits2 == c11681h.f75651a) {
                    c11681h.f75658h = parseDisplayDefinition(hhcVar);
                }
                break;
        }
        hhcVar.skipBytes(bytePosition - hhcVar.getBytePosition());
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        hhc hhcVar = new hhc(bArr, i2 + i);
        hhcVar.setPosition(i);
        qu2Var.accept(parse(hhcVar));
    }

    @Override // p000.peg
    public void reset() {
        this.f75612f.reset();
    }

    private ba3 parse(hhc hhcVar) {
        int i;
        int i2;
        SparseArray<C11680g> sparseArray;
        while (hhcVar.bitsLeft() >= 48 && hhcVar.readBits(8) == 15) {
            parseSubtitlingSegment(hhcVar, this.f75612f);
        }
        C11681h c11681h = this.f75612f;
        C11677d c11677d = c11681h.f75659i;
        if (c11677d == null) {
            return new ba3(kx7.m15110of(), -9223372036854775807L, -9223372036854775807L);
        }
        C11675b c11675b = c11681h.f75658h;
        if (c11675b == null) {
            c11675b = this.f75610d;
        }
        Bitmap bitmap = this.f75613g;
        if (bitmap == null || c11675b.f75618a + 1 != bitmap.getWidth() || c11675b.f75619b + 1 != this.f75613g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c11675b.f75618a + 1, c11675b.f75619b + 1, Bitmap.Config.ARGB_8888);
            this.f75613g = bitmapCreateBitmap;
            this.f75609c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C11678e> sparseArray2 = c11677d.f75631d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            this.f75609c.save();
            C11678e c11678eValueAt = sparseArray2.valueAt(i3);
            C11679f c11679f = this.f75612f.f75653c.get(sparseArray2.keyAt(i3));
            int i4 = c11678eValueAt.f75632a + c11675b.f75620c;
            int i5 = c11678eValueAt.f75633b + c11675b.f75622e;
            this.f75609c.clipRect(i4, i5, Math.min(c11679f.f75636c + i4, c11675b.f75621d), Math.min(c11679f.f75637d + i5, c11675b.f75623f));
            C11674a c11674a = this.f75612f.f75654d.get(c11679f.f75640g);
            if (c11674a == null && (c11674a = this.f75612f.f75656f.get(c11679f.f75640g)) == null) {
                c11674a = this.f75611e;
            }
            SparseArray<C11680g> sparseArray3 = c11679f.f75644k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i6);
                C11680g c11680gValueAt = sparseArray3.valueAt(i6);
                C11676c c11676c = this.f75612f.f75655e.get(iKeyAt);
                C11676c c11676c2 = c11676c == null ? this.f75612f.f75657g.get(iKeyAt) : c11676c;
                if (c11676c2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(c11676c2, c11674a, c11679f.f75639f, c11680gValueAt.f75647c + i4, i5 + c11680gValueAt.f75648d, c11676c2.f75625b ? null : this.f75607a, this.f75609c);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (c11679f.f75635b) {
                int i7 = c11679f.f75639f;
                if (i7 == 3) {
                    i = c11674a.f75617d[c11679f.f75641h];
                } else if (i7 == 2) {
                    i = c11674a.f75616c[c11679f.f75642i];
                } else {
                    i = c11674a.f75615b[c11679f.f75643j];
                }
                this.f75608b.setColor(i);
                this.f75609c.drawRect(i4, i5, c11679f.f75636c + i4, c11679f.f75637d + i5, this.f75608b);
            }
            arrayList.add(new n93.C9750c().setBitmap(Bitmap.createBitmap(this.f75613g, i4, i5, c11679f.f75636c, c11679f.f75637d)).setPosition(i4 / c11675b.f75618a).setPositionAnchor(0).setLine(i5 / c11675b.f75619b, 0).setLineAnchor(0).setSize(c11679f.f75636c / c11675b.f75618a).setBitmapHeight(c11679f.f75637d / c11675b.f75619b).build());
            this.f75609c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f75609c.restore();
        }
        return new ba3(arrayList, -9223372036854775807L, -9223372036854775807L);
    }
}
