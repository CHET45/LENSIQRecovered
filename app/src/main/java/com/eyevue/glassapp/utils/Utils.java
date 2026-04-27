package com.eyevue.glassapp.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import p000.c1i;
import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    public static void addUnifyItemDecoration(RecyclerView recyclerView, final int spanCount) {
        if (recyclerView == null || spanCount == 0) {
            return;
        }
        final int dimenPx = getDimenPx(C2531R.dimen.dp_6);
        final int dimenPx2 = getDimenPx(C2531R.dimen.dp_4);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.eyevue.glassapp.utils.Utils.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@efb Rect outRect, @efb View view, @efb RecyclerView parent, @efb RecyclerView.State state) {
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                if (parent.getAdapter() == null) {
                    return;
                }
                int iCeil = (int) Math.ceil((((double) parent.getAdapter().getItemCount()) * 1.0d) / ((double) spanCount));
                int i = spanCount;
                int i2 = childAdapterPosition / i;
                int i3 = childAdapterPosition - (i2 * i);
                if (i3 == 0) {
                    int i4 = dimenPx2;
                    outRect.left = i4;
                    if (i != 1) {
                        i4 = dimenPx;
                    }
                    outRect.right = i4;
                } else if (i3 == i - 1) {
                    outRect.right = dimenPx2;
                    outRect.left = dimenPx;
                } else {
                    int i5 = dimenPx;
                    outRect.right = i5;
                    outRect.left = i5;
                }
                if (i2 == 0) {
                    outRect.top = dimenPx2;
                    outRect.bottom = dimenPx;
                } else if (i2 == iCeil - 1) {
                    outRect.top = dimenPx;
                    outRect.bottom = dimenPx2;
                } else {
                    int i6 = dimenPx;
                    outRect.top = i6;
                    outRect.bottom = i6;
                }
            }
        });
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", Byte.valueOf(b)));
        }
        return sb.toString().trim();
    }

    public static int getDimenPx(int resId) {
        return c1i.getResources().getDimensionPixelSize(resId);
    }
}
