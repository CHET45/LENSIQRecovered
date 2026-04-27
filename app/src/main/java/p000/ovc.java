package p000;

import java.util.Map;
import p000.nvc;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class ovc extends ac9 {

    /* JADX INFO: renamed from: b */
    public static final String f68953b = "shuffleAddressList";

    /* JADX INFO: renamed from: c */
    public static boolean f68954c;

    static {
        f68954c = !u8g.isNullOrEmpty(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p000.ac9
    public String getPolicyName() {
        return oc7.f67126H;
    }

    @Override // p000.ac9
    public int getPriority() {
        return 5;
    }

    @Override // p000.ac9
    public boolean isAvailable() {
        return true;
    }

    @Override // p000.zb9.AbstractC16067d
    public zb9 newLoadBalancer(zb9.AbstractC16069f abstractC16069f) {
        return f68954c ? new lvc(abstractC16069f) : new nvc(abstractC16069f);
    }

    @Override // p000.ac9
    public q8b.C11373c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return q8b.C11373c.fromConfig(new nvc.C10086c(ym8.getBoolean(map, f68953b)));
        } catch (RuntimeException e) {
            return q8b.C11373c.fromError(n4g.f63273t.withCause(e).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
