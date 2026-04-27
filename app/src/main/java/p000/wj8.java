package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class wj8 {

    /* JADX INFO: renamed from: c */
    public static final int f94425c = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f94426a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f94427b;

    public wj8(@gib Object obj, @gib Object obj2) {
        this.f94426a = obj;
        this.f94427b = obj2;
    }

    public static /* synthetic */ wj8 copy$default(wj8 wj8Var, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = wj8Var.f94426a;
        }
        if ((i & 2) != 0) {
            obj2 = wj8Var.f94427b;
        }
        return wj8Var.copy(obj, obj2);
    }

    private final int hashCodeOf(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @gib
    public final Object component1() {
        return this.f94426a;
    }

    @gib
    public final Object component2() {
        return this.f94427b;
    }

    @yfb
    public final wj8 copy(@gib Object obj, @gib Object obj2) {
        return new wj8(obj, obj2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj8)) {
            return false;
        }
        wj8 wj8Var = (wj8) obj;
        return md8.areEqual(this.f94426a, wj8Var.f94426a) && md8.areEqual(this.f94427b, wj8Var.f94427b);
    }

    @gib
    public final Object getLeft() {
        return this.f94426a;
    }

    @gib
    public final Object getRight() {
        return this.f94427b;
    }

    public int hashCode() {
        return (hashCodeOf(this.f94426a) * 31) + hashCodeOf(this.f94427b);
    }

    @yfb
    public String toString() {
        return "JoinedKey(left=" + this.f94426a + ", right=" + this.f94427b + ')';
    }
}
