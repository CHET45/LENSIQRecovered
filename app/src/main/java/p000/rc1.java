package p000;

import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.e92;
import p000.eta;
import p000.n8b;
import p000.y0b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rc1 {

    /* JADX INFO: renamed from: a */
    public static final String f77706a = "BoxParsers";

    /* JADX INFO: renamed from: b */
    public static final int f77707b = 1668047728;

    /* JADX INFO: renamed from: c */
    public static final int f77708c = 1835299937;

    /* JADX INFO: renamed from: d */
    public static final int f77709d = 1835365473;

    /* JADX INFO: renamed from: e */
    public static final int f77710e = 1852009571;

    /* JADX INFO: renamed from: f */
    public static final int f77711f = 1852009592;

    /* JADX INFO: renamed from: g */
    public static final int f77712g = 1935832172;

    /* JADX INFO: renamed from: h */
    public static final int f77713h = 1936684398;

    /* JADX INFO: renamed from: i */
    public static final int f77714i = 1937072756;

    /* JADX INFO: renamed from: j */
    public static final int f77715j = 1937072752;

    /* JADX INFO: renamed from: k */
    public static final int f77716k = 1952807028;

    /* JADX INFO: renamed from: l */
    public static final int f77717l = 1986618469;

    /* JADX INFO: renamed from: m */
    public static final int f77718m = 8000;

    /* JADX INFO: renamed from: n */
    public static final int f77719n = 16000;

    /* JADX INFO: renamed from: o */
    public static final int f77720o = 4;

    /* JADX INFO: renamed from: p */
    public static final byte[] f77721p = t0i.getUtf8Bytes("OpusHead");

    /* JADX INFO: renamed from: rc1$a */
    public static final class C11999a {

        /* JADX INFO: renamed from: a */
        public final long f77722a;

        /* JADX INFO: renamed from: b */
        public final long f77723b;

        public C11999a(long j, long j2) {
            this.f77722a = j;
            this.f77723b = j2;
        }
    }

    /* JADX INFO: renamed from: rc1$b */
    public static final class C12000b {

        /* JADX INFO: renamed from: a */
        public final int f77724a;

        /* JADX INFO: renamed from: b */
        public int f77725b;

        /* JADX INFO: renamed from: c */
        public int f77726c;

        /* JADX INFO: renamed from: d */
        public long f77727d;

        /* JADX INFO: renamed from: e */
        public final boolean f77728e;

        /* JADX INFO: renamed from: f */
        public final jhc f77729f;

        /* JADX INFO: renamed from: g */
        public final jhc f77730g;

        /* JADX INFO: renamed from: h */
        public int f77731h;

        /* JADX INFO: renamed from: i */
        public int f77732i;

        public C12000b(jhc jhcVar, jhc jhcVar2, boolean z) throws yhc {
            this.f77730g = jhcVar;
            this.f77729f = jhcVar2;
            this.f77728e = z;
            jhcVar2.setPosition(12);
            this.f77724a = jhcVar2.readUnsignedIntToInt();
            jhcVar.setPosition(12);
            this.f77732i = jhcVar.readUnsignedIntToInt();
            ek5.checkContainerInput(jhcVar.readInt() == 1, "first_chunk must be 1");
            this.f77725b = -1;
        }

        public boolean moveNext() {
            int i = this.f77725b + 1;
            this.f77725b = i;
            if (i == this.f77724a) {
                return false;
            }
            this.f77727d = this.f77728e ? this.f77729f.readUnsignedLongToLong() : this.f77729f.readUnsignedInt();
            if (this.f77725b == this.f77731h) {
                this.f77726c = this.f77730g.readUnsignedIntToInt();
                this.f77730g.skipBytes(4);
                int i2 = this.f77732i - 1;
                this.f77732i = i2;
                this.f77731h = i2 > 0 ? this.f77730g.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: rc1$c */
    public static final class C12001c {

        /* JADX INFO: renamed from: a */
        public final String f77733a;

        /* JADX INFO: renamed from: b */
        public final byte[] f77734b;

        /* JADX INFO: renamed from: c */
        public final long f77735c;

        /* JADX INFO: renamed from: d */
        public final long f77736d;

        public C12001c(String str, byte[] bArr, long j, long j2) {
            this.f77733a = str;
            this.f77734b = bArr;
            this.f77735c = j;
            this.f77736d = j2;
        }
    }

    /* JADX INFO: renamed from: rc1$d */
    public static final class C12002d {

        /* JADX INFO: renamed from: a */
        public final C12005g f77737a;

        public C12002d(C12005g c12005g) {
            this.f77737a = c12005g;
        }
    }

    /* JADX INFO: renamed from: rc1$e */
    public static final class C12003e {

        /* JADX INFO: renamed from: a */
        public final long f77738a;

        /* JADX INFO: renamed from: b */
        public final long f77739b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f77740c;

        public C12003e(long j, long j2, @hib String str) {
            this.f77738a = j;
            this.f77739b = j2;
            this.f77740c = str;
        }
    }

    /* JADX INFO: renamed from: rc1$f */
    public interface InterfaceC12004f {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: renamed from: rc1$g */
    public static final class C12005g {

        /* JADX INFO: renamed from: a */
        public final boolean f77741a;

        /* JADX INFO: renamed from: b */
        public final boolean f77742b;

        /* JADX INFO: renamed from: c */
        public final boolean f77743c;

        public C12005g(boolean z, boolean z2, boolean z3) {
            this.f77741a = z;
            this.f77742b = z2;
            this.f77743c = z3;
        }
    }

    /* JADX INFO: renamed from: rc1$h */
    public static final class C12006h {

        /* JADX INFO: renamed from: e */
        public static final int f77744e = 8;

        /* JADX INFO: renamed from: a */
        public final b6h[] f77745a;

        /* JADX INFO: renamed from: b */
        @hib
        public C1213a f77746b;

        /* JADX INFO: renamed from: c */
        public int f77747c;

        /* JADX INFO: renamed from: d */
        public int f77748d = 0;

        public C12006h(int i) {
            this.f77745a = new b6h[i];
        }
    }

    /* JADX INFO: renamed from: rc1$i */
    public static final class C12007i implements InterfaceC12004f {

        /* JADX INFO: renamed from: a */
        public final int f77749a;

        /* JADX INFO: renamed from: b */
        public final int f77750b;

        /* JADX INFO: renamed from: c */
        public final jhc f77751c;

        public C12007i(y0b.C15367c c15367c, C1213a c1213a) {
            jhc jhcVar = c15367c.f99985W1;
            this.f77751c = jhcVar;
            jhcVar.setPosition(12);
            int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
            if ("audio/raw".equals(c1213a.f8291o)) {
                int pcmFrameSize = t0i.getPcmFrameSize(c1213a.f8268I, c1213a.f8266G);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    xh9.m25148w(rc1.f77706a, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.f77749a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.f77750b = jhcVar.readUnsignedIntToInt();
        }

        @Override // p000.rc1.InterfaceC12004f
        public int getFixedSampleSize() {
            return this.f77749a;
        }

        @Override // p000.rc1.InterfaceC12004f
        public int getSampleCount() {
            return this.f77750b;
        }

        @Override // p000.rc1.InterfaceC12004f
        public int readNextSampleSize() {
            int i = this.f77749a;
            return i == -1 ? this.f77751c.readUnsignedIntToInt() : i;
        }
    }

    /* JADX INFO: renamed from: rc1$j */
    public static final class C12008j implements InterfaceC12004f {

        /* JADX INFO: renamed from: a */
        public final jhc f77752a;

        /* JADX INFO: renamed from: b */
        public final int f77753b;

        /* JADX INFO: renamed from: c */
        public final int f77754c;

        /* JADX INFO: renamed from: d */
        public int f77755d;

        /* JADX INFO: renamed from: e */
        public int f77756e;

        public C12008j(y0b.C15367c c15367c) {
            jhc jhcVar = c15367c.f99985W1;
            this.f77752a = jhcVar;
            jhcVar.setPosition(12);
            this.f77754c = jhcVar.readUnsignedIntToInt() & 255;
            this.f77753b = jhcVar.readUnsignedIntToInt();
        }

        @Override // p000.rc1.InterfaceC12004f
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // p000.rc1.InterfaceC12004f
        public int getSampleCount() {
            return this.f77753b;
        }

        @Override // p000.rc1.InterfaceC12004f
        public int readNextSampleSize() {
            int i = this.f77754c;
            if (i == 8) {
                return this.f77752a.readUnsignedByte();
            }
            if (i == 16) {
                return this.f77752a.readUnsignedShort();
            }
            int i2 = this.f77755d;
            this.f77755d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f77756e & 15;
            }
            int unsignedByte = this.f77752a.readUnsignedByte();
            this.f77756e = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: rc1$k */
    public static final class C12009k {

        /* JADX INFO: renamed from: a */
        public final int f77757a;

        /* JADX INFO: renamed from: b */
        public final long f77758b;

        /* JADX INFO: renamed from: c */
        public final int f77759c;

        /* JADX INFO: renamed from: d */
        public final int f77760d;

        /* JADX INFO: renamed from: e */
        public final int f77761e;

        /* JADX INFO: renamed from: f */
        public final int f77762f;

        public C12009k(int i, long j, int i2, int i3, int i4, int i5) {
            this.f77757a = i;
            this.f77758b = j;
            this.f77759c = i2;
            this.f77760d = i3;
            this.f77761e = i4;
            this.f77762f = i5;
        }
    }

    /* JADX INFO: renamed from: rc1$l */
    public static final class C12010l {

        /* JADX INFO: renamed from: a */
        @hib
        public final C12002d f77763a;

        public C12010l(C12002d c12002d) {
            this.f77763a = c12002d;
        }

        public boolean hasBothEyeViews() {
            C12002d c12002d = this.f77763a;
            return c12002d != null && c12002d.f77737a.f77741a && this.f77763a.f77737a.f77742b;
        }
    }

    private rc1() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static Pair<Integer, b6h> m21119a(jhc jhcVar, int i, int i2) throws yhc {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            jhcVar.setPosition(i3);
            int i6 = jhcVar.readInt();
            int i7 = jhcVar.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(jhcVar.readInt());
            } else if (i7 == 1935894637) {
                jhcVar.skipBytes(4);
                string = jhcVar.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ek5.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ek5.checkContainerInput(i4 != -1, "schi atom is mandatory");
        b6h schiFromParent = parseSchiFromParent(jhcVar, i4, i5, string);
        ek5.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (b6h) t0i.castNonNull(schiFromParent));
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @hib
    /* JADX INFO: renamed from: b */
    public static C12010l m21120b(jhc jhcVar, int i, int i2) throws yhc {
        jhcVar.setPosition(i + 8);
        int position = jhcVar.getPosition();
        C12002d stereoViewBox = null;
        while (position - i < i2) {
            jhcVar.setPosition(position);
            int i3 = jhcVar.readInt();
            ek5.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (jhcVar.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(jhcVar, position, i3);
            }
            position += i3;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new C12010l(stereoViewBox);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[t0i.constrainValue(4, 0, length)] && jArr[t0i.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static int findBoxPosition(jhc jhcVar, int i, int i2, int i3) throws yhc {
        int position = jhcVar.getPosition();
        ek5.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            jhcVar.setPosition(position);
            int i4 = jhcVar.readInt();
            ek5.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (jhcVar.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i, int i2) {
        v80.checkState(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(rd8.fromBytes(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3])))));
        }
        return "size: " + i + "x" + i2 + "\npalette: " + xj8.m25235on(", ").join(arrayList) + "\n";
    }

    @hib
    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c = cArr[i2];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728 || i == 1937072752) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(jhc jhcVar) {
        int position = jhcVar.getPosition();
        jhcVar.skipBytes(4);
        if (jhcVar.readInt() != 1751411826) {
            position += 4;
        }
        jhcVar.setPosition(position);
    }

    private static e92 parseApvc(jhc jhcVar) {
        e92.C5196b c5196b = new e92.C5196b();
        hhc hhcVar = new hhc(jhcVar.getData());
        hhcVar.setPosition(jhcVar.getPosition() * 8);
        hhcVar.skipBytes(1);
        int bits = hhcVar.readBits(8);
        for (int i = 0; i < bits; i++) {
            hhcVar.skipBytes(1);
            int bits2 = hhcVar.readBits(8);
            for (int i2 = 0; i2 < bits2; i2++) {
                hhcVar.skipBits(6);
                boolean bit = hhcVar.readBit();
                hhcVar.skipBit();
                hhcVar.skipBytes(11);
                hhcVar.skipBits(4);
                int bits3 = hhcVar.readBits(4) + 8;
                c5196b.setLumaBitdepth(bits3);
                c5196b.setChromaBitdepth(bits3);
                hhcVar.skipBytes(1);
                if (bit) {
                    int bits4 = hhcVar.readBits(8);
                    int bits5 = hhcVar.readBits(8);
                    hhcVar.skipBytes(1);
                    c5196b.setColorSpace(e92.isoColorPrimariesToColorSpace(bits4)).setColorRange(hhcVar.readBit() ? 1 : 2).setColorTransfer(e92.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return c5196b.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x038f A[PHI: r8 r9 r11 r12 r16 r22
  0x038f: PHI (r8v13 int) = (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v15 int), (r8v8 int) binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x038f: PHI (r9v9 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v5 int), (r9v15 int), (r9v5 int) binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x038f: PHI (r11v12 java.lang.String) = 
  (r11v10 java.lang.String)
  (r11v11 java.lang.String)
  (r11v11 java.lang.String)
  (r11v13 java.lang.String)
  (r11v10 java.lang.String)
  (r11v10 java.lang.String)
 binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x038f: PHI (r12v61 java.util.List<byte[]>) = 
  (r12v50 java.util.List<byte[]>)
  (r12v50 java.util.List<byte[]>)
  (r12v60 java.util.List<byte[]>)
  (r12v50 java.util.List<byte[]>)
  (r12v64 java.util.List<byte[]>)
  (r12v71 java.util.List<byte[]>)
 binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x038f: PHI (r16v2 int) = (r16v1 int), (r16v1 int), (r16v1 int), (r16v3 int), (r16v1 int), (r16v1 int) binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x038f: PHI (r22v3 rc1$c) = (r22v1 rc1$c), (r22v2 rc1$c), (r22v2 rc1$c), (r22v1 rc1$c), (r22v1 rc1$c), (r22v1 rc1$c) binds: [B:240:0x0480, B:242:0x048e, B:245:0x0498, B:232:0x0443, B:206:0x039d, B:202:0x035a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseAudioSampleEntry(p000.jhc r26, int r27, int r28, int r29, int r30, @p000.hib java.lang.String r31, boolean r32, @p000.hib androidx.media3.common.DrmInitData r33, p000.rc1.C12006h r34, int r35) throws p000.yhc {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rc1.parseAudioSampleEntry(jhc, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, rc1$h, int):void");
    }

    private static e92 parseAv1c(jhc jhcVar) {
        e92.C5196b c5196b = new e92.C5196b();
        hhc hhcVar = new hhc(jhcVar.getData());
        hhcVar.setPosition(jhcVar.getPosition() * 8);
        hhcVar.skipBytes(1);
        int bits = hhcVar.readBits(3);
        hhcVar.skipBits(6);
        boolean bit = hhcVar.readBit();
        boolean bit2 = hhcVar.readBit();
        if (bits == 2 && bit) {
            c5196b.setLumaBitdepth(bit2 ? 12 : 10);
            c5196b.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            c5196b.setLumaBitdepth(bit ? 10 : 8);
            c5196b.setChromaBitdepth(bit ? 10 : 8);
        }
        hhcVar.skipBits(13);
        hhcVar.skipBit();
        int bits2 = hhcVar.readBits(4);
        if (bits2 != 1) {
            xh9.m25146i(f77706a, "Unsupported obu_type: " + bits2);
            return c5196b.build();
        }
        if (hhcVar.readBit()) {
            xh9.m25146i(f77706a, "Unsupported obu_extension_flag");
            return c5196b.build();
        }
        boolean bit3 = hhcVar.readBit();
        hhcVar.skipBit();
        if (bit3 && hhcVar.readBits(8) > 127) {
            xh9.m25146i(f77706a, "Excessive obu_size");
            return c5196b.build();
        }
        int bits3 = hhcVar.readBits(3);
        hhcVar.skipBit();
        if (hhcVar.readBit()) {
            xh9.m25146i(f77706a, "Unsupported reduced_still_picture_header");
            return c5196b.build();
        }
        if (hhcVar.readBit()) {
            xh9.m25146i(f77706a, "Unsupported timing_info_present_flag");
            return c5196b.build();
        }
        if (hhcVar.readBit()) {
            xh9.m25146i(f77706a, "Unsupported initial_display_delay_present_flag");
            return c5196b.build();
        }
        int bits4 = hhcVar.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            hhcVar.skipBits(12);
            if (hhcVar.readBits(5) > 7) {
                hhcVar.skipBit();
            }
        }
        int bits5 = hhcVar.readBits(4);
        int bits6 = hhcVar.readBits(4);
        hhcVar.skipBits(bits5 + 1);
        hhcVar.skipBits(bits6 + 1);
        if (hhcVar.readBit()) {
            hhcVar.skipBits(7);
        }
        hhcVar.skipBits(7);
        boolean bit4 = hhcVar.readBit();
        if (bit4) {
            hhcVar.skipBits(2);
        }
        if ((hhcVar.readBit() ? 2 : hhcVar.readBits(1)) > 0 && !hhcVar.readBit()) {
            hhcVar.skipBits(1);
        }
        if (bit4) {
            hhcVar.skipBits(3);
        }
        hhcVar.skipBits(3);
        boolean bit5 = hhcVar.readBit();
        if (bits3 == 2 && bit5) {
            hhcVar.skipBit();
        }
        if (bits3 != 1 && hhcVar.readBit()) {
            z = true;
        }
        if (hhcVar.readBit()) {
            int bits7 = hhcVar.readBits(8);
            int bits8 = hhcVar.readBits(8);
            c5196b.setColorSpace(e92.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || hhcVar.readBits(8) != 0) ? hhcVar.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(e92.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return c5196b.build();
    }

    private static C11999a parseBtrtFromParent(jhc jhcVar, int i) {
        jhcVar.setPosition(i + 8);
        jhcVar.skipBytes(4);
        return new C11999a(jhcVar.readUnsignedInt(), jhcVar.readUnsignedInt());
    }

    @hib
    private static Pair<long[], long[]> parseEdts(y0b.C15366b c15366b) {
        y0b.C15367c leafBoxOfType = c15366b.getLeafBoxOfType(1701606260);
        if (leafBoxOfType == null) {
            return null;
        }
        jhc jhcVar = leafBoxOfType.f99985W1;
        jhcVar.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(jhcVar.readInt());
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullBoxVersion == 1 ? jhcVar.readUnsignedLongToLong() : jhcVar.readUnsignedInt();
            jArr2[i] = fullBoxVersion == 1 ? jhcVar.readLong() : jhcVar.readInt();
            if (jhcVar.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            jhcVar.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C12001c parseEsdsFromParent(jhc jhcVar, int i) {
        jhcVar.setPosition(i + 12);
        jhcVar.skipBytes(1);
        parseExpandableClassSize(jhcVar);
        jhcVar.skipBytes(2);
        int unsignedByte = jhcVar.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            jhcVar.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            jhcVar.skipBytes(jhcVar.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            jhcVar.skipBytes(2);
        }
        jhcVar.skipBytes(1);
        parseExpandableClassSize(jhcVar);
        String mimeTypeFromMp4ObjectType = rva.getMimeTypeFromMp4ObjectType(jhcVar.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new C12001c(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        jhcVar.skipBytes(4);
        long unsignedInt = jhcVar.readUnsignedInt();
        long unsignedInt2 = jhcVar.readUnsignedInt();
        jhcVar.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(jhcVar);
        byte[] bArr = new byte[expandableClassSize];
        jhcVar.readBytes(bArr, 0, expandableClassSize);
        return new C12001c(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(jhc jhcVar) {
        int unsignedByte = jhcVar.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = jhcVar.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    public static int parseFullBoxFlags(int i) {
        return i & 16777215;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    private static int parseHdlr(jhc jhcVar) {
        jhcVar.setPosition(16);
        return jhcVar.readInt();
    }

    @hib
    private static eta parseIlst(jhc jhcVar, int i) {
        jhcVar.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (jhcVar.getPosition() < i) {
            eta.InterfaceC5464a ilstElement = mua.parseIlstElement(jhcVar);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new eta(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r6 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.rc1.C12003e parseMdhd(p000.jhc r11) {
        /*
            r0 = 8
            r11.setPosition(r0)
            int r1 = r11.readInt()
            int r1 = parseFullBoxVersion(r1)
            if (r1 != 0) goto L11
            r2 = r0
            goto L13
        L11:
            r2 = 16
        L13:
            r11.skipBytes(r2)
            long r9 = r11.readUnsignedInt()
            int r2 = r11.getPosition()
            if (r1 != 0) goto L21
            r0 = 4
        L21:
            r3 = 0
        L22:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 >= r0) goto L55
            byte[] r6 = r11.getData()
            int r7 = r2 + r3
            r6 = r6[r7]
            r7 = -1
            if (r6 == r7) goto L52
            if (r1 != 0) goto L3b
            long r0 = r11.readUnsignedInt()
            goto L3f
        L3b:
            long r0 = r11.readUnsignedLongToLong()
        L3f:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L47
        L45:
            r6 = r4
            goto L59
        L47:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r3 = r0
            r7 = r9
            long r0 = p000.t0i.scaleLargeTimestamp(r3, r5, r7)
            r6 = r0
            goto L59
        L52:
            int r3 = r3 + 1
            goto L22
        L55:
            r11.skipBytes(r0)
            goto L45
        L59:
            int r11 = r11.readUnsignedShort()
            java.lang.String r8 = getLanguageFromCode(r11)
            rc1$e r11 = new rc1$e
            r3 = r11
            r4 = r9
            r3.<init>(r4, r6, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rc1.parseMdhd(jhc):rc1$e");
    }

    @hib
    public static eta parseMdtaFromMeta(y0b.C15366b c15366b) {
        y0b.C15367c leafBoxOfType = c15366b.getLeafBoxOfType(1751411826);
        y0b.C15367c leafBoxOfType2 = c15366b.getLeafBoxOfType(1801812339);
        y0b.C15367c leafBoxOfType3 = c15366b.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.f99985W1) != 1835299937) {
            return null;
        }
        jhc jhcVar = leafBoxOfType2.f99985W1;
        jhcVar.setPosition(12);
        int i = jhcVar.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = jhcVar.readInt();
            jhcVar.skipBytes(4);
            strArr[i2] = jhcVar.readString(i3 - 8);
        }
        jhc jhcVar2 = leafBoxOfType3.f99985W1;
        jhcVar2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (jhcVar2.bytesLeft() > 8) {
            int position = jhcVar2.getPosition();
            int i4 = jhcVar2.readInt();
            int i5 = jhcVar2.readInt() - 1;
            if (i5 < 0 || i5 >= i) {
                xh9.m25148w(f77706a, "Skipped metadata with unknown key index: " + i5);
            } else {
                pba mdtaMetadataEntryFromIlst = mua.parseMdtaMetadataEntryFromIlst(jhcVar2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            jhcVar2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new eta(arrayList);
    }

    private static void parseMetaDataSampleEntry(jhc jhcVar, int i, int i2, int i3, C12006h c12006h) {
        jhcVar.setPosition(i2 + 16);
        if (i == 1835365492) {
            jhcVar.readNullTerminatedString();
            String nullTerminatedString = jhcVar.readNullTerminatedString();
            if (nullTerminatedString != null) {
                c12006h.f77746b = new C1213a.b().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static i1b parseMvhd(jhc jhcVar) {
        long unsignedInt;
        long unsignedInt2;
        jhcVar.setPosition(8);
        if (parseFullBoxVersion(jhcVar.readInt()) == 0) {
            unsignedInt = jhcVar.readUnsignedInt();
            unsignedInt2 = jhcVar.readUnsignedInt();
        } else {
            unsignedInt = jhcVar.readLong();
            unsignedInt2 = jhcVar.readLong();
        }
        return new i1b(unsignedInt, unsignedInt2, jhcVar.readUnsignedInt());
    }

    private static float parsePaspFromParent(jhc jhcVar, int i) {
        jhcVar.setPosition(i + 8);
        return jhcVar.readUnsignedIntToInt() / jhcVar.readUnsignedIntToInt();
    }

    @hib
    private static byte[] parseProjFromParent(jhc jhcVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            jhcVar.setPosition(i3);
            int i4 = jhcVar.readInt();
            if (jhcVar.readInt() == 1886547818) {
                return Arrays.copyOfRange(jhcVar.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    @hib
    private static Pair<Integer, b6h> parseSampleEntryEncryptionData(jhc jhcVar, int i, int i2) throws yhc {
        Pair<Integer, b6h> pairM21119a;
        int position = jhcVar.getPosition();
        while (position - i < i2) {
            jhcVar.setPosition(position);
            int i3 = jhcVar.readInt();
            ek5.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (jhcVar.readInt() == 1936289382 && (pairM21119a = m21119a(jhcVar, position, i3)) != null) {
                return pairM21119a;
            }
            position += i3;
        }
        return null;
    }

    @hib
    private static b6h parseSchiFromParent(jhc jhcVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            jhcVar.setPosition(i5);
            int i6 = jhcVar.readInt();
            if (jhcVar.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(jhcVar.readInt());
                jhcVar.skipBytes(1);
                if (fullBoxVersion == 0) {
                    jhcVar.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = jhcVar.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = jhcVar.readUnsignedByte() == 1;
                int unsignedByte2 = jhcVar.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                jhcVar.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = jhcVar.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    jhcVar.readBytes(bArr, 0, unsignedByte3);
                }
                return new b6h(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.t6h parseStbl(p000.y5h r41, p000.y0b.C15366b r42, p000.o27 r43) throws p000.yhc {
        /*
            Method dump skipped, instruction units count: 1517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rc1.parseStbl(y5h, y0b$b, o27):t6h");
    }

    @hib
    private static C12002d parseStereoViewBox(jhc jhcVar, int i, int i2) throws yhc {
        jhcVar.setPosition(i + 8);
        int position = jhcVar.getPosition();
        while (position - i < i2) {
            jhcVar.setPosition(position);
            int i3 = jhcVar.readInt();
            ek5.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (jhcVar.readInt() == 1937011305) {
                jhcVar.skipBytes(4);
                int unsignedByte = jhcVar.readUnsignedByte();
                return new C12002d(new C12005g((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i3;
        }
        return null;
    }

    private static C12006h parseStsd(jhc jhcVar, C12009k c12009k, @hib String str, @hib DrmInitData drmInitData, boolean z) throws yhc {
        jhcVar.setPosition(12);
        int i = jhcVar.readInt();
        C12006h c12006h = new C12006h(i);
        for (int i2 = 0; i2 < i; i2++) {
            int position = jhcVar.getPosition();
            int i3 = jhcVar.readInt();
            ek5.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            int i4 = jhcVar.readInt();
            if (i4 == 1635148593 || i4 == 1635148595 || i4 == 1701733238 || i4 == 1831958048 || i4 == 1836070006 || i4 == 1752589105 || i4 == 1751479857 || i4 == 1932670515 || i4 == 1211250227 || i4 == 1748121139 || i4 == 1987063864 || i4 == 1987063865 || i4 == 1635135537 || i4 == 1685479798 || i4 == 1685479729 || i4 == 1685481573 || i4 == 1685481521 || i4 == 1634760241) {
                parseVideoSampleEntry(jhcVar, i4, position, i3, c12009k.f77757a, str, c12009k.f77760d, drmInitData, c12006h, i2);
            } else if (i4 == 1836069985 || i4 == 1701733217 || i4 == 1633889587 || i4 == 1700998451 || i4 == 1633889588 || i4 == 1835823201 || i4 == 1685353315 || i4 == 1685353317 || i4 == 1685353320 || i4 == 1685353324 || i4 == 1685353336 || i4 == 1935764850 || i4 == 1935767394 || i4 == 1819304813 || i4 == 1936684916 || i4 == 1953984371 || i4 == 778924082 || i4 == 778924083 || i4 == 1835557169 || i4 == 1835560241 || i4 == 1634492771 || i4 == 1634492791 || i4 == 1970037111 || i4 == 1332770163 || i4 == 1716281667 || i4 == 1767992678 || i4 == 1768973165 || i4 == 1718641517) {
                parseAudioSampleEntry(jhcVar, i4, position, i3, c12009k.f77757a, str, z, drmInitData, c12006h, i2);
            } else if (i4 == 1414810956 || i4 == 1954034535 || i4 == 2004251764 || i4 == 1937010800 || i4 == 1664495672 || i4 == 1836070003) {
                parseTextSampleEntry(jhcVar, i4, position, i3, c12009k, str, c12006h);
            } else if (i4 == 1835365492) {
                parseMetaDataSampleEntry(jhcVar, i4, position, c12009k.f77757a, c12006h);
            } else if (i4 == 1667329389) {
                c12006h.f77746b = new C1213a.b().setId(c12009k.f77757a).setSampleMimeType("application/x-camera-motion").build();
            }
            jhcVar.setPosition(position + i3);
        }
        return c12006h;
    }

    private static void parseTextSampleEntry(jhc jhcVar, int i, int i2, int i3, C12009k c12009k, @hib String str, C12006h c12006h) {
        jhcVar.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        kx7 kx7VarM15111of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i4 = i3 - 16;
                byte[] bArr = new byte[i4];
                jhcVar.readBytes(bArr, 0, i4);
                kx7VarM15111of = kx7.m15111of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                c12006h.f77748d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i != 1836070003) {
                    throw new IllegalStateException();
                }
                int position = jhcVar.getPosition();
                jhcVar.skipBytes(4);
                if (jhcVar.readInt() == 1702061171) {
                    C12001c esdsFromParent = parseEsdsFromParent(jhcVar, position);
                    if (esdsFromParent.f77734b == null || esdsFromParent.f77734b.length != 64) {
                        return;
                    }
                    kx7VarM15111of = kx7.m15111of(t0i.getUtf8Bytes(formatVobsubIdx(esdsFromParent.f77734b, c12009k.f77761e, c12009k.f77762f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            c12006h.f77746b = new C1213a.b().setId(c12009k.f77757a).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(kx7VarM15111of).build();
        }
    }

    private static C12009k parseTkhd(jhc jhcVar) {
        long j;
        jhcVar.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(jhcVar.readInt());
        jhcVar.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i = jhcVar.readInt();
        jhcVar.skipBytes(4);
        int position = jhcVar.getPosition();
        int i2 = fullBoxVersion == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i2) {
                jhcVar.skipBytes(i2);
                break;
            }
            if (jhcVar.getData()[position + i3] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? jhcVar.readUnsignedInt() : jhcVar.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j = unsignedInt;
                }
            } else {
                i3++;
            }
        }
        jhcVar.skipBytes(10);
        int unsignedShort = jhcVar.readUnsignedShort();
        jhcVar.skipBytes(4);
        int i4 = jhcVar.readInt();
        int i5 = jhcVar.readInt();
        jhcVar.skipBytes(4);
        int i6 = jhcVar.readInt();
        int i7 = jhcVar.readInt();
        int i8 = (i4 == 0 && i5 == 65536 && (i6 == -65536 || i6 == 65536) && i7 == 0) ? 90 : (i4 == 0 && i5 == -65536 && (i6 == 65536 || i6 == -65536) && i7 == 0) ? 270 : ((i4 == -65536 || i4 == 65536) && i5 == 0 && i6 == 0 && i7 == -65536) ? 180 : 0;
        jhcVar.skipBytes(16);
        short s = jhcVar.readShort();
        jhcVar.skipBytes(2);
        return new C12009k(i, j, unsignedShort, i8, s, jhcVar.readShort());
    }

    @hib
    public static y5h parseTrak(y0b.C15366b c15366b, y0b.C15367c c15367c, long j, @hib DrmInitData drmInitData, boolean z, boolean z2) throws yhc {
        y0b.C15367c c15367c2;
        long j2;
        long[] jArr;
        long[] jArr2;
        C1213a c1213aBuild;
        y0b.C15366b containerBoxOfType;
        Pair<long[], long[]> edts;
        y0b.C15366b c15366b2 = (y0b.C15366b) v80.checkNotNull(c15366b.getContainerBoxOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((y0b.C15367c) v80.checkNotNull(c15366b2.getLeafBoxOfType(1751411826))).f99985W1));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        C12009k tkhd = parseTkhd(((y0b.C15367c) v80.checkNotNull(c15366b.getLeafBoxOfType(1953196132))).f99985W1);
        if (j == -9223372036854775807L) {
            c15367c2 = c15367c;
            j2 = tkhd.f77758b;
        } else {
            c15367c2 = c15367c;
            j2 = j;
        }
        long j3 = parseMvhd(c15367c2.f99985W1).f45432c;
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? t0i.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        y0b.C15366b c15366b3 = (y0b.C15366b) v80.checkNotNull(((y0b.C15366b) v80.checkNotNull(c15366b2.getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212));
        C12003e mdhd = parseMdhd(((y0b.C15367c) v80.checkNotNull(c15366b2.getLeafBoxOfType(1835296868))).f99985W1);
        y0b.C15367c leafBoxOfType = c15366b3.getLeafBoxOfType(1937011556);
        if (leafBoxOfType == null) {
            throw yhc.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        C12006h stsd = parseStsd(leafBoxOfType.f99985W1, tkhd, mdhd.f77740c, drmInitData, z2);
        if (z || (containerBoxOfType = c15366b.getContainerBoxOfType(1701082227)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.f77746b == null) {
            return null;
        }
        if (tkhd.f77759c != 0) {
            x0b x0bVar = new x0b(tkhd.f77759c);
            C1213a.b bVarBuildUpon = stsd.f77746b.buildUpon();
            eta etaVar = stsd.f77746b.f8288l;
            c1213aBuild = bVarBuildUpon.setMetadata(etaVar != null ? etaVar.copyWithAppendedEntries(x0bVar) : new eta(x0bVar)).build();
        } else {
            c1213aBuild = stsd.f77746b;
        }
        return new y5h(tkhd.f77757a, trackTypeForHdlr, mdhd.f77738a, j3, jScaleLargeTimestamp, mdhd.f77739b, c1213aBuild, stsd.f77748d, stsd.f77745a, stsd.f77747c, jArr, jArr2);
    }

    public static List<t6h> parseTraks(y0b.C15366b c15366b, o27 o27Var, long j, @hib DrmInitData drmInitData, boolean z, boolean z2, lz6<y5h, y5h> lz6Var) throws yhc {
        y5h y5hVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c15366b.f99984Y1.size(); i++) {
            y0b.C15366b c15366b2 = c15366b.f99984Y1.get(i);
            if (c15366b2.f99981a == 1953653099 && (y5hVarApply = lz6Var.apply(parseTrak(c15366b2, (y0b.C15367c) v80.checkNotNull(c15366b.getLeafBoxOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(y5hVarApply, (y0b.C15366b) v80.checkNotNull(((y0b.C15366b) v80.checkNotNull(((y0b.C15366b) v80.checkNotNull(c15366b2.getContainerBoxOfType(1835297121))).getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212)), o27Var));
            }
        }
        return arrayList;
    }

    public static eta parseUdta(y0b.C15367c c15367c) {
        jhc jhcVar = c15367c.f99985W1;
        jhcVar.setPosition(8);
        eta etaVar = new eta(new eta.InterfaceC5464a[0]);
        while (jhcVar.bytesLeft() >= 8) {
            int position = jhcVar.getPosition();
            int i = jhcVar.readInt();
            int i2 = jhcVar.readInt();
            if (i2 == 1835365473) {
                jhcVar.setPosition(position);
                etaVar = etaVar.copyWithAppendedEntriesFrom(parseUdtaMeta(jhcVar, position + i));
            } else if (i2 == 1936553057) {
                jhcVar.setPosition(position);
                etaVar = etaVar.copyWithAppendedEntriesFrom(csf.parseSmta(jhcVar, position + i));
            } else if (i2 == -1451722374) {
                etaVar = etaVar.copyWithAppendedEntriesFrom(parseXyz(jhcVar));
            }
            jhcVar.setPosition(position + i);
        }
        return etaVar;
    }

    @hib
    private static eta parseUdtaMeta(jhc jhcVar, int i) {
        jhcVar.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(jhcVar);
        while (jhcVar.getPosition() < i) {
            int position = jhcVar.getPosition();
            int i2 = jhcVar.readInt();
            if (jhcVar.readInt() == 1768715124) {
                jhcVar.setPosition(position);
                return parseIlst(jhcVar, position + i2);
            }
            jhcVar.setPosition(position + i2);
        }
        return null;
    }

    private static void parseVideoSampleEntry(jhc jhcVar, int i, int i2, int i3, int i4, @hib String str, int i5, @hib DrmInitData drmInitData, C12006h c12006h, int i6) throws yhc {
        String str2;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i2;
        int i15 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        C12006h c12006h2 = c12006h;
        jhcVar.setPosition(i14 + 16);
        jhcVar.skipBytes(16);
        int unsignedShort = jhcVar.readUnsignedShort();
        int unsignedShort2 = jhcVar.readUnsignedShort();
        jhcVar.skipBytes(50);
        int position = jhcVar.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, b6h> sampleEntryEncryptionData = parseSampleEntryEncryptionData(jhcVar, i14, i15);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((b6h) sampleEntryEncryptionData.second).f12819b);
                c12006h2.f77745a[i6] = (b6h) sampleEntryEncryptionData.second;
            }
            jhcVar.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        int i16 = 8;
        int i17 = 8;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        List<byte[]> listBuild = null;
        String str5 = null;
        byte[] projFromParent = null;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        C11999a btrtFromParent = null;
        C12001c esdsFromParent = null;
        n8b.C9738k c9738k = null;
        boolean z = false;
        while (position - i14 < i15) {
            jhcVar.setPosition(position);
            int position2 = jhcVar.getPosition();
            int i25 = jhcVar.readInt();
            if (i25 == 0) {
                str2 = str3;
                if (jhcVar.getPosition() - i14 == i15) {
                    break;
                }
            } else {
                str2 = str3;
            }
            ek5.checkContainerInput(i25 > 0, "childAtomSize must be positive");
            int i26 = jhcVar.readInt();
            if (i26 == 1635148611) {
                ek5.checkContainerInput(str4 == null, null);
                jhcVar.setPosition(position2 + 8);
                sm0 sm0Var = sm0.parse(jhcVar);
                List<byte[]> list = sm0Var.f82197a;
                c12006h2.f77747c = sm0Var.f82198b;
                if (!z) {
                    paspFromParent = sm0Var.f82207k;
                }
                String str6 = sm0Var.f82208l;
                int i27 = sm0Var.f82206j;
                int i28 = sm0Var.f82203g;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i9 = unsignedShort2;
                i10 = iIntValue;
                i19 = i27;
                i24 = sm0Var.f82204h;
                iIsoTransferCharacteristicsToColorTransfer = sm0Var.f82205i;
                i16 = sm0Var.f82201e;
                listBuild = list;
                str4 = "video/avc";
                str5 = str6;
                i7 = i28;
                i17 = sm0Var.f82202f;
            } else {
                if (i26 == 1752589123) {
                    ek5.checkContainerInput(str4 == null, null);
                    jhcVar.setPosition(position2 + 8);
                    sj7 sj7Var = sj7.parse(jhcVar);
                    List<byte[]> list2 = sj7Var.f81964a;
                    c12006h2.f77747c = sj7Var.f81965b;
                    if (!z) {
                        paspFromParent = sj7Var.f81977n;
                    }
                    int i29 = sj7Var.f81978o;
                    int i30 = sj7Var.f81966c;
                    String str7 = sj7Var.f81979p;
                    int i31 = sj7Var.f81976m;
                    listBuild = list2;
                    if (i31 != -1) {
                        i18 = i31;
                    }
                    int i32 = sj7Var.f81969f;
                    int i33 = sj7Var.f81970g;
                    int i34 = sj7Var.f81973j;
                    int i35 = sj7Var.f81974k;
                    int i36 = sj7Var.f81975l;
                    int i37 = sj7Var.f81971h;
                    int i38 = sj7Var.f81972i;
                    c9738k = sj7Var.f81980q;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i9 = unsignedShort2;
                    i10 = iIntValue;
                    i24 = i35;
                    iIsoTransferCharacteristicsToColorTransfer = i36;
                    i20 = i30;
                    i21 = i32;
                    str5 = str7;
                    i17 = i38;
                    i19 = i29;
                    str4 = "video/hevc";
                    i7 = i34;
                    i22 = i33;
                    i16 = i37;
                } else {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    if (i26 == 1818785347) {
                        ek5.checkContainerInput("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        n8b.C9738k c9738k2 = c9738k;
                        ek5.checkContainerInput(c9738k2 != null && c9738k2.f63579b.size() >= 2, "must have at least two layers");
                        jhcVar.setPosition(position2 + 8);
                        sj7 layered = sj7.parseLayered(jhcVar, (n8b.C9738k) v80.checkNotNull(c9738k2));
                        ek5.checkContainerInput(c12006h2.f77747c == layered.f81965b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i39 = layered.f81973j;
                        i7 = i23;
                        if (i39 != -1) {
                            ek5.checkContainerInput(i7 == i39, "colorSpace must be the same for both views");
                        }
                        int i40 = layered.f81974k;
                        int i41 = i24;
                        if (i40 != -1) {
                            ek5.checkContainerInput(i41 == i40, "colorRange must be the same for both views");
                        }
                        int i42 = layered.f81975l;
                        if (i42 != -1) {
                            int i43 = iIsoTransferCharacteristicsToColorTransfer;
                            i13 = i43;
                            ek5.checkContainerInput(i43 == i42, "colorTransfer must be the same for both views");
                        } else {
                            i13 = iIsoTransferCharacteristicsToColorTransfer;
                        }
                        ek5.checkContainerInput(i16 == layered.f81971h, "bitdepthLuma must be the same for both views");
                        ek5.checkContainerInput(i17 == layered.f81972i, "bitdepthChroma must be the same for both views");
                        List<byte[]> list3 = listBuild;
                        if (list3 != null) {
                            listBuild = kx7.builder().addAll((Iterable) list3).addAll((Iterable) layered.f81964a).build();
                        } else {
                            listBuild = list3;
                            ek5.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str8 = layered.f81979p;
                        c9738k = c9738k2;
                        str4 = rva.f79761D;
                        i9 = unsignedShort2;
                        i10 = iIntValue;
                        i24 = i41;
                        iIsoTransferCharacteristicsToColorTransfer = i13;
                        str5 = str8;
                    } else {
                        List<byte[]> list4 = listBuild;
                        i7 = i23;
                        int i44 = i24;
                        int i45 = iIsoTransferCharacteristicsToColorTransfer;
                        n8b.C9738k c9738k3 = c9738k;
                        if (i26 == 1986361461) {
                            C12010l c12010lM21120b = m21120b(jhcVar, position2, i25);
                            if (c12010lM21120b == null || c12010lM21120b.f77763a == null) {
                                i12 = i18;
                                i18 = i12;
                                c9738k = c9738k3;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                listBuild = list4;
                                i24 = i44;
                                iIsoTransferCharacteristicsToColorTransfer = i45;
                            } else if (c9738k3 == null || c9738k3.f63579b.size() < 2) {
                                i12 = i18;
                                if (i12 == -1) {
                                    i18 = c12010lM21120b.f77763a.f77737a.f77743c ? 5 : 4;
                                } else {
                                    i18 = i12;
                                }
                                c9738k = c9738k3;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                listBuild = list4;
                                i24 = i44;
                                iIsoTransferCharacteristicsToColorTransfer = i45;
                            } else {
                                ek5.checkContainerInput(c12010lM21120b.hasBothEyeViews(), "both eye views must be marked as available");
                                ek5.checkContainerInput(!c12010lM21120b.f77763a.f77737a.f77743c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i12 = i18;
                                i18 = i12;
                                c9738k = c9738k3;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                listBuild = list4;
                                i24 = i44;
                                iIsoTransferCharacteristicsToColorTransfer = i45;
                            }
                        } else {
                            int i46 = i18;
                            if (i26 == 1685480259 || i26 == 1685485123 || i26 == 1685485379) {
                                i8 = i46;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                int i47 = i17;
                                float f = paspFromParent;
                                int i48 = i16;
                                i11 = i45;
                                int i49 = i25 - 8;
                                byte[] bArr = new byte[i49];
                                jhcVar.readBytes(bArr, 0, i49);
                                if (list4 != null) {
                                    listBuild = kx7.builder().addAll((Iterable) list4).add(bArr).build();
                                } else {
                                    ek5.checkContainerInput(false, "initializationData must already be set from hvcC or avcC atom");
                                    listBuild = list4;
                                }
                                jhcVar.setPosition(position2 + 8);
                                nj4 nj4Var = nj4.parse(jhcVar);
                                if (nj4Var != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = nj4Var.f64748c;
                                }
                                i17 = i47;
                                i16 = i48;
                                i24 = i44;
                                paspFromParent = f;
                            } else if (i26 == 1987076931) {
                                ek5.checkContainerInput(str4 == null, null);
                                String str9 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                jhcVar.setPosition(position2 + 12);
                                byte unsignedByte = (byte) jhcVar.readUnsignedByte();
                                byte unsignedByte2 = (byte) jhcVar.readUnsignedByte();
                                int unsignedByte3 = jhcVar.readUnsignedByte();
                                i17 = unsignedByte3 >> 4;
                                List<byte[]> listBuildVp9CodecPrivateInitializationData = str9.equals("video/x-vnd.on2.vp9") ? d72.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i17, (byte) ((unsignedByte3 >> 1) & 7)) : list4;
                                boolean z2 = (unsignedByte3 & 1) != 0;
                                int unsignedByte4 = jhcVar.readUnsignedByte();
                                int unsignedByte5 = jhcVar.readUnsignedByte();
                                int iIsoColorPrimariesToColorSpace = e92.isoColorPrimariesToColorSpace(unsignedByte4);
                                i24 = z2 ? 1 : 2;
                                iIsoTransferCharacteristicsToColorTransfer = e92.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                                str4 = str9;
                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                i9 = unsignedShort2;
                                i16 = i17;
                                c9738k = c9738k3;
                                i7 = iIsoColorPrimariesToColorSpace;
                                i18 = i46;
                                i10 = iIntValue;
                            } else if (i26 == 1635135811) {
                                int i50 = i25 - 8;
                                byte[] bArr2 = new byte[i50];
                                jhcVar.readBytes(bArr2, 0, i50);
                                listBuild = kx7.m15111of(bArr2);
                                jhcVar.setPosition(position2 + 8);
                                e92 av1c = parseAv1c(jhcVar);
                                int i51 = av1c.f32177e;
                                int i52 = av1c.f32178f;
                                i7 = av1c.f32173a;
                                int i53 = av1c.f32174b;
                                iIsoTransferCharacteristicsToColorTransfer = av1c.f32175c;
                                i16 = i51;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                i24 = i53;
                                c9738k = c9738k3;
                                i18 = i46;
                                i17 = i52;
                                str4 = "video/av01";
                            } else if (i26 == 1668050025) {
                                if (byteBufferAllocateHdrStaticInfo == null) {
                                    byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                }
                                ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                byteBuffer.position(21);
                                byteBuffer.putShort(jhcVar.readShort());
                                byteBuffer.putShort(jhcVar.readShort());
                                byteBufferAllocateHdrStaticInfo = byteBuffer;
                                i9 = unsignedShort2;
                                i10 = iIntValue;
                                c9738k = c9738k3;
                                listBuild = list4;
                                i24 = i44;
                                iIsoTransferCharacteristicsToColorTransfer = i45;
                                i18 = i46;
                            } else {
                                if (i26 == 1835295606) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                    short s = jhcVar.readShort();
                                    short s2 = jhcVar.readShort();
                                    i10 = iIntValue;
                                    short s3 = jhcVar.readShort();
                                    short s4 = jhcVar.readShort();
                                    int i54 = i17;
                                    short s5 = jhcVar.readShort();
                                    int i55 = i16;
                                    short s6 = jhcVar.readShort();
                                    i8 = i46;
                                    short s7 = jhcVar.readShort();
                                    float f2 = paspFromParent;
                                    short s8 = jhcVar.readShort();
                                    long unsignedInt = jhcVar.readUnsignedInt();
                                    long unsignedInt2 = jhcVar.readUnsignedInt();
                                    i9 = unsignedShort2;
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(s5);
                                    byteBuffer2.putShort(s6);
                                    byteBuffer2.putShort(s);
                                    byteBuffer2.putShort(s2);
                                    byteBuffer2.putShort(s3);
                                    byteBuffer2.putShort(s4);
                                    byteBuffer2.putShort(s7);
                                    byteBuffer2.putShort(s8);
                                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                    i17 = i54;
                                    i16 = i55;
                                    listBuild = list4;
                                    i24 = i44;
                                    iIsoTransferCharacteristicsToColorTransfer = i45;
                                    paspFromParent = f2;
                                } else {
                                    i8 = i46;
                                    i9 = unsignedShort2;
                                    i10 = iIntValue;
                                    int i56 = i17;
                                    float f3 = paspFromParent;
                                    int i57 = i16;
                                    if (i26 == 1681012275) {
                                        ek5.checkContainerInput(str4 == null, null);
                                        str4 = str2;
                                    } else if (i26 == 1702061171) {
                                        ek5.checkContainerInput(str4 == null, null);
                                        esdsFromParent = parseEsdsFromParent(jhcVar, position2);
                                        String str10 = esdsFromParent.f77733a;
                                        byte[] bArr3 = esdsFromParent.f77734b;
                                        listBuild = bArr3 != null ? kx7.m15111of(bArr3) : list4;
                                        str4 = str10;
                                        i17 = i56;
                                        i16 = i57;
                                        i24 = i44;
                                        iIsoTransferCharacteristicsToColorTransfer = i45;
                                        paspFromParent = f3;
                                    } else if (i26 == 1651798644) {
                                        btrtFromParent = parseBtrtFromParent(jhcVar, position2);
                                    } else if (i26 == 1885434736) {
                                        paspFromParent = parsePaspFromParent(jhcVar, position2);
                                        i17 = i56;
                                        i16 = i57;
                                        listBuild = list4;
                                        i24 = i44;
                                        iIsoTransferCharacteristicsToColorTransfer = i45;
                                        z = true;
                                        int i58 = i8;
                                        c9738k = c9738k3;
                                        i18 = i58;
                                    } else if (i26 == 1937126244) {
                                        projFromParent = parseProjFromParent(jhcVar, position2, i25);
                                    } else if (i26 == 1936995172) {
                                        int unsignedByte6 = jhcVar.readUnsignedByte();
                                        jhcVar.skipBytes(3);
                                        if (unsignedByte6 == 0) {
                                            int unsignedByte7 = jhcVar.readUnsignedByte();
                                            if (unsignedByte7 == 0) {
                                                i8 = 0;
                                            } else if (unsignedByte7 == 1) {
                                                i8 = 1;
                                            } else if (unsignedByte7 == 2) {
                                                i8 = 2;
                                            } else if (unsignedByte7 == 3) {
                                                i8 = 3;
                                            }
                                        }
                                    } else if (i26 == 1634760259) {
                                        int i59 = i25 - 12;
                                        byte[] bArr4 = new byte[i59];
                                        jhcVar.setPosition(position2 + 12);
                                        jhcVar.readBytes(bArr4, 0, i59);
                                        listBuild = kx7.m15111of(bArr4);
                                        e92 apvc = parseApvc(new jhc(bArr4));
                                        int i60 = apvc.f32177e;
                                        int i61 = apvc.f32178f;
                                        int i62 = apvc.f32173a;
                                        int i63 = apvc.f32174b;
                                        iIsoTransferCharacteristicsToColorTransfer = apvc.f32175c;
                                        i16 = i60;
                                        i17 = i61;
                                        i7 = i62;
                                        i24 = i63;
                                        str4 = rva.f79834k;
                                        paspFromParent = f3;
                                    } else {
                                        if (i26 == 1668246642) {
                                            i11 = i45;
                                            if (i7 == -1 && i11 == -1) {
                                                int i64 = jhcVar.readInt();
                                                if (i64 == 1852009592 || i64 == 1852009571) {
                                                    int unsignedShort3 = jhcVar.readUnsignedShort();
                                                    int unsignedShort4 = jhcVar.readUnsignedShort();
                                                    jhcVar.skipBytes(2);
                                                    boolean z3 = i25 == 19 && (jhcVar.readUnsignedByte() & 128) != 0;
                                                    int iIsoColorPrimariesToColorSpace2 = e92.isoColorPrimariesToColorSpace(unsignedShort3);
                                                    int i65 = z3 ? 1 : 2;
                                                    i7 = iIsoColorPrimariesToColorSpace2;
                                                    i17 = i56;
                                                    i16 = i57;
                                                    listBuild = list4;
                                                    paspFromParent = f3;
                                                    iIsoTransferCharacteristicsToColorTransfer = e92.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                    i24 = i65;
                                                } else {
                                                    xh9.m25148w(f77706a, "Unsupported color type: " + y0b.getBoxTypeString(i64));
                                                }
                                            }
                                        } else {
                                            i11 = i45;
                                        }
                                        i17 = i56;
                                        i16 = i57;
                                        listBuild = list4;
                                        i24 = i44;
                                        paspFromParent = f3;
                                    }
                                    i17 = i56;
                                    i16 = i57;
                                    listBuild = list4;
                                    i24 = i44;
                                    iIsoTransferCharacteristicsToColorTransfer = i45;
                                    paspFromParent = f3;
                                }
                                int i582 = i8;
                                c9738k = c9738k3;
                                i18 = i582;
                            }
                            iIsoTransferCharacteristicsToColorTransfer = i11;
                            int i5822 = i8;
                            c9738k = c9738k3;
                            i18 = i5822;
                        }
                    }
                }
                position += i25;
                i14 = i2;
                i15 = i3;
                c12006h2 = c12006h;
                iIntValue = i10;
                drmInitDataCopyWithSchemeType = drmInitData2;
                unsignedShort2 = i9;
                i23 = i7;
                str3 = str2;
            }
            position += i25;
            i14 = i2;
            i15 = i3;
            c12006h2 = c12006h;
            iIntValue = i10;
            drmInitDataCopyWithSchemeType = drmInitData2;
            unsignedShort2 = i9;
            i23 = i7;
            str3 = str2;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i66 = unsignedShort2;
        float f4 = paspFromParent;
        List<byte[]> list5 = listBuild;
        int i67 = i18;
        int i68 = i23;
        int i69 = i24;
        int i70 = iIsoTransferCharacteristicsToColorTransfer;
        int i71 = i17;
        int i72 = i16;
        if (str4 == null) {
            return;
        }
        C1213a.b colorInfo = new C1213a.b().setId(i4).setSampleMimeType(str4).setCodecs(str5).setWidth(unsignedShort).setHeight(i66).setDecodedWidth(i21).setDecodedHeight(i22).setPixelWidthHeightRatio(f4).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i67).setInitializationData(list5).setMaxNumReorderSamples(i19).setMaxSubLayers(i20).setDrmInitData(drmInitData3).setLanguage(str).setColorInfo(new e92.C5196b().setColorSpace(i68).setColorRange(i69).setColorTransfer(i70).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i72).setChromaBitdepth(i71).build());
        if (btrtFromParent != null) {
            colorInfo.setAverageBitrate(rd8.saturatedCast(btrtFromParent.f77722a)).setPeakBitrate(rd8.saturatedCast(btrtFromParent.f77723b));
        } else if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(rd8.saturatedCast(esdsFromParent.f77735c)).setPeakBitrate(rd8.saturatedCast(esdsFromParent.f77736d));
        }
        c12006h.f77746b = colorInfo.build();
    }

    @hib
    private static eta parseXyz(jhc jhcVar) {
        short s = jhcVar.readShort();
        jhcVar.skipBytes(2);
        String string = jhcVar.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new eta(new g1b(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = ((i >> 8) & 255) - 128;
        int i4 = (i & 255) - 128;
        return t0i.constrainValue(i2 + ((i4 * 17790) / 10000), 0, 255) | (t0i.constrainValue(((i3 * 14075) / 10000) + i2, 0, 255) << 16) | (t0i.constrainValue((i2 - ((i4 * 3455) / 10000)) - ((i3 * 7169) / 10000), 0, 255) << 8);
    }
}
