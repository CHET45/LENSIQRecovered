package p000;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class osa {

    /* JADX INFO: renamed from: a */
    public static final Gson f68571a = new Gson();

    /* JADX INFO: renamed from: b */
    public static final Type f68572b = new C10634a().getType();

    /* JADX INFO: renamed from: osa$a */
    public class C10634a extends TypeToken<List<dbh>> {
    }

    @nlh
    public static String fromMessageList(List<dbh> list) {
        if (list == null) {
            return null;
        }
        return f68571a.toJson(list);
    }

    @nlh
    public static List<dbh> toMessageList(String json) {
        if (json == null) {
            return null;
        }
        return (List) f68571a.fromJson(json, f68572b);
    }
}
