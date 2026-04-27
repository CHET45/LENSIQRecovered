package p000;

import p000.mm7;
import p000.nqg;
import p000.okg;
import p000.thc;

/* JADX INFO: loaded from: classes8.dex */
public class olg implements thc.InterfaceC13041c, mm7.InterfaceC9411c, nqg.InterfaceC10010d {

    /* JADX INFO: renamed from: olg$a */
    public class C10458a implements km7 {
        public C10458a() {
        }

        @Override // p000.km7
        public peb create(jm7 jm7Var) {
            return new elg(jm7Var);
        }
    }

    /* JADX INFO: renamed from: olg$b */
    public class C10459b implements mqg {
        public C10459b() {
        }

        @Override // p000.mqg
        public peb create(lqg lqgVar) {
            return new mlg(lqgVar);
        }
    }

    private olg() {
    }

    public static si5 create() {
        return new olg();
    }

    @Override // p000.thc.InterfaceC13041c
    public void extend(thc.C13039a c13039a) {
        c13039a.customBlockParserFactory(new okg.C10404b());
    }

    @Override // p000.mm7.InterfaceC9411c
    public void extend(mm7.C9410b c9410b) {
        c9410b.nodeRendererFactory(new C10458a());
    }

    @Override // p000.nqg.InterfaceC10010d
    public void extend(nqg.C10008b c10008b) {
        c10008b.nodeRendererFactory(new C10459b());
    }
}
