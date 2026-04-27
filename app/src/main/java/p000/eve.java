package p000;

import androidx.media3.common.C1213a;
import java.util.List;
import p000.ckh;
import p000.w1e;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class eve {

    /* JADX INFO: renamed from: a */
    public final List<C1213a> f34171a;

    /* JADX INFO: renamed from: b */
    public final String f34172b;

    /* JADX INFO: renamed from: c */
    public final q6h[] f34173c;

    /* JADX INFO: renamed from: d */
    public final w1e f34174d = new w1e(new w1e.InterfaceC14361b() { // from class: cve
        @Override // p000.w1e.InterfaceC14361b
        public final void consume(long j, jhc jhcVar) {
            this.f27895a.lambda$new$0(j, jhcVar);
        }
    });

    public eve(List<C1213a> list, String str) {
        this.f34171a = list;
        this.f34172b = str;
        this.f34173c = new q6h[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j, jhc jhcVar) {
        lt1.consume(j, jhcVar, this.f34173c);
    }

    public void clear() {
        this.f34174d.flush();
    }

    public void consume(long j, jhc jhcVar) {
        this.f34174d.add(j, jhcVar);
    }

    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        for (int i = 0; i < this.f34173c.length; i++) {
            c2372e.generateNewId();
            q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 3);
            C1213a c1213a = this.f34171a.get(i);
            String str = c1213a.f8291o;
            v80.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String formatId = c1213a.f8277a;
            if (formatId == null) {
                formatId = c2372e.getFormatId();
            }
            q6hVarTrack.format(new C1213a.b().setId(formatId).setContainerMimeType(this.f34172b).setSampleMimeType(str).setSelectionFlags(c1213a.f8281e).setLanguage(c1213a.f8280d).setAccessibilityChannel(c1213a.f8271L).setInitializationData(c1213a.f8294r).build());
            this.f34173c[i] = q6hVarTrack;
        }
    }

    public void flush() {
        this.f34174d.flush();
    }

    public void setReorderingQueueSize(int i) {
        this.f34174d.setMaxSize(i);
    }
}
