package p000;

import android.R;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import java.util.List;
import p000.p7e;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class C10727p {
    @q21({"android:entries"})
    public static <T extends CharSequence> void setEntries(AbsSpinner absSpinner, T[] tArr) {
        if (tArr == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter != null && adapter.getCount() == tArr.length) {
            for (int i = 0; i < tArr.length; i++) {
                if (tArr[i].equals(adapter.getItem(i))) {
                }
            }
            return;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), R.layout.simple_spinner_item, tArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    @q21({"android:entries"})
    public static <T> void setEntries(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof erb) {
                ((erb) adapter).setList(list);
                return;
            } else {
                absSpinner.setAdapter((SpinnerAdapter) new erb(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
                return;
            }
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
