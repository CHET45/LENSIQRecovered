package p000;

import java.util.List;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dve {

    /* JADX INFO: renamed from: a */
    public final List<kq6> f31043a;

    /* JADX INFO: renamed from: b */
    public final r6h[] f31044b;

    public dve(List<kq6> list) {
        this.f31043a = list;
        this.f31044b = new r6h[list.size()];
    }

    public void consume(long j, ihc ihcVar) {
        kt1.consume(j, ihcVar, this.f31044b);
    }

    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        for (int i = 0; i < this.f31044b.length; i++) {
            c4838e.generateNewId();
            r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 3);
            kq6 kq6Var = this.f31043a.get(i);
            String str = kq6Var.f54989M;
            u80.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String formatId = kq6Var.f54998a;
            if (formatId == null) {
                formatId = c4838e.getFormatId();
            }
            r6hVarTrack.format(new kq6.C8497b().setId(formatId).setSampleMimeType(str).setSelectionFlags(kq6Var.f55004d).setLanguage(kq6Var.f55002c).setAccessibilityChannel(kq6Var.f55013j2).setInitializationData(kq6Var.f54992Q).build());
            this.f31044b[i] = r6hVarTrack;
        }
    }
}
