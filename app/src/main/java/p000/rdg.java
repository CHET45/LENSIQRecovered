package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: loaded from: classes8.dex */
public class rdg implements ILoggerFactory {

    /* JADX INFO: renamed from: a */
    public boolean f77954a = false;

    /* JADX INFO: renamed from: b */
    public final Map<String, qdg> f77955b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<sdg> f77956c = new LinkedBlockingQueue<>();

    public void clear() {
        this.f77955b.clear();
        this.f77956c.clear();
    }

    public LinkedBlockingQueue<sdg> getEventQueue() {
        return this.f77956c;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized jj9 getLogger(String str) {
        qdg qdgVar;
        qdgVar = this.f77955b.get(str);
        if (qdgVar == null) {
            qdgVar = new qdg(str, this.f77956c, this.f77954a);
            this.f77955b.put(str, qdgVar);
        }
        return qdgVar;
    }

    public List<String> getLoggerNames() {
        return new ArrayList(this.f77955b.keySet());
    }

    public List<qdg> getLoggers() {
        return new ArrayList(this.f77955b.values());
    }

    public void postInitialization() {
        this.f77954a = true;
    }
}
