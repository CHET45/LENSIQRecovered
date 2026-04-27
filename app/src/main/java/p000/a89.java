package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class a89 {

    /* JADX INFO: renamed from: c */
    public static final int f614c = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f615a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f616b;

    public a89(@gib Object obj, @gib Object obj2) {
        this.f615a = obj;
        this.f616b = obj2;
    }

    public final boolean getHasNext() {
        return this.f616b != b25.f12448a;
    }

    public final boolean getHasPrevious() {
        return this.f615a != b25.f12448a;
    }

    @gib
    public final Object getNext() {
        return this.f616b;
    }

    @gib
    public final Object getPrevious() {
        return this.f615a;
    }

    @yfb
    public final a89 withNext(@gib Object obj) {
        return new a89(this.f615a, obj);
    }

    @yfb
    public final a89 withPrevious(@gib Object obj) {
        return new a89(obj, this.f616b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a89() {
        b25 b25Var = b25.f12448a;
        this(b25Var, b25Var);
    }

    public a89(@gib Object obj) {
        this(obj, b25.f12448a);
    }
}
