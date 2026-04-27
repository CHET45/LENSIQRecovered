package p000;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class xxh {
    @yfb
    public static final File toFile(@yfb Uri uri) {
        if (!md8.areEqual(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @yfb
    public static final Uri toUri(@yfb String str) {
        return Uri.parse(str);
    }

    @yfb
    public static final Uri toUri(@yfb File file) {
        return Uri.fromFile(file);
    }
}
