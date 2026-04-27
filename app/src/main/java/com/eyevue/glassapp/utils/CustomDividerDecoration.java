package com.eyevue.glassapp.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000.lx2;
import p000.yrf;

/* JADX INFO: loaded from: classes4.dex */
public class CustomDividerDecoration extends RecyclerView.ItemDecoration {
    private final int mDividerHeight;
    private final Paint mPaint;

    public CustomDividerDecoration(Context context, int colorRes, int heightPx) {
        this.mDividerHeight = heightPx;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(lx2.getColor(context, colorRes));
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) < state.getItemCount() - 1) {
            outRect.bottom = this.mDividerHeight;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            View childAt = parent.getChildAt(i);
            if (parent.getChildAdapterPosition(childAt) != 0) {
                canvas.drawRect(childAt.getLeft() + yrf.dp2px(20.0f), childAt.getBottom(), childAt.getRight() - yrf.dp2px(20.0f), this.mDividerHeight + r1, this.mPaint);
            }
        }
    }
}
