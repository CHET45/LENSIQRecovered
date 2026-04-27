package p000;

import android.view.Surface;
import java.util.concurrent.CancellationException;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
public abstract class fq0 implements InterfaceC6986hs, ogg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final x13 f37391a;

    /* JADX INFO: renamed from: b */
    @gib
    public rz6<? super lgg, ? super Surface, ? super Integer, ? super Integer, ? super zy2<? super bth>, ? extends Object> f37392b;

    /* JADX INFO: renamed from: c */
    @gib
    public kz6<? super Surface, ? super Integer, ? super Integer, bth> f37393c;

    /* JADX INFO: renamed from: d */
    @gib
    public qy6<? super Surface, bth> f37394d;

    /* JADX INFO: renamed from: e */
    @gib
    public jj8 f37395e;

    /* JADX INFO: renamed from: fq0$a */
    @ck3(m4009c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", m4010f = "AndroidExternalSurface.android.kt", m4011i = {0}, m4012l = {132, 137}, m4013m = "invokeSuspend", m4014n = {"$this$launch"}, m4015s = {"L$0"})
    public static final class C5924a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f37396a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f37397b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Surface f37399d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f37400e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f37401f;

        /* JADX INFO: renamed from: fq0$a$a */
        public static final class a implements lgg, ogg, x13 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fq0 f37402a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f37403b;

            public a(fq0 fq0Var, x13 x13Var) {
                this.f37402a = fq0Var;
                this.f37403b = x13Var;
            }

            @Override // p000.x13
            @yfb
            public e13 getCoroutineContext() {
                return this.f37403b.getCoroutineContext();
            }

            @Override // p000.ogg
            public void onChanged(@yfb Surface surface, @yfb kz6<? super Surface, ? super Integer, ? super Integer, bth> kz6Var) {
                this.f37402a.onChanged(surface, kz6Var);
            }

            @Override // p000.ogg
            public void onDestroyed(@yfb Surface surface, @yfb qy6<? super Surface, bth> qy6Var) {
                this.f37402a.onDestroyed(surface, qy6Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5924a(Surface surface, int i, int i2, zy2<? super C5924a> zy2Var) {
            super(2, zy2Var);
            this.f37399d = surface;
            this.f37400e = i;
            this.f37401f = i2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5924a c5924a = fq0.this.new C5924a(this.f37399d, this.f37400e, this.f37401f, zy2Var);
            c5924a.f37397b = obj;
            return c5924a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C5924a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            x13 x13Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37396a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13Var = (x13) this.f37397b;
                jj8 jj8Var = fq0.this.f37395e;
                if (jj8Var != null) {
                    this.f37397b = x13Var;
                    this.f37396a = 1;
                    if (oj8.cancelAndJoin(jj8Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                x13Var = (x13) this.f37397b;
                y7e.throwOnFailure(obj);
            }
            a aVar = new a(fq0.this, x13Var);
            rz6 rz6Var = fq0.this.f37392b;
            if (rz6Var != null) {
                Surface surface = this.f37399d;
                Integer numBoxInt = wc1.boxInt(this.f37400e);
                Integer numBoxInt2 = wc1.boxInt(this.f37401f);
                this.f37397b = null;
                this.f37396a = 2;
                if (rz6Var.invoke(aVar, surface, numBoxInt, numBoxInt2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    public fq0(@yfb x13 x13Var) {
        this.f37391a = x13Var;
    }

    public final void dispatchSurfaceChanged(@yfb Surface surface, int i, int i2) {
        kz6<? super Surface, ? super Integer, ? super Integer, bth> kz6Var = this.f37393c;
        if (kz6Var != null) {
            kz6Var.invoke(surface, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void dispatchSurfaceCreated(@yfb Surface surface, int i, int i2) {
        if (this.f37392b != null) {
            this.f37395e = fg1.launch$default(this.f37391a, null, b23.f12444d, new C5924a(surface, i, i2, null), 1, null);
        }
    }

    public final void dispatchSurfaceDestroyed(@yfb Surface surface) {
        qy6<? super Surface, bth> qy6Var = this.f37394d;
        if (qy6Var != null) {
            qy6Var.invoke(surface);
        }
        jj8 jj8Var = this.f37395e;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.f37395e = null;
    }

    @yfb
    public final x13 getScope() {
        return this.f37391a;
    }

    @Override // p000.ogg
    public void onChanged(@yfb Surface surface, @yfb kz6<? super Surface, ? super Integer, ? super Integer, bth> kz6Var) {
        this.f37393c = kz6Var;
    }

    @Override // p000.ogg
    public void onDestroyed(@yfb Surface surface, @yfb qy6<? super Surface, bth> qy6Var) {
        this.f37394d = qy6Var;
    }

    @Override // p000.InterfaceC6986hs
    public void onSurface(@yfb rz6<? super lgg, ? super Surface, ? super Integer, ? super Integer, ? super zy2<? super bth>, ? extends Object> rz6Var) {
        this.f37392b = rz6Var;
    }
}
