package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class ao4 extends d44 implements iv8 {

    /* JADX INFO: renamed from: a2 */
    public static final int f11426a2 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public qy6<? super ip4, bth> f11427M1;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> f11428V1;

    /* JADX INFO: renamed from: Z1 */
    public long f11429Z1 = r78.f77324b.m32092getZeroYbymL2g();

    /* JADX INFO: renamed from: ao4$a */
    @ck3(m4009c = "androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1", m4010f = "DragAndDropSource.kt", m4011i = {}, m4012l = {113}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1525a extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f11430a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f11431b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vn4 f11433d;

        /* JADX INFO: renamed from: ao4$a$a */
        public static final class a implements bo4, s2d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ s2d f11434a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vn4 f11435b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ao4 f11436c;

            public a(s2d s2dVar, vn4 vn4Var, ao4 ao4Var) {
                this.f11435b = vn4Var;
                this.f11436c = ao4Var;
                this.f11434a = s2dVar;
            }

            @Override // p000.s2d
            @gib
            public <R> Object awaitPointerEventScope(@yfb gz6<? super gn0, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
                return this.f11434a.awaitPointerEventScope(gz6Var, zy2Var);
            }

            @Override // p000.c64
            public float getDensity() {
                return this.f11434a.getDensity();
            }

            @Override // p000.s2d
            /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
            public long mo27781getExtendedTouchPaddingNHjbRc() {
                return this.f11434a.mo27781getExtendedTouchPaddingNHjbRc();
            }

            @Override // p000.dp6
            public float getFontScale() {
                return this.f11434a.getFontScale();
            }

            @Override // p000.s2d
            public boolean getInterceptOutOfBoundsChildEvents() {
                return this.f11434a.getInterceptOutOfBoundsChildEvents();
            }

            @Override // p000.s2d
            /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
            public long mo27782getSizeYbymL2g() {
                return this.f11434a.mo27782getSizeYbymL2g();
            }

            @Override // p000.s2d
            @yfb
            public u8i getViewConfiguration() {
                return this.f11434a.getViewConfiguration();
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: roundToPx--R2X_6o */
            public int mo27166roundToPxR2X_6o(long j) {
                return this.f11434a.mo27166roundToPxR2X_6o(j);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: roundToPx-0680j_4 */
            public int mo27167roundToPx0680j_4(float f) {
                return this.f11434a.mo27167roundToPx0680j_4(f);
            }

            @Override // p000.s2d
            public void setInterceptOutOfBoundsChildEvents(boolean z) {
                this.f11434a.setInterceptOutOfBoundsChildEvents(z);
            }

            @Override // p000.bo4
            public void startTransfer(@yfb eo4 eo4Var) {
                this.f11435b.mo32776drag12SF9DM(eo4Var, s78.m32288toSizeozmzZPI(mo27782getSizeYbymL2g()), this.f11436c.getDrawDragDecoration());
            }

            @Override // p000.dp6
            @f0g
            /* JADX INFO: renamed from: toDp-GaN1DYA */
            public float mo27168toDpGaN1DYA(long j) {
                return this.f11434a.mo27168toDpGaN1DYA(j);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toDp-u2uoSUM */
            public float mo27169toDpu2uoSUM(float f) {
                return this.f11434a.mo27169toDpu2uoSUM(f);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toDpSize-k-rfVVM */
            public long mo27171toDpSizekrfVVM(long j) {
                return this.f11434a.mo27171toDpSizekrfVVM(j);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toPx--R2X_6o */
            public float mo27172toPxR2X_6o(long j) {
                return this.f11434a.mo27172toPxR2X_6o(j);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toPx-0680j_4 */
            public float mo27173toPx0680j_4(float f) {
                return this.f11434a.mo27173toPx0680j_4(f);
            }

            @Override // p000.c64
            @f0g
            @yfb
            public rud toRect(@yfb on4 on4Var) {
                return this.f11434a.toRect(on4Var);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toSize-XkaWNTQ */
            public long mo27174toSizeXkaWNTQ(long j) {
                return this.f11434a.mo27174toSizeXkaWNTQ(j);
            }

            @Override // p000.dp6
            @f0g
            /* JADX INFO: renamed from: toSp-0xMU5do */
            public long mo27175toSp0xMU5do(float f) {
                return this.f11434a.mo27175toSp0xMU5do(f);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toSp-kPz2Gy4 */
            public long mo27176toSpkPz2Gy4(float f) {
                return this.f11434a.mo27176toSpkPz2Gy4(f);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toDp-u2uoSUM */
            public float mo27170toDpu2uoSUM(int i) {
                return this.f11434a.mo27170toDpu2uoSUM(i);
            }

            @Override // p000.c64
            @f0g
            /* JADX INFO: renamed from: toSp-kPz2Gy4 */
            public long mo27177toSpkPz2Gy4(int i) {
                return this.f11434a.mo27177toSpkPz2Gy4(i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1525a(vn4 vn4Var, zy2<? super C1525a> zy2Var) {
            super(2, zy2Var);
            this.f11433d = vn4Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1525a c1525a = ao4.this.new C1525a(this.f11433d, zy2Var);
            c1525a.f11431b = obj;
            return c1525a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C1525a) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f11430a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f11431b;
                gz6<bo4, zy2<? super bth>, Object> dragAndDropSourceHandler = ao4.this.getDragAndDropSourceHandler();
                a aVar = new a(s2dVar, this.f11433d, ao4.this);
                this.f11430a = 1;
                if (dragAndDropSourceHandler.invoke(aVar, this) == coroutine_suspended) {
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

    public ao4(@yfb qy6<? super ip4, bth> qy6Var, @yfb gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f11427M1 = qy6Var;
        this.f11428V1 = gz6Var;
        m8877a(vgg.SuspendingPointerInputModifierNode(new C1525a((vn4) m8877a(xn4.DragAndDropModifierNode()), null)));
    }

    @yfb
    public final gz6<bo4, zy2<? super bth>, Object> getDragAndDropSourceHandler() {
        return this.f11428V1;
    }

    @yfb
    public final qy6<ip4, bth> getDrawDragDecoration() {
        return this.f11427M1;
    }

    @Override // p000.iv8
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo27780onRemeasuredozmzZPI(long j) {
        this.f11429Z1 = j;
    }

    public final void setDragAndDropSourceHandler(@yfb gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f11428V1 = gz6Var;
    }

    public final void setDrawDragDecoration(@yfb qy6<? super ip4, bth> qy6Var) {
        this.f11427M1 = qy6Var;
    }
}
