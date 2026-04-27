package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
public final class upd {
    private upd() {
    }

    private static void bindings(@efb StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i = 1; i < count; i++) {
            builder.append(",");
            builder.append("?");
        }
    }

    @efb
    public static zfg workQueryToRawQuery(@efb iqi querySpec) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<tpi.EnumC13161a> states = querySpec.getStates();
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(states.size());
            Iterator<tpi.EnumC13161a> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(vqi.stateToInt(it.next())));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            bindings(sb, arrayList2.size());
            sb.append(c0b.f15434d);
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = querySpec.getIds();
        if (!ids.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(ids.size());
            Iterator<UUID> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            bindings(sb, ids.size());
            sb.append(c0b.f15434d);
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = querySpec.getTags();
        if (tags.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, tags.size());
            sb.append("))");
            arrayList.addAll(tags);
        }
        List<String> uniqueWorkNames = querySpec.getUniqueWorkNames();
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, uniqueWorkNames.size());
            sb.append("))");
            arrayList.addAll(uniqueWorkNames);
        }
        sb.append(";");
        return new cjf(sb.toString(), arrayList.toArray());
    }
}
