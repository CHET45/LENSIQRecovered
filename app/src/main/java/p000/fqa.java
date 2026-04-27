package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class fqa implements mg1 {

    /* JADX INFO: renamed from: a */
    public final Map<String, ah1> f37465a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<String, c9b> f37466b = new HashMap();

    @Override // p000.mg1
    @hib
    public ah1 getBundleMetadata(String str) {
        return this.f37465a.get(str);
    }

    @Override // p000.mg1
    @hib
    public c9b getNamedQuery(String str) {
        return this.f37466b.get(str);
    }

    @Override // p000.mg1
    public void saveBundleMetadata(ah1 ah1Var) {
        this.f37465a.put(ah1Var.getBundleId(), ah1Var);
    }

    @Override // p000.mg1
    public void saveNamedQuery(c9b c9bVar) {
        this.f37466b.put(c9bVar.getName(), c9bVar);
    }
}
