package p000;

import android.view.View;
import androidx.lifecycle.runtime.C1160R;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "ViewTreeLifecycleOwner")
public final class zbi {

    /* JADX INFO: renamed from: zbi$a */
    public static final class C16082a extends tt8 implements qy6<View, View> {

        /* JADX INFO: renamed from: a */
        public static final C16082a f104741a = new C16082a();

        public C16082a() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final View invoke(@yfb View view) {
            md8.checkNotNullParameter(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: zbi$b */
    public static final class C16083b extends tt8 implements qy6<View, g59> {

        /* JADX INFO: renamed from: a */
        public static final C16083b f104742a = new C16083b();

        public C16083b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final g59 invoke(@yfb View view) {
            md8.checkNotNullParameter(view, "viewParent");
            Object tag = view.getTag(C1160R.id.view_tree_lifecycle_owner);
            if (tag instanceof g59) {
                return (g59) tag;
            }
            return null;
        }
    }

    @gib
    @xn8(name = "get")
    public static final g59 get(@yfb View view) {
        md8.checkNotNullParameter(view, "<this>");
        return (g59) vze.firstOrNull(vze.mapNotNull(ize.generateSequence(view, C16082a.f104741a), C16083b.f104742a));
    }

    @xn8(name = "set")
    public static final void set(@yfb View view, @gib g59 g59Var) {
        md8.checkNotNullParameter(view, "<this>");
        view.setTag(C1160R.id.view_tree_lifecycle_owner, g59Var);
    }
}
