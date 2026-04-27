package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r3h {

    /* JADX INFO: renamed from: a */
    public final EnumC11876i f76973a;

    /* JADX INFO: renamed from: r3h$a */
    public static final class C11868a extends C11869b {
        public C11868a(String str) {
            m20967b(str);
        }

        @Override // p000.r3h.C11869b
        public String toString() {
            return "<![CDATA[" + getData() + "]]>";
        }
    }

    /* JADX INFO: renamed from: r3h$b */
    public static class C11869b extends r3h {

        /* JADX INFO: renamed from: b */
        public String f76974b;

        public C11869b() {
            super(EnumC11876i.Character);
        }

        /* JADX INFO: renamed from: b */
        public C11869b m20967b(String str) {
            this.f76974b = str;
            return this;
        }

        public String getData() {
            return this.f76974b;
        }

        @Override // p000.r3h
        public r3h reset() {
            this.f76974b = null;
            return this;
        }

        public String toString() {
            return getData();
        }
    }

    /* JADX INFO: renamed from: r3h$c */
    public static final class C11870c extends r3h {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f76975b;

        /* JADX INFO: renamed from: c */
        public boolean f76976c;

        public C11870c() {
            super(EnumC11876i.Comment);
            this.f76975b = new StringBuilder();
            this.f76976c = false;
        }

        public String getData() {
            return this.f76975b.toString();
        }

        @Override // p000.r3h
        public r3h reset() {
            r3h.m20966a(this.f76975b);
            this.f76976c = false;
            return this;
        }

        public String toString() {
            return "<!--" + getData() + "-->";
        }
    }

    /* JADX INFO: renamed from: r3h$d */
    public static final class C11871d extends r3h {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f76977b;

        /* JADX INFO: renamed from: c */
        public String f76978c;

        /* JADX INFO: renamed from: d */
        public final StringBuilder f76979d;

        /* JADX INFO: renamed from: e */
        public final StringBuilder f76980e;

        /* JADX INFO: renamed from: f */
        public boolean f76981f;

        public C11871d() {
            super(EnumC11876i.Doctype);
            this.f76977b = new StringBuilder();
            this.f76978c = null;
            this.f76979d = new StringBuilder();
            this.f76980e = new StringBuilder();
            this.f76981f = false;
        }

        /* JADX INFO: renamed from: b */
        public String m20968b() {
            return this.f76977b.toString();
        }

        /* JADX INFO: renamed from: c */
        public String m20969c() {
            return this.f76978c;
        }

        /* JADX INFO: renamed from: d */
        public String m20970d() {
            return this.f76979d.toString();
        }

        public String getSystemIdentifier() {
            return this.f76980e.toString();
        }

        public boolean isForceQuirks() {
            return this.f76981f;
        }

        @Override // p000.r3h
        public r3h reset() {
            r3h.m20966a(this.f76977b);
            this.f76978c = null;
            r3h.m20966a(this.f76979d);
            r3h.m20966a(this.f76980e);
            this.f76981f = false;
            return this;
        }
    }

    /* JADX INFO: renamed from: r3h$e */
    public static final class C11872e extends r3h {
        public C11872e() {
            super(EnumC11876i.EOF);
        }

        @Override // p000.r3h
        public r3h reset() {
            return this;
        }
    }

    /* JADX INFO: renamed from: r3h$f */
    public static final class C11873f extends AbstractC11875h {
        public C11873f() {
            super(EnumC11876i.EndTag);
        }

        public String toString() {
            return "</" + m20984n() + ">";
        }
    }

    /* JADX INFO: renamed from: r3h$g */
    public static final class C11874g extends AbstractC11875h {
        public C11874g() {
            super(EnumC11876i.StartTag);
            this.f76990j = new rc0();
        }

        /* JADX INFO: renamed from: r */
        public C11874g m20971r(String str, rc0 rc0Var) {
            this.f76982b = str;
            this.f76990j = rc0Var;
            this.f76983c = rfb.lowerCase(str);
            return this;
        }

        public String toString() {
            rc0 rc0Var = this.f76990j;
            if (rc0Var == null || rc0Var.size() <= 0) {
                return "<" + m20984n() + ">";
            }
            return "<" + m20984n() + C2473f.f17566z + this.f76990j.toString() + ">";
        }

        @Override // p000.r3h.AbstractC11875h, p000.r3h
        public AbstractC11875h reset() {
            super.reset();
            this.f76990j = new rc0();
            return this;
        }
    }

    /* JADX INFO: renamed from: r3h$h */
    public static abstract class AbstractC11875h extends r3h {

        /* JADX INFO: renamed from: b */
        public String f76982b;

        /* JADX INFO: renamed from: c */
        public String f76983c;

        /* JADX INFO: renamed from: d */
        public String f76984d;

        /* JADX INFO: renamed from: e */
        public StringBuilder f76985e;

        /* JADX INFO: renamed from: f */
        public String f76986f;

        /* JADX INFO: renamed from: g */
        public boolean f76987g;

        /* JADX INFO: renamed from: h */
        public boolean f76988h;

        /* JADX INFO: renamed from: i */
        public boolean f76989i;

        /* JADX INFO: renamed from: j */
        public rc0 f76990j;

        public AbstractC11875h(@efb EnumC11876i enumC11876i) {
            super(enumC11876i);
            this.f76985e = new StringBuilder();
            this.f76987g = false;
            this.f76988h = false;
            this.f76989i = false;
        }

        private void ensureAttributeValue() {
            this.f76988h = true;
            String str = this.f76986f;
            if (str != null) {
                this.f76985e.append(str);
                this.f76986f = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m20972b(char c) {
            m20973c(String.valueOf(c));
        }

        /* JADX INFO: renamed from: c */
        public final void m20973c(String str) {
            String str2 = this.f76984d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f76984d = str;
        }

        /* JADX INFO: renamed from: d */
        public final void m20974d(char c) {
            ensureAttributeValue();
            this.f76985e.append(c);
        }

        /* JADX INFO: renamed from: e */
        public final void m20975e(String str) {
            ensureAttributeValue();
            if (this.f76985e.length() == 0) {
                this.f76986f = str;
            } else {
                this.f76985e.append(str);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m20976f(char[] cArr) {
            ensureAttributeValue();
            this.f76985e.append(cArr);
        }

        /* JADX INFO: renamed from: g */
        public final void m20977g(int[] iArr) {
            ensureAttributeValue();
            for (int i : iArr) {
                this.f76985e.appendCodePoint(i);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m20978h(char c) {
            m20979i(String.valueOf(c));
        }

        /* JADX INFO: renamed from: i */
        public final void m20979i(String str) {
            String str2 = this.f76982b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f76982b = str;
            this.f76983c = rfb.lowerCase(str);
        }

        /* JADX INFO: renamed from: j */
        public final void m20980j() {
            if (this.f76984d != null) {
                m20985o();
            }
        }

        /* JADX INFO: renamed from: k */
        public final rc0 m20981k() {
            return this.f76990j;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m20982l() {
            return this.f76989i;
        }

        /* JADX INFO: renamed from: m */
        public final AbstractC11875h m20983m(String str) {
            this.f76982b = str;
            this.f76983c = rfb.lowerCase(str);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public final String m20984n() {
            String str = this.f76982b;
            v1i.isFalse(str == null || str.length() == 0);
            return this.f76982b;
        }

        /* JADX INFO: renamed from: o */
        public final void m20985o() {
            if (this.f76990j == null) {
                this.f76990j = new rc0();
            }
            String str = this.f76984d;
            if (str != null) {
                String strTrim = str.trim();
                this.f76984d = strTrim;
                if (strTrim.length() > 0) {
                    this.f76990j.put(this.f76984d, this.f76988h ? this.f76985e.length() > 0 ? this.f76985e.toString() : this.f76986f : this.f76987g ? "" : null);
                }
            }
            this.f76984d = null;
            this.f76987g = false;
            this.f76988h = false;
            r3h.m20966a(this.f76985e);
            this.f76986f = null;
        }

        /* JADX INFO: renamed from: p */
        public final String m20986p() {
            return this.f76983c;
        }

        /* JADX INFO: renamed from: q */
        public final void m20987q() {
            this.f76987g = true;
        }

        @Override // p000.r3h
        public AbstractC11875h reset() {
            this.f76982b = null;
            this.f76983c = null;
            this.f76984d = null;
            r3h.m20966a(this.f76985e);
            this.f76986f = null;
            this.f76987g = false;
            this.f76988h = false;
            this.f76989i = false;
            this.f76990j = null;
            return this;
        }
    }

    /* JADX INFO: renamed from: r3h$i */
    public enum EnumC11876i {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public r3h(@efb EnumC11876i enumC11876i) {
        this.f76973a = enumC11876i;
    }

    /* JADX INFO: renamed from: a */
    public static void m20966a(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public abstract r3h reset();
}
