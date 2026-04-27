package p000;

import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
public final class v5g implements um0 {

    /* JADX INFO: renamed from: b */
    public static final String f90039b = "StreamFormatChunk";

    /* JADX INFO: renamed from: a */
    public final C1213a f90040a;

    public v5g(C1213a c1213a) {
        this.f90040a = c1213a;
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
    private static um0 parseBitmapInfoHeader(jhc jhcVar) {
        jhcVar.skipBytes(4);
        int littleEndianInt = jhcVar.readLittleEndianInt();
        int littleEndianInt2 = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(4);
        int littleEndianInt3 = jhcVar.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression != null) {
            C1213a.b bVar = new C1213a.b();
            bVar.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
            return new v5g(bVar.build());
        }
        xh9.m25148w("StreamFormatChunk", "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @hib
    public static um0 parseFrom(int i, jhc jhcVar) {
        if (i == 2) {
            return parseBitmapInfoHeader(jhcVar);
        }
        if (i == 1) {
            return parseWaveFormatEx(jhcVar);
        }
        xh9.m25148w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + t0i.getTrackTypeString(i));
        return null;
    }

    @hib
    private static um0 parseWaveFormatEx(jhc jhcVar) {
        int littleEndianUnsignedShort = jhcVar.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            xh9.m25148w("StreamFormatChunk", "Ignoring track with unsupported format tag " + littleEndianUnsignedShort);
            return null;
        }
        int littleEndianUnsignedShort2 = jhcVar.readLittleEndianUnsignedShort();
        int littleEndianInt = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(6);
        int pcmEncoding = t0i.getPcmEncoding(jhcVar.readLittleEndianUnsignedShort());
        int littleEndianUnsignedShort3 = jhcVar.bytesLeft() > 0 ? jhcVar.readLittleEndianUnsignedShort() : 0;
        C1213a.b bVar = new C1213a.b();
        bVar.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt);
        if (mimeTypeFromTag.equals("audio/raw") && pcmEncoding != 0) {
            bVar.setPcmEncoding(pcmEncoding);
        }
        if (mimeTypeFromTag.equals("audio/mp4a-latm") && littleEndianUnsignedShort3 > 0) {
            byte[] bArr = new byte[littleEndianUnsignedShort3];
            jhcVar.readBytes(bArr, 0, littleEndianUnsignedShort3);
            bVar.setInitializationData(kx7.m15111of(bArr));
        }
        return new v5g(bVar.build());
    }

    @Override // p000.um0
    public int getType() {
        return 1718776947;
    }
}
