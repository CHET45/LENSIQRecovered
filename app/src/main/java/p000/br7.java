package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class br7 extends qif {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2019a f14576b = new InterfaceC2019a() { // from class: yq7
        @Override // p000.br7.InterfaceC2019a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return br7.lambda$static$0(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final String f14577c = "Id3Decoder";

    /* JADX INFO: renamed from: d */
    public static final int f14578d = 4801587;

    /* JADX INFO: renamed from: e */
    public static final int f14579e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f14580f = 128;

    /* JADX INFO: renamed from: g */
    public static final int f14581g = 64;

    /* JADX INFO: renamed from: h */
    public static final int f14582h = 32;

    /* JADX INFO: renamed from: i */
    public static final int f14583i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f14584j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f14585k = 64;

    /* JADX INFO: renamed from: l */
    public static final int f14586l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f14587m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f14588n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f14589o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f14590p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f14591q = 3;

    /* JADX INFO: renamed from: a */
    @hib
    public final InterfaceC2019a f14592a;

    /* JADX INFO: renamed from: br7$a */
    public interface InterfaceC2019a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: br7$b */
    public static final class C2020b {

        /* JADX INFO: renamed from: a */
        public final int f14593a;

        /* JADX INFO: renamed from: b */
        public final boolean f14594b;

        /* JADX INFO: renamed from: c */
        public final int f14595c;

        public C2020b(int i, boolean z, int i2) {
            this.f14593a = i;
            this.f14594b = z;
            this.f14595c = i2;
        }
    }

    public br7() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        return i2 <= i ? x0i.f95983f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static ApicFrame decodeApicFrame(ihc ihcVar, int i, int i2) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = ihcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ihcVar.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + i80.toLowerCase(new String(bArr, 0, 3, yw1.f103175b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = i80.toLowerCase(new String(bArr, 0, iIndexOfZeroByte, yw1.f103175b));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i5, unsignedByte);
        return new ApicFrame(str, new String(bArr, i5, iIndexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i3));
    }

    private static BinaryFrame decodeBinaryFrame(ihc ihcVar, int i, String str) {
        byte[] bArr = new byte[i];
        ihcVar.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ihc ihcVar, int i, int i2, boolean z, int i3, @hib InterfaceC2019a interfaceC2019a) {
        int position = ihcVar.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(ihcVar.getData(), position);
        String str = new String(ihcVar.getData(), position, iIndexOfZeroByte - position, yw1.f103175b);
        ihcVar.setPosition(iIndexOfZeroByte + 1);
        int i4 = ihcVar.readInt();
        int i5 = ihcVar.readInt();
        long unsignedInt = ihcVar.readUnsignedInt();
        long j = unsignedInt == 4294967295L ? -1L : unsignedInt;
        long unsignedInt2 = ihcVar.readUnsignedInt();
        long j2 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (ihcVar.getPosition() < i6) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, ihcVar, z, i3, interfaceC2019a);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i4, i5, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ihc ihcVar, int i, int i2, boolean z, int i3, @hib InterfaceC2019a interfaceC2019a) {
        int position = ihcVar.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(ihcVar.getData(), position);
        String str = new String(ihcVar.getData(), position, iIndexOfZeroByte - position, yw1.f103175b);
        ihcVar.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = ihcVar.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = ihcVar.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = ihcVar.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(ihcVar.getData(), position2);
            strArr[i4] = new String(ihcVar.getData(), position2, iIndexOfZeroByte2 - position2, yw1.f103175b);
            ihcVar.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (ihcVar.getPosition() < i5) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, ihcVar, z, i3, interfaceC2019a);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @hib
    private static CommentFrame decodeCommentFrame(ihc ihcVar, int i) {
        if (i < 4) {
            return null;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        ihcVar.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ihcVar.readBytes(bArr2, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:91:0x011c, B:159:0x01f4, B:95:0x0127, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:166:0x0112 }] */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame decodeFrame(int r19, p000.ihc r20, boolean r21, int r22, @p000.hib p000.br7.InterfaceC2019a r23) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br7.decodeFrame(int, ihc, boolean, int, br7$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame decodeGeobFrame(ihc ihcVar, int i) {
        int unsignedByte = ihcVar.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ihcVar.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, yw1.f103175b);
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i3, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i2));
    }

    @hib
    private static C2020b decodeHeader(ihc ihcVar) {
        if (ihcVar.bytesLeft() < 10) {
            yh9.m25919w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = ihcVar.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            yh9.m25919w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        ihcVar.skipBytes(1);
        int unsignedByte2 = ihcVar.readUnsignedByte();
        int synchSafeInt = ihcVar.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                yh9.m25919w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = ihcVar.readInt();
                ihcVar.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                yh9.m25919w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = ihcVar.readSynchSafeInt();
                ihcVar.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new C2020b(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ihc ihcVar, int i) {
        int unsignedShort = ihcVar.readUnsignedShort();
        int unsignedInt24 = ihcVar.readUnsignedInt24();
        int unsignedInt242 = ihcVar.readUnsignedInt24();
        int unsignedByte = ihcVar.readUnsignedByte();
        int unsignedByte2 = ihcVar.readUnsignedByte();
        ghc ghcVar = new ghc();
        ghcVar.reset(ihcVar);
        int i2 = ((i - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = ghcVar.readBits(unsignedByte);
            int bits2 = ghcVar.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    private static PrivFrame decodePrivFrame(ihc ihcVar, int i) {
        byte[] bArr = new byte[i];
        ihcVar.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, yw1.f103175b), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    @hib
    private static TextInformationFrame decodeTextInformationFrame(ihc ihcVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ihcVar.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
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
    private static TextInformationFrame decodeTxxxFrame(ihc ihcVar, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ihcVar.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ihc ihcVar, int i, String str) {
        byte[] bArr = new byte[i];
        ihcVar.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), yw1.f103175b));
    }

    @hib
    private static UrlLinkFrame decodeWxxxFrame(ihc ihcVar, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ihcVar.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), yw1.f103175b));
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i) {
        return i != 1 ? i != 2 ? i != 3 ? yw1.f103175b : yw1.f103176c : yw1.f103177d : yw1.f103179f;
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

    private static int removeUnsynchronization(ihc ihcVar, int i) {
        byte[] data = ihcVar.getData();
        int position = ihcVar.getPosition();
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
    private static boolean validateFrames(p000.ihc r18, int r19, int r20, boolean r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.br7.validateFrames(ihc, int, int, boolean):boolean");
    }

    @Override // p000.qif
    @hib
    /* JADX INFO: renamed from: a */
    public Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    @hib
    public Metadata decode(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        ihc ihcVar = new ihc(bArr, i);
        C2020b c2020bDecodeHeader = decodeHeader(ihcVar);
        if (c2020bDecodeHeader == null) {
            return null;
        }
        int position = ihcVar.getPosition();
        int i2 = c2020bDecodeHeader.f14593a == 2 ? 6 : 10;
        int iRemoveUnsynchronization = c2020bDecodeHeader.f14595c;
        if (c2020bDecodeHeader.f14594b) {
            iRemoveUnsynchronization = removeUnsynchronization(ihcVar, c2020bDecodeHeader.f14595c);
        }
        ihcVar.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(ihcVar, c2020bDecodeHeader.f14593a, i2, false)) {
            if (c2020bDecodeHeader.f14593a != 4 || !validateFrames(ihcVar, 4, i2, true)) {
                yh9.m25919w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c2020bDecodeHeader.f14593a);
                return null;
            }
            z = true;
        }
        while (ihcVar.bytesLeft() >= i2) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(c2020bDecodeHeader.f14593a, ihcVar, z, i2, this.f14592a);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    public br7(@hib InterfaceC2019a interfaceC2019a) {
        this.f14592a = interfaceC2019a;
    }
}
