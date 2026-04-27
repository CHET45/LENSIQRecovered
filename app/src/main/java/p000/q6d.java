package p000;

import android.text.Spanned;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;
import p000.ku9;

/* JADX INFO: loaded from: classes7.dex */
public class q6d implements ku9.InterfaceC8525b {

    /* JADX INFO: renamed from: a */
    @hib
    public final Executor f73337a;

    public q6d(@hib Executor executor) {
        this.f73337a = executor;
    }

    @efb
    public static q6d create(@hib Executor executor) {
        return new q6d(executor);
    }

    @Override // p000.ku9.InterfaceC8525b
    public void setText(@efb TextView textView, @efb Spanned spanned, @efb TextView.BufferType bufferType, @efb Runnable runnable) {
        if (textView instanceof AppCompatTextView) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) textView;
            appCompatTextView.setTextFuture(a7d.getTextFuture(spanned, appCompatTextView.getTextMetricsParamsCompat(), this.f73337a));
            runnable.run();
        } else {
            throw new IllegalStateException("TextView provided is not an instance of AppCompatTextView, cannot call setTextFuture(), textView: " + textView);
        }
    }

    @efb
    public static q6d create() {
        return new q6d(null);
    }
}
