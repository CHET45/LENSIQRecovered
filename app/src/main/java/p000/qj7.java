package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class qj7 extends iu2 implements nj7 {

    /* JADX INFO: renamed from: A1 */
    public iu2[] f74596A1 = new iu2[4];

    /* JADX INFO: renamed from: B1 */
    public int f74597B1 = 0;

    @Override // p000.nj7
    public void add(iu2 iu2Var) {
        if (iu2Var == this || iu2Var == null) {
            return;
        }
        int i = this.f74597B1 + 1;
        iu2[] iu2VarArr = this.f74596A1;
        if (i > iu2VarArr.length) {
            this.f74596A1 = (iu2[]) Arrays.copyOf(iu2VarArr, iu2VarArr.length * 2);
        }
        iu2[] iu2VarArr2 = this.f74596A1;
        int i2 = this.f74597B1;
        iu2VarArr2[i2] = iu2Var;
        this.f74597B1 = i2 + 1;
    }

    public void addDependents(ArrayList<vki> arrayList, int i, vki vkiVar) {
        for (int i2 = 0; i2 < this.f74597B1; i2++) {
            vkiVar.add(this.f74596A1[i2]);
        }
        for (int i3 = 0; i3 < this.f74597B1; i3++) {
            xb7.findDependents(this.f74596A1[i3], i, arrayList, vkiVar);
        }
    }

    @Override // p000.iu2
    public void copy(iu2 iu2Var, HashMap<iu2, iu2> map) {
        super.copy(iu2Var, map);
        qj7 qj7Var = (qj7) iu2Var;
        this.f74597B1 = 0;
        int i = qj7Var.f74597B1;
        for (int i2 = 0; i2 < i; i2++) {
            add(map.get(qj7Var.f74596A1[i2]));
        }
    }

    public int findGroupInDependents(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f74597B1; i4++) {
            iu2 iu2Var = this.f74596A1[i4];
            if (i == 0 && (i3 = iu2Var.f48365S0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = iu2Var.f48367T0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nj7
    public void removeAllIds() {
        this.f74597B1 = 0;
        Arrays.fill(this.f74596A1, (Object) null);
    }

    public void updateConstraints(ju2 ju2Var) {
    }
}
