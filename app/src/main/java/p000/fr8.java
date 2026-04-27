package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class fr8 {

    /* JADX INFO: renamed from: c */
    public static final fr8 f37561c = new fr8("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List<String> f37562a;

    /* JADX INFO: renamed from: b */
    @hib
    public gr8 f37563b;

    public fr8(String... strArr) {
        this.f37562a = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        return this.f37562a.get(r0.size() - 1).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    @yx1
    @p7e({p7e.EnumC10826a.f69934a})
    public fr8 addKey(String str) {
        fr8 fr8Var = new fr8(this);
        fr8Var.f37562a.add(str);
        return fr8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fr8 fr8Var = (fr8) obj;
        if (!this.f37562a.equals(fr8Var.f37562a)) {
            return false;
        }
        gr8 gr8Var = this.f37563b;
        gr8 gr8Var2 = fr8Var.f37563b;
        return gr8Var != null ? gr8Var.equals(gr8Var2) : gr8Var2 == null;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean fullyResolvesTo(String str, int i) {
        if (i >= this.f37562a.size()) {
            return false;
        }
        boolean z = i == this.f37562a.size() - 1;
        String str2 = this.f37562a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f37562a.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f37562a.get(i + 1).equals(str)) {
            return i == this.f37562a.size() + (-2) || (i == this.f37562a.size() + (-3) && endsWithGlobstar());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f37562a.size() - 1) {
            return false;
        }
        return this.f37562a.get(i2).equals(str);
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public gr8 getResolvedElement() {
        return this.f37563b;
    }

    public int hashCode() {
        int iHashCode = this.f37562a.hashCode() * 31;
        gr8 gr8Var = this.f37563b;
        return iHashCode + (gr8Var != null ? gr8Var.hashCode() : 0);
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public int incrementDepthBy(String str, int i) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.f37562a.get(i).equals("**")) {
            return (i != this.f37562a.size() - 1 && this.f37562a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.f37562a.toString();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean matches(String str, int i) {
        if (isContainer(str)) {
            return true;
        }
        if (i >= this.f37562a.size()) {
            return false;
        }
        return this.f37562a.get(i).equals(str) || this.f37562a.get(i).equals("**") || this.f37562a.get(i).equals("*");
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean propagateToChildren(String str, int i) {
        return "__container".equals(str) || i < this.f37562a.size() - 1 || this.f37562a.get(i).equals("**");
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public fr8 resolve(gr8 gr8Var) {
        fr8 fr8Var = new fr8(this);
        fr8Var.f37563b = gr8Var;
        return fr8Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f37562a);
        sb.append(",resolved=");
        sb.append(this.f37563b != null);
        sb.append('}');
        return sb.toString();
    }

    private fr8(fr8 fr8Var) {
        this.f37562a = new ArrayList(fr8Var.f37562a);
        this.f37563b = fr8Var.f37563b;
    }
}
