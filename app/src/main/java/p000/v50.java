package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class v50 extends AssertionError {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final List<Integer> f89992a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final String f89993b;

    public v50(String str, AssertionError assertionError, int i) {
        this.f89993b = str;
        initCause(assertionError);
        addDimension(i);
    }

    public void addDimension(int i) {
        this.f89992a.add(0, Integer.valueOf(i));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.f89993b;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        Iterator<Integer> it = this.f89992a.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            sb.append("[");
            sb.append(iIntValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
