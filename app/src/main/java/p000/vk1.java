package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class vk1 extends rk1 implements Iterable<tk1> {

    /* JADX INFO: renamed from: vk1$a */
    public class C14134a implements Iterator {

        /* JADX INFO: renamed from: a */
        public vk1 f91482a;

        /* JADX INFO: renamed from: b */
        public int f91483b = 0;

        public C14134a(vk1 vk1Var) {
            this.f91482a = vk1Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91483b < this.f91482a.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            tk1 tk1Var = (tk1) this.f91482a.f78534C.get(this.f91483b);
            this.f91483b++;
            return tk1Var;
        }
    }

    public vk1(char[] cArr) {
        super(cArr);
    }

    public static vk1 allocate(char[] cArr) {
        return new vk1(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<tk1> iterator() {
        return new C14134a(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // p000.sk1
    public String toJSON() {
        StringBuilder sb = new StringBuilder(m22074b() + "{ ");
        boolean z = true;
        for (sk1 sk1Var : this.f78534C) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(sk1Var.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(m22074b());
        sb.append("{\n");
        boolean z = true;
        for (sk1 sk1Var : this.f78534C) {
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(sk1Var.toFormattedJSON(sk1.f82093m + i, i2 - 1));
        }
        sb.append("\n");
        m22073a(sb, i);
        sb.append("}");
        return sb.toString();
    }
}
