package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "DataStoreFile")
public final class ei3 {
    @yfb
    public static final File dataStoreFile(@yfb Context context, @yfb String str) {
        md8.checkNotNullParameter(context, "<this>");
        md8.checkNotNullParameter(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + str);
    }
}
