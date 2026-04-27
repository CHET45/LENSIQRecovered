package p000;

import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public class wdb implements uee.InterfaceC13522f {

    /* JADX INFO: renamed from: wdb$a */
    public class C14558a implements sy6<uee.InterfaceC13522f.a, vkb<uee.InterfaceC13522f.a>> {
        public C14558a() {
        }

        @Override // p000.sy6
        public vkb<uee.InterfaceC13522f.a> apply(uee.InterfaceC13522f.a aVar) {
            return vkb.error(aVar.getCause());
        }
    }

    @Override // p000.pwb
    /* JADX INFO: renamed from: apply */
    public wub<uee.InterfaceC13522f.a> apply2(vkb<uee.InterfaceC13522f.a> vkbVar) {
        return vkbVar.flatMap(new C14558a());
    }
}
