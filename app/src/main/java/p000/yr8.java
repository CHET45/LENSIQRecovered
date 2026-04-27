package p000;

import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes7.dex */
public class yr8 {
    public static void hideSoftKeyboard(EditText editText) {
        InputMethodManager inputMethodManager;
        if (editText == null || (inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static void showSoftKeyboard(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 2);
        }
    }

    public static void hideSoftKeyboard(Context context, IBinder iBinder) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }
}
