package p000;

import java.util.Arrays;
import p000.r3h;

/* JADX INFO: loaded from: classes7.dex */
public final class x3h {

    /* JADX INFO: renamed from: r */
    public static final char f96191r = 65533;

    /* JADX INFO: renamed from: s */
    public static final char[] f96192s;

    /* JADX INFO: renamed from: t */
    public static final int f96193t = 128;

    /* JADX INFO: renamed from: u */
    public static final int[] f96194u = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: a */
    public final kw1 f96195a;

    /* JADX INFO: renamed from: b */
    public final ohc f96196b;

    /* JADX INFO: renamed from: d */
    public r3h f96198d;

    /* JADX INFO: renamed from: i */
    public r3h.AbstractC11875h f96203i;

    /* JADX INFO: renamed from: o */
    public String f96209o;

    /* JADX INFO: renamed from: c */
    public y3h f96197c = y3h.f100271a;

    /* JADX INFO: renamed from: e */
    public boolean f96199e = false;

    /* JADX INFO: renamed from: f */
    public String f96200f = null;

    /* JADX INFO: renamed from: g */
    public StringBuilder f96201g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    public StringBuilder f96202h = new StringBuilder(1024);

    /* JADX INFO: renamed from: j */
    public r3h.C11874g f96204j = new r3h.C11874g();

    /* JADX INFO: renamed from: k */
    public r3h.C11873f f96205k = new r3h.C11873f();

    /* JADX INFO: renamed from: l */
    public r3h.C11869b f96206l = new r3h.C11869b();

    /* JADX INFO: renamed from: m */
    public r3h.C11871d f96207m = new r3h.C11871d();

    /* JADX INFO: renamed from: n */
    public r3h.C11870c f96208n = new r3h.C11870c();

    /* JADX INFO: renamed from: p */
    public final int[] f96210p = new int[1];

    /* JADX INFO: renamed from: q */
    public final int[] f96211q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f96192s = cArr;
        Arrays.sort(cArr);
    }

    public x3h(kw1 kw1Var, ohc ohcVar) {
        this.f96195a = kw1Var;
        this.f96196b = ohcVar;
    }

    private void characterReferenceError(String str) {
        if (this.f96196b.m18677a()) {
            this.f96196b.add(new nhc(this.f96195a.pos(), "Invalid character reference: %s", str));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24952a(y3h y3hVar) {
        this.f96195a.advance();
        this.f96197c = y3hVar;
    }

    /* JADX INFO: renamed from: b */
    public String m24953b() {
        return this.f96209o;
    }

    /* JADX INFO: renamed from: c */
    public int[] m24954c(Character ch, boolean z) {
        int iIntValue;
        if (this.f96195a.isEmpty()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f96195a.current()) || this.f96195a.m15044r(f96192s)) {
            return null;
        }
        int[] iArr = this.f96210p;
        this.f96195a.m15038l();
        if (this.f96195a.m15039m("#")) {
            boolean zM15040n = this.f96195a.m15040n("X");
            kw1 kw1Var = this.f96195a;
            String strM15030d = zM15040n ? kw1Var.m15030d() : kw1Var.m15029c();
            if (strM15030d.length() == 0) {
                characterReferenceError("numeric reference with no numerals");
                this.f96195a.m15051z();
                return null;
            }
            if (!this.f96195a.m15039m(";")) {
                characterReferenceError("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strM15030d, zM15040n ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                characterReferenceError("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (iIntValue >= 128) {
                int[] iArr2 = f96194u;
                if (iIntValue < iArr2.length + 128) {
                    characterReferenceError("character is not a valid unicode code point");
                    iIntValue = iArr2[iIntValue - 128];
                }
            }
            iArr[0] = iIntValue;
            return iArr;
        }
        String strM15032f = this.f96195a.m15032f();
        boolean zM15041o = this.f96195a.m15041o(';');
        if (!fc2.isNamedEntity(strM15032f) || !zM15041o) {
            this.f96195a.m15051z();
            if (zM15041o) {
                characterReferenceError(String.format("invalid named referenece '%s'", strM15032f));
            }
            return null;
        }
        if (z && (this.f96195a.m15047u() || this.f96195a.m15045s() || this.f96195a.m15043q('=', '-', '_'))) {
            this.f96195a.m15051z();
            return null;
        }
        if (!this.f96195a.m15039m(";")) {
            characterReferenceError("missing semicolon");
        }
        int iCodepointsForName = fc2.codepointsForName(strM15032f, this.f96211q);
        if (iCodepointsForName == 1) {
            iArr[0] = this.f96211q[0];
            return iArr;
        }
        if (iCodepointsForName == 2) {
            return this.f96211q;
        }
        v1i.fail("Unexpected characters returned for " + strM15032f);
        return this.f96211q;
    }

    /* JADX INFO: renamed from: d */
    public void m24955d() {
        this.f96208n.reset();
    }

    /* JADX INFO: renamed from: e */
    public void m24956e() {
        this.f96207m.reset();
    }

    /* JADX INFO: renamed from: f */
    public r3h.AbstractC11875h m24957f(boolean z) {
        r3h.AbstractC11875h abstractC11875hReset = z ? this.f96204j.reset() : this.f96205k.reset();
        this.f96203i = abstractC11875hReset;
        return abstractC11875hReset;
    }

    /* JADX INFO: renamed from: g */
    public void m24958g() {
        r3h.m20966a(this.f96202h);
    }

    /* JADX INFO: renamed from: h */
    public boolean m24959h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m24960i(char c) {
        m24962k(String.valueOf(c));
    }

    /* JADX INFO: renamed from: j */
    public void m24961j(r3h r3hVar) {
        v1i.isFalse(this.f96199e, "There is an unread token pending!");
        this.f96198d = r3hVar;
        this.f96199e = true;
        r3h.EnumC11876i enumC11876i = r3hVar.f76973a;
        if (enumC11876i == r3h.EnumC11876i.StartTag) {
            this.f96209o = ((r3h.C11874g) r3hVar).f76982b;
        } else {
            if (enumC11876i != r3h.EnumC11876i.EndTag || ((r3h.C11873f) r3hVar).f76990j == null) {
                return;
            }
            m24970s("Attributes incorrectly present on end tag");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m24962k(String str) {
        if (this.f96200f == null) {
            this.f96200f = str;
            return;
        }
        if (this.f96201g.length() == 0) {
            this.f96201g.append(this.f96200f);
        }
        this.f96201g.append(str);
    }

    /* JADX INFO: renamed from: l */
    public void m24963l(char[] cArr) {
        m24962k(String.valueOf(cArr));
    }

    /* JADX INFO: renamed from: m */
    public void m24964m(int[] iArr) {
        m24962k(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: renamed from: n */
    public void m24965n() {
        m24961j(this.f96208n);
    }

    /* JADX INFO: renamed from: o */
    public void m24966o() {
        m24961j(this.f96207m);
    }

    /* JADX INFO: renamed from: p */
    public void m24967p() {
        this.f96203i.m20980j();
        m24961j(this.f96203i);
    }

    /* JADX INFO: renamed from: q */
    public void m24968q(y3h y3hVar) {
        if (this.f96196b.m18677a()) {
            this.f96196b.add(new nhc(this.f96195a.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", y3hVar));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m24969r(y3h y3hVar) {
        if (this.f96196b.m18677a()) {
            this.f96196b.add(new nhc(this.f96195a.pos(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f96195a.current()), y3hVar));
        }
    }

    public r3h read() {
        while (!this.f96199e) {
            this.f96197c.mo25644g(this, this.f96195a);
        }
        if (this.f96201g.length() > 0) {
            String string = this.f96201g.toString();
            StringBuilder sb = this.f96201g;
            sb.delete(0, sb.length());
            this.f96200f = null;
            return this.f96206l.m20967b(string);
        }
        String str = this.f96200f;
        if (str == null) {
            this.f96199e = false;
            return this.f96198d;
        }
        r3h.C11869b c11869bM20967b = this.f96206l.m20967b(str);
        this.f96200f = null;
        return c11869bM20967b;
    }

    /* JADX INFO: renamed from: s */
    public void m24970s(String str) {
        if (this.f96196b.m18677a()) {
            this.f96196b.add(new nhc(this.f96195a.pos(), str));
        }
    }

    /* JADX INFO: renamed from: t */
    public y3h m24971t() {
        return this.f96197c;
    }

    /* JADX INFO: renamed from: u */
    public boolean m24972u() {
        return this.f96209o != null && this.f96203i.m20984n().equalsIgnoreCase(this.f96209o);
    }

    /* JADX INFO: renamed from: v */
    public void m24973v(y3h y3hVar) {
        this.f96197c = y3hVar;
    }
}
