package p000;

import java.util.List;
import p000.yri;
import p000.zi4;

/* JADX INFO: loaded from: classes5.dex */
public interface esi extends rsa {
    m7d getCurrentDocument();

    String getDelete();

    vj1 getDeleteBytes();

    yri.EnumC15791c getOperationCase();

    zi4 getTransform();

    nh4 getUpdate();

    di4 getUpdateMask();

    zi4.C16149c getUpdateTransforms(int i);

    int getUpdateTransformsCount();

    List<zi4.C16149c> getUpdateTransformsList();

    String getVerify();

    vj1 getVerifyBytes();

    boolean hasCurrentDocument();

    boolean hasDelete();

    boolean hasTransform();

    boolean hasUpdate();

    boolean hasUpdateMask();

    boolean hasVerify();
}
