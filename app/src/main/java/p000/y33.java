package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nCrashlyticsRemoteConfigListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n*L\n27#1:41\n27#1:42,3\n*E\n"})
public final class y33 implements rae {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gzh f100206a;

    public y33(@yfb gzh gzhVar) {
        md8.checkNotNullParameter(gzhVar, "userMetadata");
        this.f100206a = gzhVar;
    }

    @Override // p000.rae
    public void onRolloutsStateChanged(@yfb qae qaeVar) {
        md8.checkNotNullParameter(qaeVar, pae.f70165c);
        gzh gzhVar = this.f100206a;
        Set<nae> rolloutAssignments = qaeVar.getRolloutAssignments();
        md8.checkNotNullExpressionValue(rolloutAssignments, "getRolloutAssignments(...)");
        Set<nae> set = rolloutAssignments;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(set, 10));
        for (nae naeVar : set) {
            arrayList.add(oae.create(naeVar.getRolloutId(), naeVar.getParameterKey(), naeVar.getParameterValue(), naeVar.getVariantId(), naeVar.getTemplateVersion()));
        }
        gzhVar.updateRolloutsState(arrayList);
        ej9.getLogger().m10061d("Updated Crashlytics Rollout State");
    }
}
