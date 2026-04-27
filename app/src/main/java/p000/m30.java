package p000;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public class m30 {

    /* JADX INFO: renamed from: b */
    public static Stack<Activity> f59795b;

    /* JADX INFO: renamed from: c */
    public static Stack<Fragment> f59796c;

    /* JADX INFO: renamed from: d */
    public static m30 f59797d;

    /* JADX INFO: renamed from: a */
    public Context f59798a;

    private m30() {
    }

    public static Stack<Activity> getActivityStack() {
        return f59795b;
    }

    public static m30 getAppManager() {
        if (f59797d == null) {
            f59797d = new m30();
        }
        return f59797d;
    }

    public static Stack<Fragment> getFragmentStack() {
        return f59796c;
    }

    public void AppExit() {
        try {
            finishAllActivity();
        } catch (Exception e) {
            f59795b.clear();
            e.printStackTrace();
        }
    }

    public void addActivity(Activity activity) {
        if (f59795b == null) {
            f59795b = new Stack<>();
        }
        f59795b.add(activity);
    }

    public void addFragment(Fragment fragment) {
        if (f59796c == null) {
            f59796c = new Stack<>();
        }
        f59796c.add(fragment);
    }

    public Activity currentActivity() {
        return f59795b.lastElement();
    }

    public Fragment currentFragment() {
        Stack<Fragment> stack = f59796c;
        if (stack != null) {
            return stack.lastElement();
        }
        return null;
    }

    public void finishActivity() {
        finishActivity(f59795b.lastElement());
    }

    public void finishAllActivity() {
        int size = f59795b.size();
        for (int i = 0; i < size; i++) {
            if (f59795b.get(i) != null) {
                finishActivity(f59795b.get(i));
            }
        }
        f59795b.clear();
    }

    public Activity getActivity(Class<?> cls) {
        Stack<Activity> stack = f59795b;
        if (stack == null) {
            return null;
        }
        for (Activity activity : stack) {
            if (activity.getClass().equals(cls)) {
                return activity;
            }
        }
        return null;
    }

    public void init(Context context) {
        this.f59798a = context.getApplicationContext();
    }

    public boolean isActivity() {
        if (f59795b != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    public boolean isFragment() {
        if (f59796c != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    public void popAllActivity() {
    }

    public void removeActivity(Activity activity) {
        if (activity != null) {
            f59795b.remove(activity);
        }
    }

    public void removeFragment(Fragment fragment) {
        if (fragment != null) {
            f59796c.remove(fragment);
        }
    }

    public void finishActivity(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public void finishActivity(Class<?> cls) {
        for (Activity activity : f59795b) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
                return;
            }
        }
    }
}
