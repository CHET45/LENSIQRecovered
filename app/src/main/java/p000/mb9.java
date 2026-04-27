package p000;

import androidx.lifecycle.AbstractC1158q;

/* JADX INFO: loaded from: classes3.dex */
public final class mb9<T> implements lb9<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public s13<T> f60465a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e13 f60466b;

    /* JADX INFO: renamed from: mb9$a */
    @ck3(m4009c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {99}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9253a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f60467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb9<T> f60468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f60469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9253a(mb9<T> mb9Var, T t, zy2<? super C9253a> zy2Var) {
            super(2, zy2Var);
            this.f60468b = mb9Var;
            this.f60469c = t;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C9253a(this.f60468b, this.f60469c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9253a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f60467a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s13<T> target$lifecycle_livedata_release = this.f60468b.getTarget$lifecycle_livedata_release();
                this.f60467a = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            this.f60468b.getTarget$lifecycle_livedata_release().setValue(this.f60469c);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: mb9$b */
    @ck3(m4009c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {94}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9254b extends ugg implements gz6<x13, zy2<? super yf4>, Object> {

        /* JADX INFO: renamed from: a */
        public int f60470a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb9<T> f60471b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1158q<T> f60472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9254b(mb9<T> mb9Var, AbstractC1158q<T> abstractC1158q, zy2<? super C9254b> zy2Var) {
            super(2, zy2Var);
            this.f60471b = mb9Var;
            this.f60472c = abstractC1158q;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C9254b(this.f60471b, this.f60472c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super yf4> zy2Var) {
            return ((C9254b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f60470a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s13<T> target$lifecycle_livedata_release = this.f60471b.getTarget$lifecycle_livedata_release();
                AbstractC1158q<T> abstractC1158q = this.f60472c;
                this.f60470a = 1;
                obj = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(abstractC1158q, this);
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
    }

    public mb9(@yfb s13<T> s13Var, @yfb e13 e13Var) {
        md8.checkNotNullParameter(s13Var, "target");
        md8.checkNotNullParameter(e13Var, "context");
        this.f60465a = s13Var;
        this.f60466b = e13Var.plus(df4.getMain().getImmediate());
    }

    @Override // p000.lb9
    @gib
    @igg({"NullSafeMutableLiveData"})
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        Object objWithContext = dg1.withContext(this.f60466b, new C9253a(this, t, null), zy2Var);
        return objWithContext == pd8.getCOROUTINE_SUSPENDED() ? objWithContext : bth.f14751a;
    }

    @Override // p000.lb9
    @gib
    public Object emitSource(@yfb AbstractC1158q<T> abstractC1158q, @yfb zy2<? super yf4> zy2Var) {
        return dg1.withContext(this.f60466b, new C9254b(this, abstractC1158q, null), zy2Var);
    }

    @Override // p000.lb9
    @gib
    public T getLatestValue() {
        return this.f60465a.getValue();
    }

    @yfb
    public final s13<T> getTarget$lifecycle_livedata_release() {
        return this.f60465a;
    }

    public final void setTarget$lifecycle_livedata_release(@yfb s13<T> s13Var) {
        md8.checkNotNullParameter(s13Var, "<set-?>");
        this.f60465a = s13Var;
    }
}
