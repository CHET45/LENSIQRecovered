package p000;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class uic extends m7b {

    /* JADX INFO: renamed from: d */
    public final nkb f88051d;

    /* JADX INFO: renamed from: e */
    public final or5 f88052e;

    public uic(ci4 ci4Var, nkb nkbVar, or5 or5Var, n7d n7dVar) {
        this(ci4Var, nkbVar, or5Var, n7dVar, new ArrayList());
    }

    private List<wr5> getFieldTransformPaths() {
        ArrayList arrayList = new ArrayList();
        Iterator<bs5> it = getFieldTransforms().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFieldPath());
        }
        return arrayList;
    }

    private Map<wr5, b2i> getPatch() {
        HashMap map = new HashMap();
        for (wr5 wr5Var : this.f88052e.getMask()) {
            if (!wr5Var.isEmpty()) {
                map.put(wr5Var, this.f88051d.get(wr5Var));
            }
        }
        return map;
    }

    @Override // p000.m7b
    @hib
    public or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var, Timestamp timestamp) {
        m17107f(t4bVar);
        if (!getPrecondition().isValidFor(t4bVar)) {
            return or5Var;
        }
        Map<wr5, b2i> mapM17105d = m17105d(timestamp, t4bVar);
        Map<wr5, b2i> patch = getPatch();
        nkb data = t4bVar.getData();
        data.setAll(patch);
        data.setAll(mapM17105d);
        t4bVar.convertToFoundDocument(t4bVar.getVersion(), t4bVar.getData()).setHasLocalMutations();
        if (or5Var == null) {
            return null;
        }
        HashSet hashSet = new HashSet(or5Var.getMask());
        hashSet.addAll(this.f88052e.getMask());
        hashSet.addAll(getFieldTransformPaths());
        return or5.fromSet(hashSet);
    }

    @Override // p000.m7b
    public void applyToRemoteDocument(t4b t4bVar, u7b u7bVar) {
        m17107f(t4bVar);
        if (!getPrecondition().isValidFor(t4bVar)) {
            t4bVar.convertToUnknownDocument(u7bVar.getVersion());
            return;
        }
        Map<wr5, b2i> mapM17106e = m17106e(t4bVar, u7bVar.getTransformResults());
        nkb data = t4bVar.getData();
        data.setAll(getPatch());
        data.setAll(mapM17106e);
        t4bVar.convertToFoundDocument(u7bVar.getVersion(), t4bVar.getData()).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uic.class != obj.getClass()) {
            return false;
        }
        uic uicVar = (uic) obj;
        return m17102a(uicVar) && this.f88051d.equals(uicVar.f88051d) && getFieldTransforms().equals(uicVar.getFieldTransforms());
    }

    @Override // p000.m7b
    public or5 getFieldMask() {
        return this.f88052e;
    }

    public nkb getValue() {
        return this.f88051d;
    }

    public int hashCode() {
        return (m17103b() * 31) + this.f88051d.hashCode();
    }

    public String toString() {
        return "PatchMutation{" + m17104c() + ", mask=" + this.f88052e + ", value=" + this.f88051d + "}";
    }

    public uic(ci4 ci4Var, nkb nkbVar, or5 or5Var, n7d n7dVar, List<bs5> list) {
        super(ci4Var, n7dVar, list);
        this.f88051d = nkbVar;
        this.f88052e = or5Var;
    }
}
