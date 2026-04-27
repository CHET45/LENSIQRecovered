package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,97:1\n1#2:98\n728#3,2:99\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n67#1:99,2\n*E\n"})
@e0g(parameters = 0)
public abstract class yud extends InterfaceC0701e.d implements o77 {

    /* JADX INFO: renamed from: Z */
    public static final int f103002Z = 8;

    /* JADX INFO: renamed from: X */
    @gib
    public qy6<? super mv8, rud> f103003X;

    /* JADX INFO: renamed from: Y */
    @gib
    public Rect f103004Y;

    public yud(@gib qy6<? super mv8, rud> qy6Var) {
        this.f103003X = qy6Var;
    }

    private final Rect calcBounds(mv8 mv8Var, rud rudVar) {
        mv8 mv8VarFindRootCoordinates = nv8.findRootCoordinates(mv8Var);
        long jMo30034localPositionOfR5De75A = mv8VarFindRootCoordinates.mo30034localPositionOfR5De75A(mv8Var, rudVar.m32208getTopLeftF1C5BW0());
        long jMo30034localPositionOfR5De75A2 = mv8VarFindRootCoordinates.mo30034localPositionOfR5De75A(mv8Var, rudVar.m32209getTopRightF1C5BW0());
        long jMo30034localPositionOfR5De75A3 = mv8VarFindRootCoordinates.mo30034localPositionOfR5De75A(mv8Var, rudVar.m32201getBottomLeftF1C5BW0());
        long jMo30034localPositionOfR5De75A4 = mv8VarFindRootCoordinates.mo30034localPositionOfR5De75A(mv8Var, rudVar.m32202getBottomRightF1C5BW0());
        return new Rect(p3a.roundToInt(nd2.minOf(izb.m30429getXimpl(jMo30034localPositionOfR5De75A), izb.m30429getXimpl(jMo30034localPositionOfR5De75A2), izb.m30429getXimpl(jMo30034localPositionOfR5De75A3), izb.m30429getXimpl(jMo30034localPositionOfR5De75A4))), p3a.roundToInt(nd2.minOf(izb.m30430getYimpl(jMo30034localPositionOfR5De75A), izb.m30430getYimpl(jMo30034localPositionOfR5De75A2), izb.m30430getYimpl(jMo30034localPositionOfR5De75A3), izb.m30430getYimpl(jMo30034localPositionOfR5De75A4))), p3a.roundToInt(nd2.maxOf(izb.m30429getXimpl(jMo30034localPositionOfR5De75A), izb.m30429getXimpl(jMo30034localPositionOfR5De75A2), izb.m30429getXimpl(jMo30034localPositionOfR5De75A3), izb.m30429getXimpl(jMo30034localPositionOfR5De75A4))), p3a.roundToInt(nd2.maxOf(izb.m30430getYimpl(jMo30034localPositionOfR5De75A), izb.m30430getYimpl(jMo30034localPositionOfR5De75A2), izb.m30430getYimpl(jMo30034localPositionOfR5De75A3), izb.m30430getYimpl(jMo30034localPositionOfR5De75A4))));
    }

    private final void replaceRect(Rect rect) {
        f7b<Rect> f7bVarCurrentRects = currentRects();
        Rect rect2 = this.f103004Y;
        if (rect2 != null) {
            f7bVarCurrentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            f7bVarCurrentRects.add(rect);
        }
        updateRects(f7bVarCurrentRects);
        this.f103004Y = rect;
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final View m26356a() {
        return x34.requireView(this);
    }

    @yfb
    public abstract f7b<Rect> currentRects();

    @gib
    public qy6<mv8, rud> getRect() {
        return this.f103003X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            rud rudVarBoundsInRoot = nv8.boundsInRoot(mv8Var);
            rectCalcBounds = new Rect(p3a.roundToInt(rudVarBoundsInRoot.getLeft()), p3a.roundToInt(rudVarBoundsInRoot.getTop()), p3a.roundToInt(rudVarBoundsInRoot.getRight()), p3a.roundToInt(rudVarBoundsInRoot.getBottom()));
        } else {
            qy6<mv8, rud> rect = getRect();
            md8.checkNotNull(rect);
            rectCalcBounds = calcBounds(mv8Var, rect.invoke(mv8Var));
        }
        replaceRect(rectCalcBounds);
    }

    public void setRect(@gib qy6<? super mv8, rud> qy6Var) {
        this.f103003X = qy6Var;
    }

    public abstract void updateRects(@yfb f7b<Rect> f7bVar);
}
