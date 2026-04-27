package p000;

import android.content.UriMatcher;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class ayh {
    private ayh() {
    }

    @efb
    public static o8d<Uri> asPredicate(@efb final UriMatcher uriMatcher) {
        return new o8d() { // from class: zxh
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return ayh.lambda$asPredicate$0(uriMatcher, (Uri) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
