package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class su6 {

    /* JADX INFO: renamed from: a */
    public static final int f82882a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f82883b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f82884c = 4;

    /* JADX INFO: renamed from: d */
    public static final int f82885d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f82886e = 16;

    /* JADX INFO: renamed from: f */
    public static final int f82887f = 32;

    /* JADX INFO: renamed from: g */
    public static final int f82888g = 64;

    /* JADX INFO: renamed from: h */
    public static final String f82889h = "args_id";

    /* JADX INFO: renamed from: i */
    public static final String f82890i = "args_is_hide";

    /* JADX INFO: renamed from: j */
    public static final String f82891j = "args_is_add_stack";

    /* JADX INFO: renamed from: k */
    public static final String f82892k = "args_tag";

    /* JADX INFO: renamed from: su6$a */
    public static class C12790a {

        /* JADX INFO: renamed from: a */
        public final int f82893a;

        /* JADX INFO: renamed from: b */
        public final boolean f82894b;

        /* JADX INFO: renamed from: c */
        public final boolean f82895c;

        /* JADX INFO: renamed from: d */
        public final String f82896d;

        public C12790a(int i, boolean z, boolean z2) {
            this(i, null, z, z2);
        }

        public C12790a(int i, String str, boolean z, boolean z2) {
            this.f82893a = i;
            this.f82896d = str;
            this.f82894b = z;
            this.f82895c = z2;
        }
    }

    /* JADX INFO: renamed from: su6$b */
    public static class C12791b {

        /* JADX INFO: renamed from: a */
        public final Fragment f82897a;

        /* JADX INFO: renamed from: b */
        public final List<C12791b> f82898b;

        public C12791b(Fragment fragment, List<C12791b> list) {
            this.f82897a = fragment;
            this.f82898b = list;
        }

        public Fragment getFragment() {
            return this.f82897a;
        }

        public List<C12791b> getNext() {
            return this.f82898b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f82897a.getClass().getSimpleName());
            sb.append("->");
            List<C12791b> list = this.f82898b;
            sb.append((list == null || list.isEmpty()) ? "no child" : this.f82898b.toString());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: su6$c */
    public interface InterfaceC12792c {
        boolean onBackClick();
    }

    private su6() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        add(fragmentManager, fragment, i, (String) null, false, false);
    }

    private static void addAnim(FragmentTransaction fragmentTransaction, int i, int i2, int i3, int i4) {
        fragmentTransaction.setCustomAnimations(i, i2, i3, i4);
    }

    private static void addSharedElement(FragmentTransaction fragmentTransaction, View... viewArr) {
        for (View view : viewArr) {
            fragmentTransaction.addSharedElement(view, view.getTransitionName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@efb Fragment fragment) {
        if (fragment != 0) {
            return fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof InterfaceC12792c) && ((InterfaceC12792c) fragment).onBackClick();
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Fragment findFragment(@efb FragmentManager fragmentManager, Class<? extends Fragment> cls) {
        if (fragmentManager != null) {
            return fragmentManager.findFragmentByTag(cls.getName());
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static List<C12791b> getAllFragments(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getAllFragments(fragmentManager, new ArrayList());
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static List<C12791b> getAllFragmentsInStack(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getAllFragmentsInStack(fragmentManager, new ArrayList());
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static C12790a getArgs(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        return new C12790a(arguments.getInt(f82889h, fragment.getId()), arguments.getBoolean(f82890i), arguments.getBoolean(f82891j));
    }

    public static List<Fragment> getFragments(@efb FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        return (fragments == null || fragments.isEmpty()) ? Collections.emptyList() : fragments;
    }

    public static List<Fragment> getFragmentsInStack(@efb FragmentManager fragmentManager) {
        Bundle arguments;
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<Fragment> fragments = getFragments(fragmentManager);
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragments) {
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(f82891j)) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    public static String getSimpleName(Fragment fragment) {
        return fragment == null ? "null" : fragment.getClass().getSimpleName();
    }

    public static Fragment getTop(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getTopIsInStack(fragmentManager, null, false);
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Fragment getTopInStack(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getTopIsInStack(fragmentManager, null, true);
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static Fragment getTopIsInStack(@efb FragmentManager fragmentManager, Fragment fragment, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null) {
                if (!z) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(f82891j)) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static Fragment getTopShow(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getTopShowIsInStack(fragmentManager, null, false);
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Fragment getTopShowInStack(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            return getTopShowIsInStack(fragmentManager, null, true);
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static Fragment getTopShowIsInStack(@efb FragmentManager fragmentManager, Fragment fragment, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.isVisible() && fragment2.getUserVisibleHint()) {
                if (!z) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(f82891j)) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static void hide(@efb Fragment fragment) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'hide' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        putArgs(fragment, true);
        operateNoAnim(4, fragment.getFragmentManager(), null, fragment);
    }

    private static void operate(int i, @efb FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null && fragment.isRemoving()) {
            Log.e("FragmentUtils", fragment.getClass().getName() + " is isRemoving");
            return;
        }
        int i2 = 0;
        if (i == 1) {
            int length = fragmentArr.length;
            while (i2 < length) {
                Fragment fragment2 = fragmentArr[i2];
                Bundle arguments = fragment2.getArguments();
                if (arguments == null) {
                    return;
                }
                String string = arguments.getString(f82892k, fragment2.getClass().getName());
                Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(string);
                if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
                    fragmentTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransaction.add(arguments.getInt(f82889h), fragment2, string);
                if (arguments.getBoolean(f82890i)) {
                    fragmentTransaction.hide(fragment2);
                }
                if (arguments.getBoolean(f82891j)) {
                    fragmentTransaction.addToBackStack(string);
                }
                i2++;
            }
        } else if (i == 2) {
            int length2 = fragmentArr.length;
            while (i2 < length2) {
                fragmentTransaction.show(fragmentArr[i2]);
                i2++;
            }
        } else if (i == 4) {
            int length3 = fragmentArr.length;
            while (i2 < length3) {
                fragmentTransaction.hide(fragmentArr[i2]);
                i2++;
            }
        } else if (i == 8) {
            fragmentTransaction.show(fragment);
            int length4 = fragmentArr.length;
            while (i2 < length4) {
                Fragment fragment3 = fragmentArr[i2];
                if (fragment3 != fragment) {
                    fragmentTransaction.hide(fragment3);
                }
                i2++;
            }
        } else if (i == 16) {
            Bundle arguments2 = fragmentArr[0].getArguments();
            if (arguments2 == null) {
                return;
            }
            String string2 = arguments2.getString(f82892k, fragmentArr[0].getClass().getName());
            fragmentTransaction.replace(arguments2.getInt(f82889h), fragmentArr[0], string2);
            if (arguments2.getBoolean(f82891j)) {
                fragmentTransaction.addToBackStack(string2);
            }
        } else if (i == 32) {
            int length5 = fragmentArr.length;
            while (i2 < length5) {
                Fragment fragment4 = fragmentArr[i2];
                if (fragment4 != fragment) {
                    fragmentTransaction.remove(fragment4);
                }
                i2++;
            }
        } else if (i == 64) {
            int length6 = fragmentArr.length - 1;
            while (true) {
                if (length6 < 0) {
                    break;
                }
                Fragment fragment5 = fragmentArr[length6];
                if (fragment5 != fragmentArr[0]) {
                    fragmentTransaction.remove(fragment5);
                    length6--;
                } else if (fragment != null) {
                    fragmentTransaction.remove(fragment5);
                }
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    private static void operateNoAnim(int i, @hib FragmentManager fragmentManager, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            return;
        }
        operate(i, fragmentManager, fragmentManager.beginTransaction(), fragment, fragmentArr);
    }

    public static void pop(@efb FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        pop(fragmentManager, true);
    }

    public static void popAll(@efb FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        popAll(fragmentManager, true);
    }

    public static void popTo(@efb FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        popTo(fragmentManager, cls, z, true);
    }

    private static void putArgs(Fragment fragment, C12790a c12790a) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putInt(f82889h, c12790a.f82893a);
        arguments.putBoolean(f82890i, c12790a.f82894b);
        arguments.putBoolean(f82891j, c12790a.f82895c);
        arguments.putString(f82892k, c12790a.f82896d);
    }

    public static void remove(@efb Fragment fragment) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'remove' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        operateNoAnim(32, fragment.getFragmentManager(), null, fragment);
    }

    public static void removeAll(@efb FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        operateNoAnim(32, fragmentManager, null, (Fragment[]) getFragments(fragmentManager).toArray(new Fragment[0]));
    }

    public static void removeTo(@efb Fragment fragment, boolean z) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'removeTo' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        operateNoAnim(64, fragment.getFragmentManager(), z ? fragment : null, fragment);
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 == null) {
            throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        replace(fragment, fragment2, (String) null, false);
    }

    public static void setBackground(@efb Fragment fragment, Drawable drawable) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'fragment' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        view.setBackground(drawable);
    }

    public static void setBackgroundColor(@efb Fragment fragment, @g92 int i) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'fragment' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public static void setBackgroundResource(@efb Fragment fragment, @gq4 int i) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'fragment' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    public static void show(@efb Fragment fragment) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        putArgs(fragment, false);
        operateNoAnim(2, fragment.getFragmentManager(), null, fragment);
    }

    public static void showHide(@efb Fragment fragment, @efb Fragment fragment2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 == null) {
            throw new NullPointerException("Argument 'hide' of type Fragment (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2));
    }

    public static Fragment findFragment(@efb FragmentManager fragmentManager, @efb String str) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            return fragmentManager.findFragmentByTag(str);
        }
        throw new NullPointerException("Argument 'tag' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static List<C12791b> getAllFragments(@efb FragmentManager fragmentManager, List<C12791b> list) {
        if (fragmentManager != null) {
            List<Fragment> fragments = getFragments(fragmentManager);
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = fragments.get(size);
                if (fragment != null) {
                    list.add(new C12791b(fragment, getAllFragments(fragment.getChildFragmentManager(), new ArrayList())));
                }
            }
            return list;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static List<C12791b> getAllFragmentsInStack(@efb FragmentManager fragmentManager, List<C12791b> list) {
        Bundle arguments;
        if (fragmentManager != null) {
            List<Fragment> fragments = getFragments(fragmentManager);
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = fragments.get(size);
                if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(f82891j)) {
                    list.add(new C12791b(fragment, getAllFragmentsInStack(fragment.getChildFragmentManager(), new ArrayList())));
                }
            }
            return list;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void pop(@efb FragmentManager fragmentManager, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            fragmentManager.popBackStackImmediate();
        } else {
            fragmentManager.popBackStack();
        }
    }

    public static void popAll(@efb FragmentManager fragmentManager, boolean z) {
        if (fragmentManager != null) {
            if (fragmentManager.getBackStackEntryCount() > 0) {
                FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(0);
                if (z) {
                    fragmentManager.popBackStackImmediate(backStackEntryAt.getId(), 1);
                    return;
                } else {
                    fragmentManager.popBackStack(backStackEntryAt.getId(), 1);
                    return;
                }
            }
            return;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void popTo(@efb FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z, boolean z2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z2) {
            fragmentManager.popBackStackImmediate(cls.getName(), z ? 1 : 0);
        } else {
            fragmentManager.popBackStack(cls.getName(), z ? 1 : 0);
        }
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, (String) null, z, false);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void hide(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            List<Fragment> fragments = getFragments(fragmentManager);
            Iterator<Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                putArgs(it.next(), true);
            }
            operateNoAnim(4, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
            return;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, boolean z) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, z);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void show(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            List<Fragment> fragments = getFragments(fragmentManager);
            Iterator<Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                putArgs(it.next(), false);
            }
            operateNoAnim(2, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
            return;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(int i, @efb Fragment... fragmentArr) {
        if (fragmentArr != null) {
            showHide(fragmentArr[i], fragmentArr);
            return;
        }
        throw new NullPointerException("Argument 'fragments' of type Fragment[] (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@efb FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            List<Fragment> fragments = getFragments(fragmentManager);
            if (fragments != null && !fragments.isEmpty()) {
                for (int size = fragments.size() - 1; size >= 0; size--) {
                    Fragment fragment = fragments.get(size);
                    if (fragment != 0 && fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof InterfaceC12792c) && ((InterfaceC12792c) fragment).onBackClick()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(@efb Fragment fragment, @efb Fragment... fragmentArr) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragmentArr != null) {
            showHide(fragment, (List<Fragment>) Arrays.asList(fragmentArr));
            return;
        }
        throw new NullPointerException("Argument 'hide' of type Fragment[] (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, boolean z2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, (String) null, z, z2);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, false, i, i2, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static void putArgs(Fragment fragment, boolean z) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putBoolean(f82890i, z);
    }

    public static void showHide(int i, @efb List<Fragment> list) {
        if (list != null) {
            showHide(list.get(i), list);
            return;
        }
        throw new NullPointerException("Argument 'fragments' of type List<Fragment> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, null, false, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, z, i, i2, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(@efb Fragment fragment, @efb List<Fragment> list) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (list != null) {
            Iterator<Fragment> it = list.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    Fragment next = it.next();
                    if (next != fragment) {
                        z = true;
                    }
                    putArgs(next, z);
                } else {
                    operateNoAnim(8, fragment.getFragmentManager(), fragment, (Fragment[]) list.toArray(new Fragment[0]));
                    return;
                }
            }
        } else {
            throw new NullPointerException("Argument 'hide' of type List<Fragment> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, null, z, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, false, i, i2, i3, i4);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(@efb Fragment fragment, @efb Fragment fragment2, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2), i, i2, i3, i4);
            return;
        }
        throw new NullPointerException("Argument 'hide' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, null, false, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, z, i, i2, i3, i4);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(int i, @efb List<Fragment> list, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (list != null) {
            showHide(list.get(i), list, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'fragments' of type List<Fragment> (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, null, z, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, View... viewArr) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void showHide(@efb Fragment fragment, @efb List<Fragment> list, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (list != null) {
            Iterator<Fragment> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next != fragment) {
                    z = true;
                }
                putArgs(next, z);
            }
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                addAnim(fragmentTransactionBeginTransaction, i, i2, i3, i4);
                operate(8, fragmentManager, fragmentTransactionBeginTransaction, fragment, (Fragment[]) list.toArray(new Fragment[0]));
                return;
            }
            return;
        }
        throw new NullPointerException("Argument 'hide' of type List<Fragment> (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, @efb View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (viewArr != null) {
            add(fragmentManager, fragment, i, (String) null, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'sharedElements' of type View[] (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, boolean z, View... viewArr) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, (String) null, z, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, (String) null, false);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, @efb View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (viewArr != null) {
            add(fragmentManager, fragment, i, (String) null, z, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'sharedElements' of type View[] (#4 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, (String) null, z);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb List<Fragment> list, @kr7 int i, int i2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (list != null) {
            add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i, (String[]) null, i2);
            return;
        }
        throw new NullPointerException("Argument 'adds' of type List<Fragment> (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, null, false, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment[] fragmentArr, @kr7 int i, int i2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragmentArr != null) {
            add(fragmentManager, fragmentArr, i, (String[]) null, i2);
            return;
        }
        throw new NullPointerException("Argument 'adds' of type Fragment[] (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, null, z, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, str, false, false);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, null, false, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, str, z, false);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, null, z, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, boolean z2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            putArgs(fragment, new C12790a(i, str, z, z2));
            operateNoAnim(1, fragmentManager, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, (String) null, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, str, false, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, boolean z, View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, (String) null, z, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, str, z, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, str, false);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            add(fragmentManager, fragment, i, str, false, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, boolean z) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager == null) {
                return;
            }
            replace(fragmentManager, fragment2, getArgs(fragment).f82893a, str, z);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            putArgs(fragment, new C12790a(i, str, false, z));
            addAnim(fragmentTransactionBeginTransaction, i2, i3, i4, i5);
            operate(1, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, str, false, i, i2, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, str, z, i, i2, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, @efb View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (viewArr != null) {
            add(fragmentManager, fragment, i, str, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'sharedElements' of type View[] (#4 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, str, false, i, i2, i3, i4);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, @efb View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (viewArr != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            putArgs(fragment, new C12790a(i, str, false, z));
            addSharedElement(fragmentTransactionBeginTransaction, viewArr);
            operate(1, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'sharedElements' of type View[] (#5 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager == null) {
                return;
            }
            replace(fragmentManager, fragment2, getArgs(fragment).f82893a, str, z, i, i2, i3, i4);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, View... viewArr) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            replace(fragment, fragment2, str, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb List<Fragment> list, @kr7 int i, String[] strArr, int i2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (list != null) {
            add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i, strArr, i2);
            return;
        }
        throw new NullPointerException("Argument 'adds' of type List<Fragment> (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb Fragment fragment, @efb Fragment fragment2, String str, boolean z, View... viewArr) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'srcFragment' of type Fragment (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager == null) {
                return;
            }
            replace(fragmentManager, fragment2, getArgs(fragment).f82893a, str, z, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'destFragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void add(@efb FragmentManager fragmentManager, @efb Fragment[] fragmentArr, @kr7 int i, String[] strArr, int i2) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragmentArr != null) {
            if (strArr == null) {
                int length = fragmentArr.length;
                int i3 = 0;
                while (i3 < length) {
                    putArgs(fragmentArr[i3], new C12790a(i, null, i2 != i3, false));
                    i3++;
                }
            } else {
                int length2 = fragmentArr.length;
                int i4 = 0;
                while (i4 < length2) {
                    putArgs(fragmentArr[i4], new C12790a(i, strArr[i4], i2 != i4, false));
                    i4++;
                }
            }
            operateNoAnim(1, fragmentManager, null, fragmentArr);
            return;
        }
        throw new NullPointerException("Argument 'adds' of type Fragment[] (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, str, false);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            putArgs(fragment, new C12790a(i, str, false, z));
            operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, str, false, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, str, z, i2, i3, 0, 0);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 7, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, str, false, i2, i3, i4, i5);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 8, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, @InterfaceC6036fz @InterfaceC12810sw int i2, @InterfaceC6036fz @InterfaceC12810sw int i3, @InterfaceC6036fz @InterfaceC12810sw int i4, @InterfaceC6036fz @InterfaceC12810sw int i5) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            putArgs(fragment, new C12790a(i, str, false, z));
            addAnim(fragmentTransactionBeginTransaction, i2, i3, i4, i5);
            operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            replace(fragmentManager, fragment, i, str, false, viewArr);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void replace(@efb FragmentManager fragmentManager, @efb Fragment fragment, @kr7 int i, String str, boolean z, View... viewArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            putArgs(fragment, new C12790a(i, str, false, z));
            addSharedElement(fragmentTransactionBeginTransaction, viewArr);
            operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
            return;
        }
        throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
