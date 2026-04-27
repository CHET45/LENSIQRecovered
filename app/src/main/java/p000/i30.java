package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i30 extends qif {

    /* JADX INFO: renamed from: a */
    public static final int f45563a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f45564b = 21;

    /* JADX INFO: renamed from: c */
    public static final int f45565c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f45566d = 116;

    @hib
    private static Metadata parseAit(ghc ghcVar) {
        ghcVar.skipBits(12);
        int bytePosition = (ghcVar.getBytePosition() + ghcVar.readBits(12)) - 4;
        ghcVar.skipBits(44);
        ghcVar.skipBytes(ghcVar.readBits(12));
        ghcVar.skipBits(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String bytesAsString = null;
            if (ghcVar.getBytePosition() >= bytePosition) {
                break;
            }
            ghcVar.skipBits(48);
            int bits = ghcVar.readBits(8);
            ghcVar.skipBits(4);
            int bytePosition2 = ghcVar.getBytePosition() + ghcVar.readBits(12);
            String bytesAsString2 = null;
            while (ghcVar.getBytePosition() < bytePosition2) {
                int bits2 = ghcVar.readBits(8);
                int bits3 = ghcVar.readBits(8);
                int bytePosition3 = ghcVar.getBytePosition() + bits3;
                if (bits2 == 2) {
                    int bits4 = ghcVar.readBits(16);
                    ghcVar.skipBits(8);
                    if (bits4 == 3) {
                        while (ghcVar.getBytePosition() < bytePosition3) {
                            bytesAsString = ghcVar.readBytesAsString(ghcVar.readBits(8), yw1.f103174a);
                            int bits5 = ghcVar.readBits(8);
                            for (int i = 0; i < bits5; i++) {
                                ghcVar.skipBytes(ghcVar.readBits(8));
                            }
                        }
                    }
                } else if (bits2 == 21) {
                    bytesAsString2 = ghcVar.readBytesAsString(bits3, yw1.f103174a);
                }
                ghcVar.setPosition(bytePosition3 * 8);
            }
            ghcVar.setPosition(bytePosition2 * 8);
            if (bytesAsString != null && bytesAsString2 != null) {
                arrayList.add(new AppInfoTable(bits, bytesAsString + bytesAsString2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // p000.qif
    @hib
    /* JADX INFO: renamed from: a */
    public Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return parseAit(new ghc(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
