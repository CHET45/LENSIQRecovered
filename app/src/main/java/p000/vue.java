package p000;

import android.text.Layout;
import com.blankj.utilcode.util.C2473f;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSegmentBreaker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.android.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,308:1\n33#2,6:309\n74#2,11:315\n74#2,11:326\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.android.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n61#1:309,6\n221#1:315,11\n270#1:326,11\n*E\n"})
@e0g(parameters = 1)
public final class vue {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final vue f92289a = new vue();

    /* JADX INFO: renamed from: b */
    public static final int f92290b = 0;

    /* JADX INFO: renamed from: vue$a */
    public /* synthetic */ class C14266a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92291a;

        static {
            int[] iArr = new int[bve.values().length];
            try {
                iArr[bve.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bve.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bve.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bve.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bve.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f92291a = iArr;
        }
    }

    private vue() {
    }

    private final List<Integer> breakInWords(qv8 qv8Var) {
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(qv8Var.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i).intValue()));
        }
        int paragraphCount = qv8Var.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            Bidi bidiAnalyzeBidi = qv8Var.analyzeBidi(i2);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = qv8Var.getParagraphStart(i2);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        return v82.toList(treeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<p000.tue> breakSegmentWithChar(p000.qv8 r20, boolean r21) {
        /*
            r19 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            bve r2 = p000.bve.Character
            r3 = r19
            java.util.List r2 = r3.breakOffsets(r0, r2)
            int r4 = r2.size()
            if (r4 == 0) goto Lb4
            int r4 = r2.size()
            r5 = 1
            if (r4 != r5) goto L1e
            goto Lb4
        L1e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            java.lang.Object r7 = r2.get(r6)
            int r8 = p000.l82.getLastIndex(r2)
            r9 = r6
        L2d:
            if (r9 >= r8) goto Lb7
            int r9 = r9 + 1
            java.lang.Object r10 = r2.get(r9)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r14 = r11.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r13 = r7.intValue()
            android.text.Layout r7 = r20.getLayout()
            if (r21 == 0) goto L5b
            int r11 = r13 + 1
            if (r14 != r11) goto L5b
            java.lang.CharSequence r11 = r7.getText()
            char r11 = r11.charAt(r13)
            boolean r11 = r0.isLineEndSpace(r11)
            if (r11 == 0) goto L5b
            goto Laa
        L5b:
            int r11 = p000.kv8.getLineForOffset(r7, r13, r6)
            int r12 = r7.getParagraphDirection(r11)
            r15 = -1
            if (r12 != r15) goto L68
            r12 = r5
            goto L69
        L68:
            r12 = r6
        L69:
            boolean r15 = r7.isRtlCharAt(r13)
            if (r15 != r12) goto L70
            goto L71
        L70:
            r5 = r6
        L71:
            float r5 = r0.getHorizontalPosition(r13, r5, r6)
            r16 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            float r5 = (float) r5
            int r5 = (int) r5
            r6 = 1
            if (r15 != r12) goto L83
            r7 = 1
            goto L84
        L83:
            r7 = 0
        L84:
            float r7 = r0.getHorizontalPosition(r14, r7, r6)
            double r6 = (double) r7
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            int r6 = (int) r6
            tue r7 = new tue
            int r15 = java.lang.Math.min(r5, r6)
            r12 = r16
            int r16 = r12.getLineTop(r11)
            int r17 = java.lang.Math.max(r5, r6)
            int r18 = r12.getLineBottom(r11)
            r12 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.add(r7)
        Laa:
            bth r5 = p000.bth.f14751a
            r4.add(r5)
            r7 = r10
            r5 = 1
            r6 = 0
            goto L2d
        Lb4:
            p000.l82.emptyList()
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vue.breakSegmentWithChar(qv8, boolean):java.util.List");
    }

    private final List<tue> breakSegmentWithDocument(qv8 qv8Var) {
        return k82.listOf(new tue(0, qv8Var.getLayout().getText().length(), 0, 0, qv8Var.getLayout().getWidth(), qv8Var.getLayout().getHeight()));
    }

    private final List<tue> breakSegmentWithLine(qv8 qv8Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        Layout layout = qv8Var.getLayout();
        int lineCount = qv8Var.getLayout().getLineCount();
        for (int i = 0; i < lineCount; i++) {
            arrayList.add(new tue(layout.getLineStart(i), layout.getLineEnd(i), z ? (int) Math.ceil(layout.getLineLeft(i)) : 0, layout.getLineTop(i), z ? (int) Math.ceil(layout.getLineRight(i)) : layout.getWidth(), layout.getLineBottom(i)));
        }
        return arrayList;
    }

    private final List<tue> breakSegmentWithParagraph(qv8 qv8Var) {
        ArrayList arrayList = new ArrayList();
        Layout layout = qv8Var.getLayout();
        int paragraphCount = qv8Var.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = qv8Var.getParagraphStart(i);
            int paragraphEnd = qv8Var.getParagraphEnd(i);
            arrayList.add(new tue(paragraphStart, paragraphEnd, 0, layout.getLineTop(kv8.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(kv8.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<tue> breakSegmentWithWord(qv8 qv8Var, boolean z) {
        int i;
        Layout layout = qv8Var.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(C2473f.f17566z));
        List<Integer> listBreakOffsets = breakOffsets(qv8Var, bve.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z2 = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z3 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = l82.getLastIndex(listBreakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    Integer num2 = listBreakOffsets.get(i2);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = kv8.getLineForOffset(layout, iIntValue2, z3);
                    boolean z4 = layout.getParagraphDirection(lineForOffset) == -1 ? z2 : z3;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z4) {
                        z2 = z3;
                    }
                    int iCeil2 = (int) Math.ceil(qv8Var.getHorizontalPosition(iIntValue2, z2, z3));
                    int iCeil3 = (int) Math.ceil(qv8Var.getHorizontalPosition(iIntValue, zIsRtlCharAt == z4, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (z && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new tue(iIntValue2, iIntValue, iMin, layout.getLineTop(i), iMax, layout.getLineBottom(i)));
                    num = num2;
                    z2 = true;
                    z3 = false;
                }
                return arrayList;
            }
        }
        return l82.emptyList();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        cw1 cw1Var = new cw1(charSequence, 0, charSequence.length());
        List<Integer> listMutableListOf = l82.mutableListOf(0);
        breakIterator.setText(cw1Var);
        while (breakIterator.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breakIterator.current()));
        }
        return listMutableListOf;
    }

    @yfb
    public final List<Integer> breakOffsets(@yfb qv8 qv8Var, @yfb bve bveVar) {
        Layout layout = qv8Var.getLayout();
        CharSequence text = layout.getText();
        int i = C14266a.f92291a[bveVar.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return l82.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i == 2) {
            List<Integer> listMutableListOf = l82.mutableListOf(0);
            int paragraphCount = qv8Var.getParagraphCount();
            while (i2 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(qv8Var.getParagraphEnd(i2)));
                i2++;
            }
            return listMutableListOf;
        }
        if (i != 3) {
            if (i == 4) {
                return breakInWords(qv8Var);
            }
            if (i == 5) {
                return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            throw new ceb();
        }
        List<Integer> listMutableListOf2 = l82.mutableListOf(0);
        int lineCount = layout.getLineCount();
        while (i2 < lineCount) {
            listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i2)));
            i2++;
        }
        return listMutableListOf2;
    }

    @yfb
    public final List<tue> breakSegments(@yfb qv8 qv8Var, @yfb bve bveVar, boolean z) {
        int i = C14266a.f92291a[bveVar.ordinal()];
        if (i == 1) {
            return breakSegmentWithDocument(qv8Var);
        }
        if (i == 2) {
            return breakSegmentWithParagraph(qv8Var);
        }
        if (i == 3) {
            return breakSegmentWithLine(qv8Var, z);
        }
        if (i == 4) {
            return breakSegmentWithWord(qv8Var, z);
        }
        if (i == 5) {
            return breakSegmentWithChar(qv8Var, z);
        }
        throw new ceb();
    }
}
