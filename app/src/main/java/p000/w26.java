package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class w26 {

    /* JADX INFO: renamed from: w26$a */
    public static final class C14366a {

        /* JADX INFO: renamed from: a */
        public long f93125a;
    }

    private w26() {
    }

    private static boolean checkAndReadBlockSizeSamples(jhc jhcVar, e36 e36Var, int i) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(jhcVar, i);
        return frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= e36Var.f31642b;
    }

    private static boolean checkAndReadCrc(jhc jhcVar, int i) {
        return jhcVar.readUnsignedByte() == t0i.crc8(jhcVar.getData(), i, jhcVar.getPosition() - 1, 0);
    }

    private static boolean checkAndReadFirstSampleNumber(jhc jhcVar, e36 e36Var, boolean z, C14366a c14366a) {
        try {
            long utf8EncodedLong = jhcVar.readUtf8EncodedLong();
            if (!z) {
                utf8EncodedLong *= (long) e36Var.f31642b;
            }
            c14366a.f93125a = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkAndReadFrameHeader(jhc jhcVar, e36 e36Var, int i, C14366a c14366a) {
        int position = jhcVar.getPosition();
        long unsignedInt = jhcVar.readUnsignedInt();
        long j = unsignedInt >>> 16;
        if (j != i) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), e36Var) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), e36Var) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && checkAndReadFirstSampleNumber(jhcVar, e36Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c14366a) && checkAndReadBlockSizeSamples(jhcVar, e36Var, (int) ((unsignedInt >> 12) & 15)) && checkAndReadSampleRate(jhcVar, e36Var, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(jhcVar, position);
    }

    private static boolean checkAndReadSampleRate(jhc jhcVar, e36 e36Var, int i) {
        int i2 = e36Var.f31645e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == e36Var.f31646f;
        }
        if (i == 12) {
            return jhcVar.readUnsignedByte() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int unsignedShort = jhcVar.readUnsignedShort();
        if (i == 14) {
            unsignedShort *= 10;
        }
        return unsignedShort == i2;
    }

    private static boolean checkBitsPerSample(int i, e36 e36Var) {
        return i == 0 || i == e36Var.f31649i;
    }

    private static boolean checkChannelAssignment(int i, e36 e36Var) {
        return i <= 7 ? i == e36Var.f31647g - 1 : i <= 10 && e36Var.f31647g == 2;
    }

    public static boolean checkFrameHeaderFromPeek(ak5 ak5Var, e36 e36Var, int i, C14366a c14366a) throws IOException {
        long peekPosition = ak5Var.getPeekPosition();
        byte[] bArr = new byte[2];
        ak5Var.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            ak5Var.resetPeekPosition();
            ak5Var.advancePeekPosition((int) (peekPosition - ak5Var.getPosition()));
            return false;
        }
        jhc jhcVar = new jhc(16);
        System.arraycopy(bArr, 0, jhcVar.getData(), 0, 2);
        jhcVar.setLimit(ek5.peekToLength(ak5Var, jhcVar.getData(), 2, 14));
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition((int) (peekPosition - ak5Var.getPosition()));
        return checkAndReadFrameHeader(jhcVar, e36Var, i, c14366a);
    }

    public static long getFirstSampleNumber(ak5 ak5Var, e36 e36Var) throws IOException {
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        ak5Var.peekFully(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        ak5Var.advancePeekPosition(2);
        int i = z ? 7 : 6;
        jhc jhcVar = new jhc(i);
        jhcVar.setLimit(ek5.peekToLength(ak5Var, jhcVar.getData(), 0, i));
        ak5Var.resetPeekPosition();
        C14366a c14366a = new C14366a();
        if (checkAndReadFirstSampleNumber(jhcVar, e36Var, z, c14366a)) {
            return c14366a.f93125a;
        }
        throw yhc.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(jhc jhcVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return jhcVar.readUnsignedByte() + 1;
            case 7:
                return jhcVar.readUnsignedShort() + 1;
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
