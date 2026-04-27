package p000;

import p000.jvd;
import p000.shh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,317:1\n56#2,4:318\n70#3,4:322\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n286#1:318,4\n287#1:322,4\n*E\n"})
public final class xn4 {

    /* JADX INFO: renamed from: xn4$a */
    public static final class C15207a extends tt8 implements qy6<tn4, co4> {

        /* JADX INFO: renamed from: a */
        public static final C15207a f98561a = new C15207a();

        public C15207a() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final co4 invoke(@yfb tn4 tn4Var) {
            return null;
        }
    }

    /* JADX INFO: renamed from: xn4$b */
    public static final class C15208b extends tt8 implements qy6<tn4, co4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<tn4, Boolean> f98562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ co4 f98563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15208b(qy6<? super tn4, Boolean> qy6Var, co4 co4Var) {
            super(1);
            this.f98562a = qy6Var;
            this.f98563b = co4Var;
        }

        @Override // p000.qy6
        @gib
        public final co4 invoke(@yfb tn4 tn4Var) {
            if (this.f98562a.invoke(tn4Var).booleanValue()) {
                return this.f98563b;
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: xn4$c */
    @dwf({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt$firstDescendantOrNull$1\n*L\n1#1,317:1\n*E\n"})
    public static final class C15209c<T> extends tt8 implements qy6<T, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Boolean> f98564a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<T> f98565b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15209c(qy6<? super T, Boolean> qy6Var, jvd.C8121h<T> c8121h) {
            super(1);
            this.f98564a = qy6Var;
            this.f98565b = c8121h;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lshh$a$a; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb shh shhVar) {
            if (!this.f98564a.invoke(shhVar).booleanValue()) {
                return shh.C12597a.a.ContinueTraversal;
            }
            this.f98565b.f52110a = shhVar;
            return shh.C12597a.a.CancelTraversal;
        }
    }

    @yfb
    public static final vn4 DragAndDropModifierNode() {
        return new wn4(C15207a.f98561a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m33235containsUv8p0NA(vn4 vn4Var, long j) {
        if (!vn4Var.getNode().isAttached()) {
            return false;
        }
        mv8 coordinates = w34.requireLayoutNode(vn4Var).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jMo30031getSizeYbymL2g = coordinates.mo30031getSizeYbymL2g();
        int iM32087getWidthimpl = r78.m32087getWidthimpl(jMo30031getSizeYbymL2g);
        int iM32086getHeightimpl = r78.m32086getHeightimpl(jMo30031getSizeYbymL2g);
        long jPositionInRoot = nv8.positionInRoot(coordinates);
        float fM30429getXimpl = izb.m30429getXimpl(jPositionInRoot);
        float fM30430getYimpl = izb.m30430getYimpl(jPositionInRoot);
        float f = iM32087getWidthimpl + fM30429getXimpl;
        float f2 = iM32086getHeightimpl + fM30430getYimpl;
        float fM30429getXimpl2 = izb.m30429getXimpl(j);
        if (fM30429getXimpl > fM30429getXimpl2 || fM30429getXimpl2 > f) {
            return false;
        }
        float fM30430getYimpl2 = izb.m30430getYimpl(j);
        return fM30430getYimpl <= fM30430getYimpl2 && fM30430getYimpl2 <= f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(co4 co4Var, tn4 tn4Var) {
        co4Var.onEntered(tn4Var);
        co4Var.onMoved(tn4Var);
    }

    private static final <T extends shh> T firstDescendantOrNull(T t, qy6<? super T, Boolean> qy6Var) {
        if (!t.getNode().isAttached()) {
            return null;
        }
        jvd.C8121h c8121h = new jvd.C8121h();
        thh.traverseDescendants(t, new C15209c(qy6Var, c8121h));
        return (T) c8121h.f52110a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends shh> void traverseSelfAndDescendants(T t, qy6<? super T, ? extends shh.C12597a.a> qy6Var) {
        if (qy6Var.invoke(t) != shh.C12597a.a.ContinueTraversal) {
            return;
        }
        thh.traverseDescendants(t, qy6Var);
    }

    @yfb
    public static final vn4 DragAndDropModifierNode(@yfb qy6<? super tn4, Boolean> qy6Var, @yfb co4 co4Var) {
        return new wn4(new C15208b(qy6Var, co4Var));
    }
}
