package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.fc9;

/* JADX INFO: loaded from: classes5.dex */
public class yg1 {

    /* JADX INFO: renamed from: a */
    public final ng1 f101413a;

    /* JADX INFO: renamed from: b */
    public final ah1 f101414b;

    /* JADX INFO: renamed from: f */
    public long f101418f;

    /* JADX INFO: renamed from: g */
    @hib
    public nh1 f101419g;

    /* JADX INFO: renamed from: c */
    public final List<c9b> f101415c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public ky7<ci4, t4b> f101417e = uh4.emptyMutableDocumentMap();

    /* JADX INFO: renamed from: d */
    public final Map<ci4, nh1> f101416d = new HashMap();

    public yg1(ng1 ng1Var, ah1 ah1Var) {
        this.f101413a = ng1Var;
        this.f101414b = ah1Var;
    }

    private Map<String, qy7<ci4>> getQueryDocumentMapping() {
        HashMap map = new HashMap();
        Iterator<c9b> it = this.f101415c.iterator();
        while (it.hasNext()) {
            map.put(it.next().getName(), ci4.emptyKeySet());
        }
        for (nh1 nh1Var : this.f101416d.values()) {
            for (String str : nh1Var.getQueries()) {
                map.put(str, ((qy7) map.get(str)).insert(nh1Var.getKey()));
            }
        }
        return map;
    }

    @hib
    public fc9 addElement(sg1 sg1Var, long j) {
        x7d.checkArgument(!(sg1Var instanceof ah1), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f101417e.size();
        if (sg1Var instanceof c9b) {
            this.f101415c.add((c9b) sg1Var);
        } else if (sg1Var instanceof nh1) {
            nh1 nh1Var = (nh1) sg1Var;
            this.f101416d.put(nh1Var.getKey(), nh1Var);
            this.f101419g = nh1Var;
            if (!nh1Var.exists()) {
                this.f101417e = this.f101417e.insert(nh1Var.getKey(), t4b.newNoDocument(nh1Var.getKey(), nh1Var.getReadTime()).setReadTime(nh1Var.getReadTime()));
                this.f101419g = null;
            }
        } else if (sg1Var instanceof qg1) {
            qg1 qg1Var = (qg1) sg1Var;
            if (this.f101419g == null || !qg1Var.getKey().equals(this.f101419g.getKey())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            this.f101417e = this.f101417e.insert(qg1Var.getKey(), qg1Var.getDocument().setReadTime(this.f101419g.getReadTime()));
            this.f101419g = null;
        }
        this.f101418f += j;
        if (size != this.f101417e.size()) {
            return new fc9(this.f101417e.size(), this.f101414b.getTotalDocuments(), this.f101418f, this.f101414b.getTotalBytes(), null, fc9.EnumC5719a.RUNNING);
        }
        return null;
    }

    public ky7<ci4, ph4> applyChanges() {
        x7d.checkArgument(this.f101419g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        x7d.checkArgument(this.f101414b.getBundleId() != null, "Bundle ID must be set", new Object[0]);
        x7d.checkArgument(this.f101417e.size() == this.f101414b.getTotalDocuments(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f101414b.getTotalDocuments()), Integer.valueOf(this.f101417e.size()));
        ky7<ci4, ph4> ky7VarApplyBundledDocuments = this.f101413a.applyBundledDocuments(this.f101417e, this.f101414b.getBundleId());
        Map<String, qy7<ci4>> queryDocumentMapping = getQueryDocumentMapping();
        for (c9b c9bVar : this.f101415c) {
            this.f101413a.saveNamedQuery(c9bVar, queryDocumentMapping.get(c9bVar.getName()));
        }
        this.f101413a.saveBundle(this.f101414b);
        return ky7VarApplyBundledDocuments;
    }
}
