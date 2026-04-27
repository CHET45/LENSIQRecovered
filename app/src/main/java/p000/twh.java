package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class twh<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zl2 f86214a;

    /* JADX INFO: renamed from: twh$a */
    public static final class C13264a extends tt8 implements gz6<T, bth, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, bth> f86215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13264a(qy6<? super T, bth> qy6Var) {
            super(2);
            this.f86215a = qy6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(Object obj, bth bthVar) {
            invoke2(obj, bthVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t, @yfb bth bthVar) {
            this.f86215a.invoke(t);
        }
    }

    /* JADX INFO: renamed from: twh$b */
    public static final class C13265b extends tt8 implements gz6<T, bth, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, bth> f86216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13265b(qy6<? super T, bth> qy6Var) {
            super(2);
            this.f86216a = qy6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(Object obj, bth bthVar) {
            invoke2(obj, bthVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t, @yfb bth bthVar) {
            this.f86216a.invoke(t);
        }
    }

    private /* synthetic */ twh(zl2 zl2Var) {
        this.f86214a = zl2Var;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ twh m32448boximpl(zl2 zl2Var) {
        return new twh(zl2Var);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> zl2 m32449constructorimpl(@yfb zl2 zl2Var) {
        return zl2Var;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32450equalsimpl(zl2 zl2Var, Object obj) {
        return (obj instanceof twh) && md8.areEqual(zl2Var, ((twh) obj).m32460unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32451equalsimpl0(zl2 zl2Var, zl2 zl2Var2) {
        return md8.areEqual(zl2Var, zl2Var2);
    }

    @yjd
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32452hashCodeimpl(zl2 zl2Var) {
        return zl2Var.hashCode();
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m32453initimpl(zl2 zl2Var, @yfb qy6<? super T, bth> qy6Var) {
        if (zl2Var.getInserting()) {
            zl2Var.apply(bth.f14751a, new C13264a(qy6Var));
        }
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m32454reconcileimpl(zl2 zl2Var, @yfb qy6<? super T, bth> qy6Var) {
        zl2Var.apply(bth.f14751a, new C13265b(qy6Var));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m32455setimpl(zl2 zl2Var, int i, @yfb gz6<? super T, ? super Integer, bth> gz6Var) {
        if (zl2Var.getInserting() || !md8.areEqual(zl2Var.rememberedValue(), Integer.valueOf(i))) {
            zl2Var.updateRememberedValue(Integer.valueOf(i));
            zl2Var.apply(Integer.valueOf(i), gz6Var);
        }
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32457toStringimpl(zl2 zl2Var) {
        return "Updater(composer=" + zl2Var + ')';
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m32458updateimpl(zl2 zl2Var, int i, @yfb gz6<? super T, ? super Integer, bth> gz6Var) {
        boolean inserting = zl2Var.getInserting();
        if (inserting || !md8.areEqual(zl2Var.rememberedValue(), Integer.valueOf(i))) {
            zl2Var.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            zl2Var.apply(Integer.valueOf(i), gz6Var);
        }
    }

    public boolean equals(Object obj) {
        return m32450equalsimpl(this.f86214a, obj);
    }

    public int hashCode() {
        return m32452hashCodeimpl(this.f86214a);
    }

    public String toString() {
        return m32457toStringimpl(this.f86214a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ zl2 m32460unboximpl() {
        return this.f86214a;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m32456setimpl(zl2 zl2Var, V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        if (zl2Var.getInserting() || !md8.areEqual(zl2Var.rememberedValue(), v)) {
            zl2Var.updateRememberedValue(v);
            zl2Var.apply(v, gz6Var);
        }
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m32459updateimpl(zl2 zl2Var, V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        boolean inserting = zl2Var.getInserting();
        if (inserting || !md8.areEqual(zl2Var.rememberedValue(), v)) {
            zl2Var.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            zl2Var.apply(v, gz6Var);
        }
    }
}
