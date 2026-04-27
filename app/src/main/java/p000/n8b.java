package p000;

import androidx.media3.common.C1213a;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class n8b {

    /* JADX INFO: renamed from: A */
    public static final int f63494A = 40;

    /* JADX INFO: renamed from: B */
    public static final int f63495B = 48;

    /* JADX INFO: renamed from: D */
    public static final int f63497D = 255;

    /* JADX INFO: renamed from: F */
    public static final int f63499F = -1;

    /* JADX INFO: renamed from: a */
    public static final String f63502a = "NalUnitUtil";

    /* JADX INFO: renamed from: b */
    public static final int f63503b = 1;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f63504c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f63505d = 2;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f63506e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f63507f = 5;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f63508g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f63509h = 6;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final int f63510i = 6;

    /* JADX INFO: renamed from: j */
    public static final int f63511j = 7;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final int f63512k = 7;

    /* JADX INFO: renamed from: l */
    public static final int f63513l = 8;

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final int f63514m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f63515n = 9;

    /* JADX INFO: renamed from: o */
    @Deprecated
    public static final int f63516o = 9;

    /* JADX INFO: renamed from: p */
    public static final int f63517p = 14;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f63518q = 14;

    /* JADX INFO: renamed from: r */
    public static final int f63519r = 24;

    /* JADX INFO: renamed from: s */
    public static final int f63520s = 9;

    /* JADX INFO: renamed from: t */
    public static final int f63521t = 16;

    /* JADX INFO: renamed from: u */
    public static final int f63522u = 21;

    /* JADX INFO: renamed from: v */
    public static final int f63523v = 32;

    /* JADX INFO: renamed from: w */
    public static final int f63524w = 33;

    /* JADX INFO: renamed from: x */
    public static final int f63525x = 34;

    /* JADX INFO: renamed from: y */
    public static final int f63526y = 35;

    /* JADX INFO: renamed from: z */
    public static final int f63527z = 39;

    /* JADX INFO: renamed from: C */
    public static final byte[] f63496C = {0, 0, 0, 1};

    /* JADX INFO: renamed from: E */
    public static final float[] f63498E = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: G */
    public static final Object f63500G = new Object();

    /* JADX INFO: renamed from: H */
    public static int[] f63501H = new int[10];

    /* JADX INFO: renamed from: n8b$a */
    public static final class C9728a {

        /* JADX INFO: renamed from: a */
        public final int f63528a;

        /* JADX INFO: renamed from: b */
        public final int f63529b;

        public C9728a(int i, int i2) {
            this.f63528a = i;
            this.f63529b = i2;
        }
    }

    /* JADX INFO: renamed from: n8b$b */
    public static final class C9729b {

        /* JADX INFO: renamed from: a */
        public final int f63530a;

        /* JADX INFO: renamed from: b */
        public final int f63531b;

        /* JADX INFO: renamed from: c */
        public final int f63532c;

        public C9729b(int i, int i2, int i3) {
            this.f63530a = i;
            this.f63531b = i2;
            this.f63532c = i3;
        }
    }

    /* JADX INFO: renamed from: n8b$c */
    public static final class C9730c {

        /* JADX INFO: renamed from: a */
        public final int f63533a;

        /* JADX INFO: renamed from: b */
        public final boolean f63534b;

        /* JADX INFO: renamed from: c */
        public final int f63535c;

        /* JADX INFO: renamed from: d */
        public final int f63536d;

        /* JADX INFO: renamed from: e */
        public final int[] f63537e;

        /* JADX INFO: renamed from: f */
        public final int f63538f;

        public C9730c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.f63533a = i;
            this.f63534b = z;
            this.f63535c = i2;
            this.f63536d = i3;
            this.f63537e = iArr;
            this.f63538f = i4;
        }
    }

    /* JADX INFO: renamed from: n8b$d */
    public static final class C9731d {

        /* JADX INFO: renamed from: a */
        public final kx7<C9730c> f63539a;

        /* JADX INFO: renamed from: b */
        public final int[] f63540b;

        public C9731d(List<C9730c> list, int[] iArr) {
            this.f63539a = kx7.copyOf((Collection) list);
            this.f63540b = iArr;
        }
    }

    /* JADX INFO: renamed from: n8b$e */
    public static final class C9732e {

        /* JADX INFO: renamed from: a */
        public final int f63541a;

        /* JADX INFO: renamed from: b */
        public final int f63542b;

        /* JADX INFO: renamed from: c */
        public final int f63543c;

        /* JADX INFO: renamed from: d */
        public final int f63544d;

        /* JADX INFO: renamed from: e */
        public final int f63545e;

        public C9732e(int i, int i2, int i3, int i4, int i5) {
            this.f63541a = i;
            this.f63542b = i2;
            this.f63543c = i3;
            this.f63544d = i4;
            this.f63545e = i5;
        }
    }

    /* JADX INFO: renamed from: n8b$f */
    public static final class C9733f {

        /* JADX INFO: renamed from: a */
        public final kx7<C9732e> f63546a;

        /* JADX INFO: renamed from: b */
        public final int[] f63547b;

        public C9733f(List<C9732e> list, int[] iArr) {
            this.f63546a = kx7.copyOf((Collection) list);
            this.f63547b = iArr;
        }
    }

    /* JADX INFO: renamed from: n8b$g */
    public static final class C9734g {

        /* JADX INFO: renamed from: a */
        public final int f63548a;

        /* JADX INFO: renamed from: b */
        public final int f63549b;

        /* JADX INFO: renamed from: c */
        public final int f63550c;

        /* JADX INFO: renamed from: d */
        public final int f63551d;

        /* JADX INFO: renamed from: e */
        public final int f63552e;

        /* JADX INFO: renamed from: f */
        public final int f63553f;

        /* JADX INFO: renamed from: g */
        public final int f63554g;

        /* JADX INFO: renamed from: h */
        public final int f63555h;

        /* JADX INFO: renamed from: i */
        public final int f63556i;

        public C9734g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f63548a = i;
            this.f63549b = i2;
            this.f63550c = i3;
            this.f63551d = i4;
            this.f63552e = i5;
            this.f63553f = i6;
            this.f63554g = i7;
            this.f63555h = i8;
            this.f63556i = i9;
        }
    }

    /* JADX INFO: renamed from: n8b$h */
    public static final class C9735h {

        /* JADX INFO: renamed from: a */
        public final C9729b f63557a;

        /* JADX INFO: renamed from: b */
        public final int f63558b;

        /* JADX INFO: renamed from: c */
        @hib
        public final C9730c f63559c;

        /* JADX INFO: renamed from: d */
        public final int f63560d;

        /* JADX INFO: renamed from: e */
        public final int f63561e;

        /* JADX INFO: renamed from: f */
        public final int f63562f;

        /* JADX INFO: renamed from: g */
        public final int f63563g;

        /* JADX INFO: renamed from: h */
        public final int f63564h;

        /* JADX INFO: renamed from: i */
        public final int f63565i;

        /* JADX INFO: renamed from: j */
        public final int f63566j;

        /* JADX INFO: renamed from: k */
        public final int f63567k;

        /* JADX INFO: renamed from: l */
        public final float f63568l;

        /* JADX INFO: renamed from: m */
        public final int f63569m;

        /* JADX INFO: renamed from: n */
        public final int f63570n;

        /* JADX INFO: renamed from: o */
        public final int f63571o;

        /* JADX INFO: renamed from: p */
        public final int f63572p;

        public C9735h(C9729b c9729b, int i, @hib C9730c c9730c, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11, int i12, int i13) {
            this.f63557a = c9729b;
            this.f63558b = i;
            this.f63559c = c9730c;
            this.f63560d = i2;
            this.f63561e = i3;
            this.f63562f = i4;
            this.f63563g = i5;
            this.f63564h = i6;
            this.f63565i = i7;
            this.f63568l = f;
            this.f63569m = i10;
            this.f63570n = i11;
            this.f63571o = i12;
            this.f63572p = i13;
            this.f63566j = i8;
            this.f63567k = i9;
        }
    }

    /* JADX INFO: renamed from: n8b$i */
    public static final class C9736i {

        /* JADX INFO: renamed from: a */
        public final int f63573a;

        /* JADX INFO: renamed from: b */
        public final int f63574b;

        /* JADX INFO: renamed from: c */
        public final int f63575c;

        public C9736i(int i, int i2, int i3) {
            this.f63573a = i;
            this.f63574b = i2;
            this.f63575c = i3;
        }
    }

    /* JADX INFO: renamed from: n8b$j */
    public static final class C9737j {

        /* JADX INFO: renamed from: a */
        public final kx7<C9736i> f63576a;

        /* JADX INFO: renamed from: b */
        public final int[] f63577b;

        public C9737j(List<C9736i> list, int[] iArr) {
            this.f63576a = kx7.copyOf((Collection) list);
            this.f63577b = iArr;
        }
    }

    /* JADX INFO: renamed from: n8b$k */
    public static final class C9738k {

        /* JADX INFO: renamed from: a */
        public final C9729b f63578a;

        /* JADX INFO: renamed from: b */
        public final kx7<C9728a> f63579b;

        /* JADX INFO: renamed from: c */
        public final C9731d f63580c;

        /* JADX INFO: renamed from: d */
        @hib
        public final C9733f f63581d;

        /* JADX INFO: renamed from: e */
        @hib
        public final C9737j f63582e;

        public C9738k(C9729b c9729b, @hib List<C9728a> list, C9731d c9731d, @hib C9733f c9733f, @hib C9737j c9737j) {
            this.f63578a = c9729b;
            this.f63579b = list != null ? kx7.copyOf((Collection) list) : kx7.m15110of();
            this.f63580c = c9731d;
            this.f63581d = c9733f;
            this.f63582e = c9737j;
        }
    }

    /* JADX INFO: renamed from: n8b$l */
    public static final class C9739l {

        /* JADX INFO: renamed from: a */
        public final int f63583a;

        /* JADX INFO: renamed from: b */
        public final int f63584b;

        /* JADX INFO: renamed from: c */
        public final boolean f63585c;

        public C9739l(int i, int i2, boolean z) {
            this.f63583a = i;
            this.f63584b = i2;
            this.f63585c = z;
        }
    }

    /* JADX INFO: renamed from: n8b$m */
    public static final class C9740m {

        /* JADX INFO: renamed from: a */
        public final int f63586a;

        /* JADX INFO: renamed from: b */
        public final int f63587b;

        /* JADX INFO: renamed from: c */
        public final int f63588c;

        /* JADX INFO: renamed from: d */
        public final int f63589d;

        /* JADX INFO: renamed from: e */
        public final int f63590e;

        /* JADX INFO: renamed from: f */
        public final int f63591f;

        /* JADX INFO: renamed from: g */
        public final int f63592g;

        /* JADX INFO: renamed from: h */
        public final float f63593h;

        /* JADX INFO: renamed from: i */
        public final int f63594i;

        /* JADX INFO: renamed from: j */
        public final int f63595j;

        /* JADX INFO: renamed from: k */
        public final boolean f63596k;

        /* JADX INFO: renamed from: l */
        public final boolean f63597l;

        /* JADX INFO: renamed from: m */
        public final int f63598m;

        /* JADX INFO: renamed from: n */
        public final int f63599n;

        /* JADX INFO: renamed from: o */
        public final int f63600o;

        /* JADX INFO: renamed from: p */
        public final boolean f63601p;

        /* JADX INFO: renamed from: q */
        public final int f63602q;

        /* JADX INFO: renamed from: r */
        public final int f63603r;

        /* JADX INFO: renamed from: s */
        public final int f63604s;

        /* JADX INFO: renamed from: t */
        public final int f63605t;

        public C9740m(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.f63586a = i;
            this.f63587b = i2;
            this.f63588c = i3;
            this.f63589d = i4;
            this.f63590e = i5;
            this.f63591f = i6;
            this.f63592g = i7;
            this.f63593h = f;
            this.f63594i = i8;
            this.f63595j = i9;
            this.f63596k = z;
            this.f63597l = z2;
            this.f63598m = i10;
            this.f63599n = i11;
            this.f63600o = i12;
            this.f63601p = z3;
            this.f63602q = i13;
            this.f63603r = i14;
            this.f63604s = i15;
            this.f63605t = i16;
        }
    }

    private n8b() {
    }

    private static int applyConformanceWindowToHeight(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    private static int applyConformanceWindowToWidth(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @hib
    private static String createCodecStringFromH265SpsPalyoad(lhc lhcVar) {
        lhcVar.skipBits(4);
        int bits = lhcVar.readBits(3);
        lhcVar.skipBit();
        C9730c h265ProfileTierLevel = parseH265ProfileTierLevel(lhcVar, true, bits, null);
        return d72.buildHevcCodecString(h265ProfileTierLevel.f63533a, h265ProfileTierLevel.f63534b, h265ProfileTierLevel.f63535c, h265ProfileTierLevel.f63536d, h265ProfileTierLevel.f63537e, h265ProfileTierLevel.f63538f);
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        v80.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    private static kx7<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        kx7.C8541a c8541aBuilder = kx7.builder();
        int i = 0;
        while (i < bArr.length) {
            int iFindNalUnit = findNalUnit(bArr, i, bArr.length, zArr);
            if (iFindNalUnit != bArr.length) {
                c8541aBuilder.add(Integer.valueOf(iFindNalUnit));
            }
            i = iFindNalUnit + 3;
        }
        return c8541aBuilder.build();
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    @hib
    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = list.get(i);
            int length = bArr.length;
            if (length > 3) {
                kx7<Integer> kx7VarFindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i2 = 0; i2 < kx7VarFindNalUnitPositions.size(); i2++) {
                    if (kx7VarFindNalUnitPositions.get(i2).intValue() + 3 < length) {
                        lhc lhcVar = new lhc(bArr, kx7VarFindNalUnitPositions.get(i2).intValue() + 3, length);
                        C9729b h265NalHeader = parseH265NalHeader(lhcVar);
                        if (h265NalHeader.f63530a == 33 && h265NalHeader.f63531b == 0) {
                            return createCodecStringFromH265SpsPalyoad(lhcVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & BuiltinOptions.RightShiftOptions) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i, int i2, C1213a c1213a) {
        if (Objects.equals(c1213a.f8291o, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i]);
        }
        if (Objects.equals(c1213a.f8291o, "video/hevc")) {
            return isH265NalUnitDependedOn(bArr, i, i2, c1213a);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b) {
        if (((b & BuiltinOptions.NonMaxSuppressionV5Options) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i, int i2, C1213a c1213a) {
        C9729b h265NalHeader = parseH265NalHeader(new lhc(bArr, i, i2 + i));
        int i3 = h265NalHeader.f63530a;
        if (i3 == 35) {
            return false;
        }
        return (i3 <= 14 && i3 % 2 == 0 && h265NalHeader.f63532c == c1213a.f8265F - 1) ? false : true;
    }

    @Deprecated
    public static boolean isNalUnitSei(@hib String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & BuiltinOptions.RightShiftOptions) >> 1) == 39;
    }

    public static int numberOfBytesInNalUnitHeader(C1213a c1213a) {
        if (Objects.equals(c1213a.f8291o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c1213a.f8291o, "video/hevc") || rva.containsCodecsCorrespondingToMimeType(c1213a.f8287k, "video/hevc")) ? 2 : 0;
    }

    private static C9729b parseH265NalHeader(lhc lhcVar) {
        lhcVar.skipBit();
        return new C9729b(lhcVar.readBits(6), lhcVar.readBits(6), lhcVar.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.n8b.C9730c parseH265ProfileTierLevel(p000.lhc r19, boolean r20, int r21, @p000.hib p000.n8b.C9730c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.readBits(r5)
            boolean r8 = r19.readBit()
            r9 = 5
            int r9 = r0.readBits(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r19.readBit()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.readBits(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f63533a
            boolean r8 = r2.f63534b
            int r9 = r2.f63535c
            int r11 = r2.f63536d
            int[] r4 = r2.f63537e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.readBits(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r19.readBit()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r19.readBit()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.skipBits(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.skipBits(r6)
        L7b:
            n8b$c r0 = new n8b$c
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n8b.parseH265ProfileTierLevel(lhc, boolean, int, n8b$c):n8b$c");
    }

    private static C9732e parseH265RepFormat(lhc lhcVar) {
        int i;
        int i2;
        int bits;
        int bits2 = lhcVar.readBits(16);
        int bits3 = lhcVar.readBits(16);
        if (lhcVar.readBit()) {
            int bits4 = lhcVar.readBits(2);
            if (bits4 == 3) {
                lhcVar.skipBit();
            }
            int bits5 = lhcVar.readBits(4);
            bits = lhcVar.readBits(4);
            i2 = bits5;
            i = bits4;
        } else {
            i = 0;
            i2 = 0;
            bits = 0;
        }
        if (lhcVar.readBit()) {
            int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = lhcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = lhcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = lhcVar.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new C9732e(i, i2, bits, bits2, bits3);
    }

    private static C9733f parseH265RepFormatsAndIndices(lhc lhcVar, int i) {
        int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt();
        int i2 = unsignedExpGolombCodedInt + 1;
        kx7.C8541a c8541aBuilderWithExpectedSize = kx7.builderWithExpectedSize(i2);
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i2; i3++) {
            c8541aBuilderWithExpectedSize.add(parseH265RepFormat(lhcVar));
        }
        int i4 = 1;
        if (i2 <= 1 || !lhcVar.readBit()) {
            while (i4 < i) {
                iArr[i4] = Math.min(i4, unsignedExpGolombCodedInt);
                i4++;
            }
        } else {
            int iLog2 = dk4.log2(i2, RoundingMode.CEILING);
            while (i4 < i) {
                iArr[i4] = lhcVar.readBits(iLog2);
                i4++;
            }
        }
        return new C9733f(c8541aBuilderWithExpectedSize.build(), iArr);
    }

    @hib
    public static C9734g parseH265Sei3dRefDisplayInfo(byte[] bArr, int i, int i2) {
        byte b;
        int i3 = i + 2;
        int i4 = i2 - 1;
        while (true) {
            b = bArr[i4];
            if (b != 0 || i4 <= i3) {
                break;
            }
            i4--;
        }
        if (b != 0 && i4 > i3) {
            lhc lhcVar = new lhc(bArr, i3, i4 + 1);
            while (lhcVar.canReadBits(16)) {
                int bits = lhcVar.readBits(8);
                int i5 = 0;
                while (bits == 255) {
                    i5 += 255;
                    bits = lhcVar.readBits(8);
                }
                int i6 = i5 + bits;
                int bits2 = lhcVar.readBits(8);
                int i7 = 0;
                while (bits2 == 255) {
                    i7 += 255;
                    bits2 = lhcVar.readBits(8);
                }
                int i8 = i7 + bits2;
                if (i8 == 0 || !lhcVar.canReadBits(i8)) {
                    break;
                }
                if (i6 == 176) {
                    int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt();
                    boolean bit = lhcVar.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? lhcVar.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = lhcVar.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i9 = -1;
                    int bits5 = -1;
                    for (int i10 = 0; i10 <= unsignedExpGolombCodedInt3; i10++) {
                        unsignedExpGolombCodedInt4 = lhcVar.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = lhcVar.readUnsignedExpGolombCodedInt();
                        bits3 = lhcVar.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = lhcVar.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = lhcVar.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            bits5 = lhcVar.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                            i9 = bits6;
                        }
                        if (lhcVar.readBit()) {
                            lhcVar.skipBits(10);
                        }
                    }
                    return new C9734g(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i9, bits5);
                }
                lhcVar.skipBits(i8 * 8);
            }
        }
        return null;
    }

    public static C9735h parseH265SpsNalUnit(byte[] bArr, int i, int i2, @hib C9738k c9738k) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2, parseH265NalHeader(new lhc(bArr, i, i2)), c9738k);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.n8b.C9735h parseH265SpsNalUnitPayload(byte[] r25, int r26, int r27, p000.n8b.C9729b r28, @p000.hib p000.n8b.C9738k r29) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n8b.parseH265SpsNalUnitPayload(byte[], int, int, n8b$b, n8b$k):n8b$h");
    }

    private static C9736i parseH265VideoSignalInfo(lhc lhcVar) {
        lhcVar.skipBits(3);
        int i = lhcVar.readBit() ? 1 : 2;
        int iIsoColorPrimariesToColorSpace = e92.isoColorPrimariesToColorSpace(lhcVar.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = e92.isoTransferCharacteristicsToColorTransfer(lhcVar.readBits(8));
        lhcVar.skipBits(8);
        return new C9736i(iIsoColorPrimariesToColorSpace, i, iIsoTransferCharacteristicsToColorTransfer);
    }

    private static C9737j parseH265VideoSignalInfosAndIndices(lhc lhcVar, int i, int i2, int[] iArr) {
        if (!lhcVar.readBit() ? lhcVar.readBit() : true) {
            lhcVar.skipBit();
        }
        boolean bit = lhcVar.readBit();
        boolean bit2 = lhcVar.readBit();
        if (bit || bit2) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < iArr[i3]; i4++) {
                    boolean bit3 = bit ? lhcVar.readBit() : false;
                    boolean bit4 = bit2 ? lhcVar.readBit() : false;
                    if (bit3) {
                        lhcVar.skipBits(32);
                    }
                    if (bit4) {
                        lhcVar.skipBits(18);
                    }
                }
            }
        }
        boolean bit5 = lhcVar.readBit();
        int bits = bit5 ? lhcVar.readBits(4) + 1 : i;
        kx7.C8541a c8541aBuilderWithExpectedSize = kx7.builderWithExpectedSize(bits);
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < bits; i5++) {
            c8541aBuilderWithExpectedSize.add(parseH265VideoSignalInfo(lhcVar));
        }
        if (bit5 && bits > 1) {
            for (int i6 = 0; i6 < i; i6++) {
                iArr2[i6] = lhcVar.readBits(4);
            }
        }
        return new C9737j(c8541aBuilderWithExpectedSize.build(), iArr2);
    }

    public static C9738k parseH265VpsNalUnit(byte[] bArr, int i, int i2) {
        lhc lhcVar = new lhc(bArr, i, i2);
        return parseH265VpsNalUnitPayload(lhcVar, parseH265NalHeader(lhcVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0546 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.n8b.C9738k parseH265VpsNalUnitPayload(p000.lhc r37, p000.n8b.C9729b r38) {
        /*
            Method dump skipped, instruction units count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n8b.parseH265VpsNalUnitPayload(lhc, n8b$b):n8b$k");
    }

    public static C9739l parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static C9739l parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        lhc lhcVar = new lhc(bArr, i, i2);
        int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = lhcVar.readUnsignedExpGolombCodedInt();
        lhcVar.skipBit();
        return new C9739l(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, lhcVar.readBit());
    }

    public static C9740m parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.n8b.C9740m parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n8b.parseSpsNalUnitPayload(byte[], int, int):n8b$m");
    }

    private static void skipH265DpbSize(lhc lhcVar, int i, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i2 = 1; i2 < i; i2++) {
            boolean bit = lhcVar.readBit();
            int i3 = 0;
            while (i3 < iArr[i2]) {
                if ((i3 <= 0 || !bit) ? i3 == 0 : lhcVar.readBit()) {
                    for (int i4 = 0; i4 < iArr2[i2]; i4++) {
                        if (zArr[i2][i4]) {
                            lhcVar.readUnsignedExpGolombCodedInt();
                        }
                    }
                    lhcVar.readUnsignedExpGolombCodedInt();
                    lhcVar.readUnsignedExpGolombCodedInt();
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(lhc lhcVar, boolean z, int i) {
        ?? r9;
        ?? r1;
        boolean bit;
        boolean bit2;
        if (z) {
            boolean bit3 = lhcVar.readBit();
            boolean bit4 = lhcVar.readBit();
            if (bit3 || bit4) {
                bit = lhcVar.readBit();
                if (bit) {
                    lhcVar.skipBits(19);
                }
                lhcVar.skipBits(8);
                if (bit) {
                    lhcVar.skipBits(4);
                }
                lhcVar.skipBits(15);
                r1 = bit4;
                r9 = bit3;
            } else {
                bit = false;
                r1 = bit4;
                r9 = bit3;
            }
        } else {
            r9 = 0;
            r1 = 0;
            bit = false;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            boolean bit5 = lhcVar.readBit();
            if (!bit5) {
                bit5 = lhcVar.readBit();
            }
            if (bit5) {
                lhcVar.readUnsignedExpGolombCodedInt();
                bit2 = false;
            } else {
                bit2 = lhcVar.readBit();
            }
            int unsignedExpGolombCodedInt = !bit2 ? lhcVar.readUnsignedExpGolombCodedInt() : 0;
            int i3 = r9 + r1;
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 <= unsignedExpGolombCodedInt; i5++) {
                    lhcVar.readUnsignedExpGolombCodedInt();
                    lhcVar.readUnsignedExpGolombCodedInt();
                    if (bit) {
                        lhcVar.readUnsignedExpGolombCodedInt();
                        lhcVar.readUnsignedExpGolombCodedInt();
                    }
                    lhcVar.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(lhc lhcVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (lhcVar.readBit()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        lhcVar.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        lhcVar.readSignedExpGolombCodedInt();
                    }
                } else {
                    lhcVar.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(lhc lhcVar) {
        int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < unsignedExpGolombCodedInt; i3++) {
            if (i3 == 0 || !lhcVar.readBit()) {
                int unsignedExpGolombCodedInt2 = lhcVar.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = lhcVar.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i4 = 0;
                while (i4 < unsignedExpGolombCodedInt2) {
                    iArr2[i4] = (i4 > 0 ? iArr2[i4 - 1] : 0) - (lhcVar.readUnsignedExpGolombCodedInt() + 1);
                    lhcVar.skipBit();
                    i4++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i5 = 0;
                while (i5 < unsignedExpGolombCodedInt3) {
                    iArr3[i5] = (i5 > 0 ? iArr3[i5 - 1] : 0) + lhcVar.readUnsignedExpGolombCodedInt() + 1;
                    lhcVar.skipBit();
                    i5++;
                }
                i = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i2 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i6 = i + i2;
                int unsignedExpGolombCodedInt4 = (1 - ((lhcVar.readBit() ? 1 : 0) * 2)) * (lhcVar.readUnsignedExpGolombCodedInt() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (lhcVar.readBit()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = lhcVar.readBit();
                    }
                }
                int[] iArr4 = new int[i7];
                int[] iArr5 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArrCopyOf[i10] + unsignedExpGolombCodedInt4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr4[i9] = i11;
                        i9++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i6]) {
                    iArr4[i9] = unsignedExpGolombCodedInt4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + unsignedExpGolombCodedInt4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr4[i9] = i13;
                        i9++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + unsignedExpGolombCodedInt4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i6]) {
                    iArr5[i14] = unsignedExpGolombCodedInt4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArrCopyOf[i17] + unsignedExpGolombCodedInt4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr5[i14] = i18;
                        i14++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i14);
                iArr = iArrCopyOf2;
                i = i9;
                i2 = i14;
            }
        }
    }

    private static void skipHrdParameters(lhc lhcVar) {
        int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt() + 1;
        lhcVar.skipBits(8);
        for (int i = 0; i < unsignedExpGolombCodedInt; i++) {
            lhcVar.readUnsignedExpGolombCodedInt();
            lhcVar.readUnsignedExpGolombCodedInt();
            lhcVar.skipBit();
        }
        lhcVar.skipBits(20);
    }

    private static void skipScalingList(lhc lhcVar, int i) {
        int signedExpGolombCodedInt = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((lhcVar.readSignedExpGolombCodedInt() + i2) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i2 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(lhc lhcVar, int i, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = lhcVar.readUnsignedExpGolombCodedInt() + 2;
        if (lhcVar.readBit()) {
            lhcVar.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i2 = 1; i2 < i; i2++) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zArr[i2][i3]) {
                        lhcVar.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = lhcVar.readUnsignedExpGolombCodedInt();
        for (int i4 = 1; i4 <= unsignedExpGolombCodedInt2; i4++) {
            lhcVar.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (f63500G) {
            int iFindNextUnescapeIndex = 0;
            int i3 = 0;
            while (iFindNextUnescapeIndex < i) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i);
                    if (iFindNextUnescapeIndex < i) {
                        int[] iArr = f63501H;
                        if (iArr.length <= i3) {
                            f63501H = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f63501H[i3] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = f63501H[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i8 + 2;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }

    public static boolean isNalUnitSei(C1213a c1213a, byte b) {
        if ((Objects.equals(c1213a.f8291o, "video/avc") || rva.containsCodecsCorrespondingToMimeType(c1213a.f8287k, "video/avc")) && (b & 31) == 6) {
            return true;
        }
        return (Objects.equals(c1213a.f8291o, "video/hevc") || rva.containsCodecsCorrespondingToMimeType(c1213a.f8287k, "video/hevc")) && ((b & BuiltinOptions.RightShiftOptions) >> 1) == 39;
    }
}
