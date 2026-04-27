package p000;

import java.util.ArrayList;
import java.util.List;
import p000.uyh;
import p000.zs0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zs0<B extends zs0<B>> implements Comparable<B> {

    /* JADX INFO: renamed from: a */
    public final List<String> f105873a;

    public zs0(List<String> list) {
        this.f105873a = list;
    }

    private static int compareSegments(String str, String str2) {
        boolean zIsNumericId = isNumericId(str);
        boolean zIsNumericId2 = isNumericId(str2);
        if (zIsNumericId && !zIsNumericId2) {
            return -1;
        }
        if (zIsNumericId || !zIsNumericId2) {
            return (zIsNumericId && zIsNumericId2) ? Long.compare(extractNumericId(str), extractNumericId(str2)) : r0i.compareUtf8Strings(str, str2);
        }
        return 1;
    }

    private static long extractNumericId(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    private static boolean isNumericId(String str) {
        return str.startsWith("__id") && str.endsWith(uyh.C13797c.f89516d);
    }

    /* JADX INFO: renamed from: a */
    public abstract B mo21762a(List<String> list);

    public B append(String str) {
        ArrayList arrayList = new ArrayList(this.f105873a);
        arrayList.add(str);
        return (B) mo21762a(arrayList);
    }

    public abstract String canonicalString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs0) && compareTo((zs0) obj) == 0;
    }

    public String getFirstSegment() {
        return this.f105873a.get(0);
    }

    public String getLastSegment() {
        return this.f105873a.get(length() - 1);
    }

    public String getSegment(int i) {
        return this.f105873a.get(i);
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f105873a.hashCode();
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public boolean isImmediateParentOf(B b) {
        if (length() + 1 != b.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!getSegment(i).equals(b.getSegment(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrefixOf(B b) {
        if (length() > b.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!getSegment(i).equals(b.getSegment(i))) {
                return false;
            }
        }
        return true;
    }

    public B keepFirst(int i) {
        return (B) mo21762a(this.f105873a.subList(0, i));
    }

    public int length() {
        return this.f105873a.size();
    }

    public B popFirst() {
        return (B) popFirst(1);
    }

    public B popLast() {
        return (B) mo21762a(this.f105873a.subList(0, length() - 1));
    }

    public String toString() {
        return canonicalString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb B b) {
        int length = length();
        int length2 = b.length();
        for (int i = 0; i < length && i < length2; i++) {
            int iCompareSegments = compareSegments(getSegment(i), b.getSegment(i));
            if (iCompareSegments != 0) {
                return iCompareSegments;
            }
        }
        return Integer.compare(length, length2);
    }

    public B popFirst(int i) {
        int length = length();
        r80.hardAssert(length >= i, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i), Integer.valueOf(length));
        return (B) mo21762a(this.f105873a.subList(i, length));
    }

    public B append(B b) {
        ArrayList arrayList = new ArrayList(this.f105873a);
        arrayList.addAll(b.f105873a);
        return (B) mo21762a(arrayList);
    }
}
