package p000;

import android.view.View;
import androidx.transition.AbstractC1458q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class sfh {

    /* JADX INFO: renamed from: b */
    public View f81693b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f81692a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC1458q> f81694c = new ArrayList<>();

    @Deprecated
    public sfh() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sfh)) {
            return false;
        }
        sfh sfhVar = (sfh) obj;
        return this.f81693b == sfhVar.f81693b && this.f81692a.equals(sfhVar.f81692a);
    }

    public int hashCode() {
        return (this.f81693b.hashCode() * 31) + this.f81692a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f81693b + "\n") + "    values:";
        for (String str2 : this.f81692a.keySet()) {
            str = str + pl8.f71328a + str2 + ": " + this.f81692a.get(str2) + "\n";
        }
        return str;
    }

    public sfh(@efb View view) {
        this.f81693b = view;
    }
}
