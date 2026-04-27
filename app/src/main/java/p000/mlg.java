package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class mlg extends ilg {

    /* JADX INFO: renamed from: a */
    public final oqg f61435a;

    /* JADX INFO: renamed from: b */
    public final lqg f61436b;

    public mlg(lqg lqgVar) {
        this.f61435a = lqgVar.getWriter();
        this.f61436b = lqgVar;
    }

    private void renderChildren(deb debVar) {
        deb firstChild = debVar.getFirstChild();
        while (firstChild != null) {
            deb next = firstChild.getNext();
            if ((firstChild instanceof qkg) && next == null) {
                renderLastCell((qkg) firstChild);
            } else {
                this.f61436b.render(firstChild);
            }
            firstChild = next;
        }
    }

    private void renderLastCell(qkg qkgVar) {
        renderChildren(qkgVar);
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: a */
    public void mo10116a(nkg nkgVar) {
        renderChildren(nkgVar);
        if (nkgVar.getNext() != null) {
            this.f61435a.write("\n");
        }
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: b */
    public void mo10117b(pkg pkgVar) {
        renderChildren(pkgVar);
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: c */
    public void mo10118c(qkg qkgVar) {
        renderChildren(qkgVar);
        this.f61435a.write('|');
        this.f61435a.whitespace();
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: d */
    public void mo10119d(dlg dlgVar) {
        renderChildren(dlgVar);
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: e */
    public void mo10120e(jlg jlgVar) {
        this.f61435a.line();
        renderChildren(jlgVar);
        this.f61435a.line();
    }

    @Override // p000.ilg, p000.peb
    public /* bridge */ /* synthetic */ Set getNodeTypes() {
        return super.getNodeTypes();
    }

    @Override // p000.ilg, p000.peb
    public /* bridge */ /* synthetic */ void render(deb debVar) {
        super.render(debVar);
    }
}
