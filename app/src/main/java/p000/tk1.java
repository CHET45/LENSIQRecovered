package p000;

import java.util.ArrayList;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class tk1 extends rk1 {

    /* JADX INFO: renamed from: F */
    public static ArrayList<String> f85094F;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f85094F = arrayList;
        arrayList.add("ConstraintSets");
        f85094F.add("Variables");
        f85094F.add("Generate");
        f85094F.add(ymh.InterfaceC15729h.f102261a);
        f85094F.add(vq8.f91984f);
        f85094F.add("KeyAttributes");
        f85094F.add("KeyPositions");
        f85094F.add("KeyCycles");
    }

    public tk1(char[] cArr) {
        super(cArr);
    }

    public static sk1 allocate(char[] cArr) {
        return new tk1(cArr);
    }

    public String getName() {
        return content();
    }

    public sk1 getValue() {
        if (this.f78534C.size() > 0) {
            return this.f78534C.get(0);
        }
        return null;
    }

    public void set(sk1 sk1Var) {
        if (this.f78534C.size() > 0) {
            this.f78534C.set(0, sk1Var);
        } else {
            this.f78534C.add(sk1Var);
        }
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(m22074b());
        m22073a(sb, i);
        String strContent = content();
        if (this.f78534C.size() <= 0) {
            return strContent + ": <> ";
        }
        sb.append(strContent);
        sb.append(": ");
        if (f85094F.contains(strContent)) {
            i2 = 3;
        }
        if (i2 > 0) {
            sb.append(this.f78534C.get(0).toFormattedJSON(i, i2 - 1));
        } else {
            String json = this.f78534C.get(0).toJSON();
            if (json.length() + i < sk1.f82092f) {
                sb.append(json);
            } else {
                sb.append(this.f78534C.get(0).toFormattedJSON(i, i2 - 1));
            }
        }
        return sb.toString();
    }

    @Override // p000.sk1
    public String toJSON() {
        if (this.f78534C.size() <= 0) {
            return m22074b() + content() + ": <> ";
        }
        return m22074b() + content() + ": " + this.f78534C.get(0).toJSON();
    }

    public static sk1 allocate(String str, sk1 sk1Var) {
        tk1 tk1Var = new tk1(str.toCharArray());
        tk1Var.setStart(0L);
        tk1Var.setEnd(str.length() - 1);
        tk1Var.set(sk1Var);
        return tk1Var;
    }
}
