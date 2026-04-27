package p000;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public class oib extends lib {
    public oib(@yfb InputConnection inputConnection, @yfb qy6<? super iib, bth> qy6Var) {
        super(inputConnection, qy6Var);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@yfb HandwritingGesture handwritingGesture, @gib Executor executor, @gib IntConsumer intConsumer) {
        InputConnection inputConnectionM14114b = m14114b();
        if (inputConnectionM14114b != null) {
            inputConnectionM14114b.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
        InputConnection inputConnectionM14114b = m14114b();
        if (inputConnectionM14114b != null) {
            return inputConnectionM14114b.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
