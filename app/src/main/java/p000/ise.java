package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class ise implements Comparable<ise> {
    public static ise create(String str, long j) {
        return new tl0(str, j);
    }

    public abstract long getMillis();

    public abstract String getSdkName();

    @Override // java.lang.Comparable
    public int compareTo(ise iseVar) {
        return getMillis() < iseVar.getMillis() ? -1 : 1;
    }
}
