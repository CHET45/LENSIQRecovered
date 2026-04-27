package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fpc extends Fragment implements Runnable {

    /* JADX INFO: renamed from: d */
    public static final String f37368d = "request_permissions";

    /* JADX INFO: renamed from: a */
    @hib
    public b4c f37369a;

    /* JADX INFO: renamed from: b */
    public boolean f37370b;

    /* JADX INFO: renamed from: c */
    public boolean f37371c;

    public static void launch(@efb Activity activity, @efb List<String> list, @hib b4c b4cVar) {
        fpc fpcVar = new fpc();
        Bundle bundle = new Bundle();
        if (list instanceof ArrayList) {
            bundle.putStringArrayList("request_permissions", (ArrayList) list);
        } else {
            bundle.putStringArrayList("request_permissions", new ArrayList<>(list));
        }
        fpcVar.setArguments(bundle);
        fpcVar.setRetainInstance(true);
        fpcVar.setRequestFlag(true);
        fpcVar.setOnPermissionPageCallback(b4cVar);
        fpcVar.attachByActivity(activity);
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
        if (i != 1025) {
            return;
        }
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        qpc.m20496t(stringArrayList, this);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f37370b) {
            detachByActivity(getActivity());
            return;
        }
        if (this.f37371c) {
            return;
        }
        this.f37371c = true;
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        o1g.m18268k(this, qpc.m20490n(getActivity(), arguments.getStringArrayList("request_permissions")), 1025);
    }

    @Override // java.lang.Runnable
    public void run() {
        Activity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            b4c b4cVar = this.f37369a;
            this.f37369a = null;
            if (b4cVar == null) {
                detachByActivity(activity);
                return;
            }
            ArrayList<String> stringArrayList = getArguments().getStringArrayList("request_permissions");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                return;
            }
            if (ync.m26230d(activity, stringArrayList).size() == stringArrayList.size()) {
                b4cVar.onGranted();
            } else {
                b4cVar.onDenied();
            }
            detachByActivity(activity);
        }
    }

    public void setOnPermissionPageCallback(@hib b4c b4cVar) {
        this.f37369a = b4cVar;
    }

    public void setRequestFlag(boolean z) {
        this.f37370b = z;
    }
}
