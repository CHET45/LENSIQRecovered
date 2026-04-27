package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import com.blankj.utilcode.util.C2479l;

/* JADX INFO: loaded from: classes3.dex */
public final class b52 {
    private b52() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addChangedListener(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    public static void clear() {
        ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, ""));
    }

    public static void copyText(CharSequence charSequence) {
        ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(C2479l.getApp().getPackageName(), charSequence));
    }

    public static CharSequence getLabel() {
        CharSequence label;
        ClipDescription primaryClipDescription = ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).getPrimaryClipDescription();
        return (primaryClipDescription == null || (label = primaryClipDescription.getLabel()) == null) ? "" : label;
    }

    public static CharSequence getText() {
        CharSequence charSequenceCoerceToText;
        ClipData primaryClip = ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).getPrimaryClip();
        return (primaryClip == null || primaryClip.getItemCount() <= 0 || (charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(C2479l.getApp())) == null) ? "" : charSequenceCoerceToText;
    }

    public static void removeChangedListener(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).removePrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    public static void copyText(CharSequence charSequence, CharSequence charSequence2) {
        ((ClipboardManager) C2479l.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }
}
