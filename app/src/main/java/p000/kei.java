package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.watchfun.voicenotes.CommonWebViewActivity;

/* JADX INFO: loaded from: classes7.dex */
public class kei {
    public static void toVoiceNoteDetailPage(Context context, String str, String str2, byte[] bArr) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) CommonWebViewActivity.class);
        bundle.putString(CommonWebViewActivity.f26185L, "");
        bundle.putString("url", iei.f46707a + str2 + "?path=" + (iei.f46708b + str));
        bundle.putString("id", str2);
        bundle.putBoolean(CommonWebViewActivity.f26186M, false);
        bundle.putString("file_id", str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
