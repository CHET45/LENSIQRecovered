package p000;

import p000.vu5;

/* JADX INFO: loaded from: classes8.dex */
public class uu5 {
    /* JADX INFO: renamed from: a */
    public static vu5 m23579a(Class<? extends vu5> cls) throws vu5.C14261a {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new vu5.C14261a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static vu5 m23580b(String str) throws vu5.C14261a {
        try {
            return m23579a(v12.getClass(str).asSubclass(vu5.class));
        } catch (Exception e) {
            throw new vu5.C14261a(e);
        }
    }

    public static ru5 createFilter(String str, wu5 wu5Var) throws vu5.C14261a {
        return m23580b(str).createFilter(wu5Var);
    }

    public static ru5 createFilterFromFilterSpec(o3e o3eVar, String str) throws vu5.C14261a {
        j74 description = o3eVar.getRunner().getDescription();
        String[] strArrSplit = str.contains("=") ? str.split("=", 2) : new String[]{str, ""};
        return createFilter(strArrSplit[0], new wu5(description, strArrSplit[1]));
    }

    public static ru5 createFilter(Class<? extends vu5> cls, wu5 wu5Var) throws vu5.C14261a {
        return m23579a(cls).createFilter(wu5Var);
    }
}
