package p000;

import android.view.View;
import androidx.lifecycle.viewmodel.C1167R;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "ViewTreeViewModelStoreOwner")
public final class bci {

    /* JADX INFO: renamed from: bci$a */
    public static final class C1835a extends tt8 implements qy6<View, View> {

        /* JADX INFO: renamed from: a */
        public static final C1835a f13370a = new C1835a();

        public C1835a() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final View invoke(@yfb View view) {
            md8.checkNotNullParameter(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: bci$b */
    public static final class C1836b extends tt8 implements qy6<View, nai> {

        /* JADX INFO: renamed from: a */
        public static final C1836b f13371a = new C1836b();

        public C1836b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final nai invoke(@yfb View view) {
            md8.checkNotNullParameter(view, "view");
            Object tag = view.getTag(C1167R.id.view_tree_view_model_store_owner);
            if (tag instanceof nai) {
                return (nai) tag;
            }
            return null;
        }
    }

    @gib
    @xn8(name = "get")
    public static final nai get(@yfb View view) {
        md8.checkNotNullParameter(view, "<this>");
        return (nai) vze.firstOrNull(vze.mapNotNull(ize.generateSequence(view, C1835a.f13370a), C1836b.f13371a));
    }

    @xn8(name = "set")
    public static final void set(@yfb View view, @gib nai naiVar) {
        md8.checkNotNullParameter(view, "<this>");
        view.setTag(C1167R.id.view_tree_view_model_store_owner, naiVar);
    }
}
