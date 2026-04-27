package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
public class ve7 implements qe7 {

    /* JADX INFO: renamed from: a */
    public byte[] f90790a;

    /* JADX INFO: renamed from: b */
    public TreeMap<String, String> f90791b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // p000.ue7
    public byte[] getContent() {
        return this.f90790a;
    }

    @Override // p000.ue7
    public String getFieldValue(String str) {
        String str2 = this.f90791b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // p000.ue7
    public boolean hasFieldValue(String str) {
        return this.f90791b.containsKey(str);
    }

    @Override // p000.ue7
    public Iterator<String> iterateHttpFields() {
        return Collections.unmodifiableSet(this.f90791b.keySet()).iterator();
    }

    @Override // p000.qe7
    public void put(String str, String str2) {
        this.f90791b.put(str, str2);
    }

    @Override // p000.qe7
    public void setContent(byte[] bArr) {
        this.f90790a = bArr;
    }
}
