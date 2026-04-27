package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class ui4 {

    /* JADX INFO: renamed from: c */
    public static final Comparator<ui4> f88039c = new Comparator() { // from class: ji4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ui4.lambda$static$0((ui4) obj, (ui4) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final Comparator<ui4> f88040d = new Comparator() { // from class: li4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ui4.lambda$static$1((ui4) obj, (ui4) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public final ci4 f88041a;

    /* JADX INFO: renamed from: b */
    public final int f88042b;

    public ui4(ci4 ci4Var, int i) {
        this.f88041a = ci4Var;
        this.f88042b = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(ui4 ui4Var, ui4 ui4Var2) {
        int iCompareTo = ui4Var.f88041a.compareTo(ui4Var2.f88041a);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(ui4Var.f88042b, ui4Var2.f88042b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(ui4 ui4Var, ui4 ui4Var2) {
        int iCompare = Integer.compare(ui4Var.f88042b, ui4Var2.f88042b);
        return iCompare != 0 ? iCompare : ui4Var.f88041a.compareTo(ui4Var2.f88041a);
    }

    /* JADX INFO: renamed from: c */
    public int m23367c() {
        return this.f88042b;
    }

    /* JADX INFO: renamed from: d */
    public ci4 m23368d() {
        return this.f88041a;
    }
}
