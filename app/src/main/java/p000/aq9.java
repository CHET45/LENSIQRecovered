package p000;

import p000.gqa;

/* JADX INFO: loaded from: classes3.dex */
public class aq9 extends op9<eq8, t5e<?>> implements gqa {

    /* JADX INFO: renamed from: e */
    public gqa.InterfaceC6464a f11585e;

    public aq9(long j) {
        super(j);
    }

    @Override // p000.op9
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int mo2532b(@hib t5e<?> t5eVar) {
        return t5eVar == null ? super.mo2532b(null) : t5eVar.getSize();
    }

    @Override // p000.op9
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo2533c(@efb eq8 eq8Var, @hib t5e<?> t5eVar) {
        gqa.InterfaceC6464a interfaceC6464a = this.f11585e;
        if (interfaceC6464a == null || t5eVar == null) {
            return;
        }
        interfaceC6464a.onResourceRemoved(t5eVar);
    }

    @Override // p000.gqa
    @hib
    public /* bridge */ /* synthetic */ t5e put(@efb eq8 eq8Var, @hib t5e t5eVar) {
        return (t5e) super.put(eq8Var, t5eVar);
    }

    @Override // p000.gqa
    @hib
    public /* bridge */ /* synthetic */ t5e remove(@efb eq8 eq8Var) {
        return (t5e) super.remove(eq8Var);
    }

    @Override // p000.gqa
    public void setResourceRemovedListener(@efb gqa.InterfaceC6464a interfaceC6464a) {
        this.f11585e = interfaceC6464a;
    }

    @Override // p000.gqa
    @igg({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            m18805d(getMaxSize() / 2);
        }
    }
}
