package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class rm7 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, String> f78723c = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public final Appendable f78724a;

    /* JADX INFO: renamed from: b */
    public char f78725b = 0;

    public rm7(Appendable appendable) {
        if (appendable == null) {
            throw new NullPointerException("out must not be null");
        }
        this.f78724a = appendable;
    }

    /* JADX INFO: renamed from: a */
    public void m21426a(String str) {
        try {
            this.f78724a.append(str);
            int length = str.length();
            if (length != 0) {
                this.f78725b = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void line() {
        char c = this.f78725b;
        if (c == 0 || c == '\n') {
            return;
        }
        m21426a("\n");
    }

    public void raw(String str) {
        m21426a(str);
    }

    public void tag(String str) {
        tag(str, f78723c);
    }

    public void text(String str) {
        m21426a(n55.escapeHtml(str));
    }

    public void tag(String str, Map<String, String> map) {
        tag(str, map, false);
    }

    public void tag(String str, Map<String, String> map, boolean z) {
        m21426a("<");
        m21426a(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m21426a(C2473f.f17566z);
                m21426a(n55.escapeHtml(entry.getKey()));
                m21426a("=\"");
                m21426a(n55.escapeHtml(entry.getValue()));
                m21426a("\"");
            }
        }
        if (z) {
            m21426a(" /");
        }
        m21426a(">");
    }
}
