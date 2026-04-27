package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o7b {

    /* JADX INFO: renamed from: a */
    public final n7b f66606a;

    /* JADX INFO: renamed from: b */
    public final euf f66607b;

    /* JADX INFO: renamed from: c */
    public final List<u7b> f66608c;

    /* JADX INFO: renamed from: d */
    public final vj1 f66609d;

    /* JADX INFO: renamed from: e */
    public final ky7<ci4, euf> f66610e;

    private o7b(n7b n7bVar, euf eufVar, List<u7b> list, vj1 vj1Var, ky7<ci4, euf> ky7Var) {
        this.f66606a = n7bVar;
        this.f66607b = eufVar;
        this.f66608c = list;
        this.f66609d = vj1Var;
        this.f66610e = ky7Var;
    }

    public static o7b create(n7b n7bVar, euf eufVar, List<u7b> list, vj1 vj1Var) {
        r80.hardAssert(n7bVar.getMutations().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(n7bVar.getMutations().size()), Integer.valueOf(list.size()));
        ky7<ci4, euf> ky7VarEmptyVersionMap = uh4.emptyVersionMap();
        List<m7b> mutations = n7bVar.getMutations();
        ky7<ci4, euf> ky7VarInsert = ky7VarEmptyVersionMap;
        for (int i = 0; i < mutations.size(); i++) {
            ky7VarInsert = ky7VarInsert.insert(mutations.get(i).getKey(), list.get(i).getVersion());
        }
        return new o7b(n7bVar, eufVar, list, vj1Var, ky7VarInsert);
    }

    public n7b getBatch() {
        return this.f66606a;
    }

    public euf getCommitVersion() {
        return this.f66607b;
    }

    public ky7<ci4, euf> getDocVersions() {
        return this.f66610e;
    }

    public List<u7b> getMutationResults() {
        return this.f66608c;
    }

    public vj1 getStreamToken() {
        return this.f66609d;
    }
}
