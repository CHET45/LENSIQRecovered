package p000;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class az1 extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a */
    public static final Property<ViewGroup, Float> f12217a = new az1("childrenAlpha");

    private az1(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @efb
    public Float get(@efb ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C3146R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@efb ViewGroup viewGroup, @efb Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(C3146R.id.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
