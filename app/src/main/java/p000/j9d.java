package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class j9d {

    /* JADX INFO: renamed from: j9d$a */
    @ck3(m4009c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m4010f = "Preferences.kt", m4011i = {}, m4012l = {358}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/PreferencesKt$edit$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1#2:362\n*E\n"})
    public static final class C7820a extends ugg implements gz6<d9d, zy2<? super d9d>, Object> {

        /* JADX INFO: renamed from: a */
        public int f50038a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f50039b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<i6b, zy2<? super bth>, Object> f50040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7820a(gz6<? super i6b, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C7820a> zy2Var) {
            super(2, zy2Var);
            this.f50040c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C7820a c7820a = new C7820a(this.f50040c, zy2Var);
            c7820a.f50039b = obj;
            return c7820a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb d9d d9dVar, @gib zy2<? super d9d> zy2Var) {
            return ((C7820a) create(d9dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f50038a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6b i6bVar = (i6b) this.f50039b;
                y7e.throwOnFailure(obj);
                return i6bVar;
            }
            y7e.throwOnFailure(obj);
            i6b mutablePreferences = ((d9d) this.f50039b).toMutablePreferences();
            gz6<i6b, zy2<? super bth>, Object> gz6Var = this.f50040c;
            this.f50039b = mutablePreferences;
            this.f50038a = 1;
            return gz6Var.invoke(mutablePreferences, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences;
        }
    }

    @gib
    public static final Object edit(@yfb ai3<d9d> ai3Var, @yfb gz6<? super i6b, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super d9d> zy2Var) {
        return ai3Var.updateData(new C7820a(gz6Var, null), zy2Var);
    }
}
