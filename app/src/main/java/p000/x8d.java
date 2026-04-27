package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class x8d implements ai3<d9d> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ai3<d9d> f97190a;

    /* JADX INFO: renamed from: x8d$a */
    @ck3(m4009c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m4010f = "PreferenceDataStoreFactory.kt", m4011i = {}, m4012l = {94}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14987a extends ugg implements gz6<d9d, zy2<? super d9d>, Object> {

        /* JADX INFO: renamed from: a */
        public int f97191a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f97192b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<d9d, zy2<? super d9d>, Object> f97193c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14987a(gz6<? super d9d, ? super zy2<? super d9d>, ? extends Object> gz6Var, zy2<? super C14987a> zy2Var) {
            super(2, zy2Var);
            this.f97193c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14987a c14987a = new C14987a(this.f97193c, zy2Var);
            c14987a.f97192b = obj;
            return c14987a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb d9d d9dVar, @gib zy2<? super d9d> zy2Var) {
            return ((C14987a) create(d9dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f97191a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                d9d d9dVar = (d9d) this.f97192b;
                gz6<d9d, zy2<? super d9d>, Object> gz6Var = this.f97193c;
                this.f97191a = 1;
                obj = gz6Var.invoke(d9dVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            d9d d9dVar2 = (d9d) obj;
            md8.checkNotNull(d9dVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((i6b) d9dVar2).freeze$datastore_preferences_core_release();
            return d9dVar2;
        }
    }

    public x8d(@yfb ai3<d9d> ai3Var) {
        md8.checkNotNullParameter(ai3Var, "delegate");
        this.f97190a = ai3Var;
    }

    @Override // p000.ai3
    @yfb
    public y56<d9d> getData() {
        return this.f97190a.getData();
    }

    @Override // p000.ai3
    @gib
    public Object updateData(@yfb gz6<? super d9d, ? super zy2<? super d9d>, ? extends Object> gz6Var, @yfb zy2<? super d9d> zy2Var) {
        return this.f97190a.updateData(new C14987a(gz6Var, null), zy2Var);
    }
}
