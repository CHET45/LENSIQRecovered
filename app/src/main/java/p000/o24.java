package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class o24 implements tyh {

    /* JADX INFO: renamed from: a */
    public final String f66268a;

    /* JADX INFO: renamed from: b */
    public final m77 f66269b;

    public o24(Set<q49> set, m77 m77Var) {
        this.f66268a = toUserAgent(set);
        this.f66269b = m77Var;
    }

    public static ej2<tyh> component() {
        return ej2.builder(tyh.class).add(i64.setOf((Class<?>) q49.class)).factory(new tj2() { // from class: n24
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return o24.lambda$component$0(mj2Var);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ tyh lambda$component$0(mj2 mj2Var) {
        return new o24(mj2Var.setOf(q49.class), m77.getInstance());
    }

    private static String toUserAgent(Set<q49> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<q49> it = set.iterator();
        while (it.hasNext()) {
            q49 next = it.next();
            sb.append(next.getLibraryName());
            sb.append('/');
            sb.append(next.getVersion());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p000.tyh
    public String getUserAgent() {
        if (this.f66269b.m17101a().isEmpty()) {
            return this.f66268a;
        }
        return this.f66268a + ' ' + toUserAgent(this.f66269b.m17101a());
    }
}
