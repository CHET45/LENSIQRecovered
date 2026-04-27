package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class x79<V> {

    /* JADX INFO: renamed from: d */
    public static final int f97077d = 8;

    /* JADX INFO: renamed from: a */
    public final V f97078a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f97079b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Object f97080c;

    public x79(V v, @gib Object obj, @gib Object obj2) {
        this.f97078a = v;
        this.f97079b = obj;
        this.f97080c = obj2;
    }

    public final boolean getHasNext() {
        return this.f97080c != b25.f12448a;
    }

    public final boolean getHasPrevious() {
        return this.f97079b != b25.f12448a;
    }

    @gib
    public final Object getNext() {
        return this.f97080c;
    }

    @gib
    public final Object getPrevious() {
        return this.f97079b;
    }

    public final V getValue() {
        return this.f97078a;
    }

    @yfb
    public final x79<V> withNext(@gib Object obj) {
        return new x79<>(this.f97078a, this.f97079b, obj);
    }

    @yfb
    public final x79<V> withPrevious(@gib Object obj) {
        return new x79<>(this.f97078a, obj, this.f97080c);
    }

    @yfb
    public final x79<V> withValue(V v) {
        return new x79<>(v, this.f97079b, this.f97080c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x79(V v) {
        b25 b25Var = b25.f12448a;
        this(v, b25Var, b25Var);
    }

    public x79(V v, @gib Object obj) {
        this(v, obj, b25.f12448a);
    }
}
