package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public class svf implements Comparator<j74> {

    /* JADX INFO: renamed from: b */
    public static final svf f83106b = new svf(new C12808a());

    /* JADX INFO: renamed from: a */
    public final Comparator<j74> f83107a;

    /* JADX INFO: renamed from: svf$a */
    public static class C12808a implements Comparator<j74> {
        @Override // java.util.Comparator
        public int compare(j74 j74Var, j74 j74Var2) {
            return 0;
        }
    }

    public svf(Comparator<j74> comparator) {
        this.f83107a = comparator;
    }

    public void apply(Object obj) {
        if (obj instanceof jvf) {
            ((jvf) obj).sort(this);
        }
    }

    @Override // java.util.Comparator
    public int compare(j74 j74Var, j74 j74Var2) {
        return this.f83107a.compare(j74Var, j74Var2);
    }
}
