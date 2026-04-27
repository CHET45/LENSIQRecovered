package p000;

import java.util.ArrayList;
import java.util.List;
import p000.vu5;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rs1 implements vu5 {
    private List<Class<?>> parseCategories(String str) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            arrayList.add(v12.getClass(str2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public abstract ru5 mo3837a(List<Class<?>> list);

    @Override // p000.vu5
    public ru5 createFilter(wu5 wu5Var) throws vu5.C14261a {
        try {
            return mo3837a(parseCategories(wu5Var.getArgs()));
        } catch (ClassNotFoundException e) {
            throw new vu5.C14261a(e);
        }
    }
}
