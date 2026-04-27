package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes7.dex */
public class fw3 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f37859d = false;

    /* JADX INFO: renamed from: a */
    public final int f37860a;

    /* JADX INFO: renamed from: b */
    public final int f37861b;

    /* JADX INFO: renamed from: c */
    public final wq4 f37862c;

    public fw3(@g92 int i) {
        this(i, 4, 4);
    }

    private void drawHorizontal(Canvas canvas, View view, int i, int i2, int i3) {
        boolean zIsFirstRaw = isFirstRaw(0, i, i2, i3);
        boolean zIsLastRaw = isLastRaw(0, i, i2, i3);
        boolean zIsFirstColumn = isFirstColumn(0, i, i2, i3);
        boolean zIsLastColumn = isLastColumn(0, i, i2, i3);
        if (i2 == 1) {
            if (zIsFirstRaw && zIsLastColumn) {
                return;
            }
            if (zIsFirstColumn) {
                this.f37862c.drawRight(view, canvas);
                return;
            } else if (zIsLastColumn) {
                this.f37862c.drawLeft(view, canvas);
                return;
            } else {
                this.f37862c.drawLeft(view, canvas);
                this.f37862c.drawRight(view, canvas);
                return;
            }
        }
        if (zIsFirstColumn && zIsFirstRaw) {
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsFirstColumn && zIsLastRaw) {
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            return;
        }
        if (zIsLastColumn && zIsFirstRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsLastColumn && zIsLastRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            return;
        }
        if (zIsFirstColumn) {
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsLastColumn) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        } else if (zIsFirstRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        } else if (zIsLastRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
        } else {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        }
    }

    private void drawVertical(Canvas canvas, View view, int i, int i2, int i3) {
        boolean zIsFirstRaw = isFirstRaw(1, i, i2, i3);
        boolean zIsLastRaw = isLastRaw(1, i, i2, i3);
        boolean zIsFirstColumn = isFirstColumn(1, i, i2, i3);
        boolean zIsLastColumn = isLastColumn(1, i, i2, i3);
        if (i2 == 1) {
            if (zIsFirstRaw && zIsLastRaw) {
                return;
            }
            if (zIsFirstRaw) {
                this.f37862c.drawBottom(view, canvas);
                return;
            } else if (zIsLastRaw) {
                this.f37862c.drawTop(view, canvas);
                return;
            } else {
                this.f37862c.drawTop(view, canvas);
                this.f37862c.drawBottom(view, canvas);
                return;
            }
        }
        if (zIsFirstRaw && zIsFirstColumn) {
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsFirstRaw && zIsLastColumn) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsLastRaw && zIsFirstColumn) {
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            return;
        }
        if (zIsLastRaw && zIsLastColumn) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            return;
        }
        if (zIsFirstRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
            return;
        }
        if (zIsLastRaw) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
        } else if (zIsFirstColumn) {
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        } else if (zIsLastColumn) {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        } else {
            this.f37862c.drawLeft(view, canvas);
            this.f37862c.drawTop(view, canvas);
            this.f37862c.drawRight(view, canvas);
            this.f37862c.drawBottom(view, canvas);
        }
    }

    private int getOrientation(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    private int getSpanCount(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    private boolean isFirstColumn(int i, int i2, int i3, int i4) {
        return i == 1 ? i3 == 1 || i2 % i3 == 0 : i2 < i3;
    }

    private boolean isFirstRaw(int i, int i2, int i3, int i4) {
        return i == 1 ? i2 < i3 : i3 == 1 || i2 % i3 == 0;
    }

    private boolean isLastColumn(int i, int i2, int i3, int i4) {
        if (i == 1) {
            return i3 == 1 || (i2 + 1) % i3 == 0;
        }
        if (i3 == 1) {
            return i2 + 1 == i4;
        }
        int i5 = i4 % i3;
        int i6 = ((i4 - i5) / i3) + (i5 > 0 ? 1 : 0);
        int i7 = i2 + 1;
        int i8 = i7 % i3;
        return i8 == 0 ? i6 == i7 / i3 : i6 == ((i7 - i8) / i3) + 1;
    }

    private boolean isLastRaw(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return i3 == 1 || (i2 + 1) % i3 == 0;
        }
        if (i3 == 1) {
            return i2 + 1 == i4;
        }
        int i5 = i4 % i3;
        int i6 = ((i4 - i5) / i3) + (i5 > 0 ? 1 : 0);
        int i7 = i2 + 1;
        int i8 = i7 % i3;
        return i8 == 0 ? i6 == i7 / i3 : i6 == ((i7 - i8) / i3) + 1;
    }

    private void offsetHorizontal(Rect rect, int i, int i2, int i3) {
        boolean zIsFirstRaw = isFirstRaw(0, i, i2, i3);
        boolean zIsLastRaw = isLastRaw(0, i, i2, i3);
        boolean zIsFirstColumn = isFirstColumn(0, i, i2, i3);
        boolean zIsLastColumn = isLastColumn(0, i, i2, i3);
        if (i2 == 1) {
            if (zIsFirstColumn && zIsLastColumn) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (zIsFirstColumn) {
                rect.set(0, 0, this.f37860a, 0);
                return;
            } else if (zIsLastColumn) {
                rect.set(this.f37860a, 0, 0, 0);
                return;
            } else {
                int i4 = this.f37860a;
                rect.set(i4, 0, i4, 0);
                return;
            }
        }
        if (zIsFirstColumn && zIsFirstRaw) {
            rect.set(0, 0, this.f37860a, this.f37861b);
            return;
        }
        if (zIsFirstColumn && zIsLastRaw) {
            rect.set(0, this.f37861b, this.f37860a, 0);
            return;
        }
        if (zIsLastColumn && zIsFirstRaw) {
            rect.set(this.f37860a, 0, 0, this.f37861b);
            return;
        }
        if (zIsLastColumn && zIsLastRaw) {
            rect.set(this.f37860a, this.f37861b, 0, 0);
            return;
        }
        if (zIsFirstColumn) {
            int i5 = this.f37861b;
            rect.set(0, i5, this.f37860a, i5);
            return;
        }
        if (zIsLastColumn) {
            int i6 = this.f37860a;
            int i7 = this.f37861b;
            rect.set(i6, i7, 0, i7);
        } else if (zIsFirstRaw) {
            int i8 = this.f37860a;
            rect.set(i8, 0, i8, this.f37861b);
        } else if (zIsLastRaw) {
            int i9 = this.f37860a;
            rect.set(i9, this.f37861b, i9, 0);
        } else {
            int i10 = this.f37860a;
            int i11 = this.f37861b;
            rect.set(i10, i11, i10, i11);
        }
    }

    private void offsetVertical(Rect rect, int i, int i2, int i3) {
        boolean zIsFirstRaw = isFirstRaw(1, i, i2, i3);
        boolean zIsLastRaw = isLastRaw(1, i, i2, i3);
        boolean zIsFirstColumn = isFirstColumn(1, i, i2, i3);
        boolean zIsLastColumn = isLastColumn(1, i, i2, i3);
        if (i2 == 1) {
            if (zIsFirstRaw && zIsLastRaw) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (zIsFirstRaw) {
                rect.set(0, 0, 0, this.f37861b);
                return;
            } else if (zIsLastRaw) {
                rect.set(0, this.f37861b, 0, 0);
                return;
            } else {
                int i4 = this.f37861b;
                rect.set(0, i4, 0, i4);
                return;
            }
        }
        if (zIsFirstRaw && zIsFirstColumn) {
            rect.set(0, 0, this.f37860a, this.f37861b);
            return;
        }
        if (zIsFirstRaw && zIsLastColumn) {
            rect.set(this.f37860a, 0, 0, this.f37861b);
            return;
        }
        if (zIsLastRaw && zIsFirstColumn) {
            rect.set(0, this.f37861b, this.f37860a, 0);
            return;
        }
        if (zIsLastRaw && zIsLastColumn) {
            rect.set(this.f37860a, this.f37861b, 0, 0);
            return;
        }
        if (zIsFirstRaw) {
            int i5 = this.f37860a;
            rect.set(i5, 0, i5, this.f37861b);
            return;
        }
        if (zIsLastRaw) {
            int i6 = this.f37860a;
            rect.set(i6, this.f37861b, i6, 0);
            return;
        }
        if (zIsFirstColumn) {
            int i7 = this.f37861b;
            rect.set(0, i7, this.f37860a, i7);
        } else if (zIsLastColumn) {
            int i8 = this.f37860a;
            int i9 = this.f37861b;
            rect.set(i8, i9, 0, i9);
        } else {
            int i10 = this.f37860a;
            int i11 = this.f37861b;
            rect.set(i10, i11, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@efb Rect rect, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i = this.f37860a;
                int i2 = this.f37861b;
                rect.set(i, i2, i, i2);
                return;
            }
            return;
        }
        int orientation = getOrientation(layoutManager);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int spanCount = getSpanCount(layoutManager);
        int itemCount = layoutManager.getItemCount();
        if (orientation == 1) {
            offsetVertical(rect, childLayoutPosition, spanCount, itemCount);
        } else {
            offsetHorizontal(rect, childLayoutPosition, spanCount, itemCount);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@efb Canvas canvas, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int orientation = getOrientation(layoutManager);
        int spanCount = getSpanCount(layoutManager);
        int childCount = layoutManager.getChildCount();
        if (layoutManager instanceof LinearLayoutManager) {
            canvas.save();
            for (int i = 0; i < childCount; i++) {
                View childAt = layoutManager.getChildAt(i);
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                if (orientation == 1) {
                    drawVertical(canvas, childAt, childLayoutPosition, spanCount, childCount);
                } else {
                    drawHorizontal(canvas, childAt, childLayoutPosition, spanCount, childCount);
                }
            }
            canvas.restore();
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            canvas.save();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = layoutManager.getChildAt(i2);
                this.f37862c.drawLeft(childAt2, canvas);
                this.f37862c.drawTop(childAt2, canvas);
                this.f37862c.drawRight(childAt2, canvas);
                this.f37862c.drawBottom(childAt2, canvas);
            }
            canvas.restore();
        }
    }

    public fw3(@g92 int i, int i2, int i3) {
        int iRound = Math.round(i2 / 2.0f);
        this.f37860a = iRound;
        int iRound2 = Math.round(i3 / 2.0f);
        this.f37861b = iRound2;
        this.f37862c = new a92(i, iRound, iRound2);
    }
}
