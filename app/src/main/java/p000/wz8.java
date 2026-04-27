package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wz8 {
    @ah5
    public static final int findIndexByKey(@yfb vz8 vz8Var, @gib Object obj, int i) {
        int index;
        return (obj == null || vz8Var.getItemCount() == 0 || (i < vz8Var.getItemCount() && md8.areEqual(obj, vz8Var.getKey(i))) || (index = vz8Var.getIndex(obj)) == -1) ? i : index;
    }
}
