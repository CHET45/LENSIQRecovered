package p000;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,191:1\n102#1:227\n42#2,7:192\n42#2,7:199\n42#2,7:206\n42#2,7:213\n42#2,7:220\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n93#1:227\n54#1:192,7\n62#1:199,7\n68#1:206,7\n75#1:213,7\n79#1:220,7\n*E\n"})
@e0g(parameters = 0)
public final class v64 {

    /* JADX INFO: renamed from: e */
    public static final int f90053e = 8;

    /* JADX INFO: renamed from: a */
    public final boolean f90054a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fx8 f90055b = hz8.lazy(g39.f38327c, (ny6) C13884b.f90058a);

    /* JADX INFO: renamed from: c */
    @yfb
    public final Comparator<lw8> f90056c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final hih<lw8> f90057d;

    /* JADX INFO: renamed from: v64$a */
    public static final class C13883a implements Comparator<lw8> {
        @Override // java.util.Comparator
        public int compare(@yfb lw8 lw8Var, @yfb lw8 lw8Var2) {
            int iCompare = md8.compare(lw8Var.getDepth$ui_release(), lw8Var2.getDepth$ui_release());
            return iCompare != 0 ? iCompare : md8.compare(lw8Var.hashCode(), lw8Var2.hashCode());
        }
    }

    /* JADX INFO: renamed from: v64$b */
    public static final class C13884b extends tt8 implements ny6<Map<lw8, Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C13884b f90058a = new C13884b();

        public C13884b() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final Map<lw8, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public v64(boolean z) {
        this.f90054a = z;
        C13883a c13883a = new C13883a();
        this.f90056c = c13883a;
        this.f90057d = new hih<>(c13883a);
    }

    private final Map<lw8, Integer> getMapOfOriginalDepth() {
        return (Map) this.f90055b.getValue();
    }

    public final void add(@yfb lw8 lw8Var) {
        if (!lw8Var.isAttached()) {
            g28.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.f90054a) {
            Integer num = getMapOfOriginalDepth().get(lw8Var);
            if (num == null) {
                getMapOfOriginalDepth().put(lw8Var, Integer.valueOf(lw8Var.getDepth$ui_release()));
            } else {
                if (!(num.intValue() == lw8Var.getDepth$ui_release())) {
                    g28.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.f90057d.add(lw8Var);
    }

    public final boolean contains(@yfb lw8 lw8Var) {
        boolean zContains = this.f90057d.contains(lw8Var);
        if (this.f90054a) {
            if (!(zContains == getMapOfOriginalDepth().containsKey(lw8Var))) {
                g28.throwIllegalStateException("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean isEmpty() {
        return this.f90057d.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @yfb
    public final lw8 pop() {
        lw8 lw8VarFirst = this.f90057d.first();
        remove(lw8VarFirst);
        return lw8VarFirst;
    }

    public final void popEach(@yfb qy6<? super lw8, bth> qy6Var) {
        while (!isEmpty()) {
            qy6Var.invoke(pop());
        }
    }

    public final boolean remove(@yfb lw8 lw8Var) {
        if (!lw8Var.isAttached()) {
            g28.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f90057d.remove(lw8Var);
        if (this.f90054a) {
            if (!md8.areEqual(getMapOfOriginalDepth().remove(lw8Var), zRemove ? Integer.valueOf(lw8Var.getDepth$ui_release()) : null)) {
                g28.throwIllegalStateException("invalid node depth");
            }
        }
        return zRemove;
    }

    @yfb
    public String toString() {
        return this.f90057d.toString();
    }
}
