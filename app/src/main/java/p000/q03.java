package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class q03 extends AbstractC7148i5 implements peb {

    /* JADX INFO: renamed from: a */
    public final lqg f72635a;

    /* JADX INFO: renamed from: b */
    public final oqg f72636b;

    /* JADX INFO: renamed from: c */
    public d99 f72637c;

    public q03(lqg lqgVar) {
        this.f72635a = lqgVar;
        this.f72636b = lqgVar.getWriter();
    }

    private void writeEndOfLine() {
        if (this.f72635a.stripNewlines()) {
            this.f72636b.whitespace();
        } else {
            this.f72636b.line();
        }
    }

    private void writeEndOfLineIfNeeded(deb debVar, Character ch) {
        if (!this.f72635a.stripNewlines()) {
            if (debVar.getNext() != null) {
                this.f72636b.line();
            }
        } else {
            if (ch != null) {
                this.f72636b.write(ch.charValue());
            }
            if (debVar.getNext() != null) {
                this.f72636b.whitespace();
            }
        }
    }

    private void writeLink(deb debVar, String str, String str2) {
        boolean z = false;
        boolean z2 = debVar.getFirstChild() != null;
        boolean z3 = (str == null || str.equals(str2)) ? false : true;
        if (str2 != null && !str2.equals("")) {
            z = true;
        }
        if (z2) {
            this.f72636b.write('\"');
            visitChildren(debVar);
            this.f72636b.write('\"');
            if (z3 || z) {
                this.f72636b.whitespace();
                this.f72636b.write('(');
            }
        }
        if (z3) {
            this.f72636b.write(str);
            if (z) {
                this.f72636b.colon();
                this.f72636b.whitespace();
            }
        }
        if (z) {
            this.f72636b.write(str2);
        }
        if (z2) {
            if (z3 || z) {
                this.f72636b.write(')');
            }
        }
    }

    private void writeText(String str) {
        if (this.f72635a.stripNewlines()) {
            this.f72636b.writeStripped(str);
        } else {
            this.f72636b.write(str);
        }
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
            this.f72635a.render(firstChild);
            firstChild = next;
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(o61 o61Var) {
        this.f72636b.write((char) 171);
        visitChildren(o61Var);
        this.f72636b.write((char) 187);
        writeEndOfLineIfNeeded(o61Var, null);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ig1 ig1Var) {
        if (this.f72637c != null) {
            writeEndOfLine();
        }
        this.f72637c = new jg1(this.f72637c, ig1Var);
        visitChildren(ig1Var);
        writeEndOfLineIfNeeded(ig1Var, null);
        if (this.f72637c.getParent() != null) {
            this.f72637c = this.f72637c.getParent();
        } else {
            this.f72637c = null;
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(q62 q62Var) {
        this.f72636b.write('\"');
        this.f72636b.write(q62Var.getLiteral());
        this.f72636b.write('\"');
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(dq5 dq5Var) {
        if (this.f72635a.stripNewlines()) {
            this.f72636b.writeStripped(dq5Var.getLiteral());
            writeEndOfLineIfNeeded(dq5Var, null);
        } else {
            this.f72636b.write(dq5Var.getLiteral());
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(og7 og7Var) {
        writeEndOfLineIfNeeded(og7Var, null);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ni7 ni7Var) {
        visitChildren(ni7Var);
        writeEndOfLineIfNeeded(ni7Var, ':');
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(vwg vwgVar) {
        if (!this.f72635a.stripNewlines()) {
            this.f72636b.write("***");
        }
        writeEndOfLineIfNeeded(vwgVar, null);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(hm7 hm7Var) {
        writeText(hm7Var.getLiteral());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(cm7 cm7Var) {
        writeText(cm7Var.getLiteral());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(os7 os7Var) {
        writeLink(os7Var, os7Var.getTitle(), os7Var.getDestination());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(pz7 pz7Var) {
        if (this.f72635a.stripNewlines()) {
            this.f72636b.writeStripped(pz7Var.getLiteral());
            writeEndOfLineIfNeeded(pz7Var, null);
        } else {
            this.f72636b.write(pz7Var.getLiteral());
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(z69 z69Var) {
        writeLink(z69Var, z69Var.getTitle(), z69Var.getDestination());
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(f99 f99Var) {
        d99 d99Var = this.f72637c;
        if (d99Var != null && (d99Var instanceof q7c)) {
            q7c q7cVar = (q7c) d99Var;
            String indent = this.f72635a.stripNewlines() ? "" : q7cVar.getIndent();
            this.f72636b.write(indent + q7cVar.getCounter() + q7cVar.getDelimiter() + C2473f.f17566z);
            visitChildren(f99Var);
            writeEndOfLineIfNeeded(f99Var, null);
            q7cVar.increaseCounter();
            return;
        }
        if (d99Var == null || !(d99Var instanceof jg1)) {
            return;
        }
        jg1 jg1Var = (jg1) d99Var;
        if (!this.f72635a.stripNewlines()) {
            this.f72636b.write(jg1Var.getIndent() + jg1Var.getMarker() + C2473f.f17566z);
        }
        visitChildren(f99Var);
        writeEndOfLineIfNeeded(f99Var, null);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(p7c p7cVar) {
        if (this.f72637c != null) {
            writeEndOfLine();
        }
        this.f72637c = new q7c(this.f72637c, p7cVar);
        visitChildren(p7cVar);
        writeEndOfLineIfNeeded(p7cVar, null);
        if (this.f72637c.getParent() != null) {
            this.f72637c = this.f72637c.getParent();
        } else {
            this.f72637c = null;
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(cdc cdcVar) {
        visitChildren(cdcVar);
        if (cdcVar.getParent() == null || (cdcVar.getParent() instanceof oh4)) {
            writeEndOfLineIfNeeded(cdcVar, null);
        }
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(ruf rufVar) {
        writeEndOfLineIfNeeded(rufVar, null);
    }

    @Override // p000.AbstractC7148i5, p000.idi
    public void visit(zpg zpgVar) {
        writeText(zpgVar.getLiteral());
    }
}
