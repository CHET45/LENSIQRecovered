package p000;

import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u5g implements tm0 {

    /* JADX INFO: renamed from: b */
    public static final String f86855b = "StreamFormatChunk";

    /* JADX INFO: renamed from: a */
    public final kq6 f86856a;

    public u5g(kq6 kq6Var) {
        this.f86856a = kq6Var;
    }

    @hib
    private static String getMimeTypeFromCompression(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @hib
    private static String getMimeTypeFromTag(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @hib
    private static tm0 parseBitmapInfoHeader(ihc ihcVar) {
        ihcVar.skipBytes(4);
        int littleEndianInt = ihcVar.readLittleEndianInt();
        int littleEndianInt2 = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(4);
        int littleEndianInt3 = ihcVar.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression != null) {
            kq6.C8497b c8497b = new kq6.C8497b();
            c8497b.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
            return new u5g(c8497b.build());
        }
        yh9.m25919w("StreamFormatChunk", "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @hib
    public static tm0 parseFrom(int i, ihc ihcVar) {
        if (i == 2) {
            return parseBitmapInfoHeader(ihcVar);
        }
        if (i == 1) {
            return parseWaveFormatEx(ihcVar);
        }
        yh9.m25919w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + x0i.getTrackTypeString(i));
        return null;
    }

    @hib
    private static tm0 parseWaveFormatEx(ihc ihcVar) {
        int littleEndianUnsignedShort = ihcVar.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            yh9.m25919w("StreamFormatChunk", "Ignoring track with unsupported format tag " + littleEndianUnsignedShort);
            return null;
        }
        int littleEndianUnsignedShort2 = ihcVar.readLittleEndianUnsignedShort();
        int littleEndianInt = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(6);
        int pcmEncoding = x0i.getPcmEncoding(ihcVar.readUnsignedShort());
        int littleEndianUnsignedShort3 = ihcVar.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[littleEndianUnsignedShort3];
        ihcVar.readBytes(bArr, 0, littleEndianUnsignedShort3);
        kq6.C8497b c8497b = new kq6.C8497b();
        c8497b.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt);
        if ("audio/raw".equals(mimeTypeFromTag) && pcmEncoding != 0) {
            c8497b.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(mimeTypeFromTag) && littleEndianUnsignedShort3 > 0) {
            c8497b.setInitializationData(kx7.m15111of(bArr));
        }
        return new u5g(c8497b.build());
    }

    @Override // p000.tm0
    public int getType() {
        return 1718776947;
    }
}
