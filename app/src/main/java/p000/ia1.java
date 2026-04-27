package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.ItemsParams;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ia1 extends RecyclerView implements sg8 {

    /* JADX INFO: renamed from: a */
    public DialogParams f46157a;

    /* JADX INFO: renamed from: b */
    public ItemsParams f46158b;

    /* JADX INFO: renamed from: c */
    public RecyclerView.Adapter f46159c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.LayoutManager f46160d;

    /* JADX INFO: renamed from: ia1$a */
    public class C7199a extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f46161a;

        public C7199a(GridLayoutManager gridLayoutManager) {
            this.f46161a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            int itemCount = ia1.this.f46159c.getItemCount();
            int spanCount = this.f46161a.getSpanCount();
            int i2 = itemCount % spanCount;
            if (i2 == 0 || i < itemCount - 1) {
                return 1;
            }
            return (spanCount - i2) + 1;
        }
    }

    /* JADX INFO: renamed from: ia1$b */
    public static class C7200b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a */
        public Drawable f46163a;

        /* JADX INFO: renamed from: b */
        public int f46164b;

        public C7200b(Drawable drawable, int i) {
            this.f46163a = drawable;
            this.f46164b = i;
        }

        private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i2 = this.f46164b;
                this.f46163a.setBounds(left, bottom, right + i2, i2 + bottom);
                this.f46163a.draw(canvas);
            }
        }

        private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
            int childCount = recyclerView.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                this.f46163a.setBounds(right, childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, this.f46164b + right, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                this.f46163a.draw(canvas);
            }
        }

        private static int getSpanCount(RecyclerView recyclerView) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            return layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).getSpanCount() : layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : layoutManager.getItemCount();
        }

        private static boolean isLastColumn(RecyclerView recyclerView, int i, int i2, int i3) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                return (i + 1) % i2 == 0;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? (i + 1) % i2 == 0 : i >= i3 - (i3 % i2);
            }
            return false;
        }

        private static boolean isLastRaw(RecyclerView recyclerView, int i, int i2, int i3) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                return i >= i3 - (i3 % i2);
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? i >= i3 - (i3 % i2) : (i + 1) % i2 == 0;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            int spanCount = getSpanCount(recyclerView);
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (isLastRaw(recyclerView, i, spanCount, itemCount)) {
                rect.set(0, 0, this.f46164b, 0);
            } else if (isLastColumn(recyclerView, i, spanCount, itemCount)) {
                rect.set(0, 0, 0, this.f46164b);
            } else {
                int i2 = this.f46164b;
                rect.set(0, 0, i2, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            drawHorizontal(canvas, recyclerView);
            drawVertical(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: ia1$c */
    public static class C7201c extends GridLayoutManager {
        public C7201c(Context context, GridLayoutManager gridLayoutManager) {
            super(context, gridLayoutManager.getSpanCount(), gridLayoutManager.getOrientation(), gridLayoutManager.getReverseLayout());
        }
    }

    /* JADX INFO: renamed from: ia1$d */
    public static class C7202d<T> extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a */
        public o4c f46165a;

        /* JADX INFO: renamed from: b */
        public Context f46166b;

        /* JADX INFO: renamed from: c */
        public List<T> f46167c;

        /* JADX INFO: renamed from: d */
        public ItemsParams f46168d;

        /* JADX INFO: renamed from: e */
        public int f46169e;

        /* JADX INFO: renamed from: f */
        public RecyclerView.LayoutManager f46170f;

        /* JADX INFO: renamed from: ia1$d$a */
        public static class a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public o4c f46171a;

            /* JADX INFO: renamed from: b */
            public TextView f46172b;

            public a(TextView textView, o4c o4cVar) {
                super(textView);
                this.f46172b = textView;
                this.f46171a = o4cVar;
                textView.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o4c o4cVar = this.f46171a;
                if (o4cVar != null) {
                    o4cVar.onItemClick(view, getAdapterPosition());
                }
            }
        }

        public C7202d(Context context, ItemsParams itemsParams, DialogParams dialogParams, RecyclerView.LayoutManager layoutManager) {
            this.f46166b = context;
            this.f46168d = itemsParams;
            this.f46170f = layoutManager;
            int i = itemsParams.f24335C;
            this.f46169e = i == 0 ? dialogParams.f24302Q : i;
            Object obj = itemsParams.f24344a;
            if (obj != null && (obj instanceof Iterable)) {
                this.f46167c = (List) obj;
            } else {
                if (obj == null || !obj.getClass().isArray()) {
                    throw new IllegalArgumentException("entity must be an Array or an Iterable.");
                }
                this.f46167c = Arrays.asList((Object[]) obj);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<T> list = this.f46167c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void setOnItemClickListener(o4c o4cVar) {
            this.f46165a = o4cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(a aVar, int i) {
            aVar.f46172b.setBackground(new b02(0, this.f46169e));
            T t = this.f46167c.get(i);
            aVar.f46172b.setText(String.valueOf(t instanceof d02 ? ((d02) t).getItemLabel() : t.toString()));
            e02 e02Var = this.f46168d.f24343Y;
            if (e02Var != null) {
                e02Var.onBinder(aVar.f46172b, t, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(this.f46166b);
            textView.setGravity(17);
            RecyclerView.LayoutManager layoutManager = this.f46170f;
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                    textView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                    if (this.f46168d.f24347d != null) {
                        textView.setPadding(C3860a.dp2px(this.f46166b, r9[0]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[1]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[2]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[3]));
                    } else {
                        textView.setPadding(10, 0, 10, 0);
                    }
                } else {
                    if (this.f46168d.f24347d != null) {
                        textView.setPadding(C3860a.dp2px(this.f46166b, r9[0]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[1]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[2]), C3860a.dp2px(this.f46166b, this.f46168d.f24347d[3]));
                    }
                    textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                }
            } else if ((layoutManager instanceof StaggeredGridLayoutManager) || (layoutManager instanceof GridLayoutManager)) {
                textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                textView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
            }
            textView.setTextSize(this.f46168d.f24350m);
            textView.setTextColor(this.f46168d.f24349f);
            int i2 = this.f46168d.f24342X;
            if (i2 != 0) {
                textView.setGravity(i2);
            }
            textView.setHeight(C3860a.dp2px(this.f46166b, this.f46168d.f24345b));
            return new a(textView, this.f46165a);
        }
    }

    /* JADX INFO: renamed from: ia1$e */
    public static class C7203e extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a */
        public Drawable f46173a;

        /* JADX INFO: renamed from: b */
        public int f46174b;

        /* JADX INFO: renamed from: c */
        public int f46175c;

        public C7203e(Drawable drawable, int i, int i2) {
            this.f46173a = drawable;
            this.f46174b = i;
            this.f46175c = i2;
        }

        private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                this.f46173a.setBounds(right, paddingTop, this.f46174b + right, height);
                this.f46173a.draw(canvas);
            }
        }

        private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                this.f46173a.setBounds(paddingLeft, bottom, width, this.f46174b + bottom);
                this.f46173a.draw(canvas);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            if (this.f46175c == 1) {
                rect.set(0, 0, 0, this.f46174b);
            } else if (i != recyclerView.getAdapter().getItemCount() - 1) {
                rect.set(0, 0, this.f46174b, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.f46175c == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: ia1$f */
    public static class C7204f extends LinearLayoutManager {
        public C7204f(Context context, LinearLayoutManager linearLayoutManager) {
            super(context, linearLayoutManager.getOrientation(), linearLayoutManager.getReverseLayout());
        }
    }

    /* JADX INFO: renamed from: ia1$g */
    public static class C7205g extends StaggeredGridLayoutManager {
        public C7205g(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            super(staggeredGridLayoutManager.getSpanCount(), staggeredGridLayoutManager.getOrientation());
        }
    }

    public ia1(Context context) {
        super(context);
    }

    private void configBackground() {
        int i = this.f46158b.f24348e;
        if (i == 0) {
            i = this.f46157a.f24298H;
        }
        setBackgroundColor(i);
    }

    private void createAdapter() {
        RecyclerView.Adapter adapter = this.f46158b.f24337H;
        this.f46159c = adapter;
        if (adapter == null) {
            this.f46159c = new C7202d(getContext(), this.f46158b, this.f46157a, this.f46160d);
            RecyclerView.LayoutManager layoutManager = this.f46160d;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.getSpanSizeLookup() instanceof GridLayoutManager.DefaultSpanSizeLookup) {
                    gridLayoutManager.setSpanSizeLookup(new C7199a(gridLayoutManager));
                }
            }
        }
        setAdapter(this.f46159c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void createItemDecoration() {
        /*
            r6 = this;
            com.mylhyl.circledialog.params.ItemsParams r0 = r6.f46158b
            int r0 = r0.f24346c
            if (r0 <= 0) goto L66
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f46160d
            if (r0 == 0) goto L66
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f46160d
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 == 0) goto L32
            com.mylhyl.circledialog.params.ItemsParams r1 = r6.f46158b
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r2 = r1.f24340N
            if (r2 != 0) goto L32
            ia1$b r0 = new ia1$b
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            int r3 = p000.wz1.f95826k
            r2.<init>(r3)
            android.content.Context r3 = r6.getContext()
            com.mylhyl.circledialog.params.ItemsParams r4 = r6.f46158b
            int r4 = r4.f24346c
            float r4 = (float) r4
            int r3 = com.mylhyl.circledialog.C3860a.dp2px(r3, r4)
            r0.<init>(r2, r3)
            r1.f24340N = r0
            goto L5f
        L32:
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L5f
            com.mylhyl.circledialog.params.ItemsParams r1 = r6.f46158b
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r1 = r1.f24340N
            if (r1 != 0) goto L5f
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.getOrientation()
            com.mylhyl.circledialog.params.ItemsParams r1 = r6.f46158b
            ia1$e r2 = new ia1$e
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            int r4 = p000.wz1.f95826k
            r3.<init>(r4)
            android.content.Context r4 = r6.getContext()
            com.mylhyl.circledialog.params.ItemsParams r5 = r6.f46158b
            int r5 = r5.f24346c
            float r5 = (float) r5
            int r4 = com.mylhyl.circledialog.C3860a.dp2px(r4, r5)
            r2.<init>(r3, r4, r0)
            r1.f24340N = r2
        L5f:
            com.mylhyl.circledialog.params.ItemsParams r0 = r6.f46158b
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r0 = r0.f24340N
            r6.addItemDecoration(r0)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ia1.createItemDecoration():void");
    }

    private void createLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.f46158b.f24338L;
        if (layoutManager == null) {
            this.f46160d = new LinearLayoutManager(getContext(), this.f46158b.f24339M, false);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            this.f46160d = new C7205g((StaggeredGridLayoutManager) layoutManager);
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.getSpanCount() == 1) {
                this.f46160d = new LinearLayoutManager(getContext(), this.f46158b.f24339M, false);
            } else {
                this.f46160d = new C7201c(getContext(), gridLayoutManager);
            }
        } else if (layoutManager instanceof LinearLayoutManager) {
            this.f46160d = new C7204f(getContext(), (LinearLayoutManager) layoutManager);
        } else {
            this.f46160d = layoutManager;
        }
        setLayoutManager(this.f46160d);
        setHasFixedSize(true);
    }

    private void init() {
        configBackground();
        createLayoutManager();
        createItemDecoration();
        createAdapter();
    }

    @Override // p000.sg8
    public View getView() {
        return this;
    }

    @Override // p000.sg8
    public void refreshItems() {
        this.f46159c.notifyDataSetChanged();
    }

    @Override // p000.sg8
    public void regOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    public ia1(Context context, ItemsParams itemsParams, DialogParams dialogParams) {
        super(context);
        this.f46158b = itemsParams;
        this.f46157a = dialogParams;
        init();
    }

    @Override // p000.sg8
    public void regOnItemClickListener(o4c o4cVar) {
        RecyclerView.Adapter adapter = this.f46159c;
        if (adapter == null || !(adapter instanceof C7202d)) {
            return;
        }
        ((C7202d) adapter).setOnItemClickListener(o4cVar);
    }
}
