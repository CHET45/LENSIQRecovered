package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x26 {

    /* JADX INFO: renamed from: x26$a */
    public static final class C14885a {

        /* JADX INFO: renamed from: a */
        public long f96092a;
    }

    private x26() {
    }

    private static boolean checkAndReadBlockSizeSamples(ihc ihcVar, f36 f36Var, int i) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(ihcVar, i);
        return frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= f36Var.f34981b;
    }

    private static boolean checkAndReadCrc(ihc ihcVar, int i) {
        return ihcVar.readUnsignedByte() == x0i.crc8(ihcVar.getData(), i, ihcVar.getPosition() - 1, 0);
    }

    private static boolean checkAndReadFirstSampleNumber(ihc ihcVar, f36 f36Var, boolean z, C14885a c14885a) {
        try {
            long utf8EncodedLong = ihcVar.readUtf8EncodedLong();
            if (!z) {
                utf8EncodedLong *= (long) f36Var.f34981b;
            }
            c14885a.f96092a = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkAndReadFrameHeader(ihc ihcVar, f36 f36Var, int i, C14885a c14885a) {
        int position = ihcVar.getPosition();
        long unsignedInt = ihcVar.readUnsignedInt();
        long j = unsignedInt >>> 16;
        if (j != i) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), f36Var) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), f36Var) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && checkAndReadFirstSampleNumber(ihcVar, f36Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c14885a) && checkAndReadBlockSizeSamples(ihcVar, f36Var, (int) ((unsignedInt >> 12) & 15)) && checkAndReadSampleRate(ihcVar, f36Var, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(ihcVar, position);
    }

    private static boolean checkAndReadSampleRate(ihc ihcVar, f36 f36Var, int i) {
        int i2 = f36Var.f34984e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == f36Var.f34985f;
        }
        if (i == 12) {
            return ihcVar.readUnsignedByte() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int unsignedShort = ihcVar.readUnsignedShort();
        if (i == 14) {
            unsignedShort *= 10;
        }
        return unsignedShort == i2;
    }

    private static boolean checkBitsPerSample(int i, f36 f36Var) {
        return i == 0 || i == f36Var.f34988i;
    }

    private static boolean checkChannelAssignment(int i, f36 f36Var) {
        return i <= 7 ? i == f36Var.f34986g - 1 : i <= 10 && f36Var.f34986g == 2;
    }

    public static boolean checkFrameHeaderFromPeek(zj5 zj5Var, f36 f36Var, int i, C14885a c14885a) throws IOException {
        long peekPosition = zj5Var.getPeekPosition();
        byte[] bArr = new byte[2];
        zj5Var.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            zj5Var.resetPeekPosition();
            zj5Var.advancePeekPosition((int) (peekPosition - zj5Var.getPosition()));
            return false;
        }
        ihc ihcVar = new ihc(16);
        System.arraycopy(bArr, 0, ihcVar.getData(), 0, 2);
        ihcVar.setLimit(dk5.peekToLength(zj5Var, ihcVar.getData(), 2, 14));
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition((int) (peekPosition - zj5Var.getPosition()));
        return checkAndReadFrameHeader(ihcVar, f36Var, i, c14885a);
    }

    public static long getFirstSampleNumber(zj5 zj5Var, f36 f36Var) throws IOException {
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        zj5Var.peekFully(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        zj5Var.advancePeekPosition(2);
        int i = z ? 7 : 6;
        ihc ihcVar = new ihc(i);
        ihcVar.setLimit(dk5.peekToLength(zj5Var, ihcVar.getData(), 0, i));
        zj5Var.resetPeekPosition();
        C14885a c14885a = new C14885a();
        if (checkAndReadFirstSampleNumber(ihcVar, f36Var, z, c14885a)) {
            return c14885a.f96092a;
        }
        throw xhc.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(ihc ihcVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ihcVar.readUnsignedByte() + 1;
            case 7:
                return ihcVar.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
