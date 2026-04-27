package p000;

import java.util.HashMap;
import java.util.Map;
import p000.cj4;

/* JADX INFO: loaded from: classes5.dex */
public final class ing {

    /* JADX INFO: renamed from: a */
    public int f47631a = 0;

    /* JADX INFO: renamed from: b */
    public final Map<ci4, cj4.EnumC2330a> f47632b = new HashMap();

    /* JADX INFO: renamed from: c */
    public boolean f47633c = true;

    /* JADX INFO: renamed from: d */
    public vj1 f47634d = vj1.f91344e;

    /* JADX INFO: renamed from: e */
    public boolean f47635e = false;

    /* JADX INFO: renamed from: ing$a */
    public static /* synthetic */ class C7521a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47636a;

        static {
            int[] iArr = new int[cj4.EnumC2330a.values().length];
            f47636a = iArr;
            try {
                iArr[cj4.EnumC2330a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47636a[cj4.EnumC2330a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47636a[cj4.EnumC2330a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13219a(ci4 ci4Var, cj4.EnumC2330a enumC2330a) {
        this.f47633c = true;
        this.f47632b.put(ci4Var, enumC2330a);
    }

    /* JADX INFO: renamed from: b */
    public void m13220b() {
        this.f47633c = false;
        this.f47632b.clear();
    }

    /* JADX INFO: renamed from: c */
    public boolean m13221c() {
        return this.f47633c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m13222d() {
        return this.f47635e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m13223e() {
        return this.f47631a != 0;
    }

    /* JADX INFO: renamed from: f */
    public void m13224f() {
        this.f47633c = true;
        this.f47635e = true;
    }

    /* JADX INFO: renamed from: g */
    public void m13225g() {
        this.f47631a++;
    }

    /* JADX INFO: renamed from: h */
    public void m13226h() {
        this.f47631a--;
    }

    /* JADX INFO: renamed from: i */
    public void m13227i(ci4 ci4Var) {
        this.f47633c = true;
        this.f47632b.remove(ci4Var);
    }

    /* JADX INFO: renamed from: j */
    public tmg m13228j() {
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        qy7<ci4> qy7VarEmptyKeySet2 = ci4.emptyKeySet();
        qy7<ci4> qy7VarEmptyKeySet3 = ci4.emptyKeySet();
        qy7<ci4> qy7VarInsert = qy7VarEmptyKeySet;
        qy7<ci4> qy7VarInsert2 = qy7VarEmptyKeySet2;
        qy7<ci4> qy7VarInsert3 = qy7VarEmptyKeySet3;
        for (Map.Entry<ci4, cj4.EnumC2330a> entry : this.f47632b.entrySet()) {
            ci4 key = entry.getKey();
            cj4.EnumC2330a value = entry.getValue();
            int i = C7521a.f47636a[value.ordinal()];
            if (i == 1) {
                qy7VarInsert = qy7VarInsert.insert(key);
            } else if (i == 2) {
                qy7VarInsert2 = qy7VarInsert2.insert(key);
            } else {
                if (i != 3) {
                    throw r80.fail("Encountered invalid change type: %s", value);
                }
                qy7VarInsert3 = qy7VarInsert3.insert(key);
            }
        }
        return new tmg(this.f47634d, this.f47635e, qy7VarInsert, qy7VarInsert2, qy7VarInsert3);
    }

    /* JADX INFO: renamed from: k */
    public void m13229k(vj1 vj1Var) {
        if (vj1Var.isEmpty()) {
            return;
        }
        this.f47633c = true;
        this.f47634d = vj1Var;
    }
}
