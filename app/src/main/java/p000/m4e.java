package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m4e extends hu0 {
    public m4e(znc zncVar) {
        super(zncVar);
    }

    @Override // p000.ut1
    public void request() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f44873d.f105526f) {
            if (upc.isGranted(this.f44873d.f105521a, str)) {
                this.f44873d.f105531k.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        znc zncVar = this.f44873d;
        if (!zncVar.f105528h || (zncVar.f105537q == null && zncVar.f105538r == null)) {
            zncVar.requestNow(zncVar.f105526f, this);
            return;
        }
        zncVar.f105528h = false;
        zncVar.f105532l.addAll(arrayList);
        znc zncVar2 = this.f44873d;
        bi5 bi5Var = zncVar2.f105538r;
        if (bi5Var != null) {
            bi5Var.onExplainReason(getExplainScope(), arrayList, true);
        } else {
            zncVar2.f105537q.onExplainReason(getExplainScope(), arrayList);
        }
    }

    @Override // p000.ut1
    public void requestAgain(List<String> list) {
        HashSet hashSet = new HashSet(this.f44873d.f105531k);
        hashSet.addAll(list);
        this.f44873d.requestNow(hashSet, this);
    }
}
