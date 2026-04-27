package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.watchfun.base.BaseFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hr9 extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<BaseFragment> f44627a;

    public hr9(List<BaseFragment> fragmentList, FragmentManager fm) {
        super(fm, 0);
        this.f44627a = new ArrayList();
        if (fragmentList != null) {
            this.f44627a = fragmentList;
        }
    }

    @Override // p000.ebc
    public int getCount() {
        return this.f44627a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @efb
    public Fragment getItem(int position) {
        return this.f44627a.get(position);
    }
}
