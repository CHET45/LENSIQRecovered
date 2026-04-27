package p000;

import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@fgb
@lg5("https://github.com/grpc/grpc-java/issues/5999")
public final class v87 extends ls6 {

    /* JADX INFO: renamed from: p */
    @gdi
    public static final zb9.AbstractC16074k f90328p = new C13942c();

    /* JADX INFO: renamed from: g */
    public final zb9 f90329g;

    /* JADX INFO: renamed from: h */
    public final zb9.AbstractC16069f f90330h;

    /* JADX INFO: renamed from: i */
    @eib
    public zb9.AbstractC16067d f90331i;

    /* JADX INFO: renamed from: j */
    public zb9 f90332j;

    /* JADX INFO: renamed from: k */
    @eib
    public zb9.AbstractC16067d f90333k;

    /* JADX INFO: renamed from: l */
    public zb9 f90334l;

    /* JADX INFO: renamed from: m */
    public ws2 f90335m;

    /* JADX INFO: renamed from: n */
    public zb9.AbstractC16074k f90336n;

    /* JADX INFO: renamed from: o */
    public boolean f90337o;

    /* JADX INFO: renamed from: v87$a */
    public class C13940a extends zb9 {
        public C13940a() {
        }

        @Override // p000.zb9
        public void handleNameResolutionError(n4g n4gVar) {
            v87.this.f90330h.updateBalancingState(ws2.TRANSIENT_FAILURE, new zb9.C16068e(zb9.C16070g.withError(n4gVar)));
        }

        @Override // p000.zb9
        public void handleResolvedAddresses(zb9.C16072i c16072i) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // p000.zb9
        public void shutdown() {
        }
    }

    /* JADX INFO: renamed from: v87$b */
    public class C13941b extends ms6 {

        /* JADX INFO: renamed from: a */
        public zb9 f90339a;

        public C13941b() {
        }

        @Override // p000.ms6
        /* JADX INFO: renamed from: a */
        public zb9.AbstractC16069f mo8856a() {
            return v87.this.f90330h;
        }

        @Override // p000.ms6, p000.zb9.AbstractC16069f
        public void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
            if (this.f90339a == v87.this.f90334l) {
                v7d.checkState(v87.this.f90337o, "there's pending lb while current lb has been out of READY");
                v87.this.f90335m = ws2Var;
                v87.this.f90336n = abstractC16074k;
                if (ws2Var == ws2.READY) {
                    v87.this.swap();
                    return;
                }
                return;
            }
            if (this.f90339a == v87.this.f90332j) {
                v87.this.f90337o = ws2Var == ws2.READY;
                if (v87.this.f90337o || v87.this.f90334l == v87.this.f90329g) {
                    v87.this.f90330h.updateBalancingState(ws2Var, abstractC16074k);
                } else {
                    v87.this.swap();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v87$c */
    public class C13942c extends zb9.AbstractC16074k {
        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return zb9.C16070g.withNoResult();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public v87(zb9.AbstractC16069f abstractC16069f) {
        C13940a c13940a = new C13940a();
        this.f90329g = c13940a;
        this.f90332j = c13940a;
        this.f90334l = c13940a;
        this.f90330h = (zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void swap() {
        this.f90330h.updateBalancingState(this.f90335m, this.f90336n);
        this.f90332j.shutdown();
        this.f90332j = this.f90334l;
        this.f90331i = this.f90333k;
        this.f90334l = this.f90329g;
        this.f90333k = null;
    }

    @Override // p000.ls6
    /* JADX INFO: renamed from: a */
    public zb9 mo16339a() {
        zb9 zb9Var = this.f90334l;
        return zb9Var == this.f90329g ? this.f90332j : zb9Var;
    }

    public String delegateType() {
        return mo16339a().getClass().getSimpleName();
    }

    @Override // p000.ls6, p000.zb9
    @Deprecated
    public void handleSubchannelState(zb9.AbstractC16073j abstractC16073j, xs2 xs2Var) {
        throw new UnsupportedOperationException("handleSubchannelState() is not supported by " + v87.class.getName());
    }

    @Override // p000.ls6, p000.zb9
    public void shutdown() {
        this.f90334l.shutdown();
        this.f90332j.shutdown();
    }

    public void switchTo(zb9.AbstractC16067d abstractC16067d) {
        v7d.checkNotNull(abstractC16067d, "newBalancerFactory");
        if (abstractC16067d.equals(this.f90333k)) {
            return;
        }
        this.f90334l.shutdown();
        this.f90334l = this.f90329g;
        this.f90333k = null;
        this.f90335m = ws2.CONNECTING;
        this.f90336n = f90328p;
        if (abstractC16067d.equals(this.f90331i)) {
            return;
        }
        C13941b c13941b = new C13941b();
        zb9 zb9VarNewLoadBalancer = abstractC16067d.newLoadBalancer(c13941b);
        c13941b.f90339a = zb9VarNewLoadBalancer;
        this.f90334l = zb9VarNewLoadBalancer;
        this.f90333k = abstractC16067d;
        if (this.f90337o) {
            return;
        }
        swap();
    }
}
