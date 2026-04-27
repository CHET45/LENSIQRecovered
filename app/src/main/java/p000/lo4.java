package p000;

import androidx.compose.p002ui.draw.C0699a;

/* JADX INFO: loaded from: classes.dex */
@ah5
public final class lo4 extends d44 {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> f58353M1;

    /* JADX INFO: renamed from: lo4$a */
    public static final class C8915a extends tt8 implements qy6<ip4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ul1 f58354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8915a(ul1 ul1Var) {
            super(1);
            this.f58354a = ul1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            this.f58354a.drawDragShadow(ip4Var);
        }
    }

    /* JADX INFO: renamed from: lo4$b */
    @ck3(m4009c = "androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2", m4010f = "AndroidDragAndDropSource.android.kt", m4011i = {}, m4012l = {101}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8916b extends ugg implements gz6<bo4, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f58355a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f58356b;

        public C8916b(zy2<? super C8916b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C8916b c8916b = lo4.this.new C8916b(zy2Var);
            c8916b.f58356b = obj;
            return c8916b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb bo4 bo4Var, @gib zy2<? super bth> zy2Var) {
            return ((C8916b) create(bo4Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f58355a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                bo4 bo4Var = (bo4) this.f58356b;
                gz6<bo4, zy2<? super bth>, Object> dragAndDropSourceHandler = lo4.this.getDragAndDropSourceHandler();
                this.f58355a = 1;
                if (dragAndDropSourceHandler.invoke(bo4Var, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: lo4$c */
    public /* synthetic */ class C8917c extends n07 implements qy6<tl1, hp4> {
        public C8917c(Object obj) {
            super(1, obj, ul1.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
        }

        @Override // p000.qy6
        @yfb
        public final hp4 invoke(@yfb tl1 tl1Var) {
            return ((ul1) this.receiver).cachePicture(tl1Var);
        }
    }

    public lo4(@yfb gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f58353M1 = gz6Var;
        ul1 ul1Var = new ul1();
        m8877a(C0699a.CacheDrawModifierNode(new C8917c(ul1Var)));
        m8877a(new ao4(new C8915a(ul1Var), new C8916b(null)));
    }

    @yfb
    public final gz6<bo4, zy2<? super bth>, Object> getDragAndDropSourceHandler() {
        return this.f58353M1;
    }

    public final void setDragAndDropSourceHandler(@yfb gz6<? super bo4, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f58353M1 = gz6Var;
    }
}
