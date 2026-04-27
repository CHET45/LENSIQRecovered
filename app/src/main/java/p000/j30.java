package p000;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class j30 extends rif {

    /* JADX INFO: renamed from: a */
    public static final int f49467a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f49468b = 21;

    /* JADX INFO: renamed from: c */
    public static final int f49469c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f49470d = 116;

    @hib
    private static eta parseAit(hhc hhcVar) {
        hhcVar.skipBits(12);
        int bytePosition = (hhcVar.getBytePosition() + hhcVar.readBits(12)) - 4;
        hhcVar.skipBits(44);
        hhcVar.skipBytes(hhcVar.readBits(12));
        hhcVar.skipBits(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String bytesAsString = null;
            if (hhcVar.getBytePosition() >= bytePosition) {
                break;
            }
            hhcVar.skipBits(48);
            int bits = hhcVar.readBits(8);
            hhcVar.skipBits(4);
            int bytePosition2 = hhcVar.getBytePosition() + hhcVar.readBits(12);
            String bytesAsString2 = null;
            while (hhcVar.getBytePosition() < bytePosition2) {
                int bits2 = hhcVar.readBits(8);
                int bits3 = hhcVar.readBits(8);
                int bytePosition3 = hhcVar.getBytePosition() + bits3;
                if (bits2 == 2) {
                    int bits4 = hhcVar.readBits(16);
                    hhcVar.skipBits(8);
                    if (bits4 == 3) {
                        while (hhcVar.getBytePosition() < bytePosition3) {
                            bytesAsString = hhcVar.readBytesAsString(hhcVar.readBits(8), StandardCharsets.US_ASCII);
                            int bits5 = hhcVar.readBits(8);
                            for (int i = 0; i < bits5; i++) {
                                hhcVar.skipBytes(hhcVar.readBits(8));
                            }
                        }
                    }
                } else if (bits2 == 21) {
                    bytesAsString2 = hhcVar.readBytesAsString(bits3, StandardCharsets.US_ASCII);
                }
                hhcVar.setPosition(bytePosition3 * 8);
            }
            hhcVar.setPosition(bytePosition2 * 8);
            if (bytesAsString != null && bytesAsString2 != null) {
                arrayList.add(new h30(bits, bytesAsString + bytesAsString2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new eta(arrayList);
    }

    @Override // p000.rif
    @hib
    /* JADX INFO: renamed from: a */
    public eta mo2551a(aua auaVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return parseAit(new hhc(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
