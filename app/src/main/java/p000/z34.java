package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z34 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final z34 f103962a = new z34();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: z34$a */
    public static final class C15967a<T> extends gsb<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<hp8<?>, T, T, bth> f103963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15967a(T t, kz6<? super hp8<?>, ? super T, ? super T, bth> kz6Var) {
            super(t);
            this.f103963b = kz6Var;
        }

        @Override // p000.gsb
        /* JADX INFO: renamed from: a */
        public void mo11837a(hp8<?> hp8Var, T t, T t2) {
            md8.checkNotNullParameter(hp8Var, "property");
            this.f103963b.invoke(hp8Var, t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: z34$b */
    public static final class C15968b<T> extends gsb<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<hp8<?>, T, T, Boolean> f103964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15968b(T t, kz6<? super hp8<?>, ? super T, ? super T, Boolean> kz6Var) {
            super(t);
            this.f103964b = kz6Var;
        }

        @Override // p000.gsb
        /* JADX INFO: renamed from: b */
        public boolean mo11838b(hp8<?> hp8Var, T t, T t2) {
            md8.checkNotNullParameter(hp8Var, "property");
            return this.f103964b.invoke(hp8Var, t, t2).booleanValue();
        }
    }

    private z34() {
    }

    @yfb
    public final <T> erd<Object, T> notNull() {
        return new zfb();
    }

    @yfb
    public final <T> erd<Object, T> observable(T t, @yfb kz6<? super hp8<?>, ? super T, ? super T, bth> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "onChange");
        return new C15967a(t, kz6Var);
    }

    @yfb
    public final <T> erd<Object, T> vetoable(T t, @yfb kz6<? super hp8<?>, ? super T, ? super T, Boolean> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "onChange");
        return new C15968b(t, kz6Var);
    }
}
