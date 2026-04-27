package p000;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
@e0g(parameters = 1)
public final class b10 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final b10 f12357a = new b10();

    /* JADX INFO: renamed from: b */
    public static final int f12358b = 0;

    /* JADX INFO: renamed from: b10$a */
    public static final class C1693a extends SegmentFinder {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yue f12359a;

        public C1693a(yue yueVar) {
            this.f12359a = yueVar;
        }

        public int nextEndBoundary(int i) {
            return this.f12359a.nextEndBoundary(i);
        }

        public int nextStartBoundary(int i) {
            return this.f12359a.nextStartBoundary(i);
        }

        public int previousEndBoundary(int i) {
            return this.f12359a.previousEndBoundary(i);
        }

        public int previousStartBoundary(int i) {
            return this.f12359a.previousStartBoundary(i);
        }
    }

    private b10() {
    }

    @yfb
    @ih4
    public final SegmentFinder toAndroidSegmentFinder$ui_text_release(@yfb yue yueVar) {
        return C5958ft.m11143a(new C1693a(yueVar));
    }
}
