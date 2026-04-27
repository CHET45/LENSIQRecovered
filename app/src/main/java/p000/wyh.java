package p000;

import java.util.List;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wyh {

    /* JADX INFO: renamed from: c */
    public static final int f95810c = 434;

    /* JADX INFO: renamed from: a */
    public final List<kq6> f95811a;

    /* JADX INFO: renamed from: b */
    public final r6h[] f95812b;

    public wyh(List<kq6> list) {
        this.f95811a = list;
        this.f95812b = new r6h[list.size()];
    }

    public void consume(long j, ihc ihcVar) {
        if (ihcVar.bytesLeft() < 9) {
            return;
        }
        int i = ihcVar.readInt();
        int i2 = ihcVar.readInt();
        int unsignedByte = ihcVar.readUnsignedByte();
        if (i == 434 && i2 == 1195456820 && unsignedByte == 3) {
            kt1.consumeCcData(j, ihcVar, this.f95812b);
        }
    }

    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        for (int i = 0; i < this.f95812b.length; i++) {
            c4838e.generateNewId();
            r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 3);
            kq6 kq6Var = this.f95811a.get(i);
            String str = kq6Var.f54989M;
            u80.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            r6hVarTrack.format(new kq6.C8497b().setId(c4838e.getFormatId()).setSampleMimeType(str).setSelectionFlags(kq6Var.f55004d).setLanguage(kq6Var.f55002c).setAccessibilityChannel(kq6Var.f55013j2).setInitializationData(kq6Var.f54992Q).build());
            this.f95812b[i] = r6hVarTrack;
        }
    }
}
