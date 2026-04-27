package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class kd9 {

    /* JADX INFO: renamed from: a */
    public final int f53642a;

    /* JADX INFO: renamed from: b */
    public final ky7<ci4, ph4> f53643b;

    public kd9(int i, ky7<ci4, ph4> ky7Var) {
        this.f53642a = i;
        this.f53643b = ky7Var;
    }

    public static kd9 fromOverlayedDocuments(int i, Map<ci4, q9c> map) {
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        for (Map.Entry<ci4, q9c> entry : map.entrySet()) {
            ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(entry.getKey(), entry.getValue().getDocument());
        }
        return new kd9(i, ky7VarEmptyDocumentMap);
    }

    public int getBatchId() {
        return this.f53642a;
    }

    public ky7<ci4, ph4> getDocuments() {
        return this.f53643b;
    }
}
