package p000;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class epc {

    /* JADX INFO: renamed from: a */
    public FragmentActivity f33814a;

    /* JADX INFO: renamed from: b */
    public Fragment f33815b;

    public epc(@yfb FragmentActivity fragmentActivity) {
        md8.checkNotNullParameter(fragmentActivity, "activity");
        this.f33814a = fragmentActivity;
    }

    @yfb
    public final znc permissions(@yfb List<String> list) {
        int i;
        md8.checkNotNullParameter(list, "permissions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i2 = Build.VERSION.SDK_INT;
        FragmentActivity fragmentActivity = this.f33814a;
        if (fragmentActivity != null) {
            md8.checkNotNull(fragmentActivity);
            i = fragmentActivity.getApplicationInfo().targetSdkVersion;
        } else {
            Fragment fragment = this.f33815b;
            md8.checkNotNull(fragment);
            Context context = fragment.getContext();
            md8.checkNotNull(context);
            md8.checkNotNullExpressionValue(context, "fragment!!.context!!");
            i = context.getApplicationInfo().targetSdkVersion;
        }
        for (String str : list) {
            if (dpc.getAllSpecialPermissions().contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i2 == 29 || (i2 == 30 && i < 30))) {
            linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return new znc(this.f33814a, this.f33815b, linkedHashSet, linkedHashSet2);
    }

    public epc(@yfb Fragment fragment) {
        md8.checkNotNullParameter(fragment, "fragment");
        this.f33815b = fragment;
    }

    @yfb
    public final znc permissions(@yfb String... strArr) {
        md8.checkNotNullParameter(strArr, "permissions");
        return permissions(l82.listOf(Arrays.copyOf(strArr, strArr.length)));
    }
}
