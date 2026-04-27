package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class qw2 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f75969a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<String> f75970b = new ArrayList();

    @op1
    private qw2 checkAndSet(String str, Object obj) {
        this.f75969a.put((String) u80.checkNotNull(str), u80.checkNotNull(obj));
        this.f75970b.remove(str);
        return this;
    }

    public static qw2 setContentLength(qw2 qw2Var, long j) {
        return qw2Var.set("exo_len", j);
    }

    public static qw2 setRedirectedUri(qw2 qw2Var, @hib Uri uri) {
        return uri == null ? qw2Var.remove("exo_redir") : qw2Var.set("exo_redir", uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.f75969a);
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
        return Collections.unmodifiableList(new ArrayList(this.f75970b));
    }

    @op1
    public qw2 remove(String str) {
        this.f75970b.add(str);
        this.f75969a.remove(str);
        return this;
    }

    @op1
    public qw2 set(String str, String str2) {
        return checkAndSet(str, str2);
    }

    @op1
    public qw2 set(String str, long j) {
        return checkAndSet(str, Long.valueOf(j));
    }

    @op1
    public qw2 set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }
}
