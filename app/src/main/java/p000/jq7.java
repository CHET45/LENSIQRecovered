package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface jq7 {
    void init(Context context);

    void onEvent(Context context, String title);

    void onEvent(Context context, String event, Bundle bundle);

    void onEvent(Context context, String key, ArrayMap<String, String> params);

    void onEvent(String key, String event);

    void onEvent(String key, Map<String, Object> map);

    void setEnable(boolean enable);
}
