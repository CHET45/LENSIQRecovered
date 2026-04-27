package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pxf {

    /* JADX INFO: renamed from: pxf$a */
    public static final class C11176a extends o68 {

        /* JADX INFO: renamed from: a */
        public int f72471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mxf<T> f72472b;

        public C11176a(mxf<T> mxfVar) {
            this.f72472b = mxfVar;
        }

        public final int getIndex() {
            return this.f72471a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f72471a < this.f72472b.size();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.o68
        public int nextInt() {
            mxf<T> mxfVar = this.f72472b;
            int i = this.f72471a;
            this.f72471a = i + 1;
            return mxfVar.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f72471a = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: pxf$b */
    public static final class C11177b<T> implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f72473a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mxf<T> f72474b;

        public C11177b(mxf<T> mxfVar) {
            this.f72474b = mxfVar;
        }

        public final int getIndex() {
            return this.f72473a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f72473a < this.f72474b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            mxf<T> mxfVar = this.f72474b;
            int i = this.f72473a;
            this.f72473a = i + 1;
            return mxfVar.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f72473a = i;
        }
    }

    public static final <T> boolean contains(@yfb mxf<T> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.containsKey(i);
    }

    public static final <T> void forEach(@yfb mxf<T> mxfVar, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int size = mxfVar.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(mxfVar.keyAt(i)), mxfVar.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@yfb mxf<T> mxfVar, int i, T t) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.get(i, t);
    }

    public static final <T> T getOrElse(@yfb mxf<T> mxfVar, int i, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        T t = mxfVar.get(i);
        return t == null ? ny6Var.invoke() : t;
    }

    public static final <T> int getSize(@yfb mxf<T> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.size();
    }

    public static final <T> boolean isNotEmpty(@yfb mxf<T> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return !mxfVar.isEmpty();
    }

    @yfb
    public static final <T> o68 keyIterator(@yfb mxf<T> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return new C11176a(mxfVar);
    }

    @yfb
    public static final <T> mxf<T> plus(@yfb mxf<T> mxfVar, @yfb mxf<T> mxfVar2) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        md8.checkNotNullParameter(mxfVar2, "other");
        mxf<T> mxfVar3 = new mxf<>(mxfVar.size() + mxfVar2.size());
        mxfVar3.putAll(mxfVar);
        mxfVar3.putAll(mxfVar2);
        return mxfVar3;
    }

    @q64(level = u64.f86867c, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(mxf mxfVar, int i, Object obj) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.remove(i, obj);
    }

    public static final <T> void set(@yfb mxf<T> mxfVar, int i, T t) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        mxfVar.put(i, t);
    }

    @yfb
    public static final <T> Iterator<T> valueIterator(@yfb mxf<T> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return new C11177b(mxfVar);
    }
}
