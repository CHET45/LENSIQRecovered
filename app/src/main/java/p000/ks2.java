package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ks2 implements pwb<uee, uee> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<vkb<uee>> f55222a = new AtomicReference<>();

    /* JADX INFO: renamed from: ks2$a */
    public class C8511a implements InterfaceC7776j8 {
        public C8511a() {
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            ks2.this.f55222a.set(null);
        }
    }

    @Override // p000.pwb
    /* JADX INFO: renamed from: apply */
    public wub<uee> apply2(vkb<uee> vkbVar) {
        synchronized (this.f55222a) {
            try {
                vkb<uee> vkbVar2 = this.f55222a.get();
                if (vkbVar2 != null) {
                    return vkbVar2;
                }
                vkb<uee> vkbVarRefCount = vkbVar.doFinally(new C8511a()).replay(1).refCount();
                this.f55222a.set(vkbVarRefCount);
                return vkbVarRefCount;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
