package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p000.f36;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z26 {

    /* JADX INFO: renamed from: a */
    public static final int f103735a = 1716281667;

    /* JADX INFO: renamed from: b */
    public static final int f103736b = 16382;

    /* JADX INFO: renamed from: c */
    public static final int f103737c = 18;

    /* JADX INFO: renamed from: z26$a */
    public static final class C15939a {

        /* JADX INFO: renamed from: a */
        @hib
        public f36 f103738a;

        public C15939a(@hib f36 f36Var) {
            this.f103738a = f36Var;
        }
    }

    private z26() {
    }

    public static boolean checkAndPeekStreamMarker(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(4);
        zj5Var.peekFully(ihcVar.getData(), 0, 4);
        return ihcVar.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(zj5 zj5Var) throws IOException {
        zj5Var.resetPeekPosition();
        ihc ihcVar = new ihc(2);
        zj5Var.peekFully(ihcVar.getData(), 0, 2);
        int unsignedShort = ihcVar.readUnsignedShort();
        if ((unsignedShort >> 2) == 16382) {
            zj5Var.resetPeekPosition();
            return unsignedShort;
        }
        zj5Var.resetPeekPosition();
        throw xhc.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    @hib
    public static Metadata peekId3Metadata(zj5 zj5Var, boolean z) throws IOException {
        Metadata metadataPeekId3Data = new dr7().peekId3Data(zj5Var, z ? null : br7.f14576b);
        if (metadataPeekId3Data == null || metadataPeekId3Data.length() == 0) {
            return null;
        }
        return metadataPeekId3Data;
    }

    @hib
    public static Metadata readId3Metadata(zj5 zj5Var, boolean z) throws IOException {
        zj5Var.resetPeekPosition();
        long peekPosition = zj5Var.getPeekPosition();
        Metadata metadataPeekId3Metadata = peekId3Metadata(zj5Var, z);
        zj5Var.skipFully((int) (zj5Var.getPeekPosition() - peekPosition));
        return metadataPeekId3Metadata;
    }

    public static boolean readMetadataBlock(zj5 zj5Var, C15939a c15939a) throws IOException {
        zj5Var.resetPeekPosition();
        ghc ghcVar = new ghc(new byte[4]);
        zj5Var.peekFully(ghcVar.f39834a, 0, 4);
        boolean bit = ghcVar.readBit();
        int bits = ghcVar.readBits(7);
        int bits2 = ghcVar.readBits(24) + 4;
        if (bits == 0) {
            c15939a.f103738a = readStreamInfoBlock(zj5Var);
        } else {
            f36 f36Var = c15939a.f103738a;
            if (f36Var == null) {
                throw new IllegalArgumentException();
            }
            if (bits == 3) {
                c15939a.f103738a = f36Var.copyWithSeekTable(readSeekTableMetadataBlock(zj5Var, bits2));
            } else if (bits == 4) {
                c15939a.f103738a = f36Var.copyWithVorbisComments(readVorbisCommentMetadataBlock(zj5Var, bits2));
            } else if (bits == 6) {
                ihc ihcVar = new ihc(bits2);
                zj5Var.readFully(ihcVar.getData(), 0, bits2);
                ihcVar.skipBytes(4);
                c15939a.f103738a = f36Var.copyWithPictureFrames(kx7.m15111of(PictureFrame.fromPictureBlock(ihcVar)));
            } else {
                zj5Var.skipFully(bits2);
            }
        }
        return bit;
    }

    public static f36.C5581a readSeekTableMetadataBlock(ihc ihcVar) {
        ihcVar.skipBytes(1);
        int unsignedInt24 = ihcVar.readUnsignedInt24();
        long position = ((long) ihcVar.getPosition()) + ((long) unsignedInt24);
        int i = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = ihcVar.readLong();
            if (j == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = j;
            jArrCopyOf2[i2] = ihcVar.readLong();
            ihcVar.skipBytes(2);
            i2++;
        }
        ihcVar.skipBytes((int) (position - ((long) ihcVar.getPosition())));
        return new f36.C5581a(jArrCopyOf, jArrCopyOf2);
    }

    private static f36 readStreamInfoBlock(zj5 zj5Var) throws IOException {
        byte[] bArr = new byte[38];
        zj5Var.readFully(bArr, 0, 38);
        return new f36(bArr, 4);
    }

    public static void readStreamMarker(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(4);
        zj5Var.readFully(ihcVar.getData(), 0, 4);
        if (ihcVar.readUnsignedInt() != 1716281667) {
            throw xhc.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> readVorbisCommentMetadataBlock(zj5 zj5Var, int i) throws IOException {
        ihc ihcVar = new ihc(i);
        zj5Var.readFully(ihcVar.getData(), 0, i);
        ihcVar.skipBytes(4);
        return Arrays.asList(pgi.readVorbisCommentHeader(ihcVar, false, false).f70722b);
    }

    private static f36.C5581a readSeekTableMetadataBlock(zj5 zj5Var, int i) throws IOException {
        ihc ihcVar = new ihc(i);
        zj5Var.readFully(ihcVar.getData(), 0, i);
        return readSeekTableMetadataBlock(ihcVar);
    }
}
