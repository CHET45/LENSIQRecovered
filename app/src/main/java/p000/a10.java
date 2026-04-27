package p000;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public final class a10 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a10 f93a = new a10();

    private a10() {
    }

    @ih4
    public final void performHandwritingGesture(@yfb ztg ztgVar, @yfb HandwritingGesture handwritingGesture, @gib Executor executor, @gib final IntConsumer intConsumer) {
        final int iPerformHandwritingGesture = ztgVar.performHandwritingGesture(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: z00
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(iPerformHandwritingGesture);
                }
            });
        } else {
            intConsumer.accept(iPerformHandwritingGesture);
        }
    }

    @ih4
    public final boolean previewHandwritingGesture(@yfb ztg ztgVar, @yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
        return ztgVar.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
