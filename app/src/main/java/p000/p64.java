package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p64 implements j64 {

    /* JADX INFO: renamed from: d */
    public wki f69820d;

    /* JADX INFO: renamed from: f */
    public int f69822f;

    /* JADX INFO: renamed from: g */
    public int f69823g;

    /* JADX INFO: renamed from: a */
    public j64 f69817a = null;

    /* JADX INFO: renamed from: b */
    public boolean f69818b = false;

    /* JADX INFO: renamed from: c */
    public boolean f69819c = false;

    /* JADX INFO: renamed from: e */
    public EnumC10807a f69821e = EnumC10807a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public int f69824h = 1;

    /* JADX INFO: renamed from: i */
    public ad4 f69825i = null;

    /* JADX INFO: renamed from: j */
    public boolean f69826j = false;

    /* JADX INFO: renamed from: k */
    public List<j64> f69827k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<p64> f69828l = new ArrayList();

    /* JADX INFO: renamed from: p64$a */
    public enum EnumC10807a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public p64(wki wkiVar) {
        this.f69820d = wkiVar;
    }

    public void addDependency(j64 j64Var) {
        this.f69827k.add(j64Var);
        if (this.f69826j) {
            j64Var.update(j64Var);
        }
    }

    public void clear() {
        this.f69828l.clear();
        this.f69827k.clear();
        this.f69826j = false;
        this.f69823g = 0;
        this.f69819c = false;
        this.f69818b = false;
    }

    public String name() {
        String str;
        String debugName = this.f69820d.f94563b.getDebugName();
        EnumC10807a enumC10807a = this.f69821e;
        if (enumC10807a == EnumC10807a.LEFT || enumC10807a == EnumC10807a.RIGHT) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        return str + g1i.f38277c + this.f69821e.name();
    }

    public void resolve(int i) {
        if (this.f69826j) {
            return;
        }
        this.f69826j = true;
        this.f69823g = i;
        for (j64 j64Var : this.f69827k) {
            j64Var.update(j64Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f69820d.f94563b.getDebugName());
        sb.append(g1i.f38277c);
        sb.append(this.f69821e);
        sb.append(c0b.f15433c);
        sb.append(this.f69826j ? Integer.valueOf(this.f69823g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f69828l.size());
        sb.append(":d=");
        sb.append(this.f69827k.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // p000.j64
    public void update(j64 j64Var) {
        Iterator<p64> it = this.f69828l.iterator();
        while (it.hasNext()) {
            if (!it.next().f69826j) {
                return;
            }
        }
        this.f69819c = true;
        j64 j64Var2 = this.f69817a;
        if (j64Var2 != null) {
            j64Var2.update(this);
        }
        if (this.f69818b) {
            this.f69820d.update(this);
            return;
        }
        p64 p64Var = null;
        int i = 0;
        for (p64 p64Var2 : this.f69828l) {
            if (!(p64Var2 instanceof ad4)) {
                i++;
                p64Var = p64Var2;
            }
        }
        if (p64Var != null && i == 1 && p64Var.f69826j) {
            ad4 ad4Var = this.f69825i;
            if (ad4Var != null) {
                if (!ad4Var.f69826j) {
                    return;
                } else {
                    this.f69822f = this.f69824h * ad4Var.f69823g;
                }
            }
            resolve(p64Var.f69823g + this.f69822f);
        }
        j64 j64Var3 = this.f69817a;
        if (j64Var3 != null) {
            j64Var3.update(this);
        }
    }
}
