package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class rw2 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f79914a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<String> f79915b = new ArrayList();

    @op1
    private rw2 checkAndSet(String str, Object obj) {
        this.f79914a.put((String) v80.checkNotNull(str), v80.checkNotNull(obj));
        this.f79915b.remove(str);
        return this;
    }

    public static rw2 setContentLength(rw2 rw2Var, long j) {
        return rw2Var.set("exo_len", j);
    }

    public static rw2 setRedirectedUri(rw2 rw2Var, @hib Uri uri) {
        return uri == null ? rw2Var.remove("exo_redir") : rw2Var.set("exo_redir", uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.f79914a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.f79915b));
    }

    @op1
    public rw2 remove(String str) {
        this.f79915b.add(str);
        this.f79914a.remove(str);
        return this;
    }

    @op1
    public rw2 set(String str, String str2) {
        return checkAndSet(str, str2);
    }

    @op1
    public rw2 set(String str, long j) {
        return checkAndSet(str, Long.valueOf(j));
    }

    @op1
    public rw2 set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }
}
