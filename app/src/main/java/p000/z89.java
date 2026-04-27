package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public interface z89 {
    void makeImmutableListAt(Object msg, long offset);

    <L> void mergeListsAt(Object msg, Object otherMsg, long offset);

    <L> List<L> mutableListAt(Object msg, long offset);
}
