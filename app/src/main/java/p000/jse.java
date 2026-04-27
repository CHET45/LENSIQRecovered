package p000;

import p000.e13;
import p000.rya;

/* JADX INFO: loaded from: classes.dex */
public final class jse implements rya {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final jse f51733a = new jse();

    /* JADX INFO: renamed from: b */
    public static final long f51734b = 16;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: jse$a */
    @ck3(m4009c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", m4010f = "ActualAndroid.android.kt", m4011i = {}, m4012l = {52}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8059a<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f51735a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Long, R> f51736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8059a(qy6<? super Long, ? extends R> qy6Var, zy2<? super C8059a> zy2Var) {
            super(2, zy2Var);
            this.f51736b = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C8059a(this.f51736b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C8059a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f51735a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                this.f51735a = 1;
                if (p34.delay(16L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return this.f51736b.invoke(wc1.boxLong(System.nanoTime()));
        }
    }

    private jse() {
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) rya.C12368a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) rya.C12368a.get(this, interfaceC5041c);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return rya.C12368a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return rya.C12368a.plus(this, e13Var);
    }

    @Override // p000.rya
    @gib
    public <R> Object withFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        return dg1.withContext(df4.getMain(), new C8059a(qy6Var, null), zy2Var);
    }
}
