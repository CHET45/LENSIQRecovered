package p000;

import java.util.Map;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public abstract class ac9 extends zb9.AbstractC16067d {

    /* JADX INFO: renamed from: a */
    public static final q8b.C11373c f1083a = q8b.C11373c.fromConfig(new C0174a());

    /* JADX INFO: renamed from: ac9$a */
    public static final class C0174a {
        public String toString() {
            return "service config is unused";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String getPolicyName();

    public abstract int getPriority();

    public final int hashCode() {
        return super.hashCode();
    }

    public abstract boolean isAvailable();

    public q8b.C11373c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return f1083a;
    }

    public final String toString() {
        return yya.toStringHelper(this).add("policy", getPolicyName()).add("priority", getPriority()).add("available", isAvailable()).toString();
    }
}
