package p000;

import p000.mu9;
import p000.qu9;
import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class lm7 extends AbstractC14875x2 {

    /* JADX INFO: renamed from: e */
    public static final float f58226e = 0.75f;

    /* JADX INFO: renamed from: b */
    public nu9 f58228b;

    /* JADX INFO: renamed from: c */
    public pu9 f58229c;

    /* JADX INFO: renamed from: d */
    public fm7 f58230d = new fm7();

    /* JADX INFO: renamed from: a */
    public final qu9.C11702c f58227a = new qu9.C11702c();

    /* JADX INFO: renamed from: lm7$a */
    public class C8898a implements yu9.InterfaceC15813c<hm7> {
        public C8898a() {
        }

        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb hm7 hm7Var) {
            lm7.this.visitHtml(yu9Var, hm7Var.getLiteral());
        }
    }

    /* JADX INFO: renamed from: lm7$b */
    public class C8899b implements yu9.InterfaceC15813c<cm7> {
        public C8899b() {
        }

        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb cm7 cm7Var) {
            lm7.this.visitHtml(yu9Var, cm7Var.getLiteral());
        }
    }

    /* JADX INFO: renamed from: lm7$c */
    public interface InterfaceC8900c {
        void configureHtml(@efb lm7 lm7Var);
    }

    @efb
    public static lm7 create() {
        return new lm7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visitHtml(@efb yu9 yu9Var, @hib String str) {
        if (str != null) {
            this.f58228b.processFragment(yu9Var.builder(), str);
        }
    }

    @efb
    public lm7 addHandler(@efb qlg qlgVar) {
        this.f58227a.m20665b(qlgVar);
        return this;
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void afterRender(@efb deb debVar, @efb yu9 yu9Var) {
        pu9 pu9Var = this.f58229c;
        if (pu9Var == null) {
            throw new IllegalStateException("Unexpected state, html-renderer is not defined");
        }
        pu9Var.render(yu9Var, this.f58228b);
    }

    @efb
    public lm7 allowNonClosedTags(boolean z) {
        this.f58227a.m20666c(z);
        return this;
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureConfiguration(@efb mu9.C9528b c9528b) {
        qu9.C11702c c11702c = this.f58227a;
        if (!c11702c.m20667d()) {
            c11702c.m20664a(jv7.create());
            c11702c.m20664a(new d79());
            c11702c.m20664a(new o81());
            c11702c.m20664a(new fcg());
            c11702c.m20664a(new gfg());
            c11702c.m20664a(new jag());
            c11702c.m20664a(new i7g());
            c11702c.m20664a(new xrh());
            c11702c.m20664a(new c99());
            c11702c.m20664a(new mz4());
            c11702c.m20664a(new oi7());
        }
        this.f58228b = ou9.create(this.f58230d);
        this.f58229c = c11702c.build();
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureVisitor(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(cm7.class, new C8899b()).mo2700on(hm7.class, new C8898a());
    }

    @efb
    public lm7 emptyTagReplacement(@efb fm7 fm7Var) {
        this.f58230d = fm7Var;
        return this;
    }

    @efb
    public lm7 excludeDefaults(boolean z) {
        this.f58227a.excludeDefaults(z);
        return this;
    }

    @hib
    public qlg getHandler(@efb String str) {
        return this.f58227a.m20668e(str);
    }

    @efb
    public static lm7 create(@efb InterfaceC8900c interfaceC8900c) {
        lm7 lm7VarCreate = create();
        interfaceC8900c.configureHtml(lm7VarCreate);
        return lm7VarCreate;
    }
}
