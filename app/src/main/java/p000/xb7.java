package p000;

import java.util.ArrayList;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class xb7 {

    /* JADX INFO: renamed from: a */
    public static final boolean f97429a = false;

    /* JADX INFO: renamed from: b */
    public static final boolean f97430b = false;

    public static vki findDependents(iu2 iu2Var, int i, ArrayList<vki> arrayList, vki vkiVar) {
        int iFindGroupInDependents;
        int i2 = i == 0 ? iu2Var.f48365S0 : iu2Var.f48367T0;
        if (i2 != -1 && (vkiVar == null || i2 != vkiVar.f91538b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                vki vkiVar2 = arrayList.get(i3);
                if (vkiVar2.getId() == i2) {
                    if (vkiVar != null) {
                        vkiVar.moveTo(i, vkiVar2);
                        arrayList.remove(vkiVar);
                    }
                    vkiVar = vkiVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return vkiVar;
        }
        if (vkiVar == null) {
            if ((iu2Var instanceof qj7) && (iFindGroupInDependents = ((qj7) iu2Var).findGroupInDependents(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    vki vkiVar3 = arrayList.get(i4);
                    if (vkiVar3.getId() == iFindGroupInDependents) {
                        vkiVar = vkiVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (vkiVar == null) {
                vkiVar = new vki(i);
            }
            arrayList.add(vkiVar);
        }
        if (vkiVar.add(iu2Var)) {
            if (iu2Var instanceof dd7) {
                dd7 dd7Var = (dd7) iu2Var;
                dd7Var.getAnchor().findDependents(dd7Var.getOrientation() == 0 ? 1 : 0, arrayList, vkiVar);
            }
            if (i == 0) {
                iu2Var.f48365S0 = vkiVar.getId();
                iu2Var.f48360Q.findDependents(i, arrayList, vkiVar);
                iu2Var.f48364S.findDependents(i, arrayList, vkiVar);
            } else {
                iu2Var.f48367T0 = vkiVar.getId();
                iu2Var.f48362R.findDependents(i, arrayList, vkiVar);
                iu2Var.f48368U.findDependents(i, arrayList, vkiVar);
                iu2Var.f48366T.findDependents(i, arrayList, vkiVar);
            }
            iu2Var.f48371X.findDependents(i, arrayList, vkiVar);
        }
        return vkiVar;
    }

    private static vki findGroup(ArrayList<vki> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vki vkiVar = arrayList.get(i2);
            if (i == vkiVar.f91538b) {
                return vkiVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean simpleSolvingPass(p000.ju2 r16, p000.yv0.InterfaceC15818b r17) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xb7.simpleSolvingPass(ju2, yv0$b):boolean");
    }

    public static boolean validInGroup(iu2.EnumC7619b enumC7619b, iu2.EnumC7619b enumC7619b2, iu2.EnumC7619b enumC7619b3, iu2.EnumC7619b enumC7619b4) {
        iu2.EnumC7619b enumC7619b5;
        iu2.EnumC7619b enumC7619b6;
        iu2.EnumC7619b enumC7619b7 = iu2.EnumC7619b.FIXED;
        return (enumC7619b3 == enumC7619b7 || enumC7619b3 == (enumC7619b6 = iu2.EnumC7619b.WRAP_CONTENT) || (enumC7619b3 == iu2.EnumC7619b.MATCH_PARENT && enumC7619b != enumC7619b6)) || (enumC7619b4 == enumC7619b7 || enumC7619b4 == (enumC7619b5 = iu2.EnumC7619b.WRAP_CONTENT) || (enumC7619b4 == iu2.EnumC7619b.MATCH_PARENT && enumC7619b2 != enumC7619b5));
    }
}
