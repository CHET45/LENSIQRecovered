package p000;

import android.os.Build;
import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p000.a7d;
import p000.ku9;

/* JADX INFO: loaded from: classes7.dex */
public class l7d implements ku9.InterfaceC8525b {

    /* JADX INFO: renamed from: a */
    public final Executor f56704a;

    /* JADX INFO: renamed from: l7d$a */
    public class RunnableC8706a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f56705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Spanned f56706b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView.BufferType f56707c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f56708d;

        public RunnableC8706a(WeakReference weakReference, Spanned spanned, TextView.BufferType bufferType, Runnable runnable) {
            this.f56705a = weakReference;
            this.f56706b = spanned;
            this.f56707c = bufferType;
            this.f56708d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a7d a7dVarPrecomputedText = l7d.precomputedText((TextView) this.f56705a.get(), this.f56706b);
                if (a7dVarPrecomputedText != null) {
                    l7d.applyText((TextView) this.f56705a.get(), a7dVarPrecomputedText, this.f56707c, this.f56708d);
                }
            } catch (Throwable th) {
                Log.e("PrecomputdTxtSetterCmpt", "Exception during pre-computing text", th);
                l7d.applyText((TextView) this.f56705a.get(), this.f56706b, this.f56707c, this.f56708d);
            }
        }
    }

    /* JADX INFO: renamed from: l7d$b */
    public class RunnableC8707b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f56710a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Spanned f56711b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView.BufferType f56712c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f56713d;

        public RunnableC8707b(TextView textView, Spanned spanned, TextView.BufferType bufferType, Runnable runnable) {
            this.f56710a = textView;
            this.f56711b = spanned;
            this.f56712c = bufferType;
            this.f56713d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56710a.setText(this.f56711b, this.f56712c);
            this.f56713d.run();
        }
    }

    public l7d(@efb Executor executor) {
        this.f56704a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyText(@hib TextView textView, @efb Spanned spanned, @efb TextView.BufferType bufferType, @efb Runnable runnable) {
        if (textView != null) {
            textView.post(new RunnableC8707b(textView, spanned, bufferType, runnable));
        }
    }

    @efb
    public static l7d create(@efb Executor executor) {
        return new l7d(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public static a7d precomputedText(@hib TextView textView, @efb Spanned spanned) {
        a7d.C0081b c0081bBuild;
        if (textView == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c0081bBuild = new a7d.C0081b(textView.getTextMetricsParams());
        } else {
            a7d.C0081b.a aVar = new a7d.C0081b.a(textView.getPaint());
            aVar.setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            c0081bBuild = aVar.build();
        }
        return a7d.create(spanned, c0081bBuild);
    }

    @Override // p000.ku9.InterfaceC8525b
    public void setText(@efb TextView textView, @efb Spanned spanned, @efb TextView.BufferType bufferType, @efb Runnable runnable) {
        this.f56704a.execute(new RunnableC8706a(new WeakReference(textView), spanned, bufferType, runnable));
    }
}
