package p000;

/* JADX INFO: loaded from: classes3.dex */
public class nra implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f65370a;

    /* JADX INFO: renamed from: b */
    public final EnumC10023a f65371b;

    /* JADX INFO: renamed from: c */
    public final boolean f65372c;

    /* JADX INFO: renamed from: nra$a */
    public enum EnumC10023a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static EnumC10023a forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public nra(String str, EnumC10023a enumC10023a, boolean z) {
        this.f65370a = str;
        this.f65371b = enumC10023a;
        this.f65372c = z;
    }

    public EnumC10023a getMode() {
        return this.f65371b;
    }

    public String getName() {
        return this.f65370a;
    }

    public boolean isHidden() {
        return this.f65372c;
    }

    @Override // p000.sw2
    @hib
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        if (go9Var.enableMergePathsForKitKatAndAbove()) {
            return new ora(this);
        }
        dj9.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f65371b + '}';
    }
}
