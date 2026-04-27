package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class nqg implements o1e {

    /* JADX INFO: renamed from: a */
    public final boolean f65313a;

    /* JADX INFO: renamed from: b */
    public final List<mqg> f65314b;

    /* JADX INFO: renamed from: nqg$a */
    public class C10007a implements mqg {
        public C10007a() {
        }

        @Override // p000.mqg
        public peb create(lqg lqgVar) {
            return new q03(lqgVar);
        }
    }

    /* JADX INFO: renamed from: nqg$b */
    public static class C10008b {

        /* JADX INFO: renamed from: a */
        public boolean f65316a = false;

        /* JADX INFO: renamed from: b */
        public List<mqg> f65317b = new ArrayList();

        public nqg build() {
            return new nqg(this, null);
        }

        public C10008b extensions(Iterable<? extends si5> iterable) {
            for (si5 si5Var : iterable) {
                if (si5Var instanceof InterfaceC10010d) {
                    ((InterfaceC10010d) si5Var).extend(this);
                }
            }
            return this;
        }

        public C10008b nodeRendererFactory(mqg mqgVar) {
            this.f65317b.add(mqgVar);
            return this;
        }

        public C10008b stripNewlines(boolean z) {
            this.f65316a = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: nqg$c */
    public class C10009c implements lqg {

        /* JADX INFO: renamed from: a */
        public final oqg f65318a;

        /* JADX INFO: renamed from: b */
        public final qeb f65319b;

        public /* synthetic */ C10009c(nqg nqgVar, oqg oqgVar, C10007a c10007a) {
            this(oqgVar);
        }

        @Override // p000.lqg
        public oqg getWriter() {
            return this.f65318a;
        }

        @Override // p000.lqg
        public void render(deb debVar) {
            this.f65319b.render(debVar);
        }

        @Override // p000.lqg
        public boolean stripNewlines() {
            return nqg.this.f65313a;
        }

        private C10009c(oqg oqgVar) {
            this.f65319b = new qeb();
            this.f65318a = oqgVar;
            for (int size = nqg.this.f65314b.size() - 1; size >= 0; size--) {
                this.f65319b.add(((mqg) nqg.this.f65314b.get(size)).create(this));
            }
        }
    }

    /* JADX INFO: renamed from: nqg$d */
    public interface InterfaceC10010d extends si5 {
        void extend(C10008b c10008b);
    }

    public /* synthetic */ nqg(C10008b c10008b, C10007a c10007a) {
        this(c10008b);
    }

    public static C10008b builder() {
        return new C10008b();
    }

    @Override // p000.o1e
    public void render(deb debVar, Appendable appendable) {
        new C10009c(this, new oqg(appendable), null).render(debVar);
    }

    private nqg(C10008b c10008b) {
        this.f65313a = c10008b.f65316a;
        ArrayList arrayList = new ArrayList(c10008b.f65317b.size() + 1);
        this.f65314b = arrayList;
        arrayList.addAll(c10008b.f65317b);
        arrayList.add(new C10007a());
    }

    @Override // p000.o1e
    public String render(deb debVar) {
        StringBuilder sb = new StringBuilder();
        render(debVar, sb);
        return sb.toString();
    }
}
