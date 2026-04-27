package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d9i {

    /* JADX INFO: renamed from: d9i$a */
    public static final class C4677a implements vye<View> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f28843a;

        public C4677a(ViewGroup viewGroup) {
            this.f28843a = viewGroup;
        }

        @Override // p000.vye
        @yfb
        public Iterator<View> iterator() {
            return d9i.iterator(this.f28843a);
        }
    }

    /* JADX INFO: renamed from: d9i$b */
    public static final class C4678b extends tt8 implements qy6<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: a */
        public static final C4678b f28844a = new C4678b();

        public C4678b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Iterator<View> invoke(@yfb View view) {
            vye<View> children;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (children = d9i.getChildren(viewGroup)) == null) {
                return null;
            }
            return children.iterator();
        }
    }

    /* JADX INFO: renamed from: d9i$c */
    public static final class C4679c implements Iterator<View>, xo8 {

        /* JADX INFO: renamed from: a */
        public int f28845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f28846b;

        public C4679c(ViewGroup viewGroup) {
            this.f28846b = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28845a < this.f28846b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f28846b;
            int i = this.f28845a - 1;
            this.f28845a = i;
            viewGroup.removeViewAt(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @yfb
        public View next() {
            ViewGroup viewGroup = this.f28846b;
            int i = this.f28845a;
            this.f28845a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: d9i$d */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"})
    public static final class C4680d implements vye<View> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f28847a;

        public C4680d(ViewGroup viewGroup) {
            this.f28847a = viewGroup;
        }

        @Override // p000.vye
        @yfb
        public Iterator<View> iterator() {
            return new zhh(d9i.getChildren(this.f28847a).iterator(), C4678b.f28844a);
        }
    }

    public static final boolean contains(@yfb ViewGroup viewGroup, @yfb View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(@yfb ViewGroup viewGroup, @yfb qy6<? super View, bth> qy6Var) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            qy6Var.invoke(viewGroup.getChildAt(i));
        }
    }

    public static final void forEachIndexed(@yfb ViewGroup viewGroup, @yfb gz6<? super Integer, ? super View, bth> gz6Var) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            gz6Var.invoke(Integer.valueOf(i), viewGroup.getChildAt(i));
        }
    }

    @yfb
    public static final View get(@yfb ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    @yfb
    public static final vye<View> getChildren(@yfb ViewGroup viewGroup) {
        return new C4677a(viewGroup);
    }

    @yfb
    public static final vye<View> getDescendants(@yfb ViewGroup viewGroup) {
        return new C4680d(viewGroup);
    }

    @yfb
    public static final f78 getIndices(@yfb ViewGroup viewGroup) {
        return kpd.until(0, viewGroup.getChildCount());
    }

    public static final int getSize(@yfb ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(@yfb ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(@yfb ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @yfb
    public static final Iterator<View> iterator(@yfb ViewGroup viewGroup) {
        return new C4679c(viewGroup);
    }

    public static final void minusAssign(@yfb ViewGroup viewGroup, @yfb View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(@yfb ViewGroup viewGroup, @yfb View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(@yfb ViewGroup.MarginLayoutParams marginLayoutParams, @fkd int i) {
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(@yfb ViewGroup.MarginLayoutParams marginLayoutParams, @fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void updateMarginsRelative(@yfb ViewGroup.MarginLayoutParams marginLayoutParams, @fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
