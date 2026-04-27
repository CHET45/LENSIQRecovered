package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s6e extends zs0<s6e> {

    /* JADX INFO: renamed from: b */
    public static final s6e f80844b = new s6e(Collections.emptyList());

    private s6e(List<String> list) {
        super(list);
    }

    public static s6e fromSegments(List<String> list) {
        return list.isEmpty() ? f80844b : new s6e(list);
    }

    public static s6e fromString(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] strArrSplit = str.split(pj4.f71071b);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new s6e(arrayList);
    }

    @Override // p000.zs0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s6e mo21762a(List<String> list) {
        return new s6e(list);
    }

    @Override // p000.zs0
    public String canonicalString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f105873a.size(); i++) {
            if (i > 0) {
                sb.append(pj4.f71071b);
            }
            sb.append(this.f105873a.get(i));
        }
        return sb.toString();
    }
}
