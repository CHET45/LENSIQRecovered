package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class z05 {

    /* JADX INFO: renamed from: a */
    @hib
    public final ane[] f103587a;

    /* JADX INFO: renamed from: b */
    public final boolean f103588b;

    public z05(@hib ane... aneVarArr) {
        boolean z;
        this.f103587a = aneVarArr;
        if (aneVarArr == null || aneVarArr.length == 0) {
            z = true;
        } else {
            z = false;
            for (ane aneVar : aneVarArr) {
                if (!aneVar.isAllFieldsEmpty()) {
                    break;
                }
            }
            z = true;
        }
        this.f103588b = z;
    }

    public boolean isEmpty() {
        return this.f103588b;
    }

    public boolean matches(ife ifeVar) {
        ane[] aneVarArr = this.f103587a;
        if (aneVarArr == null || aneVarArr.length == 0) {
            return true;
        }
        for (ane aneVar : aneVarArr) {
            if (aneVar.matches(ifeVar)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "emulatedFilters=" + Arrays.toString(this.f103587a);
    }
}
