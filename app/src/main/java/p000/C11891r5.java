package p000;

import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import com.blankj.utilcode.util.C2478k;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C11891r5 {

    /* JADX INFO: renamed from: a */
    public static final int f77039a = 80000;

    /* JADX INFO: renamed from: b */
    public static final int f77040b = 768000;

    /* JADX INFO: renamed from: c */
    public static final int f77041c = 3062500;

    /* JADX INFO: renamed from: d */
    public static final int f77042d = 16;

    /* JADX INFO: renamed from: e */
    public static final int f77043e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f77044f = 256;

    /* JADX INFO: renamed from: g */
    public static final int f77045g = 1536;

    /* JADX INFO: renamed from: h */
    public static final int[] f77046h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i */
    public static final int[] f77047i = {48000, 44100, 32000};

    /* JADX INFO: renamed from: j */
    public static final int[] f77048j = {24000, 22050, 16000};

    /* JADX INFO: renamed from: k */
    public static final int[] f77049k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l */
    public static final int[] f77050l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, Videoio.CAP_PROP_XI_WB_KR, 512, 576, Imgcodecs.IMWRITE_JPEGXL_QUALITY};

    /* JADX INFO: renamed from: m */
    public static final int[] f77051m = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, Videoio.CAP_PROP_XI_AE_MAX_LIMIT, Videoio.CAP_PROP_XI_CC_MATRIX_20, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: r5$b */
    public static final class b {

        /* JADX INFO: renamed from: h */
        public static final int f77052h = -1;

        /* JADX INFO: renamed from: i */
        public static final int f77053i = 0;

        /* JADX INFO: renamed from: j */
        public static final int f77054j = 1;

        /* JADX INFO: renamed from: k */
        public static final int f77055k = 2;

        /* JADX INFO: renamed from: a */
        @hib
        public final String f77056a;

        /* JADX INFO: renamed from: b */
        public final int f77057b;

        /* JADX INFO: renamed from: c */
        public final int f77058c;

        /* JADX INFO: renamed from: d */
        public final int f77059d;

        /* JADX INFO: renamed from: e */
        public final int f77060e;

        /* JADX INFO: renamed from: f */
        public final int f77061f;

        /* JADX INFO: renamed from: g */
        public final int f77062g;

        /* JADX INFO: renamed from: r5$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private b(@hib String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f77056a = str;
            this.f77057b = i;
            this.f77059d = i2;
            this.f77058c = i3;
            this.f77060e = i4;
            this.f77061f = i5;
            this.f77062g = i6;
        }
    }

    private C11891r5() {
    }

    private static int calculateEac3Bitrate(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((t0i.getBigEndianInt(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    private static int getAc3SyncframeSize(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f77047i;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f77051m;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f77050l[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static C1213a parseAc3AnnexFFormat(jhc jhcVar, String str, @hib String str2, @hib DrmInitData drmInitData) {
        hhc hhcVar = new hhc();
        hhcVar.reset(jhcVar);
        int i = f77047i[hhcVar.readBits(2)];
        hhcVar.skipBits(8);
        int i2 = f77049k[hhcVar.readBits(3)];
        if (hhcVar.readBits(1) != 0) {
            i2++;
        }
        int i3 = f77050l[hhcVar.readBits(5)] * 1000;
        hhcVar.byteAlign();
        jhcVar.setPosition(hhcVar.getBytePosition());
        return new C1213a.b().setId(str).setSampleMimeType("audio/ac3").setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i3).setPeakBitrate(i3).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & C2478k.f17681i) >> 3) > 10) {
            return f77046h[((byteBuffer.get(byteBuffer.position() + 4) & k95.f53214o7) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static b parseAc3SyncframeInfo(hhc hhcVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int position = hhcVar.getPosition();
        hhcVar.skipBits(40);
        boolean z = hhcVar.readBits(5) > 10;
        hhcVar.setPosition(position);
        int i13 = -1;
        if (z) {
            hhcVar.skipBits(16);
            int bits = hhcVar.readBits(2);
            if (bits == 0) {
                i13 = 0;
            } else if (bits == 1) {
                i13 = 1;
            } else if (bits == 2) {
                i13 = 2;
            }
            hhcVar.skipBits(3);
            int bits2 = (hhcVar.readBits(11) + 1) * 2;
            int bits3 = hhcVar.readBits(2);
            if (bits3 == 3) {
                i8 = f77048j[hhcVar.readBits(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int bits4 = hhcVar.readBits(2);
                int i14 = f77046h[bits4];
                i7 = bits4;
                i8 = f77047i[bits3];
                i9 = i14;
            }
            int i15 = i9 * 256;
            int iCalculateEac3Bitrate = calculateEac3Bitrate(bits2, i8, i9);
            int bits5 = hhcVar.readBits(3);
            boolean bit = hhcVar.readBit();
            i = f77049k[bits5] + (bit ? 1 : 0);
            hhcVar.skipBits(10);
            if (hhcVar.readBit()) {
                hhcVar.skipBits(8);
            }
            if (bits5 == 0) {
                hhcVar.skipBits(5);
                if (hhcVar.readBit()) {
                    hhcVar.skipBits(8);
                }
            }
            if (i13 == 1 && hhcVar.readBit()) {
                hhcVar.skipBits(16);
            }
            if (hhcVar.readBit()) {
                if (bits5 > 2) {
                    hhcVar.skipBits(2);
                }
                if ((bits5 & 1) == 0 || bits5 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    hhcVar.skipBits(6);
                }
                if ((bits5 & 4) != 0) {
                    hhcVar.skipBits(i11);
                }
                if (bit && hhcVar.readBit()) {
                    hhcVar.skipBits(5);
                }
                if (i13 == 0) {
                    if (hhcVar.readBit()) {
                        i12 = 6;
                        hhcVar.skipBits(6);
                    } else {
                        i12 = 6;
                    }
                    if (bits5 == 0 && hhcVar.readBit()) {
                        hhcVar.skipBits(i12);
                    }
                    if (hhcVar.readBit()) {
                        hhcVar.skipBits(i12);
                    }
                    int bits6 = hhcVar.readBits(2);
                    if (bits6 == 1) {
                        hhcVar.skipBits(5);
                    } else if (bits6 == 2) {
                        hhcVar.skipBits(12);
                    } else if (bits6 == 3) {
                        int bits7 = hhcVar.readBits(5);
                        if (hhcVar.readBit()) {
                            hhcVar.skipBits(5);
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(4);
                            }
                            if (hhcVar.readBit()) {
                                if (hhcVar.readBit()) {
                                    hhcVar.skipBits(4);
                                }
                                if (hhcVar.readBit()) {
                                    hhcVar.skipBits(4);
                                }
                            }
                        }
                        if (hhcVar.readBit()) {
                            hhcVar.skipBits(5);
                            if (hhcVar.readBit()) {
                                hhcVar.skipBits(7);
                                if (hhcVar.readBit()) {
                                    hhcVar.skipBits(8);
                                }
                            }
                        }
                        hhcVar.skipBits((bits7 + 2) * 8);
                        hhcVar.byteAlign();
                    }
                    if (bits5 < 2) {
                        if (hhcVar.readBit()) {
                            hhcVar.skipBits(14);
                        }
                        if (bits5 == 0 && hhcVar.readBit()) {
                            hhcVar.skipBits(14);
                        }
                    }
                    if (hhcVar.readBit()) {
                        if (i7 == 0) {
                            hhcVar.skipBits(5);
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (hhcVar.readBit()) {
                                    hhcVar.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (hhcVar.readBit()) {
                hhcVar.skipBits(5);
                if (bits5 == 2) {
                    hhcVar.skipBits(4);
                }
                if (bits5 >= 6) {
                    hhcVar.skipBits(2);
                }
                if (hhcVar.readBit()) {
                    hhcVar.skipBits(8);
                }
                if (bits5 == 0 && hhcVar.readBit()) {
                    hhcVar.skipBits(8);
                }
                if (bits3 < 3) {
                    hhcVar.skipBit();
                }
            }
            if (i13 == 0 && i7 != 3) {
                hhcVar.skipBit();
            }
            if (i13 == 2 && (i7 == 3 || hhcVar.readBit())) {
                i10 = 6;
                hhcVar.skipBits(6);
            } else {
                i10 = 6;
            }
            str = (hhcVar.readBit() && hhcVar.readBits(i10) == 1 && hhcVar.readBits(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i13;
            i3 = i15;
            i5 = bits2;
            i6 = i8;
            i4 = iCalculateEac3Bitrate;
        } else {
            hhcVar.skipBits(32);
            int bits8 = hhcVar.readBits(2);
            String str2 = bits8 == 3 ? null : "audio/ac3";
            int bits9 = hhcVar.readBits(6);
            int i17 = f77050l[bits9 / 2] * 1000;
            int ac3SyncframeSize = getAc3SyncframeSize(bits8, bits9);
            hhcVar.skipBits(8);
            int bits10 = hhcVar.readBits(3);
            if ((bits10 & 1) != 0 && bits10 != 1) {
                hhcVar.skipBits(2);
            }
            if ((bits10 & 4) != 0) {
                hhcVar.skipBits(2);
            }
            if (bits10 == 2) {
                hhcVar.skipBits(2);
            }
            int[] iArr = f77047i;
            int i18 = bits8 < iArr.length ? iArr[bits8] : -1;
            i = f77049k[bits10] + (hhcVar.readBit() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = 1536;
            i4 = i17;
            i5 = ac3SyncframeSize;
            i6 = i18;
        }
        return new b(str, i2, i, i6, i5, i3, i4);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & C2478k.f17681i) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return getAc3SyncframeSize((b2 & k95.f53214o7) >> 6, b2 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.common.C1213a parseEAc3AnnexFFormat(p000.jhc r7, java.lang.String r8, @p000.hib java.lang.String r9, @p000.hib androidx.media3.common.DrmInitData r10) {
        /*
            hhc r0 = new hhc
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = p000.C11891r5.f77047i
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = p000.C11891r5.f77049k
            int r5 = r0.readBits(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.readBits(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.skipBits(r2)
            r2 = 4
            int r2 = r0.readBits(r2)
            r0.skipBits(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.skipBits(r2)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.skipBits(r5)
        L4f:
            int r2 = r0.bitsLeft()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.skipBits(r6)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r7.setPosition(r0)
            androidx.media3.common.a$b r7 = new androidx.media3.common.a$b
            r7.<init>()
            androidx.media3.common.a$b r7 = r7.setId(r8)
            androidx.media3.common.a$b r7 = r7.setSampleMimeType(r2)
            androidx.media3.common.a$b r7 = r7.setChannelCount(r4)
            androidx.media3.common.a$b r7 = r7.setSampleRate(r3)
            androidx.media3.common.a$b r7 = r7.setDrmInitData(r10)
            androidx.media3.common.a$b r7 = r7.setLanguage(r9)
            androidx.media3.common.a$b r7 = r7.setPeakBitrate(r1)
            androidx.media3.common.a r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11891r5.parseEAc3AnnexFFormat(jhc, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):androidx.media3.common.a");
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
