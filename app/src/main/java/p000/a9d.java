package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "PreferenceDataStoreFile")
public final class a9d {
    @yfb
    public static final File preferencesDataStoreFile(@yfb Context context, @yfb String str) {
        md8.checkNotNullParameter(context, "<this>");
        md8.checkNotNullParameter(str, "name");
        return ei3.dataStoreFile(context, str + ".preferences_pb");
    }
}
