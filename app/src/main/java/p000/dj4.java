package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.cj4;

/* JADX INFO: loaded from: classes5.dex */
public class dj4 {

    /* JADX INFO: renamed from: a */
    public final HashMap<ci4, cj4> f29778a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public List<cj4> m9188a() {
        return new ArrayList(this.f29778a.values());
    }

    public void addChange(cj4 cj4Var) {
        ci4 key = cj4Var.getDocument().getKey();
        cj4 cj4Var2 = this.f29778a.get(key);
        if (cj4Var2 == null) {
            this.f29778a.put(key, cj4Var);
            return;
        }
        cj4.EnumC2330a type = cj4Var2.getType();
        cj4.EnumC2330a type2 = cj4Var.getType();
        cj4.EnumC2330a enumC2330a = cj4.EnumC2330a.ADDED;
        if (type2 != enumC2330a && type == cj4.EnumC2330a.METADATA) {
            this.f29778a.put(key, cj4Var);
            return;
        }
        if (type2 == cj4.EnumC2330a.METADATA && type != cj4.EnumC2330a.REMOVED) {
            this.f29778a.put(key, cj4.create(type, cj4Var.getDocument()));
            return;
        }
        cj4.EnumC2330a enumC2330a2 = cj4.EnumC2330a.MODIFIED;
        if (type2 == enumC2330a2 && type == enumC2330a2) {
            this.f29778a.put(key, cj4.create(enumC2330a2, cj4Var.getDocument()));
            return;
        }
        if (type2 == enumC2330a2 && type == enumC2330a) {
            this.f29778a.put(key, cj4.create(enumC2330a, cj4Var.getDocument()));
            return;
        }
        cj4.EnumC2330a enumC2330a3 = cj4.EnumC2330a.REMOVED;
        if (type2 == enumC2330a3 && type == enumC2330a) {
            this.f29778a.remove(key);
            return;
        }
        if (type2 == enumC2330a3 && type == enumC2330a2) {
            this.f29778a.put(key, cj4.create(enumC2330a3, cj4Var2.getDocument()));
        } else {
            if (type2 != enumC2330a || type != enumC2330a3) {
                throw r80.fail("Unsupported combination of changes %s after %s", type2, type);
            }
            this.f29778a.put(key, cj4.create(enumC2330a2, cj4Var.getDocument()));
        }
    }
}
