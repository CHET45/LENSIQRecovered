package p000;

import android.util.Pair;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.ib0;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class jb0 {

    /* JADX INFO: renamed from: a */
    public static final String f50146a = "AtomParsers";

    /* JADX INFO: renamed from: b */
    public static final int f50147b = 1668047728;

    /* JADX INFO: renamed from: c */
    public static final int f50148c = 1835299937;

    /* JADX INFO: renamed from: d */
    public static final int f50149d = 1835365473;

    /* JADX INFO: renamed from: e */
    public static final int f50150e = 1852009571;

    /* JADX INFO: renamed from: f */
    public static final int f50151f = 1852009592;

    /* JADX INFO: renamed from: g */
    public static final int f50152g = 1935832172;

    /* JADX INFO: renamed from: h */
    public static final int f50153h = 1936684398;

    /* JADX INFO: renamed from: i */
    public static final int f50154i = 1937072756;

    /* JADX INFO: renamed from: j */
    public static final int f50155j = 1952807028;

    /* JADX INFO: renamed from: k */
    public static final int f50156k = 1986618469;

    /* JADX INFO: renamed from: l */
    public static final int f50157l = 4;

    /* JADX INFO: renamed from: m */
    public static final byte[] f50158m = x0i.getUtf8Bytes("OpusHead");

    /* JADX INFO: renamed from: jb0$a */
    public static final class C7829a {

        /* JADX INFO: renamed from: a */
        public final int f50159a;

        /* JADX INFO: renamed from: b */
        public int f50160b;

        /* JADX INFO: renamed from: c */
        public int f50161c;

        /* JADX INFO: renamed from: d */
        public long f50162d;

        /* JADX INFO: renamed from: e */
        public final boolean f50163e;

        /* JADX INFO: renamed from: f */
        public final ihc f50164f;

        /* JADX INFO: renamed from: g */
        public final ihc f50165g;

        /* JADX INFO: renamed from: h */
        public int f50166h;

        /* JADX INFO: renamed from: i */
        public int f50167i;

        public C7829a(ihc ihcVar, ihc ihcVar2, boolean z) throws xhc {
            this.f50165g = ihcVar;
            this.f50164f = ihcVar2;
            this.f50163e = z;
            ihcVar2.setPosition(12);
            this.f50159a = ihcVar2.readUnsignedIntToInt();
            ihcVar.setPosition(12);
            this.f50167i = ihcVar.readUnsignedIntToInt();
            dk5.checkContainerInput(ihcVar.readInt() == 1, "first_chunk must be 1");
            this.f50160b = -1;
        }

        public boolean moveNext() {
            int i = this.f50160b + 1;
            this.f50160b = i;
            if (i == this.f50159a) {
                return false;
            }
            this.f50162d = this.f50163e ? this.f50164f.readUnsignedLongToLong() : this.f50164f.readUnsignedInt();
            if (this.f50160b == this.f50166h) {
                this.f50161c = this.f50165g.readUnsignedIntToInt();
                this.f50165g.skipBytes(4);
                int i2 = this.f50167i - 1;
                this.f50167i = i2;
                this.f50166h = i2 > 0 ? this.f50165g.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: jb0$b */
    public static final class C7830b {

        /* JADX INFO: renamed from: a */
        public final String f50168a;

        /* JADX INFO: renamed from: b */
        public final byte[] f50169b;

        /* JADX INFO: renamed from: c */
        public final long f50170c;

        /* JADX INFO: renamed from: d */
        public final long f50171d;

        public C7830b(String str, byte[] bArr, long j, long j2) {
            this.f50168a = str;
            this.f50169b = bArr;
            this.f50170c = j;
            this.f50171d = j2;
        }
    }

    /* JADX INFO: renamed from: jb0$c */
    public static final class C7831c {

        /* JADX INFO: renamed from: a */
        public final Metadata f50172a;

        /* JADX INFO: renamed from: b */
        public final long f50173b;

        public C7831c(Metadata metadata, long j) {
            this.f50172a = metadata;
            this.f50173b = j;
        }
    }

    /* JADX INFO: renamed from: jb0$d */
    public interface InterfaceC7832d {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: renamed from: jb0$e */
    public static final class C7833e {

        /* JADX INFO: renamed from: e */
        public static final int f50174e = 8;

        /* JADX INFO: renamed from: a */
        public final a6h[] f50175a;

        /* JADX INFO: renamed from: b */
        @hib
        public kq6 f50176b;

        /* JADX INFO: renamed from: c */
        public int f50177c;

        /* JADX INFO: renamed from: d */
        public int f50178d = 0;

        public C7833e(int i) {
            this.f50175a = new a6h[i];
        }
    }

    /* JADX INFO: renamed from: jb0$f */
    public static final class C7834f implements InterfaceC7832d {

        /* JADX INFO: renamed from: a */
        public final int f50179a;

        /* JADX INFO: renamed from: b */
        public final int f50180b;

        /* JADX INFO: renamed from: c */
        public final ihc f50181c;

        public C7834f(ib0.C7223b c7223b, kq6 kq6Var) {
            ihc ihcVar = c7223b.f46427E1;
            this.f50181c = ihcVar;
            ihcVar.setPosition(12);
            int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
            if ("audio/raw".equals(kq6Var.f54989M)) {
                int pcmFrameSize = x0i.getPcmFrameSize(kq6Var.f55010g2, kq6Var.f55007e2);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    yh9.m25919w(jb0.f50146a, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.f50179a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.f50180b = ihcVar.readUnsignedIntToInt();
        }

        @Override // p000.jb0.InterfaceC7832d
        public int getFixedSampleSize() {
            return this.f50179a;
        }

        @Override // p000.jb0.InterfaceC7832d
        public int getSampleCount() {
            return this.f50180b;
        }

        @Override // p000.jb0.InterfaceC7832d
        public int readNextSampleSize() {
            int i = this.f50179a;
            return i == -1 ? this.f50181c.readUnsignedIntToInt() : i;
        }
    }

    /* JADX INFO: renamed from: jb0$g */
    public static final class C7835g implements InterfaceC7832d {

        /* JADX INFO: renamed from: a */
        public final ihc f50182a;

        /* JADX INFO: renamed from: b */
        public final int f50183b;

        /* JADX INFO: renamed from: c */
        public final int f50184c;

        /* JADX INFO: renamed from: d */
        public int f50185d;

        /* JADX INFO: renamed from: e */
        public int f50186e;

        public C7835g(ib0.C7223b c7223b) {
            ihc ihcVar = c7223b.f46427E1;
            this.f50182a = ihcVar;
            ihcVar.setPosition(12);
            this.f50184c = ihcVar.readUnsignedIntToInt() & 255;
            this.f50183b = ihcVar.readUnsignedIntToInt();
        }

        @Override // p000.jb0.InterfaceC7832d
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // p000.jb0.InterfaceC7832d
        public int getSampleCount() {
            return this.f50183b;
        }

        @Override // p000.jb0.InterfaceC7832d
        public int readNextSampleSize() {
            int i = this.f50184c;
            if (i == 8) {
                return this.f50182a.readUnsignedByte();
            }
            if (i == 16) {
                return this.f50182a.readUnsignedShort();
            }
            int i2 = this.f50185d;
            this.f50185d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f50186e & 15;
            }
            int unsignedByte = this.f50182a.readUnsignedByte();
            this.f50186e = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: jb0$h */
    public static final class C7836h {

        /* JADX INFO: renamed from: a */
        public final int f50187a;

        /* JADX INFO: renamed from: b */
        public final long f50188b;

        /* JADX INFO: renamed from: c */
        public final int f50189c;

        public C7836h(int i, long j, int i2) {
            this.f50187a = i;
            this.f50188b = j;
            this.f50189c = i2;
        }
    }

    /* JADX INFO: renamed from: jb0$i */
    public static final class C7837i {

        /* JADX INFO: renamed from: a */
        @hib
        public final Metadata f50190a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Metadata f50191b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Metadata f50192c;

        public C7837i(@hib Metadata metadata, @hib Metadata metadata2, @hib Metadata metadata3) {
            this.f50190a = metadata;
            this.f50191b = metadata2;
            this.f50192c = metadata3;
        }
    }

    private jb0() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static Pair<Integer, a6h> m13919a(ihc ihcVar, int i, int i2) throws xhc {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            ihcVar.setPosition(i3);
            int i6 = ihcVar.readInt();
            int i7 = ihcVar.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(ihcVar.readInt());
            } else if (i7 == 1935894637) {
                ihcVar.skipBytes(4);
                string = ihcVar.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        dk5.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        dk5.checkContainerInput(i4 != -1, "schi atom is mandatory");
        a6h schiFromParent = parseSchiFromParent(ihcVar, i4, i5, string);
        dk5.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (a6h) x0i.castNonNull(schiFromParent));
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[x0i.constrainValue(4, 0, length)] && jArr[x0i.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    private static int findBoxPosition(ihc ihcVar, int i, int i2, int i3) throws xhc {
        int position = ihcVar.getPosition();
        dk5.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            ihcVar.setPosition(position);
            int i4 = ihcVar.readInt();
            dk5.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (ihcVar.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ihc ihcVar) {
        int position = ihcVar.getPosition();
        ihcVar.skipBytes(4);
        if (ihcVar.readInt() != 1751411826) {
            position += 4;
        }
        ihcVar.setPosition(position);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseAudioSampleEntry(p000.ihc r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @p000.hib com.google.android.exoplayer2.drm.DrmInitData r29, p000.jb0.C7833e r30, int r31) throws p000.xhc {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jb0.parseAudioSampleEntry(ihc, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, jb0$e, int):void");
    }

    @hib
    private static Pair<long[], long[]> parseEdts(ib0.C7222a c7222a) {
        ib0.C7223b leafAtomOfType = c7222a.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ihc ihcVar = leafAtomOfType.f46427E1;
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? ihcVar.readUnsignedLongToLong() : ihcVar.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? ihcVar.readLong() : ihcVar.readInt();
            if (ihcVar.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            ihcVar.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C7830b parseEsdsFromParent(ihc ihcVar, int i) {
        ihcVar.setPosition(i + 12);
        ihcVar.skipBytes(1);
        parseExpandableClassSize(ihcVar);
        ihcVar.skipBytes(2);
        int unsignedByte = ihcVar.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            ihcVar.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            ihcVar.skipBytes(ihcVar.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            ihcVar.skipBytes(2);
        }
        ihcVar.skipBytes(1);
        parseExpandableClassSize(ihcVar);
        String mimeTypeFromMp4ObjectType = sva.getMimeTypeFromMp4ObjectType(ihcVar.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new C7830b(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        ihcVar.skipBytes(4);
        long unsignedInt = ihcVar.readUnsignedInt();
        long unsignedInt2 = ihcVar.readUnsignedInt();
        ihcVar.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(ihcVar);
        byte[] bArr = new byte[expandableClassSize];
        ihcVar.readBytes(bArr, 0, expandableClassSize);
        return new C7830b(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ihc ihcVar) {
        int unsignedByte = ihcVar.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = ihcVar.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    private static int parseHdlr(ihc ihcVar) {
        ihcVar.setPosition(16);
        return ihcVar.readInt();
    }

    @hib
    private static Metadata parseIlst(ihc ihcVar, int i) {
        ihcVar.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (ihcVar.getPosition() < i) {
            Metadata.Entry ilstElement = lua.parseIlstElement(ihcVar);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ihc ihcVar) {
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        ihcVar.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = ihcVar.readUnsignedInt();
        ihcVar.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = ihcVar.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    @hib
    public static Metadata parseMdtaFromMeta(ib0.C7222a c7222a) {
        ib0.C7223b leafAtomOfType = c7222a.getLeafAtomOfType(1751411826);
        ib0.C7223b leafAtomOfType2 = c7222a.getLeafAtomOfType(1801812339);
        ib0.C7223b leafAtomOfType3 = c7222a.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.f46427E1) != 1835299937) {
            return null;
        }
        ihc ihcVar = leafAtomOfType2.f46427E1;
        ihcVar.setPosition(12);
        int i = ihcVar.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ihcVar.readInt();
            ihcVar.skipBytes(4);
            strArr[i2] = ihcVar.readString(i3 - 8);
        }
        ihc ihcVar2 = leafAtomOfType3.f46427E1;
        ihcVar2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (ihcVar2.bytesLeft() > 8) {
            int position = ihcVar2.getPosition();
            int i4 = ihcVar2.readInt();
            int i5 = ihcVar2.readInt() - 1;
            if (i5 < 0 || i5 >= i) {
                yh9.m25919w(f50146a, "Skipped metadata with unknown key index: " + i5);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = lua.parseMdtaMetadataEntryFromIlst(ihcVar2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            ihcVar2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ihc ihcVar, int i, int i2, int i3, C7833e c7833e) {
        ihcVar.setPosition(i2 + 16);
        if (i == 1835365492) {
            ihcVar.readNullTerminatedString();
            String nullTerminatedString = ihcVar.readNullTerminatedString();
            if (nullTerminatedString != null) {
                c7833e.f50176b = new kq6.C8497b().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static C7831c parseMvhd(ihc ihcVar) {
        long unsignedInt;
        ihcVar.setPosition(8);
        if (ib0.parseFullAtomVersion(ihcVar.readInt()) == 0) {
            unsignedInt = ihcVar.readUnsignedInt();
            ihcVar.skipBytes(4);
        } else {
            long j = ihcVar.readLong();
            ihcVar.skipBytes(8);
            unsignedInt = j;
        }
        return new C7831c(new Metadata(new CreationTime((unsignedInt - ((long) i1b.f45429e)) * 1000)), ihcVar.readUnsignedInt());
    }

    private static float parsePaspFromParent(ihc ihcVar, int i) {
        ihcVar.setPosition(i + 8);
        return ihcVar.readUnsignedIntToInt() / ihcVar.readUnsignedIntToInt();
    }

    @hib
    private static byte[] parseProjFromParent(ihc ihcVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            ihcVar.setPosition(i3);
            int i4 = ihcVar.readInt();
            if (ihcVar.readInt() == 1886547818) {
                return Arrays.copyOfRange(ihcVar.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    @hib
    private static Pair<Integer, a6h> parseSampleEntryEncryptionData(ihc ihcVar, int i, int i2) throws xhc {
        Pair<Integer, a6h> pairM13919a;
        int position = ihcVar.getPosition();
        while (position - i < i2) {
            ihcVar.setPosition(position);
            int i3 = ihcVar.readInt();
            dk5.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (ihcVar.readInt() == 1936289382 && (pairM13919a = m13919a(ihcVar, position, i3)) != null) {
                return pairM13919a;
            }
            position += i3;
        }
        return null;
    }

    @hib
    private static a6h parseSchiFromParent(ihc ihcVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            ihcVar.setPosition(i5);
            int i6 = ihcVar.readInt();
            if (ihcVar.readInt() == 1952804451) {
                int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
                ihcVar.skipBytes(1);
                if (fullAtomVersion == 0) {
                    ihcVar.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = ihcVar.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = ihcVar.readUnsignedByte() == 1;
                int unsignedByte2 = ihcVar.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                ihcVar.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = ihcVar.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    ihcVar.readBytes(bArr, 0, unsignedByte3);
                }
                return new a6h(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    @hib
    private static Metadata parseSmta(ihc ihcVar, int i) {
        ihcVar.skipBytes(12);
        while (ihcVar.getPosition() < i) {
            int position = ihcVar.getPosition();
            int i2 = ihcVar.readInt();
            if (ihcVar.readInt() == 1935766900) {
                if (i2 < 14) {
                    return null;
                }
                ihcVar.skipBytes(5);
                int unsignedByte = ihcVar.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f = unsignedByte == 12 ? 240.0f : 120.0f;
                ihcVar.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f, ihcVar.readUnsignedByte()));
            }
            ihcVar.setPosition(position + i2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0429 A[EDGE_INSN: B:215:0x0429->B:170:0x0429 BREAK  A[LOOP:2: B:153:0x03c8->B:169:0x0422], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.s6h parseStbl(p000.z5h r37, p000.ib0.C7222a r38, p000.n27 r39) throws p000.xhc {
        /*
            Method dump skipped, instruction units count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jb0.parseStbl(z5h, ib0$a, n27):s6h");
    }

    private static C7833e parseStsd(ihc ihcVar, int i, int i2, String str, @hib DrmInitData drmInitData, boolean z) throws xhc {
        int i3;
        ihcVar.setPosition(12);
        int i4 = ihcVar.readInt();
        C7833e c7833e = new C7833e(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int position = ihcVar.getPosition();
            int i6 = ihcVar.readInt();
            dk5.checkContainerInput(i6 > 0, "childAtomSize must be positive");
            int i7 = ihcVar.readInt();
            if (i7 == 1635148593 || i7 == 1635148595 || i7 == 1701733238 || i7 == 1831958048 || i7 == 1836070006 || i7 == 1752589105 || i7 == 1751479857 || i7 == 1932670515 || i7 == 1211250227 || i7 == 1987063864 || i7 == 1987063865 || i7 == 1635135537 || i7 == 1685479798 || i7 == 1685479729 || i7 == 1685481573 || i7 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(ihcVar, i7, i3, i6, i, i2, drmInitData, c7833e, i5);
            } else if (i7 == 1836069985 || i7 == 1701733217 || i7 == 1633889587 || i7 == 1700998451 || i7 == 1633889588 || i7 == 1835823201 || i7 == 1685353315 || i7 == 1685353317 || i7 == 1685353320 || i7 == 1685353324 || i7 == 1685353336 || i7 == 1935764850 || i7 == 1935767394 || i7 == 1819304813 || i7 == 1936684916 || i7 == 1953984371 || i7 == 778924082 || i7 == 778924083 || i7 == 1835557169 || i7 == 1835560241 || i7 == 1634492771 || i7 == 1634492791 || i7 == 1970037111 || i7 == 1332770163 || i7 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(ihcVar, i7, position, i6, i, str, z, drmInitData, c7833e, i5);
            } else {
                if (i7 == 1414810956 || i7 == 1954034535 || i7 == 2004251764 || i7 == 1937010800 || i7 == 1664495672) {
                    parseTextSampleEntry(ihcVar, i7, position, i6, i, str, c7833e);
                } else if (i7 == 1835365492) {
                    parseMetaDataSampleEntry(ihcVar, i7, position, i, c7833e);
                } else if (i7 == 1667329389) {
                    c7833e.f50176b = new kq6.C8497b().setId(i).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            ihcVar.setPosition(i3 + i6);
        }
        return c7833e;
    }

    private static void parseTextSampleEntry(ihc ihcVar, int i, int i2, int i3, int i4, String str, C7833e c7833e) {
        ihcVar.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        kx7 kx7VarM15111of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                ihcVar.readBytes(bArr, 0, i5);
                kx7VarM15111of = kx7.m15111of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                c7833e.f50178d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        c7833e.f50176b = new kq6.C8497b().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(kx7VarM15111of).build();
    }

    private static C7836h parseTkhd(ihc ihcVar) {
        long j;
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        ihcVar.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = ihcVar.readInt();
        ihcVar.skipBytes(4);
        int position = ihcVar.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i4 >= i2) {
                ihcVar.skipBytes(i2);
                break;
            }
            if (ihcVar.getData()[position + i4] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? ihcVar.readUnsignedInt() : ihcVar.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j = unsignedInt;
                }
            } else {
                i4++;
            }
        }
        ihcVar.skipBytes(16);
        int i5 = ihcVar.readInt();
        int i6 = ihcVar.readInt();
        ihcVar.skipBytes(4);
        int i7 = ihcVar.readInt();
        int i8 = ihcVar.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new C7836h(i, j, i3);
    }

    @hib
    private static z5h parseTrak(ib0.C7222a c7222a, ib0.C7223b c7223b, long j, @hib DrmInitData drmInitData, boolean z, boolean z2) throws xhc {
        ib0.C7223b c7223b2;
        long j2;
        long[] jArr;
        long[] jArr2;
        ib0.C7222a containerAtomOfType;
        Pair<long[], long[]> edts;
        ib0.C7222a c7222a2 = (ib0.C7222a) u80.checkNotNull(c7222a.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((ib0.C7223b) u80.checkNotNull(c7222a2.getLeafAtomOfType(1751411826))).f46427E1));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        C7836h tkhd = parseTkhd(((ib0.C7223b) u80.checkNotNull(c7222a.getLeafAtomOfType(1953196132))).f46427E1);
        if (j == -9223372036854775807L) {
            c7223b2 = c7223b;
            j2 = tkhd.f50188b;
        } else {
            c7223b2 = c7223b;
            j2 = j;
        }
        long j3 = parseMvhd(c7223b2.f46427E1).f50173b;
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? x0i.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        ib0.C7222a c7222a3 = (ib0.C7222a) u80.checkNotNull(((ib0.C7222a) u80.checkNotNull(c7222a2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> mdhd = parseMdhd(((ib0.C7223b) u80.checkNotNull(c7222a2.getLeafAtomOfType(1835296868))).f46427E1);
        ib0.C7223b leafAtomOfType = c7222a3.getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw xhc.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        C7833e stsd = parseStsd(leafAtomOfType.f46427E1, tkhd.f50187a, tkhd.f50189c, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = c7222a.getContainerAtomOfType(1701082227)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.f50176b == null) {
            return null;
        }
        return new z5h(tkhd.f50187a, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j3, jScaleLargeTimestamp, stsd.f50176b, stsd.f50178d, stsd.f50175a, stsd.f50177c, jArr, jArr2);
    }

    public static List<s6h> parseTraks(ib0.C7222a c7222a, n27 n27Var, long j, @hib DrmInitData drmInitData, boolean z, boolean z2, lz6<z5h, z5h> lz6Var) throws xhc {
        z5h z5hVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c7222a.f46426G1.size(); i++) {
            ib0.C7222a c7222a2 = c7222a.f46426G1.get(i);
            if (c7222a2.f46423a == 1953653099 && (z5hVarApply = lz6Var.apply(parseTrak(c7222a2, (ib0.C7223b) u80.checkNotNull(c7222a.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(z5hVarApply, (ib0.C7222a) u80.checkNotNull(((ib0.C7222a) u80.checkNotNull(((ib0.C7222a) u80.checkNotNull(c7222a2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), n27Var));
            }
        }
        return arrayList;
    }

    public static C7837i parseUdta(ib0.C7223b c7223b) {
        ihc ihcVar = c7223b.f46427E1;
        ihcVar.setPosition(8);
        Metadata udtaMeta = null;
        Metadata smta = null;
        Metadata xyz = null;
        while (ihcVar.bytesLeft() >= 8) {
            int position = ihcVar.getPosition();
            int i = ihcVar.readInt();
            int i2 = ihcVar.readInt();
            if (i2 == 1835365473) {
                ihcVar.setPosition(position);
                udtaMeta = parseUdtaMeta(ihcVar, position + i);
            } else if (i2 == 1936553057) {
                ihcVar.setPosition(position);
                smta = parseSmta(ihcVar, position + i);
            } else if (i2 == -1451722374) {
                xyz = parseXyz(ihcVar);
            }
            ihcVar.setPosition(position + i);
        }
        return new C7837i(udtaMeta, smta, xyz);
    }

    @hib
    private static Metadata parseUdtaMeta(ihc ihcVar, int i) {
        ihcVar.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(ihcVar);
        while (ihcVar.getPosition() < i) {
            int position = ihcVar.getPosition();
            int i2 = ihcVar.readInt();
            if (ihcVar.readInt() == 1768715124) {
                ihcVar.setPosition(position);
                return parseIlst(ihcVar, position + i2);
            }
            ihcVar.setPosition(position + i2);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ihc ihcVar, int i, int i2, int i3, int i4, int i5, @hib DrmInitData drmInitData, C7833e c7833e, int i6) throws xhc {
        String str;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        float f;
        List<byte[]> list;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        int i13;
        String str3;
        int i14 = i2;
        int i15 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        C7833e c7833e2 = c7833e;
        ihcVar.setPosition(i14 + 16);
        ihcVar.skipBytes(16);
        int unsignedShort = ihcVar.readUnsignedShort();
        int unsignedShort2 = ihcVar.readUnsignedShort();
        ihcVar.skipBytes(50);
        int position = ihcVar.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, a6h> sampleEntryEncryptionData = parseSampleEntryEncryptionData(ihcVar, i14, i15);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((a6h) sampleEntryEncryptionData.second).f515b);
                c7833e2.f50175a[i6] = (a6h) sampleEntryEncryptionData.second;
            }
            ihcVar.setPosition(position);
        }
        String str4 = "video/3gpp";
        String str5 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        String str6 = null;
        List<byte[]> listM15111of = null;
        byte[] projFromParent = null;
        int i16 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i17 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        C7830b esdsFromParent = null;
        boolean z = false;
        while (position - i14 < i15) {
            ihcVar.setPosition(position);
            int position2 = ihcVar.getPosition();
            int i18 = ihcVar.readInt();
            if (i18 == 0) {
                str = str4;
                if (ihcVar.getPosition() - i14 == i15) {
                    break;
                }
            } else {
                str = str4;
            }
            dk5.checkContainerInput(i18 > 0, "childAtomSize must be positive");
            int i19 = ihcVar.readInt();
            if (i19 == 1635148611) {
                dk5.checkContainerInput(str5 == null, null);
                ihcVar.setPosition(position2 + 8);
                rm0 rm0Var = rm0.parse(ihcVar);
                listM15111of = rm0Var.f78688a;
                c7833e2.f50177c = rm0Var.f78689b;
                if (!z) {
                    paspFromParent = rm0Var.f78695h;
                }
                str6 = rm0Var.f78696i;
                i11 = rm0Var.f78692e;
                i12 = rm0Var.f78693f;
                i13 = rm0Var.f78694g;
                str3 = "video/avc";
            } else if (i19 == 1752589123) {
                dk5.checkContainerInput(str5 == null, null);
                ihcVar.setPosition(position2 + 8);
                rj7 rj7Var = rj7.parse(ihcVar);
                listM15111of = rj7Var.f78446a;
                c7833e2.f50177c = rj7Var.f78447b;
                if (!z) {
                    paspFromParent = rj7Var.f78453h;
                }
                str6 = rj7Var.f78454i;
                i11 = rj7Var.f78450e;
                i12 = rj7Var.f78451f;
                i13 = rj7Var.f78452g;
                str3 = "video/hevc";
            } else {
                if (i19 == 1685480259 || i19 == 1685485123) {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = unsignedShort2;
                    i8 = iIntValue;
                    f = paspFromParent;
                    list = listM15111of;
                    i9 = iIsoColorPrimariesToColorSpace;
                    i10 = iIsoTransferCharacteristicsToColorTransfer;
                    mj4 mj4Var = mj4.parse(ihcVar);
                    if (mj4Var != null) {
                        str6 = mj4Var.f61127c;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (i19 == 1987076931) {
                        dk5.checkContainerInput(str5 == null, null);
                        str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        ihcVar.setPosition(position2 + 12);
                        ihcVar.skipBytes(2);
                        boolean z2 = (ihcVar.readUnsignedByte() & 1) != 0;
                        int unsignedByte = ihcVar.readUnsignedByte();
                        int unsignedByte2 = ihcVar.readUnsignedByte();
                        iIsoColorPrimariesToColorSpace = f92.isoColorPrimariesToColorSpace(unsignedByte);
                        i17 = z2 ? 1 : 2;
                        iIsoTransferCharacteristicsToColorTransfer = f92.isoTransferCharacteristicsToColorTransfer(unsignedByte2);
                    } else if (i19 == 1635135811) {
                        dk5.checkContainerInput(str5 == null, null);
                        str2 = "video/av01";
                    } else if (i19 == 1668050025) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                        byteBuffer.position(21);
                        byteBuffer.putShort(ihcVar.readShort());
                        byteBuffer.putShort(ihcVar.readShort());
                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = unsignedShort2;
                        i8 = iIntValue;
                        position += i18;
                        i14 = i2;
                        i15 = i3;
                        c7833e2 = c7833e;
                        str4 = str;
                        iIntValue = i8;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        unsignedShort2 = i7;
                    } else if (i19 == 1835295606) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                        short s = ihcVar.readShort();
                        short s2 = ihcVar.readShort();
                        short s3 = ihcVar.readShort();
                        i8 = iIntValue;
                        short s4 = ihcVar.readShort();
                        short s5 = ihcVar.readShort();
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        short s6 = ihcVar.readShort();
                        List<byte[]> list2 = listM15111of;
                        short s7 = ihcVar.readShort();
                        float f2 = paspFromParent;
                        short s8 = ihcVar.readShort();
                        long unsignedInt = ihcVar.readUnsignedInt();
                        long unsignedInt2 = ihcVar.readUnsignedInt();
                        i7 = unsignedShort2;
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
                        listM15111of = list2;
                        paspFromParent = f2;
                        position += i18;
                        i14 = i2;
                        i15 = i3;
                        c7833e2 = c7833e;
                        str4 = str;
                        iIntValue = i8;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        unsignedShort2 = i7;
                    } else {
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i7 = unsignedShort2;
                        i8 = iIntValue;
                        f = paspFromParent;
                        list = listM15111of;
                        if (i19 == 1681012275) {
                            dk5.checkContainerInput(str5 == null, null);
                            str5 = str;
                        } else if (i19 == 1702061171) {
                            dk5.checkContainerInput(str5 == null, null);
                            esdsFromParent = parseEsdsFromParent(ihcVar, position2);
                            String str7 = esdsFromParent.f50168a;
                            byte[] bArr = esdsFromParent.f50169b;
                            listM15111of = bArr != null ? kx7.m15111of(bArr) : list;
                            str5 = str7;
                            paspFromParent = f;
                            position += i18;
                            i14 = i2;
                            i15 = i3;
                            c7833e2 = c7833e;
                            str4 = str;
                            iIntValue = i8;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            unsignedShort2 = i7;
                        } else if (i19 == 1885434736) {
                            paspFromParent = parsePaspFromParent(ihcVar, position2);
                            listM15111of = list;
                            z = true;
                            position += i18;
                            i14 = i2;
                            i15 = i3;
                            c7833e2 = c7833e;
                            str4 = str;
                            iIntValue = i8;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            unsignedShort2 = i7;
                        } else if (i19 == 1937126244) {
                            projFromParent = parseProjFromParent(ihcVar, position2, i18);
                        } else if (i19 == 1936995172) {
                            int unsignedByte3 = ihcVar.readUnsignedByte();
                            ihcVar.skipBytes(3);
                            if (unsignedByte3 == 0) {
                                int unsignedByte4 = ihcVar.readUnsignedByte();
                                if (unsignedByte4 == 0) {
                                    i16 = 0;
                                } else if (unsignedByte4 == 1) {
                                    i16 = 1;
                                } else if (unsignedByte4 == 2) {
                                    i16 = 2;
                                } else if (unsignedByte4 == 3) {
                                    i16 = 3;
                                }
                            }
                        } else {
                            i9 = iIsoColorPrimariesToColorSpace;
                            if (i19 == 1668246642) {
                                i10 = iIsoTransferCharacteristicsToColorTransfer;
                                if (i9 == -1 && i10 == -1) {
                                    int i20 = ihcVar.readInt();
                                    if (i20 == 1852009592 || i20 == 1852009571) {
                                        int unsignedShort3 = ihcVar.readUnsignedShort();
                                        int unsignedShort4 = ihcVar.readUnsignedShort();
                                        ihcVar.skipBytes(2);
                                        boolean z3 = i18 == 19 && (ihcVar.readUnsignedByte() & 128) != 0;
                                        iIsoColorPrimariesToColorSpace = f92.isoColorPrimariesToColorSpace(unsignedShort3);
                                        i17 = z3 ? 1 : 2;
                                        iIsoTransferCharacteristicsToColorTransfer = f92.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                    } else {
                                        yh9.m25919w(f50146a, "Unsupported color type: " + ib0.getAtomTypeString(i20));
                                    }
                                }
                                position += i18;
                                i14 = i2;
                                i15 = i3;
                                c7833e2 = c7833e;
                                str4 = str;
                                iIntValue = i8;
                                drmInitDataCopyWithSchemeType = drmInitData2;
                                unsignedShort2 = i7;
                            } else {
                                i10 = iIsoTransferCharacteristicsToColorTransfer;
                            }
                        }
                        listM15111of = list;
                        paspFromParent = f;
                        position += i18;
                        i14 = i2;
                        i15 = i3;
                        c7833e2 = c7833e;
                        str4 = str;
                        iIntValue = i8;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        unsignedShort2 = i7;
                    }
                    str5 = str2;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = unsignedShort2;
                    i8 = iIntValue;
                    position += i18;
                    i14 = i2;
                    i15 = i3;
                    c7833e2 = c7833e;
                    str4 = str;
                    iIntValue = i8;
                    drmInitDataCopyWithSchemeType = drmInitData2;
                    unsignedShort2 = i7;
                }
                iIsoTransferCharacteristicsToColorTransfer = i10;
                iIsoColorPrimariesToColorSpace = i9;
                listM15111of = list;
                paspFromParent = f;
                position += i18;
                i14 = i2;
                i15 = i3;
                c7833e2 = c7833e;
                str4 = str;
                iIntValue = i8;
                drmInitDataCopyWithSchemeType = drmInitData2;
                unsignedShort2 = i7;
            }
            iIsoTransferCharacteristicsToColorTransfer = i13;
            drmInitData2 = drmInitDataCopyWithSchemeType;
            i7 = unsignedShort2;
            iIsoColorPrimariesToColorSpace = i11;
            i8 = iIntValue;
            i17 = i12;
            str5 = str3;
            position += i18;
            i14 = i2;
            i15 = i3;
            c7833e2 = c7833e;
            str4 = str;
            iIntValue = i8;
            drmInitDataCopyWithSchemeType = drmInitData2;
            unsignedShort2 = i7;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i21 = unsignedShort2;
        float f3 = paspFromParent;
        List<byte[]> list3 = listM15111of;
        int i22 = iIsoColorPrimariesToColorSpace;
        int i23 = iIsoTransferCharacteristicsToColorTransfer;
        if (str5 == null) {
            return;
        }
        kq6.C8497b drmInitData4 = new kq6.C8497b().setId(i4).setSampleMimeType(str5).setCodecs(str6).setWidth(unsignedShort).setHeight(i21).setPixelWidthHeightRatio(f3).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i16).setInitializationData(list3).setDrmInitData(drmInitData3);
        int i24 = i17;
        if (i22 != -1 || i24 != -1 || i23 != -1 || byteBufferAllocateHdrStaticInfo != null) {
            drmInitData4.setColorInfo(new f92(i22, i24, i23, byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null));
        }
        if (esdsFromParent != null) {
            drmInitData4.setAverageBitrate(rd8.saturatedCast(esdsFromParent.f50170c)).setPeakBitrate(rd8.saturatedCast(esdsFromParent.f50171d));
        }
        c7833e.f50176b = drmInitData4.build();
    }

    @hib
    private static Metadata parseXyz(ihc ihcVar) {
        short s = ihcVar.readShort();
        ihcVar.skipBytes(2);
        String string = ihcVar.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }
}
