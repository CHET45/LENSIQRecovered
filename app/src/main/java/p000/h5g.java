package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h5g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: h5g$a */
    @ck3(m4009c = "androidx.datastore.core.StorageConnectionKt$readData$2", m4010f = "StorageConnection.kt", m4011i = {}, m4012l = {74}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6715a<T> extends ugg implements kz6<brd<T>, Boolean, zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public int f42422a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f42423b;

        public C6715a(zy2<? super C6715a> zy2Var) {
            super(3, zy2Var);
        }

        @gib
        public final Object invoke(@yfb brd<T> brdVar, boolean z, @gib zy2<? super T> zy2Var) {
            C6715a c6715a = new C6715a(zy2Var);
            c6715a.f42423b = brdVar;
            return c6715a.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f42422a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                brd brdVar = (brd) this.f42423b;
                this.f42422a = 1;
                obj = brdVar.readData(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return invoke((brd) obj, bool.booleanValue(), (zy2) obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: h5g$b */
    @ck3(m4009c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m4010f = "StorageConnection.kt", m4011i = {}, m4012l = {77}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6716b<T> extends ugg implements gz6<msi<T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f42424a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f42425b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f42426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6716b(T t, zy2<? super C6716b> zy2Var) {
            super(2, zy2Var);
            this.f42426c = t;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6716b c6716b = new C6716b(this.f42426c, zy2Var);
            c6716b.f42425b = obj;
            return c6716b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb msi<T> msiVar, @gib zy2<? super bth> zy2Var) {
            return ((C6716b) create(msiVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f42424a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                msi msiVar = (msi) this.f42425b;
                T t = this.f42426c;
                this.f42424a = 1;
                if (msiVar.writeData(t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public static final <T> Object readData(@yfb g5g<T> g5gVar, @yfb zy2<? super T> zy2Var) {
        return g5gVar.readScope(new C6715a(null), zy2Var);
    }

    @gib
    public static final <T> Object writeData(@yfb g5g<T> g5gVar, T t, @yfb zy2<? super bth> zy2Var) {
        Object objWriteScope = g5gVar.writeScope(new C6716b(t, null), zy2Var);
        return objWriteScope == pd8.getCOROUTINE_SUSPENDED() ? objWriteScope : bth.f14751a;
    }
}
