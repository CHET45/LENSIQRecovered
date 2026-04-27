package com.watchfun.transcommon.utils;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.watchfun.transcommon.utils.DialogWindowUtils;
import com.watchfun.transcommon.utils.SoftKeyBoardListener;

/* JADX INFO: loaded from: classes6.dex */
public class DialogWindowUtils {
    public static void addBottomPadding(View view) {
        if (view == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: oc4
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return DialogWindowUtils.lambda$addBottomPadding$0(view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$addBottomPadding$0(View view, WindowInsets windowInsets) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + (Build.VERSION.SDK_INT >= 30 ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : windowInsets.getSystemWindowInsetBottom()));
        return windowInsets;
    }

    public static void makeBottomDialogImmersive(Dialog dialog, int i) {
        if (dialog == null) {
            return;
        }
        makeWindowImmersive(dialog.getWindow(), i);
    }

    private static void makeWindowImmersive(final Window window, int i) {
        if (window == null) {
            return;
        }
        window.setGravity(i);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.setLayout(-1, -2);
        window.setNavigationBarColor(0);
        window.clearFlags(67108864);
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(784);
        if (i == 80) {
            SoftKeyBoardListener.setListener(window, new SoftKeyBoardListener.OnSoftKeyBoardChangeListener() { // from class: com.watchfun.transcommon.utils.DialogWindowUtils.1
                @Override // com.watchfun.transcommon.utils.SoftKeyBoardListener.OnSoftKeyBoardChangeListener
                public void keyBoardHide(int i2) {
                    window.getDecorView().setPadding(window.getDecorView().getPaddingLeft(), window.getDecorView().getPaddingTop(), window.getDecorView().getPaddingRight(), window.getDecorView().getPaddingBottom() - i2);
                    window.getDecorView().invalidate();
                }

                @Override // com.watchfun.transcommon.utils.SoftKeyBoardListener.OnSoftKeyBoardChangeListener
                public void keyBoardShow(int i2) {
                    window.getDecorView().setPadding(window.getDecorView().getPaddingLeft(), window.getDecorView().getPaddingTop(), window.getDecorView().getPaddingRight(), window.getDecorView().getPaddingBottom() + i2);
                    window.getDecorView().invalidate();
                }
            });
        }
    }
}
