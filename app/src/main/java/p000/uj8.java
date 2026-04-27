package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uj8 {

    /* JADX INFO: renamed from: a */
    public final Map<eq8, i25<?>> f88149a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<eq8, i25<?>> f88150b = new HashMap();

    private Map<eq8, i25<?>> getJobMap(boolean z) {
        return z ? this.f88150b : this.f88149a;
    }

    /* JADX INFO: renamed from: a */
    public i25<?> m23383a(eq8 eq8Var, boolean z) {
        return getJobMap(z).get(eq8Var);
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public Map<eq8, i25<?>> m23384b() {
        return Collections.unmodifiableMap(this.f88149a);
    }

    /* JADX INFO: renamed from: c */
    public void m23385c(eq8 eq8Var, i25<?> i25Var) {
        getJobMap(i25Var.m12742k()).put(eq8Var, i25Var);
    }

    /* JADX INFO: renamed from: d */
    public void m23386d(eq8 eq8Var, i25<?> i25Var) {
        Map<eq8, i25<?>> jobMap = getJobMap(i25Var.m12742k());
        if (i25Var.equals(jobMap.get(eq8Var))) {
            jobMap.remove(eq8Var);
        }
    }
}
