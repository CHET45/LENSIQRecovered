package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface jm7 {
    String encodeUrl(String str);

    Map<String, String> extendAttributes(deb debVar, String str, Map<String, String> map);

    String getSoftbreak();

    rm7 getWriter();

    void render(deb debVar);

    boolean shouldEscapeHtml();
}
