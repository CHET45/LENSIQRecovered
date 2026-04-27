package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public final class m55 {

    /* JADX INFO: renamed from: a */
    public static final l55 f59923a = new C9143a();

    /* JADX INFO: renamed from: m55$a */
    public class C9143a extends uv1 {
        @Override // p000.uv1
        @wx1
        /* JADX INFO: renamed from: a */
        public char[] mo16624a(char c) {
            return null;
        }

        @Override // p000.uv1, p000.l55
        public String escape(String string) {
            return (String) v7d.checkNotNull(string);
        }
    }

    /* JADX INFO: renamed from: m55$b */
    public class C9144b extends qsh {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ uv1 f59924c;

        public C9144b(final uv1 val$escaper) {
            this.f59924c = val$escaper;
        }

        @Override // p000.qsh
        @wx1
        /* JADX INFO: renamed from: b */
        public char[] mo16625b(int cp) {
            if (cp < 65536) {
                return this.f59924c.mo16624a((char) cp);
            }
            char[] cArr = new char[2];
            Character.toChars(cp, cArr, 0);
            char[] cArrMo16624a = this.f59924c.mo16624a(cArr[0]);
            char[] cArrMo16624a2 = this.f59924c.mo16624a(cArr[1]);
            if (cArrMo16624a == null && cArrMo16624a2 == null) {
                return null;
            }
            int length = cArrMo16624a != null ? cArrMo16624a.length : 1;
            char[] cArr2 = new char[(cArrMo16624a2 != null ? cArrMo16624a2.length : 1) + length];
            if (cArrMo16624a != null) {
                for (int i = 0; i < cArrMo16624a.length; i++) {
                    cArr2[i] = cArrMo16624a[i];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (cArrMo16624a2 != null) {
                for (int i2 = 0; i2 < cArrMo16624a2.length; i2++) {
                    cArr2[length + i2] = cArrMo16624a2[i2];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    /* JADX INFO: renamed from: m55$c */
    public static final class C9145c {

        /* JADX INFO: renamed from: a */
        public final Map<Character, String> f59925a;

        /* JADX INFO: renamed from: b */
        public char f59926b;

        /* JADX INFO: renamed from: c */
        public char f59927c;

        /* JADX INFO: renamed from: d */
        @wx1
        public String f59928d;

        /* JADX INFO: renamed from: m55$c$a */
        public class a extends n50 {

            /* JADX INFO: renamed from: g */
            @wx1
            public final char[] f59929g;

            public a(Map replacementMap, char safeMin, char safeMax) {
                super((Map<Character, String>) replacementMap, safeMin, safeMax);
                this.f59929g = C9145c.this.f59928d != null ? C9145c.this.f59928d.toCharArray() : null;
            }

            @Override // p000.n50
            @wx1
            /* JADX INFO: renamed from: c */
            public char[] mo16627c(char c) {
                return this.f59929g;
            }
        }

        public /* synthetic */ C9145c(C9143a c9143a) {
            this();
        }

        @op1
        public C9145c addEscape(char c, String replacement) {
            v7d.checkNotNull(replacement);
            this.f59925a.put(Character.valueOf(c), replacement);
            return this;
        }

        public l55 build() {
            return new a(this.f59925a, this.f59926b, this.f59927c);
        }

        @op1
        public C9145c setSafeRange(char safeMin, char safeMax) {
            this.f59926b = safeMin;
            this.f59927c = safeMax;
            return this;
        }

        @op1
        public C9145c setUnsafeReplacement(String unsafeReplacement) {
            this.f59928d = unsafeReplacement;
            return this;
        }

        private C9145c() {
            this.f59925a = new HashMap();
            this.f59926b = (char) 0;
            this.f59927c = (char) 65535;
            this.f59928d = null;
        }
    }

    private m55() {
    }

    /* JADX INFO: renamed from: a */
    public static qsh m16623a(l55 escaper) {
        v7d.checkNotNull(escaper);
        if (escaper instanceof qsh) {
            return (qsh) escaper;
        }
        if (escaper instanceof uv1) {
            return wrap((uv1) escaper);
        }
        throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + escaper.getClass().getName());
    }

    public static C9145c builder() {
        return new C9145c(null);
    }

    @wx1
    public static String computeReplacement(uv1 escaper, char c) {
        return stringOrNull(escaper.mo16624a(c));
    }

    public static l55 nullEscaper() {
        return f59923a;
    }

    @wx1
    private static String stringOrNull(@wx1 char[] in) {
        if (in == null) {
            return null;
        }
        return new String(in);
    }

    private static qsh wrap(uv1 escaper) {
        return new C9144b(escaper);
    }

    @wx1
    public static String computeReplacement(qsh escaper, int cp) {
        return stringOrNull(escaper.mo16625b(cp));
    }
}
