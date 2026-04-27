package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dz1 extends e3f {

    /* JADX INFO: renamed from: a */
    public final List<e3f> f31342a;

    private dz1(e3f... e3fVarArr) {
        for (e3f e3fVar : e3fVarArr) {
            e3fVar.getClass();
        }
        this.f31342a = Collections.unmodifiableList(new ArrayList(Arrays.asList(e3fVarArr)));
    }

    public static e3f create(e3f... e3fVarArr) {
        if (e3fVarArr.length != 0) {
            return new dz1(e3fVarArr);
        }
        throw new IllegalArgumentException("At least one credential is required");
    }

    public List<e3f> getCredentialsList() {
        return this.f31342a;
    }
}
