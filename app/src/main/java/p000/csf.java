package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class csf {

    /* JADX INFO: renamed from: a */
    public static final int f27306a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f27307b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f27308c = 7;

    /* JADX INFO: renamed from: d */
    public static final int f27309d = 9;

    /* JADX INFO: renamed from: e */
    public static final int f27310e = 12;

    /* JADX INFO: renamed from: f */
    public static final int f27311f = 13;

    /* JADX INFO: renamed from: g */
    public static final int f27312g = 21;

    /* JADX INFO: renamed from: h */
    public static final int f27313h = 22;

    /* JADX INFO: renamed from: i */
    public static final int f27314i = 23;

    private csf() {
    }

    private static int getCaptureFrameRate(int i, jhc jhcVar, int i2) {
        if (i == 12) {
            return 240;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && jhcVar.bytesLeft() >= 8 && jhcVar.getPosition() + 8 <= i2) {
            int i3 = jhcVar.readInt();
            int i4 = jhcVar.readInt();
            if (i3 >= 12 && i4 == 1936877170) {
                return jhcVar.readUnsignedFixedPoint1616();
            }
        }
        return -2147483647;
    }

    @hib
    public static eta parseSmta(jhc jhcVar, int i) {
        jhcVar.skipBytes(12);
        while (jhcVar.getPosition() < i) {
            int position = jhcVar.getPosition();
            int i2 = jhcVar.readInt();
            if (jhcVar.readInt() == 1935766900) {
                if (i2 < 16) {
                    return null;
                }
                jhcVar.skipBytes(4);
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < 2; i5++) {
                    int unsignedByte = jhcVar.readUnsignedByte();
                    int unsignedByte2 = jhcVar.readUnsignedByte();
                    if (unsignedByte == 0) {
                        i3 = unsignedByte2;
                    } else if (unsignedByte == 1) {
                        i4 = unsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i3, jhcVar, i);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new eta(new dsf(captureFrameRate, i4));
            }
            jhcVar.setPosition(position + i2);
        }
        return null;
    }
}
