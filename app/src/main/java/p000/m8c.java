package p000;

import java.util.List;
import java.util.Map;
import p000.i4f;
import p000.l8c;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class m8c extends ac9 {
    private q8b.C11373c parseLoadBalancingPolicyConfigInternal(Map<String, ?> map) {
        Long stringAsDuration = ym8.getStringAsDuration(map, "interval");
        Long stringAsDuration2 = ym8.getStringAsDuration(map, "baseEjectionTime");
        Long stringAsDuration3 = ym8.getStringAsDuration(map, "maxEjectionTime");
        Integer numberAsInteger = ym8.getNumberAsInteger(map, "maxEjectionPercentage");
        l8c.C8720g.a aVar = new l8c.C8720g.a();
        if (stringAsDuration != null) {
            aVar.setIntervalNanos(stringAsDuration);
        }
        if (stringAsDuration2 != null) {
            aVar.setBaseEjectionTimeNanos(stringAsDuration2);
        }
        if (stringAsDuration3 != null) {
            aVar.setMaxEjectionTimeNanos(stringAsDuration3);
        }
        if (numberAsInteger != null) {
            aVar.setMaxEjectionPercent(numberAsInteger);
        }
        Map<String, ?> object = ym8.getObject(map, "successRateEjection");
        if (object != null) {
            l8c.C8720g.c.a aVar2 = new l8c.C8720g.c.a();
            Integer numberAsInteger2 = ym8.getNumberAsInteger(object, "stdevFactor");
            Integer numberAsInteger3 = ym8.getNumberAsInteger(object, "enforcementPercentage");
            Integer numberAsInteger4 = ym8.getNumberAsInteger(object, "minimumHosts");
            Integer numberAsInteger5 = ym8.getNumberAsInteger(object, "requestVolume");
            if (numberAsInteger2 != null) {
                aVar2.setStdevFactor(numberAsInteger2);
            }
            if (numberAsInteger3 != null) {
                aVar2.setEnforcementPercentage(numberAsInteger3);
            }
            if (numberAsInteger4 != null) {
                aVar2.setMinimumHosts(numberAsInteger4);
            }
            if (numberAsInteger5 != null) {
                aVar2.setRequestVolume(numberAsInteger5);
            }
            aVar.setSuccessRateEjection(aVar2.build());
        }
        Map<String, ?> object2 = ym8.getObject(map, "failurePercentageEjection");
        if (object2 != null) {
            l8c.C8720g.b.a aVar3 = new l8c.C8720g.b.a();
            Integer numberAsInteger6 = ym8.getNumberAsInteger(object2, "threshold");
            Integer numberAsInteger7 = ym8.getNumberAsInteger(object2, "enforcementPercentage");
            Integer numberAsInteger8 = ym8.getNumberAsInteger(object2, "minimumHosts");
            Integer numberAsInteger9 = ym8.getNumberAsInteger(object2, "requestVolume");
            if (numberAsInteger6 != null) {
                aVar3.setThreshold(numberAsInteger6);
            }
            if (numberAsInteger7 != null) {
                aVar3.setEnforcementPercentage(numberAsInteger7);
            }
            if (numberAsInteger8 != null) {
                aVar3.setMinimumHosts(numberAsInteger8);
            }
            if (numberAsInteger9 != null) {
                aVar3.setRequestVolume(numberAsInteger9);
            }
            aVar.setFailurePercentageEjection(aVar3.build());
        }
        List<i4f.C7145a> listUnwrapLoadBalancingConfigList = i4f.unwrapLoadBalancingConfigList(ym8.getListOfObjects(map, "childPolicy"));
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return q8b.C11373c.fromError(n4g.f63272s.withDescription("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        q8b.C11373c c11373cSelectLbPolicyFromList = i4f.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, bc9.getDefaultRegistry());
        if (c11373cSelectLbPolicyFromList.getError() != null) {
            return c11373cSelectLbPolicyFromList;
        }
        aVar.setChildPolicy((i4f.C7146b) c11373cSelectLbPolicyFromList.getConfig());
        return q8b.C11373c.fromConfig(aVar.build());
    }

    @Override // p000.ac9
    public String getPolicyName() {
        return "outlier_detection_experimental";
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
        return new l8c(abstractC16069f, q0h.f72713a);
    }

    @Override // p000.ac9
    public q8b.C11373c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return parseLoadBalancingPolicyConfigInternal(map);
        } catch (RuntimeException e) {
            return q8b.C11373c.fromError(n4g.f63273t.withCause(e).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
