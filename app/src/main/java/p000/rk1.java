package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class rk1 extends sk1 {

    /* JADX INFO: renamed from: C */
    public ArrayList<sk1> f78534C;

    public rk1(char[] cArr) {
        super(cArr);
        this.f78534C = new ArrayList<>();
    }

    public static sk1 allocate(char[] cArr) {
        return new rk1(cArr);
    }

    public void add(sk1 sk1Var) {
        this.f78534C.add(sk1Var);
        if (wk1.f94462d) {
            System.out.println("added element " + sk1Var + " to " + this);
        }
    }

    public sk1 get(String str) throws xk1 {
        Iterator<sk1> it = this.f78534C.iterator();
        while (it.hasNext()) {
            tk1 tk1Var = (tk1) it.next();
            if (tk1Var.content().equals(str)) {
                return tk1Var.getValue();
            }
        }
        throw new xk1("no element for key <" + str + ">", this);
    }

    public qk1 getArray(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var instanceof qk1) {
            return (qk1) sk1Var;
        }
        throw new xk1("no array found for key <" + str + ">, found [" + sk1Var.m22075c() + "] : " + sk1Var, this);
    }

    public qk1 getArrayOrNull(String str) {
        sk1 orNull = getOrNull(str);
        if (orNull instanceof qk1) {
            return (qk1) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var instanceof al1) {
            return ((al1) sk1Var).getBoolean();
        }
        throw new xk1("no boolean found for key <" + str + ">, found [" + sk1Var.m22075c() + "] : " + sk1Var, this);
    }

    public float getFloat(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var != null) {
            return sk1Var.getFloat();
        }
        throw new xk1("no float found for key <" + str + ">, found [" + sk1Var.m22075c() + "] : " + sk1Var, this);
    }

    public float getFloatOrNaN(String str) {
        sk1 orNull = getOrNull(str);
        if (orNull instanceof uk1) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var != null) {
            return sk1Var.getInt();
        }
        throw new xk1("no int found for key <" + str + ">, found [" + sk1Var.m22075c() + "] : " + sk1Var, this);
    }

    public vk1 getObject(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var instanceof vk1) {
            return (vk1) sk1Var;
        }
        throw new xk1("no object found for key <" + str + ">, found [" + sk1Var.m22075c() + "] : " + sk1Var, this);
    }

    public vk1 getObjectOrNull(String str) {
        sk1 orNull = getOrNull(str);
        if (orNull instanceof vk1) {
            return (vk1) orNull;
        }
        return null;
    }

    public sk1 getOrNull(String str) {
        Iterator<sk1> it = this.f78534C.iterator();
        while (it.hasNext()) {
            tk1 tk1Var = (tk1) it.next();
            if (tk1Var.content().equals(str)) {
                return tk1Var.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws xk1 {
        sk1 sk1Var = get(str);
        if (sk1Var instanceof zk1) {
            return sk1Var.content();
        }
        throw new xk1("no string found for key <" + str + ">, found [" + (sk1Var != null ? sk1Var.m22075c() : null) + "] : " + sk1Var, this);
    }

    public String getStringOrNull(String str) {
        sk1 orNull = getOrNull(str);
        if (orNull instanceof zk1) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        for (sk1 sk1Var : this.f78534C) {
            if ((sk1Var instanceof tk1) && ((tk1) sk1Var).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (sk1 sk1Var : this.f78534C) {
            if (sk1Var instanceof tk1) {
                arrayList.add(((tk1) sk1Var).content());
            }
        }
        return arrayList;
    }

    public void put(String str, sk1 sk1Var) {
        Iterator<sk1> it = this.f78534C.iterator();
        while (it.hasNext()) {
            tk1 tk1Var = (tk1) it.next();
            if (tk1Var.content().equals(str)) {
                tk1Var.set(sk1Var);
                return;
            }
        }
        this.f78534C.add((tk1) tk1.allocate(str, sk1Var));
    }

    public void putNumber(String str, float f) {
        put(str, new uk1(f));
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        for (sk1 sk1Var : this.f78534C) {
            if (((tk1) sk1Var).content().equals(str)) {
                arrayList.add(sk1Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f78534C.remove((sk1) it.next());
        }
    }

    public int size() {
        return this.f78534C.size();
    }

    @Override // p000.sk1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (sk1 sk1Var : this.f78534C) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(sk1Var);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public String getStringOrNull(int i) {
        sk1 orNull = getOrNull(i);
        if (orNull instanceof zk1) {
            return orNull.content();
        }
        return null;
    }

    public float getFloat(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var != null) {
            return sk1Var.getFloat();
        }
        throw new xk1("no float at index " + i, this);
    }

    public int getInt(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var != null) {
            return sk1Var.getInt();
        }
        throw new xk1("no int at index " + i, this);
    }

    public sk1 getOrNull(int i) {
        if (i < 0 || i >= this.f78534C.size()) {
            return null;
        }
        return this.f78534C.get(i);
    }

    public sk1 get(int i) throws xk1 {
        if (i >= 0 && i < this.f78534C.size()) {
            return this.f78534C.get(i);
        }
        throw new xk1("no element at index " + i, this);
    }

    public qk1 getArray(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var instanceof qk1) {
            return (qk1) sk1Var;
        }
        throw new xk1("no array at index " + i, this);
    }

    public boolean getBoolean(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var instanceof al1) {
            return ((al1) sk1Var).getBoolean();
        }
        throw new xk1("no boolean at index " + i, this);
    }

    public vk1 getObject(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var instanceof vk1) {
            return (vk1) sk1Var;
        }
        throw new xk1("no object at index " + i, this);
    }

    public String getString(int i) throws xk1 {
        sk1 sk1Var = get(i);
        if (sk1Var instanceof zk1) {
            return sk1Var.content();
        }
        throw new xk1("no string at index " + i, this);
    }
}
