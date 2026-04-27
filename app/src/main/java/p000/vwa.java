package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface vwa<Model, Data> {

    /* JADX INFO: renamed from: vwa$a */
    public static class C14279a<Data> {

        /* JADX INFO: renamed from: a */
        public final eq8 f92420a;

        /* JADX INFO: renamed from: b */
        public final List<eq8> f92421b;

        /* JADX INFO: renamed from: c */
        public final bg3<Data> f92422c;

        public C14279a(@efb eq8 eq8Var, @efb bg3<Data> bg3Var) {
            this(eq8Var, Collections.emptyList(), bg3Var);
        }

        public C14279a(@efb eq8 eq8Var, @efb List<eq8> list, @efb bg3<Data> bg3Var) {
            this.f92420a = (eq8) t7d.checkNotNull(eq8Var);
            this.f92421b = (List) t7d.checkNotNull(list);
            this.f92422c = (bg3) t7d.checkNotNull(bg3Var);
        }
    }

    @hib
    C14279a<Data> buildLoadData(@efb Model model, int i, int i2, @efb i7c i7cVar);

    boolean handles(@efb Model model);
}
