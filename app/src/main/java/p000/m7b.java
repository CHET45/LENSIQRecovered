package p000;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m7b {

    /* JADX INFO: renamed from: a */
    public final ci4 f60151a;

    /* JADX INFO: renamed from: b */
    public final n7d f60152b;

    /* JADX INFO: renamed from: c */
    public final List<bs5> f60153c;

    public m7b(ci4 ci4Var, n7d n7dVar) {
        this(ci4Var, n7dVar, new ArrayList());
    }

    @hib
    public static m7b calculateOverlayMutation(t4b t4bVar, @hib or5 or5Var) {
        if (!t4bVar.hasLocalMutations()) {
            return null;
        }
        if (or5Var != null && or5Var.getMask().isEmpty()) {
            return null;
        }
        if (or5Var == null) {
            return t4bVar.isNoDocument() ? new c54(t4bVar.getKey(), n7d.f63462c) : new q6f(t4bVar.getKey(), t4bVar.getData(), n7d.f63462c);
        }
        nkb data = t4bVar.getData();
        nkb nkbVar = new nkb();
        HashSet hashSet = new HashSet();
        for (wr5 wr5VarPopLast : or5Var.getMask()) {
            if (!hashSet.contains(wr5VarPopLast)) {
                if (data.get(wr5VarPopLast) == null && wr5VarPopLast.length() > 1) {
                    wr5VarPopLast = wr5VarPopLast.popLast();
                }
                nkbVar.set(wr5VarPopLast, data.get(wr5VarPopLast));
                hashSet.add(wr5VarPopLast);
            }
        }
        return new uic(t4bVar.getKey(), nkbVar, or5.fromSet(hashSet), n7d.f63462c);
    }

    /* JADX INFO: renamed from: a */
    public boolean m17102a(m7b m7bVar) {
        return this.f60151a.equals(m7bVar.f60151a) && this.f60152b.equals(m7bVar.f60152b);
    }

    @hib
    public abstract or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var, Timestamp timestamp);

    public abstract void applyToRemoteDocument(t4b t4bVar, u7b u7bVar);

    /* JADX INFO: renamed from: b */
    public int m17103b() {
        return (getKey().hashCode() * 31) + this.f60152b.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public String m17104c() {
        return "key=" + this.f60151a + ", precondition=" + this.f60152b;
    }

    /* JADX INFO: renamed from: d */
    public Map<wr5, b2i> m17105d(Timestamp timestamp, t4b t4bVar) {
        HashMap map = new HashMap(this.f60153c.size());
        for (bs5 bs5Var : this.f60153c) {
            map.put(bs5Var.getFieldPath(), bs5Var.getOperation().applyToLocalView(t4bVar.getField(bs5Var.getFieldPath()), timestamp));
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public Map<wr5, b2i> m17106e(t4b t4bVar, List<b2i> list) {
        HashMap map = new HashMap(this.f60153c.size());
        r80.hardAssert(this.f60153c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f60153c.size()));
        for (int i = 0; i < list.size(); i++) {
            bs5 bs5Var = this.f60153c.get(i);
            map.put(bs5Var.getFieldPath(), bs5Var.getOperation().applyToRemoteDocument(t4bVar.getField(bs5Var.getFieldPath()), list.get(i)));
        }
        return map;
    }

    public nkb extractTransformBaseValue(ph4 ph4Var) {
        nkb nkbVar = null;
        for (bs5 bs5Var : this.f60153c) {
            b2i b2iVarComputeBaseValue = bs5Var.getOperation().computeBaseValue(ph4Var.getField(bs5Var.getFieldPath()));
            if (b2iVarComputeBaseValue != null) {
                if (nkbVar == null) {
                    nkbVar = new nkb();
                }
                nkbVar.set(bs5Var.getFieldPath(), b2iVarComputeBaseValue);
            }
        }
        return nkbVar;
    }

    /* JADX INFO: renamed from: f */
    public void m17107f(t4b t4bVar) {
        r80.hardAssert(t4bVar.getKey().equals(getKey()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    @hib
    public abstract or5 getFieldMask();

    public List<bs5> getFieldTransforms() {
        return this.f60153c;
    }

    public ci4 getKey() {
        return this.f60151a;
    }

    public n7d getPrecondition() {
        return this.f60152b;
    }

    public m7b(ci4 ci4Var, n7d n7dVar, List<bs5> list) {
        this.f60151a = ci4Var;
        this.f60152b = n7dVar;
        this.f60153c = list;
    }
}
