package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rt4 {

    /* JADX INFO: renamed from: h */
    public static final String f79458h = "DvbParser";

    /* JADX INFO: renamed from: i */
    public static final int f79459i = 16;

    /* JADX INFO: renamed from: j */
    public static final int f79460j = 17;

    /* JADX INFO: renamed from: k */
    public static final int f79461k = 18;

    /* JADX INFO: renamed from: l */
    public static final int f79462l = 19;

    /* JADX INFO: renamed from: m */
    public static final int f79463m = 20;

    /* JADX INFO: renamed from: n */
    public static final int f79464n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f79465o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f79466p = 3;

    /* JADX INFO: renamed from: q */
    public static final int f79467q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f79468r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f79469s = 16;

    /* JADX INFO: renamed from: t */
    public static final int f79470t = 17;

    /* JADX INFO: renamed from: u */
    public static final int f79471u = 18;

    /* JADX INFO: renamed from: v */
    public static final int f79472v = 32;

    /* JADX INFO: renamed from: w */
    public static final int f79473w = 33;

    /* JADX INFO: renamed from: x */
    public static final int f79474x = 34;

    /* JADX INFO: renamed from: y */
    public static final int f79475y = 240;

    /* JADX INFO: renamed from: a */
    public final Paint f79477a;

    /* JADX INFO: renamed from: b */
    public final Paint f79478b;

    /* JADX INFO: renamed from: c */
    public final Canvas f79479c;

    /* JADX INFO: renamed from: d */
    public final C12271b f79480d;

    /* JADX INFO: renamed from: e */
    public final C12270a f79481e;

    /* JADX INFO: renamed from: f */
    public final C12277h f79482f;

    /* JADX INFO: renamed from: g */
    public Bitmap f79483g;

    /* JADX INFO: renamed from: z */
    public static final byte[] f79476z = {0, 7, 8, 15};

    /* JADX INFO: renamed from: A */
    public static final byte[] f79456A = {0, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -1};

    /* JADX INFO: renamed from: B */
    public static final byte[] f79457B = {0, 17, BuiltinOptions.TopKV2Options, 51, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: rt4$a */
    public static final class C12270a {

        /* JADX INFO: renamed from: a */
        public final int f79484a;

        /* JADX INFO: renamed from: b */
        public final int[] f79485b;

        /* JADX INFO: renamed from: c */
        public final int[] f79486c;

        /* JADX INFO: renamed from: d */
        public final int[] f79487d;

        public C12270a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f79484a = i;
            this.f79485b = iArr;
            this.f79486c = iArr2;
            this.f79487d = iArr3;
        }
    }

    /* JADX INFO: renamed from: rt4$b */
    public static final class C12271b {

        /* JADX INFO: renamed from: a */
        public final int f79488a;

        /* JADX INFO: renamed from: b */
        public final int f79489b;

        /* JADX INFO: renamed from: c */
        public final int f79490c;

        /* JADX INFO: renamed from: d */
        public final int f79491d;

        /* JADX INFO: renamed from: e */
        public final int f79492e;

        /* JADX INFO: renamed from: f */
        public final int f79493f;

        public C12271b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f79488a = i;
            this.f79489b = i2;
            this.f79490c = i3;
            this.f79491d = i4;
            this.f79492e = i5;
            this.f79493f = i6;
        }
    }

    /* JADX INFO: renamed from: rt4$c */
    public static final class C12272c {

        /* JADX INFO: renamed from: a */
        public final int f79494a;

        /* JADX INFO: renamed from: b */
        public final boolean f79495b;

        /* JADX INFO: renamed from: c */
        public final byte[] f79496c;

        /* JADX INFO: renamed from: d */
        public final byte[] f79497d;

        public C12272c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f79494a = i;
            this.f79495b = z;
            this.f79496c = bArr;
            this.f79497d = bArr2;
        }
    }

    /* JADX INFO: renamed from: rt4$d */
    public static final class C12273d {

        /* JADX INFO: renamed from: a */
        public final int f79498a;

        /* JADX INFO: renamed from: b */
        public final int f79499b;

        /* JADX INFO: renamed from: c */
        public final int f79500c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<C12274e> f79501d;

        public C12273d(int i, int i2, int i3, SparseArray<C12274e> sparseArray) {
            this.f79498a = i;
            this.f79499b = i2;
            this.f79500c = i3;
            this.f79501d = sparseArray;
        }
    }

    /* JADX INFO: renamed from: rt4$e */
    public static final class C12274e {

        /* JADX INFO: renamed from: a */
        public final int f79502a;

        /* JADX INFO: renamed from: b */
        public final int f79503b;

        public C12274e(int i, int i2) {
            this.f79502a = i;
            this.f79503b = i2;
        }
    }

    /* JADX INFO: renamed from: rt4$f */
    public static final class C12275f {

        /* JADX INFO: renamed from: a */
        public final int f79504a;

        /* JADX INFO: renamed from: b */
        public final boolean f79505b;

        /* JADX INFO: renamed from: c */
        public final int f79506c;

        /* JADX INFO: renamed from: d */
        public final int f79507d;

        /* JADX INFO: renamed from: e */
        public final int f79508e;

        /* JADX INFO: renamed from: f */
        public final int f79509f;

        /* JADX INFO: renamed from: g */
        public final int f79510g;

        /* JADX INFO: renamed from: h */
        public final int f79511h;

        /* JADX INFO: renamed from: i */
        public final int f79512i;

        /* JADX INFO: renamed from: j */
        public final int f79513j;

        /* JADX INFO: renamed from: k */
        public final SparseArray<C12276g> f79514k;

        public C12275f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C12276g> sparseArray) {
            this.f79504a = i;
            this.f79505b = z;
            this.f79506c = i2;
            this.f79507d = i3;
            this.f79508e = i4;
            this.f79509f = i5;
            this.f79510g = i6;
            this.f79511h = i7;
            this.f79512i = i8;
            this.f79513j = i9;
            this.f79514k = sparseArray;
        }

        public void mergeFrom(C12275f c12275f) {
            SparseArray<C12276g> sparseArray = c12275f.f79514k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f79514k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: rt4$g */
    public static final class C12276g {

        /* JADX INFO: renamed from: a */
        public final int f79515a;

        /* JADX INFO: renamed from: b */
        public final int f79516b;

        /* JADX INFO: renamed from: c */
        public final int f79517c;

        /* JADX INFO: renamed from: d */
        public final int f79518d;

        /* JADX INFO: renamed from: e */
        public final int f79519e;

        /* JADX INFO: renamed from: f */
        public final int f79520f;

        public C12276g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f79515a = i;
            this.f79516b = i2;
            this.f79517c = i3;
            this.f79518d = i4;
            this.f79519e = i5;
            this.f79520f = i6;
        }
    }

    /* JADX INFO: renamed from: rt4$h */
    public static final class C12277h {

        /* JADX INFO: renamed from: a */
        public final int f79521a;

        /* JADX INFO: renamed from: b */
        public final int f79522b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<C12275f> f79523c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<C12270a> f79524d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<C12272c> f79525e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<C12270a> f79526f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<C12272c> f79527g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        @hib
        public C12271b f79528h;

        /* JADX INFO: renamed from: i */
        @hib
        public C12273d f79529i;

        public C12277h(int i, int i2) {
            this.f79521a = i;
            this.f79522b = i2;
        }

        public void reset() {
            this.f79523c.clear();
            this.f79524d.clear();
            this.f79525e.clear();
            this.f79526f.clear();
            this.f79527g.clear();
            this.f79528h = null;
            this.f79529i = null;
        }
    }

    public rt4(int i, int i2) {
        Paint paint = new Paint();
        this.f79477a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f79478b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f79479c = new Canvas();
        this.f79480d = new C12271b(719, 575, 0, 719, 0, 575);
        this.f79481e = new C12270a(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.f79482f = new C12277h(i, i2);
    }

    private static byte[] buildClutMapTable(int i, int i2, ghc ghcVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ghcVar.readBits(i2);
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

    private static int paint2BitPixelCodeString(ghc ghcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int bits3 = ghcVar.readBits(2);
            if (bits3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (ghcVar.readBit()) {
                    bits = ghcVar.readBits(3) + 3;
                    bits2 = ghcVar.readBits(2);
                } else {
                    if (ghcVar.readBit()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int bits4 = ghcVar.readBits(2);
                        if (bits4 == 0) {
                            z = true;
                        } else if (bits4 == 1) {
                            z = z2;
                            i3 = 2;
                        } else if (bits4 == 2) {
                            bits = ghcVar.readBits(4) + 12;
                            bits2 = ghcVar.readBits(2);
                        } else if (bits4 != 3) {
                            z = z2;
                        } else {
                            bits = ghcVar.readBits(8) + 29;
                            bits2 = ghcVar.readBits(2);
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

    private static int paint4BitPixelCodeString(ghc ghcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int bits3 = ghcVar.readBits(4);
            if (bits3 != 0) {
                z = z2;
                i3 = 1;
            } else if (ghcVar.readBit()) {
                if (ghcVar.readBit()) {
                    int bits4 = ghcVar.readBits(2);
                    if (bits4 == 0) {
                        z = z2;
                        i3 = 1;
                    } else if (bits4 == 1) {
                        z = z2;
                        i3 = 2;
                    } else if (bits4 == 2) {
                        bits = ghcVar.readBits(4) + 9;
                        bits2 = ghcVar.readBits(4);
                    } else if (bits4 != 3) {
                        z = z2;
                        bits3 = 0;
                        i3 = 0;
                    } else {
                        bits = ghcVar.readBits(8) + 25;
                        bits2 = ghcVar.readBits(4);
                    }
                    bits3 = 0;
                } else {
                    bits = ghcVar.readBits(2) + 4;
                    bits2 = ghcVar.readBits(4);
                }
                z = z2;
                i3 = bits;
                bits3 = bits2;
            } else {
                int bits5 = ghcVar.readBits(3);
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

    private static int paint8BitPixelCodeString(ghc ghcVar, int[] iArr, @hib byte[] bArr, int i, int i2, @hib Paint paint, Canvas canvas) {
        boolean z;
        int bits;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int bits2 = ghcVar.readBits(8);
            if (bits2 != 0) {
                z = z2;
                bits = 1;
            } else if (ghcVar.readBit()) {
                z = z2;
                bits = ghcVar.readBits(7);
                bits2 = ghcVar.readBits(8);
            } else {
                int bits3 = ghcVar.readBits(7);
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
        ghc ghcVar = new ghc(bArr);
        int iPaint2BitPixelCodeString = i2;
        int i4 = i3;
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        byte[] bArrBuildClutMapTable3 = null;
        while (ghcVar.bitsLeft() != 0) {
            int bits = ghcVar.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrBuildClutMapTable == null ? f79456A : bArrBuildClutMapTable;
                        } else if (i != 2) {
                            bArr2 = null;
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(ghcVar, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                            ghcVar.byteAlign();
                        } else {
                            bArr3 = bArrBuildClutMapTable3 == null ? f79476z : bArrBuildClutMapTable3;
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(ghcVar, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                        ghcVar.byteAlign();
                        break;
                    case 17:
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(ghcVar, iArr, i == 3 ? bArrBuildClutMapTable2 == null ? f79457B : bArrBuildClutMapTable2 : null, iPaint2BitPixelCodeString, i4, paint, canvas);
                        ghcVar.byteAlign();
                        break;
                    case 18:
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(ghcVar, iArr, null, iPaint2BitPixelCodeString, i4, paint, canvas);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 4, ghcVar);
                                break;
                            case 33:
                                bArrBuildClutMapTable = buildClutMapTable(4, 8, ghcVar);
                                break;
                            case 34:
                                bArrBuildClutMapTable2 = buildClutMapTable(16, 8, ghcVar);
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

    private static void paintPixelDataSubBlocks(C12272c c12272c, C12270a c12270a, int i, int i2, int i3, @hib Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? c12270a.f79487d : i == 2 ? c12270a.f79486c : c12270a.f79485b;
        paintPixelDataSubBlock(c12272c.f79496c, iArr, i, i2, i3, paint, canvas);
        paintPixelDataSubBlock(c12272c.f79497d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    private static C12270a parseClutDefinition(ghc ghcVar, int i) {
        int bits;
        int i2;
        int bits2;
        int bits3;
        int bits4;
        int i3 = 8;
        int bits5 = ghcVar.readBits(8);
        ghcVar.skipBits(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i5 > 0) {
            int bits6 = ghcVar.readBits(i3);
            int bits7 = ghcVar.readBits(i3);
            int[] iArr = (bits7 & 128) != 0 ? iArrGenerateDefault2BitClutEntries : (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            if ((bits7 & 1) != 0) {
                bits3 = ghcVar.readBits(i3);
                bits4 = ghcVar.readBits(i3);
                bits = ghcVar.readBits(i3);
                bits2 = ghcVar.readBits(i3);
                i2 = i5 - 6;
            } else {
                int bits8 = ghcVar.readBits(6) << i4;
                int bits9 = ghcVar.readBits(4) << 4;
                bits = ghcVar.readBits(4) << 4;
                i2 = i5 - 4;
                bits2 = ghcVar.readBits(i4) << 6;
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
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), x0i.constrainValue((int) (d + (1.402d * d2)), 0, 255), x0i.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), x0i.constrainValue((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            bits5 = bits5;
            i3 = 8;
            i4 = 2;
        }
        return new C12270a(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static C12271b parseDisplayDefinition(ghc ghcVar) {
        int i;
        int i2;
        int i3;
        int bits;
        ghcVar.skipBits(4);
        boolean bit = ghcVar.readBit();
        ghcVar.skipBits(3);
        int bits2 = ghcVar.readBits(16);
        int bits3 = ghcVar.readBits(16);
        if (bit) {
            int bits4 = ghcVar.readBits(16);
            int bits5 = ghcVar.readBits(16);
            int bits6 = ghcVar.readBits(16);
            bits = ghcVar.readBits(16);
            i3 = bits5;
            i2 = bits6;
            i = bits4;
        } else {
            i = 0;
            i2 = 0;
            i3 = bits2;
            bits = bits3;
        }
        return new C12271b(bits2, bits3, i, i3, i2, bits);
    }

    private static C12272c parseObjectData(ghc ghcVar) {
        byte[] bArr;
        int bits = ghcVar.readBits(16);
        ghcVar.skipBits(4);
        int bits2 = ghcVar.readBits(2);
        boolean bit = ghcVar.readBit();
        ghcVar.skipBits(1);
        byte[] bArr2 = x0i.f95983f;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = ghcVar.readBits(16);
                int bits4 = ghcVar.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    ghcVar.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    ghcVar.readBytes(bArr, 0, bits4);
                }
            }
            return new C12272c(bits, bit, bArr2, bArr);
        }
        ghcVar.skipBits(ghcVar.readBits(8) * 16);
        bArr = bArr2;
        return new C12272c(bits, bit, bArr2, bArr);
    }

    private static C12273d parsePageComposition(ghc ghcVar, int i) {
        int bits = ghcVar.readBits(8);
        int bits2 = ghcVar.readBits(4);
        int bits3 = ghcVar.readBits(2);
        ghcVar.skipBits(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int bits4 = ghcVar.readBits(8);
            ghcVar.skipBits(8);
            i2 -= 6;
            sparseArray.put(bits4, new C12274e(ghcVar.readBits(16), ghcVar.readBits(16)));
        }
        return new C12273d(bits, bits2, bits3, sparseArray);
    }

    private static C12275f parseRegionComposition(ghc ghcVar, int i) {
        int i2;
        int bits;
        int bits2;
        int bits3 = ghcVar.readBits(8);
        ghcVar.skipBits(4);
        boolean bit = ghcVar.readBit();
        ghcVar.skipBits(3);
        int i3 = 16;
        int bits4 = ghcVar.readBits(16);
        int bits5 = ghcVar.readBits(16);
        int bits6 = ghcVar.readBits(3);
        int bits7 = ghcVar.readBits(3);
        int i4 = 2;
        ghcVar.skipBits(2);
        int bits8 = ghcVar.readBits(8);
        int bits9 = ghcVar.readBits(8);
        int bits10 = ghcVar.readBits(4);
        int bits11 = ghcVar.readBits(2);
        ghcVar.skipBits(2);
        int i5 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int bits12 = ghcVar.readBits(i3);
            int bits13 = ghcVar.readBits(i4);
            int bits14 = ghcVar.readBits(i4);
            int bits15 = ghcVar.readBits(12);
            int i6 = bits11;
            ghcVar.skipBits(4);
            int bits16 = ghcVar.readBits(12);
            int i7 = i5 - 6;
            if (bits13 != 1) {
                i2 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i5 = i7;
                }
                sparseArray.put(bits12, new C12276g(bits13, bits14, bits15, bits16, bits2, bits));
                i4 = i2;
                bits11 = i6;
                i3 = 16;
            } else {
                i2 = 2;
            }
            i5 -= 8;
            bits2 = ghcVar.readBits(8);
            bits = ghcVar.readBits(8);
            sparseArray.put(bits12, new C12276g(bits13, bits14, bits15, bits16, bits2, bits));
            i4 = i2;
            bits11 = i6;
            i3 = 16;
        }
        return new C12275f(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(ghc ghcVar, C12277h c12277h) {
        C12275f c12275f;
        int bits = ghcVar.readBits(8);
        int bits2 = ghcVar.readBits(16);
        int bits3 = ghcVar.readBits(16);
        int bytePosition = ghcVar.getBytePosition() + bits3;
        if (bits3 * 8 > ghcVar.bitsLeft()) {
            yh9.m25919w("DvbParser", "Data field length exceeds limit");
            ghcVar.skipBits(ghcVar.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == c12277h.f79521a) {
                    C12273d c12273d = c12277h.f79529i;
                    C12273d pageComposition = parsePageComposition(ghcVar, bits3);
                    if (pageComposition.f79500c != 0) {
                        c12277h.f79529i = pageComposition;
                        c12277h.f79523c.clear();
                        c12277h.f79524d.clear();
                        c12277h.f79525e.clear();
                    } else if (c12273d != null && c12273d.f79499b != pageComposition.f79499b) {
                        c12277h.f79529i = pageComposition;
                    }
                }
                break;
            case 17:
                C12273d c12273d2 = c12277h.f79529i;
                if (bits2 == c12277h.f79521a && c12273d2 != null) {
                    C12275f regionComposition = parseRegionComposition(ghcVar, bits3);
                    if (c12273d2.f79500c == 0 && (c12275f = c12277h.f79523c.get(regionComposition.f79504a)) != null) {
                        regionComposition.mergeFrom(c12275f);
                    }
                    c12277h.f79523c.put(regionComposition.f79504a, regionComposition);
                }
                break;
            case 18:
                if (bits2 == c12277h.f79521a) {
                    C12270a clutDefinition = parseClutDefinition(ghcVar, bits3);
                    c12277h.f79524d.put(clutDefinition.f79484a, clutDefinition);
                } else if (bits2 == c12277h.f79522b) {
                    C12270a clutDefinition2 = parseClutDefinition(ghcVar, bits3);
                    c12277h.f79526f.put(clutDefinition2.f79484a, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == c12277h.f79521a) {
                    C12272c objectData = parseObjectData(ghcVar);
                    c12277h.f79525e.put(objectData.f79494a, objectData);
                } else if (bits2 == c12277h.f79522b) {
                    C12272c objectData2 = parseObjectData(ghcVar);
                    c12277h.f79527g.put(objectData2.f79494a, objectData2);
                }
                break;
            case 20:
                if (bits2 == c12277h.f79521a) {
                    c12277h.f79528h = parseDisplayDefinition(ghcVar);
                }
                break;
        }
        ghcVar.skipBytes(bytePosition - ghcVar.getBytePosition());
    }

    public List<o93> decode(byte[] bArr, int i) {
        int i2;
        SparseArray<C12276g> sparseArray;
        ghc ghcVar = new ghc(bArr, i);
        while (ghcVar.bitsLeft() >= 48 && ghcVar.readBits(8) == 15) {
            parseSubtitlingSegment(ghcVar, this.f79482f);
        }
        C12277h c12277h = this.f79482f;
        C12273d c12273d = c12277h.f79529i;
        if (c12273d == null) {
            return Collections.emptyList();
        }
        C12271b c12271b = c12277h.f79528h;
        if (c12271b == null) {
            c12271b = this.f79480d;
        }
        Bitmap bitmap = this.f79483g;
        if (bitmap == null || c12271b.f79488a + 1 != bitmap.getWidth() || c12271b.f79489b + 1 != this.f79483g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c12271b.f79488a + 1, c12271b.f79489b + 1, Bitmap.Config.ARGB_8888);
            this.f79483g = bitmapCreateBitmap;
            this.f79479c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C12274e> sparseArray2 = c12273d.f79501d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            this.f79479c.save();
            C12274e c12274eValueAt = sparseArray2.valueAt(i3);
            C12275f c12275f = this.f79482f.f79523c.get(sparseArray2.keyAt(i3));
            int i4 = c12274eValueAt.f79502a + c12271b.f79490c;
            int i5 = c12274eValueAt.f79503b + c12271b.f79492e;
            this.f79479c.clipRect(i4, i5, Math.min(c12275f.f79506c + i4, c12271b.f79491d), Math.min(c12275f.f79507d + i5, c12271b.f79493f));
            C12270a c12270a = this.f79482f.f79524d.get(c12275f.f79510g);
            if (c12270a == null && (c12270a = this.f79482f.f79526f.get(c12275f.f79510g)) == null) {
                c12270a = this.f79481e;
            }
            SparseArray<C12276g> sparseArray3 = c12275f.f79514k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i6);
                C12276g c12276gValueAt = sparseArray3.valueAt(i6);
                C12272c c12272c = this.f79482f.f79525e.get(iKeyAt);
                C12272c c12272c2 = c12272c == null ? this.f79482f.f79527g.get(iKeyAt) : c12272c;
                if (c12272c2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(c12272c2, c12270a, c12275f.f79509f, c12276gValueAt.f79517c + i4, i5 + c12276gValueAt.f79518d, c12272c2.f79495b ? null : this.f79477a, this.f79479c);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (c12275f.f79505b) {
                int i7 = c12275f.f79509f;
                this.f79478b.setColor(i7 == 3 ? c12270a.f79487d[c12275f.f79511h] : i7 == 2 ? c12270a.f79486c[c12275f.f79512i] : c12270a.f79485b[c12275f.f79513j]);
                this.f79479c.drawRect(i4, i5, c12275f.f79506c + i4, c12275f.f79507d + i5, this.f79478b);
            }
            arrayList.add(new o93.C10261c().setBitmap(Bitmap.createBitmap(this.f79483g, i4, i5, c12275f.f79506c, c12275f.f79507d)).setPosition(i4 / c12271b.f79488a).setPositionAnchor(0).setLine(i5 / c12271b.f79489b, 0).setLineAnchor(0).setSize(c12275f.f79506c / c12271b.f79488a).setBitmapHeight(c12275f.f79507d / c12271b.f79489b).build());
            this.f79479c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f79479c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void reset() {
        this.f79482f.reset();
    }
}
