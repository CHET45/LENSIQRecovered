package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class yif implements kgd {

    /* JADX INFO: renamed from: a */
    public final Class<?> f101743a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f101744b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f101745c;

    /* JADX INFO: renamed from: d */
    public int f101746d;

    public yif(String... strArr) {
        this(null, strArr);
    }

    @Override // p000.kgd
    public boolean apply(ph8 ph8Var, Object obj, String str) {
        if (obj == null) {
            return true;
        }
        Class<?> cls = this.f101743a;
        if (cls != null && !cls.isInstance(obj)) {
            return true;
        }
        if (this.f101745c.contains(str)) {
            return false;
        }
        if (this.f101746d > 0) {
            int i = 0;
            for (e0f e0fVar = ph8Var.f70803m; e0fVar != null; e0fVar = e0fVar.f31477a) {
                i++;
                if (i > this.f101746d) {
                    return false;
                }
            }
        }
        return this.f101744b.size() == 0 || this.f101744b.contains(str);
    }

    public Class<?> getClazz() {
        return this.f101743a;
    }

    public Set<String> getExcludes() {
        return this.f101745c;
    }

    public Set<String> getIncludes() {
        return this.f101744b;
    }

    public int getMaxLevel() {
        return this.f101746d;
    }

    public void setMaxLevel(int i) {
        this.f101746d = i;
    }

    public yif(Class<?> cls, String... strArr) {
        this.f101744b = new HashSet();
        this.f101745c = new HashSet();
        this.f101746d = 0;
        this.f101743a = cls;
        for (String str : strArr) {
            if (str != null) {
                this.f101744b.add(str);
            }
        }
    }
}
