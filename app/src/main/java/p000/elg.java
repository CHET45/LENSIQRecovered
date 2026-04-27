package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p000.qkg;

/* JADX INFO: loaded from: classes8.dex */
public class elg extends ilg {

    /* JADX INFO: renamed from: a */
    public final rm7 f33361a;

    /* JADX INFO: renamed from: b */
    public final jm7 f33362b;

    /* JADX INFO: renamed from: elg$a */
    public static /* synthetic */ class C5371a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33363a;

        static {
            int[] iArr = new int[qkg.EnumC11525a.values().length];
            f33363a = iArr;
            try {
                iArr[qkg.EnumC11525a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33363a[qkg.EnumC11525a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33363a[qkg.EnumC11525a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public elg(jm7 jm7Var) {
        this.f33361a = jm7Var.getWriter();
        this.f33362b = jm7Var;
    }

    private static String getAlignValue(qkg.EnumC11525a enumC11525a) {
        int i = C5371a.f33363a[enumC11525a.ordinal()];
        if (i == 1) {
            return "left";
        }
        if (i == 2) {
            return "center";
        }
        if (i == 3) {
            return "right";
        }
        throw new IllegalStateException("Unknown alignment: " + enumC11525a);
    }

    private Map<String, String> getAttributes(deb debVar, String str) {
        return this.f33362b.extendAttributes(debVar, str, Collections.emptyMap());
    }

    private Map<String, String> getCellAttributes(qkg qkgVar, String str) {
        return qkgVar.getAlignment() != null ? this.f33362b.extendAttributes(qkgVar, str, Collections.singletonMap("align", getAlignValue(qkgVar.getAlignment()))) : this.f33362b.extendAttributes(qkgVar, str, Collections.emptyMap());
    }

    private void renderChildren(deb debVar) {
        deb firstChild = debVar.getFirstChild();
        while (firstChild != null) {
            deb next = firstChild.getNext();
            this.f33362b.render(firstChild);
            firstChild = next;
        }
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: a */
    public void mo10116a(nkg nkgVar) {
        this.f33361a.line();
        this.f33361a.tag("table", getAttributes(nkgVar, "table"));
        renderChildren(nkgVar);
        this.f33361a.tag("/table");
        this.f33361a.line();
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: b */
    public void mo10117b(pkg pkgVar) {
        this.f33361a.line();
        this.f33361a.tag("tbody", getAttributes(pkgVar, "tbody"));
        renderChildren(pkgVar);
        this.f33361a.tag("/tbody");
        this.f33361a.line();
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: c */
    public void mo10118c(qkg qkgVar) {
        String str = qkgVar.isHeader() ? ufh.f87924k : "td";
        this.f33361a.line();
        this.f33361a.tag(str, getCellAttributes(qkgVar, str));
        renderChildren(qkgVar);
        this.f33361a.tag(pj4.f71071b + str);
        this.f33361a.line();
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: d */
    public void mo10119d(dlg dlgVar) {
        this.f33361a.line();
        this.f33361a.tag("thead", getAttributes(dlgVar, "thead"));
        renderChildren(dlgVar);
        this.f33361a.tag("/thead");
        this.f33361a.line();
    }

    @Override // p000.ilg
    /* JADX INFO: renamed from: e */
    public void mo10120e(jlg jlgVar) {
        this.f33361a.line();
        this.f33361a.tag("tr", getAttributes(jlgVar, "tr"));
        renderChildren(jlgVar);
        this.f33361a.tag("/tr");
        this.f33361a.line();
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
