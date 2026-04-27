package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class myd {

    /* JADX INFO: renamed from: a */
    public final euf f62817a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, tmg> f62818b;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, pmd> f62819c;

    /* JADX INFO: renamed from: d */
    public final Map<ci4, t4b> f62820d;

    /* JADX INFO: renamed from: e */
    public final Set<ci4> f62821e;

    public myd(euf eufVar, Map<Integer, tmg> map, Map<Integer, pmd> map2, Map<ci4, t4b> map3, Set<ci4> set) {
        this.f62817a = eufVar;
        this.f62818b = map;
        this.f62819c = map2;
        this.f62820d = map3;
        this.f62821e = set;
    }

    public Map<ci4, t4b> getDocumentUpdates() {
        return this.f62820d;
    }

    public Set<ci4> getResolvedLimboDocuments() {
        return this.f62821e;
    }

    public euf getSnapshotVersion() {
        return this.f62817a;
    }

    public Map<Integer, tmg> getTargetChanges() {
        return this.f62818b;
    }

    public Map<Integer, pmd> getTargetMismatches() {
        return this.f62819c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f62817a + ", targetChanges=" + this.f62818b + ", targetMismatches=" + this.f62819c + ", documentUpdates=" + this.f62820d + ", resolvedLimboDocuments=" + this.f62821e + '}';
    }
}
