package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class y39 {
    private y39() {
    }

    private static int getStartIndex(ydg ydgVar, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = ydgVar.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = ydgVar.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || ydgVar.getEventTime(nextEventTimeIndex + (-1)) != j) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void outputSubtitleEvent(ydg ydgVar, int i, qu2<ba3> qu2Var) {
        long eventTime = ydgVar.getEventTime(i);
        List<n93> cues = ydgVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == ydgVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = ydgVar.getEventTime(i + 1) - ydgVar.getEventTime(i);
        if (eventTime2 > 0) {
            qu2Var.accept(new ba3(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void toCuesWithTiming(p000.ydg r11, p000.peg.C10937b r12, p000.qu2<p000.ba3> r13) {
        /*
            long r0 = r12.f70577a
            int r0 = getStartIndex(r11, r0)
            long r1 = r12.f70577a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r11.getEventTimeCount()
            if (r0 >= r1) goto L3b
            long r3 = r12.f70577a
            java.util.List r6 = r11.getCues(r3)
            long r3 = r11.getEventTime(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3b
            long r7 = r12.f70577a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3b
            ba3 r1 = new ba3
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r3 = r0
        L3d:
            int r4 = r11.getEventTimeCount()
            if (r3 >= r4) goto L49
            outputSubtitleEvent(r11, r3, r13)
            int r3 = r3 + 1
            goto L3d
        L49:
            boolean r3 = r12.f70578b
            if (r3 == 0) goto L76
            if (r1 == 0) goto L51
            int r0 = r0 + (-1)
        L51:
            if (r2 >= r0) goto L59
            outputSubtitleEvent(r11, r2, r13)
            int r2 = r2 + 1
            goto L51
        L59:
            if (r1 == 0) goto L76
            ba3 r1 = new ba3
            long r2 = r12.f70577a
            java.util.List r4 = r11.getCues(r2)
            long r5 = r11.getEventTime(r0)
            long r2 = r12.f70577a
            long r11 = r11.getEventTime(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y39.toCuesWithTiming(ydg, peg$b, qu2):void");
    }
}
