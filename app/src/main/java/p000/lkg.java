package p000;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import p000.qkg;

/* JADX INFO: loaded from: classes7.dex */
public class lkg {

    /* JADX INFO: renamed from: a */
    public final List<C8873d> f57999a;

    /* JADX INFO: renamed from: lkg$a */
    public enum EnumC8870a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: renamed from: lkg$b */
    public static class C8871b {

        /* JADX INFO: renamed from: a */
        public final EnumC8870a f58004a;

        /* JADX INFO: renamed from: b */
        public final Spanned f58005b;

        public C8871b(@efb EnumC8870a enumC8870a, @efb Spanned spanned) {
            this.f58004a = enumC8870a;
            this.f58005b = spanned;
        }

        @efb
        public EnumC8870a alignment() {
            return this.f58004a;
        }

        @efb
        public Spanned content() {
            return this.f58005b;
        }

        public String toString() {
            return "Column{alignment=" + this.f58004a + ", content=" + ((Object) this.f58005b) + '}';
        }
    }

    /* JADX INFO: renamed from: lkg$c */
    public static class C8872c extends AbstractC7148i5 {

        /* JADX INFO: renamed from: a */
        public final ku9 f58006a;

        /* JADX INFO: renamed from: b */
        public List<C8873d> f58007b;

        /* JADX INFO: renamed from: c */
        public List<C8871b> f58008c;

        /* JADX INFO: renamed from: d */
        public boolean f58009d;

        public C8872c(@efb ku9 ku9Var) {
            this.f58006a = ku9Var;
        }

        @efb
        private static EnumC8870a alignment(@efb qkg.EnumC11525a enumC11525a) {
            return qkg.EnumC11525a.RIGHT == enumC11525a ? EnumC8870a.RIGHT : qkg.EnumC11525a.CENTER == enumC11525a ? EnumC8870a.CENTER : EnumC8870a.LEFT;
        }

        @hib
        public List<C8873d> rows() {
            return this.f58007b;
        }

        @Override // p000.AbstractC7148i5, p000.idi
        public void visit(hd3 hd3Var) {
            if (hd3Var instanceof qkg) {
                qkg qkgVar = (qkg) hd3Var;
                if (this.f58008c == null) {
                    this.f58008c = new ArrayList(2);
                }
                this.f58008c.add(new C8871b(alignment(qkgVar.getAlignment()), this.f58006a.render(qkgVar)));
                this.f58009d = qkgVar.isHeader();
                return;
            }
            if (!(hd3Var instanceof dlg) && !(hd3Var instanceof jlg)) {
                visitChildren(hd3Var);
                return;
            }
            visitChildren(hd3Var);
            List<C8871b> list = this.f58008c;
            if (list != null && list.size() > 0) {
                if (this.f58007b == null) {
                    this.f58007b = new ArrayList(2);
                }
                this.f58007b.add(new C8873d(this.f58009d, this.f58008c));
            }
            this.f58008c = null;
            this.f58009d = false;
        }
    }

    /* JADX INFO: renamed from: lkg$d */
    public static class C8873d {

        /* JADX INFO: renamed from: a */
        public final boolean f58010a;

        /* JADX INFO: renamed from: b */
        public final List<C8871b> f58011b;

        public C8873d(boolean z, @efb List<C8871b> list) {
            this.f58010a = z;
            this.f58011b = list;
        }

        @efb
        public List<C8871b> columns() {
            return this.f58011b;
        }

        public boolean header() {
            return this.f58010a;
        }

        public String toString() {
            return "Row{isHeader=" + this.f58010a + ", columns=" + this.f58011b + '}';
        }
    }

    public lkg(@efb List<C8873d> list) {
        this.f57999a = list;
    }

    @hib
    public static lkg parse(@efb ku9 ku9Var, @efb nkg nkgVar) {
        C8872c c8872c = new C8872c(ku9Var);
        nkgVar.accept(c8872c);
        List<C8873d> listRows = c8872c.rows();
        if (listRows == null) {
            return null;
        }
        return new lkg(listRows);
    }

    @efb
    public List<C8873d> rows() {
        return this.f57999a;
    }

    public String toString() {
        return "Table{rows=" + this.f57999a + '}';
    }
}
