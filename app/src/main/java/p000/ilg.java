package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ilg implements peb {
    /* JADX INFO: renamed from: a */
    public abstract void mo10116a(nkg nkgVar);

    /* JADX INFO: renamed from: b */
    public abstract void mo10117b(pkg pkgVar);

    /* JADX INFO: renamed from: c */
    public abstract void mo10118c(qkg qkgVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo10119d(dlg dlgVar);

    /* JADX INFO: renamed from: e */
    public abstract void mo10120e(jlg jlgVar);

    @Override // p000.peb
    public Set<Class<? extends deb>> getNodeTypes() {
        return new HashSet(Arrays.asList(nkg.class, dlg.class, pkg.class, jlg.class, qkg.class));
    }

    @Override // p000.peb
    public void render(deb debVar) {
        if (debVar instanceof nkg) {
            mo10116a((nkg) debVar);
            return;
        }
        if (debVar instanceof dlg) {
            mo10119d((dlg) debVar);
            return;
        }
        if (debVar instanceof pkg) {
            mo10117b((pkg) debVar);
        } else if (debVar instanceof jlg) {
            mo10120e((jlg) debVar);
        } else if (debVar instanceof qkg) {
            mo10118c((qkg) debVar);
        }
    }
}
