package p000;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public final class y00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final y00 f99812a = new y00();

    private y00() {
    }

    @ih4
    public final void performHandwritingGesture(@gib z39 z39Var, @gib osg osgVar, @yfb HandwritingGesture handwritingGesture, @gib u8i u8iVar, @gib Executor executor, @gib final IntConsumer intConsumer, @yfb qy6<? super lw4, bth> qy6Var) {
        final int iPerformHandwritingGesture$foundation_release = z39Var != null ? fg7.f36512a.performHandwritingGesture$foundation_release(z39Var, handwritingGesture, osgVar, u8iVar, qy6Var) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: x00
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(iPerformHandwritingGesture$foundation_release);
                }
            });
        } else {
            intConsumer.accept(iPerformHandwritingGesture$foundation_release);
        }
    }

    @ih4
    public final boolean previewHandwritingGesture(@gib z39 z39Var, @gib osg osgVar, @yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
        if (z39Var != null) {
            return fg7.f36512a.previewHandwritingGesture$foundation_release(z39Var, previewableHandwritingGesture, osgVar, cancellationSignal);
        }
        return false;
    }
}
