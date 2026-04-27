package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class tw9 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: i */
    public static final int f86178i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f86179j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f86180k = C3146R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: a */
    @efb
    public Drawable f86181a;

    /* JADX INFO: renamed from: b */
    public int f86182b;

    /* JADX INFO: renamed from: c */
    @g92
    public int f86183c;

    /* JADX INFO: renamed from: d */
    public int f86184d;

    /* JADX INFO: renamed from: e */
    public int f86185e;

    /* JADX INFO: renamed from: f */
    public int f86186f;

    /* JADX INFO: renamed from: g */
    public boolean f86187g;

    /* JADX INFO: renamed from: h */
    public final Rect f86188h;

    public tw9(@efb Context context, int i) {
        this(context, null, i);
    }

    private void drawForHorizontalOrientation(@efb Canvas canvas, @efb RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i = paddingTop + this.f86185e;
        int i2 = height - this.f86186f;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f86188h);
                int iRound = this.f86188h.right + Math.round(childAt.getTranslationX());
                this.f86181a.setBounds(iRound - this.f86182b, i, iRound, i2);
                this.f86181a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@efb Canvas canvas, @efb RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean z = o8i.getLayoutDirection(recyclerView) == 1;
        int i = paddingLeft + (z ? this.f86186f : this.f86185e);
        int i2 = width - (z ? this.f86185e : this.f86186f);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f86188h);
                int iRound = this.f86188h.bottom + Math.round(childAt.getTranslationY());
                this.f86181a.setBounds(i, iRound - this.f86182b, i2, iRound);
                this.f86181a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean shouldDrawDivider(@efb RecyclerView recyclerView, @efb View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z || this.f86187g) && m22886a(childAdapterPosition, adapter);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22886a(int i, @hib RecyclerView.Adapter<?> adapter) {
        return true;
    }

    @g92
    public int getDividerColor() {
        return this.f86183c;
    }

    @fkd
    public int getDividerInsetEnd() {
        return this.f86186f;
    }

    @fkd
    public int getDividerInsetStart() {
        return this.f86185e;
    }

    @fkd
    public int getDividerThickness() {
        return this.f86182b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@efb Rect rect, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.f86184d == 1) {
                rect.bottom = this.f86182b;
            } else {
                rect.right = this.f86182b;
            }
        }
    }

    public int getOrientation() {
        return this.f86184d;
    }

    public boolean isLastItemDecorated() {
        return this.f86187g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@efb Canvas canvas, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f86184d == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(@g92 int i) {
        this.f86183c = i;
        Drawable drawableWrap = yp4.wrap(this.f86181a);
        this.f86181a = drawableWrap;
        yp4.setTint(drawableWrap, i);
    }

    public void setDividerColorResource(@efb Context context, @w92 int i) {
        setDividerColor(lx2.getColor(context, i));
    }

    public void setDividerInsetEnd(@fkd int i) {
        this.f86186f = i;
    }

    public void setDividerInsetEndResource(@efb Context context, @xc4 int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@fkd int i) {
        this.f86185e = i;
    }

    public void setDividerInsetStartResource(@efb Context context, @xc4 int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@fkd int i) {
        this.f86182b = i;
    }

    public void setDividerThicknessResource(@efb Context context, @xc4 int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public void setLastItemDecorated(boolean z) {
        this.f86187g = z;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.f86184d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    public tw9(@efb Context context, @hib AttributeSet attributeSet, int i) {
        this(context, attributeSet, C3146R.attr.materialDividerStyle, i);
    }

    public tw9(@efb Context context, @hib AttributeSet attributeSet, int i, int i2) {
        this.f86188h = new Rect();
        TypedArray typedArrayObtainStyledAttributes = zwg.obtainStyledAttributes(context, attributeSet, C3146R.styleable.MaterialDivider, i, f86180k, new int[0]);
        this.f86183c = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f86182b = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C3146R.dimen.material_divider_thickness));
        this.f86185e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f86186f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f86187g = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f86181a = new ShapeDrawable();
        setDividerColor(this.f86183c);
        setOrientation(i2);
    }
}
