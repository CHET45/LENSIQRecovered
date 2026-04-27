package p000;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class q6f extends m7b {

    /* JADX INFO: renamed from: d */
    public final nkb f73340d;

    public q6f(ci4 ci4Var, nkb nkbVar, n7d n7dVar) {
        this(ci4Var, nkbVar, n7dVar, new ArrayList());
    }

    @Override // p000.m7b
    public or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var, Timestamp timestamp) {
        m17107f(t4bVar);
        if (!getPrecondition().isValidFor(t4bVar)) {
            return or5Var;
        }
        Map<wr5, b2i> mapM17105d = m17105d(timestamp, t4bVar);
        nkb nkbVarClone = this.f73340d.clone();
        nkbVarClone.setAll(mapM17105d);
        t4bVar.convertToFoundDocument(t4bVar.getVersion(), nkbVarClone).setHasLocalMutations();
        return null;
    }

    @Override // p000.m7b
    public void applyToRemoteDocument(t4b t4bVar, u7b u7bVar) {
        m17107f(t4bVar);
        nkb nkbVarClone = this.f73340d.clone();
        nkbVarClone.setAll(m17106e(t4bVar, u7bVar.getTransformResults()));
        t4bVar.convertToFoundDocument(u7bVar.getVersion(), nkbVarClone).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q6f.class != obj.getClass()) {
            return false;
        }
        q6f q6fVar = (q6f) obj;
        return m17102a(q6fVar) && this.f73340d.equals(q6fVar.f73340d) && getFieldTransforms().equals(q6fVar.getFieldTransforms());
    }

    @Override // p000.m7b
    @hib
    public or5 getFieldMask() {
        return null;
    }

    public nkb getValue() {
        return this.f73340d;
    }

    public int hashCode() {
        return (m17103b() * 31) + this.f73340d.hashCode();
    }

    public String toString() {
        return "SetMutation{" + m17104c() + ", value=" + this.f73340d + "}";
    }

    public q6f(ci4 ci4Var, nkb nkbVar, n7d n7dVar, List<bs5> list) {
        super(ci4Var, n7dVar, list);
        this.f73340d = nkbVar;
    }
}
