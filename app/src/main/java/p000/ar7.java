package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ar7 extends rif {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1575a f11656b = new InterfaceC1575a() { // from class: zq7
        @Override // p000.ar7.InterfaceC1575a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return ar7.lambda$static$0(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final String f11657c = "Id3Decoder";

    /* JADX INFO: renamed from: d */
    public static final int f11658d = 4801587;

    /* JADX INFO: renamed from: e */
    public static final int f11659e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f11660f = 128;

    /* JADX INFO: renamed from: g */
    public static final int f11661g = 64;

    /* JADX INFO: renamed from: h */
    public static final int f11662h = 32;

    /* JADX INFO: renamed from: i */
    public static final int f11663i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f11664j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f11665k = 64;

    /* JADX INFO: renamed from: l */
    public static final int f11666l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f11667m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f11668n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f11669o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f11670p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f11671q = 3;

    /* JADX INFO: renamed from: a */
    @hib
    public final InterfaceC1575a f11672a;

    /* JADX INFO: renamed from: ar7$a */
    public interface InterfaceC1575a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: ar7$b */
    public static final class C1576b {

        /* JADX INFO: renamed from: a */
        public final int f11673a;

        /* JADX INFO: renamed from: b */
        public final boolean f11674b;

        /* JADX INFO: renamed from: c */
        public final int f11675c;

        public C1576b(int i, boolean z, int i2) {
            this.f11673a = i;
            this.f11674b = z;
            this.f11675c = i2;
        }
    }

    public ar7() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        return i2 <= i ? t0i.f83321f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static p10 decodeApicFrame(jhc jhcVar, int i, int i2) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = jhcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        jhcVar.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + i80.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = i80.toLowerCase(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i5, unsignedByte);
        return new p10(str, new String(bArr, i5, iIndexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i3));
    }

    private static c21 decodeBinaryFrame(jhc jhcVar, int i, String str) {
        byte[] bArr = new byte[i];
        jhcVar.readBytes(bArr, 0, i);
        return new c21(str, bArr);
    }

    private static hv1 decodeChapterFrame(jhc jhcVar, int i, int i2, boolean z, int i3, @hib InterfaceC1575a interfaceC1575a) {
        int position = jhcVar.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(jhcVar.getData(), position);
        String str = new String(jhcVar.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        jhcVar.setPosition(iIndexOfZeroByte + 1);
        int i4 = jhcVar.readInt();
        int i5 = jhcVar.readInt();
        long unsignedInt = jhcVar.readUnsignedInt();
        long j = unsignedInt == 4294967295L ? -1L : unsignedInt;
        long unsignedInt2 = jhcVar.readUnsignedInt();
        long j2 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (jhcVar.getPosition() < i6) {
            cr7 cr7VarDecodeFrame = decodeFrame(i2, jhcVar, z, i3, interfaceC1575a);
            if (cr7VarDecodeFrame != null) {
                arrayList.add(cr7VarDecodeFrame);
            }
        }
        return new hv1(str, i4, i5, j, j2, (cr7[]) arrayList.toArray(new cr7[0]));
    }

    private static iv1 decodeChapterTOCFrame(jhc jhcVar, int i, int i2, boolean z, int i3, @hib InterfaceC1575a interfaceC1575a) {
        int position = jhcVar.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(jhcVar.getData(), position);
        String str = new String(jhcVar.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        jhcVar.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = jhcVar.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = jhcVar.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = jhcVar.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(jhcVar.getData(), position2);
            strArr[i4] = new String(jhcVar.getData(), position2, iIndexOfZeroByte2 - position2, StandardCharsets.ISO_8859_1);
            jhcVar.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (jhcVar.getPosition() < i5) {
            cr7 cr7VarDecodeFrame = decodeFrame(i2, jhcVar, z, i3, interfaceC1575a);
            if (cr7VarDecodeFrame != null) {
                arrayList.add(cr7VarDecodeFrame);
            }
        }
        return new iv1(str, z2, z3, strArr, (cr7[]) arrayList.toArray(new cr7[0]));
    }

    @hib
    private static vb2 decodeCommentFrame(jhc jhcVar, int i) {
        if (i < 4) {
            return null;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        jhcVar.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        jhcVar.readBytes(bArr2, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new vb2(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed A[Catch: all -> 0x011f, Exception -> 0x0122, OutOfMemoryError -> 0x0125, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, OutOfMemoryError -> 0x0125, all -> 0x011f, blocks: (B:91:0x0119, B:99:0x012a, B:106:0x0140, B:108:0x0148, B:116:0x0162, B:125:0x017a, B:136:0x0195, B:143:0x01a7, B:149:0x01b6, B:154:0x01ce, B:160:0x01e8, B:161:0x01ed), top: B:171:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0208  */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.cr7 decodeFrame(int r20, p000.jhc r21, boolean r22, int r23, @p000.hib p000.ar7.InterfaceC1575a r24) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ar7.decodeFrame(int, jhc, boolean, int, ar7$a):cr7");
    }

    private static e37 decodeGeobFrame(jhc jhcVar, int i) {
        int unsignedByte = jhcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = rva.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i3, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new e37(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i2));
    }

    @hib
    private static C1576b decodeHeader(jhc jhcVar) {
        if (jhcVar.bytesLeft() < 10) {
            xh9.m25148w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = jhcVar.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            xh9.m25148w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        jhcVar.skipBytes(1);
        int unsignedByte2 = jhcVar.readUnsignedByte();
        int synchSafeInt = jhcVar.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                xh9.m25148w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = jhcVar.readInt();
                jhcVar.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                xh9.m25148w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = jhcVar.readSynchSafeInt();
                jhcVar.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new C1576b(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static pwa decodeMlltFrame(jhc jhcVar, int i) {
        int unsignedShort = jhcVar.readUnsignedShort();
        int unsignedInt24 = jhcVar.readUnsignedInt24();
        int unsignedInt242 = jhcVar.readUnsignedInt24();
        int unsignedByte = jhcVar.readUnsignedByte();
        int unsignedByte2 = jhcVar.readUnsignedByte();
        hhc hhcVar = new hhc();
        hhcVar.reset(jhcVar);
        int i2 = ((i - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = hhcVar.readBits(unsignedByte);
            int bits2 = hhcVar.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new pwa(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    private static lcd decodePrivFrame(jhc jhcVar, int i) {
        byte[] bArr = new byte[i];
        jhcVar.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new lcd(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    @hib
    private static ptg decodeTextInformationFrame(jhc jhcVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        return new ptg(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static kx7<String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return kx7.m15111of("");
        }
        kx7.C8541a c8541aBuilder = kx7.builder();
        int iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < iIndexOfTerminator) {
            c8541aBuilder.add(new String(bArr, i2, iIndexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        kx7<String> kx7VarBuild = c8541aBuilder.build();
        return kx7VarBuild.isEmpty() ? kx7.m15111of("") : kx7VarBuild;
    }

    @hib
    private static ptg decodeTxxxFrame(jhc jhcVar, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new ptg("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static gyh decodeUrlLinkFrame(jhc jhcVar, int i, String str) {
        byte[] bArr = new byte[i];
        jhcVar.readBytes(bArr, 0, i);
        return new gyh(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    @hib
    private static gyh decodeWxxxFrame(jhc jhcVar, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new gyh("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), StandardCharsets.ISO_8859_1));
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if ((iIndexOfZeroByte - i) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static int removeUnsynchronization(jhc jhcVar, int i) {
        byte[] data = jhcVar.getData();
        int position = jhcVar.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
  0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean validateFrames(p000.jhc r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L8:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.readInt()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.readUnsignedInt()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.readUnsignedShort()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.setPosition(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.setPosition(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.setPosition(r2)
            return r6
        L9b:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.setPosition(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.setPosition(r2)
            return r4
        Lb2:
            r1.setPosition(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ar7.validateFrames(jhc, int, int, boolean):boolean");
    }

    @Override // p000.rif
    @hib
    /* JADX INFO: renamed from: a */
    public eta mo2551a(aua auaVar, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    @hib
    public eta decode(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        jhc jhcVar = new jhc(bArr, i);
        C1576b c1576bDecodeHeader = decodeHeader(jhcVar);
        if (c1576bDecodeHeader == null) {
            return null;
        }
        int position = jhcVar.getPosition();
        int i2 = c1576bDecodeHeader.f11673a == 2 ? 6 : 10;
        int iRemoveUnsynchronization = c1576bDecodeHeader.f11675c;
        if (c1576bDecodeHeader.f11674b) {
            iRemoveUnsynchronization = removeUnsynchronization(jhcVar, c1576bDecodeHeader.f11675c);
        }
        jhcVar.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(jhcVar, c1576bDecodeHeader.f11673a, i2, false)) {
            if (c1576bDecodeHeader.f11673a != 4 || !validateFrames(jhcVar, 4, i2, true)) {
                xh9.m25148w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c1576bDecodeHeader.f11673a);
                return null;
            }
            z = true;
        }
        while (jhcVar.bytesLeft() >= i2) {
            cr7 cr7VarDecodeFrame = decodeFrame(c1576bDecodeHeader.f11673a, jhcVar, z, i2, this.f11672a);
            if (cr7VarDecodeFrame != null) {
                arrayList.add(cr7VarDecodeFrame);
            }
        }
        return new eta(arrayList);
    }

    public ar7(@hib InterfaceC1575a interfaceC1575a) {
        this.f11672a = interfaceC1575a;
    }
}
