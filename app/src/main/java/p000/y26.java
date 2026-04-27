package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p000.e36;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class y26 {

    /* JADX INFO: renamed from: a */
    public static final int f100133a = 1716281667;

    /* JADX INFO: renamed from: b */
    public static final int f100134b = 16382;

    /* JADX INFO: renamed from: c */
    public static final int f100135c = 18;

    /* JADX INFO: renamed from: y26$a */
    public static final class C15406a {

        /* JADX INFO: renamed from: a */
        @hib
        public e36 f100136a;

        public C15406a(@hib e36 e36Var) {
            this.f100136a = e36Var;
        }
    }

    private y26() {
    }

    public static boolean checkAndPeekStreamMarker(ak5 ak5Var) throws IOException {
        jhc jhcVar = new jhc(4);
        ak5Var.peekFully(jhcVar.getData(), 0, 4);
        return jhcVar.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(ak5 ak5Var) throws IOException {
        ak5Var.resetPeekPosition();
        jhc jhcVar = new jhc(2);
        ak5Var.peekFully(jhcVar.getData(), 0, 2);
        int unsignedShort = jhcVar.readUnsignedShort();
        if ((unsignedShort >> 2) == 16382) {
            ak5Var.resetPeekPosition();
            return unsignedShort;
        }
        ak5Var.resetPeekPosition();
        throw yhc.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    @hib
    public static eta peekId3Metadata(ak5 ak5Var, boolean z) throws IOException {
        eta etaVarPeekId3Data = new er7().peekId3Data(ak5Var, z ? null : ar7.f11656b);
        if (etaVarPeekId3Data == null || etaVarPeekId3Data.length() == 0) {
            return null;
        }
        return etaVarPeekId3Data;
    }

    @hib
    public static eta readId3Metadata(ak5 ak5Var, boolean z) throws IOException {
        ak5Var.resetPeekPosition();
        long peekPosition = ak5Var.getPeekPosition();
        eta etaVarPeekId3Metadata = peekId3Metadata(ak5Var, z);
        ak5Var.skipFully((int) (ak5Var.getPeekPosition() - peekPosition));
        return etaVarPeekId3Metadata;
    }

    public static boolean readMetadataBlock(ak5 ak5Var, C15406a c15406a) throws IOException {
        ak5Var.resetPeekPosition();
        hhc hhcVar = new hhc(new byte[4]);
        ak5Var.peekFully(hhcVar.f43646a, 0, 4);
        boolean bit = hhcVar.readBit();
        int bits = hhcVar.readBits(7);
        int bits2 = hhcVar.readBits(24) + 4;
        if (bits == 0) {
            c15406a.f100136a = readStreamInfoBlock(ak5Var);
        } else {
            e36 e36Var = c15406a.f100136a;
            if (e36Var == null) {
                throw new IllegalArgumentException();
            }
            if (bits == 3) {
                c15406a.f100136a = e36Var.copyWithSeekTable(readSeekTableMetadataBlock(ak5Var, bits2));
            } else if (bits == 4) {
                c15406a.f100136a = e36Var.copyWithVorbisComments(readVorbisCommentMetadataBlock(ak5Var, bits2));
            } else if (bits == 6) {
                jhc jhcVar = new jhc(bits2);
                ak5Var.readFully(jhcVar.getData(), 0, bits2);
                jhcVar.skipBytes(4);
                c15406a.f100136a = e36Var.copyWithPictureFrames(kx7.m15111of(svc.fromPictureBlock(jhcVar)));
            } else {
                ak5Var.skipFully(bits2);
            }
        }
        return bit;
    }

    public static e36.C5065a readSeekTableMetadataBlock(jhc jhcVar) {
        jhcVar.skipBytes(1);
        int unsignedInt24 = jhcVar.readUnsignedInt24();
        long position = ((long) jhcVar.getPosition()) + ((long) unsignedInt24);
        int i = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jhcVar.readLong();
            if (j == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = j;
            jArrCopyOf2[i2] = jhcVar.readLong();
            jhcVar.skipBytes(2);
            i2++;
        }
        jhcVar.skipBytes((int) (position - ((long) jhcVar.getPosition())));
        return new e36.C5065a(jArrCopyOf, jArrCopyOf2);
    }

    private static e36 readStreamInfoBlock(ak5 ak5Var) throws IOException {
        byte[] bArr = new byte[38];
        ak5Var.readFully(bArr, 0, 38);
        return new e36(bArr, 4);
    }

    public static void readStreamMarker(ak5 ak5Var) throws IOException {
        jhc jhcVar = new jhc(4);
        ak5Var.readFully(jhcVar.getData(), 0, 4);
        if (jhcVar.readUnsignedInt() != 1716281667) {
            throw yhc.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> readVorbisCommentMetadataBlock(ak5 ak5Var, int i) throws IOException {
        jhc jhcVar = new jhc(i);
        ak5Var.readFully(jhcVar.getData(), 0, i);
        jhcVar.skipBytes(4);
        return Arrays.asList(ogi.readVorbisCommentHeader(jhcVar, false, false).f67592b);
    }

    private static e36.C5065a readSeekTableMetadataBlock(ak5 ak5Var, int i) throws IOException {
        jhc jhcVar = new jhc(i);
        ak5Var.readFully(jhcVar.getData(), 0, i);
        return readSeekTableMetadataBlock(jhcVar);
    }
}
