package p000;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.o03;
import p000.vu9;
import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class n03 extends AbstractC14875x2 {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC9637p> f62881a = new ArrayList(0);

    /* JADX INFO: renamed from: b */
    public boolean f62882b;

    /* JADX INFO: renamed from: n03$a */
    public class C9622a implements yu9.InterfaceC15813c<vwg> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb vwg vwgVar) {
            yu9Var.blockStart(vwgVar);
            int length = yu9Var.length();
            yu9Var.builder().append(xnh.f98716g);
            yu9Var.setSpansForNodeOptional(vwgVar, length);
            yu9Var.blockEnd(vwgVar);
        }
    }

    /* JADX INFO: renamed from: n03$b */
    public class C9623b implements yu9.InterfaceC15813c<ni7> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb ni7 ni7Var) {
            yu9Var.blockStart(ni7Var);
            int length = yu9Var.length();
            yu9Var.visitChildren(ni7Var);
            o03.f66152d.set(yu9Var.renderProps(), Integer.valueOf(ni7Var.getLevel()));
            yu9Var.setSpansForNodeOptional(ni7Var, length);
            yu9Var.blockEnd(ni7Var);
        }
    }

    /* JADX INFO: renamed from: n03$c */
    public class C9624c implements yu9.InterfaceC15813c<ruf> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb ruf rufVar) {
            yu9Var.builder().append(' ');
        }
    }

    /* JADX INFO: renamed from: n03$d */
    public class C9625d implements yu9.InterfaceC15813c<og7> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb og7 og7Var) {
            yu9Var.ensureNewLine();
        }
    }

    /* JADX INFO: renamed from: n03$e */
    public class C9626e implements yu9.InterfaceC15813c<cdc> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb cdc cdcVar) {
            boolean zIsInTightList = n03.isInTightList(cdcVar);
            if (!zIsInTightList) {
                yu9Var.blockStart(cdcVar);
            }
            int length = yu9Var.length();
            yu9Var.visitChildren(cdcVar);
            o03.f66154f.set(yu9Var.renderProps(), Boolean.valueOf(zIsInTightList));
            yu9Var.setSpansForNodeOptional(cdcVar, length);
            if (zIsInTightList) {
                return;
            }
            yu9Var.blockEnd(cdcVar);
        }
    }

    /* JADX INFO: renamed from: n03$f */
    public class C9627f implements yu9.InterfaceC15813c<z69> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb z69 z69Var) {
            int length = yu9Var.length();
            yu9Var.visitChildren(z69Var);
            o03.f66153e.set(yu9Var.renderProps(), z69Var.getDestination());
            yu9Var.setSpansForNodeOptional(z69Var, length);
        }
    }

    /* JADX INFO: renamed from: n03$g */
    public class C9628g implements yu9.InterfaceC15813c<zpg> {
        public C9628g() {
        }

        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb zpg zpgVar) {
            String literal = zpgVar.getLiteral();
            yu9Var.builder().append(literal);
            if (n03.this.f62881a.isEmpty()) {
                return;
            }
            int length = yu9Var.length() - literal.length();
            Iterator it = n03.this.f62881a.iterator();
            while (it.hasNext()) {
                ((InterfaceC9637p) it.next()).onTextAdded(yu9Var, literal, length);
            }
        }
    }

    /* JADX INFO: renamed from: n03$h */
    public class C9629h implements yu9.InterfaceC15813c<iag> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb iag iagVar) {
            int length = yu9Var.length();
            yu9Var.visitChildren(iagVar);
            yu9Var.setSpansForNodeOptional(iagVar, length);
        }
    }

    /* JADX INFO: renamed from: n03$i */
    public class C9630i implements yu9.InterfaceC15813c<kz4> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb kz4 kz4Var) {
            int length = yu9Var.length();
            yu9Var.visitChildren(kz4Var);
            yu9Var.setSpansForNodeOptional(kz4Var, length);
        }
    }

    /* JADX INFO: renamed from: n03$j */
    public class C9631j implements yu9.InterfaceC15813c<o61> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb o61 o61Var) {
            yu9Var.blockStart(o61Var);
            int length = yu9Var.length();
            yu9Var.visitChildren(o61Var);
            yu9Var.setSpansForNodeOptional(o61Var, length);
            yu9Var.blockEnd(o61Var);
        }
    }

    /* JADX INFO: renamed from: n03$k */
    public class C9632k implements yu9.InterfaceC15813c<q62> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb q62 q62Var) {
            int length = yu9Var.length();
            yu9Var.builder().append(xnh.f98716g).append(q62Var.getLiteral()).append(xnh.f98716g);
            yu9Var.setSpansForNodeOptional(q62Var, length);
        }
    }

    /* JADX INFO: renamed from: n03$l */
    public class C9633l implements yu9.InterfaceC15813c<dq5> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb dq5 dq5Var) {
            n03.m17689d(yu9Var, dq5Var.getInfo(), dq5Var.getLiteral(), dq5Var);
        }
    }

    /* JADX INFO: renamed from: n03$m */
    public class C9634m implements yu9.InterfaceC15813c<pz7> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb pz7 pz7Var) {
            n03.m17689d(yu9Var, null, pz7Var.getLiteral(), pz7Var);
        }
    }

    /* JADX INFO: renamed from: n03$n */
    public class C9635n implements yu9.InterfaceC15813c<os7> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb os7 os7Var) {
            qwf qwfVar = yu9Var.configuration().spansFactory().get(os7.class);
            if (qwfVar == null) {
                yu9Var.visitChildren(os7Var);
                return;
            }
            int length = yu9Var.length();
            yu9Var.visitChildren(os7Var);
            if (length == yu9Var.length()) {
                yu9Var.builder().append((char) 65532);
            }
            mu9 mu9VarConfiguration = yu9Var.configuration();
            boolean z = os7Var.getParent() instanceof z69;
            String strProcess = mu9VarConfiguration.imageDestinationProcessor().process(os7Var.getDestination());
            l1e l1eVarRenderProps = yu9Var.renderProps();
            rv7.f79739a.set(l1eVarRenderProps, strProcess);
            rv7.f79740b.set(l1eVarRenderProps, Boolean.valueOf(z));
            rv7.f79741c.set(l1eVarRenderProps, null);
            yu9Var.setSpans(length, qwfVar.getSpans(mu9VarConfiguration, l1eVarRenderProps));
        }
    }

    /* JADX INFO: renamed from: n03$o */
    public class C9636o implements yu9.InterfaceC15813c<f99> {
        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb f99 f99Var) {
            int length = yu9Var.length();
            yu9Var.visitChildren(f99Var);
            b61 parent = f99Var.getParent();
            if (parent instanceof p7c) {
                p7c p7cVar = (p7c) parent;
                int startNumber = p7cVar.getStartNumber();
                o03.f66149a.set(yu9Var.renderProps(), o03.EnumC10128a.ORDERED);
                o03.f66151c.set(yu9Var.renderProps(), Integer.valueOf(startNumber));
                p7cVar.setStartNumber(p7cVar.getStartNumber() + 1);
            } else {
                o03.f66149a.set(yu9Var.renderProps(), o03.EnumC10128a.BULLET);
                o03.f66150b.set(yu9Var.renderProps(), Integer.valueOf(n03.listLevel(f99Var)));
            }
            yu9Var.setSpansForNodeOptional(f99Var, length);
            if (yu9Var.hasNext(f99Var)) {
                yu9Var.ensureNewLine();
            }
        }
    }

    /* JADX INFO: renamed from: n03$p */
    public interface InterfaceC9637p {
        void onTextAdded(@efb yu9 yu9Var, @efb String str, int i);
    }

    private static void blockQuote(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(o61.class, new C9631j());
    }

    private static void bulletList(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(ig1.class, new zhf());
    }

    private static void code(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(q62.class, new C9632k());
    }

    @efb
    public static n03 create() {
        return new n03();
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public static void m17689d(@efb yu9 yu9Var, @hib String str, @efb String str2, @efb deb debVar) {
        yu9Var.blockStart(debVar);
        int length = yu9Var.length();
        yu9Var.builder().append(xnh.f98716g).append('\n').append(yu9Var.configuration().syntaxHighlight().highlight(str, str2));
        yu9Var.ensureNewLine();
        yu9Var.builder().append(xnh.f98716g);
        o03.f66155g.set(yu9Var.renderProps(), str);
        yu9Var.setSpansForNodeOptional(debVar, length);
        yu9Var.blockEnd(debVar);
    }

    private static void emphasis(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(kz4.class, new C9630i());
    }

    @efb
    public static Set<Class<? extends b61>> enabledBlockTypes() {
        return new HashSet(Arrays.asList(o61.class, ni7.class, dq5.class, cm7.class, vwg.class, f89.class, pz7.class));
    }

    private static void fencedCodeBlock(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(dq5.class, new C9633l());
    }

    private static void hardLineBreak(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(og7.class, new C9625d());
    }

    private static void heading(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(ni7.class, new C9623b());
    }

    private static void image(yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(os7.class, new C9635n());
    }

    private static void indentedCodeBlock(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(pz7.class, new C9634m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTightList(@efb cdc cdcVar) {
        b61 parent = cdcVar.getParent();
        if (parent == null) {
            return false;
        }
        deb parent2 = parent.getParent();
        if (parent2 instanceof f89) {
            return ((f89) parent2).isTight();
        }
        return false;
    }

    private static void link(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(z69.class, new C9627f());
    }

    private static void listItem(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(f99.class, new C9636o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int listLevel(@efb deb debVar) {
        int i = 0;
        for (deb parent = debVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof f99) {
                i++;
            }
        }
        return i;
    }

    private static void orderedList(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(p7c.class, new zhf());
    }

    private static void paragraph(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(cdc.class, new C9626e());
    }

    private static void softLineBreak(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(ruf.class, new C9624c());
    }

    private static void strongEmphasis(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(iag.class, new C9629h());
    }

    private void text(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(zpg.class, new C9628g());
    }

    private static void thematicBreak(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(vwg.class, new C9622a());
    }

    @efb
    public n03 addOnTextAddedListener(@efb InterfaceC9637p interfaceC9637p) {
        this.f62881a.add(interfaceC9637p);
        return this;
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void afterSetText(@efb TextView textView) {
        if (this.f62882b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void beforeSetText(@efb TextView textView, @efb Spanned spanned) {
        r7c.measure(textView, spanned);
        if (spanned instanceof Spannable) {
            swg.applyTo((Spannable) spanned, textView);
        }
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureSpansFactory(@efb vu9.InterfaceC14262a interfaceC14262a) {
        w62 w62Var = new w62();
        interfaceC14262a.setFactory(iag.class, new lag()).setFactory(kz4.class, new oz4()).setFactory(o61.class, new r61()).setFactory(q62.class, new z62()).setFactory(dq5.class, w62Var).setFactory(pz7.class, w62Var).setFactory(f99.class, new h99()).setFactory(ni7.class, new ri7()).setFactory(z69.class, new l79()).setFactory(vwg.class, new ywg());
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureVisitor(@efb yu9.InterfaceC15812b interfaceC15812b) {
        text(interfaceC15812b);
        strongEmphasis(interfaceC15812b);
        emphasis(interfaceC15812b);
        blockQuote(interfaceC15812b);
        code(interfaceC15812b);
        fencedCodeBlock(interfaceC15812b);
        indentedCodeBlock(interfaceC15812b);
        image(interfaceC15812b);
        bulletList(interfaceC15812b);
        orderedList(interfaceC15812b);
        listItem(interfaceC15812b);
        thematicBreak(interfaceC15812b);
        heading(interfaceC15812b);
        softLineBreak(interfaceC15812b);
        hardLineBreak(interfaceC15812b);
        paragraph(interfaceC15812b);
        link(interfaceC15812b);
    }

    @efb
    public n03 hasExplicitMovementMethod(boolean z) {
        this.f62882b = z;
        return this;
    }
}
