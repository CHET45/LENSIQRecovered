package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.jvd;
import p000.shh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n1#1,317:1\n306#2,10:318\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n203#1:318,10\n*E\n"})
@e0g(parameters = 0)
public final class wn4 extends InterfaceC0701e.d implements shh, vn4 {

    /* JADX INFO: renamed from: V1 */
    @yfb
    public static final C14699a f94809V1 = new C14699a(null);

    /* JADX INFO: renamed from: Z1 */
    public static final int f94810Z1 = 8;

    /* JADX INFO: renamed from: M1 */
    @gib
    public co4 f94811M1;

    /* JADX INFO: renamed from: X */
    @yfb
    public final qy6<tn4, co4> f94812X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final Object f94813Y = C14699a.a.f94815a;

    /* JADX INFO: renamed from: Z */
    @gib
    public vn4 f94814Z;

    /* JADX INFO: renamed from: wn4$a */
    public static final class C14699a {

        /* JADX INFO: renamed from: wn4$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f94815a = new a();

            private a() {
            }
        }

        public /* synthetic */ C14699a(jt3 jt3Var) {
            this();
        }

        private C14699a() {
        }
    }

    /* JADX INFO: renamed from: wn4$b */
    @dwf({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,317:1\n42#2,7:318\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1\n*L\n161#1:318,7\n*E\n"})
    public static final class C14700b extends tt8 implements qy6<wn4, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tn4 f94816a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wn4 f94817b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8114a f94818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14700b(tn4 tn4Var, wn4 wn4Var, jvd.C8114a c8114a) {
            super(1);
            this.f94816a = tn4Var;
            this.f94817b = wn4Var;
            this.f94818c = c8114a;
        }

        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb wn4 wn4Var) {
            if (!wn4Var.isAttached()) {
                return shh.C12597a.a.SkipSubtreeAndContinueTraversal;
            }
            if (!(wn4Var.f94811M1 == null)) {
                g28.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            wn4Var.f94811M1 = (co4) wn4Var.f94812X.invoke(this.f94816a);
            boolean z = wn4Var.f94811M1 != null;
            if (z) {
                w34.requireOwner(this.f94817b).getDragAndDropManager().registerNodeInterest(wn4Var);
            }
            jvd.C8114a c8114a = this.f94818c;
            c8114a.f52103a = c8114a.f52103a || z;
            return shh.C12597a.a.ContinueTraversal;
        }
    }

    /* JADX INFO: renamed from: wn4$c */
    public static final class C14701c extends tt8 implements qy6<wn4, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tn4 f94819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14701c(tn4 tn4Var) {
            super(1);
            this.f94819a = tn4Var;
        }

        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb wn4 wn4Var) {
            if (!wn4Var.getNode().isAttached()) {
                return shh.C12597a.a.SkipSubtreeAndContinueTraversal;
            }
            co4 co4Var = wn4Var.f94811M1;
            if (co4Var != null) {
                co4Var.onEnded(this.f94819a);
            }
            wn4Var.f94811M1 = null;
            wn4Var.f94814Z = null;
            return shh.C12597a.a.ContinueTraversal;
        }
    }

    /* JADX INFO: renamed from: wn4$d */
    @dwf({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt$firstDescendantOrNull$1\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n1#1,317:1\n205#2,2:318\n*E\n"})
    public static final class C14702d extends tt8 implements qy6<wn4, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h f94820a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wn4 f94821b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tn4 f94822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14702d(jvd.C8121h c8121h, wn4 wn4Var, tn4 tn4Var) {
            super(1);
            this.f94820a = c8121h;
            this.f94821b = wn4Var;
            this.f94822c = tn4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb wn4 wn4Var) {
            wn4 wn4Var2 = wn4Var;
            if (!w34.requireOwner(this.f94821b).getDragAndDropManager().isInterestedNode(wn4Var2) || !xn4.m33235containsUv8p0NA(wn4Var2, fo4.getPositionInRoot(this.f94822c))) {
                return shh.C12597a.a.ContinueTraversal;
            }
            this.f94820a.f52110a = wn4Var;
            return shh.C12597a.a.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wn4(@yfb qy6<? super tn4, ? extends co4> qy6Var) {
        this.f94812X = qy6Var;
    }

    @Override // p000.vn4
    public boolean acceptDragAndDropTransfer(@yfb tn4 tn4Var) {
        jvd.C8114a c8114a = new jvd.C8114a();
        xn4.traverseSelfAndDescendants(this, new C14700b(tn4Var, this, c8114a));
        return c8114a.f52103a;
    }

    @Override // p000.vn4
    /* JADX INFO: renamed from: drag-12SF9DM */
    public void mo32776drag12SF9DM(@yfb eo4 eo4Var, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        w34.requireOwner(this).getDragAndDropManager().mo27752drag12SF9DM(eo4Var, j, qy6Var);
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return this.f94813Y;
    }

    @Override // p000.co4
    public void onChanged(@yfb tn4 tn4Var) {
        co4 co4Var = this.f94811M1;
        if (co4Var != null) {
            co4Var.onChanged(tn4Var);
            return;
        }
        vn4 vn4Var = this.f94814Z;
        if (vn4Var != null) {
            vn4Var.onChanged(tn4Var);
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        this.f94811M1 = null;
        this.f94814Z = null;
    }

    @Override // p000.co4
    public boolean onDrop(@yfb tn4 tn4Var) {
        vn4 vn4Var = this.f94814Z;
        if (vn4Var != null) {
            return vn4Var.onDrop(tn4Var);
        }
        co4 co4Var = this.f94811M1;
        if (co4Var != null) {
            return co4Var.onDrop(tn4Var);
        }
        return false;
    }

    @Override // p000.co4
    public void onEnded(@yfb tn4 tn4Var) {
        xn4.traverseSelfAndDescendants(this, new C14701c(tn4Var));
    }

    @Override // p000.co4
    public void onEntered(@yfb tn4 tn4Var) {
        co4 co4Var = this.f94811M1;
        if (co4Var != null) {
            co4Var.onEntered(tn4Var);
            return;
        }
        vn4 vn4Var = this.f94814Z;
        if (vn4Var != null) {
            vn4Var.onEntered(tn4Var);
        }
    }

    @Override // p000.co4
    public void onExited(@yfb tn4 tn4Var) {
        co4 co4Var = this.f94811M1;
        if (co4Var != null) {
            co4Var.onExited(tn4Var);
        }
        vn4 vn4Var = this.f94814Z;
        if (vn4Var != null) {
            vn4Var.onExited(tn4Var);
        }
        this.f94814Z = null;
    }

    @Override // p000.co4
    public void onMoved(@yfb tn4 tn4Var) {
        shh shhVar;
        vn4 vn4Var;
        vn4 vn4Var2 = this.f94814Z;
        if (vn4Var2 == null || !xn4.m33235containsUv8p0NA(vn4Var2, fo4.getPositionInRoot(tn4Var))) {
            if (getNode().isAttached()) {
                jvd.C8121h c8121h = new jvd.C8121h();
                thh.traverseDescendants(this, new C14702d(c8121h, this, tn4Var));
                shhVar = (shh) c8121h.f52110a;
            } else {
                shhVar = null;
            }
            vn4Var = (vn4) shhVar;
        } else {
            vn4Var = vn4Var2;
        }
        if (vn4Var != null && vn4Var2 == null) {
            xn4.dispatchEntered(vn4Var, tn4Var);
            co4 co4Var = this.f94811M1;
            if (co4Var != null) {
                co4Var.onExited(tn4Var);
            }
        } else if (vn4Var == null && vn4Var2 != null) {
            co4 co4Var2 = this.f94811M1;
            if (co4Var2 != null) {
                xn4.dispatchEntered(co4Var2, tn4Var);
            }
            vn4Var2.onExited(tn4Var);
        } else if (!md8.areEqual(vn4Var, vn4Var2)) {
            if (vn4Var != null) {
                xn4.dispatchEntered(vn4Var, tn4Var);
            }
            if (vn4Var2 != null) {
                vn4Var2.onExited(tn4Var);
            }
        } else if (vn4Var != null) {
            vn4Var.onMoved(tn4Var);
        } else {
            co4 co4Var3 = this.f94811M1;
            if (co4Var3 != null) {
                co4Var3.onMoved(tn4Var);
            }
        }
        this.f94814Z = vn4Var;
    }

    @Override // p000.co4
    public void onStarted(@yfb tn4 tn4Var) {
        co4 co4Var = this.f94811M1;
        if (co4Var != null) {
            co4Var.onStarted(tn4Var);
            return;
        }
        vn4 vn4Var = this.f94814Z;
        if (vn4Var != null) {
            vn4Var.onStarted(tn4Var);
        }
    }
}
