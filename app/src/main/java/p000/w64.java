package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,191:1\n102#2:192\n102#2:193\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n167#1:192\n179#1:193\n*E\n"})
@e0g(parameters = 0)
public final class w64 {

    /* JADX INFO: renamed from: c */
    public static final int f93392c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final v64 f93393a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final v64 f93394b;

    public w64(boolean z) {
        this.f93393a = new v64(z);
        this.f93394b = new v64(z);
    }

    public final void add(@yfb lw8 lw8Var, boolean z) {
        if (z) {
            this.f93393a.add(lw8Var);
            this.f93394b.add(lw8Var);
        } else {
            if (this.f93393a.contains(lw8Var)) {
                return;
            }
            this.f93394b.add(lw8Var);
        }
    }

    public final boolean contains(@yfb lw8 lw8Var, boolean z) {
        boolean zContains = this.f93393a.contains(lw8Var);
        return z ? zContains : zContains || this.f93394b.contains(lw8Var);
    }

    public final boolean isEmpty() {
        return this.f93394b.isEmpty() && this.f93393a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @yfb
    public final lw8 pop() {
        return !this.f93393a.isEmpty() ? this.f93393a.pop() : this.f93394b.pop();
    }

    public final void popEach(@yfb gz6<? super lw8, ? super Boolean, bth> gz6Var) {
        while (isNotEmpty()) {
            boolean zIsEmpty = this.f93393a.isEmpty();
            gz6Var.invoke((!zIsEmpty ? this.f93393a : this.f93394b).pop(), Boolean.valueOf(!zIsEmpty));
        }
    }

    public final boolean remove(@yfb lw8 lw8Var, boolean z) {
        return z ? this.f93393a.remove(lw8Var) : this.f93394b.remove(lw8Var);
    }

    public final boolean isEmpty(boolean z) {
        return (z ? this.f93393a : this.f93394b).isEmpty();
    }

    public final boolean contains(@yfb lw8 lw8Var) {
        return this.f93393a.contains(lw8Var) || this.f93394b.contains(lw8Var);
    }

    public final boolean remove(@yfb lw8 lw8Var) {
        return this.f93394b.remove(lw8Var) || this.f93393a.remove(lw8Var);
    }
}
