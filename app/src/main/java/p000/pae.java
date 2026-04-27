package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class pae {

    /* JADX INFO: renamed from: c */
    public static final String f70165c = "rolloutsState";

    /* JADX INFO: renamed from: a */
    public final List<oae> f70166a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final int f70167b;

    public pae(int i) {
        this.f70167b = i;
    }

    public List<z33.AbstractC15965f.d.e> getReportRolloutsState() {
        List<oae> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rolloutAssignmentList.size(); i++) {
            arrayList.add(rolloutAssignmentList.get(i).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<oae> getRolloutAssignmentList() {
        return Collections.unmodifiableList(new ArrayList(this.f70166a));
    }

    @op1
    public synchronized boolean updateRolloutAssignmentList(List<oae> list) {
        this.f70166a.clear();
        if (list.size() <= this.f70167b) {
            return this.f70166a.addAll(list);
        }
        ej9.getLogger().m10069w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f70167b);
        return this.f70166a.addAll(list.subList(0, this.f70167b));
    }
}
