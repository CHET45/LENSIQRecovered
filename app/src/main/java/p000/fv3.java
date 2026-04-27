package p000;

import androidx.compose.foundation.gestures.C0608g;
import java.util.concurrent.CancellationException;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class fv3 implements s36 {

    /* JADX INFO: renamed from: d */
    public static final int f37793d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public vk3<Float> f37794a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fza f37795b;

    /* JADX INFO: renamed from: c */
    public int f37796c;

    /* JADX INFO: renamed from: fv3$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m4010f = "Scrollable.kt", m4011i = {0, 0}, m4012l = {893}, m4013m = "invokeSuspend", m4014n = {"velocityLeft", "animationState"}, m4015s = {"L$0", "L$1"})
    public static final class C5996a extends ugg implements gz6<x13, zy2<? super Float>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f37797a;

        /* JADX INFO: renamed from: b */
        public Object f37798b;

        /* JADX INFO: renamed from: c */
        public int f37799c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f37800d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fv3 f37801e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vre f37802f;

        /* JADX INFO: renamed from: fv3$a$a */
        public static final class a extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f37803a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vre f37804b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8118e f37805c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ fv3 f37806d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8118e c8118e, vre vreVar, jvd.C8118e c8118e2, fv3 fv3Var) {
                super(1);
                this.f37803a = c8118e;
                this.f37804b = vreVar;
                this.f37805c = c8118e2;
                this.f37806d = fv3Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
                invoke2(c10714oy);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
                float fFloatValue = c10714oy.getValue().floatValue() - this.f37803a.f52107a;
                float fScrollBy = this.f37804b.scrollBy(fFloatValue);
                this.f37803a.f52107a = c10714oy.getValue().floatValue();
                this.f37805c.f52107a = c10714oy.getVelocity().floatValue();
                if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                    c10714oy.cancelAnimation();
                }
                fv3 fv3Var = this.f37806d;
                fv3Var.setLastAnimationCycleCount(fv3Var.getLastAnimationCycleCount() + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5996a(float f, fv3 fv3Var, vre vreVar, zy2<? super C5996a> zy2Var) {
            super(2, zy2Var);
            this.f37800d = f;
            this.f37801e = fv3Var;
            this.f37802f = vreVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5996a(this.f37800d, this.f37801e, this.f37802f, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Float> zy2Var) {
            return ((C5996a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            float f;
            jvd.C8118e c8118e;
            C12364ry c12364ry;
            vk3<Float> flingDecay;
            a aVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37799c;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                if (Math.abs(this.f37800d) > 1.0f) {
                    jvd.C8118e c8118e2 = new jvd.C8118e();
                    c8118e2.f52107a = this.f37800d;
                    jvd.C8118e c8118e3 = new jvd.C8118e();
                    C12364ry c12364ryAnimationState$default = C12827sy.AnimationState$default(0.0f, this.f37800d, 0L, 0L, false, 28, null);
                    try {
                        flingDecay = this.f37801e.getFlingDecay();
                        aVar = new a(c8118e3, this.f37802f, c8118e2, this.f37801e);
                        this.f37797a = c8118e2;
                        this.f37798b = c12364ryAnimationState$default;
                        this.f37799c = 1;
                    } catch (CancellationException unused) {
                        c8118e = c8118e2;
                        c12364ry = c12364ryAnimationState$default;
                        c8118e.f52107a = ((Number) c12364ry.getVelocity()).floatValue();
                    }
                    if (rgg.animateDecay$default(c12364ryAnimationState$default, flingDecay, false, aVar, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c8118e = c8118e2;
                    f = c8118e.f52107a;
                } else {
                    f = this.f37800d;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c12364ry = (C12364ry) this.f37798b;
                c8118e = (jvd.C8118e) this.f37797a;
                try {
                    y7e.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    c8118e.f52107a = ((Number) c12364ry.getVelocity()).floatValue();
                }
                f = c8118e.f52107a;
            }
            return wc1.boxFloat(f);
        }
    }

    public fv3(@yfb vk3<Float> vk3Var, @yfb fza fzaVar) {
        this.f37794a = vk3Var;
        this.f37795b = fzaVar;
    }

    @yfb
    public final vk3<Float> getFlingDecay() {
        return this.f37794a;
    }

    public final int getLastAnimationCycleCount() {
        return this.f37796c;
    }

    @Override // p000.s36
    @gib
    public Object performFling(@yfb vre vreVar, float f, @yfb zy2<? super Float> zy2Var) {
        this.f37796c = 0;
        return dg1.withContext(this.f37795b, new C5996a(f, this, vreVar, null), zy2Var);
    }

    public final void setFlingDecay(@yfb vk3<Float> vk3Var) {
        this.f37794a = vk3Var;
    }

    public final void setLastAnimationCycleCount(int i) {
        this.f37796c = i;
    }

    public /* synthetic */ fv3(vk3 vk3Var, fza fzaVar, int i, jt3 jt3Var) {
        this(vk3Var, (i & 2) != 0 ? C0608g.getDefaultScrollMotionDurationScale() : fzaVar);
    }
}
