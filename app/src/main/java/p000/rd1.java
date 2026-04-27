package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rd1 {

    /* JADX INFO: renamed from: rd1$a */
    public static final class C12022a implements kd1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v34 f77850a;

        public C12022a(v34 v34Var) {
            this.f77850a = v34Var;
        }

        @Override // p000.kd1
        @gib
        public final Object bringChildIntoView(@yfb mv8 mv8Var, @yfb ny6<rud> ny6Var, @yfb zy2<? super bth> zy2Var) {
            View viewRequireView = x34.requireView(this.f77850a);
            long jPositionInRoot = nv8.positionInRoot(mv8Var);
            rud rudVarInvoke = ny6Var.invoke();
            rud rudVarM32210translatek4lQ0M = rudVarInvoke != null ? rudVarInvoke.m32210translatek4lQ0M(jPositionInRoot) : null;
            if (rudVarM32210translatek4lQ0M != null) {
                viewRequireView.requestRectangleOnScreen(rd1.toRect(rudVarM32210translatek4lQ0M), false);
            }
            return bth.f14751a;
        }
    }

    @yfb
    public static final kd1 defaultBringIntoViewParent(@yfb v34 v34Var) {
        return new C12022a(v34Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect toRect(rud rudVar) {
        return new Rect((int) rudVar.getLeft(), (int) rudVar.getTop(), (int) rudVar.getRight(), (int) rudVar.getBottom());
    }
}
