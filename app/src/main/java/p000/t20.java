package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000.uv2;

/* JADX INFO: loaded from: classes.dex */
public final class t20 {

    /* JADX INFO: renamed from: a */
    public static final String f83444a = "ReceiveContent";

    /* JADX INFO: renamed from: t20$a */
    @c5e(24)
    public static final class C12853a {
        private C12853a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m22332a(@efb DragEvent dragEvent, @efb TextView textView, @efb Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                o8i.performReceiveContent(textView, new uv2.C13727b(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m22333b(@efb DragEvent dragEvent, @efb View view, @efb Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            o8i.performReceiveContent(view, new uv2.C13727b(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    private t20() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22329a(@efb View view, @efb DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && o8i.getOnReceiveContentMimeTypes(view) != null) {
            Activity activityM22331c = m22331c(view);
            if (activityM22331c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? C12853a.m22332a(dragEvent, (TextView) view, activityM22331c) : C12853a.m22333b(dragEvent, view, activityM22331c);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22330b(@efb TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || o8i.getOnReceiveContentMimeTypes(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            o8i.performReceiveContent(textView, new uv2.C13727b(primaryClip, 1).setFlags(i != 16908322 ? 1 : 0).build());
        }
        return true;
    }

    @hib
    /* JADX INFO: renamed from: c */
    public static Activity m22331c(@efb View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
