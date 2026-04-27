package p000;

import java.util.List;
import p000.dva;

/* JADX INFO: loaded from: classes5.dex */
public interface eva extends rsa {
    String getDescription();

    vj1 getDescriptionBytes();

    String getDisplayName();

    vj1 getDisplayNameBytes();

    ot8 getLabels(int i);

    int getLabelsCount();

    List<ot8> getLabelsList();

    qu8 getLaunchStage();

    int getLaunchStageValue();

    dva.C4969c getMetadata();

    dva.EnumC4971e getMetricKind();

    int getMetricKindValue();

    String getName();

    vj1 getNameBytes();

    String getType();

    vj1 getTypeBytes();

    String getUnit();

    vj1 getUnitBytes();

    dva.EnumC4972f getValueType();

    int getValueTypeValue();

    boolean hasMetadata();
}
