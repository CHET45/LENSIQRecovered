package p000;

import java.util.Map;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class qte {

    /* JADX INFO: renamed from: qte$a */
    public static final class C11693a extends ac9 {

        /* JADX INFO: renamed from: b */
        public static final String f75742b = "no service config";

        @Override // p000.ac9
        public String getPolicyName() {
            return "round_robin";
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
            return new qbe(abstractC16069f);
        }

        @Override // p000.ac9
        public q8b.C11373c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
            return q8b.C11373c.fromConfig(f75742b);
        }
    }

    private qte() {
    }
}
