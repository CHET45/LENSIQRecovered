package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class b15 extends dfg {
    public b15(Class<?> cls, ude udeVar) throws Throwable {
        super(udeVar, cls, filterAbstractClasses(cls.getClasses()));
    }

    private static Class<?>[] filterAbstractClasses(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
