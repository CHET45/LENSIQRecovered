package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class x20 {

    /* JADX INFO: renamed from: a */
    @efb
    public TextView f96045a;

    /* JADX INFO: renamed from: b */
    @hib
    public TextClassifier f96046b;

    /* JADX INFO: renamed from: x20$a */
    @c5e(26)
    public static final class C14876a {
        private C14876a() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static TextClassifier m24914a(@efb TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public x20(@efb TextView textView) {
        this.f96045a = (TextView) z7d.checkNotNull(textView);
    }

    @c5e(api = 26)
    @efb
    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.f96046b;
        return textClassifier == null ? C14876a.m24914a(this.f96045a) : textClassifier;
    }

    @c5e(api = 26)
    public void setTextClassifier(@hib TextClassifier textClassifier) {
        this.f96046b = textClassifier;
    }
}
