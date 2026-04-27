package p000;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wwf {
    public static int width(@efb Canvas canvas, @efb CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutLayoutOf = kug.layoutOf(spanned);
            if (layoutLayoutOf != null) {
                return layoutLayoutOf.getWidth();
            }
            TextView textViewTextViewOf = swg.textViewOf(spanned);
            if (textViewTextViewOf != null) {
                return (textViewTextViewOf.getWidth() - textViewTextViewOf.getPaddingLeft()) - textViewTextViewOf.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
