package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class hsh<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C7003a f44791d = new C7003a(null);

    /* JADX INFO: renamed from: e */
    public static final int f44792e = 8;

    /* JADX INFO: renamed from: a */
    public final int f44793a;

    /* JADX INFO: renamed from: b */
    @yfb
    public ytf<T> f44794b;

    /* JADX INFO: renamed from: c */
    @yfb
    public ytf<T> f44795c;

    /* JADX INFO: renamed from: hsh$a */
    public static final class C7003a {

        /* JADX INFO: renamed from: hsh$a$a */
        @dwf({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n33#2,6:175\n33#2,6:181\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n140#1:175,6\n145#1:181,6\n*E\n"})
        public static final class a implements dme<hsh<T>, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dme<T, Object> f44796a;

            public a(dme<T, Object> dmeVar) {
                this.f44796a = dmeVar;
            }

            @Override // p000.dme
            @yfb
            public hsh<T> restore(@yfb Object obj) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                int iIntValue = ((Number) list.get(0)).intValue();
                int iIntValue2 = ((Number) list.get(1)).intValue();
                int iIntValue3 = ((Number) list.get(2)).intValue();
                dme<T, Object> dmeVar = this.f44796a;
                List listCreateListBuilder = k82.createListBuilder();
                int i = 3;
                while (i < iIntValue2 + 3) {
                    T tRestore = dmeVar.restore(list.get(i));
                    md8.checkNotNull(tRestore);
                    listCreateListBuilder.add(tRestore);
                    i++;
                }
                List listBuild = k82.build(listCreateListBuilder);
                dme<T, Object> dmeVar2 = this.f44796a;
                List listCreateListBuilder2 = k82.createListBuilder();
                while (i < iIntValue2 + iIntValue3 + 3) {
                    T tRestore2 = dmeVar2.restore(list.get(i));
                    md8.checkNotNull(tRestore2);
                    listCreateListBuilder2.add(tRestore2);
                    i++;
                }
                return new hsh<>(listBuild, k82.build(listCreateListBuilder2), iIntValue);
            }

            @Override // p000.dme
            @yfb
            public Object save(@yfb fme fmeVar, @yfb hsh<T> hshVar) {
                dme<T, Object> dmeVar = this.f44796a;
                List listCreateListBuilder = k82.createListBuilder();
                listCreateListBuilder.add(Integer.valueOf(hshVar.f44793a));
                listCreateListBuilder.add(Integer.valueOf(hshVar.f44794b.size()));
                listCreateListBuilder.add(Integer.valueOf(hshVar.f44795c.size()));
                ytf ytfVar = hshVar.f44794b;
                int size = ytfVar.size();
                for (int i = 0; i < size; i++) {
                    listCreateListBuilder.add(dmeVar.save(fmeVar, ytfVar.get(i)));
                }
                ytf ytfVar2 = hshVar.f44795c;
                int size2 = ytfVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    listCreateListBuilder.add(dmeVar.save(fmeVar, ytfVar2.get(i2)));
                }
                return k82.build(listCreateListBuilder);
            }
        }

        public /* synthetic */ C7003a(jt3 jt3Var) {
            this();
        }

        public final /* synthetic */ <T> dme<hsh<T>, Object> createSaver(dme<T, Object> dmeVar) {
            md8.needClassReification();
            return new a(dmeVar);
        }

        private C7003a() {
        }
    }

    public hsh() {
        this(null, null, 0, 7, null);
    }

    public final void clearHistory() {
        this.f44794b.clear();
        this.f44795c.clear();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.f44795c.isEmpty();
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.f44794b.isEmpty();
    }

    public final int getSize() {
        return this.f44794b.size() + this.f44795c.size();
    }

    public final void record(T t) {
        this.f44795c.clear();
        while (getSize() > this.f44793a - 1) {
            q82.removeFirst(this.f44794b);
        }
        this.f44794b.add(t);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T redo() {
        if (!getCanRedo$foundation_release()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t = (T) q82.removeLast(this.f44795c);
        this.f44794b.add(t);
        return t;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T undo() {
        if (!getCanUndo$foundation_release()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t = (T) q82.removeLast(this.f44794b);
        this.f44795c.add(t);
        return t;
    }

    public hsh(@yfb List<? extends T> list, @yfb List<? extends T> list2, int i) {
        this.f44793a = i;
        ytf<T> ytfVar = new ytf<>();
        ytfVar.addAll(list);
        this.f44794b = ytfVar;
        ytf<T> ytfVar2 = new ytf<>();
        ytfVar2.addAll(list2);
        this.f44795c = ytfVar2;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        if (getSize() <= i) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + getSize() + ") greater than the given capacity=(" + i + ").").toString());
    }

    public /* synthetic */ hsh(List list, List list2, int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? l82.emptyList() : list, (i2 & 2) != 0 ? l82.emptyList() : list2, (i2 & 4) != 0 ? 100 : i);
    }
}
