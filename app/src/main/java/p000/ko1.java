package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ko1<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f54824a;

    /* JADX INFO: renamed from: b */
    public final qp7<T> f54825b;

    public ko1(ArrayList<T> arrayList, qp7<T> qp7Var) {
        this.f54824a = arrayList;
        this.f54825b = qp7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<T> arrayList = this.f54824a;
        if (arrayList == null || arrayList.isEmpty() || this.f54825b == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f54824a);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            this.f54825b.onHandle((T) obj);
        }
    }
}
