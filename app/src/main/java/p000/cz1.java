package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cz1 extends eu1 {

    /* JADX INFO: renamed from: a */
    public final List<eu1> f28067a;

    private cz1(List<eu1> list) {
        this.f28067a = list;
    }

    public static eu1 create(eu1... eu1VarArr) {
        if (eu1VarArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        for (eu1 eu1Var : eu1VarArr) {
            eu1Var.getClass();
        }
        return new cz1(Collections.unmodifiableList(new ArrayList(Arrays.asList(eu1VarArr))));
    }

    public List<eu1> getCredentialsList() {
        return this.f28067a;
    }

    @Override // p000.eu1
    public eu1 withoutBearerTokens() {
        ArrayList arrayList = new ArrayList();
        Iterator<eu1> it = this.f28067a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().withoutBearerTokens());
        }
        return new cz1(Collections.unmodifiableList(arrayList));
    }
}
