package p000;

import androidx.media3.common.C1213a;
import java.util.List;
import p000.ckh;
import p000.w1e;

/* JADX INFO: loaded from: classes3.dex */
public final class yyh {

    /* JADX INFO: renamed from: e */
    public static final int f103489e = 434;

    /* JADX INFO: renamed from: a */
    public final List<C1213a> f103490a;

    /* JADX INFO: renamed from: b */
    public final String f103491b;

    /* JADX INFO: renamed from: c */
    public final q6h[] f103492c;

    /* JADX INFO: renamed from: d */
    public final w1e f103493d;

    public yyh(List<C1213a> list, String str) {
        this.f103490a = list;
        this.f103491b = str;
        this.f103492c = new q6h[list.size()];
        w1e w1eVar = new w1e(new w1e.InterfaceC14361b() { // from class: vyh
            @Override // p000.w1e.InterfaceC14361b
            public final void consume(long j, jhc jhcVar) {
                this.f92750a.lambda$new$0(j, jhcVar);
            }
        });
        this.f103493d = w1eVar;
        w1eVar.setMaxSize(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j, jhc jhcVar) {
        lt1.consumeCcData(j, jhcVar, this.f103492c);
    }

    public void consume(long j, jhc jhcVar) {
        if (jhcVar.bytesLeft() < 9) {
            return;
        }
        int i = jhcVar.readInt();
        int i2 = jhcVar.readInt();
        int unsignedByte = jhcVar.readUnsignedByte();
        if (i == 434 && i2 == 1195456820 && unsignedByte == 3) {
            this.f103493d.add(j, jhcVar);
        }
    }

    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        for (int i = 0; i < this.f103492c.length; i++) {
            c2372e.generateNewId();
            q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 3);
            C1213a c1213a = this.f103490a.get(i);
            String str = c1213a.f8291o;
            v80.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            q6hVarTrack.format(new C1213a.b().setId(c2372e.getFormatId()).setContainerMimeType(this.f103491b).setSampleMimeType(str).setSelectionFlags(c1213a.f8281e).setLanguage(c1213a.f8280d).setAccessibilityChannel(c1213a.f8271L).setInitializationData(c1213a.f8294r).build());
            this.f103492c[i] = q6hVarTrack;
        }
    }
}
