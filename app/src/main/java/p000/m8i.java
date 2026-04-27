package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m8i {

    /* JADX INFO: renamed from: a */
    public final lbi f60196a;

    /* JADX INFO: renamed from: b */
    public final List<s59> f60197b;

    public m8i(lbi lbiVar, List<s59> list) {
        this.f60196a = lbiVar;
        this.f60197b = list;
    }

    public List<s59> getLimboChanges() {
        return this.f60197b;
    }

    public lbi getSnapshot() {
        return this.f60196a;
    }
}
