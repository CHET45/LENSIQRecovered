package p000;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class r37 extends o0c<r37> implements ug7 {
    /* JADX INFO: renamed from: a */
    public String m20964a(String str, Map<String, String> map) {
        if (str == null || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str2, map.get(str2));
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p000.o0c
    public u3e build() {
        Map<String, String> map = this.f66177d;
        if (map != null) {
            this.f66174a = m20964a(this.f66174a, map);
        }
        return new x47(this.f66174a, this.f66175b, this.f66177d, this.f66176c, this.f66178e).build();
    }

    @Override // p000.ug7
    public /* bridge */ /* synthetic */ o0c params(Map map) {
        return params((Map<String, String>) map);
    }

    @Override // p000.ug7
    public r37 addParams(String str, String str2) {
        if (this.f66177d == null) {
            this.f66177d = new LinkedHashMap();
        }
        this.f66177d.put(str, str2);
        return this;
    }

    @Override // p000.ug7
    public r37 params(Map<String, String> map) {
        this.f66177d = map;
        return this;
    }
}
