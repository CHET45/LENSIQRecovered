package p000;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import io.noties.markwon.ext.tables.C7531b;

/* JADX INFO: loaded from: classes7.dex */
public class mkg implements MovementMethod {

    /* JADX INFO: renamed from: a */
    public final MovementMethod f61268a;

    public mkg(@efb MovementMethod movementMethod) {
        this.f61268a = movementMethod;
    }

    @efb
    public static mkg create() {
        return new mkg(LinkMovementMethod.getInstance());
    }

    public static boolean handleTableRowTouchEvent(@efb TextView textView, @efb Spannable spannable, @efb MotionEvent motionEvent) {
        C7531b c7531b;
        Layout layoutFindLayoutForHorizontalOffset;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
        C7531b[] c7531bArr = (C7531b[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C7531b.class);
        if (c7531bArr.length != 0 && (layoutFindLayoutForHorizontalOffset = (c7531b = c7531bArr[0]).findLayoutForHorizontalOffset(scrollX)) != null) {
            int offsetForHorizontal2 = layoutFindLayoutForHorizontalOffset.getOffsetForHorizontal(layoutFindLayoutForHorizontalOffset.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % c7531b.cellWidth());
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layoutFindLayoutForHorizontalOffset.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
            if (clickableSpanArr.length > 0) {
                clickableSpanArr[0].onClick(textView);
                return true;
            }
        }
        return false;
    }

    @efb
    public static mkg wrap(@efb MovementMethod movementMethod) {
        return new mkg(movementMethod);
    }

    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return this.f61268a.canSelectArbitrarily();
    }

    @Override // android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        this.f61268a.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f61268a.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f61268a.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.f61268a.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f61268a.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.f61268a.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f61268a.onTouchEvent(textView, spannable, motionEvent) || handleTableRowTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f61268a.onTrackballEvent(textView, spannable, motionEvent);
    }
}
