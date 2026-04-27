package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class xoc extends Fragment implements Runnable {

    /* JADX INFO: renamed from: C */
    public static final String f98808C = "request_code";

    /* JADX INFO: renamed from: F */
    public static final List<Integer> f98809F = new ArrayList();

    /* JADX INFO: renamed from: m */
    public static final String f98810m = "request_permissions";

    /* JADX INFO: renamed from: a */
    public boolean f98811a;

    /* JADX INFO: renamed from: b */
    public boolean f98812b;

    /* JADX INFO: renamed from: c */
    public boolean f98813c;

    /* JADX INFO: renamed from: d */
    @hib
    public y3c f98814d;

    /* JADX INFO: renamed from: e */
    @hib
    public a4c f98815e;

    /* JADX INFO: renamed from: f */
    public int f98816f;

    /* JADX INFO: renamed from: xoc$a */
    public class C15233a implements a4c {
        public C15233a() {
        }
    }

    /* JADX INFO: renamed from: xoc$b */
    public class C15234b implements y3c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f98818a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f98819b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f98820c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f98821d;

        /* JADX INFO: renamed from: xoc$b$a */
        public class a implements a4c {
            public a() {
            }
        }

        /* JADX INFO: renamed from: xoc$b$b */
        public class b implements y3c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f98824a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f98825b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ArrayList f98826c;

            public b(List list, int i, ArrayList arrayList) {
                this.f98824a = list;
                this.f98825b = i;
                this.f98826c = arrayList;
            }

            @Override // p000.y3c
            public void onDenied(@efb List<String> list, boolean z) {
                if (xoc.this.isAdded()) {
                    int[] iArr = new int[this.f98824a.size()];
                    for (int i = 0; i < this.f98824a.size(); i++) {
                        iArr[i] = qpc.m20483g(this.f98826c, (String) this.f98824a.get(i)) ? -1 : 0;
                    }
                    xoc.this.onRequestPermissionsResult(this.f98825b, (String[]) this.f98824a.toArray(new String[0]), iArr);
                }
            }

            @Override // p000.y3c
            public void onGranted(@efb List<String> list, boolean z) {
                if (z && xoc.this.isAdded()) {
                    int[] iArr = new int[this.f98824a.size()];
                    Arrays.fill(iArr, 0);
                    xoc.this.onRequestPermissionsResult(this.f98825b, (String[]) this.f98824a.toArray(new String[0]), iArr);
                }
            }
        }

        public C15234b(Activity activity, ArrayList arrayList, List list, int i) {
            this.f98818a = activity;
            this.f98819b = arrayList;
            this.f98820c = list;
            this.f98821d = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGranted$0(Activity activity, ArrayList arrayList, List list, int i) {
            xoc.launch(activity, arrayList, new a(), new b(list, i, arrayList));
        }

        @Override // p000.y3c
        public void onDenied(@efb List<String> list, boolean z) {
            if (xoc.this.isAdded()) {
                int[] iArr = new int[this.f98820c.size()];
                Arrays.fill(iArr, -1);
                xoc.this.onRequestPermissionsResult(this.f98821d, (String[]) this.f98820c.toArray(new String[0]), iArr);
            }
        }

        @Override // p000.y3c
        public void onGranted(@efb List<String> list, boolean z) {
            if (z && xoc.this.isAdded()) {
                long j = C5487ew.m10310f() ? 150L : 0L;
                final Activity activity = this.f98818a;
                final ArrayList arrayList = this.f98819b;
                final List list2 = this.f98820c;
                final int i = this.f98821d;
                qpc.m20497u(new Runnable() { // from class: yoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f102425a.lambda$onGranted$0(activity, arrayList, list2, i);
                    }
                }, j);
            }
        }
    }

    public static void launch(@efb Activity activity, @efb List<String> list, @efb a4c a4cVar, @hib y3c y3cVar) {
        int iNextInt;
        List<Integer> list2;
        xoc xocVar = new xoc();
        Random random = new Random();
        do {
            iNextInt = random.nextInt((int) Math.pow(2.0d, 8.0d));
            list2 = f98809F;
        } while (list2.contains(Integer.valueOf(iNextInt)));
        list2.add(Integer.valueOf(iNextInt));
        Bundle bundle = new Bundle();
        bundle.putInt(f98808C, iNextInt);
        if (list instanceof ArrayList) {
            bundle.putStringArrayList("request_permissions", (ArrayList) list);
        } else {
            bundle.putStringArrayList("request_permissions", new ArrayList<>(list));
        }
        xocVar.setArguments(bundle);
        xocVar.setRetainInstance(true);
        xocVar.setRequestFlag(true);
        xocVar.setOnPermissionCallback(y3cVar);
        xocVar.setOnPermissionInterceptor(a4cVar);
        xocVar.attachByActivity(activity);
    }

    public void attachByActivity(@efb Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void detachByActivity(@efb Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, @hib Intent intent) {
        ArrayList<String> stringArrayList;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || this.f98812b || i != arguments.getInt(f98808C) || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        this.f98812b = true;
        qpc.m20496t(stringArrayList, this);
    }

    @Override // android.app.Fragment
    @igg({"SourceLockedOrientationActivity"})
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        int requestedOrientation = activity.getRequestedOrientation();
        this.f98816f = requestedOrientation;
        if (requestedOrientation != -1) {
            return;
        }
        qpc.m20494r(activity);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f98814d = null;
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        if (activity == null || this.f98816f != -1 || activity.getRequestedOrientation() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (activity == null || arguments == null || this.f98815e == null || i != arguments.getInt(f98808C)) {
            return;
        }
        y3c y3cVar = this.f98814d;
        this.f98814d = null;
        a4c a4cVar = this.f98815e;
        this.f98815e = null;
        f98809F.remove(Integer.valueOf(i));
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            return;
        }
        qpc.m20495s(activity, strArr, iArr);
        ArrayList arrayListM20478b = qpc.m20478b(strArr);
        detachByActivity(activity);
        List<String> listM26231e = ync.m26231e(arrayListM20478b, iArr);
        if (listM26231e.size() == arrayListM20478b.size()) {
            a4cVar.grantedPermissionRequest(activity, arrayListM20478b, listM26231e, true, y3cVar);
            a4cVar.finishPermissionRequest(activity, arrayListM20478b, false, y3cVar);
            return;
        }
        List<String> listM26229c = ync.m26229c(arrayListM20478b, iArr);
        a4cVar.deniedPermissionRequest(activity, arrayListM20478b, listM26229c, ync.m26235i(activity, listM26229c), y3cVar);
        if (!listM26231e.isEmpty()) {
            a4cVar.grantedPermissionRequest(activity, arrayListM20478b, listM26231e, false, y3cVar);
        }
        a4cVar.finishPermissionRequest(activity, arrayListM20478b, false, y3cVar);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f98813c) {
            detachByActivity(getActivity());
        } else {
            if (this.f98811a) {
                return;
            }
            this.f98811a = true;
            requestSpecialPermission();
        }
    }

    public void requestDangerousPermission() {
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null) {
            return;
        }
        int i = arguments.getInt(f98808C);
        ArrayList<String> stringArrayList = arguments.getStringArrayList("request_permissions");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        if (!C5487ew.m10318n()) {
            int size = stringArrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ync.m26236j(activity, stringArrayList.get(i2)) ? 0 : -1;
            }
            onRequestPermissionsResult(i, (String[]) stringArrayList.toArray(new String[0]), iArr);
            return;
        }
        if (C5487ew.m10310f() && stringArrayList.size() >= 2 && qpc.m20483g(stringArrayList, xnc.f98620q)) {
            ArrayList arrayList = new ArrayList(stringArrayList);
            arrayList.remove(xnc.f98620q);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList, i);
            return;
        }
        if (C5487ew.m10307c() && stringArrayList.size() >= 2 && qpc.m20483g(stringArrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            ArrayList arrayList2 = new ArrayList(stringArrayList);
            arrayList2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            splitTwiceRequestPermission(activity, stringArrayList, arrayList2, i);
        } else {
            if (!C5487ew.m10307c() || !qpc.m20483g(stringArrayList, xnc.f98629z) || !qpc.m20483g(stringArrayList, xnc.f98579D)) {
                requestPermissions((String[]) stringArrayList.toArray(new String[stringArrayList.size() - 1]), i);
                return;
            }
            ArrayList arrayList3 = new ArrayList(stringArrayList);
            arrayList3.remove(xnc.f98629z);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList3, i);
        }
    }

    public void requestSpecialPermission() {
        ArrayList<String> stringArrayList;
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (int size = stringArrayList.size() - 1; size >= 0; size--) {
            String str = stringArrayList.get(size);
            if (ync.m26238l(str) && !ync.m26236j(activity, str) && (C5487ew.m10308d() || !qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE"))) {
                o1g.m18268k(this, qpc.m20490n(activity, qpc.m20478b(str)), getArguments().getInt(f98808C));
                z = true;
            }
        }
        if (z) {
            return;
        }
        requestDangerousPermission();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isAdded()) {
            requestDangerousPermission();
        }
    }

    public void setOnPermissionCallback(@hib y3c y3cVar) {
        this.f98814d = y3cVar;
    }

    public void setOnPermissionInterceptor(@hib a4c a4cVar) {
        this.f98815e = a4cVar;
    }

    public void setRequestFlag(boolean z) {
        this.f98813c = z;
    }

    public void splitTwiceRequestPermission(@efb Activity activity, @efb List<String> list, @efb List<String> list2, int i) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        launch(activity, list2, new C15233a(), new C15234b(activity, arrayList, list, i));
    }
}
