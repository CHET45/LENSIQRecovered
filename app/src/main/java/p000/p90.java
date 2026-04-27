package p000;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import io.noties.markwon.C7528R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p90 {

    /* JADX INFO: renamed from: p90$a */
    public class ViewOnAttachStateChangeListenerC10855a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f70057a;

        public ViewOnAttachStateChangeListenerC10855a(TextView textView) {
            this.f70057a = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            p90.unschedule(this.f70057a);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(C7528R.id.markwon_drawables_scheduler, null);
        }
    }

    /* JADX INFO: renamed from: p90$b */
    public static class C10856b implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public final TextView f70058a;

        /* JADX INFO: renamed from: b */
        public final b f70059b;

        /* JADX INFO: renamed from: c */
        public Rect f70060c;

        /* JADX INFO: renamed from: p90$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Drawable f70061a;

            public a(Drawable drawable) {
                this.f70061a = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10856b.this.invalidateDrawable(this.f70061a);
            }
        }

        /* JADX INFO: renamed from: p90$b$b */
        public interface b {
            void invalidate();
        }

        public C10856b(@efb TextView textView, @efb b bVar, Rect rect) {
            this.f70058a = textView;
            this.f70059b = bVar;
            this.f70060c = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@efb Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f70058a.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.f70060c.equals(bounds)) {
                this.f70058a.postInvalidate();
            } else {
                this.f70059b.invalidate();
                this.f70060c = new Rect(bounds);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
            this.f70058a.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
            this.f70058a.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: p90$c */
    public static class RunnableC10857c implements C10856b.b, Runnable {

        /* JADX INFO: renamed from: a */
        public final TextView f70063a;

        public RunnableC10857c(@efb TextView textView) {
            this.f70063a = textView;
        }

        @Override // p000.p90.C10856b.b
        public void invalidate() {
            this.f70063a.removeCallbacks(this);
            this.f70063a.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f70063a;
            textView.setText(textView.getText());
        }
    }

    private p90() {
    }

    @hib
    private static q90[] extractSpans(@efb TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (q90[]) ((Spanned) text).getSpans(0, length, q90.class);
    }

    public static void schedule(@efb TextView textView) {
        Integer num = (Integer) textView.getTag(C7528R.id.markwon_drawables_scheduler_last_text_hashcode);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(C7528R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(iHashCode));
            q90[] q90VarArrExtractSpans = extractSpans(textView);
            if (q90VarArrExtractSpans == null || q90VarArrExtractSpans.length <= 0) {
                return;
            }
            if (textView.getTag(C7528R.id.markwon_drawables_scheduler) == null) {
                ViewOnAttachStateChangeListenerC10855a viewOnAttachStateChangeListenerC10855a = new ViewOnAttachStateChangeListenerC10855a(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC10855a);
                textView.setTag(C7528R.id.markwon_drawables_scheduler, viewOnAttachStateChangeListenerC10855a);
            }
            RunnableC10857c runnableC10857c = new RunnableC10857c(textView);
            for (q90 q90Var : q90VarArrExtractSpans) {
                m90 drawable = q90Var.getDrawable();
                drawable.setCallback2(new C10856b(textView, runnableC10857c, drawable.getBounds()));
            }
        }
    }

    public static void unschedule(@efb TextView textView) {
        if (textView.getTag(C7528R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        textView.setTag(C7528R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        q90[] q90VarArrExtractSpans = extractSpans(textView);
        if (q90VarArrExtractSpans == null || q90VarArrExtractSpans.length <= 0) {
            return;
        }
        for (q90 q90Var : q90VarArrExtractSpans) {
            q90Var.getDrawable().setCallback2(null);
        }
    }
}
