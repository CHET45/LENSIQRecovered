package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class av9 implements yu9 {

    /* JADX INFO: renamed from: a */
    public final mu9 f11920a;

    /* JADX INFO: renamed from: b */
    public final l1e f11921b;

    /* JADX INFO: renamed from: c */
    public final ywf f11922c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<? extends deb>, yu9.InterfaceC15813c<? extends deb>> f11923d;

    /* JADX INFO: renamed from: e */
    public final yu9.InterfaceC15811a f11924e;

    /* JADX INFO: renamed from: av9$a */
    public static class C1616a implements yu9.InterfaceC15812b {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends deb>, yu9.InterfaceC15813c<? extends deb>> f11925a = new HashMap();

        /* JADX INFO: renamed from: b */
        public yu9.InterfaceC15811a f11926b;

        @Override // p000.yu9.InterfaceC15812b
        @efb
        public yu9.InterfaceC15812b blockHandler(@efb yu9.InterfaceC15811a interfaceC15811a) {
            this.f11926b = interfaceC15811a;
            return this;
        }

        @Override // p000.yu9.InterfaceC15812b
        @efb
        public yu9 build(@efb mu9 mu9Var, @efb l1e l1eVar) {
            yu9.InterfaceC15811a g61Var = this.f11926b;
            if (g61Var == null) {
                g61Var = new g61();
            }
            return new av9(mu9Var, l1eVar, new ywf(), Collections.unmodifiableMap(this.f11925a), g61Var);
        }

        @Override // p000.yu9.InterfaceC15812b
        @efb
        /* JADX INFO: renamed from: on */
        public <N extends deb> yu9.InterfaceC15812b mo2700on(@efb Class<N> cls, @hib yu9.InterfaceC15813c<? super N> interfaceC15813c) {
            if (interfaceC15813c == null) {
                this.f11925a.remove(cls);
            } else {
                this.f11925a.put(cls, interfaceC15813c);
            }
            return this;
        }
    }

    public av9(@efb mu9 mu9Var, @efb l1e l1eVar, @efb ywf ywfVar, @efb Map<Class<? extends deb>, yu9.InterfaceC15813c<? extends deb>> map, @efb yu9.InterfaceC15811a interfaceC15811a) {
        this.f11920a = mu9Var;
        this.f11921b = l1eVar;
        this.f11922c = ywfVar;
        this.f11923d = map;
        this.f11924e = interfaceC15811a;
    }

    @Override // p000.yu9
    public void blockEnd(@efb deb debVar) {
        this.f11924e.blockEnd(this, debVar);
    }

    @Override // p000.yu9
    public void blockStart(@efb deb debVar) {
        this.f11924e.blockStart(this, debVar);
    }

    @Override // p000.yu9
    @efb
    public ywf builder() {
        return this.f11922c;
    }

    @Override // p000.yu9
    public void clear() {
        this.f11921b.clearAll();
        this.f11922c.clear();
    }

    @Override // p000.yu9
    @efb
    public mu9 configuration() {
        return this.f11920a;
    }

    @Override // p000.yu9
    public void ensureNewLine() {
        if (this.f11922c.length() <= 0 || '\n' == this.f11922c.lastChar()) {
            return;
        }
        this.f11922c.append('\n');
    }

    @Override // p000.yu9
    public void forceNewLine() {
        this.f11922c.append('\n');
    }

    @Override // p000.yu9
    public boolean hasNext(@efb deb debVar) {
        return debVar.getNext() != null;
    }

    @Override // p000.yu9
    public int length() {
        return this.f11922c.length();
    }

    @Override // p000.yu9
    @efb
    public l1e renderProps() {
        return this.f11921b;
    }

    @Override // p000.yu9
    public void setSpans(int i, @hib Object obj) {
        ywf ywfVar = this.f11922c;
        ywf.setSpans(ywfVar, obj, i, ywfVar.length());
    }

    @Override // p000.yu9
    public <N extends deb> void setSpansForNode(@efb N n, int i) {
        setSpansForNode(n.getClass(), i);
    }

    @Override // p000.yu9
    public <N extends deb> void setSpansForNodeOptional(@efb N n, int i) {
        setSpansForNodeOptional(n.getClass(), i);
    }

    @Override // p000.idi
    public void visit(o61 o61Var) {
        visit((deb) o61Var);
    }

    @Override // p000.yu9
    public void visitChildren(@efb deb debVar) {
        deb firstChild = debVar.getFirstChild();
        while (firstChild != null) {
            deb next = firstChild.getNext();
            firstChild.accept(this);
            firstChild = next;
        }
    }

    @Override // p000.yu9
    public <N extends deb> void setSpansForNode(@efb Class<N> cls, int i) {
        setSpans(i, this.f11920a.spansFactory().require(cls).getSpans(this.f11920a, this.f11921b));
    }

    @Override // p000.yu9
    public <N extends deb> void setSpansForNodeOptional(@efb Class<N> cls, int i) {
        qwf qwfVar = this.f11920a.spansFactory().get(cls);
        if (qwfVar != null) {
            setSpans(i, qwfVar.getSpans(this.f11920a, this.f11921b));
        }
    }

    @Override // p000.idi
    public void visit(ig1 ig1Var) {
        visit((deb) ig1Var);
    }

    @Override // p000.idi
    public void visit(q62 q62Var) {
        visit((deb) q62Var);
    }

    @Override // p000.idi
    public void visit(oh4 oh4Var) {
        visit((deb) oh4Var);
    }

    @Override // p000.idi
    public void visit(kz4 kz4Var) {
        visit((deb) kz4Var);
    }

    @Override // p000.idi
    public void visit(dq5 dq5Var) {
        visit((deb) dq5Var);
    }

    @Override // p000.idi
    public void visit(og7 og7Var) {
        visit((deb) og7Var);
    }

    @Override // p000.idi
    public void visit(ni7 ni7Var) {
        visit((deb) ni7Var);
    }

    @Override // p000.idi
    public void visit(vwg vwgVar) {
        visit((deb) vwgVar);
    }

    @Override // p000.idi
    public void visit(hm7 hm7Var) {
        visit((deb) hm7Var);
    }

    @Override // p000.idi
    public void visit(cm7 cm7Var) {
        visit((deb) cm7Var);
    }

    @Override // p000.idi
    public void visit(os7 os7Var) {
        visit((deb) os7Var);
    }

    @Override // p000.idi
    public void visit(pz7 pz7Var) {
        visit((deb) pz7Var);
    }

    @Override // p000.idi
    public void visit(z69 z69Var) {
        visit((deb) z69Var);
    }

    @Override // p000.idi
    public void visit(f99 f99Var) {
        visit((deb) f99Var);
    }

    @Override // p000.idi
    public void visit(p7c p7cVar) {
        visit((deb) p7cVar);
    }

    @Override // p000.idi
    public void visit(cdc cdcVar) {
        visit((deb) cdcVar);
    }

    @Override // p000.idi
    public void visit(ruf rufVar) {
        visit((deb) rufVar);
    }

    @Override // p000.idi
    public void visit(iag iagVar) {
        visit((deb) iagVar);
    }

    @Override // p000.idi
    public void visit(zpg zpgVar) {
        visit((deb) zpgVar);
    }

    @Override // p000.idi
    public void visit(g79 g79Var) {
        visit((deb) g79Var);
    }

    @Override // p000.idi
    public void visit(oc3 oc3Var) {
        visit((deb) oc3Var);
    }

    @Override // p000.idi
    public void visit(hd3 hd3Var) {
        visit((deb) hd3Var);
    }

    private void visit(@efb deb debVar) {
        yu9.InterfaceC15813c<? extends deb> interfaceC15813c = this.f11923d.get(debVar.getClass());
        if (interfaceC15813c != null) {
            interfaceC15813c.visit(this, debVar);
        } else {
            visitChildren(debVar);
        }
    }
}
