package com.watchfun.transcommon.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public class SoftKeyBoardListener {
    private OnSoftKeyBoardChangeListener onSoftKeyBoardChangeListener;
    private View rootView;
    int rootViewVisibleHeight;

    public interface OnSoftKeyBoardChangeListener {
        void keyBoardHide(int i);

        void keyBoardShow(int i);
    }

    public SoftKeyBoardListener(Window window) {
        this.rootView = window.getDecorView();
        Rect rect = new Rect();
        this.rootView.getWindowVisibleDisplayFrame(rect);
        this.rootViewVisibleHeight = rect.height();
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.watchfun.transcommon.utils.SoftKeyBoardListener.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Rect rect2 = new Rect();
                SoftKeyBoardListener.this.rootView.getWindowVisibleDisplayFrame(rect2);
                int iHeight = rect2.height();
                System.out.println("" + iHeight);
                SoftKeyBoardListener softKeyBoardListener = SoftKeyBoardListener.this;
                int i = softKeyBoardListener.rootViewVisibleHeight;
                if (i == 0) {
                    softKeyBoardListener.rootViewVisibleHeight = iHeight;
                    return;
                }
                if (i == iHeight) {
                    return;
                }
                if (i - iHeight > 200) {
                    if (softKeyBoardListener.onSoftKeyBoardChangeListener != null) {
                        SoftKeyBoardListener.this.onSoftKeyBoardChangeListener.keyBoardShow(SoftKeyBoardListener.this.rootViewVisibleHeight - iHeight);
                    }
                    SoftKeyBoardListener.this.rootViewVisibleHeight = iHeight;
                } else if (iHeight - i > 200) {
                    if (softKeyBoardListener.onSoftKeyBoardChangeListener != null) {
                        SoftKeyBoardListener.this.onSoftKeyBoardChangeListener.keyBoardHide(iHeight - SoftKeyBoardListener.this.rootViewVisibleHeight);
                    }
                    SoftKeyBoardListener.this.rootViewVisibleHeight = iHeight;
                }
            }
        });
    }

    public static void setListener(Window window, OnSoftKeyBoardChangeListener onSoftKeyBoardChangeListener) {
        new SoftKeyBoardListener(window).setOnSoftKeyBoardChangeListener(onSoftKeyBoardChangeListener);
    }

    private void setOnSoftKeyBoardChangeListener(OnSoftKeyBoardChangeListener onSoftKeyBoardChangeListener) {
        this.onSoftKeyBoardChangeListener = onSoftKeyBoardChangeListener;
    }
}
