package p000;

import androidx.compose.foundation.gestures.C0608g;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class fse {

    /* JADX INFO: renamed from: k */
    public static final int f37615k = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public ase f37616a;

    /* JADX INFO: renamed from: b */
    @gib
    public w9c f37617b;

    /* JADX INFO: renamed from: c */
    @yfb
    public s36 f37618c;

    /* JADX INFO: renamed from: d */
    @yfb
    public t7c f37619d;

    /* JADX INFO: renamed from: e */
    public boolean f37620e;

    /* JADX INFO: renamed from: f */
    @yfb
    public iab f37621f;

    /* JADX INFO: renamed from: g */
    public int f37622g = oab.f66990b.m31323getUserInputWNlRxjI();

    /* JADX INFO: renamed from: h */
    @yfb
    public vre f37623h = C0608g.f4213b;

    /* JADX INFO: renamed from: i */
    @yfb
    public final C5953c f37624i = new C5953c();

    /* JADX INFO: renamed from: j */
    @yfb
    public final qy6<izb, izb> f37625j = new C5955e();

    /* JADX INFO: renamed from: fse$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollingLogic", m4010f = "Scrollable.kt", m4011i = {0}, m4012l = {769}, m4013m = "doFlingAnimation-QWom1Mo", m4014n = {"result"}, m4015s = {"L$0"})
    public static final class C5951a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f37626a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f37627b;

        /* JADX INFO: renamed from: d */
        public int f37629d;

        public C5951a(zy2<? super C5951a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f37627b = obj;
            this.f37629d |= Integer.MIN_VALUE;
            return fse.this.m29649doFlingAnimationQWom1Mo(0L, this);
        }
    }

    /* JADX INFO: renamed from: fse$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m4010f = "Scrollable.kt", m4011i = {}, m4012l = {782}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5952b extends ugg implements gz6<nab, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ long f37630C;

        /* JADX INFO: renamed from: a */
        public Object f37631a;

        /* JADX INFO: renamed from: b */
        public Object f37632b;

        /* JADX INFO: renamed from: c */
        public long f37633c;

        /* JADX INFO: renamed from: d */
        public int f37634d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f37635e;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ jvd.C8120g f37637m;

        /* JADX INFO: renamed from: fse$b$a */
        public static final class a implements vre {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fse f37638a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ nab f37639b;

            public a(fse fseVar, nab nabVar) {
                this.f37638a = fseVar;
                this.f37639b = nabVar;
            }

            @Override // p000.vre
            public float scrollBy(float f) {
                fse fseVar = this.f37638a;
                return fseVar.reverseIfNeeded(fseVar.m29654toFloatk4lQ0M(this.f37639b.mo29657scrollByWithOverscrollOzD1aCk(fseVar.m29652reverseIfNeededMKHz9U(fseVar.m29655toOffsettuRUvjQ(f)), oab.f66990b.m31322getSideEffectWNlRxjI())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5952b(jvd.C8120g c8120g, long j, zy2<? super C5952b> zy2Var) {
            super(2, zy2Var);
            this.f37637m = c8120g;
            this.f37630C = j;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5952b c5952b = fse.this.new C5952b(this.f37637m, this.f37630C, zy2Var);
            c5952b.f37635e = obj;
            return c5952b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb nab nabVar, @gib zy2<? super bth> zy2Var) {
            return ((C5952b) create(nabVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            fse fseVar;
            jvd.C8120g c8120g;
            fse fseVar2;
            long j;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37634d;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a(fse.this, (nab) this.f37635e);
                fseVar = fse.this;
                jvd.C8120g c8120g2 = this.f37637m;
                long j2 = this.f37630C;
                s36 s36Var = fseVar.f37618c;
                long j3 = c8120g2.f52109a;
                float fReverseIfNeeded = fseVar.reverseIfNeeded(fseVar.m29647toFloatTH1AsA0(j2));
                this.f37635e = fseVar;
                this.f37631a = fseVar;
                this.f37632b = c8120g2;
                this.f37633c = j3;
                this.f37634d = 1;
                Object objPerformFling = s36Var.performFling(aVar, fReverseIfNeeded, this);
                if (objPerformFling == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8120g = c8120g2;
                obj = objPerformFling;
                fseVar2 = fseVar;
                j = j3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.f37633c;
                c8120g = (jvd.C8120g) this.f37632b;
                fseVar = (fse) this.f37631a;
                fseVar2 = (fse) this.f37635e;
                y7e.throwOnFailure(obj);
            }
            c8120g.f52109a = fseVar.m29648updateQWom1Mo(j, fseVar2.reverseIfNeeded(((Number) obj).floatValue()));
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: fse$c */
    public static final class C5953c implements nab {
        public C5953c() {
        }

        @Override // p000.nab
        /* JADX INFO: renamed from: scrollBy-OzD1aCk, reason: not valid java name */
        public long mo29656scrollByOzD1aCk(long j, int i) {
            return fse.this.m29645performScroll3eAAhYA(fse.this.f37623h, j, i);
        }

        @Override // p000.nab
        /* JADX INFO: renamed from: scrollByWithOverscroll-OzD1aCk, reason: not valid java name */
        public long mo29657scrollByWithOverscrollOzD1aCk(long j, int i) {
            fse.this.f37622g = i;
            w9c w9cVar = fse.this.f37617b;
            if (w9cVar != null && fse.this.getShouldDispatchOverscroll()) {
                return w9cVar.mo28852applyToScrollRhakbz0(j, fse.this.f37622g, fse.this.f37625j);
            }
            return fse.this.m29645performScroll3eAAhYA(fse.this.f37623h, j, i);
        }
    }

    /* JADX INFO: renamed from: fse$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m4010f = "Scrollable.kt", m4011i = {0, 1, 1, 2, 2}, m4012l = {745, 748, 751}, m4013m = "invokeSuspend", m4014n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m4015s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    public static final class C5954d extends ugg implements gz6<i4i, zy2<? super i4i>, Object> {

        /* JADX INFO: renamed from: a */
        public long f37641a;

        /* JADX INFO: renamed from: b */
        public int f37642b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f37643c;

        public C5954d(zy2<? super C5954d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5954d c5954d = fse.this.new C5954d(zy2Var);
            c5954d.f37643c = ((i4i) obj).m30166unboximpl();
            return c5954d;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(i4i i4iVar, zy2<? super i4i> zy2Var) {
            return m29658invokesFctU(i4iVar.m30166unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m29658invokesFctU(long j, @gib zy2<? super i4i> zy2Var) {
            return ((C5954d) create(i4i.m30148boximpl(j), zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r0 = r13.f37642b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1c
                long r0 = r13.f37641a
                long r2 = r13.f37643c
                p000.y7e.throwOnFailure(r14)
                r9 = r0
                r0 = r14
                goto L89
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                long r2 = r13.f37641a
                long r4 = r13.f37643c
                p000.y7e.throwOnFailure(r14)
                r0 = r14
                r7 = r4
                goto L68
            L2e:
                long r3 = r13.f37643c
                p000.y7e.throwOnFailure(r14)
                r0 = r14
                goto L4c
            L35:
                p000.y7e.throwOnFailure(r14)
                long r4 = r13.f37643c
                fse r0 = p000.fse.this
                iab r0 = p000.fse.access$getNestedScrollDispatcher$p(r0)
                r13.f37643c = r4
                r13.f37642b = r3
                java.lang.Object r0 = r0.m30179dispatchPreFlingQWom1Mo(r4, r13)
                if (r0 != r6) goto L4b
                return r6
            L4b:
                r3 = r4
            L4c:
                i4i r0 = (p000.i4i) r0
                long r7 = r0.m30166unboximpl()
                long r7 = p000.i4i.m30160minusAH228Gc(r3, r7)
                fse r0 = p000.fse.this
                r13.f37643c = r3
                r13.f37641a = r7
                r13.f37642b = r2
                java.lang.Object r0 = r0.m29649doFlingAnimationQWom1Mo(r7, r13)
                if (r0 != r6) goto L65
                return r6
            L65:
                r11 = r3
                r2 = r7
                r7 = r11
            L68:
                i4i r0 = (p000.i4i) r0
                long r9 = r0.m30166unboximpl()
                fse r0 = p000.fse.this
                iab r0 = p000.fse.access$getNestedScrollDispatcher$p(r0)
                long r2 = p000.i4i.m30160minusAH228Gc(r2, r9)
                r13.f37643c = r7
                r13.f37641a = r9
                r13.f37642b = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.m30177dispatchPostFlingRZ2iAVY(r1, r3, r5)
                if (r0 != r6) goto L88
                return r6
            L88:
                r2 = r7
            L89:
                i4i r0 = (p000.i4i) r0
                long r0 = r0.m30166unboximpl()
                long r0 = p000.i4i.m30160minusAH228Gc(r9, r0)
                long r0 = p000.i4i.m30160minusAH228Gc(r2, r0)
                i4i r0 = p000.i4i.m30148boximpl(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fse.C5954d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fse$e */
    public static final class C5955e extends tt8 implements qy6<izb, izb> {
        public C5955e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ izb invoke(izb izbVar) {
            return izb.m30418boximpl(m29659invokeMKHz9U(izbVar.m30439unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m29659invokeMKHz9U(long j) {
            vre vreVar = fse.this.f37623h;
            fse fseVar = fse.this;
            return fseVar.m29645performScroll3eAAhYA(vreVar, j, fseVar.f37622g);
        }
    }

    /* JADX INFO: renamed from: fse$f */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m4010f = "Scrollable.kt", m4011i = {}, m4012l = {804}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5956f extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f37646a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f37647b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<nab, zy2<? super bth>, Object> f37649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5956f(gz6<? super nab, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C5956f> zy2Var) {
            super(2, zy2Var);
            this.f37649d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5956f c5956f = fse.this.new C5956f(this.f37649d, zy2Var);
            c5956f.f37647b = obj;
            return c5956f;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C5956f) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37646a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                fse.this.f37623h = (vre) this.f37647b;
                gz6<nab, zy2<? super bth>, Object> gz6Var = this.f37649d;
                C5953c c5953c = fse.this.f37624i;
                this.f37646a = 1;
                if (gz6Var.invoke(c5953c, this) == coroutine_suspended) {
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

    public fse(@yfb ase aseVar, @gib w9c w9cVar, @yfb s36 s36Var, @yfb t7c t7cVar, boolean z, @yfb iab iabVar) {
        this.f37616a = aseVar;
        this.f37617b = w9cVar;
        this.f37618c = s36Var;
        this.f37619d = t7cVar;
        this.f37620e = z;
        this.f37621f = iabVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.f37616a.getCanScrollForward() || this.f37616a.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m29645performScroll3eAAhYA(vre vreVar, long j, int i) {
        long jM30180dispatchPreScrollOzD1aCk = this.f37621f.m30180dispatchPreScrollOzD1aCk(j, i);
        long jM30433minusMKHz9U = izb.m30433minusMKHz9U(j, jM30180dispatchPreScrollOzD1aCk);
        long jM29652reverseIfNeededMKHz9U = m29652reverseIfNeededMKHz9U(m29655toOffsettuRUvjQ(vreVar.scrollBy(m29654toFloatk4lQ0M(m29652reverseIfNeededMKHz9U(m29653singleAxisOffsetMKHz9U(jM30433minusMKHz9U))))));
        return izb.m30434plusMKHz9U(izb.m30434plusMKHz9U(jM30180dispatchPreScrollOzD1aCk, jM29652reverseIfNeededMKHz9U), this.f37621f.m30178dispatchPostScrollDzOQY0M(jM29652reverseIfNeededMKHz9U, izb.m30433minusMKHz9U(jM30433minusMKHz9U, jM29652reverseIfNeededMKHz9U), i));
    }

    public static /* synthetic */ Object scroll$default(fse fseVar, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return fseVar.scroll(j7bVar, gz6Var, zy2Var);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m29646singleAxisVelocityAH228Gc(long j) {
        return this.f37619d == t7c.Horizontal ? i4i.m30153copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : i4i.m30153copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m29647toFloatTH1AsA0(long j) {
        return this.f37619d == t7c.Horizontal ? i4i.m30157getXimpl(j) : i4i.m30158getYimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m29648updateQWom1Mo(long j, float f) {
        return this.f37619d == t7c.Horizontal ? i4i.m30153copyOhffZ5M$default(j, f, 0.0f, 2, null) : i4i.m30153copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m29649doFlingAnimationQWom1Mo(long r12, @p000.yfb p000.zy2<? super p000.i4i> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p000.fse.C5951a
            if (r0 == 0) goto L13
            r0 = r14
            fse$a r0 = (p000.fse.C5951a) r0
            int r1 = r0.f37629d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37629d = r1
            goto L18
        L13:
            fse$a r0 = new fse$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f37627b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37629d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f37626a
            jvd$g r12 = (p000.jvd.C8120g) r12
            p000.y7e.throwOnFailure(r14)
            goto L57
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p000.y7e.throwOnFailure(r14)
            jvd$g r14 = new jvd$g
            r14.<init>()
            r14.f52109a = r12
            j7b r2 = p000.j7b.Default
            fse$b r10 = new fse$b
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r6, r7, r9)
            r0.f37626a = r14
            r0.f37629d = r3
            java.lang.Object r12 = r11.scroll(r2, r10, r0)
            if (r12 != r1) goto L56
            return r1
        L56:
            r12 = r14
        L57:
            long r12 = r12.f52109a
            i4i r12 = p000.i4i.m30148boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fse.m29649doFlingAnimationQWom1Mo(long, zy2):java.lang.Object");
    }

    public final boolean isVertical() {
        return this.f37619d == t7c.Vertical;
    }

    @gib
    /* JADX INFO: renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    public final Object m29650onDragStoppedsFctU(long j, @yfb zy2<? super bth> zy2Var) {
        long jM29646singleAxisVelocityAH228Gc = m29646singleAxisVelocityAH228Gc(j);
        C5954d c5954d = new C5954d(null);
        w9c w9cVar = this.f37617b;
        if (w9cVar == null || !getShouldDispatchOverscroll()) {
            Object objInvoke = c5954d.invoke(i4i.m30148boximpl(jM29646singleAxisVelocityAH228Gc), zy2Var);
            return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
        }
        Object objMo28851applyToFlingBMRW4eQ = w9cVar.mo28851applyToFlingBMRW4eQ(jM29646singleAxisVelocityAH228Gc, c5954d, zy2Var);
        return objMo28851applyToFlingBMRW4eQ == pd8.getCOROUTINE_SUSPENDED() ? objMo28851applyToFlingBMRW4eQ : bth.f14751a;
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m29651performRawScrollMKHz9U(long j) {
        return this.f37616a.isScrollInProgress() ? izb.f49009b.m30445getZeroF1C5BW0() : m29655toOffsettuRUvjQ(reverseIfNeeded(this.f37616a.dispatchRawDelta(reverseIfNeeded(m29654toFloatk4lQ0M(j)))));
    }

    public final float reverseIfNeeded(float f) {
        return this.f37620e ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m29652reverseIfNeededMKHz9U(long j) {
        return this.f37620e ? izb.m30436timestuRUvjQ(j, -1.0f) : j;
    }

    @gib
    public final Object scroll(@yfb j7b j7bVar, @yfb gz6<? super nab, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objScroll = this.f37616a.scroll(j7bVar, new C5956f(gz6Var, null), zy2Var);
        return objScroll == pd8.getCOROUTINE_SUSPENDED() ? objScroll : bth.f14751a;
    }

    public final boolean shouldScrollImmediately() {
        if (!this.f37616a.isScrollInProgress()) {
            w9c w9cVar = this.f37617b;
            if (!(w9cVar != null ? w9cVar.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m29653singleAxisOffsetMKHz9U(long j) {
        return this.f37619d == t7c.Horizontal ? izb.m30423copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : izb.m30423copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m29654toFloatk4lQ0M(long j) {
        return this.f37619d == t7c.Horizontal ? izb.m30429getXimpl(j) : izb.m30430getYimpl(j);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m29655toOffsettuRUvjQ(float f) {
        return f == 0.0f ? izb.f49009b.m30445getZeroF1C5BW0() : this.f37619d == t7c.Horizontal ? mzb.Offset(f, 0.0f) : mzb.Offset(0.0f, f);
    }

    public final boolean update(@yfb ase aseVar, @yfb t7c t7cVar, @gib w9c w9cVar, boolean z, @yfb s36 s36Var, @yfb iab iabVar) {
        boolean z2;
        boolean z3 = true;
        if (md8.areEqual(this.f37616a, aseVar)) {
            z2 = false;
        } else {
            this.f37616a = aseVar;
            z2 = true;
        }
        this.f37617b = w9cVar;
        if (this.f37619d != t7cVar) {
            this.f37619d = t7cVar;
            z2 = true;
        }
        if (this.f37620e != z) {
            this.f37620e = z;
        } else {
            z3 = z2;
        }
        this.f37618c = s36Var;
        this.f37621f = iabVar;
        return z3;
    }
}
