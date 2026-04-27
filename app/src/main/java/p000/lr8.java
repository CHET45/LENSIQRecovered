package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class lr8 {

    /* JADX INFO: renamed from: a */
    @efb
    public final HashMap<String, Integer> f58539a;

    /* JADX INFO: renamed from: b */
    @efb
    public final SparseArray<String> f58540b;

    public lr8() {
        this(new HashMap(), new SparseArray());
    }

    /* JADX INFO: renamed from: a */
    public String m16330a(@efb cn4 cn4Var) {
        return cn4Var.getUrl() + cn4Var.getUri() + cn4Var.getFilename();
    }

    public void add(@efb cn4 cn4Var, int i) {
        String strM16330a = m16330a(cn4Var);
        this.f58539a.put(strM16330a, Integer.valueOf(i));
        this.f58540b.put(i, strM16330a);
    }

    @hib
    public Integer get(@efb cn4 cn4Var) {
        Integer num = this.f58539a.get(m16330a(cn4Var));
        if (num != null) {
            return num;
        }
        return null;
    }

    public void remove(int i) {
        String str = this.f58540b.get(i);
        if (str != null) {
            this.f58539a.remove(str);
            this.f58540b.remove(i);
        }
    }

    public lr8(@efb HashMap<String, Integer> map, @efb SparseArray<String> sparseArray) {
        this.f58539a = map;
        this.f58540b = sparseArray;
    }
}
