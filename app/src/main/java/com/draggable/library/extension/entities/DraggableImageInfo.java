package com.draggable.library.extension.entities;

import com.draggable.library.core.DraggableParamsInfo;
import java.io.Serializable;
import p000.c0b;
import p000.gib;
import p000.jt3;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class DraggableImageInfo implements Serializable {

    @yfb
    private DraggableParamsInfo draggableInfo;
    private final boolean imageCanDown;
    private final long imageSize;

    @yfb
    private String originImg;

    @yfb
    private String thumbnailImg;

    public DraggableImageInfo() {
        this(null, null, null, 0L, false, 31, null);
    }

    @yfb
    public static /* synthetic */ DraggableImageInfo copy$default(DraggableImageInfo draggableImageInfo, String str, String str2, DraggableParamsInfo draggableParamsInfo, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draggableImageInfo.originImg;
        }
        if ((i & 2) != 0) {
            str2 = draggableImageInfo.thumbnailImg;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            draggableParamsInfo = draggableImageInfo.draggableInfo;
        }
        DraggableParamsInfo draggableParamsInfo2 = draggableParamsInfo;
        if ((i & 8) != 0) {
            j = draggableImageInfo.imageSize;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z = draggableImageInfo.imageCanDown;
        }
        return draggableImageInfo.copy(str, str3, draggableParamsInfo2, j2, z);
    }

    public final void adjustImageUrl() {
        if (this.originImg.length() <= 0 || this.thumbnailImg.length() <= 0) {
            if (this.originImg.length() != 0 || this.thumbnailImg.length() <= 0) {
                this.thumbnailImg = this.originImg;
            } else {
                this.originImg = this.thumbnailImg;
            }
        }
    }

    @yfb
    public final String component1() {
        return this.originImg;
    }

    @yfb
    public final String component2() {
        return this.thumbnailImg;
    }

    @yfb
    public final DraggableParamsInfo component3() {
        return this.draggableInfo;
    }

    public final long component4() {
        return this.imageSize;
    }

    public final boolean component5() {
        return this.imageCanDown;
    }

    @yfb
    public final DraggableImageInfo copy(@yfb String str, @yfb String str2, @yfb DraggableParamsInfo draggableParamsInfo, long j, boolean z) {
        md8.checkParameterIsNotNull(str, "originImg");
        md8.checkParameterIsNotNull(str2, "thumbnailImg");
        md8.checkParameterIsNotNull(draggableParamsInfo, "draggableInfo");
        return new DraggableImageInfo(str, str2, draggableParamsInfo, j, z);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableImageInfo)) {
            return false;
        }
        DraggableImageInfo draggableImageInfo = (DraggableImageInfo) obj;
        return md8.areEqual(this.originImg, draggableImageInfo.originImg) && md8.areEqual(this.thumbnailImg, draggableImageInfo.thumbnailImg) && md8.areEqual(this.draggableInfo, draggableImageInfo.draggableInfo) && this.imageSize == draggableImageInfo.imageSize && this.imageCanDown == draggableImageInfo.imageCanDown;
    }

    @yfb
    public final DraggableParamsInfo getDraggableInfo() {
        return this.draggableInfo;
    }

    public final boolean getImageCanDown() {
        return this.imageCanDown;
    }

    public final long getImageSize() {
        return this.imageSize;
    }

    @yfb
    public final String getOriginImg() {
        return this.originImg;
    }

    @yfb
    public final String getThumbnailImg() {
        return this.thumbnailImg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        String str = this.originImg;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.thumbnailImg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DraggableParamsInfo draggableParamsInfo = this.draggableInfo;
        int iHashCode3 = (iHashCode2 + (draggableParamsInfo != null ? draggableParamsInfo.hashCode() : 0)) * 31;
        long j = this.imageSize;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.imageCanDown;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final void setDraggableInfo(@yfb DraggableParamsInfo draggableParamsInfo) {
        md8.checkParameterIsNotNull(draggableParamsInfo, "<set-?>");
        this.draggableInfo = draggableParamsInfo;
    }

    public final void setOriginImg(@yfb String str) {
        md8.checkParameterIsNotNull(str, "<set-?>");
        this.originImg = str;
    }

    public final void setThumbnailImg(@yfb String str) {
        md8.checkParameterIsNotNull(str, "<set-?>");
        this.thumbnailImg = str;
    }

    @yfb
    public String toString() {
        return "DraggableImageInfo(originImg=" + this.originImg + ", thumbnailImg=" + this.thumbnailImg + ", draggableInfo=" + this.draggableInfo + ", imageSize=" + this.imageSize + ", imageCanDown=" + this.imageCanDown + c0b.f15434d;
    }

    public DraggableImageInfo(@yfb String str, @yfb String str2, @yfb DraggableParamsInfo draggableParamsInfo, long j, boolean z) {
        md8.checkParameterIsNotNull(str, "originImg");
        md8.checkParameterIsNotNull(str2, "thumbnailImg");
        md8.checkParameterIsNotNull(draggableParamsInfo, "draggableInfo");
        this.originImg = str;
        this.thumbnailImg = str2;
        this.draggableInfo = draggableParamsInfo;
        this.imageSize = j;
        this.imageCanDown = z;
    }

    public /* synthetic */ DraggableImageInfo(String str, String str2, DraggableParamsInfo draggableParamsInfo, long j, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? new DraggableParamsInfo(0, 0, 0, 0, 0.0f, 31, null) : draggableParamsInfo, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? true : z);
    }
}