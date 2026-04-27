package p000;

import androidx.appcompat.widget.C0546a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000.nm7;
import p000.nu9;
import p000.om7;
import p000.r3h;

/* JADX INFO: loaded from: classes7.dex */
public class ou9 extends nu9 {

    /* JADX INFO: renamed from: j */
    public static final String f68825j = "p";

    /* JADX INFO: renamed from: a */
    public final fm7 f68827a;

    /* JADX INFO: renamed from: b */
    public final ajh f68828b;

    /* JADX INFO: renamed from: c */
    public final List<om7.C10468b> f68829c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public om7.C10467a f68830d = om7.C10467a.m18777c();

    /* JADX INFO: renamed from: e */
    public boolean f68831e;

    /* JADX INFO: renamed from: f */
    public boolean f68832f;

    /* JADX INFO: renamed from: g */
    @fdi
    public static final Set<String> f68822g = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", g55.f38796e, "dfn", yv7.f103134b, "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", C0546a.f3357s, "tt", "var")));

    /* JADX INFO: renamed from: h */
    public static final Set<String> f68823h = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: k */
    public static final String f68826k = "li";

    /* JADX INFO: renamed from: i */
    public static final Set<String> f68824i = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", h62.f42462x, "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", f68826k, "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ou9$a */
    public static /* synthetic */ class C10656a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68833a;

        static {
            int[] iArr = new int[r3h.EnumC11876i.values().length];
            f68833a = iArr;
            try {
                iArr[r3h.EnumC11876i.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68833a[r3h.EnumC11876i.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68833a[r3h.EnumC11876i.Character.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ou9(@efb fm7 fm7Var, @efb ajh ajhVar) {
        this.f68827a = fm7Var;
        this.f68828b = ajhVar;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends Appendable & CharSequence> void m18994c(@efb T t) {
        T t2 = t;
        int length = t2.length();
        if (length <= 0 || '\n' == t2.charAt(length - 1)) {
            return;
        }
        i40.m12766a(t, '\n');
    }

    @efb
    public static ou9 create() {
        return create(fm7.create());
    }

    @efb
    /* JADX INFO: renamed from: e */
    public static Map<String, String> m18995e(@efb r3h.C11874g c11874g) {
        rc0 rc0Var = c11874g.f76990j;
        int size = rc0Var.size();
        if (size <= 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(size);
        for (ic0 ic0Var : rc0Var) {
            map.put(ic0Var.getKey().toLowerCase(Locale.US), ic0Var.getValue());
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18996h(@efb String str) {
        return f68824i.contains(str);
    }

    /* JADX INFO: renamed from: i */
    public static <T extends Appendable & CharSequence> boolean m18997i(@efb T t, @efb om7 om7Var) {
        return om7Var.f68124c == t.length();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18998j(@efb String str) {
        return f68822g.contains(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18999k(@efb String str) {
        return f68823h.contains(str);
    }

    /* JADX INFO: renamed from: a */
    public void m19000a(@efb om7.C10467a c10467a, @efb om7.C10467a c10467a2) {
        List arrayList = c10467a.f68128g;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            c10467a.f68128g = arrayList;
        }
        arrayList.add(c10467a2);
    }

    /* JADX INFO: renamed from: b */
    public <T extends Appendable & CharSequence> void m19001b(@efb T t, @efb om7 om7Var) {
        String strReplace = this.f68827a.replace(om7Var);
        if (strReplace != null) {
            i40.m12767b(t, strReplace);
        }
    }

    /* JADX INFO: renamed from: d */
    public <T extends Appendable & CharSequence> void m19002d(@efb T t) {
        if (this.f68832f) {
            m18994c(t);
            this.f68832f = false;
        }
    }

    @hib
    /* JADX INFO: renamed from: f */
    public om7.C10467a m19003f(@efb String str) {
        om7.C10467a c10467a = this.f68830d;
        while (c10467a != null && !str.equals(c10467a.f68123b) && !c10467a.isClosed()) {
            c10467a = c10467a.f68127f;
        }
        return c10467a;
    }

    @Override // p000.nu9
    public void flushBlockTags(int i, @efb nu9.InterfaceC10061a<nm7.InterfaceC9940a> interfaceC10061a) {
        om7.C10467a c10467a = this.f68830d;
        while (true) {
            om7.C10467a c10467a2 = c10467a.f68127f;
            if (c10467a2 == null) {
                break;
            } else {
                c10467a = c10467a2;
            }
        }
        if (i > -1) {
            c10467a.mo18775a(i);
        }
        List<nm7.InterfaceC9940a> listChildren = c10467a.children();
        if (listChildren.size() > 0) {
            interfaceC10061a.apply(listChildren);
        } else {
            interfaceC10061a.apply(Collections.emptyList());
        }
        this.f68830d = om7.C10467a.m18777c();
    }

    @Override // p000.nu9
    public void flushInlineTags(int i, @efb nu9.InterfaceC10061a<nm7.InterfaceC9941b> interfaceC10061a) {
        if (this.f68829c.size() <= 0) {
            interfaceC10061a.apply(Collections.emptyList());
            return;
        }
        if (i > -1) {
            Iterator<om7.C10468b> it = this.f68829c.iterator();
            while (it.hasNext()) {
                it.next().mo18775a(i);
            }
        }
        interfaceC10061a.apply(Collections.unmodifiableList(this.f68829c));
        this.f68829c.clear();
    }

    @hib
    /* JADX INFO: renamed from: g */
    public om7.C10468b m19004g(@efb String str) {
        int size = this.f68829c.size();
        while (true) {
            size--;
            if (size <= -1) {
                return null;
            }
            om7.C10468b c10468b = this.f68829c.get(size);
            if (str.equals(c10468b.f68123b) && c10468b.f68126e < 0) {
                return c10468b;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public <T extends Appendable & CharSequence> void m19005l(@efb T t, @efb r3h.C11873f c11873f) {
        String str = c11873f.f76983c;
        om7.C10467a c10467aM19003f = m19003f(str);
        if (c10467aM19003f != null) {
            if ("pre".equals(str)) {
                this.f68831e = false;
            }
            if (m18997i(t, c10467aM19003f)) {
                m19001b(t, c10467aM19003f);
            }
            c10467aM19003f.mo18775a(t.length());
            if (!c10467aM19003f.isEmpty()) {
                this.f68832f = m18996h(c10467aM19003f.f68123b);
            }
            if ("p".equals(str)) {
                i40.m12766a(t, '\n');
            }
            this.f68830d = c10467aM19003f.f68127f;
        }
    }

    /* JADX INFO: renamed from: m */
    public <T extends Appendable & CharSequence> void m19006m(@efb T t, @efb r3h.C11874g c11874g) {
        String str = c11874g.f76983c;
        if ("p".equals(this.f68830d.f68123b)) {
            this.f68830d.mo18775a(t.length());
            i40.m12766a(t, '\n');
            this.f68830d = this.f68830d.f68127f;
        } else if (f68826k.equals(str) && f68826k.equals(this.f68830d.f68123b)) {
            this.f68830d.mo18775a(t.length());
            this.f68830d = this.f68830d.f68127f;
        }
        if (m18996h(str)) {
            this.f68831e = "pre".equals(str);
            m18994c(t);
        } else {
            m19002d(t);
        }
        T t2 = t;
        om7.C10467a c10467aM18776b = om7.C10467a.m18776b(str, t2.length(), m18995e(c11874g), this.f68830d);
        boolean z = m18999k(str) || c11874g.f76989i;
        if (z) {
            String strReplace = this.f68827a.replace(c10467aM18776b);
            if (strReplace != null && strReplace.length() > 0) {
                i40.m12767b(t, strReplace);
            }
            c10467aM18776b.mo18775a(t2.length());
        }
        m19000a(c10467aM18776b.f68127f, c10467aM18776b);
        if (z) {
            return;
        }
        this.f68830d = c10467aM18776b;
    }

    /* JADX INFO: renamed from: n */
    public <T extends Appendable & CharSequence> void m19007n(@efb T t, @efb r3h.C11869b c11869b) {
        if (this.f68831e) {
            i40.m12767b(t, c11869b.getData());
        } else {
            m19002d(t);
            this.f68828b.mo841a(t, c11869b.getData());
        }
    }

    /* JADX INFO: renamed from: o */
    public <T extends Appendable & CharSequence> void m19008o(@efb T t, @efb r3h.C11873f c11873f) {
        om7.C10468b c10468bM19004g = m19004g(c11873f.f76983c);
        if (c10468bM19004g != null) {
            if (m18997i(t, c10468bM19004g)) {
                m19001b(t, c10468bM19004g);
            }
            c10468bM19004g.mo18775a(t.length());
        }
    }

    /* JADX INFO: renamed from: p */
    public <T extends Appendable & CharSequence> void m19009p(@efb T t, @efb r3h.C11874g c11874g) {
        String str = c11874g.f76983c;
        T t2 = t;
        om7.C10468b c10468b = new om7.C10468b(str, t2.length(), m18995e(c11874g));
        m19002d(t);
        if (m18999k(str) || c11874g.f76989i) {
            String strReplace = this.f68827a.replace(c10468b);
            if (strReplace != null && strReplace.length() > 0) {
                i40.m12767b(t, strReplace);
            }
            c10468b.mo18775a(t2.length());
        }
        this.f68829c.add(c10468b);
    }

    @Override // p000.nu9
    public <T extends Appendable & CharSequence> void processFragment(@efb T t, @efb String str) {
        x3h x3hVar = new x3h(new kw1(str), ohc.noTracking());
        while (true) {
            r3h r3hVar = x3hVar.read();
            r3h.EnumC11876i enumC11876i = r3hVar.f76973a;
            if (r3h.EnumC11876i.EOF == enumC11876i) {
                return;
            }
            int i = C10656a.f68833a[enumC11876i.ordinal()];
            if (i == 1) {
                r3h.C11874g c11874g = (r3h.C11874g) r3hVar;
                if (m18998j(c11874g.f76983c)) {
                    m19009p(t, c11874g);
                } else {
                    m19006m(t, c11874g);
                }
            } else if (i == 2) {
                r3h.C11873f c11873f = (r3h.C11873f) r3hVar;
                if (m18998j(c11873f.f76983c)) {
                    m19008o(t, c11873f);
                } else {
                    m19005l(t, c11873f);
                }
            } else if (i == 3) {
                m19007n(t, (r3h.C11869b) r3hVar);
            }
            r3hVar.reset();
        }
    }

    @Override // p000.nu9
    public void reset() {
        this.f68829c.clear();
        this.f68830d = om7.C10467a.m18777c();
    }

    @efb
    public static ou9 create(@efb fm7 fm7Var) {
        return new ou9(fm7Var, ajh.m840b());
    }
}
