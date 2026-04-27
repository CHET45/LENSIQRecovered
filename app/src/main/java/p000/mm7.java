package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class mm7 implements o1e {

    /* JADX INFO: renamed from: a */
    public final String f61473a;

    /* JADX INFO: renamed from: b */
    public final boolean f61474b;

    /* JADX INFO: renamed from: c */
    public final boolean f61475c;

    /* JADX INFO: renamed from: d */
    public final List<pc0> f61476d;

    /* JADX INFO: renamed from: e */
    public final List<km7> f61477e;

    /* JADX INFO: renamed from: mm7$a */
    public class C9409a implements km7 {
        public C9409a() {
        }

        @Override // p000.km7
        public peb create(jm7 jm7Var) {
            return new j03(jm7Var);
        }
    }

    /* JADX INFO: renamed from: mm7$b */
    public static class C9410b {

        /* JADX INFO: renamed from: a */
        public String f61479a = "\n";

        /* JADX INFO: renamed from: b */
        public boolean f61480b = false;

        /* JADX INFO: renamed from: c */
        public boolean f61481c = false;

        /* JADX INFO: renamed from: d */
        public List<pc0> f61482d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public List<km7> f61483e = new ArrayList();

        public C9410b attributeProviderFactory(pc0 pc0Var) {
            if (pc0Var == null) {
                throw new NullPointerException("attributeProviderFactory must not be null");
            }
            this.f61482d.add(pc0Var);
            return this;
        }

        public mm7 build() {
            return new mm7(this, null);
        }

        public C9410b escapeHtml(boolean z) {
            this.f61480b = z;
            return this;
        }

        public C9410b extensions(Iterable<? extends si5> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (si5 si5Var : iterable) {
                if (si5Var instanceof InterfaceC9411c) {
                    ((InterfaceC9411c) si5Var).extend(this);
                }
            }
            return this;
        }

        public C9410b nodeRendererFactory(km7 km7Var) {
            if (km7Var == null) {
                throw new NullPointerException("nodeRendererFactory must not be null");
            }
            this.f61483e.add(km7Var);
            return this;
        }

        public C9410b percentEncodeUrls(boolean z) {
            this.f61481c = z;
            return this;
        }

        public C9410b softbreak(String str) {
            this.f61479a = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: mm7$c */
    public interface InterfaceC9411c extends si5 {
        void extend(C9410b c9410b);
    }

    /* JADX INFO: renamed from: mm7$d */
    public class C9412d implements jm7, oc0 {

        /* JADX INFO: renamed from: a */
        public final rm7 f61484a;

        /* JADX INFO: renamed from: b */
        public final List<nc0> f61485b;

        /* JADX INFO: renamed from: c */
        public final qeb f61486c;

        public /* synthetic */ C9412d(mm7 mm7Var, rm7 rm7Var, C9409a c9409a) {
            this(rm7Var);
        }

        private void setCustomAttributes(deb debVar, String str, Map<String, String> map) {
            Iterator<nc0> it = this.f61485b.iterator();
            while (it.hasNext()) {
                it.next().setAttributes(debVar, str, map);
            }
        }

        @Override // p000.jm7
        public String encodeUrl(String str) {
            return mm7.this.f61475c ? n55.percentEncodeUrl(str) : str;
        }

        @Override // p000.jm7
        public Map<String, String> extendAttributes(deb debVar, String str, Map<String, String> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            setCustomAttributes(debVar, str, linkedHashMap);
            return linkedHashMap;
        }

        @Override // p000.jm7
        public String getSoftbreak() {
            return mm7.this.f61473a;
        }

        @Override // p000.jm7
        public rm7 getWriter() {
            return this.f61484a;
        }

        @Override // p000.jm7
        public void render(deb debVar) {
            this.f61486c.render(debVar);
        }

        @Override // p000.jm7
        public boolean shouldEscapeHtml() {
            return mm7.this.f61474b;
        }

        private C9412d(rm7 rm7Var) {
            this.f61486c = new qeb();
            this.f61484a = rm7Var;
            this.f61485b = new ArrayList(mm7.this.f61476d.size());
            Iterator it = mm7.this.f61476d.iterator();
            while (it.hasNext()) {
                this.f61485b.add(((pc0) it.next()).create(this));
            }
            for (int size = mm7.this.f61477e.size() - 1; size >= 0; size--) {
                this.f61486c.add(((km7) mm7.this.f61477e.get(size)).create(this));
            }
        }
    }

    public /* synthetic */ mm7(C9410b c9410b, C9409a c9409a) {
        this(c9410b);
    }

    public static C9410b builder() {
        return new C9410b();
    }

    @Override // p000.o1e
    public void render(deb debVar, Appendable appendable) {
        if (debVar == null) {
            throw new NullPointerException("node must not be null");
        }
        new C9412d(this, new rm7(appendable), null).render(debVar);
    }

    private mm7(C9410b c9410b) {
        this.f61473a = c9410b.f61479a;
        this.f61474b = c9410b.f61480b;
        this.f61475c = c9410b.f61481c;
        this.f61476d = new ArrayList(c9410b.f61482d);
        ArrayList arrayList = new ArrayList(c9410b.f61483e.size() + 1);
        this.f61477e = arrayList;
        arrayList.addAll(c9410b.f61483e);
        arrayList.add(new C9409a());
    }

    @Override // p000.o1e
    public String render(deb debVar) {
        if (debVar != null) {
            StringBuilder sb = new StringBuilder();
            render(debVar, sb);
            return sb.toString();
        }
        throw new NullPointerException("node must not be null");
    }
}
