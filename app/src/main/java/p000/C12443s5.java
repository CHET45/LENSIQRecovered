package p000;

import com.blankj.utilcode.util.C2478k;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import p000.kq6;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C12443s5 {

    /* JADX INFO: renamed from: a */
    public static final int f80660a = 80000;

    /* JADX INFO: renamed from: b */
    public static final int f80661b = 768000;

    /* JADX INFO: renamed from: c */
    public static final int f80662c = 3062500;

    /* JADX INFO: renamed from: d */
    public static final int f80663d = 16;

    /* JADX INFO: renamed from: e */
    public static final int f80664e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f80665f = 256;

    /* JADX INFO: renamed from: g */
    public static final int f80666g = 1536;

    /* JADX INFO: renamed from: h */
    public static final int[] f80667h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i */
    public static final int[] f80668i = {48000, 44100, 32000};

    /* JADX INFO: renamed from: j */
    public static final int[] f80669j = {24000, 22050, 16000};

    /* JADX INFO: renamed from: k */
    public static final int[] f80670k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l */
    public static final int[] f80671l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, Videoio.CAP_PROP_XI_WB_KR, 512, 576, Imgcodecs.IMWRITE_JPEGXL_QUALITY};

    /* JADX INFO: renamed from: m */
    public static final int[] f80672m = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, Videoio.CAP_PROP_XI_AE_MAX_LIMIT, Videoio.CAP_PROP_XI_CC_MATRIX_20, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: s5$b */
    public static final class b {

        /* JADX INFO: renamed from: h */
        public static final int f80673h = -1;

        /* JADX INFO: renamed from: i */
        public static final int f80674i = 0;

        /* JADX INFO: renamed from: j */
        public static final int f80675j = 1;

        /* JADX INFO: renamed from: k */
        public static final int f80676k = 2;

        /* JADX INFO: renamed from: a */
        @hib
        public final String f80677a;

        /* JADX INFO: renamed from: b */
        public final int f80678b;

        /* JADX INFO: renamed from: c */
        public final int f80679c;

        /* JADX INFO: renamed from: d */
        public final int f80680d;

        /* JADX INFO: renamed from: e */
        public final int f80681e;

        /* JADX INFO: renamed from: f */
        public final int f80682f;

        /* JADX INFO: renamed from: g */
        public final int f80683g;

        /* JADX INFO: renamed from: s5$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private b(@hib String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f80677a = str;
            this.f80678b = i;
            this.f80680d = i2;
            this.f80679c = i3;
            this.f80681e = i4;
            this.f80682f = i5;
            this.f80683g = i6;
        }
    }

    private C12443s5() {
    }

    private static int calculateEac3Bitrate(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((x0i.getBigEndianInt(byteBuffer, i + 4) & (-2)) == -126718022) {
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
        int[] iArr = f80668i;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f80672m;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f80671l[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static kq6 parseAc3AnnexFFormat(ihc ihcVar, String str, String str2, @hib DrmInitData drmInitData) {
        ghc ghcVar = new ghc();
        ghcVar.reset(ihcVar);
        int i = f80668i[ghcVar.readBits(2)];
        ghcVar.skipBits(8);
        int i2 = f80670k[ghcVar.readBits(3)];
        if (ghcVar.readBits(1) != 0) {
            i2++;
        }
        int i3 = f80671l[ghcVar.readBits(5)] * 1000;
        ghcVar.byteAlign();
        ihcVar.setPosition(ghcVar.getBytePosition());
        return new kq6.C8497b().setId(str).setSampleMimeType("audio/ac3").setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i3).setPeakBitrate(i3).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & C2478k.f17681i) >> 3) > 10) {
            return f80667h[((byteBuffer.get(byteBuffer.position() + 4) & k95.f53214o7) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static b parseAc3SyncframeInfo(ghc ghcVar) {
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
        int position = ghcVar.getPosition();
        ghcVar.skipBits(40);
        boolean z = ghcVar.readBits(5) > 10;
        ghcVar.setPosition(position);
        int i13 = -1;
        if (z) {
            ghcVar.skipBits(16);
            int bits = ghcVar.readBits(2);
            if (bits == 0) {
                i13 = 0;
            } else if (bits == 1) {
                i13 = 1;
            } else if (bits == 2) {
                i13 = 2;
            }
            ghcVar.skipBits(3);
            int bits2 = (ghcVar.readBits(11) + 1) * 2;
            int bits3 = ghcVar.readBits(2);
            if (bits3 == 3) {
                i8 = f80669j[ghcVar.readBits(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int bits4 = ghcVar.readBits(2);
                int i14 = f80667h[bits4];
                i7 = bits4;
                i8 = f80668i[bits3];
                i9 = i14;
            }
            int i15 = i9 * 256;
            int iCalculateEac3Bitrate = calculateEac3Bitrate(bits2, i8, i9);
            int bits5 = ghcVar.readBits(3);
            boolean bit = ghcVar.readBit();
            i = f80670k[bits5] + (bit ? 1 : 0);
            ghcVar.skipBits(10);
            if (ghcVar.readBit()) {
                ghcVar.skipBits(8);
            }
            if (bits5 == 0) {
                ghcVar.skipBits(5);
                if (ghcVar.readBit()) {
                    ghcVar.skipBits(8);
                }
            }
            if (i13 == 1 && ghcVar.readBit()) {
                ghcVar.skipBits(16);
            }
            if (ghcVar.readBit()) {
                if (bits5 > 2) {
                    ghcVar.skipBits(2);
                }
                if ((bits5 & 1) == 0 || bits5 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    ghcVar.skipBits(6);
                }
                if ((bits5 & 4) != 0) {
                    ghcVar.skipBits(i11);
                }
                if (bit && ghcVar.readBit()) {
                    ghcVar.skipBits(5);
                }
                if (i13 == 0) {
                    if (ghcVar.readBit()) {
                        i12 = 6;
                        ghcVar.skipBits(6);
                    } else {
                        i12 = 6;
                    }
                    if (bits5 == 0 && ghcVar.readBit()) {
                        ghcVar.skipBits(i12);
                    }
                    if (ghcVar.readBit()) {
                        ghcVar.skipBits(i12);
                    }
                    int bits6 = ghcVar.readBits(2);
                    if (bits6 == 1) {
                        ghcVar.skipBits(5);
                    } else if (bits6 == 2) {
                        ghcVar.skipBits(12);
                    } else if (bits6 == 3) {
                        int bits7 = ghcVar.readBits(5);
                        if (ghcVar.readBit()) {
                            ghcVar.skipBits(5);
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(4);
                            }
                            if (ghcVar.readBit()) {
                                if (ghcVar.readBit()) {
                                    ghcVar.skipBits(4);
                                }
                                if (ghcVar.readBit()) {
                                    ghcVar.skipBits(4);
                                }
                            }
                        }
                        if (ghcVar.readBit()) {
                            ghcVar.skipBits(5);
                            if (ghcVar.readBit()) {
                                ghcVar.skipBits(7);
                                if (ghcVar.readBit()) {
                                    ghcVar.skipBits(8);
                                }
                            }
                        }
                        ghcVar.skipBits((bits7 + 2) * 8);
                        ghcVar.byteAlign();
                    }
                    if (bits5 < 2) {
                        if (ghcVar.readBit()) {
                            ghcVar.skipBits(14);
                        }
                        if (bits5 == 0 && ghcVar.readBit()) {
                            ghcVar.skipBits(14);
                        }
                    }
                    if (ghcVar.readBit()) {
                        if (i7 == 0) {
                            ghcVar.skipBits(5);
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (ghcVar.readBit()) {
                                    ghcVar.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (ghcVar.readBit()) {
                ghcVar.skipBits(5);
                if (bits5 == 2) {
                    ghcVar.skipBits(4);
                }
                if (bits5 >= 6) {
                    ghcVar.skipBits(2);
                }
                if (ghcVar.readBit()) {
                    ghcVar.skipBits(8);
                }
                if (bits5 == 0 && ghcVar.readBit()) {
                    ghcVar.skipBits(8);
                }
                if (bits3 < 3) {
                    ghcVar.skipBit();
                }
            }
            if (i13 == 0 && i7 != 3) {
                ghcVar.skipBit();
            }
            if (i13 == 2 && (i7 == 3 || ghcVar.readBit())) {
                i10 = 6;
                ghcVar.skipBits(6);
            } else {
                i10 = 6;
            }
            str = (ghcVar.readBit() && ghcVar.readBits(i10) == 1 && ghcVar.readBits(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i13;
            i3 = i15;
            i5 = bits2;
            i6 = i8;
            i4 = iCalculateEac3Bitrate;
        } else {
            ghcVar.skipBits(32);
            int bits8 = ghcVar.readBits(2);
            String str2 = bits8 == 3 ? null : "audio/ac3";
            int bits9 = ghcVar.readBits(6);
            int i17 = f80671l[bits9 / 2] * 1000;
            int ac3SyncframeSize = getAc3SyncframeSize(bits8, bits9);
            ghcVar.skipBits(8);
            int bits10 = ghcVar.readBits(3);
            if ((bits10 & 1) != 0 && bits10 != 1) {
                ghcVar.skipBits(2);
            }
            if ((bits10 & 4) != 0) {
                ghcVar.skipBits(2);
            }
            if (bits10 == 2) {
                ghcVar.skipBits(2);
            }
            int[] iArr = f80668i;
            int i18 = bits8 < iArr.length ? iArr[bits8] : -1;
            i = f80670k[bits10] + (ghcVar.readBit() ? 1 : 0);
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
    public static p000.kq6 parseEAc3AnnexFFormat(p000.ihc r7, java.lang.String r8, java.lang.String r9, @p000.hib com.google.android.exoplayer2.drm.DrmInitData r10) {
        /*
            ghc r0 = new ghc
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = p000.C12443s5.f80668i
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = p000.C12443s5.f80670k
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
            kq6$b r7 = new kq6$b
            r7.<init>()
            kq6$b r7 = r7.setId(r8)
            kq6$b r7 = r7.setSampleMimeType(r2)
            kq6$b r7 = r7.setChannelCount(r4)
            kq6$b r7 = r7.setSampleRate(r3)
            kq6$b r7 = r7.setDrmInitData(r10)
            kq6$b r7 = r7.setLanguage(r9)
            kq6$b r7 = r7.setPeakBitrate(r1)
            kq6 r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12443s5.parseEAc3AnnexFFormat(ihc, java.lang.String, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData):kq6");
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
