package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class m09 extends InterfaceC0701e.d implements rxe {

    /* JADX INFO: renamed from: M1 */
    public boolean f59533M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f59534V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public ny6<? extends vz8> f59535X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public j09 f59536Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public t7c f59537Z;

    /* JADX INFO: renamed from: Z1 */
    public ire f59538Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final qy6<Object, Integer> f59539a2 = new C9067b();

    /* JADX INFO: renamed from: b2 */
    @gib
    public qy6<? super Integer, Boolean> f59540b2;

    /* JADX INFO: renamed from: m09$a */
    public static final class C9066a extends tt8 implements ny6<Float> {
        public C9066a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final Float invoke() {
            return Float.valueOf(m09.this.f59536Y.getViewport() - m09.this.f59536Y.getContentPadding());
        }
    }

    /* JADX INFO: renamed from: m09$b */
    public static final class C9067b extends tt8 implements qy6<Object, Integer> {
        public C9067b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Integer invoke(@yfb Object obj) {
            vz8 vz8Var = (vz8) m09.this.f59535X.invoke();
            int itemCount = vz8Var.getItemCount();
            int i = 0;
            while (true) {
                if (i >= itemCount) {
                    i = -1;
                    break;
                }
                if (md8.areEqual(vz8Var.getKey(i), obj)) {
                    break;
                }
                i++;
            }
            return Integer.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: m09$c */
    public static final class C9068c extends tt8 implements ny6<Float> {
        public C9068c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            return Float.valueOf(m09.this.f59536Y.getScrollOffset());
        }
    }

    /* JADX INFO: renamed from: m09$d */
    public static final class C9069d extends tt8 implements ny6<Float> {
        public C9069d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            return Float.valueOf(m09.this.f59536Y.getMaxScrollOffset());
        }
    }

    /* JADX INFO: renamed from: m09$e */
    public static final class C9070e extends tt8 implements qy6<Integer, Boolean> {

        /* JADX INFO: renamed from: m09$e$a */
        @ck3(m4009c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", m4010f = "LazyLayoutSemantics.kt", m4011i = {}, m4012l = {205}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f59546a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ m09 f59547b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f59548c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m09 m09Var, int i, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f59547b = m09Var;
                this.f59548c = i;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f59547b, this.f59548c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f59546a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    j09 j09Var = this.f59547b.f59536Y;
                    int i2 = this.f59548c;
                    this.f59546a = 1;
                    if (j09Var.scrollToItem(i2, this) == coroutine_suspended) {
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

        public C9070e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final Boolean invoke(int i) {
            vz8 vz8Var = (vz8) m09.this.f59535X.invoke();
            if (i >= 0 && i < vz8Var.getItemCount()) {
                fg1.launch$default(m09.this.getCoroutineScope(), null, null, new a(m09.this, i, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + vz8Var.getItemCount() + ')').toString());
        }
    }

    public m09(@yfb ny6<? extends vz8> ny6Var, @yfb j09 j09Var, @yfb t7c t7cVar, boolean z, boolean z2) {
        this.f59535X = ny6Var;
        this.f59536Y = j09Var;
        this.f59537Z = t7cVar;
        this.f59533M1 = z;
        this.f59534V1 = z2;
        updateCachedSemanticsValues();
    }

    private final w72 getCollectionInfo() {
        return this.f59536Y.collectionInfo();
    }

    private final boolean isVertical() {
        return this.f59537Z == t7c.Vertical;
    }

    private final void updateCachedSemanticsValues() {
        this.f59538Z1 = new ire(new C9068c(), new C9069d(), this.f59534V1);
        this.f59540b2 = this.f59533M1 ? new C9070e() : null;
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        bye.setTraversalGroup(eyeVar, true);
        bye.indexForKey(eyeVar, this.f59539a2);
        if (isVertical()) {
            ire ireVar = this.f59538Z1;
            if (ireVar == null) {
                md8.throwUninitializedPropertyAccessException("scrollAxisRange");
                ireVar = null;
            }
            bye.setVerticalScrollAxisRange(eyeVar, ireVar);
        } else {
            ire ireVar2 = this.f59538Z1;
            if (ireVar2 == null) {
                md8.throwUninitializedPropertyAccessException("scrollAxisRange");
                ireVar2 = null;
            }
            bye.setHorizontalScrollAxisRange(eyeVar, ireVar2);
        }
        qy6<? super Integer, Boolean> qy6Var = this.f59540b2;
        if (qy6Var != null) {
            bye.scrollToIndex$default(eyeVar, null, qy6Var, 1, null);
        }
        bye.getScrollViewportLength$default(eyeVar, null, new C9066a(), 1, null);
        bye.setCollectionInfo(eyeVar, getCollectionInfo());
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void update(@yfb ny6<? extends vz8> ny6Var, @yfb j09 j09Var, @yfb t7c t7cVar, boolean z, boolean z2) {
        this.f59535X = ny6Var;
        this.f59536Y = j09Var;
        if (this.f59537Z != t7cVar) {
            this.f59537Z = t7cVar;
            sxe.invalidateSemantics(this);
        }
        if (this.f59533M1 == z && this.f59534V1 == z2) {
            return;
        }
        this.f59533M1 = z;
        this.f59534V1 = z2;
        updateCachedSemanticsValues();
        sxe.invalidateSemantics(this);
    }
}
