package p000;

import com.blankj.utilcode.util.C2473f;
import com.watchfun.voicenotes.CommonWebViewActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class j03 extends AbstractC7148i5 implements peb {

    /* JADX INFO: renamed from: a */
    public final jm7 f49230a;

    /* JADX INFO: renamed from: b */
    public final rm7 f49231b;

    /* JADX INFO: renamed from: j03$b */
    public static class C7706b extends AbstractC7148i5 {

        /* JADX INFO: renamed from: a */
        public final StringBuilder f49232a;

        private C7706b() {
            this.f49232a = new StringBuilder();
        }

        /* JADX INFO: renamed from: a */
        public String m13618a() {
            return this.f49232a.toString();
        }

        @Override // p000.AbstractC7148i5, p000.idi
        public void visit(zpg zpgVar) {
            this.f49232a.append(zpgVar.getLiteral());
        }

        @Override // p000.AbstractC7148i5, p000.idi
        public void visit(ruf rufVar) {
            this.f49232a.append('\n');
        }

        @Override // p000.AbstractC7148i5, p000.idi
        public void visit(og7 og7Var) {
            this.f49232a.append('\n');
        }
    }

    public j03(jm7 jm7Var) {
        this.f49230a = jm7Var;
        this.f49231b = jm7Var.getWriter();
    }

    private Map<String, String> getAttrs(deb debVar, String str) {
        return getAttrs(debVar, str, Collections.emptyMap());
    }

    private boolean isInTightList(cdc cdcVar) {
        deb parent;
        b61 parent2 = cdcVar.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null || !(parent instanceof f89)) {
            return false;
        }
        return ((f89) parent).isTight();
    }

    private void renderCodeBlock(String str, deb debVar, Map<String, String> map) {
        this.f49231b.line();
        this.f49231b.tag("pre", getAttrs(debVar, "pre"));
        this.f49231b.tag(g55.f38796e, getAttrs(debVar, g55.f38796e, map));
        this.f49231b.text(str);
        this.f49231b.tag("/code");
        this.f49231b.tag("/pre");
        this.f49231b.line();
    }

    private void renderListBlock(f89 f89Var, String str, Map<String, String> map) {
        this.f49231b.line();
        this.f49231b.tag(str, map);
        this.f49231b.line();
        visitChildren(f89Var);
        this.f49231b.line();
        this.f49231b.tag('/' + str);
        this.f49231b.line();
    }

    @Override // p000.peb
    public Set<Class<? extends deb>> getNodeTypes() {
        return new HashSet(Arrays.asList(oh4.class, ni7.class, cdc.class, o61.class, ig1.class, dq5.class, cm7.class, vwg.class, pz7.class, z69.class, f99.class, p7c.class, os7.class, kz4.class, iag.class, zpg.class, q62.class, hm7.class, ruf.class, og7.class));
    }

    @Override // p000.peb
    public void render(deb debVar) {
        debVar.accept(this);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(oh4 oh4Var) {
        visitChildren(oh4Var);
    }

    @Override // p000.AbstractC7148i5
    public void visitChildren(deb debVar) {
        deb firstChild = debVar.getFirstChild();
        while (firstChild != null) {
            deb next = firstChild.getNext();
            this.f49230a.render(firstChild);
            firstChild = next;
        }
    }

    private Map<String, String> getAttrs(deb debVar, String str, Map<String, String> map) {
        return this.f49230a.extendAttributes(debVar, str, map);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ni7 ni7Var) {
        String str = "h" + ni7Var.getLevel();
        this.f49231b.line();
        this.f49231b.tag(str, getAttrs(ni7Var, str));
        visitChildren(ni7Var);
        this.f49231b.tag('/' + str);
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(cdc cdcVar) {
        boolean zIsInTightList = isInTightList(cdcVar);
        if (!zIsInTightList) {
            this.f49231b.line();
            this.f49231b.tag("p", getAttrs(cdcVar, "p"));
        }
        visitChildren(cdcVar);
        if (zIsInTightList) {
            return;
        }
        this.f49231b.tag("/p");
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(o61 o61Var) {
        this.f49231b.line();
        this.f49231b.tag("blockquote", getAttrs(o61Var, "blockquote"));
        this.f49231b.line();
        visitChildren(o61Var);
        this.f49231b.line();
        this.f49231b.tag("/blockquote");
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ig1 ig1Var) {
        renderListBlock(ig1Var, "ul", getAttrs(ig1Var, "ul"));
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(dq5 dq5Var) {
        String literal = dq5Var.getLiteral();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String info = dq5Var.getInfo();
        if (info != null && !info.isEmpty()) {
            int iIndexOf = info.indexOf(C2473f.f17566z);
            if (iIndexOf != -1) {
                info = info.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-" + info);
        }
        renderCodeBlock(literal, dq5Var, linkedHashMap);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(cm7 cm7Var) {
        this.f49231b.line();
        if (this.f49230a.shouldEscapeHtml()) {
            this.f49231b.tag("p", getAttrs(cm7Var, "p"));
            this.f49231b.text(cm7Var.getLiteral());
            this.f49231b.tag("/p");
        } else {
            this.f49231b.raw(cm7Var.getLiteral());
        }
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(vwg vwgVar) {
        this.f49231b.line();
        this.f49231b.tag("hr", getAttrs(vwgVar, "hr"), true);
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(pz7 pz7Var) {
        renderCodeBlock(pz7Var.getLiteral(), pz7Var, Collections.emptyMap());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(z69 z69Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("href", this.f49230a.encodeUrl(z69Var.getDestination()));
        if (z69Var.getTitle() != null) {
            linkedHashMap.put(CommonWebViewActivity.f26185L, z69Var.getTitle());
        }
        this.f49231b.tag("a", getAttrs(z69Var, "a", linkedHashMap));
        visitChildren(z69Var);
        this.f49231b.tag("/a");
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(f99 f99Var) {
        this.f49231b.tag(ou9.f68826k, getAttrs(f99Var, ou9.f68826k));
        visitChildren(f99Var);
        this.f49231b.tag("/li");
        this.f49231b.line();
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(p7c p7cVar) {
        int startNumber = p7cVar.getStartNumber();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (startNumber != 1) {
            linkedHashMap.put("start", String.valueOf(startNumber));
        }
        renderListBlock(p7cVar, "ol", getAttrs(p7cVar, "ol", linkedHashMap));
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(os7 os7Var) {
        String strEncodeUrl = this.f49230a.encodeUrl(os7Var.getDestination());
        C7706b c7706b = new C7706b();
        os7Var.accept(c7706b);
        String strM13618a = c7706b.m13618a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("src", strEncodeUrl);
        linkedHashMap.put("alt", strM13618a);
        if (os7Var.getTitle() != null) {
            linkedHashMap.put(CommonWebViewActivity.f26185L, os7Var.getTitle());
        }
        this.f49231b.tag("img", getAttrs(os7Var, "img", linkedHashMap), true);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(kz4 kz4Var) {
        this.f49231b.tag(yv7.f103134b, getAttrs(kz4Var, yv7.f103134b));
        visitChildren(kz4Var);
        this.f49231b.tag("/em");
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(iag iagVar) {
        this.f49231b.tag("strong", getAttrs(iagVar, "strong"));
        visitChildren(iagVar);
        this.f49231b.tag("/strong");
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(zpg zpgVar) {
        this.f49231b.text(zpgVar.getLiteral());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(q62 q62Var) {
        this.f49231b.tag(g55.f38796e, getAttrs(q62Var, g55.f38796e));
        this.f49231b.text(q62Var.getLiteral());
        this.f49231b.tag("/code");
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(hm7 hm7Var) {
        if (this.f49230a.shouldEscapeHtml()) {
            this.f49231b.text(hm7Var.getLiteral());
        } else {
            this.f49231b.raw(hm7Var.getLiteral());
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ruf rufVar) {
        this.f49231b.raw(this.f49230a.getSoftbreak());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(og7 og7Var) {
        this.f49231b.tag("br", getAttrs(og7Var, "br"), true);
        this.f49231b.line();
    }
}
