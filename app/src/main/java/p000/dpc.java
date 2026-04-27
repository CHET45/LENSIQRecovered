package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class dpc {

    /* JADX INFO: renamed from: a */
    @omg(30)
    @yfb
    public static final Set<String> f30345a = w6f.setOf((Object[]) new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", xnc.f98609f, xnc.f98610g, "android.permission.MANAGE_EXTERNAL_STORAGE"});

    /* JADX INFO: renamed from: b */
    @omg(29)
    @yfb
    public static final Map<String, String> f30346b;

    /* JADX INFO: renamed from: c */
    @omg(30)
    @yfb
    public static final Map<String, String> f30347c;

    static {
        Map<String, String> mapMapOf = xt9.mapOf(vkh.m24050to(xnc.f98588M, "android.permission-group.CALENDAR"), vkh.m24050to(xnc.f98589N, "android.permission-group.CALENDAR"), vkh.m24050to(xnc.f98592Q, "android.permission-group.CALL_LOG"), vkh.m24050to(xnc.f98593R, "android.permission-group.CALL_LOG"), vkh.m24050to(xnc.f98596U, "android.permission-group.CALL_LOG"), vkh.m24050to(xnc.f98581F, "android.permission-group.CAMERA"), vkh.m24050to(xnc.f98585J, "android.permission-group.CONTACTS"), vkh.m24050to(xnc.f98586K, "android.permission-group.CONTACTS"), vkh.m24050to(xnc.f98587L, "android.permission-group.CONTACTS"), vkh.m24050to(xnc.f98583H, "android.permission-group.LOCATION"), vkh.m24050to(xnc.f98584I, "android.permission-group.LOCATION"), vkh.m24050to("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), vkh.m24050to(xnc.f98582G, "android.permission-group.MICROPHONE"), vkh.m24050to(xnc.f98590O, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98577B, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98591P, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98578C, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98594S, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98595T, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98576A, "android.permission-group.PHONE"), vkh.m24050to(xnc.f98597V, "android.permission-group.SENSORS"), vkh.m24050to(xnc.f98628y, "android.permission-group.ACTIVITY_RECOGNITION"), vkh.m24050to(xnc.f98598W, "android.permission-group.SMS"), vkh.m24050to(xnc.f98599X, "android.permission-group.SMS"), vkh.m24050to(xnc.f98600Y, "android.permission-group.SMS"), vkh.m24050to(xnc.f98601Z, "android.permission-group.SMS"), vkh.m24050to(xnc.f98603a0, "android.permission-group.SMS"), vkh.m24050to(xnc.f98579D, "android.permission-group.STORAGE"), vkh.m24050to(xnc.f98580E, "android.permission-group.STORAGE"), vkh.m24050to(xnc.f98629z, "android.permission-group.STORAGE"));
        f30346b = mapMapOf;
        f30347c = mapMapOf;
    }

    @yfb
    public static final Set<String> getAllSpecialPermissions() {
        return f30345a;
    }

    @yfb
    public static final Map<String, String> getPermissionMapOnQ() {
        return f30346b;
    }

    @yfb
    public static final Map<String, String> getPermissionMapOnR() {
        return f30347c;
    }
}
