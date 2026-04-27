package p000;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1855#2,2:170\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics_androidKt\n*L\n139#1:170,2\n*E\n"})
public final class aw8 {
    public static final float minIntrinsicWidth(@yfb CharSequence charSequence, @yfb TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i = 0;
        lineInstance.setText(new cw1(charSequence, 0, charSequence.length()));
        PriorityQueue<scc> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: zv8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return aw8.minIntrinsicWidth$lambda$0((scc) obj, (scc) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new scc(Integer.valueOf(i2), Integer.valueOf(i)));
            } else {
                scc sccVar = (scc) priorityQueue.peek();
                if (sccVar != null && ((Number) sccVar.getSecond()).intValue() - ((Number) sccVar.getFirst()).intValue() < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new scc(Integer.valueOf(i2), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (scc sccVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) sccVar2.component1()).intValue(), ((Number) sccVar2.component2()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(scc sccVar, scc sccVar2) {
        return (((Number) sccVar.getSecond()).intValue() - ((Number) sccVar.getFirst()).intValue()) - (((Number) sccVar2.getSecond()).intValue() - ((Number) sccVar2.getFirst()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!gxf.hasSpan(spanned, j49.class) && !gxf.hasSpan(spanned, i49.class)) {
                }
                return true;
            }
            if (textPaint.getLetterSpacing() != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
