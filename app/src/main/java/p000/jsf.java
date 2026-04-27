package p000;

import androidx.compose.foundation.gestures.C0608g;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n503#2,4:508\n503#2,4:512\n503#2,4:516\n503#2,4:520\n1#3:524\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n112#1:508,4\n203#1:512,4\n206#1:516,4\n226#1:520,4\n*E\n"})
@q64(message = "Please use the snapFlingBehavior function", replaceWith = @i2e(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
@ah5
@e0g(parameters = 1)
public final class jsf implements kng {

    /* JADX INFO: renamed from: e */
    public static final int f51737e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lsf f51738a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final vk3<Float> f51739b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC11178py<Float> f51740c;

    /* JADX INFO: renamed from: d */
    @yfb
    public fza f51741d = C0608g.getDefaultScrollMotionDurationScale();

    /* JADX INFO: renamed from: jsf$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m4010f = "SnapFlingBehavior.kt", m4011i = {0}, m4012l = {123}, m4013m = "fling", m4014n = {"onRemainingScrollOffsetUpdate"}, m4015s = {"L$0"})
    public static final class C8060a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f51742a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f51743b;

        /* JADX INFO: renamed from: d */
        public int f51745d;

        public C8060a(zy2<? super C8060a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f51743b = obj;
            this.f51745d |= Integer.MIN_VALUE;
            return jsf.this.fling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: jsf$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m4010f = "SnapFlingBehavior.kt", m4011i = {0}, m4012l = {142, 161}, m4013m = "invokeSuspend", m4014n = {"remainingScrollOffset"}, m4015s = {"L$0"})
    @dwf({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,507:1\n503#2,4:508\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n159#1:508,4\n*E\n"})
    public static final class C8061b extends ugg implements gz6<x13, zy2<? super C9609my<Float, C14294vy>>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f51746a;

        /* JADX INFO: renamed from: b */
        public int f51747b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f51749d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<Float, bth> f51750e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vre f51751f;

        /* JADX INFO: renamed from: jsf$b$a */
        public static final class a extends tt8 implements qy6<Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f51752a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<Float, bth> f51753b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(jvd.C8118e c8118e, qy6<? super Float, bth> qy6Var) {
                super(1);
                this.f51752a = c8118e;
                this.f51753b = qy6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Float f) {
                invoke(f.floatValue());
                return bth.f14751a;
            }

            public final void invoke(float f) {
                jvd.C8118e c8118e = this.f51752a;
                float f2 = c8118e.f52107a - f;
                c8118e.f52107a = f2;
                this.f51753b.invoke(Float.valueOf(f2));
            }
        }

        /* JADX INFO: renamed from: jsf$b$b */
        public static final class b extends tt8 implements qy6<Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f51754a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<Float, bth> f51755b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(jvd.C8118e c8118e, qy6<? super Float, bth> qy6Var) {
                super(1);
                this.f51754a = c8118e;
                this.f51755b = qy6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Float f) {
                invoke(f.floatValue());
                return bth.f14751a;
            }

            public final void invoke(float f) {
                jvd.C8118e c8118e = this.f51754a;
                float f2 = c8118e.f52107a - f;
                c8118e.f52107a = f2;
                this.f51755b.invoke(Float.valueOf(f2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8061b(float f, qy6<? super Float, bth> qy6Var, vre vreVar, zy2<? super C8061b> zy2Var) {
            super(2, zy2Var);
            this.f51749d = f;
            this.f51750e = qy6Var;
            this.f51751f = vreVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return jsf.this.new C8061b(this.f51749d, this.f51750e, this.f51751f, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super C9609my<Float, C14294vy>> zy2Var) {
            return ((C8061b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            jvd.C8118e c8118e;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f51747b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                float fCalculateApproachOffset = jsf.this.f51738a.calculateApproachOffset(this.f51749d, xk3.calculateTargetValue(jsf.this.f51739b, 0.0f, this.f51749d));
                if (Float.isNaN(fCalculateApproachOffset)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                c8118e = new jvd.C8118e();
                float fAbs = Math.abs(fCalculateApproachOffset) * Math.signum(this.f51749d);
                c8118e.f52107a = fAbs;
                this.f51750e.invoke(wc1.boxFloat(fAbs));
                jsf jsfVar = jsf.this;
                vre vreVar = this.f51751f;
                float f = c8118e.f52107a;
                float f2 = this.f51749d;
                b bVar = new b(c8118e, this.f51750e);
                this.f51746a = c8118e;
                this.f51747b = 1;
                obj = jsfVar.tryApproach(vreVar, f, f2, bVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        y7e.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8118e = (jvd.C8118e) this.f51746a;
                y7e.throwOnFailure(obj);
            }
            C12364ry c12364ry = (C12364ry) obj;
            float fCalculateSnapOffset = jsf.this.f51738a.calculateSnapOffset(((Number) c12364ry.getVelocity()).floatValue());
            if (Float.isNaN(fCalculateSnapOffset)) {
                throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            c8118e.f52107a = fCalculateSnapOffset;
            vre vreVar2 = this.f51751f;
            C12364ry c12364ryCopy$default = C12827sy.copy$default(c12364ry, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            InterfaceC11178py interfaceC11178py = jsf.this.f51740c;
            a aVar = new a(c8118e, this.f51750e);
            this.f51746a = null;
            this.f51747b = 2;
            obj = ksf.animateWithTarget(vreVar2, fCalculateSnapOffset, fCalculateSnapOffset, c12364ryCopy$default, interfaceC11178py, aVar, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    /* JADX INFO: renamed from: jsf$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m4010f = "SnapFlingBehavior.kt", m4011i = {}, m4012l = {110}, m4013m = "performFling", m4014n = {}, m4015s = {})
    public static final class C8062c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f51756a;

        /* JADX INFO: renamed from: c */
        public int f51758c;

        public C8062c(zy2<? super C8062c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f51756a = obj;
            this.f51758c |= Integer.MIN_VALUE;
            return jsf.this.performFling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: jsf$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m4010f = "SnapFlingBehavior.kt", m4011i = {}, m4012l = {187}, m4013m = "tryApproach", m4014n = {}, m4015s = {})
    public static final class C8063d extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f51759a;

        /* JADX INFO: renamed from: c */
        public int f51761c;

        public C8063d(zy2<? super C8063d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f51759a = obj;
            this.f51761c |= Integer.MIN_VALUE;
            return jsf.this.tryApproach(null, 0.0f, 0.0f, null, this);
        }
    }

    public jsf(@yfb lsf lsfVar, @yfb vk3<Float> vk3Var, @yfb InterfaceC11178py<Float> interfaceC11178py) {
        this.f51738a = lsfVar;
        this.f51739b = vk3Var;
        this.f51740c = interfaceC11178py;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fling(p000.vre r11, float r12, p000.qy6<? super java.lang.Float, p000.bth> r13, p000.zy2<? super p000.C9609my<java.lang.Float, p000.C14294vy>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof p000.jsf.C8060a
            if (r0 == 0) goto L13
            r0 = r14
            jsf$a r0 = (p000.jsf.C8060a) r0
            int r1 = r0.f51745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51745d = r1
            goto L18
        L13:
            jsf$a r0 = new jsf$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f51743b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f51745d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f51742a
            r13 = r11
            qy6 r13 = (p000.qy6) r13
            p000.y7e.throwOnFailure(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            p000.y7e.throwOnFailure(r14)
            fza r14 = r10.f51741d
            jsf$b r2 = new jsf$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            r0.f51742a = r13
            r0.f51745d = r3
            java.lang.Object r14 = p000.dg1.withContext(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            my r14 = (p000.C9609my) r14
            r11 = 0
            java.lang.Float r11 = p000.wc1.boxFloat(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jsf.fling(vre, float, qy6, zy2):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f, float f2) {
        return Math.abs(xk3.calculateTargetValue(this.f51739b, 0.0f, f2)) >= Math.abs(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(vre vreVar, float f, float f2, qy6<? super Float, bth> qy6Var, zy2<? super C9609my<Float, C14294vy>> zy2Var) {
        return ksf.approach(vreVar, f, f2, isDecayApproachPossible(f, f2) ? new yk3(this.f51739b) : new pmg(this.f51740c), qy6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tryApproach(p000.vre r19, float r20, float r21, p000.qy6<? super java.lang.Float, p000.bth> r22, p000.zy2<? super p000.C12364ry<java.lang.Float, p000.C14294vy>> r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof p000.jsf.C8063d
            if (r1 == 0) goto L18
            r1 = r0
            jsf$d r1 = (p000.jsf.C8063d) r1
            int r2 = r1.f51761c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f51761c = r2
            r8 = r18
        L16:
            r7 = r1
            goto L20
        L18:
            jsf$d r1 = new jsf$d
            r8 = r18
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f51759a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r7.f51761c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            p000.y7e.throwOnFailure(r0)
            goto L73
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            p000.y7e.throwOnFailure(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            ry r0 = p000.C12827sy.AnimationState$default(r9, r10, r11, r13, r15, r16, r17)
            goto L79
        L60:
            r7.f51761c = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.runApproach(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L73
            return r1
        L73:
            my r0 = (p000.C9609my) r0
            ry r0 = r0.getCurrentAnimationState()
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jsf.tryApproach(vre, float, float, qy6, zy2):java.lang.Object");
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof jsf)) {
            return false;
        }
        jsf jsfVar = (jsf) obj;
        return md8.areEqual(jsfVar.f51740c, this.f51740c) && md8.areEqual(jsfVar.f51739b, this.f51739b) && md8.areEqual(jsfVar.f51738a, this.f51738a);
    }

    @yfb
    public final fza getMotionScaleDuration$foundation_release() {
        return this.f51741d;
    }

    public int hashCode() {
        return (((this.f51740c.hashCode() * 31) + this.f51739b.hashCode()) * 31) + this.f51738a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.kng
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object performFling(@p000.yfb p000.vre r5, float r6, @p000.yfb p000.qy6<? super java.lang.Float, p000.bth> r7, @p000.yfb p000.zy2<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p000.jsf.C8062c
            if (r0 == 0) goto L13
            r0 = r8
            jsf$c r0 = (p000.jsf.C8062c) r0
            int r1 = r0.f51758c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51758c = r1
            goto L18
        L13:
            jsf$c r0 = new jsf$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51756a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f51758c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r8)
            r0.f51758c = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            my r8 = (p000.C9609my) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            ry r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = p000.wc1.boxFloat(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jsf.performFling(vre, float, qy6, zy2):java.lang.Object");
    }

    public final void setMotionScaleDuration$foundation_release(@yfb fza fzaVar) {
        this.f51741d = fzaVar;
    }
}
