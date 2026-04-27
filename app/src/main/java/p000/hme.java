package p000;

import java.util.Map;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
@gdi
public final class hme extends q8b.AbstractC11379i {

    /* JADX INFO: renamed from: a */
    public final boolean f44142a;

    /* JADX INFO: renamed from: b */
    public final int f44143b;

    /* JADX INFO: renamed from: c */
    public final int f44144c;

    /* JADX INFO: renamed from: d */
    public final wi0 f44145d;

    public hme(boolean z, int i, int i2, wi0 wi0Var) {
        this.f44142a = z;
        this.f44143b = i;
        this.f44144c = i2;
        this.f44145d = (wi0) v7d.checkNotNull(wi0Var, "autoLoadBalancerFactory");
    }

    @Override // p000.q8b.AbstractC11379i
    public q8b.C11373c parseServiceConfig(Map<String, ?> map) {
        Object config;
        try {
            q8b.C11373c c11373cM24561d = this.f44145d.m24561d(map);
            if (c11373cM24561d == null) {
                config = null;
            } else {
                if (c11373cM24561d.getError() != null) {
                    return q8b.C11373c.fromError(c11373cM24561d.getError());
                }
                config = c11373cM24561d.getConfig();
            }
            return q8b.C11373c.fromConfig(vr9.m24141b(map, this.f44142a, this.f44143b, this.f44144c, config));
        } catch (RuntimeException e) {
            return q8b.C11373c.fromError(n4g.f63260g.withDescription("failed to parse service config").withCause(e));
        }
    }
}
