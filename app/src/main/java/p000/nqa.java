package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class nqa implements nvd {

    /* JADX INFO: renamed from: a */
    public rvd f65281a;

    /* JADX INFO: renamed from: b */
    public final vqa f65282b;

    /* JADX INFO: renamed from: c */
    public Set<ci4> f65283c;

    public nqa(vqa vqaVar) {
        this.f65282b = vqaVar;
    }

    private boolean isReferenced(ci4 ci4Var) {
        if (this.f65282b.mo14248h().containsKey(ci4Var) || mutationQueuesContainKey(ci4Var)) {
            return true;
        }
        rvd rvdVar = this.f65281a;
        return rvdVar != null && rvdVar.containsKey(ci4Var);
    }

    private boolean mutationQueuesContainKey(ci4 ci4Var) {
        Iterator<tqa> it = this.f65282b.m24120l().iterator();
        while (it.hasNext()) {
            if (it.next().m22743a(ci4Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.nvd
    public void addReference(ci4 ci4Var) {
        this.f65283c.remove(ci4Var);
    }

    @Override // p000.nvd
    public long getCurrentSequenceNumber() {
        return -1L;
    }

    @Override // p000.nvd
    public void onTransactionCommitted() {
        wqa wqaVarMo14247g = this.f65282b.mo14247g();
        ArrayList arrayList = new ArrayList();
        for (ci4 ci4Var : this.f65283c) {
            if (!isReferenced(ci4Var)) {
                arrayList.add(ci4Var);
            }
        }
        wqaVarMo14247g.removeAll(arrayList);
        this.f65283c = null;
    }

    @Override // p000.nvd
    public void onTransactionStarted() {
        this.f65283c = new HashSet();
    }

    @Override // p000.nvd
    public void removeMutationReference(ci4 ci4Var) {
        this.f65283c.add(ci4Var);
    }

    @Override // p000.nvd
    public void removeReference(ci4 ci4Var) {
        this.f65283c.add(ci4Var);
    }

    @Override // p000.nvd
    public void removeTarget(vmg vmgVar) {
        yqa yqaVarMo14248h = this.f65282b.mo14248h();
        Iterator<ci4> it = yqaVarMo14248h.getMatchingKeysForTargetId(vmgVar.getTargetId()).iterator();
        while (it.hasNext()) {
            this.f65283c.add(it.next());
        }
        yqaVarMo14248h.removeTargetData(vmgVar);
    }

    @Override // p000.nvd
    public void setInMemoryPins(rvd rvdVar) {
        this.f65281a = rvdVar;
    }

    @Override // p000.nvd
    public void updateLimboDocument(ci4 ci4Var) {
        if (isReferenced(ci4Var)) {
            this.f65283c.remove(ci4Var);
        } else {
            this.f65283c.add(ci4Var);
        }
    }
}
