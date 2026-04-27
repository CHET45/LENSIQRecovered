package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.eyevue.glassapp.view.guidance.GuideCommonFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zai extends ru6 {

    /* JADX INFO: renamed from: l */
    public final List<ekg> f104644l;

    public zai(@efb FragmentActivity fragmentActivity, List<ekg> tabNameModes) {
        super(fragmentActivity);
        this.f104644l = tabNameModes;
    }

    @Override // p000.ru6
    @efb
    public Fragment createFragment(int position) {
        return GuideCommonFragment.newInstance(this.f104644l.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104644l.size();
    }
}
