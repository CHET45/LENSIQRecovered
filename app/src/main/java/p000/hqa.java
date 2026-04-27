package p000;

import p000.gqa;

/* JADX INFO: loaded from: classes3.dex */
public class hqa implements gqa {

    /* JADX INFO: renamed from: a */
    public gqa.InterfaceC6464a f44575a;

    @Override // p000.gqa
    public void clearMemory() {
    }

    @Override // p000.gqa
    public long getCurrentSize() {
        return 0L;
    }

    @Override // p000.gqa
    public long getMaxSize() {
        return 0L;
    }

    @Override // p000.gqa
    @hib
    public t5e<?> put(@efb eq8 eq8Var, @hib t5e<?> t5eVar) {
        if (t5eVar == null) {
            return null;
        }
        this.f44575a.onResourceRemoved(t5eVar);
        return null;
    }

    @Override // p000.gqa
    @hib
    public t5e<?> remove(@efb eq8 eq8Var) {
        return null;
    }

    @Override // p000.gqa
    public void setResourceRemovedListener(@efb gqa.InterfaceC6464a interfaceC6464a) {
        this.f44575a = interfaceC6464a;
    }

    @Override // p000.gqa
    public void setSizeMultiplier(float f) {
    }

    @Override // p000.gqa
    public void trimMemory(int i) {
    }
}
